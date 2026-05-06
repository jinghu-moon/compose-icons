package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BookBookmark: ImageVector
    get() {
        if (_bookBookmark != null) return _bookBookmark!!
        _bookBookmark = phosphorLightIcon(
            name = "BookBookmark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 26h-136C55.431 26 42 39.431 42 56v168c0 3.314 2.686 6 6 6h144c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-138v-2c0-9.941 8.059-18 18-18h136c3.314 0 6-2.686 6-6v-160c0-3.314-2.686-6-6-6ZM118 38h52v78L147.59 99.2c-2.133-1.6-5.067-1.6-7.2 0L118 116ZM202 186h-130c-6.493-.009-12.812 2.097-18 6v-136C54 46.059 62.059 38 72 38h34v90c0 2.273 1.284 4.35 3.317 5.367 2.033 1.016 4.465 .797 6.283-.567L144 111.5l28.41 21.3c1.818 1.358 4.246 1.574 6.276 .558 2.029-1.016 3.312-3.089 3.314-5.358v-90h20Z"),
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
        return _bookBookmark!!
    }

private var _bookBookmark: ImageVector? = null
