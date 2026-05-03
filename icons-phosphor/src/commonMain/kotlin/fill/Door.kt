package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Door: ImageVector
    get() {
        if (_door != null) return _door!!
        _door = phosphorFillIcon(
            name = "Door",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
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
                    PathNode.MoveTo(164.0f, 144.0f),
                    PathNode.CurveTo(157.37259f, 144.0f, 152.0f, 138.62741f, 152.0f, 132.0f),
                    PathNode.CurveTo(152.0f, 125.37258f, 157.37259f, 120.0f, 164.0f, 120.0f),
                    PathNode.CurveTo(170.62741f, 120.0f, 176.0f, 125.37258f, 176.0f, 132.0f),
                    PathNode.CurveTo(176.0f, 138.62741f, 170.62741f, 144.0f, 164.0f, 144.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _door!!
    }

private var _door: ImageVector? = null
