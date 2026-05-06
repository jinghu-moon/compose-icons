package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CornersIn: ImageVector
    get() {
        if (_cornersIn != null) return _cornersIn!!
        _cornersIn = phosphorLightIcon(
            name = "CornersIn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M154 96v-48c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v42h42c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-48c-3.314 0-6-2.686-6-6ZM96 154h-48c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h42v42c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-48c0-3.314-2.686-6-6-6ZM208 154h-48c-3.314 0-6 2.686-6 6v48c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-42h42c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM96 42c-3.314 0-6 2.686-6 6v42h-42c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h48c3.314 0 6-2.686 6-6v-48c0-3.314-2.686-6-6-6Z"),
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
        return _cornersIn!!
    }

private var _cornersIn: ImageVector? = null
