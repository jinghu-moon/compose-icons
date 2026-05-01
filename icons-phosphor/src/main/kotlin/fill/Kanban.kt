package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Kanban: ImageVector
    get() {
        if (_kanban != null) return _kanban!!
        _kanban = phosphorFillIcon(
            name = "Kanban",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(160.0f, 56.0f),
                    PathNode.LineTo(160.0f, 152.0f),
                    PathNode.CurveTo(160.0f, 156.41827f, 156.41827f, 160.0f, 152.0f, 160.0f),
                    PathNode.LineTo(112.0f, 160.0f),
                    PathNode.CurveTo(107.58172f, 160.0f, 104.0f, 156.41827f, 104.0f, 152.0f),
                    PathNode.LineTo(104.0f, 56.0f),
                    PathNode.CurveTo(104.0f, 51.581722f, 107.58172f, 48.0f, 112.0f, 48.0f),
                    PathNode.LineTo(152.0f, 48.0f),
                    PathNode.CurveTo(156.41827f, 48.0f, 160.0f, 51.581722f, 160.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 48.0f),
                    PathNode.LineTo(184.0f, 48.0f),
                    PathNode.CurveTo(179.58173f, 48.0f, 176.0f, 51.581722f, 176.0f, 56.0f),
                    PathNode.LineTo(176.0f, 108.0f),
                    PathNode.CurveTo(176.0f, 110.20914f, 177.79086f, 112.0f, 180.0f, 112.0f),
                    PathNode.LineTo(228.0f, 112.0f),
                    PathNode.CurveTo(230.20914f, 112.0f, 232.0f, 110.20914f, 232.0f, 108.0f),
                    PathNode.LineTo(232.0f, 56.0f),
                    PathNode.CurveTo(232.0f, 51.581722f, 228.41827f, 48.0f, 224.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 128.0f),
                    PathNode.LineTo(180.0f, 128.0f),
                    PathNode.CurveTo(177.79086f, 128.0f, 176.0f, 129.79086f, 176.0f, 132.0f),
                    PathNode.LineTo(176.0f, 176.0f),
                    PathNode.CurveTo(176.0f, 184.83656f, 183.16344f, 192.0f, 192.0f, 192.0f),
                    PathNode.LineTo(216.0f, 192.0f),
                    PathNode.CurveTo(224.83656f, 192.0f, 232.0f, 184.83656f, 232.0f, 176.0f),
                    PathNode.LineTo(232.0f, 132.0f),
                    PathNode.CurveTo(232.0f, 129.79086f, 230.20914f, 128.0f, 228.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 48.0f),
                    PathNode.LineTo(40.0f, 48.0f),
                    PathNode.CurveTo(35.581722f, 48.0f, 32.0f, 51.581722f, 32.0f, 56.0f),
                    PathNode.LineTo(32.0f, 108.0f),
                    PathNode.CurveTo(32.0f, 110.20914f, 33.79086f, 112.0f, 36.0f, 112.0f),
                    PathNode.LineTo(84.0f, 112.0f),
                    PathNode.CurveTo(86.20914f, 112.0f, 88.0f, 110.20914f, 88.0f, 108.0f),
                    PathNode.LineTo(88.0f, 56.0f),
                    PathNode.CurveTo(88.0f, 51.581722f, 84.41828f, 48.0f, 80.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 128.0f),
                    PathNode.LineTo(36.0f, 128.0f),
                    PathNode.CurveTo(33.79086f, 128.0f, 32.0f, 129.79086f, 32.0f, 132.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(72.0f, 224.0f),
                    PathNode.CurveTo(80.836555f, 224.0f, 88.0f, 216.83656f, 88.0f, 208.0f),
                    PathNode.LineTo(88.0f, 132.0f),
                    PathNode.CurveTo(88.0f, 129.79086f, 86.20914f, 128.0f, 84.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _kanban!!
    }

private var _kanban: ImageVector? = null
