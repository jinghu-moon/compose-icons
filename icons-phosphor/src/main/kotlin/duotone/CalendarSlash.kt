package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CalendarSlash: ImageVector
    get() {
        if (_calendarSlash != null) return _calendarSlash!!
        _calendarSlash = phosphorDuotoneIcon(
            name = "CalendarSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 216.000 48.000 L 216.000 88.000 L 40.000 88.000 L 40.000 48.000 C 40.000 43.582 43.582 40.000 48.000 40.000 L 208.000 40.000 C 212.418 40.000 216.000 43.582 216.000 48.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 53.920 34.620 C 52.404 32.952 50.254 32.000 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 211.166 224.000 214.034 222.132 215.315 219.237 C 216.596 216.342 216.049 212.963 213.920 210.620 ZM 73.550 80.000 L 48.000 80.000 L 48.000 51.880 ZM 48.000 208.000 L 48.000 96.000 L 88.100 96.000 L 189.920 208.000 ZM 224.000 48.000 L 224.000 177.230 C 224.000 181.648 220.418 185.230 216.000 185.230 C 211.582 185.230 208.000 181.648 208.000 177.230 L 208.000 96.000 L 134.880 96.000 C 130.462 96.000 126.880 92.418 126.880 88.000 C 126.880 83.582 130.462 80.000 134.880 80.000 L 208.000 80.000 L 208.000 48.000 L 184.000 48.000 L 184.000 56.000 C 184.000 60.418 180.418 64.000 176.000 64.000 C 171.582 64.000 168.000 60.418 168.000 56.000 L 168.000 48.000 L 91.250 48.000 C 86.832 48.000 83.250 44.418 83.250 40.000 C 83.250 35.582 86.832 32.000 91.250 32.000 L 168.000 32.000 L 168.000 24.000 C 168.000 19.582 171.582 16.000 176.000 16.000 C 180.418 16.000 184.000 19.582 184.000 24.000 L 184.000 32.000 L 208.000 32.000 C 216.837 32.000 224.000 39.163 224.000 48.000 Z"),
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
        return _calendarSlash!!
    }

private var _calendarSlash: ImageVector? = null
