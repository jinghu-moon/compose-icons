package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowUUpLeft: ImageVector
    get() {
        if (_arrowUUpLeft != null) return _arrowUUpLeft!!
        _arrowUUpLeft = phosphorThinIcon(
            name = "ArrowUUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 144.0f),
                    PathNode.CurveTo(227.96143f, 177.1211f, 201.1211f, 203.96143f, 168.0f, 204.0f),
                    PathNode.LineTo(80.0f, 204.0f),
                    PathNode.CurveTo(77.79086f, 204.0f, 76.0f, 202.20914f, 76.0f, 200.0f),
                    PathNode.CurveTo(76.0f, 197.79086f, 77.79086f, 196.0f, 80.0f, 196.0f),
                    PathNode.LineTo(168.0f, 196.0f),
                    PathNode.CurveTo(196.71881f, 196.0f, 220.0f, 172.71881f, 220.0f, 144.0f),
                    PathNode.CurveTo(220.0f, 115.2812f, 196.71881f, 92.0f, 168.0f, 92.0f),
                    PathNode.LineTo(41.66f, 92.0f),
                    PathNode.LineTo(82.83f, 133.17f),
                    PathNode.CurveTo(84.39297f, 134.73297f, 84.39297f, 137.26703f, 82.83f, 138.83f),
                    PathNode.CurveTo(81.26704f, 140.39296f, 78.73296f, 140.39296f, 77.17f, 138.83f),
                    PathNode.LineTo(29.17f, 90.83f),
                    PathNode.CurveTo(28.418892f, 90.07973f, 27.996853f, 89.06164f, 27.996853f, 88.0f),
                    PathNode.CurveTo(27.996853f, 86.93836f, 28.418892f, 85.92027f, 29.17f, 85.17f),
                    PathNode.LineTo(77.17f, 37.17f),
                    PathNode.CurveTo(78.73296f, 35.607033f, 81.26704f, 35.607033f, 82.83f, 37.17f),
                    PathNode.CurveTo(84.39297f, 38.732967f, 84.39297f, 41.267033f, 82.83f, 42.83f),
                    PathNode.LineTo(41.66f, 84.0f),
                    PathNode.LineTo(168.0f, 84.0f),
                    PathNode.CurveTo(201.1211f, 84.038574f, 227.96143f, 110.87891f, 228.0f, 144.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _arrowUUpLeft!!
    }

private var _arrowUUpLeft: ImageVector? = null
