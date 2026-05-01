package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MagnetStraight: ImageVector
    get() {
        if (_magnetStraight != null) return _magnetStraight!!
        _magnetStraight = phosphorFillIcon(
            name = "MagnetStraight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 40.0f),
                    PathNode.LineTo(160.0f, 40.0f),
                    PathNode.CurveTo(151.16344f, 40.0f, 144.0f, 47.163445f, 144.0f, 56.0f),
                    PathNode.LineTo(144.0f, 144.0f),
                    PathNode.CurveTo(144.0f, 152.83656f, 136.83656f, 160.0f, 128.0f, 160.0f),
                    PathNode.CurveTo(119.163445f, 160.0f, 112.0f, 152.83656f, 112.0f, 144.0f),
                    PathNode.LineTo(112.0f, 56.0f),
                    PathNode.CurveTo(112.0f, 47.163445f, 104.836555f, 40.0f, 96.0f, 40.0f),
                    PathNode.LineTo(56.0f, 40.0f),
                    PathNode.CurveTo(47.163445f, 40.0f, 40.0f, 47.163445f, 40.0f, 56.0f),
                    PathNode.LineTo(40.0f, 144.0f),
                    PathNode.CurveTo(40.0f, 192.60106f, 79.39894f, 232.0f, 128.0f, 232.0f),
                    PathNode.LineTo(128.67f, 232.0f),
                    PathNode.CurveTo(176.82f, 231.64f, 216.0f, 191.71f, 216.0f, 143.0f),
                    PathNode.LineTo(216.0f, 56.0f),
                    PathNode.CurveTo(216.0f, 47.163445f, 208.83656f, 40.0f, 200.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 56.0f),
                    PathNode.LineTo(200.0f, 96.0f),
                    PathNode.LineTo(160.0f, 96.0f),
                    PathNode.LineTo(160.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 56.0f),
                    PathNode.LineTo(96.0f, 96.0f),
                    PathNode.LineTo(56.0f, 96.0f),
                    PathNode.LineTo(56.0f, 56.0f),
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
        return _magnetStraight!!
    }

private var _magnetStraight: ImageVector? = null
