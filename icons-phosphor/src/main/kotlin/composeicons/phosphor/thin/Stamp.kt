package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Stamp: ImageVector
    get() {
        if (_stamp != null) return _stamp!!
        _stamp = phosphorThinIcon(
            name = "Stamp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220 224c0 2.209-1.791 4-4 4h-176c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h176c2.209 0 4 1.791 4 4ZM220 144v40c0 6.627-5.373 12-12 12h-160c-6.627 0-12-5.373-12-12v-40c0-6.627 5.373-12 12-12h61.37L92.63 53.87c-1.773-8.267 .285-16.892 5.6-23.469C103.544 23.825 111.545 20.002 120 20h16c8.457-.001 16.461 3.821 21.777 10.397 5.316 6.577 7.376 15.204 5.603 23.473L146.63 132h61.37c6.627 0 12 5.373 12 12ZM117.55 132h20.9L155.55 52.19c1.265-5.905-.205-12.065-4.001-16.761C147.753 30.732 142.039 28.002 136 28h-16c-6.04-.001-11.758 2.728-15.556 7.425-3.798 4.697-5.27 10.859-4.004 16.765ZM212 144c0-2.209-1.791-4-4-4h-160c-2.209 0-4 1.791-4 4v40c0 2.209 1.791 4 4 4h160c2.209 0 4-1.791 4-4Z"),
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
        return _stamp!!
    }

private var _stamp: ImageVector? = null
