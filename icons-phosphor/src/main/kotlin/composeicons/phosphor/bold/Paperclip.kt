package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Paperclip: ImageVector
    get() {
        if (_paperclip != null) return _paperclip!!
        _paperclip = phosphorBoldIcon(
            name = "Paperclip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212.48 136.49l-82.06 82c-23.439 23.431-61.434 23.424-84.865-.015C22.124 195.036 22.131 157.041 45.57 133.61L143.73 35.72c15.627-15.619 40.956-15.612 56.575 .015 15.619 15.627 15.612 40.956-.015 56.575l-.17 .16-95.8 92.22c-4.777 4.595-12.375 4.447-16.97-.33-4.595-4.777-4.447-12.375 .33-16.97L183.39 75.27c6.23-6.268 6.198-16.4-.07-22.63-6.268-6.23-16.4-6.198-22.63 .07L62.53 150.57c-14.058 14.064-14.054 36.862 .01 50.92 14.064 14.058 36.862 14.054 50.92-.01l82.06-82c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17Z"),
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
        return _paperclip!!
    }

private var _paperclip: ImageVector? = null
