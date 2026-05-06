package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Moon: ImageVector
    get() {
        if (_moon != null) return _moon!!
        _moon = lucideOutlineIcon(
            name = "Moon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.985 12.486c-.261 4.837-4.305 8.6-9.148 8.513C6.993 20.913 3.087 17.007 3 12.163 2.912 7.32 6.675 3.276 11.512 3.014c.405-.022 .617 .46 .402 .803-1.481 2.369-1.13 5.447 .845 7.423 1.976 1.976 5.053 2.326 7.423 .845 .344-.215 .825-.004 .803 .401"),
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
        return _moon!!
    }

private var _moon: ImageVector? = null
