package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Scooter: ImageVector
    get() {
        if (_scooter != null) return _scooter!!
        _scooter = phosphorLightIcon(
            name = "Scooter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 212.000 138.000 C 210.363 138.003 208.729 138.124 207.110 138.360 L 173.690 38.100 C 172.873 35.652 170.581 34.001 168.000 34.000 L 136.000 34.000 C 132.686 34.000 130.000 36.686 130.000 40.000 C 130.000 43.314 132.686 46.000 136.000 46.000 L 163.680 46.000 L 181.920 100.730 L 125.160 170.000 L 77.940 170.000 C 76.898 152.429 62.617 138.558 45.022 138.029 C 27.428 137.499 12.339 150.486 10.242 167.963 C 8.145 185.439 19.733 201.627 36.953 205.275 C 54.173 208.923 71.330 198.826 76.500 182.000 L 128.000 182.000 C 129.798 181.999 131.501 181.192 132.640 179.800 L 186.400 114.180 L 195.730 142.180 C 180.696 150.414 174.143 168.552 180.442 184.494 C 186.741 200.436 203.922 209.196 220.523 204.931 C 237.125 200.665 247.956 184.709 245.791 167.705 C 243.625 150.701 229.141 137.968 212.000 138.000 ZM 44.000 194.000 C 31.850 194.000 22.000 184.150 22.000 172.000 C 22.000 159.850 31.850 150.000 44.000 150.000 C 56.150 150.000 66.000 159.850 66.000 172.000 C 66.000 184.150 56.150 194.000 44.000 194.000 ZM 212.000 194.000 C 199.850 194.000 190.000 184.150 190.000 172.000 C 190.000 159.850 199.850 150.000 212.000 150.000 C 224.150 150.000 234.000 159.850 234.000 172.000 C 234.000 184.150 224.150 194.000 212.000 194.000 Z"),
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
        return _scooter!!
    }

private var _scooter: ImageVector? = null
