package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Footprints: ImageVector
    get() {
        if (_footprints != null) return _footprints!!
        _footprints = phosphorBoldIcon(
            name = "Footprints",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212 180h-56c-6.627 0-12 5.373-12 12v12c0 22.091 17.909 40 40 40 22.091 0 40-17.909 40-40v-12c0-6.627-5.373-12-12-12ZM184 220c-8.837 0-16-7.163-16-16h32c0 8.837-7.163 16-16 16ZM100 156h-56c-6.627 0-12 5.373-12 12v12c0 22.091 17.909 40 40 40 22.091 0 40-17.909 40-40v-12c0-6.627-5.373-12-12-12ZM72 196c-8.837 0-16-7.163-16-16h32c0 8.837-7.163 16-16 16ZM72 12C57.94 12 44.3 24.33 34.59 45.83c-12.45 27.57-16.78 67.52 3.14 90.11 2.278 2.582 5.556 4.061 9 4.06h50.52c3.444 .001 6.722-1.478 9-4.06 19.92-22.59 15.59-62.54 3.14-90.11C99.68 24.33 86 12 72 12ZM91.07 116h-38.17C46.19 103.87 45.23 80.55 56.46 55.7 63.16 40.85 70.28 36 72 36c1.72 0 8.82 4.85 15.53 19.7C98.73 80.55 97.77 103.87 91.07 116ZM158.75 164h50.54c3.444 .001 6.722-1.478 9-4.06 19.92-22.59 15.59-62.54 3.14-90.11C211.72 48.33 198.08 36 184 36c-14.08 0-27.7 12.33-37.41 33.83-12.45 27.57-16.78 67.52 3.14 90.11 2.283 2.587 5.569 4.066 9.02 4.06ZM168.49 79.7C175.2 64.85 182.32 60 184 60c1.68 0 8.82 4.85 15.52 19.7 11.23 24.85 10.27 48.17 3.56 60.3h-38.15c-6.7-12.13-7.66-35.45 3.56-60.3Z"),
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
        return _footprints!!
    }

private var _footprints: ImageVector? = null
