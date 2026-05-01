package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChatTeardropDots: ImageVector
    get() {
        if (_chatTeardropDots != null) return _chatTeardropDots!!
        _chatTeardropDots = phosphorLightIcon(
            name = "ChatTeardropDots",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(142.0f, 128.0f),
                    PathNode.CurveTo(142.0f, 133.52284f, 137.52284f, 138.0f, 132.0f, 138.0f),
                    PathNode.CurveTo(126.47715f, 138.0f, 122.0f, 133.52284f, 122.0f, 128.0f),
                    PathNode.CurveTo(122.0f, 122.47715f, 126.47715f, 118.0f, 132.0f, 118.0f),
                    PathNode.CurveTo(137.52284f, 118.0f, 142.0f, 122.47715f, 142.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 118.0f),
                    PathNode.CurveTo(82.47715f, 118.0f, 78.0f, 122.47715f, 78.0f, 128.0f),
                    PathNode.CurveTo(78.0f, 133.52284f, 82.47715f, 138.0f, 88.0f, 138.0f),
                    PathNode.CurveTo(93.52285f, 138.0f, 98.0f, 133.52284f, 98.0f, 128.0f),
                    PathNode.CurveTo(98.0f, 122.47715f, 93.52285f, 118.0f, 88.0f, 118.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 118.0f),
                    PathNode.CurveTo(170.47716f, 118.0f, 166.0f, 122.47715f, 166.0f, 128.0f),
                    PathNode.CurveTo(166.0f, 133.52284f, 170.47716f, 138.0f, 176.0f, 138.0f),
                    PathNode.CurveTo(181.52284f, 138.0f, 186.0f, 133.52284f, 186.0f, 128.0f),
                    PathNode.CurveTo(186.0f, 122.47715f, 181.52284f, 118.0f, 176.0f, 118.0f),
                    PathNode.Close,
                    PathNode.MoveTo(230.0f, 124.0f),
                    PathNode.CurveTo(229.93938f, 178.09877f, 186.09877f, 221.93938f, 132.0f, 222.0f),
                    PathNode.LineTo(48.0f, 222.0f),
                    PathNode.CurveTo(40.268013f, 222.0f, 34.0f, 215.73198f, 34.0f, 208.0f),
                    PathNode.LineTo(34.0f, 124.0f),
                    PathNode.CurveTo(34.0f, 69.87609f, 77.87609f, 26.0f, 132.0f, 26.0f),
                    PathNode.CurveTo(186.1239f, 26.0f, 230.0f, 69.87609f, 230.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 124.0f),
                    PathNode.CurveTo(218.0f, 76.50351f, 179.49649f, 38.0f, 132.0f, 38.0f),
                    PathNode.CurveTo(84.50351f, 38.0f, 46.0f, 76.50351f, 46.0f, 124.0f),
                    PathNode.LineTo(46.0f, 208.0f),
                    PathNode.CurveTo(46.0f, 209.10457f, 46.89543f, 210.0f, 48.0f, 210.0f),
                    PathNode.LineTo(132.0f, 210.0f),
                    PathNode.CurveTo(179.47365f, 209.9449f, 217.9449f, 171.47365f, 218.0f, 124.0f),
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
        return _chatTeardropDots!!
    }

private var _chatTeardropDots: ImageVector? = null
