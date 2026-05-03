package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DotOutline: ImageVector
    get() {
        if (_dotOutline != null) return _dotOutline!!
        _dotOutline = phosphorLightIcon(
            name = "DotOutline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 98.000 C 111.431 98.000 98.000 111.431 98.000 128.000 C 98.000 144.569 111.431 158.000 128.000 158.000 C 144.569 158.000 158.000 144.569 158.000 128.000 C 158.000 111.431 144.569 98.000 128.000 98.000 ZM 128.000 146.000 C 118.059 146.000 110.000 137.941 110.000 128.000 C 110.000 118.059 118.059 110.000 128.000 110.000 C 137.941 110.000 146.000 118.059 146.000 128.000 C 146.000 137.941 137.941 146.000 128.000 146.000 Z"),
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
        return _dotOutline!!
    }

private var _dotOutline: ImageVector? = null
