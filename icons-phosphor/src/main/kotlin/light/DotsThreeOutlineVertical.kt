package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DotsThreeOutlineVertical: ImageVector
    get() {
        if (_dotsThreeOutlineVertical != null) return _dotsThreeOutlineVertical!!
        _dotsThreeOutlineVertical = phosphorLightIcon(
            name = "DotsThreeOutlineVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 98.000 C 111.431 98.000 98.000 111.431 98.000 128.000 C 98.000 144.569 111.431 158.000 128.000 158.000 C 144.569 158.000 158.000 144.569 158.000 128.000 C 158.000 111.431 144.569 98.000 128.000 98.000 ZM 128.000 146.000 C 118.059 146.000 110.000 137.941 110.000 128.000 C 110.000 118.059 118.059 110.000 128.000 110.000 C 137.941 110.000 146.000 118.059 146.000 128.000 C 146.000 137.941 137.941 146.000 128.000 146.000 ZM 128.000 78.000 C 144.569 78.000 158.000 64.569 158.000 48.000 C 158.000 31.431 144.569 18.000 128.000 18.000 C 111.431 18.000 98.000 31.431 98.000 48.000 C 98.000 64.569 111.431 78.000 128.000 78.000 ZM 128.000 30.000 C 137.941 30.000 146.000 38.059 146.000 48.000 C 146.000 57.941 137.941 66.000 128.000 66.000 C 118.059 66.000 110.000 57.941 110.000 48.000 C 110.000 38.059 118.059 30.000 128.000 30.000 ZM 128.000 178.000 C 111.431 178.000 98.000 191.431 98.000 208.000 C 98.000 224.569 111.431 238.000 128.000 238.000 C 144.569 238.000 158.000 224.569 158.000 208.000 C 158.000 191.431 144.569 178.000 128.000 178.000 ZM 128.000 226.000 C 118.059 226.000 110.000 217.941 110.000 208.000 C 110.000 198.059 118.059 190.000 128.000 190.000 C 137.941 190.000 146.000 198.059 146.000 208.000 C 146.000 217.941 137.941 226.000 128.000 226.000 Z"),
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
        return _dotsThreeOutlineVertical!!
    }

private var _dotsThreeOutlineVertical: ImageVector? = null
