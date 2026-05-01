package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TreasureChest: ImageVector
    get() {
        if (_treasureChest != null) return _treasureChest!!
        _treasureChest = phosphorLightIcon(
            name = "TreasureChest",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 42.0f),
                    PathNode.LineTo(72.0f, 42.0f),
                    PathNode.CurveTo(42.19033f, 42.033066f, 18.033068f, 66.19033f, 18.0f, 96.0f),
                    PathNode.LineTo(18.0f, 192.0f),
                    PathNode.CurveTo(18.0f, 199.73198f, 24.268015f, 206.0f, 32.0f, 206.0f),
                    PathNode.LineTo(224.0f, 206.0f),
                    PathNode.CurveTo(231.73198f, 206.0f, 238.0f, 199.73198f, 238.0f, 192.0f),
                    PathNode.LineTo(238.0f, 96.0f),
                    PathNode.CurveTo(237.96693f, 66.19033f, 213.80966f, 42.033066f, 184.0f, 42.0f),
                    PathNode.Close,
                    PathNode.MoveTo(226.0f, 96.0f),
                    PathNode.LineTo(226.0f, 106.0f),
                    PathNode.LineTo(190.0f, 106.0f),
                    PathNode.LineTo(190.0f, 54.44f),
                    PathNode.CurveTo(210.64958f, 57.442207f, 225.97395f, 75.13333f, 226.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(138.0f, 138.0f),
                    PathNode.LineTo(118.0f, 138.0f),
                    PathNode.LineTo(118.0f, 102.0f),
                    PathNode.LineTo(138.0f, 102.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 150.0f),
                    PathNode.LineTo(144.0f, 150.0f),
                    PathNode.CurveTo(147.3137f, 150.0f, 150.0f, 147.3137f, 150.0f, 144.0f),
                    PathNode.LineTo(150.0f, 118.0f),
                    PathNode.LineTo(178.0f, 118.0f),
                    PathNode.LineTo(178.0f, 194.0f),
                    PathNode.LineTo(78.0f, 194.0f),
                    PathNode.LineTo(78.0f, 118.0f),
                    PathNode.LineTo(106.0f, 118.0f),
                    PathNode.LineTo(106.0f, 144.0f),
                    PathNode.CurveTo(106.0f, 147.3137f, 108.686295f, 150.0f, 112.0f, 150.0f),
                    PathNode.Close,
                    PathNode.MoveTo(150.0f, 106.0f),
                    PathNode.LineTo(150.0f, 96.0f),
                    PathNode.CurveTo(150.0f, 92.686295f, 147.3137f, 90.0f, 144.0f, 90.0f),
                    PathNode.LineTo(112.0f, 90.0f),
                    PathNode.CurveTo(108.686295f, 90.0f, 106.0f, 92.686295f, 106.0f, 96.0f),
                    PathNode.LineTo(106.0f, 106.0f),
                    PathNode.LineTo(78.0f, 106.0f),
                    PathNode.LineTo(78.0f, 54.0f),
                    PathNode.LineTo(178.0f, 54.0f),
                    PathNode.LineTo(178.0f, 106.0f),
                    PathNode.Close,
                    PathNode.MoveTo(66.0f, 54.44f),
                    PathNode.LineTo(66.0f, 106.0f),
                    PathNode.LineTo(30.0f, 106.0f),
                    PathNode.LineTo(30.0f, 96.0f),
                    PathNode.CurveTo(30.026054f, 75.13333f, 45.35042f, 57.442207f, 66.0f, 54.44f),
                    PathNode.Close,
                    PathNode.MoveTo(30.0f, 192.0f),
                    PathNode.LineTo(30.0f, 118.0f),
                    PathNode.LineTo(66.0f, 118.0f),
                    PathNode.LineTo(66.0f, 194.0f),
                    PathNode.LineTo(32.0f, 194.0f),
                    PathNode.CurveTo(30.89543f, 194.0f, 30.0f, 193.10457f, 30.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 194.0f),
                    PathNode.LineTo(190.0f, 194.0f),
                    PathNode.LineTo(190.0f, 118.0f),
                    PathNode.LineTo(226.0f, 118.0f),
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
        return _treasureChest!!
    }

private var _treasureChest: ImageVector? = null
