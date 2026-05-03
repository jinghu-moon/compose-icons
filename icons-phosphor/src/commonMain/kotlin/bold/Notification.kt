package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Notification: ImageVector
    get() {
        if (_notification != null) return _notification!!
        _notification = phosphorBoldIcon(
            name = "Notification",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.0f, 132.0f),
                    PathNode.LineTo(220.0f, 208.0f),
                    PathNode.CurveTo(220.0f, 219.0457f, 211.0457f, 228.0f, 200.0f, 228.0f),
                    PathNode.LineTo(48.0f, 228.0f),
                    PathNode.CurveTo(36.954304f, 228.0f, 28.0f, 219.0457f, 28.0f, 208.0f),
                    PathNode.LineTo(28.0f, 56.0f),
                    PathNode.CurveTo(28.0f, 44.954304f, 36.954304f, 36.0f, 48.0f, 36.0f),
                    PathNode.LineTo(124.0f, 36.0f),
                    PathNode.CurveTo(130.62741f, 36.0f, 136.0f, 41.37258f, 136.0f, 48.0f),
                    PathNode.CurveTo(136.0f, 54.62742f, 130.62741f, 60.0f, 124.0f, 60.0f),
                    PathNode.LineTo(52.0f, 60.0f),
                    PathNode.LineTo(52.0f, 204.0f),
                    PathNode.LineTo(196.0f, 204.0f),
                    PathNode.LineTo(196.0f, 132.0f),
                    PathNode.CurveTo(196.0f, 125.37258f, 201.37259f, 120.0f, 208.0f, 120.0f),
                    PathNode.CurveTo(214.62741f, 120.0f, 220.0f, 125.37258f, 220.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 60.0f),
                    PathNode.CurveTo(236.0f, 82.09139f, 218.09138f, 100.0f, 196.0f, 100.0f),
                    PathNode.CurveTo(173.90862f, 100.0f, 156.0f, 82.09139f, 156.0f, 60.0f),
                    PathNode.CurveTo(156.0f, 37.90861f, 173.90862f, 20.0f, 196.0f, 20.0f),
                    PathNode.CurveTo(218.09138f, 20.0f, 236.0f, 37.90861f, 236.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 60.0f),
                    PathNode.CurveTo(212.0f, 51.163445f, 204.83656f, 44.0f, 196.0f, 44.0f),
                    PathNode.CurveTo(187.16344f, 44.0f, 180.0f, 51.163445f, 180.0f, 60.0f),
                    PathNode.CurveTo(180.0f, 68.836555f, 187.16344f, 76.0f, 196.0f, 76.0f),
                    PathNode.CurveTo(204.83656f, 76.0f, 212.0f, 68.836555f, 212.0f, 60.0f),
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
        return _notification!!
    }

private var _notification: ImageVector? = null
