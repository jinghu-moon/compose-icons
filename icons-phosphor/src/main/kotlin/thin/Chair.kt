package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Chair: ImageVector
    get() {
        if (_chair != null) return _chair!!
        _chair = phosphorThinIcon(
            name = "Chair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 140.000 L 172.000 140.000 L 172.000 100.000 L 192.000 100.000 C 198.627 100.000 204.000 94.627 204.000 88.000 L 204.000 40.000 C 204.000 33.373 198.627 28.000 192.000 28.000 L 64.000 28.000 C 57.373 28.000 52.000 33.373 52.000 40.000 L 52.000 88.000 C 52.000 94.627 57.373 100.000 64.000 100.000 L 84.000 100.000 L 84.000 140.000 L 48.000 140.000 C 41.373 140.000 36.000 145.373 36.000 152.000 L 36.000 168.000 C 36.000 174.627 41.373 180.000 48.000 180.000 L 60.000 180.000 L 60.000 224.000 C 60.000 226.209 61.791 228.000 64.000 228.000 C 66.209 228.000 68.000 226.209 68.000 224.000 L 68.000 180.000 L 188.000 180.000 L 188.000 224.000 C 188.000 226.209 189.791 228.000 192.000 228.000 C 194.209 228.000 196.000 226.209 196.000 224.000 L 196.000 180.000 L 208.000 180.000 C 214.627 180.000 220.000 174.627 220.000 168.000 L 220.000 152.000 C 220.000 145.373 214.627 140.000 208.000 140.000 ZM 60.000 88.000 L 60.000 40.000 C 60.000 37.791 61.791 36.000 64.000 36.000 L 192.000 36.000 C 194.209 36.000 196.000 37.791 196.000 40.000 L 196.000 88.000 C 196.000 90.209 194.209 92.000 192.000 92.000 L 64.000 92.000 C 61.791 92.000 60.000 90.209 60.000 88.000 ZM 92.000 100.000 L 164.000 100.000 L 164.000 140.000 L 92.000 140.000 ZM 212.000 168.000 C 212.000 170.209 210.209 172.000 208.000 172.000 L 48.000 172.000 C 45.791 172.000 44.000 170.209 44.000 168.000 L 44.000 152.000 C 44.000 149.791 45.791 148.000 48.000 148.000 L 208.000 148.000 C 210.209 148.000 212.000 149.791 212.000 152.000 Z"),
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
