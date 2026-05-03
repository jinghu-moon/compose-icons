package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ProjectorScreenChart: ImageVector
    get() {
        if (_projectorScreenChart != null) return _projectorScreenChart!!
        _projectorScreenChart = phosphorThinIcon(
            name = "ProjectorScreenChart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 92.000 144.000 L 92.000 128.000 C 92.000 125.791 93.791 124.000 96.000 124.000 C 98.209 124.000 100.000 125.791 100.000 128.000 L 100.000 144.000 C 100.000 146.209 98.209 148.000 96.000 148.000 C 93.791 148.000 92.000 146.209 92.000 144.000 ZM 128.000 148.000 C 130.209 148.000 132.000 146.209 132.000 144.000 L 132.000 120.000 C 132.000 117.791 130.209 116.000 128.000 116.000 C 125.791 116.000 124.000 117.791 124.000 120.000 L 124.000 144.000 C 124.000 146.209 125.791 148.000 128.000 148.000 ZM 160.000 148.000 C 162.209 148.000 164.000 146.209 164.000 144.000 L 164.000 112.000 C 164.000 109.791 162.209 108.000 160.000 108.000 C 157.791 108.000 156.000 109.791 156.000 112.000 L 156.000 144.000 C 156.000 146.209 157.791 148.000 160.000 148.000 ZM 212.000 76.000 L 212.000 180.000 L 224.000 180.000 C 226.209 180.000 228.000 181.791 228.000 184.000 C 228.000 186.209 226.209 188.000 224.000 188.000 L 132.000 188.000 L 132.000 212.400 C 142.060 214.453 148.931 223.791 147.899 234.006 C 146.867 244.221 138.267 251.996 128.000 251.996 C 117.733 251.996 109.133 244.221 108.101 234.006 C 107.069 223.791 113.940 214.453 124.000 212.400 L 124.000 188.000 L 32.000 188.000 C 29.791 188.000 28.000 186.209 28.000 184.000 C 28.000 181.791 29.791 180.000 32.000 180.000 L 44.000 180.000 L 44.000 76.000 L 40.000 76.000 C 33.373 76.000 28.000 70.627 28.000 64.000 L 28.000 48.000 C 28.000 41.373 33.373 36.000 40.000 36.000 L 216.000 36.000 C 222.627 36.000 228.000 41.373 228.000 48.000 L 228.000 64.000 C 228.000 70.627 222.627 76.000 216.000 76.000 ZM 128.000 220.000 C 121.373 220.000 116.000 225.373 116.000 232.000 C 116.000 238.627 121.373 244.000 128.000 244.000 C 134.627 244.000 140.000 238.627 140.000 232.000 C 140.000 225.373 134.627 220.000 128.000 220.000 ZM 40.000 68.000 L 216.000 68.000 C 218.209 68.000 220.000 66.209 220.000 64.000 L 220.000 48.000 C 220.000 45.791 218.209 44.000 216.000 44.000 L 40.000 44.000 C 37.791 44.000 36.000 45.791 36.000 48.000 L 36.000 64.000 C 36.000 66.209 37.791 68.000 40.000 68.000 ZM 204.000 76.000 L 52.000 76.000 L 52.000 180.000 L 204.000 180.000 Z"),
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
        return _projectorScreenChart!!
    }

private var _projectorScreenChart: ImageVector? = null
