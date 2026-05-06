package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Scissors: ImageVector
    get() {
        if (_scissors != null) return _scissors!!
        _scissors = phosphorBoldIcon(
            name = "Scissors",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M238.78 183.79 98.28 87.65C99.422 83.872 100.002 79.947 100 76 100.002 57.365 87.136 41.197 68.976 37.015 50.816 32.833 32.174 41.746 24.026 58.506c-8.148 16.76-3.643 36.925 10.862 48.624 14.505 11.699 35.168 11.832 49.822 .32l30 20.56-30 20.56C67.826 135.305 43.481 137.736 29.554 154.078c-13.927 16.342-12.468 40.765 3.307 55.332 15.774 14.567 40.236 14.082 55.419-1.1h0C95.815 200.82 100.036 190.624 100 180c.003-3.95-.577-7.879-1.72-11.66L136 142.54l89.22 61.06c5.47 3.744 12.941 2.345 16.685-3.125 3.744-5.47 2.345-12.941-3.125-16.685ZM71.31 191.33h0c-5.398 5.395-13.855 6.226-20.2 1.986-6.345-4.24-8.813-12.371-5.894-19.423 2.919-7.051 10.411-11.06 17.897-9.575C70.599 165.803 75.994 172.368 76 180c.003 4.25-1.684 8.326-4.69 11.33ZM48.69 87.3C44.112 82.725 42.741 75.842 45.217 69.862 47.693 63.882 53.528 59.983 60 59.983c6.472 0 12.307 3.899 14.783 9.879 2.476 5.98 1.105 12.863-3.473 17.438h0c-6.248 6.243-16.372 6.243-22.62 0ZM161.51 110.54c-1.797-2.627-2.477-5.86-1.89-8.988 .587-3.128 2.393-5.895 5.02-7.692L225.22 52.4c5.47-3.744 12.941-2.345 16.685 3.125 3.744 5.47 2.345 12.941-3.125 16.685l-60.59 41.46c-2.627 1.797-5.86 2.477-8.988 1.89-3.128-.587-5.895-2.393-7.692-5.02Z"),
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
        return _scissors!!
    }

private var _scissors: ImageVector? = null
