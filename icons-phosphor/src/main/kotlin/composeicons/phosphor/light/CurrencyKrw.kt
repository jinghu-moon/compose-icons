package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CurrencyKrw: ImageVector
    get() {
        if (_currencyKrw != null) return _currencyKrw!!
        _currencyKrw = phosphorLightIcon(
            name = "CurrencyKrw",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 130h-25.09L237.56 74.26c1.248-3.071-.229-6.572-3.3-7.82-3.071-1.248-6.572 .229-7.82 3.3L202 130h-44L133.56 69.74c-.918-2.264-3.117-3.745-5.56-3.745-2.443 0-4.642 1.481-5.56 3.745L98 130h-44L29.56 69.74C28.312 66.669 24.811 65.192 21.74 66.44c-3.071 1.248-4.548 4.749-3.3 7.82L41.09 130h-25.09c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h30l24.48 60.26c.918 2.264 3.117 3.745 5.56 3.745 2.443 0 4.642-1.481 5.56-3.745L106 142h44l24.48 60.26c.918 2.264 3.117 3.745 5.56 3.745 2.443 0 4.642-1.481 5.56-3.745L210 142h30c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM76 184.06 58.91 142h34.18ZM110.91 130 128 87.94 145.09 130ZM180 184.06 162.91 142h34.18Z"),
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
        return _currencyKrw!!
    }

private var _currencyKrw: ImageVector? = null
