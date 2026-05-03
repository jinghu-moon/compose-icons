package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CalendarDot: ImageVector
    get() {
        if (_calendarDot != null) return _calendarDot!!
        _calendarDot = phosphorLightIcon(
            name = "CalendarDot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 34.000 L 182.000 34.000 L 182.000 24.000 C 182.000 20.686 179.314 18.000 176.000 18.000 C 172.686 18.000 170.000 20.686 170.000 24.000 L 170.000 34.000 L 86.000 34.000 L 86.000 24.000 C 86.000 20.686 83.314 18.000 80.000 18.000 C 76.686 18.000 74.000 20.686 74.000 24.000 L 74.000 34.000 L 48.000 34.000 C 40.268 34.000 34.000 40.268 34.000 48.000 L 34.000 208.000 C 34.000 215.732 40.268 222.000 48.000 222.000 L 208.000 222.000 C 215.732 222.000 222.000 215.732 222.000 208.000 L 222.000 48.000 C 222.000 40.268 215.732 34.000 208.000 34.000 ZM 48.000 46.000 L 74.000 46.000 L 74.000 56.000 C 74.000 59.314 76.686 62.000 80.000 62.000 C 83.314 62.000 86.000 59.314 86.000 56.000 L 86.000 46.000 L 170.000 46.000 L 170.000 56.000 C 170.000 59.314 172.686 62.000 176.000 62.000 C 179.314 62.000 182.000 59.314 182.000 56.000 L 182.000 46.000 L 208.000 46.000 C 209.105 46.000 210.000 46.895 210.000 48.000 L 210.000 82.000 L 46.000 82.000 L 46.000 48.000 C 46.000 46.895 46.895 46.000 48.000 46.000 ZM 208.000 210.000 L 48.000 210.000 C 46.895 210.000 46.000 209.105 46.000 208.000 L 46.000 94.000 L 210.000 94.000 L 210.000 208.000 C 210.000 209.105 209.105 210.000 208.000 210.000 ZM 142.000 152.000 C 142.000 159.732 135.732 166.000 128.000 166.000 C 120.268 166.000 114.000 159.732 114.000 152.000 C 114.000 144.268 120.268 138.000 128.000 138.000 C 135.732 138.000 142.000 144.268 142.000 152.000 Z"),
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
        return _calendarDot!!
    }

private var _calendarDot: ImageVector? = null
