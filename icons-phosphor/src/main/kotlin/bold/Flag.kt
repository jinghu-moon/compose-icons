package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Flag: ImageVector
    get() {
        if (_flag != null) return _flag!!
        _flag = phosphorBoldIcon(
            name = "Flag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(40.14f, 46.88f),
                    PathNode.CurveTo(37.49667f, 49.171253f, 35.984737f, 52.501884f, 36.0f, 56.0f),
                    PathNode.LineTo(36.0f, 224.0f),
                    PathNode.CurveTo(36.0f, 230.62741f, 41.37258f, 236.0f, 48.0f, 236.0f),
                    PathNode.CurveTo(54.62742f, 236.0f, 60.0f, 230.62741f, 60.0f, 224.0f),
                    PathNode.LineTo(60.0f, 181.72f),
                    PathNode.CurveTo(82.84f, 164.6f, 102.1f, 172.6f, 130.68f, 186.72f),
                    PathNode.CurveTo(146.91f, 194.72f, 165.42f, 203.92f, 185.48f, 203.92f),
                    PathNode.CurveTo(200.2f, 203.92f, 215.76f, 198.98f, 231.86f, 185.04f),
                    PathNode.CurveTo(234.4822f, 182.76703f, 235.99202f, 179.4702f, 236.0f, 176.0f),
                    PathNode.LineTo(236.0f, 56.0f),
                    PathNode.CurveTo(236.00096f, 51.301132f, 233.25931f, 47.034035f, 228.98509f, 45.082012f),
                    PathNode.CurveTo(224.71088f, 43.12999f, 219.6906f, 43.85224f, 216.14f, 46.93f),
                    PathNode.CurveTo(191.43f, 68.34f, 171.61f, 60.24f, 141.32f, 45.25f),
                    PathNode.CurveTo(113.19f, 31.27f, 78.17f, 13.94f, 40.14f, 46.88f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 170.26f),
                    PathNode.CurveTo(189.16f, 187.39f, 169.9f, 179.37f, 141.32f, 165.26f),
                    PathNode.CurveTo(118.16f, 153.76f, 90.33f, 140.0f, 60.0f, 153.87f),
                    PathNode.LineTo(60.0f, 61.69f),
                    PathNode.CurveTo(82.84f, 44.57f, 102.1f, 52.57f, 130.68f, 66.69f),
                    PathNode.CurveTo(146.91f, 74.69f, 165.42f, 83.89f, 185.48f, 83.89f),
                    PathNode.CurveTo(194.63718f, 83.903725f, 203.6873f, 81.921036f, 212.0f, 78.08f),
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
        return _flag!!
    }

private var _flag: ImageVector? = null
