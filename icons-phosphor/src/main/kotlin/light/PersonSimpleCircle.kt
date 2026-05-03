package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PersonSimpleCircle: ImageVector
    get() {
        if (_personSimpleCircle != null) return _personSimpleCircle!!
        _personSimpleCircle = phosphorLightIcon(
            name = "PersonSimpleCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 128.000 218.000 C 78.294 218.000 38.000 177.706 38.000 128.000 C 38.000 78.294 78.294 38.000 128.000 38.000 C 177.706 38.000 218.000 78.294 218.000 128.000 C 217.945 177.683 177.683 217.945 128.000 218.000 ZM 114.000 80.000 C 114.000 72.268 120.268 66.000 128.000 66.000 C 135.732 66.000 142.000 72.268 142.000 80.000 C 142.000 87.732 135.732 94.000 128.000 94.000 C 120.268 94.000 114.000 87.732 114.000 80.000 ZM 182.000 112.000 C 182.000 115.314 179.314 118.000 176.000 118.000 L 134.000 118.000 L 134.000 134.180 L 165.000 180.670 C 166.839 183.431 166.091 187.161 163.330 189.000 C 160.569 190.839 156.839 190.091 155.000 187.330 L 128.000 146.820 L 101.000 187.330 C 99.161 190.091 95.431 190.839 92.670 189.000 C 89.909 187.161 89.161 183.431 91.000 180.670 L 122.000 134.180 L 122.000 118.000 L 80.000 118.000 C 76.686 118.000 74.000 115.314 74.000 112.000 C 74.000 108.686 76.686 106.000 80.000 106.000 L 176.000 106.000 C 179.314 106.000 182.000 108.686 182.000 112.000 Z"),
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
        return _personSimpleCircle!!
    }

private var _personSimpleCircle: ImageVector? = null
