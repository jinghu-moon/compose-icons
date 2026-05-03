package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Shovel: ImageVector
    get() {
        if (_shovel != null) return _shovel!!
        _shovel = phosphorRegularIcon(
            name = "Shovel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 245.660 58.340 L 197.660 10.340 C 194.534 7.214 189.466 7.214 186.340 10.340 C 183.214 13.466 183.214 18.534 186.340 21.660 L 204.690 40.000 L 133.690 111.000 L 99.310 76.680 C 93.062 70.437 82.938 70.437 76.690 76.680 L 20.690 132.680 C 17.676 135.675 15.987 139.751 16.000 144.000 L 16.000 224.000 C 16.000 232.837 23.163 240.000 32.000 240.000 L 112.000 240.000 C 116.246 240.014 120.320 238.324 123.310 235.310 L 179.310 179.310 C 185.553 173.062 185.553 162.938 179.310 156.690 L 145.000 122.340 L 216.000 51.340 L 234.340 69.690 C 237.466 72.816 242.534 72.816 245.660 69.690 C 248.786 66.564 248.786 61.496 245.660 58.370 ZM 168.000 168.000 L 112.000 224.000 L 32.000 224.000 L 32.000 144.000 L 88.000 88.000 L 122.340 122.340 L 82.340 162.340 C 79.214 165.466 79.214 170.534 82.340 173.660 C 85.466 176.786 90.534 176.786 93.660 173.660 L 133.660 133.660 Z"),
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
