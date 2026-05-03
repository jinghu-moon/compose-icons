package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Ranking: ImageVector
    get() {
        if (_ranking != null) return _ranking!!
        _ranking = phosphorBoldIcon(
            name = "Ranking",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 108.620 103.790 C 106.530 97.505 109.927 90.716 116.210 88.620 L 128.210 84.620 C 131.868 83.402 135.888 84.016 139.016 86.271 C 142.144 88.525 143.998 92.145 144.000 96.000 L 144.000 136.000 C 144.000 142.627 138.627 148.000 132.000 148.000 C 125.373 148.000 120.000 142.627 120.000 136.000 L 120.000 112.000 L 120.000 112.000 C 114.835 111.998 110.251 108.691 108.620 103.790 ZM 252.000 208.000 C 252.000 214.627 246.627 220.000 240.000 220.000 L 16.000 220.000 C 9.373 220.000 4.000 214.627 4.000 208.000 C 4.000 201.373 9.373 196.000 16.000 196.000 L 20.000 196.000 L 20.000 104.000 C 20.000 92.954 28.954 84.000 40.000 84.000 L 76.000 84.000 L 76.000 56.000 C 76.000 44.954 84.954 36.000 96.000 36.000 L 160.000 36.000 C 171.046 36.000 180.000 44.954 180.000 56.000 L 180.000 124.000 L 216.000 124.000 C 227.046 124.000 236.000 132.954 236.000 144.000 L 236.000 196.000 L 240.000 196.000 C 246.627 196.000 252.000 201.373 252.000 208.000 ZM 180.000 148.000 L 180.000 196.000 L 212.000 196.000 L 212.000 148.000 ZM 100.000 196.000 L 156.000 196.000 L 156.000 60.000 L 100.000 60.000 ZM 44.000 196.000 L 76.000 196.000 L 76.000 108.000 L 44.000 108.000 Z"),
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
        return _ranking!!
    }

private var _ranking: ImageVector? = null
