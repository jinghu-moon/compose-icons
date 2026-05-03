package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GenderMale: ImageVector
    get() {
        if (_genderMale != null) return _genderMale!!
        _genderMale = phosphorThinIcon(
            name = "GenderMale",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 36.000 L 168.000 36.000 C 165.791 36.000 164.000 37.791 164.000 40.000 C 164.000 42.209 165.791 44.000 168.000 44.000 L 206.350 44.000 L 154.820 95.520 C 124.198 67.966 77.199 69.824 48.847 99.710 C 20.496 129.595 21.116 176.627 50.244 205.756 C 79.373 234.884 126.405 235.504 156.290 207.153 C 186.176 178.801 188.034 131.802 160.480 101.180 L 212.000 49.660 L 212.000 88.000 C 212.000 90.209 213.791 92.000 216.000 92.000 C 218.209 92.000 220.000 90.209 220.000 88.000 L 220.000 40.000 C 220.000 37.791 218.209 36.000 216.000 36.000 ZM 152.070 200.110 C 125.512 226.660 82.461 226.656 55.908 200.101 C 29.355 173.546 29.355 130.494 55.908 103.939 C 82.461 77.384 125.512 77.380 152.070 103.930 C 178.591 130.505 178.591 173.535 152.070 200.110 Z"),
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
        return _genderMale!!
    }

private var _genderMale: ImageVector? = null
