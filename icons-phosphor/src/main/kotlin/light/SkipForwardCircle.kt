package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SkipForwardCircle: ImageVector
    get() {
        if (_skipForwardCircle != null) return _skipForwardCircle!!
        _skipForwardCircle = phosphorLightIcon(
            name = "SkipForwardCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 128.000 218.000 C 78.294 218.000 38.000 177.706 38.000 128.000 C 38.000 78.294 78.294 38.000 128.000 38.000 C 177.706 38.000 218.000 78.294 218.000 128.000 C 217.945 177.683 177.683 217.945 128.000 218.000 ZM 160.000 82.000 C 156.686 82.000 154.000 84.686 154.000 88.000 L 154.000 117.170 L 99.180 82.910 C 97.330 81.754 94.998 81.693 93.091 82.751 C 91.183 83.808 89.999 85.818 90.000 88.000 L 90.000 168.000 C 89.999 170.182 91.183 172.192 93.091 173.249 C 94.998 174.307 97.330 174.246 99.180 173.090 L 154.000 138.830 L 154.000 168.000 C 154.000 171.314 156.686 174.000 160.000 174.000 C 163.314 174.000 166.000 171.314 166.000 168.000 L 166.000 88.000 C 166.000 84.686 163.314 82.000 160.000 82.000 ZM 102.000 157.170 L 102.000 98.830 L 148.680 128.000 Z"),
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
        return _skipForwardCircle!!
    }

private var _skipForwardCircle: ImageVector? = null
