package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SortDescending: ImageVector
    get() {
        if (_sortDescending != null) return _sortDescending!!
        _sortDescending = phosphorThinIcon(
            name = "SortDescending",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(44.0f, 128.0f),
                    PathNode.CurveTo(44.0f, 125.79086f, 45.79086f, 124.0f, 48.0f, 124.0f),
                    PathNode.LineTo(120.0f, 124.0f),
                    PathNode.CurveTo(122.20914f, 124.0f, 124.0f, 125.79086f, 124.0f, 128.0f),
                    PathNode.CurveTo(124.0f, 130.20914f, 122.20914f, 132.0f, 120.0f, 132.0f),
                    PathNode.LineTo(48.0f, 132.0f),
                    PathNode.CurveTo(45.79086f, 132.0f, 44.0f, 130.20914f, 44.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 68.0f),
                    PathNode.LineTo(104.0f, 68.0f),
                    PathNode.CurveTo(106.20914f, 68.0f, 108.0f, 66.20914f, 108.0f, 64.0f),
                    PathNode.CurveTo(108.0f, 61.79086f, 106.20914f, 60.0f, 104.0f, 60.0f),
                    PathNode.LineTo(48.0f, 60.0f),
                    PathNode.CurveTo(45.79086f, 60.0f, 44.0f, 61.79086f, 44.0f, 64.0f),
                    PathNode.CurveTo(44.0f, 66.20914f, 45.79086f, 68.0f, 48.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 188.0f),
                    PathNode.LineTo(48.0f, 188.0f),
                    PathNode.CurveTo(45.79086f, 188.0f, 44.0f, 189.79086f, 44.0f, 192.0f),
                    PathNode.CurveTo(44.0f, 194.20914f, 45.79086f, 196.0f, 48.0f, 196.0f),
                    PathNode.LineTo(184.0f, 196.0f),
                    PathNode.CurveTo(186.20914f, 196.0f, 188.0f, 194.20914f, 188.0f, 192.0f),
                    PathNode.CurveTo(188.0f, 189.79086f, 186.20914f, 188.0f, 184.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(226.83f, 85.17f),
                    PathNode.LineTo(186.83f, 45.17f),
                    PathNode.CurveTo(186.07973f, 44.41889f, 185.06163f, 43.996853f, 184.0f, 43.996853f),
                    PathNode.CurveTo(182.93837f, 43.996853f, 181.92027f, 44.41889f, 181.17f, 45.17f),
                    PathNode.LineTo(141.17f, 85.17f),
                    PathNode.CurveTo(139.60704f, 86.73296f, 139.60704f, 89.26704f, 141.17f, 90.83f),
                    PathNode.CurveTo(142.73297f, 92.39297f, 145.26703f, 92.39297f, 146.83f, 90.83f),
                    PathNode.LineTo(180.0f, 57.66f),
                    PathNode.LineTo(180.0f, 144.0f),
                    PathNode.CurveTo(180.0f, 146.20914f, 181.79086f, 148.0f, 184.0f, 148.0f),
                    PathNode.CurveTo(186.20914f, 148.0f, 188.0f, 146.20914f, 188.0f, 144.0f),
                    PathNode.LineTo(188.0f, 57.66f),
                    PathNode.LineTo(221.17f, 90.83f),
                    PathNode.CurveTo(222.73297f, 92.39297f, 225.26703f, 92.39297f, 226.83f, 90.83f),
                    PathNode.CurveTo(228.39296f, 89.26704f, 228.39296f, 86.73296f, 226.83f, 85.17f),
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
        return _sortDescending!!
    }

private var _sortDescending: ImageVector? = null
