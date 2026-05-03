package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.VuejsFill: ImageVector
    get() {
        if (_vuejsFill != null) return _vuejsFill!!
        _vuejsFill = remixIcon(
            name = "VuejsFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 1.001 3.000 L 5.001 3.000 L 12.001 15.000 L 19.001 3.000 L 23.001 3.000 L 12.001 22.000 L 1.001 3.000 ZM 9.668 3.000 L 12.001 7.000 L 14.334 3.000 L 18.369 3.000 L 12.001 14.000 L 5.633 3.000 L 9.668 3.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _vuejsFill!!
    }

private var _vuejsFill: ImageVector? = null
