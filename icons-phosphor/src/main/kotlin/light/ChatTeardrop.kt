package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChatTeardrop: ImageVector
    get() {
        if (_chatTeardrop != null) return _chatTeardrop!!
        _chatTeardrop = phosphorLightIcon(
            name = "ChatTeardrop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(132.0f, 26.0f),
                    PathNode.CurveTo(77.90122f, 26.060621f, 34.06062f, 69.90122f, 34.0f, 124.0f),
                    PathNode.LineTo(34.0f, 208.0f),
                    PathNode.CurveTo(34.0f, 215.73198f, 40.268013f, 222.0f, 48.0f, 222.0f),
                    PathNode.LineTo(132.0f, 222.0f),
                    PathNode.CurveTo(186.1239f, 222.0f, 230.0f, 178.1239f, 230.0f, 124.0f),
                    PathNode.CurveTo(230.0f, 69.87609f, 186.1239f, 26.0f, 132.0f, 26.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 210.0f),
                    PathNode.LineTo(48.0f, 210.0f),
                    PathNode.CurveTo(46.89543f, 210.0f, 46.0f, 209.10457f, 46.0f, 208.0f),
                    PathNode.LineTo(46.0f, 124.0f),
                    PathNode.CurveTo(46.0f, 76.50351f, 84.50351f, 38.0f, 132.0f, 38.0f),
                    PathNode.CurveTo(179.49649f, 38.0f, 218.0f, 76.50351f, 218.0f, 124.0f),
                    PathNode.CurveTo(218.0f, 171.49649f, 179.49649f, 210.0f, 132.0f, 210.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _chatTeardrop!!
    }

private var _chatTeardrop: ImageVector? = null
