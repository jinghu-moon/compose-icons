package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PersonSimpleWalk: ImageVector
    get() {
        if (_personSimpleWalk != null) return _personSimpleWalk!!
        _personSimpleWalk = phosphorThinIcon(
            name = "PersonSimpleWalk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M152 76c15.464 0 28-12.536 28-28C180 32.536 167.464 20 152 20c-15.464 0-28 12.536-28 28 0 15.464 12.536 28 28 28ZM152 28c11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20C140.954 68 132 59.046 132 48c0-11.046 8.954-20 20-20ZM212 144c0 2.209-1.791 4-4 4-33.65 0-49.92-16.43-64.28-30.93-3.52-3.57-6.86-6.93-10.34-10-.66-.57-1.34-1.09-2-1.59l-16.86 38.77 39.84 28.45c1.051 .768 1.663 1.999 1.64 3.3v56c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-53.94L111.23 151.8 75.67 233.59c-.881 2.027-3.238 2.956-5.265 2.075-2.027-.881-2.956-3.238-2.075-5.265L124.26 101.78C94.56 91.23 51.26 131.42 50.74 131.87c-1.621 1.513-4.162 1.426-5.675-.195-1.513-1.621-1.426-4.162 .195-5.675 9.999-9.054 21.02-16.911 32.84-23.41 25.15-13.54 46.07-14.06 60.52-1.52 3.71 3.23 7.15 6.7 10.79 10.37C163.31 125.44 177.69 140 208 140c2.209 0 4 1.791 4 4Z"),
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
        return _personSimpleWalk!!
    }

private var _personSimpleWalk: ImageVector? = null
