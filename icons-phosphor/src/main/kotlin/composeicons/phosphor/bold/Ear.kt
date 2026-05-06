package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Ear: ImageVector
    get() {
        if (_ear != null) return _ear!!
        _ear = phosphorBoldIcon(
            name = "Ear",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220 104c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12C196 66.445 165.555 36 128 36 90.445 36 60 66.445 60 104c0 25 7.58 32.3 16.35 40.76C85.12 153.22 96 163.71 96 188c0 17.673 14.327 32 32 32 9 0 16.19-3.7 22.75-11.64 4.264-4.94 11.694-5.567 16.726-1.411 5.032 4.156 5.82 11.571 1.774 16.691C158.09 237.15 144.21 244 128 244 97.086 243.967 72.033 218.914 72 188 72 173.91 67.37 169.44 59.69 162 49.13 151.86 36 139.19 36 104 36 53.19 77.19 12 128 12c50.81 0 92 41.19 92 92ZM179.87 157.61c-2.755-1.595-6.032-2.029-9.107-1.208-3.076 .821-5.699 2.832-7.293 5.588-.903 1.574-2.752 2.343-4.505 1.874-1.753-.469-2.97-2.06-2.965-3.874 0-7.61 3.65-12.86 9.6-20.8C172 130.65 180 120 180 104 180 75.281 156.719 52 128 52 99.281 52 76 75.281 76 104c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28 0 7.61-3.65 12.86-9.6 20.8C140 133.35 132 144 132 160c-.001 12.674 8.511 23.768 20.753 27.048 12.242 3.28 25.161-2.072 31.497-13.048 3.314-5.736 1.354-13.072-4.38-16.39Z"),
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
        return _ear!!
    }

private var _ear: ImageVector? = null
