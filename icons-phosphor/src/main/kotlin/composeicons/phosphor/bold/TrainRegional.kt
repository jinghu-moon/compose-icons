package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TrainRegional: ImageVector
    get() {
        if (_trainRegional != null) return _trainRegional!!
        _trainRegional = phosphorBoldIcon(
            name = "TrainRegional",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M227.58 116.84 205.18 34.74C202.808 26.04 194.908 20.003 185.89 20h-115.78c-9.018 .003-16.918 6.04-19.29 14.74L28.42 116.84c-.56 2.069-.56 4.251 0 6.32l22.4 82.1c2.372 8.7 10.272 14.737 19.29 14.74h1.89l-9.6 12.8c-3.976 5.302-2.902 12.824 2.4 16.8 5.302 3.976 12.824 2.902 16.8-2.4L102 220h52l20.4 27.2c3.976 5.302 11.498 6.376 16.8 2.4 5.302-3.976 6.376-11.498 2.4-16.8L184 220h1.89c9.018-.003 16.918-6.04 19.29-14.74l22.4-82.1c.56-2.069 .56-4.251 0-6.32ZM73.17 44h109.66L201 110.53l-73 13.27L55 110.53ZM56.59 135.21 116 146v50h-42.83ZM182.83 196h-42.83v-50l59.41-10.8ZM84 88C84 81.373 89.373 76 96 76h64c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-64C89.373 100 84 94.627 84 88Z"),
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
        return _trainRegional!!
    }

private var _trainRegional: ImageVector? = null
