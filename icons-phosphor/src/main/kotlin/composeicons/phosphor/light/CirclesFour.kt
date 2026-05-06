package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CirclesFour: ImageVector
    get() {
        if (_circlesFour != null) return _circlesFour!!
        _circlesFour = phosphorLightIcon(
            name = "CirclesFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M80 42C59.013 42 42 59.013 42 80c0 20.987 17.013 38 38 38 20.987 0 38-17.013 38-38C118 59.013 100.987 42 80 42ZM80 106C65.641 106 54 94.359 54 80 54 65.641 65.641 54 80 54c14.359 0 26 11.641 26 26 0 14.359-11.641 26-26 26ZM176 118c20.987 0 38-17.013 38-38C214 59.013 196.987 42 176 42c-20.987 0-38 17.013-38 38 0 20.987 17.013 38 38 38ZM176 54c14.359 0 26 11.641 26 26 0 14.359-11.641 26-26 26C161.641 106 150 94.359 150 80c0-14.359 11.641-26 26-26ZM80 138c-20.987 0-38 17.013-38 38 0 20.987 17.013 38 38 38 20.987 0 38-17.013 38-38 0-20.987-17.013-38-38-38ZM80 202C65.641 202 54 190.359 54 176c0-14.359 11.641-26 26-26 14.359 0 26 11.641 26 26 0 14.359-11.641 26-26 26ZM176 138c-20.987 0-38 17.013-38 38 0 20.987 17.013 38 38 38 20.987 0 38-17.013 38-38 0-20.987-17.013-38-38-38ZM176 202c-14.359 0-26-11.641-26-26 0-14.359 11.641-26 26-26 14.359 0 26 11.641 26 26 0 14.359-11.641 26-26 26Z"),
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
        return _circlesFour!!
    }

private var _circlesFour: ImageVector? = null
