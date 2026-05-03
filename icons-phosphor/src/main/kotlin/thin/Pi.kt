package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Pi: ImageVector
    get() {
        if (_pi != null) return _pi!!
        _pi = phosphorThinIcon(
            name = "Pi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 228.000 172.000 C 228.000 189.673 213.673 204.000 196.000 204.000 C 178.327 204.000 164.000 189.673 164.000 172.000 L 164.000 68.000 L 92.000 68.000 L 92.000 200.000 C 92.000 202.209 90.209 204.000 88.000 204.000 C 85.791 204.000 84.000 202.209 84.000 200.000 L 84.000 68.000 L 72.000 68.000 C 47.711 68.028 28.028 87.711 28.000 112.000 C 28.000 114.209 26.209 116.000 24.000 116.000 C 21.791 116.000 20.000 114.209 20.000 112.000 C 20.033 83.295 43.295 60.033 72.000 60.000 L 224.000 60.000 C 226.209 60.000 228.000 61.791 228.000 64.000 C 228.000 66.209 226.209 68.000 224.000 68.000 L 172.000 68.000 L 172.000 172.000 C 172.000 185.255 182.745 196.000 196.000 196.000 C 209.255 196.000 220.000 185.255 220.000 172.000 C 220.000 169.791 221.791 168.000 224.000 168.000 C 226.209 168.000 228.000 169.791 228.000 172.000 Z"),
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
        return _pi!!
    }

private var _pi: ImageVector? = null
