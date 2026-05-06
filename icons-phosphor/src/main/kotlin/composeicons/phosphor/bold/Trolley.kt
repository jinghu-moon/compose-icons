package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Trolley: ImageVector
    get() {
        if (_trolley != null) return _trolley!!
        _trolley = phosphorBoldIcon(
            name = "Trolley",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M92 224c0 11.046-8.954 20-20 20C60.954 244 52 235.046 52 224c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20ZM216 204c-11.046 0-20 8.954-20 20 0 11.046 8.954 20 20 20 11.046 0 20-8.954 20-20 0-11.046-8.954-20-20-20ZM240 168h-180v-92.69C60.014 70.003 57.904 64.911 54.14 61.17L32.49 39.51c-4.694-4.694-12.306-4.694-17 0-4.694 4.694-4.694 12.306 0 17L36 77v91h-4c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h208c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12Z"),
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
        return _trolley!!
    }

private var _trolley: ImageVector? = null
