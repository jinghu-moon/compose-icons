package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PersonSimpleSnowboard: ImageVector
    get() {
        if (_personSimpleSnowboard != null) return _personSimpleSnowboard!!
        _personSimpleSnowboard = phosphorThinIcon(
            name = "PersonSimpleSnowboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M164 76c13.255 0 24-10.745 24-24C188 38.745 177.255 28 164 28c-13.255 0-24 10.745-24 24 0 13.255 10.745 24 24 24ZM164 36c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16ZM217.13 116.16 81.13 76.16c-2.121-.624-4.346 .589-4.97 2.71-.624 2.121 .589 4.346 2.71 4.97l46.06 13.54L86.77 154.63 39.23 140.85c-11.228-3.286-22.994 3.152-26.28 14.38-3.286 11.228 3.152 22.994 14.38 26.28h0l157.44 45.63c1.949 .569 3.969 .859 6 .86 4.606-.006 9.086-1.512 12.76-4.29 5.339-3.974 8.477-10.244 8.46-16.9-.051-9.421-6.286-17.689-15.33-20.33L140.51 170.21l22.8-34c.714-1.061 .877-2.399 .44-3.6-.439-1.199-1.423-2.117-2.65-2.47L120.54 118.4 133 99.75l81.9 24.09c.358 .104 .728 .157 1.1 .16 1.993 .005 3.685-1.457 3.969-3.429 .284-1.972-.926-3.853-2.839-4.411ZM204 206.81c.018 4.138-1.936 8.037-5.26 10.5-3.351 2.538-7.707 3.336-11.74 2.15L29.55 173.82C23.923 172.18 20.04 167.041 20 161.18c-.018-4.138 1.936-8.037 5.26-10.5 3.351-2.538 7.709-3.332 11.74-2.14l157.44 45.63c5.633 1.633 9.522 6.775 9.56 12.64ZM153.63 136.32l-21.17 31.55L94.83 157l21-31.59Z"),
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
        return _personSimpleSnowboard!!
    }

private var _personSimpleSnowboard: ImageVector? = null
