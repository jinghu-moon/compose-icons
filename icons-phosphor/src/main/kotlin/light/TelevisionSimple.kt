package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TelevisionSimple: ImageVector
    get() {
        if (_televisionSimple != null) return _televisionSimple!!
        _televisionSimple = phosphorLightIcon(
            name = "TelevisionSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 66.000 L 142.480 66.000 L 180.240 28.240 C 182.443 25.876 182.378 22.192 180.093 19.907 C 177.808 17.622 174.124 17.557 171.760 19.760 L 128.000 63.510 L 84.240 19.760 C 82.744 18.155 80.492 17.494 78.366 18.037 C 76.240 18.580 74.580 20.240 74.037 22.366 C 73.494 24.492 74.155 26.744 75.760 28.240 L 113.520 66.000 L 40.000 66.000 C 32.268 66.000 26.000 72.268 26.000 80.000 L 26.000 200.000 C 26.000 207.732 32.268 214.000 40.000 214.000 L 216.000 214.000 C 223.732 214.000 230.000 207.732 230.000 200.000 L 230.000 80.000 C 230.000 72.268 223.732 66.000 216.000 66.000 ZM 218.000 200.000 C 218.000 201.105 217.105 202.000 216.000 202.000 L 40.000 202.000 C 38.895 202.000 38.000 201.105 38.000 200.000 L 38.000 80.000 C 38.000 78.895 38.895 78.000 40.000 78.000 L 216.000 78.000 C 217.105 78.000 218.000 78.895 218.000 80.000 Z"),
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
        return _televisionSimple!!
    }

private var _televisionSimple: ImageVector? = null
