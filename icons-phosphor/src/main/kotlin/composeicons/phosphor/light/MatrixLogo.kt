package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MatrixLogo: ImageVector
    get() {
        if (_matrixLogo != null) return _matrixLogo!!
        _matrixLogo = phosphorLightIcon(
            name = "MatrixLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M46 46v164h18c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-24c-3.314 0-6-2.686-6-6v-176c0-3.314 2.686-6 6-6h24c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6ZM216 34h-24c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h18v164h-18c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h24c3.314 0 6-2.686 6-6v-176c0-3.314-2.686-6-6-6ZM152 90c-9.443 0-18.334 4.446-24 12C118.059 88.745 99.255 86.059 86 96h0c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v64c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-40c0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18v40c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-40c0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18v40c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-40C182 103.431 168.569 90 152 90Z"),
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
        return _matrixLogo!!
    }

private var _matrixLogo: ImageVector? = null
