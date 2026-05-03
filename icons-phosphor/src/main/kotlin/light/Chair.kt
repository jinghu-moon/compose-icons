package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Chair: ImageVector
    get() {
        if (_chair != null) return _chair!!
        _chair = phosphorLightIcon(
            name = "Chair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 138.000 L 174.000 138.000 L 174.000 102.000 L 192.000 102.000 C 199.732 102.000 206.000 95.732 206.000 88.000 L 206.000 40.000 C 206.000 32.268 199.732 26.000 192.000 26.000 L 64.000 26.000 C 56.268 26.000 50.000 32.268 50.000 40.000 L 50.000 88.000 C 50.000 95.732 56.268 102.000 64.000 102.000 L 82.000 102.000 L 82.000 138.000 L 48.000 138.000 C 40.268 138.000 34.000 144.268 34.000 152.000 L 34.000 168.000 C 34.000 175.732 40.268 182.000 48.000 182.000 L 58.000 182.000 L 58.000 224.000 C 58.000 227.314 60.686 230.000 64.000 230.000 C 67.314 230.000 70.000 227.314 70.000 224.000 L 70.000 182.000 L 186.000 182.000 L 186.000 224.000 C 186.000 227.314 188.686 230.000 192.000 230.000 C 195.314 230.000 198.000 227.314 198.000 224.000 L 198.000 182.000 L 208.000 182.000 C 215.732 182.000 222.000 175.732 222.000 168.000 L 222.000 152.000 C 222.000 144.268 215.732 138.000 208.000 138.000 ZM 62.000 88.000 L 62.000 40.000 C 62.000 38.895 62.895 38.000 64.000 38.000 L 192.000 38.000 C 193.105 38.000 194.000 38.895 194.000 40.000 L 194.000 88.000 C 194.000 89.105 193.105 90.000 192.000 90.000 L 64.000 90.000 C 62.895 90.000 62.000 89.105 62.000 88.000 ZM 94.000 102.000 L 162.000 102.000 L 162.000 138.000 L 94.000 138.000 ZM 210.000 168.000 C 210.000 169.105 209.105 170.000 208.000 170.000 L 48.000 170.000 C 46.895 170.000 46.000 169.105 46.000 168.000 L 46.000 152.000 C 46.000 150.895 46.895 150.000 48.000 150.000 L 208.000 150.000 C 209.105 150.000 210.000 150.895 210.000 152.000 Z"),
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
        return _chair!!
    }

private var _chair: ImageVector? = null
