package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FacebookLogo: ImageVector
    get() {
        if (_facebookLogo != null) return _facebookLogo!!
        _facebookLogo = phosphorBoldIcon(
            name = "FacebookLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 140.000 211.130 L 140.000 156.000 L 160.000 156.000 C 166.627 156.000 172.000 150.627 172.000 144.000 C 172.000 137.373 166.627 132.000 160.000 132.000 L 140.000 132.000 L 140.000 112.000 C 140.000 105.373 145.373 100.000 152.000 100.000 L 168.000 100.000 C 174.627 100.000 180.000 94.627 180.000 88.000 C 180.000 81.373 174.627 76.000 168.000 76.000 L 152.000 76.000 C 132.118 76.000 116.000 92.118 116.000 112.000 L 116.000 132.000 L 96.000 132.000 C 89.373 132.000 84.000 137.373 84.000 144.000 C 84.000 150.627 89.373 156.000 96.000 156.000 L 116.000 156.000 L 116.000 211.130 C 72.394 204.836 41.061 165.921 44.216 121.976 C 47.371 78.031 83.942 43.992 128.000 43.992 C 172.058 43.992 208.629 78.031 211.784 121.976 C 214.939 165.921 183.606 204.836 140.000 211.130 Z"),
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
        return _facebookLogo!!
    }

private var _facebookLogo: ImageVector? = null
