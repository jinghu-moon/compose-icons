package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Notches: ImageVector
    get() {
        if (_notches != null) return _notches!!
        _notches = phosphorBoldIcon(
            name = "Notches",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216.49 136.49l-80 80c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17l80-80c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17ZM200.49 31.49c-2.252-2.259-5.31-3.529-8.5-3.529-3.19 0-6.248 1.27-8.5 3.529L31.49 183.49c-4.694 4.694-4.694 12.306 0 17 4.694 4.694 12.306 4.694 17 0L200.49 48.49c2.253-2.251 3.519-5.305 3.519-8.49 0-3.185-1.266-6.239-3.519-8.49Z"),
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
        return _notches!!
    }

private var _notches: ImageVector? = null
