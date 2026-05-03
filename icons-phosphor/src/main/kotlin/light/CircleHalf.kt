package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CircleHalf: ImageVector
    get() {
        if (_circleHalf != null) return _circleHalf!!
        _circleHalf = phosphorLightIcon(
            name = "CircleHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 134.000 38.200 C 140.783 38.650 147.492 39.867 154.000 41.830 L 154.000 214.170 C 147.492 216.133 140.783 217.350 134.000 217.800 ZM 166.000 46.430 C 173.201 49.803 179.925 54.110 186.000 59.240 L 186.000 196.760 C 179.925 201.890 173.201 206.197 166.000 209.570 ZM 38.000 128.000 C 38.059 80.647 74.756 41.416 122.000 38.200 L 122.000 217.800 C 74.756 214.584 38.059 175.353 38.000 128.000 ZM 198.000 184.500 L 198.000 71.500 C 224.665 104.447 224.665 151.553 198.000 184.500 Z"),
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
        return _circleHalf!!
    }

private var _circleHalf: ImageVector? = null
