package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CodeLine: ImageVector
    get() {
        if (_codeLine != null) return _codeLine!!
        _codeLine = remixIcon(
            name = "CodeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M23 12l-7.071 7.071L14.515 17.657 20.172 12 14.515 6.343 15.929 4.929 23 12ZM3.828 12l5.657 5.657L8.071 19.071 1 12 8.071 4.929 9.485 6.343 3.828 12Z"),
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
        return _codeLine!!
    }

private var _codeLine: ImageVector? = null
