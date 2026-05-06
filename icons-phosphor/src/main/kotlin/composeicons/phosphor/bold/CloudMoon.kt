package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CloudMoon: ImageVector
    get() {
        if (_cloudMoon != null) return _cloudMoon!!
        _cloudMoon = phosphorBoldIcon(
            name = "CloudMoon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M172 68c-1.66 0-3.31 .06-4.95 .16C162.242 37.517 139.279 12.88 109.05 5.93c-4.026-.92-8.242 .295-11.162 3.216-2.919 2.921-4.131 7.138-3.208 11.164C98.689 37.781 93.426 56.084 80.75 68.758 68.075 81.432 49.77 86.691 32.3 82.68c-4.028-.921-8.247 .294-11.167 3.218-2.92 2.924-4.13 7.145-3.203 11.172 4.032 17.211 13.893 32.499 27.91 43.27-11.746 17.137-13.039 39.369-3.359 57.752C52.162 216.475 71.224 227.988 92 228h80c44.183 0 80-35.817 80-80C252 103.817 216.183 68 172 68ZM119.89 36c13.05 8.231 21.736 21.865 23.68 37.17-20.262 7.704-36.554 23.264-45.18 43.15C96.268 116.093 94.134 115.986 92 116c-9.924-.008-19.671 2.637-28.23 7.66C57.499 119.573 52.171 114.197 48.14 107.89 86.887 105.723 117.799 74.751 119.89 36ZM172 204h-80C74.327 204 60 189.673 60 172c0-17.673 14.327-32 32-32h.28c-.11 1.1-.2 2.2-.26 3.3-.387 6.627 4.673 12.313 11.3 12.7 6.627 .387 12.313-4.673 12.7-11.3 .212-3.716 .795-7.401 1.74-11l.15-.55c7.658-28 35.424-45.522 63.994-40.385 28.57 5.137 48.493 31.233 45.919 60.147C225.249 181.826 201.028 203.992 172 204Z"),
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
        return _cloudMoon!!
    }

private var _cloudMoon: ImageVector? = null
