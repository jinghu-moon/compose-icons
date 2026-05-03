package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SelectionSlash: ImageVector
    get() {
        if (_selectionSlash != null) return _selectionSlash!!
        _selectionSlash = phosphorBoldIcon(
            name = "SelectionSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 100.000 40.000 C 100.000 33.373 105.373 28.000 112.000 28.000 L 144.000 28.000 C 150.627 28.000 156.000 33.373 156.000 40.000 C 156.000 46.627 150.627 52.000 144.000 52.000 L 112.000 52.000 C 105.373 52.000 100.000 46.627 100.000 40.000 ZM 144.000 204.000 L 112.000 204.000 C 105.373 204.000 100.000 209.373 100.000 216.000 C 100.000 222.627 105.373 228.000 112.000 228.000 L 144.000 228.000 C 150.627 228.000 156.000 222.627 156.000 216.000 C 156.000 209.373 150.627 204.000 144.000 204.000 ZM 208.000 28.000 L 184.000 28.000 C 177.373 28.000 172.000 33.373 172.000 40.000 C 172.000 46.627 177.373 52.000 184.000 52.000 L 204.000 52.000 L 204.000 72.000 C 204.000 78.627 209.373 84.000 216.000 84.000 C 222.627 84.000 228.000 78.627 228.000 72.000 L 228.000 48.000 C 228.000 36.954 219.046 28.000 208.000 28.000 ZM 216.000 100.000 C 209.373 100.000 204.000 105.373 204.000 112.000 L 204.000 144.000 C 204.000 150.627 209.373 156.000 216.000 156.000 C 222.627 156.000 228.000 150.627 228.000 144.000 L 228.000 112.000 C 228.000 105.373 222.627 100.000 216.000 100.000 ZM 40.000 156.000 C 46.627 156.000 52.000 150.627 52.000 144.000 L 52.000 112.000 C 52.000 105.373 46.627 100.000 40.000 100.000 C 33.373 100.000 28.000 105.373 28.000 112.000 L 28.000 144.000 C 28.000 150.627 33.373 156.000 40.000 156.000 ZM 72.000 204.000 L 52.000 204.000 L 52.000 184.000 C 52.000 177.373 46.627 172.000 40.000 172.000 C 33.373 172.000 28.000 177.373 28.000 184.000 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 72.000 228.000 C 78.627 228.000 84.000 222.627 84.000 216.000 C 84.000 209.373 78.627 204.000 72.000 204.000 ZM 56.880 31.930 C 54.012 28.697 49.628 27.256 45.401 28.157 C 41.175 29.058 37.759 32.162 36.459 36.284 C 35.159 40.405 36.175 44.907 39.120 48.070 L 199.120 224.070 C 203.598 228.880 211.111 229.194 215.974 224.774 C 220.837 220.355 221.241 212.846 216.880 207.930 Z"),
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
        return _selectionSlash!!
    }

private var _selectionSlash: ImageVector? = null
