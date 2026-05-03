package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Jar: ImageVector
    get() {
        if (_jar != null) return _jar!!
        _jar = phosphorLightIcon(
            name = "Jar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 182.000 50.480 L 182.000 32.000 C 182.000 24.268 175.732 18.000 168.000 18.000 L 88.000 18.000 C 80.268 18.000 74.000 24.268 74.000 32.000 L 74.000 50.480 C 55.576 53.447 42.023 69.338 42.000 88.000 L 42.000 200.000 C 42.000 220.987 59.013 238.000 80.000 238.000 L 176.000 238.000 C 196.987 238.000 214.000 220.987 214.000 200.000 L 214.000 88.000 C 213.977 69.338 200.424 53.447 182.000 50.480 ZM 170.000 32.000 L 170.000 50.000 L 150.000 50.000 L 150.000 30.000 L 168.000 30.000 C 169.105 30.000 170.000 30.895 170.000 32.000 ZM 118.000 50.000 L 118.000 30.000 L 138.000 30.000 L 138.000 50.000 ZM 88.000 30.000 L 106.000 30.000 L 106.000 50.000 L 86.000 50.000 L 86.000 32.000 C 86.000 30.895 86.895 30.000 88.000 30.000 ZM 202.000 200.000 C 202.000 214.359 190.359 226.000 176.000 226.000 L 80.000 226.000 C 65.641 226.000 54.000 214.359 54.000 200.000 L 54.000 88.000 C 54.000 73.641 65.641 62.000 80.000 62.000 L 176.000 62.000 C 190.359 62.000 202.000 73.641 202.000 88.000 Z"),
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
        return _jar!!
    }

private var _jar: ImageVector? = null
