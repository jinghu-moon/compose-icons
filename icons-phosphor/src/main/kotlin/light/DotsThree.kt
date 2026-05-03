package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DotsThree: ImageVector
    get() {
        if (_dotsThree != null) return _dotsThree!!
        _dotsThree = phosphorLightIcon(
            name = "DotsThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 138.000 128.000 C 138.000 133.523 133.523 138.000 128.000 138.000 C 122.477 138.000 118.000 133.523 118.000 128.000 C 118.000 122.477 122.477 118.000 128.000 118.000 C 133.523 118.000 138.000 122.477 138.000 128.000 ZM 60.000 118.000 C 54.477 118.000 50.000 122.477 50.000 128.000 C 50.000 133.523 54.477 138.000 60.000 138.000 C 65.523 138.000 70.000 133.523 70.000 128.000 C 70.000 122.477 65.523 118.000 60.000 118.000 ZM 196.000 118.000 C 190.477 118.000 186.000 122.477 186.000 128.000 C 186.000 133.523 190.477 138.000 196.000 138.000 C 201.523 138.000 206.000 133.523 206.000 128.000 C 206.000 122.477 201.523 118.000 196.000 118.000 Z"),
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
        return _dotsThree!!
    }

private var _dotsThree: ImageVector? = null
