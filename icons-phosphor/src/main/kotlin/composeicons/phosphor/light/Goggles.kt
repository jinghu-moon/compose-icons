package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Goggles: ImageVector
    get() {
        if (_goggles != null) return _goggles!!
        _goggles = phosphorLightIcon(
            name = "Goggles",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M254 136C253.956 97.358 222.642 66.044 184 66h-112C33.358 66.044 2.044 97.358 2 136c-.001 10.102 6.878 18.907 16.68 21.35 2.06 8.24 8.85 16.06 19.64 22.44C49.11 186.17 61.87 190 72 190c18.662-.023 34.553-13.576 37.52-32h37c2.965 18.409 18.833 31.958 37.48 32 10.13 0 23-3.91 33.68-10.21 10.68-6.3 17.58-14.2 19.64-22.44C247.122 154.907 254.001 146.102 254 136ZM44.43 169.46C35.26 164 30 157.67 30 152c0-6.64 6.77-13.19 15.45-18.06l40.19 40.18C81.545 176.662 76.82 178.006 72 178c-7.86 0-18.94-3.43-27.57-8.54ZM94.12 165.64 57.24 128.75C61.989 127.078 66.968 126.15 72 126c9.42 .005 18.099 5.105 22.689 13.331 4.59 8.226 4.372 18.29-.569 26.309ZM158 152c-.005-6.778 2.649-13.287 7.39-18.13L204.55 173c-7.07 3.07-14.63 5-20.55 5-14.359 0-26-11.641-26-26ZM215.46 167 175.81 127.36c2.639-.892 5.405-1.351 8.19-1.36 7.86 0 18.94 3.43 27.57 8.54C220.74 140 226 146.33 226 152c0 5.32-4.35 10.58-10.54 15ZM236.77 144.82c-2.57-7.56-9.12-14.68-19.09-20.58C207 117.91 194.13 114 184 114c-18.662 .023-34.553 13.576-37.52 32h-37C106.515 127.591 90.647 114.042 72 114c-10.13 0-23 3.91-33.68 10.21-10 5.9-16.52 13-19.09 20.58C16.007 143.041 14 139.667 14 136 14.039 103.983 39.983 78.039 72 78h112c32.017 .039 57.961 25.983 58 58 0 3.667-2.007 7.041-5.23 8.79Z"),
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
        return _goggles!!
    }

private var _goggles: ImageVector? = null
