package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BadgeVo: ImageVector
    get() {
        if (_badgeVo != null) return _badgeVo!!
        _badgeVo = tablerFilledIcon(
            name = "BadgeVo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 4c1.657 0 3 1.343 3 3v10c0 1.657-1.343 3-3 3h-14C3.343 20 2 18.657 2 17v-10C2 5.343 3.343 4 5 4ZM15.5 8C14.119 8 13 9.119 13 10.5v3C13 14.881 14.119 16 15.5 16 16.881 16 18 14.881 18 13.5v-3C18 9.119 16.881 8 15.5 8M11.316 8.051c-.252-.084-.526-.064-.764 .054-.237 .119-.418 .327-.501 .579L9 11.838 7.949 8.684C7.774 8.16 7.208 7.876 6.684 8.051c-.524 .175-.808 .741-.633 1.265l2 6c.304 .912 1.594 .912 1.898 0l2-6c.084-.252 .064-.526-.054-.764-.119-.237-.327-.418-.579-.501M15.5 10c.276 0 .5 .224 .5 .5v3c0 .276-.224 .5-.5 .5C15.224 14 15 13.776 15 13.5v-3c0-.276 .224-.5 .5-.5"),
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
        return _badgeVo!!
    }

private var _badgeVo: ImageVector? = null
