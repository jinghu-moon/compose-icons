package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowUDownLeft: ImageVector
    get() {
        if (_arrowUDownLeft != null) return _arrowUDownLeft!!
        _arrowUDownLeft = phosphorThinIcon(
            name = "ArrowUDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 112.0f),
                    PathNode.CurveTo(227.96143f, 145.1211f, 201.1211f, 171.96143f, 168.0f, 172.0f),
                    PathNode.LineTo(41.66f, 172.0f),
                    PathNode.LineTo(82.83f, 213.17f),
                    PathNode.CurveTo(84.39297f, 214.73297f, 84.39297f, 217.26703f, 82.83f, 218.83f),
                    PathNode.CurveTo(81.26704f, 220.39296f, 78.73296f, 220.39296f, 77.17f, 218.83f),
                    PathNode.LineTo(29.17f, 170.83f),
                    PathNode.CurveTo(28.418892f, 170.07973f, 27.996853f, 169.06163f, 27.996853f, 168.0f),
                    PathNode.CurveTo(27.996853f, 166.93837f, 28.418892f, 165.92027f, 29.17f, 165.17f),
                    PathNode.LineTo(77.17f, 117.17f),
                    PathNode.CurveTo(78.73296f, 115.60703f, 81.26704f, 115.60703f, 82.83f, 117.17f),
                    PathNode.CurveTo(84.39297f, 118.73296f, 84.39297f, 121.26704f, 82.83f, 122.83f),
                    PathNode.LineTo(41.66f, 164.0f),
                    PathNode.LineTo(168.0f, 164.0f),
                    PathNode.CurveTo(196.71881f, 164.0f, 220.0f, 140.71881f, 220.0f, 112.0f),
                    PathNode.CurveTo(220.0f, 83.2812f, 196.71881f, 60.0f, 168.0f, 60.0f),
                    PathNode.LineTo(80.0f, 60.0f),
                    PathNode.CurveTo(77.79086f, 60.0f, 76.0f, 58.20914f, 76.0f, 56.0f),
                    PathNode.CurveTo(76.0f, 53.79086f, 77.79086f, 52.0f, 80.0f, 52.0f),
                    PathNode.LineTo(168.0f, 52.0f),
                    PathNode.CurveTo(201.1211f, 52.038574f, 227.96143f, 78.87891f, 228.0f, 112.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _arrowUDownLeft!!
    }

private var _arrowUDownLeft: ImageVector? = null
