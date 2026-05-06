package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ApproximateEquals: ImageVector
    get() {
        if (_approximateEquals != null) return _approximateEquals!!
        _approximateEquals = phosphorBoldIcon(
            name = "ApproximateEquals",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M225.24 150.73c2.032 2.45 3.007 5.608 2.711 8.777-.296 3.17-1.84 6.091-4.291 8.123C205.49 182.7 189.06 188 174.15 188c-19.76 0-36.86-9.29-51.88-17.44C97.21 156.94 77.41 146.19 47.66 170.86c-5.103 4.23-12.669 3.523-16.9-1.58-4.231-5.103-3.523-12.669 1.58-16.9 42.25-35 75-17.23 101.39-2.92 25.06 13.61 44.86 24.37 74.61-.31 2.45-2.032 5.608-3.007 8.777-2.711 3.17 .296 6.091 1.84 8.123 4.291ZM47.66 106.85c29.75-24.68 49.55-13.92 74.61-.31 15 8.16 32.12 17.45 51.88 17.45 14.91 0 31.34-5.3 49.51-20.37 5.103-4.231 5.811-11.797 1.58-16.9-4.23-5.103-11.797-5.811-16.9-1.58-29.75 24.67-49.55 13.92-74.61 .3C107.38 71.14 74.59 53.33 32.34 88.37c-5.103 4.23-5.811 11.797-1.58 16.9 4.231 5.103 11.797 5.811 16.9 1.58Z"),
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
        return _approximateEquals!!
    }

private var _approximateEquals: ImageVector? = null
