package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CaretDoubleUp: ImageVector
    get() {
        if (_caretDoubleUp != null) return _caretDoubleUp!!
        _caretDoubleUp = phosphorLightIcon(
            name = "CaretDoubleUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212.24 195.76c1.605 1.496 2.266 3.748 1.723 5.874-.543 2.126-2.203 3.786-4.329 4.329-2.126 .543-4.379-.118-5.874-1.723L128 128.49 52.24 204.24c-2.364 2.203-6.048 2.138-8.333-.147-2.285-2.285-2.35-5.969-.147-8.333l80-80c2.343-2.34 6.137-2.34 8.48 0ZM52.24 124.24 128 48.49l75.76 75.75c2.364 2.203 6.048 2.138 8.333-.147 2.285-2.285 2.35-5.969 .147-8.333l-80-80c-2.343-2.34-6.137-2.34-8.48 0L43.76 115.76c-2.203 2.364-2.138 6.048 .147 8.333 2.285 2.285 5.969 2.35 8.333 .147Z"),
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
        return _caretDoubleUp!!
    }

private var _caretDoubleUp: ImageVector? = null
