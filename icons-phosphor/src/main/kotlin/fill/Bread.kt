package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Bread: ImageVector
    get() {
        if (_bread != null) return _bread!!
        _bread = phosphorFillIcon(
            name = "Bread",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 40.000 L 48.000 40.000 C 29.068 40.011 12.737 53.294 8.868 71.827 C 5.000 90.359 14.654 109.066 32.000 116.650 L 32.000 200.000 C 32.000 208.837 39.163 216.000 48.000 216.000 L 200.000 216.000 C 208.837 216.000 216.000 208.837 216.000 200.000 L 216.000 116.650 C 233.346 109.066 243.000 90.359 239.132 71.827 C 235.263 53.294 218.932 40.011 200.000 40.000 ZM 144.000 104.000 C 139.582 104.000 136.000 107.582 136.000 112.000 C 136.000 116.418 139.582 120.000 144.000 120.000 L 144.000 200.000 L 48.000 200.000 L 48.000 120.000 C 52.418 120.000 56.000 116.418 56.000 112.000 C 56.000 107.582 52.418 104.000 48.000 104.000 C 34.745 104.000 24.000 93.255 24.000 80.000 C 24.000 66.745 34.745 56.000 48.000 56.000 L 144.000 56.000 C 157.255 56.000 168.000 66.745 168.000 80.000 C 168.000 93.255 157.255 104.000 144.000 104.000 Z"),
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
        return _bread!!
    }

private var _bread: ImageVector? = null
