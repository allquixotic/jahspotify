package jahspotify.service;

import javax.annotation.*;

import jahspotify.media.Link;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Johan Lindquist
 */
@Service
public class Shuffler
{
    @Autowired
    private QueueManager _queueManager;

    @PostConstruct
    private void initialize()
    {
        _queueManager.addQueueListener(new QueueListener()
        {
            @Override
            public void tracksAdded(final QueueTrack... queueTracks)
            {
            }

            @Override
            public void trackStart(final QueueTrack queueTrack)
            {
            }

            @Override
            public void trackEnd(final QueueTrack queueTrack)
            {
            }

            @Override
            public void trackRemoved(final QueueTrack queueTrack)
            {
            }
        });
    }

    @PreDestroy
    private void shutdown()
    {

    }

    public Link getNextTrack()
    {
        return null;
    }

}
