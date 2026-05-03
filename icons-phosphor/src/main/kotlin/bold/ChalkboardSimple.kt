package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChalkboardSimple: ImageVector
    get() {
        if (_chalkboardSimple != null) return _chalkboardSimple!!
        _chalkboardSimple = phosphorBoldIcon(
            name = "ChalkboardSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 240.000 188.000 L 236.000 188.000 L 236.000 160.000 C 236.000 153.373 230.627 148.000 224.000 148.000 L 160.000 148.000 C 153.373 148.000 148.000 153.373 148.000 160.000 L 148.000 188.000 L 44.000 188.000 L 44.000 60.000 L 212.000 60.000 L 212.000 120.000 C 212.000 126.627 217.373 132.000 224.000 132.000 C 230.627 132.000 236.000 126.627 236.000 120.000 L 236.000 56.000 C 236.000 44.954 227.046 36.000 216.000 36.000 L 40.000 36.000 C 28.954 36.000 20.000 44.954 20.000 56.000 L 20.000 188.000 L 16.000 188.000 C 9.373 188.000 4.000 193.373 4.000 200.000 C 4.000 206.627 9.373 212.000 16.000 212.000 L 240.000 212.000 C 246.627 212.000 252.000 206.627 252.000 200.000 C 252.000 193.373 246.627 188.000 240.000 188.000 ZM 172.000 172.000 L 212.000 172.000 L 212.000 188.000 L 172.000 188.000 Z"),
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
        return _chalkboardSimple!!
    }

private var _chalkboardSimple: ImageVector? = null
