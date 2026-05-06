package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BadgeVr: ImageVector
    get() {
        if (_badgeVr != null) return _badgeVr!!
        _badgeVr = tablerFilledIcon(
            name = "BadgeVr",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 4c1.657 0 3 1.343 3 3v10c0 1.657-1.343 3-3 3h-14C3.343 20 2 18.657 2 17v-10C2 5.343 3.343 4 5 4ZM15.5 8h-1.5c-.552 0-1 .448-1 1v6c0 .552 .448 1 1 1l.117-.007c.503-.059 .883-.486 .883-.993v-1.196l1.168 1.75c.147 .221 .376 .374 .636 .426 .26 .052 .53-.001 .751-.148l.093-.07c.387-.329 .466-.895 .184-1.317L16.673 12.707l.044-.023c.995-.554 1.489-1.711 1.203-2.813C17.634 8.769 16.639 8 15.5 8M11.316 8.051c-.252-.084-.526-.064-.764 .054-.237 .119-.418 .327-.501 .579L9 11.838 7.949 8.684C7.774 8.16 7.208 7.876 6.684 8.051c-.524 .175-.808 .741-.633 1.265l2 6c.304 .912 1.594 .912 1.898 0l2-6c.084-.252 .064-.526-.054-.764-.119-.237-.327-.418-.579-.501M15.5 10c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5h-.5v-1Z"),
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
        return _badgeVr!!
    }

private var _badgeVr: ImageVector? = null
