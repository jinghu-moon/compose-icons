package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CalendarDots: ImageVector
    get() {
        if (_calendarDots != null) return _calendarDots!!
        _calendarDots = phosphorRegularIcon(
            name = "CalendarDots",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 32.000 L 184.000 32.000 L 184.000 24.000 C 184.000 19.582 180.418 16.000 176.000 16.000 C 171.582 16.000 168.000 19.582 168.000 24.000 L 168.000 32.000 L 88.000 32.000 L 88.000 24.000 C 88.000 19.582 84.418 16.000 80.000 16.000 C 75.582 16.000 72.000 19.582 72.000 24.000 L 72.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 72.000 48.000 L 72.000 56.000 C 72.000 60.418 75.582 64.000 80.000 64.000 C 84.418 64.000 88.000 60.418 88.000 56.000 L 88.000 48.000 L 168.000 48.000 L 168.000 56.000 C 168.000 60.418 171.582 64.000 176.000 64.000 C 180.418 64.000 184.000 60.418 184.000 56.000 L 184.000 48.000 L 208.000 48.000 L 208.000 80.000 L 48.000 80.000 L 48.000 48.000 ZM 208.000 208.000 L 48.000 208.000 L 48.000 96.000 L 208.000 96.000 L 208.000 208.000 ZM 140.000 132.000 C 140.000 138.627 134.627 144.000 128.000 144.000 C 121.373 144.000 116.000 138.627 116.000 132.000 C 116.000 125.373 121.373 120.000 128.000 120.000 C 134.627 120.000 140.000 125.373 140.000 132.000 ZM 184.000 132.000 C 184.000 138.627 178.627 144.000 172.000 144.000 C 165.373 144.000 160.000 138.627 160.000 132.000 C 160.000 125.373 165.373 120.000 172.000 120.000 C 178.627 120.000 184.000 125.373 184.000 132.000 ZM 96.000 172.000 C 96.000 178.627 90.627 184.000 84.000 184.000 C 77.373 184.000 72.000 178.627 72.000 172.000 C 72.000 165.373 77.373 160.000 84.000 160.000 C 90.627 160.000 96.000 165.373 96.000 172.000 ZM 140.000 172.000 C 140.000 178.627 134.627 184.000 128.000 184.000 C 121.373 184.000 116.000 178.627 116.000 172.000 C 116.000 165.373 121.373 160.000 128.000 160.000 C 134.627 160.000 140.000 165.373 140.000 172.000 ZM 184.000 172.000 C 184.000 178.627 178.627 184.000 172.000 184.000 C 165.373 184.000 160.000 178.627 160.000 172.000 C 160.000 165.373 165.373 160.000 172.000 160.000 C 178.627 160.000 184.000 165.373 184.000 172.000 Z"),
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
