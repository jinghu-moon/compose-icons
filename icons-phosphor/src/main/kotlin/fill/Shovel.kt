package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Shovel: ImageVector
    get() {
        if (_shovel != null) return _shovel!!
        _shovel = phosphorFillIcon(
            name = "Shovel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 245.660 69.660 C 244.159 71.162 242.123 72.006 240.000 72.006 C 237.877 72.006 235.841 71.162 234.340 69.660 L 216.000 51.310 L 145.000 122.310 L 133.660 111.000 L 204.660 40.000 L 186.340 21.660 C 183.214 18.534 183.214 13.466 186.340 10.340 C 189.466 7.214 194.534 7.214 197.660 10.340 L 245.660 58.340 C 247.162 59.841 248.006 61.877 248.006 64.000 C 248.006 66.123 247.162 68.159 245.660 69.660 ZM 88.000 176.000 C 84.762 176.003 81.842 174.053 80.603 171.062 C 79.364 168.071 80.049 164.628 82.340 162.340 L 133.660 111.000 L 99.310 76.680 C 93.062 70.437 82.938 70.437 76.690 76.680 L 20.690 132.680 C 17.676 135.675 15.987 139.751 16.000 144.000 L 16.000 224.000 C 16.000 232.837 23.163 240.000 32.000 240.000 L 112.000 240.000 C 116.246 240.014 120.320 238.324 123.310 235.310 L 179.310 179.310 C 185.553 173.062 185.553 162.938 179.310 156.690 L 145.000 122.340 L 93.660 173.660 C 92.158 175.160 90.122 176.002 88.000 176.000 Z"),
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
        return _shovel!!
    }

private var _shovel: ImageVector? = null
