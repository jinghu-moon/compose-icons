package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Flame: ImageVector
    get() {
        if (_flame != null) return _flame!!
        _flame = phosphorRegularIcon(
            name = "Flame",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M173.79 51.48C161.354 38.375 147.36 26.842 132.12 17.14c-2.535-1.523-5.705-1.523-8.24 0C108.64 26.842 94.646 38.375 82.21 51.48 54.59 80.48 40 112.47 40 144c0 48.601 39.399 88 88 88 48.601 0 88-39.399 88-88C216 112.47 201.41 80.48 173.79 51.48ZM96 184c0-27.67 22.53-47.28 32-54.3 9.48 7 32 26.63 32 54.3 0 17.673-14.327 32-32 32C110.327 216 96 201.673 96 184ZM173.27 199.93c1.808-5.117 2.731-10.504 2.73-15.93 0-44-42.09-69.79-43.88-70.86-2.535-1.523-5.705-1.523-8.24 0C122.09 114.21 80 140 80 184c-.001 5.426 .922 10.813 2.73 15.93C65.826 186.284 56 165.725 56 144 56 109.59 76.4 80.85 93.52 62.81 103.958 51.875 115.515 42.064 128 33.54c12.487 8.522 24.044 18.332 34.48 29.27C193.49 95.5 200 125 200 144c-0 21.725-9.826 42.284-26.73 55.93Z"),
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
        return _flame!!
    }

private var _flame: ImageVector? = null
