package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TrashSimple: ImageVector
    get() {
        if (_trashSimple != null) return _trashSimple!!
        _trashSimple = phosphorBoldIcon(
            name = "TrashSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 48.0f),
                    PathNode.LineTo(40.0f, 48.0f),
                    PathNode.CurveTo(33.37258f, 48.0f, 28.0f, 53.37258f, 28.0f, 60.0f),
                    PathNode.CurveTo(28.0f, 66.62742f, 33.37258f, 72.0f, 40.0f, 72.0f),
                    PathNode.LineTo(44.0f, 72.0f),
                    PathNode.LineTo(44.0f, 208.0f),
                    PathNode.CurveTo(44.0f, 219.0457f, 52.954304f, 228.0f, 64.0f, 228.0f),
                    PathNode.LineTo(192.0f, 228.0f),
                    PathNode.CurveTo(203.0457f, 228.0f, 212.0f, 219.0457f, 212.0f, 208.0f),
                    PathNode.LineTo(212.0f, 72.0f),
                    PathNode.LineTo(216.0f, 72.0f),
                    PathNode.CurveTo(222.62741f, 72.0f, 228.0f, 66.62742f, 228.0f, 60.0f),
                    PathNode.CurveTo(228.0f, 53.37258f, 222.62741f, 48.0f, 216.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 204.0f),
                    PathNode.LineTo(68.0f, 204.0f),
                    PathNode.LineTo(68.0f, 72.0f),
                    PathNode.LineTo(188.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 20.0f),
                    PathNode.CurveTo(76.0f, 13.372583f, 81.37258f, 8.0f, 88.0f, 8.0f),
                    PathNode.LineTo(168.0f, 8.0f),
                    PathNode.CurveTo(174.62741f, 8.0f, 180.0f, 13.372583f, 180.0f, 20.0f),
                    PathNode.CurveTo(180.0f, 26.627417f, 174.62741f, 32.0f, 168.0f, 32.0f),
                    PathNode.LineTo(88.0f, 32.0f),
                    PathNode.CurveTo(81.37258f, 32.0f, 76.0f, 26.627417f, 76.0f, 20.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _trashSimple!!
    }

private var _trashSimple: ImageVector? = null
