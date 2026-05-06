package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ReservedLine: ImageVector
    get() {
        if (_reservedLine != null) return _reservedLine!!
        _reservedLine = remixIcon(
            name = "ReservedLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13 15v4h3v2h-8v-2h3v-4h-7C3.448 15 3 14.552 3 14v-10C3 3.448 3.448 3 4 3h16c.552 0 1 .448 1 1v10c0 .552-.448 1-1 1h-7ZM5 13h14v-8h-14v8ZM8 8h8v2h-8v-2Z"),
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
        return _reservedLine!!
    }

private var _reservedLine: ImageVector? = null
