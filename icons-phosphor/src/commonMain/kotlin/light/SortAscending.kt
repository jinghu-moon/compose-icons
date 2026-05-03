package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SortAscending: ImageVector
    get() {
        if (_sortAscending != null) return _sortAscending!!
        _sortAscending = phosphorLightIcon(
            name = "SortAscending",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(126.0f, 128.0f),
                    PathNode.CurveTo(126.0f, 131.3137f, 123.313705f, 134.0f, 120.0f, 134.0f),
                    PathNode.LineTo(48.0f, 134.0f),
                    PathNode.CurveTo(44.68629f, 134.0f, 42.0f, 131.3137f, 42.0f, 128.0f),
                    PathNode.CurveTo(42.0f, 124.686295f, 44.68629f, 122.0f, 48.0f, 122.0f),
                    PathNode.LineTo(120.0f, 122.0f),
                    PathNode.CurveTo(123.313705f, 122.0f, 126.0f, 124.686295f, 126.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 70.0f),
                    PathNode.LineTo(184.0f, 70.0f),
                    PathNode.CurveTo(187.3137f, 70.0f, 190.0f, 67.313705f, 190.0f, 64.0f),
                    PathNode.CurveTo(190.0f, 60.68629f, 187.3137f, 58.0f, 184.0f, 58.0f),
                    PathNode.LineTo(48.0f, 58.0f),
                    PathNode.CurveTo(44.68629f, 58.0f, 42.0f, 60.68629f, 42.0f, 64.0f),
                    PathNode.CurveTo(42.0f, 67.313705f, 44.68629f, 70.0f, 48.0f, 70.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 186.0f),
                    PathNode.LineTo(48.0f, 186.0f),
                    PathNode.CurveTo(44.68629f, 186.0f, 42.0f, 188.6863f, 42.0f, 192.0f),
                    PathNode.CurveTo(42.0f, 195.3137f, 44.68629f, 198.0f, 48.0f, 198.0f),
                    PathNode.LineTo(104.0f, 198.0f),
                    PathNode.CurveTo(107.313705f, 198.0f, 110.0f, 195.3137f, 110.0f, 192.0f),
                    PathNode.CurveTo(110.0f, 188.6863f, 107.313705f, 186.0f, 104.0f, 186.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.24f, 163.76f),
                    PathNode.CurveTo(225.89746f, 161.42038f, 222.10254f, 161.42038f, 219.76f, 163.76f),
                    PathNode.LineTo(190.0f, 193.51f),
                    PathNode.LineTo(190.0f, 112.0f),
                    PathNode.CurveTo(190.0f, 108.686295f, 187.3137f, 106.0f, 184.0f, 106.0f),
                    PathNode.CurveTo(180.6863f, 106.0f, 178.0f, 108.686295f, 178.0f, 112.0f),
                    PathNode.LineTo(178.0f, 193.51f),
                    PathNode.LineTo(148.24f, 163.76f),
                    PathNode.CurveTo(145.87592f, 161.55713f, 142.19193f, 161.62213f, 139.90703f, 163.90703f),
                    PathNode.CurveTo(137.62213f, 166.19193f, 137.55713f, 169.87592f, 139.76f, 172.24f),
                    PathNode.LineTo(179.76f, 212.24f),
                    PathNode.CurveTo(182.10254f, 214.57962f, 185.89746f, 214.57962f, 188.24f, 212.24f),
                    PathNode.LineTo(228.24f, 172.24f),
                    PathNode.CurveTo(230.57962f, 169.89746f, 230.57962f, 166.10254f, 228.24f, 163.76f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _sortAscending!!
    }

private var _sortAscending: ImageVector? = null
