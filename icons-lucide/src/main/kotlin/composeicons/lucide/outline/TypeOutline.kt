package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.TypeOutline: ImageVector
    get() {
        if (_typeOutline != null) return _typeOutline!!
        _typeOutline = lucideOutlineIcon(
            name = "TypeOutline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 16.5c0 .276 .224 .5 .5 .5h.5c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2h-6C7.895 21 7 20.105 7 19c0-1.105 .895-2 2-2h.5c.276 0 .5-.224 .5-.5v-9C10 7.224 9.776 7 9.5 7h-3C6.224 7 6 7.224 6 7.5v.5c0 1.105-.895 2-2 2C2.895 10 2 9.105 2 8v-3C2 3.895 2.895 3 4 3h16c1.105 0 2 .895 2 2v3c0 1.105-.895 2-2 2C18.895 10 18 9.105 18 8v-.5C18 7.224 17.776 7 17.5 7h-3C14.224 7 14 7.224 14 7.5Z"),
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
        return _typeOutline!!
    }

private var _typeOutline: ImageVector? = null
