package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CourtBasketball: ImageVector
    get() {
        if (_courtBasketball != null) return _courtBasketball!!
        _courtBasketball = phosphorLightIcon(
            name = "CourtBasketball",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 50.0f),
                    PathNode.LineTo(32.0f, 50.0f),
                    PathNode.CurveTo(24.268015f, 50.0f, 18.0f, 56.268013f, 18.0f, 64.0f),
                    PathNode.LineTo(18.0f, 192.0f),
                    PathNode.CurveTo(18.0f, 199.73198f, 24.268015f, 206.0f, 32.0f, 206.0f),
                    PathNode.LineTo(224.0f, 206.0f),
                    PathNode.CurveTo(231.73198f, 206.0f, 238.0f, 199.73198f, 238.0f, 192.0f),
                    PathNode.LineTo(238.0f, 64.0f),
                    PathNode.CurveTo(238.0f, 56.268013f, 231.73198f, 50.0f, 224.0f, 50.0f),
                    PathNode.Close,
                    PathNode.MoveTo(226.0f, 162.0f),
                    PathNode.LineTo(216.0f, 162.0f),
                    PathNode.CurveTo(197.22232f, 162.0f, 182.0f, 146.77768f, 182.0f, 128.0f),
                    PathNode.CurveTo(182.0f, 109.22232f, 197.22232f, 94.0f, 216.0f, 94.0f),
                    PathNode.LineTo(226.0f, 94.0f),
                    PathNode.Close,
                    PathNode.MoveTo(30.0f, 94.0f),
                    PathNode.LineTo(40.0f, 94.0f),
                    PathNode.CurveTo(58.777683f, 94.0f, 74.0f, 109.22232f, 74.0f, 128.0f),
                    PathNode.CurveTo(74.0f, 146.77768f, 58.777683f, 162.0f, 40.0f, 162.0f),
                    PathNode.LineTo(30.0f, 162.0f),
                    PathNode.Close,
                    PathNode.MoveTo(30.0f, 192.0f),
                    PathNode.LineTo(30.0f, 174.0f),
                    PathNode.LineTo(40.0f, 174.0f),
                    PathNode.CurveTo(65.4051f, 174.0f, 86.0f, 153.4051f, 86.0f, 128.0f),
                    PathNode.CurveTo(86.0f, 102.5949f, 65.4051f, 82.0f, 40.0f, 82.0f),
                    PathNode.LineTo(30.0f, 82.0f),
                    PathNode.LineTo(30.0f, 64.0f),
                    PathNode.CurveTo(30.0f, 62.89543f, 30.89543f, 62.0f, 32.0f, 62.0f),
                    PathNode.LineTo(122.0f, 62.0f),
                    PathNode.LineTo(122.0f, 194.0f),
                    PathNode.LineTo(32.0f, 194.0f),
                    PathNode.CurveTo(30.89543f, 194.0f, 30.0f, 193.10457f, 30.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 194.0f),
                    PathNode.LineTo(134.0f, 194.0f),
                    PathNode.LineTo(134.0f, 62.0f),
                    PathNode.LineTo(224.0f, 62.0f),
                    PathNode.CurveTo(225.10457f, 62.0f, 226.0f, 62.89543f, 226.0f, 64.0f),
                    PathNode.LineTo(226.0f, 82.0f),
                    PathNode.LineTo(216.0f, 82.0f),
                    PathNode.CurveTo(190.5949f, 82.0f, 170.0f, 102.5949f, 170.0f, 128.0f),
                    PathNode.CurveTo(170.0f, 153.4051f, 190.5949f, 174.0f, 216.0f, 174.0f),
                    PathNode.LineTo(226.0f, 174.0f),
                    PathNode.LineTo(226.0f, 192.0f),
                    PathNode.CurveTo(226.0f, 193.10457f, 225.10457f, 194.0f, 224.0f, 194.0f),
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
        return _courtBasketball!!
    }

private var _courtBasketball: ImageVector? = null
