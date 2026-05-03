package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Webcam: ImageVector
    get() {
        if (_webcam != null) return _webcam!!
        _webcam = phosphorLightIcon(
            name = "Webcam",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 166.000 104.000 C 166.000 83.013 148.987 66.000 128.000 66.000 C 107.013 66.000 90.000 83.013 90.000 104.000 C 90.000 124.987 107.013 142.000 128.000 142.000 C 148.987 142.000 166.000 124.987 166.000 104.000 ZM 102.000 104.000 C 102.000 89.641 113.641 78.000 128.000 78.000 C 142.359 78.000 154.000 89.641 154.000 104.000 C 154.000 118.359 142.359 130.000 128.000 130.000 C 113.641 130.000 102.000 118.359 102.000 104.000 ZM 224.000 202.000 L 134.000 202.000 L 134.000 181.750 C 175.786 178.526 207.555 142.858 205.942 100.979 C 204.329 59.100 169.910 25.981 128.000 25.981 C 86.090 25.981 51.671 59.100 50.058 100.979 C 48.445 142.858 80.214 178.526 122.000 181.750 L 122.000 202.000 L 32.000 202.000 C 28.686 202.000 26.000 204.686 26.000 208.000 C 26.000 211.314 28.686 214.000 32.000 214.000 L 224.000 214.000 C 227.314 214.000 230.000 211.314 230.000 208.000 C 230.000 204.686 227.314 202.000 224.000 202.000 ZM 62.000 104.000 C 62.000 67.549 91.549 38.000 128.000 38.000 C 164.451 38.000 194.000 67.549 194.000 104.000 C 194.000 140.451 164.451 170.000 128.000 170.000 C 91.567 169.956 62.044 140.433 62.000 104.000 Z"),
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
        return _webcam!!
    }

private var _webcam: ImageVector? = null
