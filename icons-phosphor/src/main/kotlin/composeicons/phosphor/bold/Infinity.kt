package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Infinity: ImageVector
    get() {
        if (_infinity != null) return _infinity!!
        _infinity = phosphorBoldIcon(
            name = "Infinity",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M252 128c.003 24.27-14.616 46.151-37.038 55.44-22.422 9.288-48.232 4.153-65.392-13.01l-.49-.53L89.22 102.31C75.094 88.442 52.421 88.582 38.466 102.623c-13.954 14.041-13.954 36.714 0 50.755 13.954 14.041 36.627 14.18 50.754 .313l3.08-3.48c4.393-4.971 11.984-5.438 16.955-1.045 4.971 4.393 5.438 11.984 1.045 16.955l-3.35 3.78-.49 .53c-23.433 23.429-61.421 23.426-84.85-.005-23.43-23.431-23.43-61.419 0-84.85C45.039 62.144 83.027 62.141 106.46 85.57l.49 .53 59.86 67.59c14.126 13.868 36.799 13.728 50.754-.313 13.954-14.041 13.954-36.714 0-50.755C203.609 88.582 180.936 88.442 166.81 102.31l-3.08 3.48c-4.393 4.971-11.984 5.438-16.955 1.045-4.971-4.393-5.438-11.984-1.045-16.955l3.35-3.78 .49-.53C166.73 68.407 192.54 63.272 214.962 72.56 237.384 81.849 252.003 103.73 252 128Z"),
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
        return _infinity!!
    }

private var _infinity: ImageVector? = null
