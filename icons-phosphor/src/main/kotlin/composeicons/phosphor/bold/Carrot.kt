package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Carrot: ImageVector
    get() {
        if (_carrot != null) return _carrot!!
        _carrot = phosphorBoldIcon(
            name = "Carrot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 60h-19L232.51 40.49c4.694-4.694 4.694-12.306 0-17-4.694-4.694-12.306-4.694-17 0L196 43v-19c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v26C146.245 38.386 115.992 43.908 96 63.87h0 0 0C55.45 103.68 25.18 197 21.78 207.77c-2.794 6.188-2.258 13.371 1.424 19.076 3.682 5.705 10.006 9.152 16.796 9.154 2.842-.005 5.65-.611 8.24-1.78 7.64-2.42 56.79-18.34 98.91-41.82l.54-.3c17.1-9.57 33-20.39 44.44-32C212.136 140.09 217.66 109.782 206 84h26c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM175.11 143.12l-.09 .09c-8.11 8.28-19.11 16.2-31.33 23.52L120.48 143.52c-4.694-4.694-12.306-4.694-17 0-4.694 4.694-4.694 12.306 0 17l18.22 18.22C91.41 193.91 59.57 205.16 46.44 209.56 53.21 189.34 76.23 124.76 104.78 89.82l30.7 30.7c4.694 4.694 12.306 4.694 17 0 4.694-4.694 4.694-12.306 0-17L122.54 73.58c19.178-10.733 43.335-5.67 56.588 11.862 13.253 17.532 11.538 42.154-4.018 57.678Z"),
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
        return _carrot!!
    }

private var _carrot: ImageVector? = null
