package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NumberSquareNine: ImageVector
    get() {
        if (_numberSquareNine != null) return _numberSquareNine!!
        _numberSquareNine = phosphorFillIcon(
            name = "NumberSquareNine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 145.330 118.000 L 145.330 118.000 C 139.810 127.567 127.579 130.848 118.012 125.328 C 108.445 119.808 105.164 107.578 110.683 98.011 C 116.202 88.443 128.432 85.161 138.000 90.680 C 147.562 96.206 150.834 108.437 145.310 118.000 ZM 224.000 48.000 L 224.000 208.000 C 224.000 216.837 216.837 224.000 208.000 224.000 L 48.000 224.000 C 39.163 224.000 32.000 216.837 32.000 208.000 L 32.000 48.000 C 32.000 39.163 39.163 32.000 48.000 32.000 L 208.000 32.000 C 216.837 32.000 224.000 39.163 224.000 48.000 ZM 146.000 76.820 C 132.900 69.259 116.470 70.694 104.879 80.411 C 93.287 90.128 89.005 106.054 94.162 120.274 C 99.319 134.493 112.814 143.973 127.940 144.000 Q 128.880 144.000 129.830 143.940 L 113.130 171.940 C 112.033 173.765 111.708 175.951 112.228 178.016 C 112.748 180.080 114.070 181.853 115.900 182.940 C 117.725 184.037 119.911 184.362 121.976 183.842 C 124.040 183.322 125.813 182.000 126.900 180.170 L 159.180 126.000 C 169.093 108.776 163.198 86.778 146.000 76.820 Z"),
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
        return _numberSquareNine!!
    }

private var _numberSquareNine: ImageVector? = null
