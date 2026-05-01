package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SortAscending: ImageVector
    get() {
        if (_sortAscending != null) return _sortAscending!!
        _sortAscending = phosphorThinIcon(
            name = "SortAscending",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(124.0f, 128.0f),
                    PathNode.CurveTo(124.0f, 130.20914f, 122.20914f, 132.0f, 120.0f, 132.0f),
                    PathNode.LineTo(48.0f, 132.0f),
                    PathNode.CurveTo(45.79086f, 132.0f, 44.0f, 130.20914f, 44.0f, 128.0f),
                    PathNode.CurveTo(44.0f, 125.79086f, 45.79086f, 124.0f, 48.0f, 124.0f),
                    PathNode.LineTo(120.0f, 124.0f),
                    PathNode.CurveTo(122.20914f, 124.0f, 124.0f, 125.79086f, 124.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 68.0f),
                    PathNode.LineTo(184.0f, 68.0f),
                    PathNode.CurveTo(186.20914f, 68.0f, 188.0f, 66.20914f, 188.0f, 64.0f),
                    PathNode.CurveTo(188.0f, 61.79086f, 186.20914f, 60.0f, 184.0f, 60.0f),
                    PathNode.LineTo(48.0f, 60.0f),
                    PathNode.CurveTo(45.79086f, 60.0f, 44.0f, 61.79086f, 44.0f, 64.0f),
                    PathNode.CurveTo(44.0f, 66.20914f, 45.79086f, 68.0f, 48.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 188.0f),
                    PathNode.LineTo(48.0f, 188.0f),
                    PathNode.CurveTo(45.79086f, 188.0f, 44.0f, 189.79086f, 44.0f, 192.0f),
                    PathNode.CurveTo(44.0f, 194.20914f, 45.79086f, 196.0f, 48.0f, 196.0f),
                    PathNode.LineTo(104.0f, 196.0f),
                    PathNode.CurveTo(106.20914f, 196.0f, 108.0f, 194.20914f, 108.0f, 192.0f),
                    PathNode.CurveTo(108.0f, 189.79086f, 106.20914f, 188.0f, 104.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(226.83f, 165.17f),
                    PathNode.CurveTo(226.07973f, 164.41888f, 225.06163f, 163.99686f, 224.0f, 163.99686f),
                    PathNode.CurveTo(222.93837f, 163.99686f, 221.92027f, 164.41888f, 221.17f, 165.17f),
                    PathNode.LineTo(188.0f, 198.34f),
                    PathNode.LineTo(188.0f, 112.0f),
                    PathNode.CurveTo(188.0f, 109.79086f, 186.20914f, 108.0f, 184.0f, 108.0f),
                    PathNode.CurveTo(181.79086f, 108.0f, 180.0f, 109.79086f, 180.0f, 112.0f),
                    PathNode.LineTo(180.0f, 198.34f),
                    PathNode.LineTo(146.83f, 165.17f),
                    PathNode.CurveTo(145.26703f, 163.60704f, 142.73297f, 163.60704f, 141.17f, 165.17f),
                    PathNode.CurveTo(139.60704f, 166.73297f, 139.60704f, 169.26703f, 141.17f, 170.83f),
                    PathNode.LineTo(181.17f, 210.83f),
                    PathNode.CurveTo(181.92027f, 211.58112f, 182.93837f, 212.00314f, 184.0f, 212.00314f),
                    PathNode.CurveTo(185.06163f, 212.00314f, 186.07973f, 211.58112f, 186.83f, 210.83f),
                    PathNode.LineTo(226.83f, 170.83f),
                    PathNode.CurveTo(227.58112f, 170.07973f, 228.00314f, 169.06163f, 228.00314f, 168.0f),
                    PathNode.CurveTo(228.00314f, 166.93837f, 227.58112f, 165.92027f, 226.83f, 165.17f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _sortAscending!!
    }

private var _sortAscending: ImageVector? = null
