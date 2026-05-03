package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Bed: ImageVector
    get() {
        if (_bed != null) return _bed!!
        _bed = phosphorThinIcon(
            name = "Bed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 76.000 L 28.000 76.000 L 28.000 48.000 C 28.000 45.791 26.209 44.000 24.000 44.000 C 21.791 44.000 20.000 45.791 20.000 48.000 L 20.000 208.000 C 20.000 210.209 21.791 212.000 24.000 212.000 C 26.209 212.000 28.000 210.209 28.000 208.000 L 28.000 172.000 L 244.000 172.000 L 244.000 208.000 C 244.000 210.209 245.791 212.000 248.000 212.000 C 250.209 212.000 252.000 210.209 252.000 208.000 L 252.000 112.000 C 252.000 92.118 235.882 76.000 216.000 76.000 ZM 28.000 84.000 L 108.000 84.000 L 108.000 164.000 L 28.000 164.000 ZM 116.000 164.000 L 116.000 84.000 L 216.000 84.000 C 231.464 84.000 244.000 96.536 244.000 112.000 L 244.000 164.000 Z"),
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
        return _bed!!
    }

private var _bed: ImageVector? = null
