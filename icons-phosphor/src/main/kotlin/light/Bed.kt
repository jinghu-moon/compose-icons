package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Bed: ImageVector
    get() {
        if (_bed != null) return _bed!!
        _bed = phosphorLightIcon(
            name = "Bed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 74.000 L 30.000 74.000 L 30.000 48.000 C 30.000 44.686 27.314 42.000 24.000 42.000 C 20.686 42.000 18.000 44.686 18.000 48.000 L 18.000 208.000 C 18.000 211.314 20.686 214.000 24.000 214.000 C 27.314 214.000 30.000 211.314 30.000 208.000 L 30.000 174.000 L 242.000 174.000 L 242.000 208.000 C 242.000 211.314 244.686 214.000 248.000 214.000 C 251.314 214.000 254.000 211.314 254.000 208.000 L 254.000 112.000 C 254.000 91.013 236.987 74.000 216.000 74.000 ZM 30.000 86.000 L 106.000 86.000 L 106.000 162.000 L 30.000 162.000 ZM 118.000 162.000 L 118.000 86.000 L 216.000 86.000 C 230.359 86.000 242.000 97.641 242.000 112.000 L 242.000 162.000 Z"),
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
        return _bed!!
    }

private var _bed: ImageVector? = null
