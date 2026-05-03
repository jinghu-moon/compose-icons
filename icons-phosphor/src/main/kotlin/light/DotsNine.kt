package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DotsNine: ImageVector
    get() {
        if (_dotsNine != null) return _dotsNine!!
        _dotsNine = phosphorLightIcon(
            name = "DotsNine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 70.000 60.000 C 70.000 65.523 65.523 70.000 60.000 70.000 C 54.477 70.000 50.000 65.523 50.000 60.000 C 50.000 54.477 54.477 50.000 60.000 50.000 C 65.523 50.000 70.000 54.477 70.000 60.000 ZM 128.000 50.000 C 122.477 50.000 118.000 54.477 118.000 60.000 C 118.000 65.523 122.477 70.000 128.000 70.000 C 133.523 70.000 138.000 65.523 138.000 60.000 C 138.000 54.477 133.523 50.000 128.000 50.000 ZM 196.000 70.000 C 201.523 70.000 206.000 65.523 206.000 60.000 C 206.000 54.477 201.523 50.000 196.000 50.000 C 190.477 50.000 186.000 54.477 186.000 60.000 C 186.000 65.523 190.477 70.000 196.000 70.000 ZM 60.000 118.000 C 54.477 118.000 50.000 122.477 50.000 128.000 C 50.000 133.523 54.477 138.000 60.000 138.000 C 65.523 138.000 70.000 133.523 70.000 128.000 C 70.000 122.477 65.523 118.000 60.000 118.000 ZM 128.000 118.000 C 122.477 118.000 118.000 122.477 118.000 128.000 C 118.000 133.523 122.477 138.000 128.000 138.000 C 133.523 138.000 138.000 133.523 138.000 128.000 C 138.000 122.477 133.523 118.000 128.000 118.000 ZM 196.000 118.000 C 190.477 118.000 186.000 122.477 186.000 128.000 C 186.000 133.523 190.477 138.000 196.000 138.000 C 201.523 138.000 206.000 133.523 206.000 128.000 C 206.000 122.477 201.523 118.000 196.000 118.000 ZM 60.000 186.000 C 54.477 186.000 50.000 190.477 50.000 196.000 C 50.000 201.523 54.477 206.000 60.000 206.000 C 65.523 206.000 70.000 201.523 70.000 196.000 C 70.000 190.477 65.523 186.000 60.000 186.000 ZM 128.000 186.000 C 122.477 186.000 118.000 190.477 118.000 196.000 C 118.000 201.523 122.477 206.000 128.000 206.000 C 133.523 206.000 138.000 201.523 138.000 196.000 C 138.000 190.477 133.523 186.000 128.000 186.000 ZM 196.000 186.000 C 190.477 186.000 186.000 190.477 186.000 196.000 C 186.000 201.523 190.477 206.000 196.000 206.000 C 201.523 206.000 206.000 201.523 206.000 196.000 C 206.000 190.477 201.523 186.000 196.000 186.000 Z"),
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
        return _dotsNine!!
    }

private var _dotsNine: ImageVector? = null
