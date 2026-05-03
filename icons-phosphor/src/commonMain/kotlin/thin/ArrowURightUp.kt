package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowURightUp: ImageVector
    get() {
        if (_arrowURightUp != null) return _arrowURightUp!!
        _arrowURightUp = phosphorThinIcon(
            name = "ArrowURightUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(218.83f, 82.83f),
                    PathNode.CurveTo(218.07973f, 83.581116f, 217.06163f, 84.00314f, 216.0f, 84.00314f),
                    PathNode.CurveTo(214.93837f, 84.00314f, 213.92027f, 83.581116f, 213.17f, 82.83f),
                    PathNode.LineTo(172.0f, 41.66f),
                    PathNode.LineTo(172.0f, 168.0f),
                    PathNode.CurveTo(172.0f, 201.13708f, 145.13708f, 228.0f, 112.0f, 228.0f),
                    PathNode.CurveTo(78.862915f, 228.0f, 52.0f, 201.13708f, 52.0f, 168.0f),
                    PathNode.LineTo(52.0f, 80.0f),
                    PathNode.CurveTo(52.0f, 77.79086f, 53.79086f, 76.0f, 56.0f, 76.0f),
                    PathNode.CurveTo(58.20914f, 76.0f, 60.0f, 77.79086f, 60.0f, 80.0f),
                    PathNode.LineTo(60.0f, 168.0f),
                    PathNode.CurveTo(60.0f, 196.71881f, 83.2812f, 220.0f, 112.0f, 220.0f),
                    PathNode.CurveTo(140.71881f, 220.0f, 164.0f, 196.71881f, 164.0f, 168.0f),
                    PathNode.LineTo(164.0f, 41.66f),
                    PathNode.LineTo(122.83f, 82.83f),
                    PathNode.CurveTo(121.26704f, 84.39297f, 118.73296f, 84.39297f, 117.17f, 82.83f),
                    PathNode.CurveTo(115.60703f, 81.26704f, 115.60703f, 78.73296f, 117.17f, 77.17f),
                    PathNode.LineTo(165.17f, 29.17f),
                    PathNode.CurveTo(165.92027f, 28.418892f, 166.93837f, 27.996853f, 168.0f, 27.996853f),
                    PathNode.CurveTo(169.06163f, 27.996853f, 170.07973f, 28.418892f, 170.83f, 29.17f),
                    PathNode.LineTo(218.83f, 77.17f),
                    PathNode.CurveTo(219.58112f, 77.92027f, 220.00314f, 78.93836f, 220.00314f, 80.0f),
                    PathNode.CurveTo(220.00314f, 81.06164f, 219.58112f, 82.07973f, 218.83f, 82.83f),
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
        return _arrowURightUp!!
    }

private var _arrowURightUp: ImageVector? = null
