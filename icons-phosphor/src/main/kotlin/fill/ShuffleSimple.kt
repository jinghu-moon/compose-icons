package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ShuffleSimple: ImageVector
    get() {
        if (_shuffleSimple != null) return _shuffleSimple!!
        _shuffleSimple = phosphorFillIcon(
            name = "ShuffleSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 48.000 L 216.000 88.000 C 216.003 91.238 214.053 94.158 211.062 95.397 C 208.071 96.636 204.628 95.951 202.340 93.660 L 188.000 79.310 L 156.280 111.000 C 153.106 113.718 148.374 113.535 145.419 110.581 C 142.465 107.626 142.282 102.894 145.000 99.720 L 176.690 68.000 L 162.340 53.660 C 160.049 51.372 159.364 47.929 160.603 44.938 C 161.842 41.947 164.762 39.997 168.000 40.000 L 208.000 40.000 C 212.418 40.000 216.000 43.582 216.000 48.000 ZM 211.060 160.610 C 208.071 159.370 204.629 160.053 202.340 162.340 L 188.000 176.690 L 53.660 42.340 C 50.534 39.214 45.466 39.214 42.340 42.340 C 39.214 45.466 39.214 50.534 42.340 53.660 L 176.690 188.000 L 162.340 202.340 C 160.049 204.628 159.364 208.071 160.603 211.062 C 161.842 214.053 164.762 216.003 168.000 216.000 L 208.000 216.000 C 212.418 216.000 216.000 212.418 216.000 208.000 L 216.000 168.000 C 215.999 164.764 214.050 161.848 211.060 160.610 ZM 99.720 145.000 L 42.340 202.340 C 39.214 205.466 39.214 210.534 42.340 213.660 C 45.466 216.786 50.534 216.786 53.660 213.660 L 111.000 156.280 C 113.718 153.106 113.535 148.374 110.581 145.419 C 107.626 142.465 102.894 142.282 99.720 145.000 Z"),
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
        return _shuffleSimple!!
    }

private var _shuffleSimple: ImageVector? = null
