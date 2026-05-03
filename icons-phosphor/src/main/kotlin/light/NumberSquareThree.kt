package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberSquareThree: ImageVector
    get() {
        if (_numberSquareThree != null) return _numberSquareThree!!
        _numberSquareThree = phosphorLightIcon(
            name = "NumberSquareThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 34.000 L 48.000 34.000 C 40.268 34.000 34.000 40.268 34.000 48.000 L 34.000 208.000 C 34.000 215.732 40.268 222.000 48.000 222.000 L 208.000 222.000 C 215.732 222.000 222.000 215.732 222.000 208.000 L 222.000 48.000 C 222.000 40.268 215.732 34.000 208.000 34.000 ZM 210.000 208.000 C 210.000 209.105 209.105 210.000 208.000 210.000 L 48.000 210.000 C 46.895 210.000 46.000 209.105 46.000 208.000 L 46.000 48.000 C 46.000 46.895 46.895 46.000 48.000 46.000 L 208.000 46.000 C 209.105 46.000 210.000 46.895 210.000 48.000 ZM 158.000 148.000 C 158.000 161.816 149.639 174.258 136.848 179.479 C 124.056 184.699 109.377 181.660 99.710 171.790 C 97.393 169.421 97.436 165.622 99.805 163.305 C 102.174 160.988 105.973 161.031 108.290 163.400 C 115.279 170.531 126.194 172.060 134.874 167.125 C 143.554 162.191 147.823 152.029 145.270 142.376 C 142.718 132.723 133.985 125.999 124.000 126.000 C 121.762 126.002 119.709 124.758 118.675 122.773 C 117.641 120.789 117.797 118.393 119.080 116.560 L 140.480 86.000 L 104.000 86.000 C 100.686 86.000 98.000 83.314 98.000 80.000 C 98.000 76.686 100.686 74.000 104.000 74.000 L 152.000 74.000 C 154.238 73.998 156.291 75.242 157.325 77.227 C 158.359 79.211 158.203 81.607 156.920 83.440 L 134.390 115.620 C 148.449 120.152 157.984 133.229 158.000 148.000 Z"),
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
        return _numberSquareThree!!
    }

private var _numberSquareThree: ImageVector? = null
