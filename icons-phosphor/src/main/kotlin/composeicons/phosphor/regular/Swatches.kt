package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Swatches: ImageVector
    get() {
        if (_swatches != null) return _swatches!!
        _swatches = phosphorRegularIcon(
            name = "Swatches",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M88 180c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM240 156.19v51.81c0 8.837-7.163 16-16 16h-148c-2.661 .002-5.318-.226-7.94-.68C44.245 218.975 28.413 196.208 32.63 172.37l25-143.13c.718-4.177 3.069-7.896 6.535-10.336 3.466-2.439 7.761-3.398 11.935-2.664L130.84 26c8.671 1.563 14.447 9.842 12.92 18.52l-12.08 69L199.49 89c8.275-2.989 17.41 1.264 20.45 9.52L239 150.69c.612 1.771 .95 3.626 1 5.5ZM103 184.87 128 41.74 73.46 32l-25 143.1c-2.717 15.152 7.306 29.655 22.44 32.47 7.189 1.289 14.594-.357 20.56-4.57 6.118-4.255 10.275-10.786 11.54-18.13ZM116.78 195 224 156.11 204.92 104l-76.42 27.7-9.78 55.92c-.435 2.511-1.084 4.98-1.94 7.38ZM224 173.12 127.74 208h96.26Z"),
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
        return _swatches!!
    }

private var _swatches: ImageVector? = null
