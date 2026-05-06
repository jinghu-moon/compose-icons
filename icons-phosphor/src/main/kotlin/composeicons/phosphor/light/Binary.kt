package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Binary: ImageVector
    get() {
        if (_binary != null) return _binary!!
        _binary = phosphorLightIcon(
            name = "Binary",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M121.75 41.21C115.22 31.26 105.62 26 94 26 82.38 26 72.78 31.26 66.25 41.21 60.93 49.31 58 60.25 58 72c0 11.75 2.93 22.69 8.25 30.79C72.78 112.74 82.38 118 94 118c11.62 0 21.22-5.26 27.75-15.21C127.07 94.69 130 83.79 130 72c0-11.79-2.93-22.69-8.25-30.79ZM94 106C75 106 70 84.63 70 72 70 59.37 75 38 94 38c19 0 24 21.37 24 34 0 12.63-5 34-24 34ZM193.75 153.21C187.22 143.26 177.62 138 166 138c-11.62 0-21.22 5.26-27.75 15.21-5.32 8.1-8.25 19-8.25 30.79 0 11.79 2.93 22.69 8.25 30.79 6.53 10 16.13 15.21 27.75 15.21 11.62 0 21.22-5.26 27.75-15.21 5.32-8.1 8.25-19 8.25-30.79 0-11.79-2.93-22.69-8.25-30.79ZM166 218c-18.95 0-24-21.37-24-34 0-12.63 5.05-34 24-34 18.95 0 24 21.37 24 34 0 12.63-5 34-24 34ZM146.75 48.25c-.772-1.392-.96-3.034-.521-4.565 .439-1.53 1.468-2.824 2.861-3.595l24-13.34c1.859-1.031 4.125-1.001 5.956 .078 1.831 1.079 2.955 3.047 2.954 5.172v80c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-69.8l-15.09 8.38c-1.391 .773-3.032 .962-4.563 .525-1.53-.437-2.824-1.464-3.597-2.855ZM102 144v80c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-69.8l-15.09 8.38c-1.879 1.104-4.208 1.102-6.085-.004-1.877-1.106-3.007-3.143-2.952-5.321 .055-2.178 1.287-4.155 3.217-5.165l24-13.34c1.859-1.031 4.125-1.001 5.956 .078 1.831 1.079 2.955 3.047 2.954 5.172Z"),
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
        return _binary!!
    }

private var _binary: ImageVector? = null
