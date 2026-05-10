package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ClaudeFill: ImageVector
    get() {
        if (_claudeFill != null) return _claudeFill!!
        _claudeFill = remixIcon(
            name = "ClaudeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.92 15.3 9.86 13.1l.06-.2-.06-.1h-.2L9 12.76 6.76 12.7 4.8 12.6 2.9 12.5l-.48-.1L2 11.8l.04-.3 .4-.26 .58 .04 1.26 .1 1.9 .12 1.38 .08 2.04 .24h.32l.04-.14-.1-.08-.08-.08L7.8 10.2 5.68 8.8 4.56 7.98 3.96 7.58 3.66 7.18 3.54 6.34l.54-.6 .74 .06L5 5.84l.74 .58L7.34 7.64 9.4 9.2l.3 .24 .12-.08 .02-.06L9.7 9.08 8.6 7 7.4 4.92 6.86 4.06 6.72 3.54C6.66 3.34 6.64 3.14 6.64 2.94l.6-.84L7.6 2l.84 .12 .32 .28 .52 1.2 .82 1.86 1.3 2.52 .4 .76L12 9.42l.06 .2h.14v-.1l.1-1.44 .2-1.74 .2-2.24 .06-.64 .32-.76 .6-.4 .52 .22 .4 .58-.06 .36L14.32 5l-.52 2.42-.3 1.64h.18l.2-.22 .82-1.08L16.08 6.04l.6-.7 .72-.74 .46-.36h.86l.62 .94-.28 .98-.88 1.12-.74 .94L16.38 9.64l-.64 1.14 .06 .08h.14l2.4-.52 1.28-.22 1.52-.26 .7 .32 .08 .32-.28 .68L20 11.58l-1.92 .4-2.86 .66-.04 .02 .04 .06 1.28 .12 .56 .04h1.36l2.52 .2 .66 .4 .38 .54-.06 .4-1.02 .52-1.36-.32-3.2-.76-1.08-.26h-.16v.08l.92 .9 1.66 1.5 2.12 1.94 .1 .48-.26 .4-.28-.04L17.52 17.46l-.72-.6L15.2 15.5h-.1v.14l.36 .54 1.96 2.94 .1 .9-.14 .28-.52 .2-.54-.12L15.16 18.78 13.96 16.98l-.94-1.64-.1 .08-.58 6.04-.26 .3L11.48 22l-.5-.4L10.7 21l.28-1.24 .32-1.6 .26-1.28 .24-1.58 .14-.52v-.04h-.14l-1.2 1.66L8.8 18.86 7.36 20.38l-.34 .14-.6-.3 .06-.56 .32-.46 2-2.56L10 15.06l.8-.92-.02-.1h-.06L5.44 17.48l-.94 .12-.4-.4 .04-.6 .2-.2L5.94 15.3h-.02Z"),
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
        return _claudeFill!!
    }

private var _claudeFill: ImageVector? = null
