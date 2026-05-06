package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Clover: ImageVector
    get() {
        if (_clover != null) return _clover!!
        _clover = phosphorFillIcon(
            name = "Clover",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 120c0 22.63-6 36.72-17.93 41.87-3.48 1.463-7.226 2.188-11 2.13-2.824-.025-5.639-.337-8.4-.93-1.019-.203-1.922-.79-2.52-1.64C174.102 141.474 158.107 122.963 140.4 106.17c-3.209-3.038-8.272-2.899-11.31 .31-3.038 3.209-2.899 8.272 .31 11.31 14.84 13.91 64.13 63.49 78.32 120.27 1.071 4.286-1.535 8.628-5.82 9.7-.622 .155-1.259 .235-1.9 .24-3.667-.005-6.861-2.503-7.75-6.06-4.12-16.47-11.65-32.48-20.46-47.09-.282 2.483-.922 4.911-1.9 7.21C164.72 214 150.63 220 128 220c-22.63 0-36.72-6-41.88-17.94-5.45-12.58-.39-30.82 15-54.21 .68-1 1.36-2 2-3l-3 2C82.84 158.27 68.35 164 56.89 164c-3.774 .058-7.52-.667-11-2.13C34 156.72 28 142.63 28 120 28 97.37 34 83.28 45.93 78.12c12.59-5.45 30.83-.39 54.22 15l3 2q-1-1.5-2-3C85.74 68.73 80.68 50.49 86.15 37.9 91.28 26 105.37 20 128 20c22.63 0 36.72 6 41.88 17.93 5.45 12.59 .39 30.83-15 54.22q-1 1.53-2 3l3-2c23.39-15.41 41.63-20.47 54.22-15C222 83.28 228 97.37 228 120Z"),
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
        return _clover!!
    }

private var _clover: ImageVector? = null
