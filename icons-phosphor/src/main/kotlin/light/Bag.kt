package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Bag: ImageVector
    get() {
        if (_bag != null) return _bag!!
        _bag = phosphorLightIcon(
            name = "Bag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 66.000 L 174.000 66.000 L 174.000 64.000 C 174.000 38.595 153.405 18.000 128.000 18.000 C 102.595 18.000 82.000 38.595 82.000 64.000 L 82.000 66.000 L 40.000 66.000 C 32.268 66.000 26.000 72.268 26.000 80.000 L 26.000 200.000 C 26.000 207.732 32.268 214.000 40.000 214.000 L 216.000 214.000 C 223.732 214.000 230.000 207.732 230.000 200.000 L 230.000 80.000 C 230.000 72.268 223.732 66.000 216.000 66.000 ZM 94.000 64.000 C 94.000 45.222 109.222 30.000 128.000 30.000 C 146.778 30.000 162.000 45.222 162.000 64.000 L 162.000 66.000 L 94.000 66.000 ZM 218.000 200.000 C 218.000 201.105 217.105 202.000 216.000 202.000 L 40.000 202.000 C 38.895 202.000 38.000 201.105 38.000 200.000 L 38.000 80.000 C 38.000 78.895 38.895 78.000 40.000 78.000 L 82.000 78.000 L 82.000 96.000 C 82.000 99.314 84.686 102.000 88.000 102.000 C 91.314 102.000 94.000 99.314 94.000 96.000 L 94.000 78.000 L 162.000 78.000 L 162.000 96.000 C 162.000 99.314 164.686 102.000 168.000 102.000 C 171.314 102.000 174.000 99.314 174.000 96.000 L 174.000 78.000 L 216.000 78.000 C 217.105 78.000 218.000 78.895 218.000 80.000 Z"),
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
        return _bag!!
    }

private var _bag: ImageVector? = null
