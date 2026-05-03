package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.VectorTwo: ImageVector
    get() {
        if (_vectorTwo != null) return _vectorTwo!!
        _vectorTwo = phosphorBoldIcon(
            name = "VectorTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.49f, 200.49f),
                    PathNode.LineTo(200.49f, 232.49f),
                    PathNode.CurveTo(195.79558f, 237.18442f, 188.18442f, 237.18442f, 183.49f, 232.49f),
                    PathNode.CurveTo(178.79558f, 227.79558f, 178.79558f, 220.18442f, 183.49f, 215.49f),
                    PathNode.LineTo(195.0f, 204.0f),
                    PathNode.LineTo(80.0f, 204.0f),
                    PathNode.CurveTo(73.37258f, 204.0f, 68.0f, 198.62741f, 68.0f, 192.0f),
                    PathNode.LineTo(68.0f, 69.0f),
                    PathNode.LineTo(56.49f, 80.49f),
                    PathNode.CurveTo(51.79558f, 85.18442f, 44.18442f, 85.18442f, 39.49f, 80.49f),
                    PathNode.CurveTo(34.79558f, 75.79558f, 34.79558f, 68.18442f, 39.49f, 63.49f),
                    PathNode.LineTo(71.49f, 31.49f),
                    PathNode.CurveTo(73.74162f, 29.230547f, 76.80018f, 27.960535f, 79.99f, 27.960535f),
                    PathNode.CurveTo(83.17982f, 27.960535f, 86.23838f, 29.230547f, 88.49f, 31.49f),
                    PathNode.LineTo(120.49f, 63.49f),
                    PathNode.CurveTo(125.18442f, 68.18442f, 125.18442f, 75.79558f, 120.49f, 80.49f),
                    PathNode.CurveTo(115.79558f, 85.18442f, 108.18442f, 85.18442f, 103.49f, 80.49f),
                    PathNode.LineTo(92.0f, 69.0f),
                    PathNode.LineTo(92.0f, 180.0f),
                    PathNode.LineTo(195.0f, 180.0f),
                    PathNode.LineTo(183.48f, 168.49f),
                    PathNode.CurveTo(178.78558f, 163.79558f, 178.78558f, 156.18442f, 183.48f, 151.49f),
                    PathNode.CurveTo(188.17442f, 146.79558f, 195.78558f, 146.79558f, 200.48f, 151.49f),
                    PathNode.LineTo(232.48f, 183.49f),
                    PathNode.CurveTo(234.74078f, 185.7403f, 236.01259f, 188.79811f, 236.01447f, 191.98793f),
                    PathNode.CurveTo(236.01634f, 195.17773f, 234.74812f, 198.23705f, 232.49f, 200.49f),
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
        return _vectorTwo!!
    }

private var _vectorTwo: ImageVector? = null
