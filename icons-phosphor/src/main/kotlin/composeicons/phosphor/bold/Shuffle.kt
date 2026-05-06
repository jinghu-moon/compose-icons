package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Shuffle: ImageVector
    get() {
        if (_shuffle != null) return _shuffle!!
        _shuffle = phosphorBoldIcon(
            name = "Shuffle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240.49 175.51c2.259 2.252 3.529 5.31 3.529 8.5 0 3.19-1.27 6.248-3.529 8.5l-24 24c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17L203 196h-2.09c-24.54-.027-47.565-11.876-61.85-31.83L97.38 105.78C87.608 92.124 71.852 84.016 55.06 84h-23.06C25.373 84 20 78.627 20 72 20 65.373 25.373 60 32 60h23.06c24.54 .027 47.565 11.876 61.85 31.83l41.71 58.39c9.772 13.656 25.528 21.764 42.32 21.78h2.06l-3.52-3.51c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0ZM144.87 102.89c4.988 4.362 12.566 3.856 16.93-1.13C171.675 90.473 185.943 83.999 200.94 84h2.06l-3.52 3.51c-4.694 4.694-4.694 12.306 0 17 4.694 4.694 12.306 4.694 17 0l24-24c2.259-2.252 3.529-5.31 3.529-8.5 0-3.19-1.27-6.248-3.529-8.5l-24-24c-4.694-4.694-12.306-4.694-17 0-4.694 4.694-4.694 12.306 0 17L203 60h-2.09c-21.924 .01-42.776 9.489-57.2 26-4.327 4.99-3.809 12.539 1.16 16.89ZM111.13 153.11c-4.988-4.362-12.566-3.856-16.93 1.13C84.325 165.527 70.057 172.001 55.06 172h-23.06c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h23.06c21.924-.01 42.776-9.489 57.2-26 4.335-4.982 3.83-12.53-1.13-16.89Z"),
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
        return _shuffle!!
    }

private var _shuffle: ImageVector? = null
