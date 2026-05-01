package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ScribbleLoop: ImageVector
    get() {
        if (_scribbleLoop != null) return _scribbleLoop!!
        _scribbleLoop = phosphorFillIcon(
            name = "ScribbleLoop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 128.0f),
                    PathNode.CurveTo(136.73755f, 128.03862f, 145.41188f, 129.48378f, 153.69f, 132.28f),
                    PathNode.CurveTo(151.56f, 154.87f, 137.33f, 176.0f, 112.0f, 176.0f),
                    PathNode.CurveTo(96.2f, 176.0f, 87.94f, 165.15f, 87.94f, 154.42f),
                    PathNode.CurveTo(87.94f, 147.83f, 90.94f, 141.67f, 96.5f, 137.07f),
                    PathNode.CurveTo(103.62f, 131.14f, 114.52f, 128.0f, 128.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 48.0f),
                    PathNode.LineTo(224.0f, 208.0f),
                    PathNode.CurveTo(224.0f, 216.83656f, 216.83656f, 224.0f, 208.0f, 224.0f),
                    PathNode.LineTo(48.0f, 224.0f),
                    PathNode.CurveTo(39.163445f, 224.0f, 32.0f, 216.83656f, 32.0f, 208.0f),
                    PathNode.LineTo(32.0f, 48.0f),
                    PathNode.CurveTo(32.0f, 39.163445f, 39.163445f, 32.0f, 48.0f, 32.0f),
                    PathNode.LineTo(208.0f, 32.0f),
                    PathNode.CurveTo(216.83656f, 32.0f, 224.0f, 39.163445f, 224.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(205.89f, 146.59f),
                    PathNode.CurveTo(195.51738f, 136.03773f, 183.28572f, 127.491165f, 169.81f, 121.38f),
                    PathNode.CurveTo(168.91f, 107.03f, 164.06f, 93.84f, 155.92f, 83.83f),
                    PathNode.CurveTo(145.38f, 70.86f, 130.19f, 64.0f, 112.0f, 64.0f),
                    PathNode.CurveTo(76.44f, 64.0f, 50.68f, 97.76f, 49.6f, 99.2f),
                    PathNode.CurveTo(46.943512f, 102.73186f, 47.65314f, 107.74851f, 51.185f, 110.405f),
                    PathNode.CurveTo(54.71686f, 113.06149f, 59.73351f, 112.35187f, 62.39f, 108.82f),
                    PathNode.CurveTo(62.61f, 108.53f, 84.51f, 80.0f, 112.0f, 80.0f),
                    PathNode.CurveTo(125.4f, 80.0f, 136.0f, 84.68f, 143.5f, 93.92f),
                    PathNode.CurveTo(148.39407f, 100.15181f, 151.65283f, 107.50809f, 152.98f, 115.32f),
                    PathNode.CurveTo(144.83368f, 113.12904f, 136.43579f, 112.01291f, 128.0f, 112.0f),
                    PathNode.CurveTo(110.73f, 112.0f, 96.29f, 116.42f, 86.26f, 124.78f),
                    PathNode.CurveTo(77.0f, 132.47f, 71.94f, 143.0f, 71.94f, 154.42f),
                    PathNode.CurveTo(71.94f, 172.64f, 86.0f, 192.0f, 112.0f, 192.0f),
                    PathNode.CurveTo(129.0478f, 192.19176f, 145.18494f, 184.32153f, 155.53f, 170.77f),
                    PathNode.CurveTo(162.61761f, 161.4383f, 167.24916f, 150.47661f, 169.0f, 138.89f),
                    PathNode.CurveTo(178.24289f, 143.79227f, 186.71095f, 150.03294f, 194.13f, 157.41f),
                    PathNode.CurveTo(196.04161f, 159.59834f, 198.98949f, 160.57811f, 201.83072f, 159.96945f),
                    PathNode.CurveTo(204.67195f, 159.3608f, 206.95978f, 157.25941f, 207.80719f, 154.48003f),
                    PathNode.CurveTo(208.6546f, 151.70064f, 207.92834f, 148.6803f, 205.91f, 146.59f),
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
        return _scribbleLoop!!
    }

private var _scribbleLoop: ImageVector? = null
