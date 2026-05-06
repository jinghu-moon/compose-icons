package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GlobeSimpleX: ImageVector
    get() {
        if (_globeSimpleX != null) return _globeSimpleX!!
        _globeSimpleX = phosphorLightIcon(
            name = "GlobeSimpleX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220.24 172.24 200.49 192l19.75 19.76c1.605 1.496 2.266 3.748 1.723 5.874-.543 2.126-2.203 3.786-4.329 4.329-2.126 .543-4.379-.118-5.874-1.723L192 200.49l-19.76 19.75c-2.364 2.203-6.048 2.138-8.333-.147-2.285-2.285-2.35-5.969-.147-8.333L183.51 192 163.76 172.24c-2.203-2.364-2.138-6.048 .147-8.333 2.285-2.285 5.969-2.35 8.333-.147L192 183.51l19.76-19.75c2.364-2.203 6.048-2.138 8.333 .147 2.285 2.285 2.35 5.969 .147 8.333ZM230 128c0 3.314-2.686 6-6 6h-129.87c.76 22.05 7.194 43.532 18.68 62.37 9.35 15.11 18.85 22.88 18.95 22.95 1.987 1.594 2.751 4.269 1.905 6.672-.846 2.403-3.117 4.01-5.665 4.008h0C71.667 230 26 184.333 26 128 26 71.667 71.667 26 128 26c56.333 0 102 45.667 102 102ZM143.46 39.33c11.95 14.44 28.89 41.9 30.43 82.67h43.91C214.971 80.63 184.298 46.521 143.46 39.33ZM112.81 59.63C101.324 78.468 94.89 99.95 94.13 122h67.74C161.11 99.95 154.676 78.468 143.19 59.63 138.878 52.593 133.782 46.068 128 40.18c-5.782 5.888-10.878 12.413-15.19 19.45ZM38.2 122h43.91C83.65 81.23 100.59 53.77 112.54 39.33 71.702 46.521 41.029 80.63 38.2 122ZM82.11 134h-43.91c2.829 41.37 33.502 75.479 74.34 82.67C100.59 202.23 83.65 174.77 82.11 134Z"),
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
        return _globeSimpleX!!
    }

private var _globeSimpleX: ImageVector? = null
