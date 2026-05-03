package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FilmSlate: ImageVector
    get() {
        if (_filmSlate != null) return _filmSlate!!
        _filmSlate = phosphorBoldIcon(
            name = "FilmSlate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 100.0f),
                    PathNode.LineTo(132.92f, 100.0f),
                    PathNode.LineTo(211.06f, 79.37f),
                    PathNode.CurveTo(214.1524f, 78.55445f, 216.79135f, 76.53822f, 218.39099f, 73.76888f),
                    PathNode.CurveTo(219.99063f, 70.99954f, 220.41864f, 67.70623f, 219.58f, 64.62f),
                    PathNode.LineTo(211.42f, 34.62f),
                    PathNode.CurveTo(208.50246f, 24.103561f, 197.6727f, 17.88647f, 187.12f, 20.67f),
                    PathNode.LineTo(34.79f, 60.87f),
                    PathNode.CurveTo(29.663347f, 62.205746f, 25.288776f, 65.54613f, 22.65f, 70.14f),
                    PathNode.CurveTo(20.006037f, 74.67322f, 19.302965f, 80.08146f, 20.7f, 85.14f),
                    PathNode.LineTo(28.0f, 112.0f),
                    PathNode.LineTo(28.0f, 200.0f),
                    PathNode.CurveTo(28.0f, 211.0457f, 36.954304f, 220.0f, 48.0f, 220.0f),
                    PathNode.LineTo(208.0f, 220.0f),
                    PathNode.CurveTo(219.0457f, 220.0f, 228.0f, 211.0457f, 228.0f, 200.0f),
                    PathNode.LineTo(228.0f, 112.0f),
                    PathNode.CurveTo(228.0f, 105.37258f, 222.62741f, 100.0f, 216.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(124.89f, 61.91f),
                    PathNode.LineTo(143.18f, 72.47f),
                    PathNode.LineTo(117.23f, 79.32f),
                    PathNode.LineTo(98.94f, 68.76f),
                    PathNode.Close,
                    PathNode.MoveTo(189.34f, 44.91f),
                    PathNode.LineTo(193.25f, 59.26f),
                    PathNode.LineTo(176.12f, 63.78f),
                    PathNode.LineTo(157.83f, 53.21f),
                    PathNode.Close,
                    PathNode.MoveTo(66.0f, 77.46f),
                    PathNode.LineTo(84.29f, 88.0f),
                    PathNode.LineTo(48.89f, 97.35f),
                    PathNode.LineTo(45.0f, 83.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 196.0f),
                    PathNode.LineTo(52.0f, 196.0f),
                    PathNode.LineTo(52.0f, 124.0f),
                    PathNode.LineTo(204.0f, 124.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _filmSlate!!
    }

private var _filmSlate: ImageVector? = null
