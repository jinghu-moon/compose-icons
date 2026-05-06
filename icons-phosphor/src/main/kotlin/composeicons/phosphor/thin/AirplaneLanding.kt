package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AirplaneLanding: ImageVector
    get() {
        if (_airplaneLanding != null) return _airplaneLanding!!
        _airplaneLanding = phosphorThinIcon(
            name = "AirplaneLanding",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M252 216c0 2.209-1.791 4-4 4h-144c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h144c2.209 0 4 1.791 4 4ZM230.92 187.85 54.29 138.4C38.768 134.01 28.039 119.861 28 103.73v-55.73c.005-3.854 1.861-7.47 4.988-9.722 3.127-2.252 7.146-2.865 10.802-1.648l5.48 1.82c1.159 .39 2.077 1.289 2.49 2.44L63.07 72.18 100 82.71v-34.71c.002-3.855 1.856-7.475 4.984-9.729 3.128-2.254 7.148-2.868 10.806-1.651l5.48 1.82c1.093 .366 1.975 1.186 2.42 2.25l23.25 55.42 62.7 17.52c15.564 4.361 26.333 18.536 26.36 34.7v35.67c-0 1.251-.587 2.431-1.584 3.186-.997 .756-2.291 1.001-3.496 .664ZM228 148.33c-.015-12.579-8.396-23.612-20.51-27l-64.57-18c-1.177-.331-2.139-1.182-2.61-2.31L117 45.47l-3.75-1.25c-1.215-.4-2.549-.194-3.587 .554-1.038 .748-1.656 1.947-1.663 3.226v40c.001 1.256-.587 2.44-1.59 3.197-1.003 .757-2.302 .999-3.51 .653l-44-12.54c-1.235-.355-2.225-1.281-2.66-2.49L44.9 45.43 41.26 44.22c-1.218-.414-2.561-.209-3.6 .55C36.622 45.519 36.005 46.72 36 48v55.72c.017 12.559 8.366 23.581 20.45 27l171.55 48Z"),
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
        return _airplaneLanding!!
    }

private var _airplaneLanding: ImageVector? = null
