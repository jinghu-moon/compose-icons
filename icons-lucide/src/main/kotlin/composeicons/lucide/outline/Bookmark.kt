package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Bookmark: ImageVector
    get() {
        if (_bookmark != null) return _bookmark!!
        _bookmark = lucideOutlineIcon(
            name = "Bookmark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 3c1.105 0 2 .895 2 2v15c-0 .356-.19 .686-.498 .865-.308 .179-.688 .18-.998 .003L12.992 18.29c-.615-.351-1.369-.351-1.984 0L6.496 20.868c-.309 .177-.69 .175-.998-.003C5.19 20.686 5 20.356 5 20v-15C5 3.895 5.895 3 7 3Z"),
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
        return _bookmark!!
    }

private var _bookmark: ImageVector? = null
