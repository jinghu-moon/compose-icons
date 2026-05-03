package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HashStraight: ImageVector
    get() {
        if (_hashStraight != null) return _hashStraight!!
        _hashStraight = phosphorLightIcon(
            name = "HashStraight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 154.000 L 166.000 154.000 L 166.000 102.000 L 216.000 102.000 C 219.314 102.000 222.000 99.314 222.000 96.000 C 222.000 92.686 219.314 90.000 216.000 90.000 L 166.000 90.000 L 166.000 40.000 C 166.000 36.686 163.314 34.000 160.000 34.000 C 156.686 34.000 154.000 36.686 154.000 40.000 L 154.000 90.000 L 102.000 90.000 L 102.000 40.000 C 102.000 36.686 99.314 34.000 96.000 34.000 C 92.686 34.000 90.000 36.686 90.000 40.000 L 90.000 90.000 L 40.000 90.000 C 36.686 90.000 34.000 92.686 34.000 96.000 C 34.000 99.314 36.686 102.000 40.000 102.000 L 90.000 102.000 L 90.000 154.000 L 40.000 154.000 C 36.686 154.000 34.000 156.686 34.000 160.000 C 34.000 163.314 36.686 166.000 40.000 166.000 L 90.000 166.000 L 90.000 216.000 C 90.000 219.314 92.686 222.000 96.000 222.000 C 99.314 222.000 102.000 219.314 102.000 216.000 L 102.000 166.000 L 154.000 166.000 L 154.000 216.000 C 154.000 219.314 156.686 222.000 160.000 222.000 C 163.314 222.000 166.000 219.314 166.000 216.000 L 166.000 166.000 L 216.000 166.000 C 219.314 166.000 222.000 163.314 222.000 160.000 C 222.000 156.686 219.314 154.000 216.000 154.000 ZM 102.000 154.000 L 102.000 102.000 L 154.000 102.000 L 154.000 154.000 Z"),
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
        return _hashStraight!!
    }

private var _hashStraight: ImageVector? = null
