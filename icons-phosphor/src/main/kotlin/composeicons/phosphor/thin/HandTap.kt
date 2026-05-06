package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HandTap: ImageVector
    get() {
        if (_handTap != null) return _handTap!!
        _handTap = phosphorThinIcon(
            name = "HandTap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M60 76C60 45.072 85.072 20 116 20c30.928 0 56 25.072 56 56 0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4C164 49.49 142.51 28 116 28 89.49 28 68 49.49 68 76c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4ZM196 124c-5.94-.007-11.67 2.2-16.07 6.19-.696-9.107-6.501-17.03-14.975-20.438-8.474-3.408-18.148-1.711-24.955 4.378v-38.13C140 62.745 129.255 52 116 52 102.745 52 92 62.745 92 76v94L80.74 151.94C73.945 140.809 59.505 137.141 48.222 143.68 36.939 150.218 32.941 164.57 39.22 176l29.32 50c1.185 1.719 3.493 2.238 5.3 1.19 1.806-1.047 2.503-3.308 1.6-5.19L46.13 172c-4.418-7.655-1.795-17.442 5.86-21.86 7.655-4.418 17.442-1.795 21.86 5.86l.07 .12 18.68 30c.943 1.521 2.781 2.231 4.502 1.738 1.72-.493 2.904-2.069 2.898-3.858v-108c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16v68c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-12c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16v20c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-4c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16v36c0 22.66-7.51 38.06-7.58 38.21-.475 .949-.554 2.049-.218 3.056 .336 1.007 1.058 1.84 2.008 2.314 .557 .275 1.169 .419 1.79 .42 1.516 .001 2.902-.855 3.58-2.21C211.92 225.1 220 208.66 220 184v-36c0-13.255-10.745-24-24-24Z"),
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
        return _handTap!!
    }

private var _handTap: ImageVector? = null
