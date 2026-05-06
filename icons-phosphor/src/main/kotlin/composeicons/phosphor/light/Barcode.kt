package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Barcode: ImageVector
    get() {
        if (_barcode != null) return _barcode!!
        _barcode = phosphorLightIcon(
            name = "Barcode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230 48v40c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-34h-34c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h40c3.314 0 6 2.686 6 6ZM72 202h-34v-34c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v40c0 3.314 2.686 6 6 6h40c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM224 162c-3.314 0-6 2.686-6 6v34h-34c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h40c3.314 0 6-2.686 6-6v-40c0-3.314-2.686-6-6-6ZM32 94c3.314 0 6-2.686 6-6v-34h34c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-40c-3.314 0-6 2.686-6 6v40c0 3.314 2.686 6 6 6ZM80 82c-3.314 0-6 2.686-6 6v80c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-80c0-3.314-2.686-6-6-6ZM182 168v-80c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v80c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6ZM144 82c-3.314 0-6 2.686-6 6v80c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-80c0-3.314-2.686-6-6-6ZM112 82c-3.314 0-6 2.686-6 6v80c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-80c0-3.314-2.686-6-6-6Z"),
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
        return _barcode!!
    }

private var _barcode: ImageVector? = null
