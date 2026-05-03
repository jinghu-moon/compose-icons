package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Barricade: ImageVector
    get() {
        if (_barricade != null) return _barricade!!
        _barricade = phosphorFillIcon(
            name = "Barricade",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 64.000 L 32.000 64.000 C 23.163 64.000 16.000 71.163 16.000 80.000 L 16.000 152.000 C 16.000 160.837 23.163 168.000 32.000 168.000 L 56.000 168.000 L 56.000 200.000 C 56.000 204.418 59.582 208.000 64.000 208.000 C 68.418 208.000 72.000 204.418 72.000 200.000 L 72.000 168.000 L 184.000 168.000 L 184.000 200.000 C 184.000 204.418 187.582 208.000 192.000 208.000 C 196.418 208.000 200.000 204.418 200.000 200.000 L 200.000 168.000 L 224.000 168.000 C 232.837 168.000 240.000 160.837 240.000 152.000 L 240.000 80.000 C 240.000 71.163 232.837 64.000 224.000 64.000 ZM 32.000 152.000 L 32.000 92.000 L 92.000 152.000 ZM 224.000 152.000 L 167.310 152.000 L 95.310 80.000 L 164.000 80.000 L 224.000 140.000 L 224.000 152.000 Z"),
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
        return _barricade!!
    }

private var _barricade: ImageVector? = null
