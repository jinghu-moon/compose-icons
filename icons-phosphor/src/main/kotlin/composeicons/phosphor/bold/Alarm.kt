package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Alarm: ImageVector
    get() {
        if (_alarm != null) return _alarm!!
        _alarm = phosphorBoldIcon(
            name = "Alarm",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 36C72.772 36 28 80.772 28 136c0 55.228 44.772 100 100 100 55.228 0 100-44.772 100-100C227.939 80.797 183.203 36.061 128 36ZM128 212C86.026 212 52 177.974 52 136 52 94.026 86.026 60 128 60c41.974 0 76 34.026 76 76-.044 41.955-34.045 75.956-76 76ZM32.49 72.49c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17L47.49 23.49c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17ZM240.49 72.49c-2.252 2.259-5.31 3.529-8.5 3.529-3.19 0-6.248-1.27-8.5-3.529l-32-32c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0l32 32c2.259 2.252 3.529 5.31 3.529 8.5 0 3.19-1.27 6.248-3.529 8.5ZM176 124c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-48c-6.627 0-12-5.373-12-12v-48c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v36Z"),
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
        return _alarm!!
    }

private var _alarm: ImageVector? = null
