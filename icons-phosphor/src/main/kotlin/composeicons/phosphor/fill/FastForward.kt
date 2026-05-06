package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FastForward: ImageVector
    get() {
        if (_fastForward != null) return _fastForward!!
        _fastForward = phosphorFillIcon(
            name = "FastForward",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M256 128c.008 5.41-2.759 10.446-7.33 13.34l-88.19 56.16c-4.888 3.125-11.089 3.342-16.183 .566-5.094-2.776-8.273-8.105-8.297-13.906v-37.3L56.48 197.5c-4.888 3.125-11.089 3.342-16.183 .566C35.203 195.29 32.024 189.961 32 184.16v-112.32c.024-5.801 3.203-11.13 8.297-13.906 5.094-2.776 11.295-2.559 16.183 .566L136 109.14v-37.3c.024-5.801 3.203-11.13 8.297-13.906 5.094-2.776 11.295-2.559 16.183 .566l88.19 56.16c4.571 2.894 7.338 7.93 7.33 13.34Z"),
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
        return _fastForward!!
    }

private var _fastForward: ImageVector? = null
