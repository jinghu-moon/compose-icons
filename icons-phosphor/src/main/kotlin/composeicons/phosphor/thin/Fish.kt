package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Fish: ImageVector
    get() {
        if (_fish != null) return _fish!!
        _fish = phosphorThinIcon(
            name = "Fish",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M164 76.05c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM213.23 141.73c-19 34.15-54.76 52.35-106.43 54.13l-23 53.72c-.635 1.477-2.092 2.43-3.7 2.42h-.26c-1.687-.108-3.124-1.265-3.59-2.89L60.84 195.17 6.9 179.73c-1.625-.468-2.78-1.907-2.886-3.594-.105-1.688 .862-3.259 2.416-3.926l53.72-23C62 97.6 80.16 61.81 114.3 42.85 159.8 17.58 218.08 31.85 221.06 33.58c.584 .348 1.072 .836 1.42 1.42 .87 1.48 4.72 16.94 5.42 36.95 .64 18.62-1.38 45.84-14.67 69.78ZM172.77 171.5C149.305 167.925 131.976 147.736 132 124h0C108.303 123.992 88.15 106.709 84.53 83.29 74.26 101.29 68.74 124.24 68.07 152c-.037 1.564-.983 2.963-2.42 3.58L19.92 175.14l45.26 13c1.324 .38 2.36 1.416 2.74 2.74l12.93 45.25 19.6-45.72c.614-1.441 2.014-2.391 3.58-2.43 27.78-.7 50.75-6.21 68.74-16.48ZM220 77.25c-.038-12.45-1.446-24.858-4.2-37-12.142-2.755-24.55-4.163-37-4.2-18.81-.12-45.93 3-68.2 18.49C103.656 59.364 97.468 65.194 92.24 71.84c-1.254 11.935 2.916 23.803 11.361 32.329 8.445 8.526 20.272 12.811 32.219 11.671 1.187-.113 2.363 .31 3.206 1.154 .843 .843 1.266 2.019 1.154 3.206-1.136 11.955 3.158 23.788 11.698 32.231 8.54 8.443 20.421 12.602 32.362 11.329 6.628-5.223 12.445-11.4 17.26-18.33C210 133.16 220.18 111.35 220 77.25Z"),
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
        return _fish!!
    }

private var _fish: ImageVector? = null
