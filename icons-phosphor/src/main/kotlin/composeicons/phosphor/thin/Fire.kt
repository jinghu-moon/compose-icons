package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Fire: ImageVector
    get() {
        if (_fire != null) return _fire!!
        _fire = phosphorThinIcon(
            name = "Fire",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M179.94 152.67c-3.941 22.064-21.215 39.334-43.28 43.27-.218 .04-.439 .06-.66 .06-2.069-.015-3.785-1.606-3.957-3.669-.171-2.062 1.258-3.915 3.297-4.271 18.18-3.06 33.63-18.51 36.72-36.73 .447-2.098 2.468-3.469 4.583-3.11 2.114 .36 3.569 2.323 3.297 4.45ZM212 144c0 46.392-37.608 84-84 84C81.608 228 44 190.392 44 144 44 117 54.71 89.25 75.84 61.57c.694-.92 1.751-1.495 2.9-1.58 1.149-.084 2.279 .331 3.1 1.14l28.55 27.7L134.54 22.63c.445-1.222 1.457-2.15 2.712-2.491 1.255-.34 2.597-.049 3.598 .781C162.22 38.69 212 86.24 212 144ZM204 144C204 93.18 162.27 50.09 140.06 30.77L115.76 97.37c-.464 1.276-1.543 2.23-2.867 2.533-1.324 .303-2.711-.086-3.683-1.033L79.5 70C61.25 95.07 52 119.93 52 144c0 41.974 34.026 76 76 76 41.974 0 76-34.026 76-76Z"),
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
        return _fire!!
    }

private var _fire: ImageVector? = null
