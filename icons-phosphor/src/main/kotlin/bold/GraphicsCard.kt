package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GraphicsCard: ImageVector
    get() {
        if (_graphicsCard != null) return _graphicsCard!!
        _graphicsCard = phosphorBoldIcon(
            name = "GraphicsCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 44.000 L 16.000 44.000 C 9.373 44.000 4.000 49.373 4.000 56.000 L 4.000 208.000 C 4.000 214.627 9.373 220.000 16.000 220.000 C 22.627 220.000 28.000 214.627 28.000 208.000 L 28.000 196.000 L 44.000 196.000 L 44.000 208.000 C 44.000 214.627 49.373 220.000 56.000 220.000 C 62.627 220.000 68.000 214.627 68.000 208.000 L 68.000 196.000 L 84.000 196.000 L 84.000 208.000 C 84.000 214.627 89.373 220.000 96.000 220.000 C 102.627 220.000 108.000 214.627 108.000 208.000 L 108.000 196.000 L 124.000 196.000 L 124.000 208.000 C 124.000 214.627 129.373 220.000 136.000 220.000 C 142.627 220.000 148.000 214.627 148.000 208.000 L 148.000 196.000 L 232.000 196.000 C 243.046 196.000 252.000 187.046 252.000 176.000 L 252.000 64.000 C 252.000 52.954 243.046 44.000 232.000 44.000 ZM 228.000 172.000 L 28.000 172.000 L 28.000 68.000 L 228.000 68.000 ZM 176.000 160.000 C 198.091 160.000 216.000 142.091 216.000 120.000 C 216.000 97.909 198.091 80.000 176.000 80.000 C 153.909 80.000 136.000 97.909 136.000 120.000 C 136.000 142.091 153.909 160.000 176.000 160.000 ZM 176.000 104.000 C 184.837 104.000 192.000 111.163 192.000 120.000 C 192.000 128.837 184.837 136.000 176.000 136.000 C 167.163 136.000 160.000 128.837 160.000 120.000 C 160.000 111.163 167.163 104.000 176.000 104.000 ZM 80.000 160.000 C 102.091 160.000 120.000 142.091 120.000 120.000 C 120.000 97.909 102.091 80.000 80.000 80.000 C 57.909 80.000 40.000 97.909 40.000 120.000 C 40.000 142.091 57.909 160.000 80.000 160.000 ZM 80.000 104.000 C 88.837 104.000 96.000 111.163 96.000 120.000 C 96.000 128.837 88.837 136.000 80.000 136.000 C 71.163 136.000 64.000 128.837 64.000 120.000 C 64.000 111.163 71.163 104.000 80.000 104.000 Z"),
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
        return _graphicsCard!!
    }

private var _graphicsCard: ImageVector? = null
