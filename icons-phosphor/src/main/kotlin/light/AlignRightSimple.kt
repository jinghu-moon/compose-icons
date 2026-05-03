package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AlignRightSimple: ImageVector
    get() {
        if (_alignRightSimple != null) return _alignRightSimple!!
        _alignRightSimple = phosphorLightIcon(
            name = "AlignRightSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 230.000 56.000 L 230.000 200.000 C 230.000 203.314 227.314 206.000 224.000 206.000 C 220.686 206.000 218.000 203.314 218.000 200.000 L 218.000 56.000 C 218.000 52.686 220.686 50.000 224.000 50.000 C 227.314 50.000 230.000 52.686 230.000 56.000 ZM 198.000 96.000 L 198.000 160.000 C 198.000 167.732 191.732 174.000 184.000 174.000 L 32.000 174.000 C 24.268 174.000 18.000 167.732 18.000 160.000 L 18.000 96.000 C 18.000 88.268 24.268 82.000 32.000 82.000 L 184.000 82.000 C 191.732 82.000 198.000 88.268 198.000 96.000 ZM 186.000 96.000 C 186.000 94.895 185.105 94.000 184.000 94.000 L 32.000 94.000 C 30.895 94.000 30.000 94.895 30.000 96.000 L 30.000 160.000 C 30.000 161.105 30.895 162.000 32.000 162.000 L 184.000 162.000 C 185.105 162.000 186.000 161.105 186.000 160.000 Z"),
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
        return _alignRightSimple!!
    }

private var _alignRightSimple: ImageVector? = null
