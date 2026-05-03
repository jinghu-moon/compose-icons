package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChatTeardropText: ImageVector
    get() {
        if (_chatTeardropText != null) return _chatTeardropText!!
        _chatTeardropText = phosphorLightIcon(
            name = "ChatTeardropText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(170.0f, 112.0f),
                    PathNode.CurveTo(170.0f, 115.313705f, 167.3137f, 118.0f, 164.0f, 118.0f),
                    PathNode.LineTo(96.0f, 118.0f),
                    PathNode.CurveTo(92.686295f, 118.0f, 90.0f, 115.313705f, 90.0f, 112.0f),
                    PathNode.CurveTo(90.0f, 108.686295f, 92.686295f, 106.0f, 96.0f, 106.0f),
                    PathNode.LineTo(164.0f, 106.0f),
                    PathNode.CurveTo(167.3137f, 106.0f, 170.0f, 108.686295f, 170.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 138.0f),
                    PathNode.LineTo(96.0f, 138.0f),
                    PathNode.CurveTo(92.686295f, 138.0f, 90.0f, 140.6863f, 90.0f, 144.0f),
                    PathNode.CurveTo(90.0f, 147.3137f, 92.686295f, 150.0f, 96.0f, 150.0f),
                    PathNode.LineTo(164.0f, 150.0f),
                    PathNode.CurveTo(167.3137f, 150.0f, 170.0f, 147.3137f, 170.0f, 144.0f),
                    PathNode.CurveTo(170.0f, 140.6863f, 167.3137f, 138.0f, 164.0f, 138.0f),
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
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _chatTeardropText!!
    }

private var _chatTeardropText: ImageVector? = null
