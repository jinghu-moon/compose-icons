package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Divide: ImageVector
    get() {
        if (_divide != null) return _divide!!
        _divide = phosphorBoldIcon(
            name = "Divide",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.000 128.000 C 228.000 134.627 222.627 140.000 216.000 140.000 L 40.000 140.000 C 33.373 140.000 28.000 134.627 28.000 128.000 C 28.000 121.373 33.373 116.000 40.000 116.000 L 216.000 116.000 C 222.627 116.000 228.000 121.373 228.000 128.000 ZM 128.000 84.000 C 139.046 84.000 148.000 75.046 148.000 64.000 C 148.000 52.954 139.046 44.000 128.000 44.000 C 116.954 44.000 108.000 52.954 108.000 64.000 C 108.000 75.046 116.954 84.000 128.000 84.000 ZM 128.000 172.000 C 116.954 172.000 108.000 180.954 108.000 192.000 C 108.000 203.046 116.954 212.000 128.000 212.000 C 139.046 212.000 148.000 203.046 148.000 192.000 C 148.000 180.954 139.046 172.000 128.000 172.000 Z"),
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
        return _divide!!
    }

private var _divide: ImageVector? = null
