package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FalloutShelter: ImageVector
    get() {
        if (_falloutShelter != null) return _falloutShelter!!
        _falloutShelter = phosphorLightIcon(
            name = "FalloutShelter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 128.000 218.000 C 78.294 218.000 38.000 177.706 38.000 128.000 C 38.000 78.294 78.294 38.000 128.000 38.000 C 177.706 38.000 218.000 78.294 218.000 128.000 C 217.945 177.683 177.683 217.945 128.000 218.000 ZM 197.290 125.170 C 196.246 123.219 194.213 122.000 192.000 122.000 L 139.210 122.000 L 165.000 83.330 C 166.229 81.488 166.344 79.118 165.297 77.166 C 164.251 75.214 162.215 73.997 160.000 74.000 L 96.000 74.000 C 93.785 73.997 91.749 75.214 90.703 77.166 C 89.656 79.118 89.771 81.488 91.000 83.330 L 116.790 122.000 L 64.000 122.000 C 61.785 121.997 59.749 123.214 58.703 125.166 C 57.656 127.118 57.771 129.488 59.000 131.330 L 91.000 179.330 C 92.112 181.006 93.989 182.013 96.000 182.013 C 98.011 182.013 99.888 181.006 101.000 179.330 L 128.000 138.820 L 155.000 179.330 C 156.112 181.006 157.989 182.013 160.000 182.013 C 162.011 182.013 163.888 181.006 165.000 179.330 L 197.000 131.330 C 198.225 129.487 198.337 127.120 197.290 125.170 ZM 148.790 86.000 L 128.000 117.180 L 107.210 86.000 ZM 96.000 165.180 L 75.210 134.000 L 116.790 134.000 ZM 160.000 165.180 L 139.210 134.000 L 180.790 134.000 Z"),
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
        return _falloutShelter!!
    }

private var _falloutShelter: ImageVector? = null
