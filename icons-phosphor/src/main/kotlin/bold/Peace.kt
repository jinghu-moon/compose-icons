package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Peace: ImageVector
    get() {
        if (_peace != null) return _peace!!
        _peace = phosphorBoldIcon(
            name = "Peace",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 212.000 128.000 C 212.023 141.146 208.939 154.112 203.000 165.840 L 140.000 121.750 L 140.000 44.870 C 181.299 50.883 211.944 86.266 212.000 128.000 ZM 116.000 44.870 L 116.000 121.750 L 53.000 165.840 C 40.779 141.705 40.941 113.160 53.434 89.165 C 65.927 65.170 89.220 48.669 116.000 44.840 ZM 66.830 185.480 L 116.000 151.050 L 116.000 211.130 C 97.175 208.404 79.837 199.359 66.830 185.480 ZM 140.000 211.130 L 140.000 151.050 L 189.170 185.480 C 176.163 199.359 158.825 208.404 140.000 211.130 Z"),
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
        return _peace!!
    }

private var _peace: ImageVector? = null
