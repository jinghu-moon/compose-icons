package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Note: ImageVector
    get() {
        if (_note != null) return _note!!
        _note = phosphorBoldIcon(
            name = "Note",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(84.0f, 108.0f),
                    PathNode.CurveTo(84.0f, 101.37258f, 89.37258f, 96.0f, 96.0f, 96.0f),
                    PathNode.LineTo(160.0f, 96.0f),
                    PathNode.CurveTo(166.62741f, 96.0f, 172.0f, 101.37258f, 172.0f, 108.0f),
                    PathNode.CurveTo(172.0f, 114.62742f, 166.62741f, 120.0f, 160.0f, 120.0f),
                    PathNode.LineTo(96.0f, 120.0f),
                    PathNode.CurveTo(89.37258f, 120.0f, 84.0f, 114.62742f, 84.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 136.0f),
                    PathNode.LineTo(96.0f, 136.0f),
                    PathNode.CurveTo(89.37258f, 136.0f, 84.0f, 141.37259f, 84.0f, 148.0f),
                    PathNode.CurveTo(84.0f, 154.62741f, 89.37258f, 160.0f, 96.0f, 160.0f),
                    PathNode.LineTo(116.0f, 160.0f),
                    PathNode.CurveTo(122.62742f, 160.0f, 128.0f, 154.62741f, 128.0f, 148.0f),
                    PathNode.CurveTo(128.0f, 141.37259f, 122.62742f, 136.0f, 116.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 48.0f),
                    PathNode.LineTo(228.0f, 156.69f),
                    PathNode.CurveTo(228.01437f, 161.99698f, 225.90411f, 167.08894f, 222.14f, 170.83f),
                    PathNode.LineTo(170.83f, 222.14f),
                    PathNode.CurveTo(167.08894f, 225.90411f, 161.99698f, 228.01437f, 156.69f, 228.0f),
                    PathNode.LineTo(48.0f, 228.0f),
                    PathNode.CurveTo(36.954304f, 228.0f, 28.0f, 219.0457f, 28.0f, 208.0f),
                    PathNode.LineTo(28.0f, 48.0f),
                    PathNode.CurveTo(28.0f, 36.954304f, 36.954304f, 28.0f, 48.0f, 28.0f),
                    PathNode.LineTo(208.0f, 28.0f),
                    PathNode.CurveTo(219.0457f, 28.0f, 228.0f, 36.954304f, 228.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 204.0f),
                    PathNode.LineTo(144.0f, 204.0f),
                    PathNode.LineTo(144.0f, 156.0f),
                    PathNode.CurveTo(144.0f, 149.37259f, 149.37259f, 144.0f, 156.0f, 144.0f),
                    PathNode.LineTo(204.0f, 144.0f),
                    PathNode.LineTo(204.0f, 52.0f),
                    PathNode.LineTo(52.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(191.0f, 168.0f),
                    PathNode.LineTo(168.0f, 168.0f),
                    PathNode.LineTo(168.0f, 191.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _note!!
    }

private var _note: ImageVector? = null
