package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.OpenSourceFill: ImageVector
    get() {
        if (_openSourceFill != null) return _openSourceFill!!
        _openSourceFill = remixIcon(
            name = "OpenSourceFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.001 2.000 C 17.524 2.000 22.001 6.477 22.001 12.000 C 22.001 16.130 19.497 19.676 15.924 21.201 L 13.406 14.651 C 14.355 14.148 15.001 13.149 15.001 12.000 C 15.001 10.343 13.658 9.000 12.001 9.000 C 10.344 9.000 9.001 10.343 9.001 12.000 C 9.001 13.150 9.648 14.148 10.597 14.652 L 8.079 21.201 C 4.505 19.676 2.001 16.131 2.001 12.000 C 2.001 6.477 6.478 2.000 12.001 2.000 Z"),
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
        return _openSourceFill!!
    }

private var _openSourceFill: ImageVector? = null
