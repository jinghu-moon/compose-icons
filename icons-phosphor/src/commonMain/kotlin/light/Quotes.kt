package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Quotes: ImageVector
    get() {
        if (_quotes != null) return _quotes!!
        _quotes = phosphorLightIcon(
            name = "Quotes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(100.0f, 58.0f),
                    PathNode.LineTo(40.0f, 58.0f),
                    PathNode.CurveTo(32.268013f, 58.0f, 26.0f, 64.26801f, 26.0f, 72.0f),
                    PathNode.LineTo(26.0f, 136.0f),
                    PathNode.CurveTo(26.0f, 143.73198f, 32.268013f, 150.0f, 40.0f, 150.0f),
                    PathNode.LineTo(102.0f, 150.0f),
                    PathNode.LineTo(102.0f, 160.0f),
                    PathNode.CurveTo(102.0f, 178.77768f, 86.77768f, 194.0f, 68.0f, 194.0f),
                    PathNode.CurveTo(64.686295f, 194.0f, 62.0f, 196.6863f, 62.0f, 200.0f),
                    PathNode.CurveTo(62.0f, 203.3137f, 64.686295f, 206.0f, 68.0f, 206.0f),
                    PathNode.CurveTo(93.391396f, 205.96695f, 113.96694f, 185.39139f, 114.0f, 160.0f),
                    PathNode.LineTo(114.0f, 72.0f),
                    PathNode.CurveTo(114.0f, 64.26801f, 107.73199f, 58.0f, 100.0f, 58.0f),
                    PathNode.Close,
                    PathNode.MoveTo(102.0f, 138.0f),
                    PathNode.LineTo(40.0f, 138.0f),
                    PathNode.CurveTo(38.89543f, 138.0f, 38.0f, 137.10457f, 38.0f, 136.0f),
                    PathNode.LineTo(38.0f, 72.0f),
                    PathNode.CurveTo(38.0f, 70.89543f, 38.89543f, 70.0f, 40.0f, 70.0f),
                    PathNode.LineTo(100.0f, 70.0f),
                    PathNode.CurveTo(101.10457f, 70.0f, 102.0f, 70.89543f, 102.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 58.0f),
                    PathNode.LineTo(156.0f, 58.0f),
                    PathNode.CurveTo(148.26802f, 58.0f, 142.0f, 64.26801f, 142.0f, 72.0f),
                    PathNode.LineTo(142.0f, 136.0f),
                    PathNode.CurveTo(142.0f, 143.73198f, 148.26802f, 150.0f, 156.0f, 150.0f),
                    PathNode.LineTo(218.0f, 150.0f),
                    PathNode.LineTo(218.0f, 160.0f),
                    PathNode.CurveTo(218.0f, 178.77768f, 202.77768f, 194.0f, 184.0f, 194.0f),
                    PathNode.CurveTo(180.6863f, 194.0f, 178.0f, 196.6863f, 178.0f, 200.0f),
                    PathNode.CurveTo(178.0f, 203.3137f, 180.6863f, 206.0f, 184.0f, 206.0f),
                    PathNode.CurveTo(209.39139f, 205.96695f, 229.96695f, 185.39139f, 230.0f, 160.0f),
                    PathNode.LineTo(230.0f, 72.0f),
                    PathNode.CurveTo(230.0f, 64.26801f, 223.73198f, 58.0f, 216.0f, 58.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 138.0f),
                    PathNode.LineTo(156.0f, 138.0f),
                    PathNode.CurveTo(154.89543f, 138.0f, 154.0f, 137.10457f, 154.0f, 136.0f),
                    PathNode.LineTo(154.0f, 72.0f),
                    PathNode.CurveTo(154.0f, 70.89543f, 154.89543f, 70.0f, 156.0f, 70.0f),
                    PathNode.LineTo(216.0f, 70.0f),
                    PathNode.CurveTo(217.10457f, 70.0f, 218.0f, 70.89543f, 218.0f, 72.0f),
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
        return _quotes!!
    }

private var _quotes: ImageVector? = null
