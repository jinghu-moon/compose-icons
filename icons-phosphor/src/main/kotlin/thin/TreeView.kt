package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TreeView: ImageVector
    get() {
        if (_treeView != null) return _treeView!!
        _treeView = phosphorThinIcon(
            name = "TreeView",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 176.000 148.000 L 208.000 148.000 C 214.627 148.000 220.000 142.627 220.000 136.000 L 220.000 104.000 C 220.000 97.373 214.627 92.000 208.000 92.000 L 176.000 92.000 C 169.373 92.000 164.000 97.373 164.000 104.000 L 164.000 116.000 L 84.000 116.000 L 84.000 76.000 L 96.000 76.000 C 102.627 76.000 108.000 70.627 108.000 64.000 L 108.000 32.000 C 108.000 25.373 102.627 20.000 96.000 20.000 L 64.000 20.000 C 57.373 20.000 52.000 25.373 52.000 32.000 L 52.000 64.000 C 52.000 70.627 57.373 76.000 64.000 76.000 L 76.000 76.000 L 76.000 192.000 C 76.000 203.046 84.954 212.000 96.000 212.000 L 164.000 212.000 L 164.000 224.000 C 164.000 230.627 169.373 236.000 176.000 236.000 L 208.000 236.000 C 214.627 236.000 220.000 230.627 220.000 224.000 L 220.000 192.000 C 220.000 185.373 214.627 180.000 208.000 180.000 L 176.000 180.000 C 169.373 180.000 164.000 185.373 164.000 192.000 L 164.000 204.000 L 96.000 204.000 C 89.373 204.000 84.000 198.627 84.000 192.000 L 84.000 124.000 L 164.000 124.000 L 164.000 136.000 C 164.000 142.627 169.373 148.000 176.000 148.000 ZM 60.000 64.000 L 60.000 32.000 C 60.000 29.791 61.791 28.000 64.000 28.000 L 96.000 28.000 C 98.209 28.000 100.000 29.791 100.000 32.000 L 100.000 64.000 C 100.000 66.209 98.209 68.000 96.000 68.000 L 64.000 68.000 C 61.791 68.000 60.000 66.209 60.000 64.000 ZM 172.000 192.000 C 172.000 189.791 173.791 188.000 176.000 188.000 L 208.000 188.000 C 210.209 188.000 212.000 189.791 212.000 192.000 L 212.000 224.000 C 212.000 226.209 210.209 228.000 208.000 228.000 L 176.000 228.000 C 173.791 228.000 172.000 226.209 172.000 224.000 ZM 172.000 104.000 C 172.000 101.791 173.791 100.000 176.000 100.000 L 208.000 100.000 C 210.209 100.000 212.000 101.791 212.000 104.000 L 212.000 136.000 C 212.000 138.209 210.209 140.000 208.000 140.000 L 176.000 140.000 C 173.791 140.000 172.000 138.209 172.000 136.000 Z"),
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
        return _treeView!!
    }

private var _treeView: ImageVector? = null
