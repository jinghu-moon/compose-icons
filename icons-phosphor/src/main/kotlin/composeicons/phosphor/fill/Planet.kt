package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Planet: ImageVector
    get() {
        if (_planet != null) return _planet!!
        _planet = phosphorFillIcon(
            name = "Planet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M245.11 60.68C237.46 47.49 217.26 44.52 186.61 52.02 155.868 28.34 113.893 25.497 80.238 44.815 46.583 64.132 27.868 101.811 32.81 140.3 5.09 169 5.49 186 10.9 195.32 16 204.16 26.64 208 40.64 208c9.72-.201 19.383-1.544 28.79-4 30.738 23.66 72.695 26.496 106.338 7.189 33.643-19.307 52.362-56.963 47.442-95.439 12.51-13 20.83-25.35 23.66-35.92 1.96-7.32 1.37-13.76-1.76-19.15ZM231.42 75.68c-6.11 22.78-48.65 57.31-87.52 79.64-67.81 39-113.62 41.52-119.16 32-1.46-2.51-.65-7.24 2.22-13 2.843-5.392 6.292-10.441 10.28-15.05 1.689 4.887 3.773 9.63 6.23 14.18 .767 1.466 2.357 2.308 4 2.12 5.721-.705 11.385-1.815 16.95-3.32 21.23-5.55 46.63-16.48 71.52-30.78 24.89-14.3 47-30.66 62.45-46.15 4.065-4.021 7.844-8.322 11.31-12.87 .985-1.327 1.052-3.123 .17-4.52-2.695-4.39-5.738-8.557-9.1-12.46 14.21-2.35 27.37-2.17 30.5 3.24 .92 1.57 .97 3.92 .15 6.98Z"),
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
        return _planet!!
    }

private var _planet: ImageVector? = null
