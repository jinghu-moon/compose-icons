package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SortDescending: ImageVector
    get() {
        if (_sortDescending != null) return _sortDescending!!
        _sortDescending = phosphorLightIcon(
            name = "SortDescending",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(42.0f, 128.0f),
                    PathNode.CurveTo(42.0f, 124.686295f, 44.68629f, 122.0f, 48.0f, 122.0f),
                    PathNode.LineTo(120.0f, 122.0f),
                    PathNode.CurveTo(123.313705f, 122.0f, 126.0f, 124.686295f, 126.0f, 128.0f),
                    PathNode.CurveTo(126.0f, 131.3137f, 123.313705f, 134.0f, 120.0f, 134.0f),
                    PathNode.LineTo(48.0f, 134.0f),
                    PathNode.CurveTo(44.68629f, 134.0f, 42.0f, 131.3137f, 42.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 70.0f),
                    PathNode.LineTo(104.0f, 70.0f),
                    PathNode.CurveTo(107.313705f, 70.0f, 110.0f, 67.313705f, 110.0f, 64.0f),
                    PathNode.CurveTo(110.0f, 60.68629f, 107.313705f, 58.0f, 104.0f, 58.0f),
                    PathNode.LineTo(48.0f, 58.0f),
                    PathNode.CurveTo(44.68629f, 58.0f, 42.0f, 60.68629f, 42.0f, 64.0f),
                    PathNode.CurveTo(42.0f, 67.313705f, 44.68629f, 70.0f, 48.0f, 70.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 186.0f),
                    PathNode.LineTo(48.0f, 186.0f),
                    PathNode.CurveTo(44.68629f, 186.0f, 42.0f, 188.6863f, 42.0f, 192.0f),
                    PathNode.CurveTo(42.0f, 195.3137f, 44.68629f, 198.0f, 48.0f, 198.0f),
                    PathNode.LineTo(184.0f, 198.0f),
                    PathNode.CurveTo(187.3137f, 198.0f, 190.0f, 195.3137f, 190.0f, 192.0f),
                    PathNode.CurveTo(190.0f, 188.6863f, 187.3137f, 186.0f, 184.0f, 186.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.24f, 83.76f),
                    PathNode.LineTo(188.24f, 43.76f),
                    PathNode.CurveTo(185.89746f, 41.420372f, 182.10254f, 41.420372f, 179.76f, 43.76f),
                    PathNode.LineTo(139.76f, 83.76f),
                    PathNode.CurveTo(137.55713f, 86.12408f, 137.62213f, 89.808075f, 139.90703f, 92.09297f),
                    PathNode.CurveTo(142.19193f, 94.37787f, 145.87592f, 94.44287f, 148.24f, 92.24f),
                    PathNode.LineTo(178.0f, 62.49f),
                    PathNode.LineTo(178.0f, 144.0f),
                    PathNode.CurveTo(178.0f, 147.3137f, 180.6863f, 150.0f, 184.0f, 150.0f),
                    PathNode.CurveTo(187.3137f, 150.0f, 190.0f, 147.3137f, 190.0f, 144.0f),
                    PathNode.LineTo(190.0f, 62.49f),
                    PathNode.LineTo(219.76f, 92.24f),
                    PathNode.CurveTo(222.12408f, 94.44287f, 225.80807f, 94.37787f, 228.09297f, 92.09297f),
                    PathNode.CurveTo(230.37787f, 89.808075f, 230.44287f, 86.12408f, 228.24f, 83.76f),
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
        return _sortDescending!!
    }

private var _sortDescending: ImageVector? = null
