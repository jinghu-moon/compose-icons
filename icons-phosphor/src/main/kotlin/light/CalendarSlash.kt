package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CalendarSlash: ImageVector
    get() {
        if (_calendarSlash != null) return _calendarSlash!!
        _calendarSlash = phosphorLightIcon(
            name = "CalendarSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 52.440 36.000 C 51.309 34.736 49.696 34.009 48.000 34.000 C 40.268 34.000 34.000 40.268 34.000 48.000 L 34.000 208.000 C 34.000 215.732 40.268 222.000 48.000 222.000 L 208.000 222.000 C 210.360 221.987 212.494 220.592 213.452 218.435 C 214.410 216.278 214.014 213.759 212.440 212.000 ZM 46.260 47.000 L 78.070 82.000 L 46.000 82.000 L 46.000 48.000 C 46.000 47.650 46.090 47.306 46.260 47.000 ZM 48.000 210.000 C 46.895 210.000 46.000 209.105 46.000 208.000 L 46.000 94.000 L 89.000 94.000 L 194.440 210.000 ZM 222.000 48.000 L 222.000 177.230 C 222.000 180.544 219.314 183.230 216.000 183.230 C 212.686 183.230 210.000 180.544 210.000 177.230 L 210.000 94.000 L 134.880 94.000 C 131.566 94.000 128.880 91.314 128.880 88.000 C 128.880 84.686 131.566 82.000 134.880 82.000 L 210.000 82.000 L 210.000 48.000 C 210.000 46.895 209.105 46.000 208.000 46.000 L 182.000 46.000 L 182.000 56.000 C 182.000 59.314 179.314 62.000 176.000 62.000 C 172.686 62.000 170.000 59.314 170.000 56.000 L 170.000 46.000 L 91.250 46.000 C 87.936 46.000 85.250 43.314 85.250 40.000 C 85.250 36.686 87.936 34.000 91.250 34.000 L 170.000 34.000 L 170.000 24.000 C 170.000 20.686 172.686 18.000 176.000 18.000 C 179.314 18.000 182.000 20.686 182.000 24.000 L 182.000 34.000 L 208.000 34.000 C 215.732 34.000 222.000 40.268 222.000 48.000 Z"),
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
        return _calendarSlash!!
    }

private var _calendarSlash: ImageVector? = null
