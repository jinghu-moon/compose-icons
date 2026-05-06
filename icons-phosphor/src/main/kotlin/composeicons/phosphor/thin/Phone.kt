package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Phone: ImageVector
    get() {
        if (_phone != null) return _phone!!
        _phone = phosphorThinIcon(
            name = "Phone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220.78 162.13 173.56 141c-3.719-1.609-7.999-1.233-11.38 1-.133 .084-.26 .178-.38 .28L137 163.42c-1.121 .684-2.509 .762-3.7 .21C117.06 155.79 100.25 139.11 92.41 123.06c-.563-1.182-.496-2.568 .18-3.69L113.79 94.16c.1-.12 .19-.25 .28-.38 2.226-3.376 2.602-7.647 1-11.36L93.9 35.28C91.801 30.376 86.716 27.446 81.42 28.09 55.387 31.522 35.946 53.742 36 80c0 77.2 62.8 140 140 140 26.258 .054 48.478-19.387 51.91-45.42 .639-5.27-2.261-10.334-7.13-12.45ZM220 173.58c-2.921 22.048-21.76 38.497-44 38.42C103.22 212 44 152.78 44 80 43.923 57.76 60.372 38.921 82.42 36c.16-.01 .32-.01 .48 0 1.614 .014 3.061 .996 3.67 2.49l21.11 47.14c.5 1.168 .414 2.505-.23 3.6L86.26 114.43c-.1 .13-.2 .25-.29 .39-2.296 3.511-2.592 7.966-.78 11.75 8.69 17.79 26.61 35.58 44.6 44.27 3.81 1.8 8.285 1.47 11.79-.87l.37-.28 24.83-21.12c1.078-.658 2.406-.759 3.57-.27l47.21 21.16c1.636 .681 2.629 2.358 2.44 4.12Z"),
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
        return _phone!!
    }

private var _phone: ImageVector? = null
