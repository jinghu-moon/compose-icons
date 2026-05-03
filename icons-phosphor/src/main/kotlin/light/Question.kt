package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Question: ImageVector
    get() {
        if (_question != null) return _question!!
        _question = phosphorLightIcon(
            name = "Question",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 138.000 180.000 C 138.000 185.523 133.523 190.000 128.000 190.000 C 122.477 190.000 118.000 185.523 118.000 180.000 C 118.000 174.477 122.477 170.000 128.000 170.000 C 133.523 170.000 138.000 174.477 138.000 180.000 ZM 128.000 74.000 C 107.000 74.000 90.000 89.250 90.000 108.000 L 90.000 112.000 C 90.000 115.314 92.686 118.000 96.000 118.000 C 99.314 118.000 102.000 115.314 102.000 112.000 L 102.000 108.000 C 102.000 95.870 113.660 86.000 128.000 86.000 C 142.340 86.000 154.000 95.870 154.000 108.000 C 154.000 120.130 142.340 130.000 128.000 130.000 C 124.686 130.000 122.000 132.686 122.000 136.000 L 122.000 144.000 C 122.000 147.314 124.686 150.000 128.000 150.000 C 131.314 150.000 134.000 147.314 134.000 144.000 L 134.000 141.580 C 152.110 139.000 166.000 124.920 166.000 108.000 C 166.000 89.250 149.000 74.000 128.000 74.000 ZM 230.000 128.000 C 230.000 184.333 184.333 230.000 128.000 230.000 C 71.667 230.000 26.000 184.333 26.000 128.000 C 26.000 71.667 71.667 26.000 128.000 26.000 C 184.306 26.066 229.934 71.694 230.000 128.000 ZM 218.000 128.000 C 218.000 78.294 177.706 38.000 128.000 38.000 C 78.294 38.000 38.000 78.294 38.000 128.000 C 38.000 177.706 78.294 218.000 128.000 218.000 C 177.683 217.945 217.945 177.683 218.000 128.000 Z"),
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
        return _question!!
    }

private var _question: ImageVector? = null
