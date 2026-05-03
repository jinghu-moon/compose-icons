package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Angle: ImageVector
    get() {
        if (_angle != null) return _angle!!
        _angle = phosphorLightIcon(
            name = "Angle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 98.000 72.000 C 98.000 68.686 100.686 66.000 104.000 66.000 C 160.306 66.066 205.934 111.694 206.000 168.000 C 206.000 171.314 203.314 174.000 200.000 174.000 C 196.686 174.000 194.000 171.314 194.000 168.000 C 193.945 118.317 153.683 78.055 104.000 78.000 C 100.686 78.000 98.000 75.314 98.000 72.000 ZM 240.000 194.000 L 78.000 194.000 L 78.000 32.000 C 78.000 28.686 75.314 26.000 72.000 26.000 C 68.686 26.000 66.000 28.686 66.000 32.000 L 66.000 66.000 L 32.000 66.000 C 28.686 66.000 26.000 68.686 26.000 72.000 C 26.000 75.314 28.686 78.000 32.000 78.000 L 66.000 78.000 L 66.000 200.000 C 66.000 203.314 68.686 206.000 72.000 206.000 L 240.000 206.000 C 243.314 206.000 246.000 203.314 246.000 200.000 C 246.000 196.686 243.314 194.000 240.000 194.000 Z"),
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
        return _angle!!
    }

private var _angle: ImageVector? = null
