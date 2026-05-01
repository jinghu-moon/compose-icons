package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowFatUp: ImageVector
    get() {
        if (_arrowFatUp != null) return _arrowFatUp!!
        _arrowFatUp = phosphorBoldIcon(
            name = "ArrowFatUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.48f, 111.51f),
                    PathNode.LineTo(136.48f, 15.51f),
                    PathNode.CurveTo(134.22838f, 13.250546f, 131.16982f, 11.980537f, 127.98f, 11.980537f),
                    PathNode.CurveTo(124.790184f, 11.980537f, 121.73162f, 13.250546f, 119.48f, 15.51f),
                    PathNode.LineTo(23.48f, 111.51f),
                    PathNode.CurveTo(20.04013f, 114.94599f, 19.013494f, 120.11805f, 20.880215f, 124.60738f),
                    PathNode.CurveTo(22.746937f, 129.09671f, 27.138056f, 132.016f, 32.0f, 132.0f),
                    PathNode.LineTo(68.0f, 132.0f),
                    PathNode.LineTo(68.0f, 208.0f),
                    PathNode.CurveTo(68.0f, 219.0457f, 76.95431f, 228.0f, 88.0f, 228.0f),
                    PathNode.LineTo(168.0f, 228.0f),
                    PathNode.CurveTo(179.0457f, 228.0f, 188.0f, 219.0457f, 188.0f, 208.0f),
                    PathNode.LineTo(188.0f, 132.0f),
                    PathNode.LineTo(224.0f, 132.0f),
                    PathNode.CurveTo(228.85466f, 131.99977f, 233.23093f, 129.07454f, 235.08737f, 124.58886f),
                    PathNode.CurveTo(236.94382f, 120.10317f, 235.91467f, 114.94085f, 232.48f, 111.51f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 108.0f),
                    PathNode.CurveTo(169.37259f, 108.0f, 164.0f, 113.37258f, 164.0f, 120.0f),
                    PathNode.LineTo(164.0f, 204.0f),
                    PathNode.LineTo(92.0f, 204.0f),
                    PathNode.LineTo(92.0f, 120.0f),
                    PathNode.CurveTo(92.0f, 113.37258f, 86.62742f, 108.0f, 80.0f, 108.0f),
                    PathNode.LineTo(61.0f, 108.0f),
                    PathNode.LineTo(128.0f, 41.0f),
                    PathNode.LineTo(195.0f, 108.0f),
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
        return _arrowFatUp!!
    }

private var _arrowFatUp: ImageVector? = null
