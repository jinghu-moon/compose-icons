package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Bank: ImageVector
    get() {
        if (_bank != null) return _bank!!
        _bank = phosphorBoldIcon(
            name = "Bank",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M24 108h20v48h-12c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h192c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-12v-48h20c5.369 0 10.085-3.566 11.547-8.731 1.462-5.166-.685-10.675-5.257-13.489l-104-64c-3.857-2.374-8.723-2.374-12.58 0l-104 64c-4.573 2.814-6.72 8.323-5.257 13.489 1.462 5.166 6.178 8.732 11.547 8.731ZM68 108h24v48h-24ZM140 108v48h-24v-48ZM188 156h-24v-48h24ZM128 46.09 189.6 84h-123.2ZM252 208c0 6.627-5.373 12-12 12h-224C9.373 220 4 214.627 4 208c0-6.627 5.373-12 12-12h224c6.627 0 12 5.373 12 12Z"),
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
        return _bank!!
    }

private var _bank: ImageVector? = null
