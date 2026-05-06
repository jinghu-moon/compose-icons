package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Bandaids: ImageVector
    get() {
        if (_bandaids != null) return _bandaids!!
        _bandaids = phosphorThinIcon(
            name = "Bandaids",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M178.91 128 209.46 97.46c14.061-14.061 14.061-36.859 0-50.92-14.061-14.061-36.859-14.061-50.92 0L128 77.09 97.46 46.54C83.399 32.479 60.601 32.479 46.54 46.54c-14.061 14.061-14.061 36.859 0 50.92L77.09 128 46.54 158.54c-14.061 14.061-14.061 36.859 0 50.92 14.061 14.061 36.859 14.061 50.92 0L128 178.91l30.54 30.55c14.061 14.061 36.859 14.061 50.92 0 14.061-14.061 14.061-36.859 0-50.92ZM164.2 52.2c10.935-10.935 28.665-10.935 39.6 0 10.935 10.935 10.935 28.665 0 39.6l-30.55 30.54L133.66 82.75ZM167.6 128 128 167.6 88.4 128 128 88.4ZM52.2 91.8C41.265 80.865 41.265 63.135 52.2 52.2c10.935-10.935 28.665-10.935 39.6 0l30.54 30.55L82.75 122.34ZM91.8 203.8c-10.935 10.935-28.665 10.935-39.6 0-10.935-10.935-10.935-28.665 0-39.6L82.75 133.66l39.59 39.59ZM203.8 203.8c-5.251 5.252-12.373 8.202-19.8 8.202-7.427 0-14.549-2.95-19.8-8.202L133.66 173.25l39.59-39.59 30.55 30.54c5.252 5.251 8.202 12.373 8.202 19.8 0 7.427-2.95 14.549-8.202 19.8ZM120 128c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8Z"),
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
        return _bandaids!!
    }

private var _bandaids: ImageVector? = null
