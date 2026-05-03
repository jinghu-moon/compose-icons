package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Cardholder: ImageVector
    get() {
        if (_cardholder != null) return _cardholder!!
        _cardholder = phosphorLightIcon(
            name = "Cardholder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 50.000 L 48.000 50.000 C 35.850 50.000 26.000 59.850 26.000 72.000 L 26.000 184.000 C 26.000 196.150 35.850 206.000 48.000 206.000 L 208.000 206.000 C 220.150 206.000 230.000 196.150 230.000 184.000 L 230.000 72.000 C 230.000 59.850 220.150 50.000 208.000 50.000 ZM 38.000 94.000 L 218.000 94.000 L 218.000 114.000 L 160.000 114.000 C 156.686 114.000 154.000 116.686 154.000 120.000 C 154.000 134.359 142.359 146.000 128.000 146.000 C 113.641 146.000 102.000 134.359 102.000 120.000 C 102.000 116.686 99.314 114.000 96.000 114.000 L 38.000 114.000 ZM 48.000 62.000 L 208.000 62.000 C 213.523 62.000 218.000 66.477 218.000 72.000 L 218.000 82.000 L 38.000 82.000 L 38.000 72.000 C 38.000 66.477 42.477 62.000 48.000 62.000 ZM 208.000 194.000 L 48.000 194.000 C 42.477 194.000 38.000 189.523 38.000 184.000 L 38.000 126.000 L 90.470 126.000 C 93.400 144.456 109.313 158.042 128.000 158.042 C 146.687 158.042 162.600 144.456 165.530 126.000 L 218.000 126.000 L 218.000 184.000 C 218.000 189.523 213.523 194.000 208.000 194.000 Z"),
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
        return _cardholder!!
    }

private var _cardholder: ImageVector? = null
