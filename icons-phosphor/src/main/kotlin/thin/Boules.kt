package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Boules: ImageVector
    get() {
        if (_boules != null) return _boules!!
        _boules = phosphorThinIcon(
            name = "Boules",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 190.130 60.210 L 60.210 190.130 C 54.227 183.617 49.216 176.275 45.330 168.330 L 168.330 45.330 C 176.275 49.216 183.617 54.227 190.130 60.210 ZM 195.790 65.870 C 201.769 72.386 206.781 79.728 210.670 87.670 L 87.670 210.670 C 79.728 206.781 72.386 201.769 65.870 195.790 ZM 128.000 36.000 C 139.079 35.988 150.068 37.991 160.430 41.910 L 41.910 160.430 C 31.265 132.171 35.166 100.488 52.348 75.655 C 69.529 50.822 97.803 36.002 128.000 36.000 ZM 128.000 220.000 C 116.921 220.012 105.932 218.009 95.570 214.090 L 214.090 95.570 C 224.735 123.829 220.834 155.512 203.652 180.345 C 186.471 205.178 158.197 219.998 128.000 220.000 Z"),
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
        return _boules!!
    }

private var _boules: ImageVector? = null
