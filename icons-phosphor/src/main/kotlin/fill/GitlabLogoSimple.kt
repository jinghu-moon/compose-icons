package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GitlabLogoSimple: ImageVector
    get() {
        if (_gitlabLogoSimple != null) return _gitlabLogoSimple!!
        _gitlabLogoSimple = phosphorFillIcon(
            name = "GitlabLogoSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.140 178.060 L 134.870 229.820 C 130.752 232.728 125.248 232.728 121.130 229.820 L 47.860 178.060 C 28.594 164.251 19.843 139.988 25.860 117.060 L 45.750 41.000 C 47.050 35.927 51.504 32.292 56.736 32.038 C 61.967 31.783 66.753 34.967 68.540 39.890 L 86.220 88.000 L 169.780 88.000 L 187.460 39.870 C 189.251 34.948 194.040 31.767 199.272 32.026 C 204.503 32.286 208.955 35.925 210.250 41.000 L 230.150 117.120 C 236.138 140.031 227.386 164.263 208.140 178.060 Z"),
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
        return _gitlabLogoSimple!!
    }

private var _gitlabLogoSimple: ImageVector? = null
