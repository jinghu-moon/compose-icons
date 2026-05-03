package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Brandy: ImageVector
    get() {
        if (_brandy != null) return _brandy!!
        _brandy = phosphorLightIcon(
            name = "Brandy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 222.000 88.000 L 222.000 88.000 C 222.024 69.791 216.738 51.971 206.790 36.720 C 205.687 35.030 203.808 34.008 201.790 34.000 L 54.230 34.000 C 52.212 34.008 50.333 35.030 49.230 36.720 C 39.275 51.969 33.982 69.789 34.000 88.000 L 34.000 88.000 C 34.054 137.562 72.542 178.587 122.000 181.800 L 122.000 218.000 L 88.000 218.000 C 84.686 218.000 82.000 220.686 82.000 224.000 C 82.000 227.314 84.686 230.000 88.000 230.000 L 168.000 230.000 C 171.314 230.000 174.000 227.314 174.000 224.000 C 174.000 220.686 171.314 218.000 168.000 218.000 L 134.000 218.000 L 134.000 181.800 C 183.458 178.587 221.946 137.562 222.000 88.000 ZM 57.560 46.000 L 198.440 46.000 C 204.981 56.949 208.865 69.279 209.780 82.000 L 46.220 82.000 C 47.135 69.279 51.019 56.949 57.560 46.000 ZM 128.000 170.000 C 85.065 169.946 49.425 136.816 46.240 94.000 L 209.760 94.000 C 206.575 136.816 170.935 169.946 128.000 170.000 Z"),
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
        return _brandy!!
    }

private var _brandy: ImageVector? = null
