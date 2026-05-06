package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Strategy: ImageVector
    get() {
        if (_strategy != null) return _strategy!!
        _strategy = phosphorBoldIcon(
            name = "Strategy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M80 144c-22.091 0-40 17.909-40 40 0 22.091 17.909 40 40 40 22.091 0 40-17.909 40-40 0-22.091-17.909-40-40-40ZM80 200c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16ZM48 128c-4.856 .004-9.236-2.92-11.095-7.407-1.859-4.487-.83-9.651 2.605-13.083L51 96 39.51 84.49c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0L68 79 79.51 67.51c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17L85 96l11.52 11.51c4.694 4.694 4.694 12.306 0 17-4.694 4.694-12.306 4.694-17 0L68 113 56.49 124.49C54.238 126.74 51.184 128.003 48 128ZM232.49 203.51c4.694 4.694 4.694 12.306 0 17-4.694 4.694-12.306 4.694-17 0L204 209l-11.51 11.52c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17L187 192 175.48 180.49c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0L204 175l11.51-11.52c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17L221 192ZM189.09 110.89c-5.21 23-23.33 43.53-45.09 51.22-6.249 2.209-13.106-1.066-15.315-7.315-2.209-6.249 1.066-13.106 7.315-15.315 14.07-5 26.27-18.91 29.67-33.9 2.37-10.46 .4-20.84-5.68-30.54v9c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-40.04c0-6.627 5.373-12 12-12h40c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-11.99c12.77 16.61 17.42 35.76 13.09 54.89Z"),
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
        return _strategy!!
    }

private var _strategy: ImageVector? = null
