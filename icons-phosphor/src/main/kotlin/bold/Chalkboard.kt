package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Chalkboard: ImageVector
    get() {
        if (_chalkboard != null) return _chalkboard!!
        _chalkboard = phosphorBoldIcon(
            name = "Chalkboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 240.000 188.000 L 236.000 188.000 L 236.000 56.000 C 236.000 44.954 227.046 36.000 216.000 36.000 L 40.000 36.000 C 28.954 36.000 20.000 44.954 20.000 56.000 L 20.000 188.000 L 16.000 188.000 C 9.373 188.000 4.000 193.373 4.000 200.000 C 4.000 206.627 9.373 212.000 16.000 212.000 L 240.000 212.000 C 246.627 212.000 252.000 206.627 252.000 200.000 C 252.000 193.373 246.627 188.000 240.000 188.000 ZM 44.000 60.000 L 212.000 60.000 L 212.000 188.000 L 196.000 188.000 L 196.000 160.000 C 196.000 153.373 190.627 148.000 184.000 148.000 L 120.000 148.000 C 113.373 148.000 108.000 153.373 108.000 160.000 L 108.000 188.000 L 84.000 188.000 L 84.000 100.000 L 172.000 100.000 L 172.000 120.000 C 172.000 126.627 177.373 132.000 184.000 132.000 C 190.627 132.000 196.000 126.627 196.000 120.000 L 196.000 88.000 C 196.000 81.373 190.627 76.000 184.000 76.000 L 72.000 76.000 C 65.373 76.000 60.000 81.373 60.000 88.000 L 60.000 188.000 L 44.000 188.000 ZM 172.000 188.000 L 132.000 188.000 L 132.000 172.000 L 172.000 172.000 Z"),
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
        return _chalkboard!!
    }

private var _chalkboard: ImageVector? = null
