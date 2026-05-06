package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Sigma: ImageVector
    get() {
        if (_sigma != null) return _sigma!!
        _sigma = phosphorLightIcon(
            name = "Sigma",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M186 72v-18h-109.52l56.21 70.25c1.755 2.192 1.755 5.308 0 7.5L76.48 202h109.52v-18c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v24c0 3.314-2.686 6-6 6h-128c-2.308 .002-4.413-1.319-5.413-3.399-1-2.08-.719-4.549 .723-6.351L120.31 128 59.31 51.75c-1.442-1.802-1.724-4.271-.723-6.351C59.587 43.319 61.692 41.998 64 42h128c3.314 0 6 2.686 6 6v24c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6Z"),
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
        return _sigma!!
    }

private var _sigma: ImageVector? = null
