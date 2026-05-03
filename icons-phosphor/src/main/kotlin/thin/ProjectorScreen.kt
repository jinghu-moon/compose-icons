package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ProjectorScreen: ImageVector
    get() {
        if (_projectorScreen != null) return _projectorScreen!!
        _projectorScreen = phosphorThinIcon(
            name = "ProjectorScreen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 76.000 C 222.627 76.000 228.000 70.627 228.000 64.000 L 228.000 48.000 C 228.000 41.373 222.627 36.000 216.000 36.000 L 40.000 36.000 C 33.373 36.000 28.000 41.373 28.000 48.000 L 28.000 64.000 C 28.000 70.627 33.373 76.000 40.000 76.000 L 44.000 76.000 L 44.000 180.000 L 32.000 180.000 C 29.791 180.000 28.000 181.791 28.000 184.000 C 28.000 186.209 29.791 188.000 32.000 188.000 L 124.000 188.000 L 124.000 212.400 C 113.940 214.453 107.069 223.791 108.101 234.006 C 109.133 244.221 117.733 251.996 128.000 251.996 C 138.267 251.996 146.867 244.221 147.899 234.006 C 148.931 223.791 142.060 214.453 132.000 212.400 L 132.000 188.000 L 224.000 188.000 C 226.209 188.000 228.000 186.209 228.000 184.000 C 228.000 181.791 226.209 180.000 224.000 180.000 L 212.000 180.000 L 212.000 76.000 ZM 140.000 232.000 C 140.000 238.627 134.627 244.000 128.000 244.000 C 121.373 244.000 116.000 238.627 116.000 232.000 C 116.000 225.373 121.373 220.000 128.000 220.000 C 134.627 220.000 140.000 225.373 140.000 232.000 ZM 36.000 64.000 L 36.000 48.000 C 36.000 45.791 37.791 44.000 40.000 44.000 L 216.000 44.000 C 218.209 44.000 220.000 45.791 220.000 48.000 L 220.000 64.000 C 220.000 66.209 218.209 68.000 216.000 68.000 L 40.000 68.000 C 37.791 68.000 36.000 66.209 36.000 64.000 ZM 204.000 180.000 L 52.000 180.000 L 52.000 76.000 L 204.000 76.000 Z"),
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
        return _projectorScreen!!
    }

private var _projectorScreen: ImageVector? = null
