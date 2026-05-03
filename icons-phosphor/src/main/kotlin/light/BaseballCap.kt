package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BaseballCap: ImageVector
    get() {
        if (_baseballCap != null) return _baseballCap!!
        _baseballCap = phosphorLightIcon(
            name = "BaseballCap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 26.000 C 71.694 26.066 26.066 71.694 26.000 128.000 L 26.000 184.000 C 26.003 192.287 30.662 199.869 38.054 203.615 C 45.445 207.361 54.315 206.637 61.000 201.740 C 73.380 192.740 95.060 182.000 128.000 182.000 C 160.940 182.000 182.610 192.730 195.000 201.730 C 201.684 206.626 210.551 207.351 217.942 203.607 C 225.332 199.863 229.993 192.285 230.000 184.000 L 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 218.000 128.000 L 218.000 140.500 C 204.170 131.524 189.067 124.680 173.200 120.200 C 170.156 90.800 159.274 62.758 141.690 39.000 C 185.577 45.819 217.960 83.586 218.000 128.000 ZM 160.790 117.220 C 139.141 112.927 116.859 112.927 95.210 117.220 C 100.210 78.840 119.370 51.630 128.000 41.080 C 136.630 51.650 155.800 78.850 160.790 117.230 ZM 114.310 39.000 C 96.725 62.760 85.842 90.807 82.800 120.210 C 66.933 124.690 51.830 131.534 38.000 140.510 L 38.000 128.000 C 38.040 83.586 70.423 45.819 114.310 39.000 ZM 212.570 192.850 C 209.177 194.627 205.065 194.296 202.000 192.000 C 188.180 182.000 164.120 170.000 128.000 170.000 C 91.880 170.000 67.780 182.000 54.000 192.000 C 50.945 194.284 46.852 194.615 43.470 192.850 C 40.100 191.193 37.975 187.755 38.000 184.000 L 38.000 155.000 C 91.755 116.285 164.245 116.285 218.000 155.000 L 218.000 184.000 C 218.048 187.760 215.937 191.216 212.570 192.890 Z"),
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
        return _baseballCap!!
    }

private var _baseballCap: ImageVector? = null
