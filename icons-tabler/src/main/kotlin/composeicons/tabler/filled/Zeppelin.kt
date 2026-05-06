package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Zeppelin: ImageVector
    get() {
        if (_zeppelin != null) return _zeppelin!!
        _zeppelin = tablerFilledIcon(
            name = "Zeppelin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.5 3C18.687 3 23 6.044 23 10c0 3.017-2.508 5.503-6 6.514v3.486c0 .552-.448 1-1 1h-6C9.448 21 9 20.552 9 20v-4.046C8.081 15.548 7.192 15.076 6.34 14.543l-.13-.082L4.64 15.769c-.283 .236-.672 .297-1.013 .16-.341-.137-.58-.45-.621-.816L3 15v-2.851l-.31-.25c-.229-.187-.456-.377-.682-.568l-.67-.582C1.123 10.559 1.001 10.286 1.001 10c0-.286 .123-.559 .337-.749 .443-.392 .893-.776 1.351-1.151L3 7.85v-2.85c-0-.368 .201-.706 .525-.881 .324-.175 .717-.157 1.025 .045l.09 .068L6.21 5.539l.128-.08C8.842 3.906 11.122 3.081 13.191 3.006ZM11.001 16.657 11 19h4l.001-2.086Q14.266 17 13.5 17c-.717-.004-1.432-.089-2.13-.252Z"),
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
        return _zeppelin!!
    }

private var _zeppelin: ImageVector? = null
