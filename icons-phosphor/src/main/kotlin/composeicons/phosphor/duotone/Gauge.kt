package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Gauge: ImageVector
    get() {
        if (_gauge != null) return _gauge!!
        _gauge = phosphorDuotoneIcon(
            name = "Gauge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 152v24c0 4.418-3.582 8-8 8h-192c-4.418 0-8-3.582-8-8v-22.87C24 95.65 70.15 48.2 127.63 48c27.647-.098 54.195 10.815 73.778 30.33C220.992 97.844 232 124.353 232 152Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M207.06 72.67C186.115 51.677 157.654 39.917 128 40h-.4C66.07 40.21 16 91 16 153.13v22.87c0 8.837 7.163 16 16 16h192c8.837 0 16-7.163 16-16v-24c.083-29.787-11.783-58.363-32.94-79.33ZM224 176h-104.29l54.76-75.3c2.601-3.573 1.813-8.579-1.76-11.18-3.573-2.601-8.579-1.813-11.18 1.76L99.92 176h-67.92v-22.87c0-3.08 .15-6.12 .43-9.13h23.57c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-20.73C45.59 89.14 79.27 59.76 120 56.34v23.66c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-23.67c40.675 3.423 74.754 32.158 85 71.67h-21c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h23.67c.21 2.65 .33 5.31 .33 8Z"),
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
        return _gauge!!
    }

private var _gauge: ImageVector? = null
