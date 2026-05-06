package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PersonSimpleSnowboard: ImageVector
    get() {
        if (_personSimpleSnowboard != null) return _personSimpleSnowboard!!
        _personSimpleSnowboard = phosphorBoldIcon(
            name = "PersonSimpleSnowboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168 80c17.673 0 32-14.327 32-32C200 30.327 185.673 16 168 16c-17.673 0-32 14.327-32 32 0 17.673 14.327 32 32 32ZM168 40c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8ZM219.38 108.48 83.38 68.48C77.148 66.947 70.814 70.588 69.002 76.744c-1.812 6.156 1.54 12.649 7.608 14.736L112.25 102 83.61 145 44 133.27c-9.393-2.806-19.56-.971-27.38 4.94C8.646 144.117 3.96 153.467 4 163.39c.034 13.88 9.141 26.104 22.43 30.11h0L180 238.71c9.462 2.769 19.676 .907 27.552-5.022 7.877-5.929 12.491-15.229 12.448-25.088-.033-13.883-9.145-26.111-22.44-30.11L157.82 166.79 170 148.68c2.133-3.18 2.621-7.187 1.313-10.786-1.308-3.599-4.255-6.357-7.933-7.424l-34.56-10 7.58-11.38 76.25 22.43c4.176 1.436 8.804 .463 12.047-2.534 3.243-2.997 4.579-7.533 3.476-11.81-1.103-4.276-4.465-7.601-8.753-8.656ZM196 208.6c.023 2.366-1.094 4.598-3 6-1.772 1.36-4.093 1.781-6.23 1.13L33.21 170.48c-2.653-.852-4.61-3.111-5.075-5.858-.465-2.747 .64-5.525 2.865-7.202 1.778-1.348 4.092-1.768 6.23-1.13l153.59 45.22c3.096 .97 5.197 3.846 5.18 7.09ZM140.88 149l-7.2 10.73-26-7.64 7.1-10.64Z"),
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
