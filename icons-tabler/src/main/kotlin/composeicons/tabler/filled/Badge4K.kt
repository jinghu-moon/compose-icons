package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Badge4K: ImageVector
    get() {
        if (_badge4K != null) return _badge4K!!
        _badge4K = tablerFilledIcon(
            name = "Badge4K",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 4c1.657 0 3 1.343 3 3v10c0 1.657-1.343 3-3 3h-14C3.343 20 2 18.657 2 17v-10C2 5.343 3.343 4 5 4ZM10 8C9.448 8 9 8.448 9 9v2h-1v-2C8 8.448 7.552 8 7 8 6.448 8 6 8.448 6 9v2c0 1.105 .895 2 2 2h1v2c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-6C11 8.448 10.552 8 10 8M17.555 8.168c-.221-.147-.491-.201-.751-.149-.26 .052-.489 .205-.636 .426L15 10.196v-1.196c-0-.507-.38-.934-.883-.993L14 8c-.552 0-1 .448-1 1v6c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-1.196l1.168 1.75c.281 .422 .834 .567 1.286 .337l.1-.059 .094-.07c.387-.329 .466-.895 .184-1.317L16.202 12 17.832 9.555c.147-.221 .201-.491 .149-.751-.052-.26-.205-.489-.426-.636"),
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
        return _badge4K!!
    }

private var _badge4K: ImageVector? = null
