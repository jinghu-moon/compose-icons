package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Invoice: ImageVector
    get() {
        if (_invoice != null) return _invoice!!
        _invoice = phosphorBoldIcon(
            name = "Invoice",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M28 132c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h28c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-16C25.21 99.978 12.988 88.456 12.094 73.693 11.199 58.93 21.941 46.018 36.62 44.21c1.628-4.849 6.15-8.134 11.265-8.181 5.115-.047 9.698 3.153 11.415 7.971h4.7c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-24c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h16c14.79 .022 27.012 11.544 27.906 26.307 .894 14.763-9.847 27.675-24.526 29.483-1.628 4.849-6.15 8.134-11.265 8.181-5.115 .047-9.698-3.153-11.415-7.971ZM236 56v136c0 11.046-8.954 20-20 20h-176C28.954 212 20 203.046 20 192v-28c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v24h112v-24h-68c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h68v-24h-44c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h100v-24h-108C97.373 68 92 62.627 92 56c0-6.627 5.373-12 12-12h120c6.627 0 12 5.373 12 12ZM180 140h32v-24h-32ZM212 188v-24h-32v24Z"),
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
        return _invoice!!
    }

private var _invoice: ImageVector? = null
