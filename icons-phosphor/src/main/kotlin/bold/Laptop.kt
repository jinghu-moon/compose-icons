package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Laptop: ImageVector
    get() {
        if (_laptop != null) return _laptop!!
        _laptop = phosphorBoldIcon(
            name = "Laptop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 156.000 L 228.000 156.000 L 228.000 72.000 C 228.000 56.536 215.464 44.000 200.000 44.000 L 56.000 44.000 C 40.536 44.000 28.000 56.536 28.000 72.000 L 28.000 156.000 L 24.000 156.000 C 17.373 156.000 12.000 161.373 12.000 168.000 L 12.000 192.000 C 12.000 207.464 24.536 220.000 40.000 220.000 L 216.000 220.000 C 231.464 220.000 244.000 207.464 244.000 192.000 L 244.000 168.000 C 244.000 161.373 238.627 156.000 232.000 156.000 ZM 52.000 72.000 C 52.000 69.791 53.791 68.000 56.000 68.000 L 200.000 68.000 C 202.209 68.000 204.000 69.791 204.000 72.000 L 204.000 156.000 L 52.000 156.000 ZM 220.000 192.000 C 220.000 194.209 218.209 196.000 216.000 196.000 L 40.000 196.000 C 37.791 196.000 36.000 194.209 36.000 192.000 L 36.000 180.000 L 220.000 180.000 ZM 156.000 96.000 C 156.000 102.627 150.627 108.000 144.000 108.000 L 112.000 108.000 C 105.373 108.000 100.000 102.627 100.000 96.000 C 100.000 89.373 105.373 84.000 112.000 84.000 L 144.000 84.000 C 150.627 84.000 156.000 89.373 156.000 96.000 Z"),
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
        return _laptop!!
    }

private var _laptop: ImageVector? = null
