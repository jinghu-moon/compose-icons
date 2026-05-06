package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GitDiff: ImageVector
    get() {
        if (_gitDiff != null) return _gitDiff!!
        _gitDiff = phosphorFillIcon(
            name = "GitDiff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M118.18 213.08c-.11 .14-.24 .27-.36 .4l-.16 .18-.17 .15c-.133 .131-.273 .255-.42 .37-.102 .089-.209 .172-.32 .25l-.3 .22-.38 .23c-.097 .063-.197 .119-.3 .17l-.37 .19-.34 .15-.36 .13c-.123 .052-.25 .096-.38 .13l-.36 .1c-.14 0-.26 .07-.4 .09l-.42 .07-.35 .05c-.263 .015-.527 .015-.79 0h-48c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h28.69L55 162.34c-4.511-4.503-7.032-10.626-7-17v-50.34C32.398 90.971 22.225 75.97 24.255 59.984 26.286 43.998 39.886 32.016 56 32.016c16.114 0 29.715 11.982 31.745 27.968C89.775 75.97 79.602 90.971 64 95v50.38c.009 2.109 .85 4.128 2.34 5.62L104 188.69v-28.69c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v48c.015 .266 .015 .534 0 .8 0 .11 0 .21 0 .32 0 .11 0 .3-.07 .46-.022 .125-.052 .249-.09 .37 0 .13-.06 .26-.1 .39-.04 .13-.08 .23-.12 .35l-.14 .39-.15 .31c-.06 .13-.12 .27-.19 .4-.07 .13-.11 .18-.16 .28l-.24 .39-.21 .28ZM208 161v-50.37c.032-6.374-2.489-12.496-7-17L163.31 56h28.69c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-48.18-.6c-.14 0-.28 0-.41 .06h-.37l-.43 .11-.33 .08-.4 .14-.34 .13-.35 .16-.36 .18c-.107 .054-.21 .114-.31 .18-.12 .07-.25 .14-.36 .22-.107 .071-.211 .148-.31 .23-.111 .074-.218 .154-.32 .24-.15 .12-.28 .24-.42 .37l-.17 .15-.16 .18c-.12 .13-.25 .26-.36 .4l-.26 .35-.21 .28-.24 .39c-.05 .1-.11 .19-.16 .28-.05 .09-.13 .27-.19 .4l-.15 .31-.14 .39c0 .12-.09 .23-.12 .35-.03 .12-.07 .26-.1 .39-.038 .121-.068 .245-.09 .37 0 .16 0 .31-.07 .46-.07 .15 0 .21-.05 .32-.015 .266-.015 .534 0 .8v48.08c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-28.69L189.66 105c1.5 1.502 2.342 3.538 2.34 5.66v50.34c-15.602 4.029-25.775 19.03-23.745 35.016 2.03 15.986 15.631 27.968 31.745 27.968 16.114 0 29.714-11.982 31.745-27.968C233.775 180.03 223.602 165.029 208 161Z"),
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
        return _gitDiff!!
    }

private var _gitDiff: ImageVector? = null
