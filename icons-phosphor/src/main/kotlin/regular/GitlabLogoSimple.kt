package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.GitlabLogoSimple: ImageVector
    get() {
        if (_gitlabLogoSimple != null) return _gitlabLogoSimple!!
        _gitlabLogoSimple = phosphorRegularIcon(
            name = "GitlabLogoSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 230.150 117.100 L 210.250 41.000 C 208.950 35.927 204.496 32.292 199.264 32.038 C 194.033 31.783 189.247 34.967 187.460 39.890 L 169.780 88.000 L 86.220 88.000 L 68.540 39.870 C 66.749 34.948 61.960 31.767 56.728 32.026 C 51.497 32.286 47.045 35.925 45.750 41.000 L 25.850 117.100 C 19.833 140.028 28.584 164.291 47.850 178.100 L 121.120 229.860 C 125.238 232.768 130.742 232.768 134.860 229.860 L 208.130 178.100 C 227.404 164.296 236.163 140.032 230.150 117.100 ZM 198.910 165.000 L 128.000 215.090 L 57.090 165.000 C 43.266 155.060 37.002 137.625 41.340 121.160 L 58.000 57.500 L 73.130 98.760 C 74.287 101.908 77.286 104.000 80.640 104.000 L 175.360 104.000 C 178.714 104.000 181.713 101.908 182.870 98.760 L 198.000 57.500 L 214.630 121.150 C 218.979 137.612 212.727 155.051 198.910 165.000 Z"),
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
        return _gitlabLogoSimple!!
    }

private var _gitlabLogoSimple: ImageVector? = null
