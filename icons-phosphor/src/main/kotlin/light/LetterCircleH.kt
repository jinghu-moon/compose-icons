package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LetterCircleH: ImageVector
    get() {
        if (_letterCircleH != null) return _letterCircleH!!
        _letterCircleH = phosphorLightIcon(
            name = "LetterCircleH",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 128.000 218.000 C 78.294 218.000 38.000 177.706 38.000 128.000 C 38.000 78.294 78.294 38.000 128.000 38.000 C 177.706 38.000 218.000 78.294 218.000 128.000 C 217.945 177.683 177.683 217.945 128.000 218.000 ZM 166.000 88.000 L 166.000 168.000 C 166.000 171.314 163.314 174.000 160.000 174.000 C 156.686 174.000 154.000 171.314 154.000 168.000 L 154.000 134.000 L 102.000 134.000 L 102.000 168.000 C 102.000 171.314 99.314 174.000 96.000 174.000 C 92.686 174.000 90.000 171.314 90.000 168.000 L 90.000 88.000 C 90.000 84.686 92.686 82.000 96.000 82.000 C 99.314 82.000 102.000 84.686 102.000 88.000 L 102.000 122.000 L 154.000 122.000 L 154.000 88.000 C 154.000 84.686 156.686 82.000 160.000 82.000 C 163.314 82.000 166.000 84.686 166.000 88.000 Z"),
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
        return _letterCircleH!!
    }

private var _letterCircleH: ImageVector? = null
