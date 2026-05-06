package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PersonSimpleThrow: ImageVector
    get() {
        if (_personSimpleThrow != null) return _personSimpleThrow!!
        _personSimpleThrow = phosphorLightIcon(
            name = "PersonSimpleThrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 86c16.569 0 30-13.431 30-30C158 39.431 144.569 26 128 26 111.431 26 98 39.431 98 56c0 16.569 13.431 30 30 30ZM128 38c9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18ZM50 96C50 88.268 56.268 82 64 82c7.732 0 14 6.268 14 14 0 7.732-6.268 14-14 14C56.268 110 50 103.732 50 96ZM220.68 109.35c-2.05 2.593-5.81 3.04-8.41 1-1.17-.92-25.06-18.91-62.52 .94-.256 10.86-1.336 21.684-3.23 32.38l33.32 27.77c1.898 1.582 2.633 4.166 1.85 6.51l-16 48c-1.096 3.079-4.454 4.714-7.553 3.679-3.1-1.035-4.801-4.36-3.827-7.479L169 178 143.51 156.75c-1.587 5.809-3.544 11.511-5.86 17.07C124.15 206 100 227.48 65.73 237.75c-.562 .165-1.144 .25-1.73 .25-2.98 .003-5.511-2.182-5.943-5.131-.432-2.949 1.367-5.768 4.223-6.619 64.82-19.45 73.42-78.76 75.11-107.41C109 137.65 86.8 142 72.39 142c-11.71 0-18.29-2.86-18.88-3.13-3.015-1.381-4.341-4.945-2.96-7.96 1.381-3.015 4.945-4.341 7.96-2.96 .21 .09 27.6 11.28 74.14-20.35 26.44-18 48.5-19 62.36-16.67 15.37 2.57 24.39 9.7 24.76 10 2.57 2.077 2.977 5.842 .91 8.42Z"),
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
        return _personSimpleThrow!!
    }

private var _personSimpleThrow: ImageVector? = null
