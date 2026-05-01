package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowElbowRightUp: ImageVector
    get() {
        if (_arrowElbowRightUp != null) return _arrowElbowRightUp!!
        _arrowElbowRightUp = phosphorThinIcon(
            name = "ArrowElbowRightUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(218.83f, 98.83f),
                    PathNode.CurveTo(218.07973f, 99.581116f, 217.06163f, 100.00314f, 216.0f, 100.00314f),
                    PathNode.CurveTo(214.93837f, 100.00314f, 213.92027f, 99.581116f, 213.17f, 98.83f),
                    PathNode.LineTo(172.0f, 57.66f),
                    PathNode.LineTo(172.0f, 192.0f),
                    PathNode.CurveTo(172.0f, 194.20914f, 170.20914f, 196.0f, 168.0f, 196.0f),
                    PathNode.LineTo(24.0f, 196.0f),
                    PathNode.CurveTo(21.790861f, 196.0f, 20.0f, 194.20914f, 20.0f, 192.0f),
                    PathNode.CurveTo(20.0f, 189.79086f, 21.790861f, 188.0f, 24.0f, 188.0f),
                    PathNode.LineTo(164.0f, 188.0f),
                    PathNode.LineTo(164.0f, 57.66f),
                    PathNode.LineTo(122.83f, 98.83f),
                    PathNode.CurveTo(121.26704f, 100.39297f, 118.73296f, 100.39297f, 117.17f, 98.83f),
                    PathNode.CurveTo(115.60703f, 97.26704f, 115.60703f, 94.73296f, 117.17f, 93.17f),
                    PathNode.LineTo(165.17f, 45.17f),
                    PathNode.CurveTo(165.92027f, 44.41889f, 166.93837f, 43.996853f, 168.0f, 43.996853f),
                    PathNode.CurveTo(169.06163f, 43.996853f, 170.07973f, 44.41889f, 170.83f, 45.17f),
                    PathNode.LineTo(218.83f, 93.17f),
                    PathNode.CurveTo(219.58112f, 93.92027f, 220.00314f, 94.93836f, 220.00314f, 96.0f),
                    PathNode.CurveTo(220.00314f, 97.06164f, 219.58112f, 98.07973f, 218.83f, 98.83f),
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
        return _arrowElbowRightUp!!
    }

private var _arrowElbowRightUp: ImageVector? = null
