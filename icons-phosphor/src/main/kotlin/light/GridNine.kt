package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GridNine: ImageVector
    get() {
        if (_gridNine != null) return _gridNine!!
        _gridNine = phosphorLightIcon(
            name = "GridNine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 50.000 L 40.000 50.000 C 32.268 50.000 26.000 56.268 26.000 64.000 L 26.000 192.000 C 26.000 199.732 32.268 206.000 40.000 206.000 L 216.000 206.000 C 223.732 206.000 230.000 199.732 230.000 192.000 L 230.000 64.000 C 230.000 56.268 223.732 50.000 216.000 50.000 ZM 102.000 146.000 L 102.000 110.000 L 154.000 110.000 L 154.000 146.000 ZM 154.000 158.000 L 154.000 194.000 L 102.000 194.000 L 102.000 158.000 ZM 38.000 110.000 L 90.000 110.000 L 90.000 146.000 L 38.000 146.000 ZM 102.000 98.000 L 102.000 62.000 L 154.000 62.000 L 154.000 98.000 ZM 166.000 110.000 L 218.000 110.000 L 218.000 146.000 L 166.000 146.000 ZM 218.000 64.000 L 218.000 98.000 L 166.000 98.000 L 166.000 62.000 L 216.000 62.000 C 217.105 62.000 218.000 62.895 218.000 64.000 ZM 40.000 62.000 L 90.000 62.000 L 90.000 98.000 L 38.000 98.000 L 38.000 64.000 C 38.000 62.895 38.895 62.000 40.000 62.000 ZM 38.000 192.000 L 38.000 158.000 L 90.000 158.000 L 90.000 194.000 L 40.000 194.000 C 38.895 194.000 38.000 193.105 38.000 192.000 ZM 216.000 194.000 L 166.000 194.000 L 166.000 158.000 L 218.000 158.000 L 218.000 192.000 C 218.000 193.105 217.105 194.000 216.000 194.000 Z"),
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
        return _gridNine!!
    }

private var _gridNine: ImageVector? = null
