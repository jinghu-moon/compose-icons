package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Desktop: ImageVector
    get() {
        if (_desktop != null) return _desktop!!
        _desktop = phosphorBoldIcon(
            name = "Desktop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 36.000 L 48.000 36.000 C 32.536 36.000 20.000 48.536 20.000 64.000 L 20.000 172.000 C 20.000 187.464 32.536 200.000 48.000 200.000 L 116.000 200.000 L 116.000 212.000 L 96.000 212.000 C 89.373 212.000 84.000 217.373 84.000 224.000 C 84.000 230.627 89.373 236.000 96.000 236.000 L 160.000 236.000 C 166.627 236.000 172.000 230.627 172.000 224.000 C 172.000 217.373 166.627 212.000 160.000 212.000 L 140.000 212.000 L 140.000 200.000 L 208.000 200.000 C 223.464 200.000 236.000 187.464 236.000 172.000 L 236.000 64.000 C 236.000 48.536 223.464 36.000 208.000 36.000 ZM 48.000 60.000 L 208.000 60.000 C 210.209 60.000 212.000 61.791 212.000 64.000 L 212.000 136.000 L 44.000 136.000 L 44.000 64.000 C 44.000 61.791 45.791 60.000 48.000 60.000 ZM 208.000 176.000 L 48.000 176.000 C 45.791 176.000 44.000 174.209 44.000 172.000 L 44.000 160.000 L 212.000 160.000 L 212.000 172.000 C 212.000 174.209 210.209 176.000 208.000 176.000 Z"),
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
        return _desktop!!
    }

private var _desktop: ImageVector? = null
