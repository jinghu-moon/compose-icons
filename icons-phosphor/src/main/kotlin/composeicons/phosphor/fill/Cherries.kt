package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Cherries: ImageVector
    get() {
        if (_cherries != null) return _cherries!!
        _cherries = phosphorFillIcon(
            name = "Cherries",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M178.42 72c-3.408-.108-6.819 .015-10.21 .37C162.591 62.769 155.276 54.268 146.62 47.28 108.78 16.79 57.05 23.77 54.87 24.08c-3.737 .523-6.6 3.586-6.87 7.35-.167 2.924 1.24 5.715 3.69 7.32C69.09 50.43 77.06 69.66 80.39 88.4 42.371 92.385 14.075 125.356 15.906 163.539c1.831 38.183 33.151 68.296 71.377 68.625 38.225 .329 70.06-29.24 72.548-67.386C162.318 126.633 134.594 93.179 96.65 88.54 93.54 68.59 86.56 52 76 39.37c16.67 .72 41.24 4.78 60.64 20.48 5.788 4.686 10.844 10.21 15 16.39-1.9 .69-3.79 1.44-5.65 2.29-2.052 .886-3.667 2.552-4.49 4.63-1.207 3.207-.238 6.826 2.41 9 5.03 4.154 9.587 8.849 13.59 14 .188 .243 .407 .462 .65 .65C160 108.15 165.83 112 176 112c12.15 0 18.18-5.51 18.43-5.75l-.09 .09c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32C204.6 118.72 194.77 128 176 128h-1.61c-1.004-.058-1.97 .391-2.573 1.195-.603 .804-.764 1.858-.427 2.805 7.986 23.773 5.439 49.824-7 71.6-1.134 1.87-1.493 4.109-1 6.24 .85 3.33 3.732 5.746 7.16 6 1.78 .13 3.59 .2 5.37 .2 39.765 .668 72.542-31.025 73.21-70.79 .668-39.765-31.025-72.542-70.79-73.21ZM106.42 122.21l-.09 .09c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32C116.6 134.72 106.77 144 88 144 69.23 144 59.4 134.72 58.34 133.66c-3.126-3.126-3.126-8.194 0-11.32 3.126-3.126 8.194-3.126 11.32 0l-.09-.09c.25 .24 6.28 5.75 18.43 5.75 12.15 0 18.18-5.51 18.43-5.75Z"),
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
        return _cherries!!
    }

private var _cherries: ImageVector? = null
