package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CalendarDots: ImageVector
    get() {
        if (_calendarDots != null) return _calendarDots!!
        _calendarDots = phosphorBoldIcon(
            name = "CalendarDots",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 28.000 L 188.000 28.000 L 188.000 24.000 C 188.000 17.373 182.627 12.000 176.000 12.000 C 169.373 12.000 164.000 17.373 164.000 24.000 L 164.000 28.000 L 92.000 28.000 L 92.000 24.000 C 92.000 17.373 86.627 12.000 80.000 12.000 C 73.373 12.000 68.000 17.373 68.000 24.000 L 68.000 28.000 L 48.000 28.000 C 36.954 28.000 28.000 36.954 28.000 48.000 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 208.000 228.000 C 219.046 228.000 228.000 219.046 228.000 208.000 L 228.000 48.000 C 228.000 36.954 219.046 28.000 208.000 28.000 ZM 68.000 52.000 C 68.000 58.627 73.373 64.000 80.000 64.000 C 86.627 64.000 92.000 58.627 92.000 52.000 L 164.000 52.000 C 164.000 58.627 169.373 64.000 176.000 64.000 C 182.627 64.000 188.000 58.627 188.000 52.000 L 204.000 52.000 L 204.000 76.000 L 52.000 76.000 L 52.000 52.000 ZM 52.000 204.000 L 52.000 100.000 L 204.000 100.000 L 204.000 204.000 ZM 144.000 128.000 C 144.000 136.837 136.837 144.000 128.000 144.000 C 119.163 144.000 112.000 136.837 112.000 128.000 C 112.000 119.163 119.163 112.000 128.000 112.000 C 136.837 112.000 144.000 119.163 144.000 128.000 ZM 192.000 128.000 C 192.000 136.837 184.837 144.000 176.000 144.000 C 167.163 144.000 160.000 136.837 160.000 128.000 C 160.000 119.163 167.163 112.000 176.000 112.000 C 184.837 112.000 192.000 119.163 192.000 128.000 ZM 96.000 176.000 C 96.000 184.837 88.837 192.000 80.000 192.000 C 71.163 192.000 64.000 184.837 64.000 176.000 C 64.000 167.163 71.163 160.000 80.000 160.000 C 88.837 160.000 96.000 167.163 96.000 176.000 ZM 144.000 176.000 C 144.000 184.837 136.837 192.000 128.000 192.000 C 119.163 192.000 112.000 184.837 112.000 176.000 C 112.000 167.163 119.163 160.000 128.000 160.000 C 136.837 160.000 144.000 167.163 144.000 176.000 ZM 192.000 176.000 C 192.000 184.837 184.837 192.000 176.000 192.000 C 167.163 192.000 160.000 184.837 160.000 176.000 C 160.000 167.163 167.163 160.000 176.000 160.000 C 184.837 160.000 192.000 167.163 192.000 176.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _calendarDots!!
    }

private var _calendarDots: ImageVector? = null
