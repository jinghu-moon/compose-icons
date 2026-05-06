package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SoccerBall: ImageVector
    get() {
        if (_soccerBall != null) return _soccerBall!!
        _soccerBall = phosphorDuotoneIcon(
            name = "SoccerBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M65.17 108.08l-33 25.34c-.1-1.8-.15-3.6-.15-5.42C31.981 106.089 39.469 84.83 53.23 67.78ZM46.92 179.42c13.054 20.562 33.426 35.401 57 41.52L89.22 179.42ZM152.13 220.94c23.574-6.119 43.946-20.958 57-41.52h-42.3ZM202.77 67.78l-11.94 40.3 33 25.34c.1-1.8 .15-3.6 .15-5.42 .039-21.911-7.449-43.17-21.21-60.22ZM164.25 39.08c-23.245-9.44-49.255-9.44-72.5 0L128 64ZM152.72 160 168 115.5 128 88 88 115.5 103.28 160Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM204.52 171.42h-33.62l-9.26-12.76 12.63-36.78 15-4.89 26.24 20.13c-1.242 12.072-4.984 23.754-10.99 34.3ZM40.52 137.12 66.71 117l15 4.89 12.63 36.78-9.24 12.75h-33.62C45.467 160.875 41.718 149.194 40.47 137.12ZM50.52 86.48l5.51 18.6L40.71 116.77c1.358-10.607 4.653-20.874 9.72-30.29ZM109 152 97.54 118.65 128 97.71l30.46 20.94L147 152ZM200.07 105.08l5.51-18.6c5.067 9.416 8.362 19.683 9.72 30.29ZM193.87 69.7l-9.51 32.08-15.07 4.89L136 83.79v-15.58l29.09-20c10.957 5.124 20.748 12.438 28.77 21.49ZM146.07 41.87 128 54.29 109.93 41.87c11.918-2.493 24.222-2.493 36.14 0ZM90.91 48.21l29.09 20v15.58L86.72 106.67 71.65 101.78 62.14 69.7C70.162 60.648 79.953 53.334 90.91 48.21ZM63.15 187.42h20.37l7.17 20.27C80.278 202.79 70.923 195.905 63.15 187.42ZM110 214.13 98.12 180.71 107.35 168h41.3l9.23 12.71-11.83 33.42c-11.904 2.495-24.196 2.495-36.1 0ZM165.36 207.69l7.17-20.27h20.37c-7.788 8.49-17.16 15.376-27.59 20.27Z"),
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
        return _soccerBall!!
    }

private var _soccerBall: ImageVector? = null
