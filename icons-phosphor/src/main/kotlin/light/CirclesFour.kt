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
                pathData = parseSvgPathData("M 80.000 42.000 C 59.013 42.000 42.000 59.013 42.000 80.000 C 42.000 100.987 59.013 118.000 80.000 118.000 C 100.987 118.000 118.000 100.987 118.000 80.000 C 118.000 59.013 100.987 42.000 80.000 42.000 ZM 80.000 106.000 C 65.641 106.000 54.000 94.359 54.000 80.000 C 54.000 65.641 65.641 54.000 80.000 54.000 C 94.359 54.000 106.000 65.641 106.000 80.000 C 106.000 94.359 94.359 106.000 80.000 106.000 ZM 176.000 118.000 C 196.987 118.000 214.000 100.987 214.000 80.000 C 214.000 59.013 196.987 42.000 176.000 42.000 C 155.013 42.000 138.000 59.013 138.000 80.000 C 138.000 100.987 155.013 118.000 176.000 118.000 ZM 176.000 54.000 C 190.359 54.000 202.000 65.641 202.000 80.000 C 202.000 94.359 190.359 106.000 176.000 106.000 C 161.641 106.000 150.000 94.359 150.000 80.000 C 150.000 65.641 161.641 54.000 176.000 54.000 ZM 80.000 138.000 C 59.013 138.000 42.000 155.013 42.000 176.000 C 42.000 196.987 59.013 214.000 80.000 214.000 C 100.987 214.000 118.000 196.987 118.000 176.000 C 118.000 155.013 100.987 138.000 80.000 138.000 ZM 80.000 202.000 C 65.641 202.000 54.000 190.359 54.000 176.000 C 54.000 161.641 65.641 150.000 80.000 150.000 C 94.359 150.000 106.000 161.641 106.000 176.000 C 106.000 190.359 94.359 202.000 80.000 202.000 ZM 176.000 138.000 C 155.013 138.000 138.000 155.013 138.000 176.000 C 138.000 196.987 155.013 214.000 176.000 214.000 C 196.987 214.000 214.000 196.987 214.000 176.000 C 214.000 155.013 196.987 138.000 176.000 138.000 ZM 176.000 202.000 C 161.641 202.000 150.000 190.359 150.000 176.000 C 150.000 161.641 161.641 150.000 176.000 150.000 C 190.359 150.000 202.000 161.641 202.000 176.000 C 202.000 190.359 190.359 202.000 176.000 202.000 Z"),
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
