package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SelectionBackground: ImageVector
    get() {
        if (_selectionBackground != null) return _selectionBackground!!
        _selectionBackground = phosphorThinIcon(
            name = "SelectionBackground",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 160.000 84.000 L 48.000 84.000 C 41.373 84.000 36.000 89.373 36.000 96.000 L 36.000 208.000 C 36.000 214.627 41.373 220.000 48.000 220.000 L 160.000 220.000 C 166.627 220.000 172.000 214.627 172.000 208.000 L 172.000 96.000 C 172.000 89.373 166.627 84.000 160.000 84.000 ZM 164.000 208.000 C 164.000 210.209 162.209 212.000 160.000 212.000 L 48.000 212.000 C 45.791 212.000 44.000 210.209 44.000 208.000 L 44.000 96.000 C 44.000 93.791 45.791 92.000 48.000 92.000 L 160.000 92.000 C 162.209 92.000 164.000 93.791 164.000 96.000 ZM 140.000 40.000 C 140.000 37.791 141.791 36.000 144.000 36.000 L 160.000 36.000 C 162.209 36.000 164.000 37.791 164.000 40.000 C 164.000 42.209 162.209 44.000 160.000 44.000 L 144.000 44.000 C 141.791 44.000 140.000 42.209 140.000 40.000 ZM 220.000 48.000 L 220.000 56.000 C 220.000 58.209 218.209 60.000 216.000 60.000 C 213.791 60.000 212.000 58.209 212.000 56.000 L 212.000 48.000 C 212.000 45.791 210.209 44.000 208.000 44.000 L 200.000 44.000 C 197.791 44.000 196.000 42.209 196.000 40.000 C 196.000 37.791 197.791 36.000 200.000 36.000 L 208.000 36.000 C 214.627 36.000 220.000 41.373 220.000 48.000 ZM 220.000 96.000 L 220.000 112.000 C 220.000 114.209 218.209 116.000 216.000 116.000 C 213.791 116.000 212.000 114.209 212.000 112.000 L 212.000 96.000 C 212.000 93.791 213.791 92.000 216.000 92.000 C 218.209 92.000 220.000 93.791 220.000 96.000 ZM 220.000 152.000 L 220.000 160.000 C 220.000 166.627 214.627 172.000 208.000 172.000 L 200.000 172.000 C 197.791 172.000 196.000 170.209 196.000 168.000 C 196.000 165.791 197.791 164.000 200.000 164.000 L 208.000 164.000 C 210.209 164.000 212.000 162.209 212.000 160.000 L 212.000 152.000 C 212.000 149.791 213.791 148.000 216.000 148.000 C 218.209 148.000 220.000 149.791 220.000 152.000 ZM 84.000 56.000 L 84.000 48.000 C 84.000 41.373 89.373 36.000 96.000 36.000 L 104.000 36.000 C 106.209 36.000 108.000 37.791 108.000 40.000 C 108.000 42.209 106.209 44.000 104.000 44.000 L 96.000 44.000 C 93.791 44.000 92.000 45.791 92.000 48.000 L 92.000 56.000 C 92.000 58.209 90.209 60.000 88.000 60.000 C 85.791 60.000 84.000 58.209 84.000 56.000 Z"),
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
        return _selectionBackground!!
    }

private var _selectionBackground: ImageVector? = null
