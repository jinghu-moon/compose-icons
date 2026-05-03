package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Door: ImageVector
    get() {
        if (_door != null) return _door!!
        _door = phosphorDuotoneIcon(
            name = "Door",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 40.0f),
                    PathNode.LineTo(200.0f, 224.0f),
                    PathNode.LineTo(56.0f, 224.0f),
                    PathNode.LineTo(56.0f, 40.0f),
                    PathNode.CurveTo(56.0f, 35.581722f, 59.581722f, 32.0f, 64.0f, 32.0f),
                    PathNode.LineTo(192.0f, 32.0f),
                    PathNode.CurveTo(196.41827f, 32.0f, 200.0f, 35.581722f, 200.0f, 40.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 216.0f),
                    PathNode.LineTo(208.0f, 216.0f),
                    PathNode.LineTo(208.0f, 40.0f),
                    PathNode.CurveTo(208.0f, 31.163445f, 200.83656f, 24.0f, 192.0f, 24.0f),
                    PathNode.LineTo(64.0f, 24.0f),
                    PathNode.CurveTo(55.163445f, 24.0f, 48.0f, 31.163445f, 48.0f, 40.0f),
                    PathNode.LineTo(48.0f, 216.0f),
                    PathNode.LineTo(24.0f, 216.0f),
                    PathNode.CurveTo(19.581722f, 216.0f, 16.0f, 219.58173f, 16.0f, 224.0f),
                    PathNode.CurveTo(16.0f, 228.41827f, 19.581722f, 232.0f, 24.0f, 232.0f),
                    PathNode.LineTo(232.0f, 232.0f),
                    PathNode.CurveTo(236.41827f, 232.0f, 240.0f, 228.41827f, 240.0f, 224.0f),
                    PathNode.CurveTo(240.0f, 219.58173f, 236.41827f, 216.0f, 232.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 40.0f),
                    PathNode.LineTo(192.0f, 40.0f),
                    PathNode.LineTo(192.0f, 216.0f),
                    PathNode.LineTo(64.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 132.0f),
                    PathNode.CurveTo(168.0f, 138.62741f, 162.62741f, 144.0f, 156.0f, 144.0f),
                    PathNode.CurveTo(149.37259f, 144.0f, 144.0f, 138.62741f, 144.0f, 132.0f),
                    PathNode.CurveTo(144.0f, 125.37258f, 149.37259f, 120.0f, 156.0f, 120.0f),
                    PathNode.CurveTo(162.62741f, 120.0f, 168.0f, 125.37258f, 168.0f, 132.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _door!!
    }

private var _door: ImageVector? = null
