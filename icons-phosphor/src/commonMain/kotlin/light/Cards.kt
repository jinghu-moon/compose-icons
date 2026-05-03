package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Cards: ImageVector
    get() {
        if (_cards != null) return _cards!!
        _cards = phosphorLightIcon(
            name = "Cards",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 74.0f),
                    PathNode.LineTo(40.0f, 74.0f),
                    PathNode.CurveTo(32.268013f, 74.0f, 26.0f, 80.26801f, 26.0f, 88.0f),
                    PathNode.LineTo(26.0f, 200.0f),
                    PathNode.CurveTo(26.0f, 207.73198f, 32.268013f, 214.0f, 40.0f, 214.0f),
                    PathNode.LineTo(184.0f, 214.0f),
                    PathNode.CurveTo(191.73198f, 214.0f, 198.0f, 207.73198f, 198.0f, 200.0f),
                    PathNode.LineTo(198.0f, 88.0f),
                    PathNode.CurveTo(198.0f, 80.26801f, 191.73198f, 74.0f, 184.0f, 74.0f),
                    PathNode.Close,
                    PathNode.MoveTo(186.0f, 200.0f),
                    PathNode.CurveTo(186.0f, 201.10457f, 185.10457f, 202.0f, 184.0f, 202.0f),
                    PathNode.LineTo(40.0f, 202.0f),
                    PathNode.CurveTo(38.89543f, 202.0f, 38.0f, 201.10457f, 38.0f, 200.0f),
                    PathNode.LineTo(38.0f, 88.0f),
                    PathNode.CurveTo(38.0f, 86.89543f, 38.89543f, 86.0f, 40.0f, 86.0f),
                    PathNode.LineTo(184.0f, 86.0f),
                    PathNode.CurveTo(185.10457f, 86.0f, 186.0f, 86.89543f, 186.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(230.0f, 56.0f),
                    PathNode.LineTo(230.0f, 176.0f),
                    PathNode.CurveTo(230.0f, 179.3137f, 227.3137f, 182.0f, 224.0f, 182.0f),
                    PathNode.CurveTo(220.6863f, 182.0f, 218.0f, 179.3137f, 218.0f, 176.0f),
                    PathNode.LineTo(218.0f, 56.0f),
                    PathNode.CurveTo(218.0f, 54.89543f, 217.10457f, 54.0f, 216.0f, 54.0f),
                    PathNode.LineTo(64.0f, 54.0f),
                    PathNode.CurveTo(60.68629f, 54.0f, 58.0f, 51.31371f, 58.0f, 48.0f),
                    PathNode.CurveTo(58.0f, 44.68629f, 60.68629f, 42.0f, 64.0f, 42.0f),
                    PathNode.LineTo(216.0f, 42.0f),
                    PathNode.CurveTo(223.73198f, 42.0f, 230.0f, 48.268013f, 230.0f, 56.0f),
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
        return _cards!!
    }

private var _cards: ImageVector? = null
