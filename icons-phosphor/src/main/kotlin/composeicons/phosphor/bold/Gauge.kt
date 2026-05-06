package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Gauge: ImageVector
    get() {
        if (_gauge != null) return _gauge!!
        _gauge = phosphorBoldIcon(
            name = "Gauge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M209.88 69.83C188.188 48.089 158.712 35.91 128 36h-.41C63.85 36.22 12 88.76 12 153.13v22.87c0 11.046 8.954 20 20 20h192c11.046 0 20-8.954 20-20v-24c.084-30.853-12.206-60.451-34.12-82.17ZM220 172h-92.68l46.44-65c3.866-5.39 2.63-12.894-2.76-16.76C165.61 86.374 158.106 87.61 154.24 93L97.82 172h-61.82v-18.87c0-1.72 0-3.43 .14-5.13h19.86c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-15.38C51.53 90.61 80.62 65.48 116 60.79v19.21c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-19.2c35.331 4.636 64.808 29.258 75.66 63.2h-15.66c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h19.9c.06 1.33 .1 2.66 .1 4Z"),
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
