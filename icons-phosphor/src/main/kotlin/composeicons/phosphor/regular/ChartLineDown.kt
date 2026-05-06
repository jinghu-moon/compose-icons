package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ChartLineDown: ImageVector
    get() {
        if (_chartLineDown != null) return _chartLineDown!!
        _chartLineDown = phosphorRegularIcon(
            name = "ChartLineDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 208c0 4.418-3.582 8-8 8h-192c-4.418 0-8-3.582-8-8v-160c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v12.69l56 56L122.34 90.34c1.501-1.502 3.537-2.346 5.66-2.346 2.123 0 4.159 .844 5.66 2.346L192 148.69v-20.69c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v40c.015 .266 .015 .534 0 .8 0 .11 0 .21-.05 .32-.05 .11 0 .3-.07 .46-.022 .125-.052 .249-.09 .37 0 .13-.06 .26-.1 .39-.04 .13-.08 .23-.12 .35l-.14 .39-.15 .31c-.06 .13-.12 .27-.19 .4-.07 .13-.11 .18-.16 .28l-.24 .39-.21 .28-.26 .35c-.11 .14-.24 .27-.36 .4l-.16 .18-.17 .15c-.133 .131-.273 .255-.42 .37-.102 .089-.209 .172-.32 .25l-.3 .22-.38 .23c-.097 .063-.197 .119-.3 .17l-.37 .19-.34 .15-.36 .13c-.123 .052-.25 .096-.38 .13l-.36 .1c-.14 0-.26 .07-.4 .09l-.42 .07-.35 .05c-.263 .015-.527 .015-.79 0h-40.04c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h20.69L128 107.31l-26.34 26.35c-1.501 1.502-3.537 2.346-5.66 2.346-2.123 0-4.159-.844-5.66-2.346L40 83.31v116.69h184c4.418 0 8 3.582 8 8Z"),
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
        return _chartLineDown!!
    }

private var _chartLineDown: ImageVector? = null
