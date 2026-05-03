package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Eye: ImageVector
    get() {
        if (_eye != null) return _eye!!
        _eye = phosphorFillIcon(
            name = "Eye",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 247.310 124.760 C 246.960 123.970 238.490 105.180 219.660 86.350 C 194.570 61.260 162.880 48.000 128.000 48.000 C 93.120 48.000 61.430 61.260 36.340 86.350 C 17.510 105.180 9.000 124.000 8.690 124.760 C 7.770 126.829 7.770 129.191 8.690 131.260 C 9.040 132.050 17.510 150.830 36.340 169.660 C 61.430 194.740 93.120 208.000 128.000 208.000 C 162.880 208.000 194.570 194.740 219.660 169.660 C 238.490 150.830 246.960 132.050 247.310 131.260 C 248.230 129.191 248.230 126.829 247.310 124.760 ZM 128.000 168.000 C 105.909 168.000 88.000 150.091 88.000 128.000 C 88.000 105.909 105.909 88.000 128.000 88.000 C 150.091 88.000 168.000 105.909 168.000 128.000 C 168.000 150.091 150.091 168.000 128.000 168.000 Z"),
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
        return _eye!!
    }

private var _eye: ImageVector? = null
