package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DotsThreeOutline: ImageVector
    get() {
        if (_dotsThreeOutline != null) return _dotsThreeOutline!!
        _dotsThreeOutline = phosphorLightIcon(
            name = "DotsThreeOutline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 98.000 C 111.431 98.000 98.000 111.431 98.000 128.000 C 98.000 144.569 111.431 158.000 128.000 158.000 C 144.569 158.000 158.000 144.569 158.000 128.000 C 158.000 111.431 144.569 98.000 128.000 98.000 ZM 128.000 146.000 C 118.059 146.000 110.000 137.941 110.000 128.000 C 110.000 118.059 118.059 110.000 128.000 110.000 C 137.941 110.000 146.000 118.059 146.000 128.000 C 146.000 137.941 137.941 146.000 128.000 146.000 ZM 48.000 98.000 C 31.431 98.000 18.000 111.431 18.000 128.000 C 18.000 144.569 31.431 158.000 48.000 158.000 C 64.569 158.000 78.000 144.569 78.000 128.000 C 78.000 111.431 64.569 98.000 48.000 98.000 ZM 48.000 146.000 C 38.059 146.000 30.000 137.941 30.000 128.000 C 30.000 118.059 38.059 110.000 48.000 110.000 C 57.941 110.000 66.000 118.059 66.000 128.000 C 66.000 137.941 57.941 146.000 48.000 146.000 ZM 208.000 98.000 C 191.431 98.000 178.000 111.431 178.000 128.000 C 178.000 144.569 191.431 158.000 208.000 158.000 C 224.569 158.000 238.000 144.569 238.000 128.000 C 238.000 111.431 224.569 98.000 208.000 98.000 ZM 208.000 146.000 C 198.059 146.000 190.000 137.941 190.000 128.000 C 190.000 118.059 198.059 110.000 208.000 110.000 C 217.941 110.000 226.000 118.059 226.000 128.000 C 226.000 137.941 217.941 146.000 208.000 146.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _dotsThreeOutline!!
    }

private var _dotsThreeOutline: ImageVector? = null
