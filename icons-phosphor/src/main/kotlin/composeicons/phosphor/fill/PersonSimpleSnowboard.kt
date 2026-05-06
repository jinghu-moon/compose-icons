package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PersonSimpleSnowboard: ImageVector
    get() {
        if (_personSimpleSnowboard != null) return _personSimpleSnowboard!!
        _personSimpleSnowboard = phosphorFillIcon(
            name = "PersonSimpleSnowboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M136 52c0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28C148.536 80 136 67.464 136 52ZM223.67 122.25c-1.246 4.239-5.691 6.665-9.93 5.42L134.67 104.41l-7.78 11.67 35.33 10.23c2.453 .71 4.419 2.548 5.293 4.948 .874 2.399 .549 5.072-.873 7.192l-19.75 29.44 50.89 14.75c10.75 3.14 18.161 12.97 18.22 24.17-.049 13.899-11.311 25.152-25.21 25.19-2.415 .001-4.818-.335-7.14-1L26.21 185.35C15.463 182.206 8.058 172.377 8 161.18c.017-7.942 3.769-15.413 10.13-20.168 6.36-4.756 14.588-6.242 22.21-4.012l44.73 13L118.59 99.72l-40.85-12C73.501 86.472 71.077 82.024 72.325 77.785c1.248-4.239 5.696-6.663 9.935-5.415l136 40c4.209 1.251 6.624 5.66 5.41 9.88ZM117.58 130l-16.4 24.6 29.58 8.58 16.49-24.59Z"),
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
