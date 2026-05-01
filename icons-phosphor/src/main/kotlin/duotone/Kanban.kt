package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Kanban: ImageVector
    get() {
        if (_kanban != null) return _kanban!!
        _kanban = phosphorDuotoneIcon(
            name = "Kanban",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 56.0f),
                    PathNode.LineTo(216.0f, 120.0f),
                    PathNode.LineTo(160.0f, 120.0f),
                    PathNode.LineTo(160.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 208.0f),
                    PathNode.CurveTo(40.0f, 212.41827f, 43.581722f, 216.0f, 48.0f, 216.0f),
                    PathNode.LineTo(88.0f, 216.0f),
                    PathNode.CurveTo(92.41828f, 216.0f, 96.0f, 212.41827f, 96.0f, 208.0f),
                    PathNode.LineTo(96.0f, 120.0f),
                    PathNode.LineTo(40.0f, 120.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 48.0f),
                    PathNode.LineTo(40.0f, 48.0f),
                    PathNode.CurveTo(35.581722f, 48.0f, 32.0f, 51.581722f, 32.0f, 56.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(88.0f, 224.0f),
                    PathNode.CurveTo(96.836555f, 224.0f, 104.0f, 216.83656f, 104.0f, 208.0f),
                    PathNode.LineTo(104.0f, 160.0f),
                    PathNode.LineTo(152.0f, 160.0f),
                    PathNode.LineTo(152.0f, 176.0f),
                    PathNode.CurveTo(152.0f, 184.83656f, 159.16344f, 192.0f, 168.0f, 192.0f),
                    PathNode.LineTo(208.0f, 192.0f),
                    PathNode.CurveTo(216.83656f, 192.0f, 224.0f, 184.83656f, 224.0f, 176.0f),
                    PathNode.LineTo(224.0f, 56.0f),
                    PathNode.CurveTo(224.0f, 51.581722f, 220.41827f, 48.0f, 216.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 112.0f),
                    PathNode.LineTo(168.0f, 112.0f),
                    PathNode.LineTo(168.0f, 64.0f),
                    PathNode.LineTo(208.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 64.0f),
                    PathNode.LineTo(88.0f, 112.0f),
                    PathNode.LineTo(48.0f, 112.0f),
                    PathNode.LineTo(48.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.LineTo(48.0f, 128.0f),
                    PathNode.LineTo(88.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 144.0f),
                    PathNode.LineTo(104.0f, 64.0f),
                    PathNode.LineTo(152.0f, 64.0f),
                    PathNode.LineTo(152.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 176.0f),
                    PathNode.LineTo(168.0f, 128.0f),
                    PathNode.LineTo(208.0f, 128.0f),
                    PathNode.LineTo(208.0f, 176.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _kanban!!
    }

private var _kanban: ImageVector? = null
