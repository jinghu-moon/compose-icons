package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Meteor: ImageVector
    get() {
        if (_meteor != null) return _meteor!!
        _meteor = phosphorRegularIcon(
            name = "Meteor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M96 120c-22.091 0-40 17.909-40 40 0 22.091 17.909 40 40 40 22.091 0 40-17.909 40-40 0-22.091-17.909-40-40-40ZM96 184C82.745 184 72 173.255 72 160c0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24ZM221.66 122.34c1.502 1.501 2.346 3.537 2.346 5.66 0 2.123-.844 4.159-2.346 5.66l-48 48c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32l48-48c1.501-1.502 3.537-2.346 5.66-2.346 2.123 0 4.159 .844 5.66 2.346ZM160 136c-3.238 .003-6.158-1.947-7.397-4.938-1.239-2.991-.554-6.434 1.737-8.722l24-24c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32l-24 24c-1.502 1.5-3.538 2.342-5.66 2.34ZM229.66 69.66l-16 16c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32l16-16c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32ZM122.34 90.34l72-72c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32l-72 72c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32ZM146.91 199.6c3.122 3.124 3.122 8.186 0 11.31-18.138 18.436-44.771 25.728-69.771 19.102C52.14 223.386 32.614 203.86 25.988 178.861c-6.626-25 .665-51.632 19.102-69.771L127.83 26.34c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32L56.4 120.4c-21.87 21.87-21.87 57.33 0 79.2 21.87 21.87 57.33 21.87 79.2 0 3.124-3.122 8.186-3.122 11.31 0Z"),
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
        return _meteor!!
    }

private var _meteor: ImageVector? = null
