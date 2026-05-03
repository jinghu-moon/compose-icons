package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GitlabLogo: ImageVector
    get() {
        if (_gitlabLogo != null) return _gitlabLogo!!
        _gitlabLogo = phosphorFillIcon(
            name = "GitlabLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 230.150 117.100 L 210.250 41.000 C 208.950 35.927 204.496 32.292 199.264 32.038 C 194.033 31.783 189.247 34.967 187.460 39.890 L 169.780 88.000 L 86.220 88.000 L 68.540 39.870 C 66.749 34.948 61.960 31.767 56.728 32.026 C 51.497 32.286 47.045 35.925 45.750 41.000 L 25.850 117.100 C 19.833 140.028 28.584 164.291 47.850 178.100 L 121.120 229.860 C 125.238 232.768 130.742 232.768 134.860 229.860 L 208.130 178.100 C 227.404 164.296 236.163 140.032 230.150 117.100 ZM 40.680 124.100 L 114.130 176.000 L 93.410 190.650 L 57.090 165.000 C 44.151 155.707 37.755 139.769 40.680 124.110 ZM 128.000 215.100 L 107.270 200.450 L 128.000 185.800 L 148.730 200.440 ZM 198.910 165.000 L 162.590 190.660 L 141.870 176.000 L 215.320 124.100 C 218.249 139.763 211.853 155.706 198.910 165.000 Z"),
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
        return _gitlabLogo!!
    }

private var _gitlabLogo: ImageVector? = null
