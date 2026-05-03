package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Log: ImageVector
    get() {
        if (_log != null) return _log!!
        _log = phosphorLightIcon(
            name = "Log",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 210.000 136.000 C 210.000 141.523 205.523 146.000 200.000 146.000 C 194.477 146.000 190.000 141.523 190.000 136.000 C 190.000 130.477 194.477 126.000 200.000 126.000 C 205.523 126.000 210.000 130.477 210.000 136.000 ZM 246.000 136.000 C 246.000 154.210 241.520 171.410 233.370 184.430 C 224.680 198.340 212.830 206.000 200.000 206.000 L 56.000 206.000 C 43.170 206.000 31.320 198.340 22.630 184.430 C 14.480 171.410 10.000 154.210 10.000 136.000 C 10.000 117.790 14.480 100.590 22.630 87.570 C 31.320 73.660 43.170 66.000 56.000 66.000 L 93.520 66.000 L 131.760 27.760 C 132.884 26.634 134.409 26.001 136.000 26.000 L 168.000 26.000 C 171.314 26.000 174.000 28.686 174.000 32.000 C 174.000 35.314 171.314 38.000 168.000 38.000 L 138.490 38.000 L 110.490 66.000 L 200.000 66.000 C 212.830 66.000 224.680 73.660 233.370 87.570 C 241.520 100.590 246.000 117.790 246.000 136.000 ZM 174.000 194.000 C 171.205 191.078 168.725 187.870 166.600 184.430 C 163.067 178.669 160.298 172.474 158.360 166.000 L 80.000 166.000 C 76.686 166.000 74.000 163.314 74.000 160.000 C 74.000 156.686 76.686 154.000 80.000 154.000 L 155.520 154.000 C 154.503 148.054 153.995 142.032 154.000 136.000 C 154.000 117.790 158.480 100.590 166.630 87.570 C 168.745 84.131 171.215 80.923 174.000 78.000 L 56.000 78.000 C 42.110 78.000 29.840 93.100 24.640 114.000 L 104.000 114.000 C 107.314 114.000 110.000 116.686 110.000 120.000 C 110.000 123.314 107.314 126.000 104.000 126.000 L 22.540 126.000 C 22.182 129.321 22.002 132.659 22.000 136.000 C 22.000 167.440 37.570 194.000 56.000 194.000 ZM 234.000 136.000 C 234.000 104.560 218.430 78.000 200.000 78.000 C 181.570 78.000 166.000 104.560 166.000 136.000 C 166.000 167.440 181.570 194.000 200.000 194.000 C 218.430 194.000 234.000 167.440 234.000 136.000 Z"),
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
        return _log!!
    }

private var _log: ImageVector? = null
