package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DotsThreeVertical: ImageVector
    get() {
        if (_dotsThreeVertical != null) return _dotsThreeVertical!!
        _dotsThreeVertical = phosphorLightIcon(
            name = "DotsThreeVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 118.000 60.000 C 118.000 54.477 122.477 50.000 128.000 50.000 C 133.523 50.000 138.000 54.477 138.000 60.000 C 138.000 65.523 133.523 70.000 128.000 70.000 C 122.477 70.000 118.000 65.523 118.000 60.000 ZM 128.000 118.000 C 122.477 118.000 118.000 122.477 118.000 128.000 C 118.000 133.523 122.477 138.000 128.000 138.000 C 133.523 138.000 138.000 133.523 138.000 128.000 C 138.000 122.477 133.523 118.000 128.000 118.000 ZM 128.000 186.000 C 122.477 186.000 118.000 190.477 118.000 196.000 C 118.000 201.523 122.477 206.000 128.000 206.000 C 133.523 206.000 138.000 201.523 138.000 196.000 C 138.000 190.477 133.523 186.000 128.000 186.000 Z"),
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
        return _dotsThreeVertical!!
    }

private var _dotsThreeVertical: ImageVector? = null
