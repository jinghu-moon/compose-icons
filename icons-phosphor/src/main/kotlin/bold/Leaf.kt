package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Leaf: ImageVector
    get() {
        if (_leaf != null) return _leaf!!
        _leaf = phosphorBoldIcon(
            name = "Leaf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(227.42f, 39.86f),
                    PathNode.CurveTo(227.06512f, 33.783283f, 222.21672f, 28.934872f, 216.14f, 28.58f),
                    PathNode.CurveTo(176.54f, 26.25f, 141.55f, 30.92f, 112.14f, 42.45f),
                    PathNode.CurveTo(84.0f, 53.48f, 62.31f, 70.58f, 49.39f, 91.9f),
                    PathNode.CurveTo(31.77f, 121.01f, 31.73f, 156.35f, 48.94f, 190.09f),
                    PathNode.LineTo(31.51f, 207.52f),
                    PathNode.CurveTo(26.81558f, 212.21442f, 26.81558f, 219.82558f, 31.51f, 224.52f),
                    PathNode.CurveTo(36.20442f, 229.21442f, 43.81558f, 229.21442f, 48.51f, 224.52f),
                    PathNode.LineTo(65.94f, 207.09f),
                    PathNode.CurveTo(82.68f, 215.63f, 99.82f, 219.94f, 116.39f, 219.94f),
                    PathNode.CurveTo(133.22513f, 219.99245f, 149.74704f, 215.38957f, 164.13f, 206.64f),
                    PathNode.CurveTo(185.45f, 193.72f, 202.55f, 172.02f, 213.58f, 143.89f),
                    PathNode.CurveTo(225.08f, 114.46f, 229.75f, 79.46f, 227.42f, 39.86f),
                    PathNode.Close,
                    PathNode.MoveTo(151.66f, 186.08f),
                    PathNode.CurveTo(131.57f, 198.25f, 108.0f, 199.17f, 83.94f, 189.0f),
                    PathNode.LineTo(168.48f, 104.46f),
                    PathNode.CurveTo(173.17442f, 99.76558f, 173.17442f, 92.15442f, 168.48f, 87.46f),
                    PathNode.CurveTo(163.78558f, 82.76558f, 156.17442f, 82.76558f, 151.48f, 87.46f),
                    PathNode.LineTo(67.0f, 172.06f),
                    PathNode.CurveTo(56.86f, 148.06f, 57.78f, 124.43f, 70.0f, 104.34f),
                    PathNode.CurveTo(90.91f, 69.81f, 140.54f, 50.62f, 204.0f, 52.09f),
                    PathNode.CurveTo(205.38f, 115.53f, 186.19f, 165.17f, 151.66f, 186.08f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _leaf!!
    }

private var _leaf: ImageVector? = null
