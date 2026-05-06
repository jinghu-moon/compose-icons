package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.DeviceRotate: ImageVector
    get() {
        if (_deviceRotate != null) return _deviceRotate!!
        _deviceRotate = phosphorBoldIcon(
            name = "DeviceRotate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208.49 224.49l-24 24c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17L171 228h-91C64.536 228 52 215.464 52 200v-92c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v92c0 2.209 1.791 4 4 4h91l-3.52-3.51c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0l24 24c2.261 2.25 3.533 5.308 3.534 8.498 .002 3.19-1.266 6.249-3.524 8.502ZM80 76c4.856 .004 9.236-2.92 11.095-7.407 1.859-4.487 .83-9.651-2.605-13.083L85 52h91c2.209 0 4 1.791 4 4v92c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-92C204 40.536 191.464 28 176 28h-91l3.52-3.52c4.694-4.694 4.694-12.306 0-17-4.694-4.694-12.306-4.694-17 0L47.52 31.48c-2.259 2.252-3.529 5.31-3.529 8.5 0 3.19 1.27 6.248 3.529 8.5L71.52 72.48C73.768 74.731 76.818 75.997 80 76Z"),
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
        return _deviceRotate!!
    }

private var _deviceRotate: ImageVector? = null
