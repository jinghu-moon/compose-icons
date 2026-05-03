package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TreeStructure: ImageVector
    get() {
        if (_treeStructure != null) return _treeStructure!!
        _treeStructure = phosphorThinIcon(
            name = "TreeStructure",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 160.000 108.000 L 208.000 108.000 C 214.627 108.000 220.000 102.627 220.000 96.000 L 220.000 48.000 C 220.000 41.373 214.627 36.000 208.000 36.000 L 160.000 36.000 C 153.373 36.000 148.000 41.373 148.000 48.000 L 148.000 68.000 L 128.000 68.000 C 116.954 68.000 108.000 76.954 108.000 88.000 L 108.000 124.000 L 68.000 124.000 L 68.000 112.000 C 68.000 105.373 62.627 100.000 56.000 100.000 L 24.000 100.000 C 17.373 100.000 12.000 105.373 12.000 112.000 L 12.000 144.000 C 12.000 150.627 17.373 156.000 24.000 156.000 L 56.000 156.000 C 62.627 156.000 68.000 150.627 68.000 144.000 L 68.000 132.000 L 108.000 132.000 L 108.000 168.000 C 108.000 179.046 116.954 188.000 128.000 188.000 L 148.000 188.000 L 148.000 208.000 C 148.000 214.627 153.373 220.000 160.000 220.000 L 208.000 220.000 C 214.627 220.000 220.000 214.627 220.000 208.000 L 220.000 160.000 C 220.000 153.373 214.627 148.000 208.000 148.000 L 160.000 148.000 C 153.373 148.000 148.000 153.373 148.000 160.000 L 148.000 180.000 L 128.000 180.000 C 121.373 180.000 116.000 174.627 116.000 168.000 L 116.000 88.000 C 116.000 81.373 121.373 76.000 128.000 76.000 L 148.000 76.000 L 148.000 96.000 C 148.000 102.627 153.373 108.000 160.000 108.000 ZM 60.000 144.000 C 60.000 146.209 58.209 148.000 56.000 148.000 L 24.000 148.000 C 21.791 148.000 20.000 146.209 20.000 144.000 L 20.000 112.000 C 20.000 109.791 21.791 108.000 24.000 108.000 L 56.000 108.000 C 58.209 108.000 60.000 109.791 60.000 112.000 ZM 156.000 160.000 C 156.000 157.791 157.791 156.000 160.000 156.000 L 208.000 156.000 C 210.209 156.000 212.000 157.791 212.000 160.000 L 212.000 208.000 C 212.000 210.209 210.209 212.000 208.000 212.000 L 160.000 212.000 C 157.791 212.000 156.000 210.209 156.000 208.000 ZM 156.000 48.000 C 156.000 45.791 157.791 44.000 160.000 44.000 L 208.000 44.000 C 210.209 44.000 212.000 45.791 212.000 48.000 L 212.000 96.000 C 212.000 98.209 210.209 100.000 208.000 100.000 L 160.000 100.000 C 157.791 100.000 156.000 98.209 156.000 96.000 Z"),
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
        return _treeStructure!!
    }

private var _treeStructure: ImageVector? = null
