package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TwitchLogo: ImageVector
    get() {
        if (_twitchLogo != null) return _twitchLogo!!
        _twitchLogo = phosphorLightIcon(
            name = "TwitchLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 34h-160C40.268 34 34 40.268 34 48v144c0 7.732 6.268 14 14 14h18v34c0 2.328 1.347 4.445 3.455 5.433 2.108 .988 4.597 .667 6.385-.823L122.17 206h42.93c3.289 .007 6.475-1.143 9-3.25L217 167c3.179-2.668 5.011-6.609 5-10.76v-108.24c0-7.732-6.268-14-14-14ZM210 156.25c.001 .595-.263 1.159-.72 1.54l-42.9 35.75c-.36 .298-.813 .461-1.28 .46h-45.1c-1.403 0-2.762 .492-3.84 1.39L78 227.19v-27.19c0-3.314-2.686-6-6-6h-24c-1.105 0-2-.895-2-2v-144c0-1.105 .895-2 2-2h160c1.105 0 2 .895 2 2ZM174 88v48c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-48c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM126 88v48c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-48c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6Z"),
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
        return _twitchLogo!!
    }

private var _twitchLogo: ImageVector? = null
