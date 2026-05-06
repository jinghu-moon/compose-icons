package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Zap: ImageVector
    get() {
        if (_zap != null) return _zap!!
        _zap = lucideOutlineIcon(
            name = "Zap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 14c-.386 .001-.739-.22-.905-.568-.167-.348-.118-.762 .125-1.062L13.12 2.17c.153-.177 .408-.224 .614-.113 .206 .11 .308 .348 .246 .573L12.06 8.65c-.115 .308-.072 .652 .116 .921 .188 .269 .496 .43 .824 .429h7c.386-.001 .739 .22 .905 .568 .167 .348 .118 .762-.125 1.062L10.88 21.83c-.153 .177-.408 .224-.614 .113-.206-.11-.308-.348-.246-.573l1.92-6.02c.115-.308 .072-.652-.116-.921C11.636 14.159 11.328 13.999 11 14Z"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _zap!!
    }

private var _zap: ImageVector? = null
