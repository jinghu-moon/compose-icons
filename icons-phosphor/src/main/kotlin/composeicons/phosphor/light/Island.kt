package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Island: ImageVector
    get() {
        if (_island != null) return _island!!
        _island = phosphorLightIcon(
            name = "Island",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236.69 227.75c-.994 1.245-2.442 2.044-4.025 2.22-1.583 .176-3.172-.284-4.415-1.28C227.87 228.38 189 198 128 198 66.81 198 28.13 228.38 27.75 228.69c-2.59 2.071-6.369 1.65-8.44-.94-2.071-2.59-1.65-6.369 .94-8.44 1.63-1.3 39-30.65 99.59-33.14C116.329 173.269 115.031 159.865 116 146.53c1.76-22.07 11.39-51.75 45.8-73.43C154.801 70.951 147.511 69.905 140.19 70c-19.74 .64-32.65 12.56-38.37 35.43-.658 2.681-3.06 4.567-5.82 4.57-.492-.001-.982-.062-1.46-.18-1.544-.387-2.87-1.372-3.688-2.737-.818-1.365-1.059-2.999-.672-4.543C99.13 66.8 122.1 58.61 139.81 58.04c8.683-.145 17.335 1.073 25.64 3.61C161.55 54 155 44.69 145 40.41 134.45 35.9 121.64 37.79 106.91 46c-1.878 1.158-4.24 1.191-6.15 .088C98.85 44.984 97.7 42.921 97.764 40.716c.065-2.205 1.334-4.197 3.306-5.186 18.17-10.14 34.56-12.2 48.71-6.12 13.42 5.76 21.77 17.64 26.57 27.16C181 48.44 188.49 39.06 199.45 35.49c11.2-3.65 23.37-.6 36.16 9.07 2.643 1.999 3.164 5.762 1.165 8.405-1.999 2.643-5.762 3.164-8.405 1.165-9.46-7.15-17.93-9.59-25.17-7.24-9.3 3-15.45 13.07-18.7 20 7.903 1.309 15.517 3.986 22.5 7.91 14.15 8.09 31 25.27 31 61.21 0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6C226 98.09 204.8 85.01 190 80.42c6.701 10.907 9.316 23.837 7.38 36.49-1.201 8.039-4.103 15.73-8.51 22.56-1.908 2.712-5.653 3.363-8.365 1.455-2.712-1.908-3.363-5.653-1.455-8.365 .78-1.12 17.81-26.37-4.39-53.06C146.19 95 130.5 117.69 128 147.05c-.99 13.154 .468 26.378 4.3 39 62.82 1.35 101.77 31.92 103.43 33.25 1.251 .991 2.055 2.44 2.236 4.026 .18 1.586-.279 3.178-1.276 4.424ZM26 140c0-14.359 11.641-26 26-26 14.359 0 26 11.641 26 26 0 14.359-11.641 26-26 26C37.641 166 26 154.359 26 140ZM38 140c0 7.732 6.268 14 14 14 7.732 0 14-6.268 14-14 0-7.732-6.268-14-14-14-7.732 0-14 6.268-14 14Z"),
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
        return _island!!
    }

private var _island: ImageVector? = null
