package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PhoneX: ImageVector
    get() {
        if (_phoneX != null) return _phoneX!!
        _phoneX = phosphorBoldIcon(
            name = "PhoneX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M143.52 95.51 159 80 143.52 64.48c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0L176 63 191.52 47.48c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17L193 80l15.52 15.51c4.694 4.694 4.694 12.306 0 17-4.694 4.694-12.306 4.694-17 0L176 97l-15.51 15.51c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17ZM227.85 183.58C223.905 213.609 198.287 236.047 168 236 86.39 236 20 169.61 20 88 19.953 57.713 42.391 32.095 72.42 28.15 81.202 27.086 89.644 31.9 93.2 40l21.11 47.13c.022 .062 .049 .122 .08 .18 2.635 6.159 2.012 13.227-1.66 18.83-.26 .4-.544 .784-.85 1.15L92.82 130c7.06 12.84 20.5 26.16 33.49 33.21l22.31-19c.358-.3 .732-.58 1.12-.84 5.625-3.772 12.78-4.431 19-1.75l.18 .08L216 162.8c8.1 3.556 12.914 11.998 11.85 20.78ZM203.54 183.52l-42-18.81-22.43 19.07c-.353 .305-.723 .589-1.11 .85-5.865 3.889-13.343 4.409-19.69 1.37C98.83 176.6 79.42 157.32 70 138c-3.047-6.318-2.561-13.771 1.28-19.64 .263-.404 .55-.791 .86-1.16L91.3 94.49 72.48 52.49C55.82 56.161 43.967 70.941 44 88c.083 68.449 55.551 123.917 124 124 17.071 .047 31.866-11.809 35.54-28.48Z"),
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
        return _phoneX!!
    }

private var _phoneX: ImageVector? = null
