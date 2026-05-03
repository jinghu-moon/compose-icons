package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.GitlabLogo: ImageVector
    get() {
        if (_gitlabLogo != null) return _gitlabLogo!!
        _gitlabLogo = phosphorDuotoneIcon(
            name = "GitlabLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 220.230 110.840 L 128.000 176.000 L 35.770 110.840 L 53.500 43.000 C 53.925 41.330 55.389 40.131 57.110 40.044 C 58.831 39.957 60.408 41.001 61.000 42.620 L 80.650 96.000 L 175.350 96.000 L 195.000 42.620 C 195.576 40.975 197.167 39.906 198.907 39.994 C 200.648 40.082 202.122 41.306 202.530 43.000 Z"),
                    pathFillType = PathFillType.NonZero,
                    fill = SolidColor(Color(0xFF000000)),
                    fillAlpha = 1f,
                    stroke = null,
                    strokeAlpha = 1f,
                    strokeLineWidth = 0f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                )
            }
            addPath(
                pathData = parseSvgPathData("M 230.150 117.100 L 210.250 41.000 C 208.950 35.927 204.496 32.292 199.264 32.038 C 194.033 31.783 189.247 34.967 187.460 39.890 L 169.780 88.000 L 86.220 88.000 L 68.540 39.870 C 66.749 34.948 61.960 31.767 56.728 32.026 C 51.497 32.286 47.045 35.925 45.750 41.000 L 25.850 117.100 C 19.833 140.028 28.584 164.291 47.850 178.100 L 121.120 229.860 C 125.238 232.768 130.742 232.768 134.860 229.860 L 208.130 178.100 C 227.404 164.296 236.163 140.032 230.150 117.100 ZM 58.000 57.500 L 73.130 98.760 C 74.287 101.908 77.286 104.000 80.640 104.000 L 175.360 104.000 C 178.714 104.000 181.713 101.908 182.870 98.760 L 198.000 57.500 L 211.070 107.500 L 128.000 166.210 L 44.900 107.500 ZM 40.680 124.110 L 114.130 176.000 L 93.410 190.650 L 57.090 165.000 C 44.151 155.707 37.755 139.769 40.680 124.110 ZM 128.000 215.110 L 107.270 200.460 L 128.000 185.800 L 148.730 200.440 ZM 198.910 165.000 L 162.590 190.660 L 141.870 176.000 L 215.320 124.100 C 218.249 139.763 211.853 155.706 198.910 165.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _gitlabLogo!!
    }

private var _gitlabLogo: ImageVector? = null
