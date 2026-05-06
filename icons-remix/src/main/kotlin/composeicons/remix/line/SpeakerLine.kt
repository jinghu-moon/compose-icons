package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SpeakerLine: ImageVector
    get() {
        if (_speakerLine != null) return _speakerLine!!
        _speakerLine = remixIcon(
            name = "SpeakerLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5 4v16h14v-16h-14ZM4 2h16c.552 0 1 .448 1 1v18c0 .552-.448 1-1 1h-16C3.448 22 3 21.552 3 21v-18C3 2.448 3.448 2 4 2ZM12 17c1.381 0 2.5-1.119 2.5-2.5C14.5 13.119 13.381 12 12 12c-1.381 0-2.5 1.119-2.5 2.5C9.5 15.881 10.619 17 12 17ZM12 19C9.515 19 7.5 16.985 7.5 14.5 7.5 12.015 9.515 10 12 10c2.485 0 4.5 2.015 4.5 4.5C16.5 16.985 14.485 19 12 19ZM12 8.5C11.172 8.5 10.5 7.828 10.5 7c0-.828 .672-1.5 1.5-1.5 .828 0 1.5 .672 1.5 1.5 0 .828-.672 1.5-1.5 1.5Z"),
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
        return _speakerLine!!
    }

private var _speakerLine: ImageVector? = null
