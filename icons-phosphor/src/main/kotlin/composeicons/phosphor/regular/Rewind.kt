package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Rewind: ImageVector
    get() {
        if (_rewind != null) return _rewind!!
        _rewind = phosphorRegularIcon(
            name = "Rewind",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M223.77 58c-5.11-2.794-11.333-2.591-16.25 .53L128 109.14v-37.3c-.024-5.801-3.203-11.13-8.297-13.906-5.094-2.776-11.295-2.559-16.183 .566L15.33 114.66C10.763 117.558 7.997 122.591 7.997 128c0 5.409 2.767 10.442 7.333 13.34l88.19 56.16c4.888 3.125 11.089 3.342 16.183 .566 5.094-2.776 8.273-8.105 8.297-13.906v-37.3l79.52 50.64c4.888 3.125 11.089 3.342 16.183 .566 5.094-2.776 8.273-8.105 8.297-13.906v-112.32C231.983 66.072 228.83 60.769 223.77 58ZM112 183.93 24.18 128 112 72.06ZM216 183.93 128.18 128 216 72.06Z"),
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
        return _rewind!!
    }

private var _rewind: ImageVector? = null
