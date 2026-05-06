package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Cake2Line: ImageVector
    get() {
        if (_cake2Line != null) return _cake2Line!!
        _cake2Line = remixIcon(
            name = "Cake2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8 6v3.999h3v-3.999h2v3.999h3v-3.999h2v3.999L19 10c1.598 0 2.904 1.249 2.995 2.824L22 13v1c0 1.014-.377 1.94-.999 2.645L21 21c0 .552-.448 1-1 1h-16C3.448 22 3 21.552 3 21L2.999 16.64c-.521-.594-.871-1.346-.971-2.182l-.022-.253L2 14v-1C2 11.402 3.249 10.096 4.824 10.005L5 10 6 9.999v-3.999h2ZM9.002 16.641l-.054 .063c-.64 .697-1.524 1.166-2.513 1.273l-.23 .018L6 18c-.345 0-.68-.044-.999-.126L5 20h14l.001-2.126C18.681 17.956 18.346 18 18 18c-1.062 0-2.028-.414-2.744-1.089l-.15-.149L15 16.644l-.106 .118c-.633 .663-1.491 1.108-2.452 1.214l-.242 .019L12 18C10.914 18 9.926 17.566 9.203 16.856l-.151-.156-.05-.058ZM19 12h-14c-.513 0-.936 .386-.993 .883L4 13l-0 .971 .004 .147C4.064 15.172 4.939 16 6 16c1.008 0 1.848-.748 1.98-1.7l.015-.152 .005-.176c.036-1.249 1.827-1.293 1.988-.134l.011 .134 .004 .147C10.064 15.172 10.939 16 12 16c1.054 0 1.918-.816 1.995-1.851l.012-.282c.124-1.156 1.862-1.156 1.986 0l.013 .282C16.082 15.184 16.946 16 18 16c1.054 0 1.918-.816 1.994-1.851L20 14v-1c0-.513-.386-.936-.883-.993L19 12ZM7 1c1.319 .871 1.663 2.088 1.449 2.888C8.234 4.688 7.412 5.163 6.612 4.949 5.812 4.734 5.337 3.912 5.551 3.112 5.849 2.001 7 2.5 7 1ZM12 1c1.319 .871 1.663 2.088 1.449 2.888-.214 .8-1.037 1.275-1.837 1.061C10.812 4.734 10.337 3.912 10.551 3.112 10.849 2.001 12 2.5 12 1ZM17 1c1.319 .871 1.663 2.088 1.449 2.888-.214 .8-1.037 1.275-1.837 1.061C15.812 4.734 15.337 3.912 15.551 3.112 15.849 2.001 17 2.5 17 1Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _cake2Line!!
    }

private var _cake2Line: ImageVector? = null
