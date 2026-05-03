package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Stairs: ImageVector
    get() {
        if (_stairs != null) return _stairs!!
        _stairs = phosphorThinIcon(
            name = "Stairs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 28.000 L 56.000 28.000 C 49.373 28.000 44.000 33.373 44.000 40.000 L 44.000 216.000 C 44.000 222.627 49.373 228.000 56.000 228.000 L 200.000 228.000 C 206.627 228.000 212.000 222.627 212.000 216.000 L 212.000 40.000 C 212.000 33.373 206.627 28.000 200.000 28.000 ZM 152.000 140.000 L 204.000 140.000 L 204.000 172.000 L 108.000 172.000 L 108.000 140.000 ZM 156.000 132.000 L 156.000 100.000 L 204.000 100.000 L 204.000 132.000 ZM 56.000 36.000 L 200.000 36.000 C 202.209 36.000 204.000 37.791 204.000 40.000 L 204.000 92.000 L 152.000 92.000 C 149.791 92.000 148.000 93.791 148.000 96.000 L 148.000 132.000 L 104.000 132.000 C 101.791 132.000 100.000 133.791 100.000 136.000 L 100.000 172.000 L 52.000 172.000 L 52.000 40.000 C 52.000 37.791 53.791 36.000 56.000 36.000 ZM 200.000 220.000 L 56.000 220.000 C 53.791 220.000 52.000 218.209 52.000 216.000 L 52.000 180.000 L 204.000 180.000 L 204.000 216.000 C 204.000 218.209 202.209 220.000 200.000 220.000 Z"),
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
        return _stairs!!
    }

private var _stairs: ImageVector? = null
