package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LetterCircleP: ImageVector
    get() {
        if (_letterCircleP != null) return _letterCircleP!!
        _letterCircleP = phosphorLightIcon(
            name = "LetterCircleP",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 128.000 218.000 C 78.294 218.000 38.000 177.706 38.000 128.000 C 38.000 78.294 78.294 38.000 128.000 38.000 C 177.706 38.000 218.000 78.294 218.000 128.000 C 217.945 177.683 177.683 217.945 128.000 218.000 ZM 136.000 82.000 L 104.000 82.000 C 100.686 82.000 98.000 84.686 98.000 88.000 L 98.000 168.000 C 98.000 171.314 100.686 174.000 104.000 174.000 C 107.314 174.000 110.000 171.314 110.000 168.000 L 110.000 150.000 L 136.000 150.000 C 154.778 150.000 170.000 134.778 170.000 116.000 C 170.000 97.222 154.778 82.000 136.000 82.000 ZM 136.000 138.000 L 110.000 138.000 L 110.000 94.000 L 136.000 94.000 C 148.150 94.000 158.000 103.850 158.000 116.000 C 158.000 128.150 148.150 138.000 136.000 138.000 Z"),
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
        return _letterCircleP!!
    }

private var _letterCircleP: ImageVector? = null
