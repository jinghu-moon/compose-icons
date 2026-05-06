package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DoorLine: ImageVector
    get() {
        if (_doorLine != null) return _doorLine!!
        _doorLine = remixIcon(
            name = "DoorLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17.998 3c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-12c-.552 0-1-.448-1-1v-16c0-.552 .448-1 1-1h12ZM16.998 5h-10v14h10v-14ZM14.998 11v2h-2v-2h2Z"),
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
        return _doorLine!!
    }

private var _doorLine: ImageVector? = null
