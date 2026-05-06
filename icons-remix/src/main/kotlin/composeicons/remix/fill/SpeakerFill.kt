package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SpeakerFill: ImageVector
    get() {
        if (_speakerFill != null) return _speakerFill!!
        _speakerFill = remixIcon(
            name = "SpeakerFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 2h16c.552 0 1 .448 1 1v18c0 .552-.448 1-1 1h-16C3.448 22 3 21.552 3 21v-18C3 2.448 3.448 2 4 2ZM12 20c2.761 0 5-2.239 5-5 0-2.761-2.239-5-5-5C9.239 10 7 12.239 7 15c0 2.761 2.239 5 5 5ZM12 8c.828 0 1.5-.672 1.5-1.5C13.5 5.672 12.828 5 12 5c-.828 0-1.5 .672-1.5 1.5C10.5 7.328 11.172 8 12 8ZM12 18C10.343 18 9 16.657 9 15c0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3Z"),
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
        return _speakerFill!!
    }

private var _speakerFill: ImageVector? = null
