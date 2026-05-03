package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AirTrafficControl: ImageVector
    get() {
        if (_airTrafficControl != null) return _airTrafficControl!!
        _airTrafficControl = phosphorBoldIcon(
            name = "AirTrafficControl",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.38f, 68.52f),
                    PathNode.CurveTo(228.63599f, 63.178886f, 222.52266f, 59.999058f, 216.0f, 60.0f),
                    PathNode.LineTo(140.0f, 60.0f),
                    PathNode.LineTo(140.0f, 36.0f),
                    PathNode.LineTo(152.0f, 36.0f),
                    PathNode.CurveTo(158.62741f, 36.0f, 164.0f, 30.627417f, 164.0f, 24.0f),
                    PathNode.CurveTo(164.0f, 17.372583f, 158.62741f, 12.0f, 152.0f, 12.0f),
                    PathNode.LineTo(104.0f, 12.0f),
                    PathNode.CurveTo(97.37258f, 12.0f, 92.0f, 17.372583f, 92.0f, 24.0f),
                    PathNode.CurveTo(92.0f, 30.627417f, 97.37258f, 36.0f, 104.0f, 36.0f),
                    PathNode.LineTo(116.0f, 36.0f),
                    PathNode.LineTo(116.0f, 60.0f),
                    PathNode.LineTo(40.0f, 60.0f),
                    PathNode.CurveTo(33.476246f, 59.99923f, 27.362114f, 63.18028f, 23.618448f, 68.52298f),
                    PathNode.CurveTo(19.874783f, 73.86566f, 18.972137f, 80.69844f, 21.2f, 86.83f),
                    PathNode.LineTo(47.39f, 158.83f),
                    PathNode.CurveTo(50.276386f, 166.72244f, 57.776337f, 171.9792f, 66.18f, 172.0f),
                    PathNode.LineTo(92.0f, 172.0f),
                    PathNode.LineTo(92.0f, 232.0f),
                    PathNode.CurveTo(92.0f, 238.62741f, 97.37258f, 244.0f, 104.0f, 244.0f),
                    PathNode.CurveTo(110.62742f, 244.0f, 116.0f, 238.62741f, 116.0f, 232.0f),
                    PathNode.LineTo(116.0f, 172.0f),
                    PathNode.LineTo(140.0f, 172.0f),
                    PathNode.LineTo(140.0f, 232.0f),
                    PathNode.CurveTo(140.0f, 238.62741f, 145.37259f, 244.0f, 152.0f, 244.0f),
                    PathNode.CurveTo(158.62741f, 244.0f, 164.0f, 238.62741f, 164.0f, 232.0f),
                    PathNode.LineTo(164.0f, 172.0f),
                    PathNode.LineTo(189.82f, 172.0f),
                    PathNode.CurveTo(198.22366f, 171.9792f, 205.72362f, 166.72244f, 208.61f, 158.83f),
                    PathNode.LineTo(234.8f, 86.83f),
                    PathNode.CurveTo(237.02846f, 80.69733f, 236.1252f, 73.86315f, 232.38f, 68.52f),
                    PathNode.Close,
                    PathNode.MoveTo(114.0f, 148.0f),
                    PathNode.LineTo(102.38f, 84.0f),
                    PathNode.LineTo(153.62f, 84.0f),
                    PathNode.LineTo(142.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(45.71f, 84.0f),
                    PathNode.LineTo(78.0f, 84.0f),
                    PathNode.LineTo(89.64f, 148.0f),
                    PathNode.LineTo(69.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(187.0f, 148.0f),
                    PathNode.LineTo(166.38f, 148.0f),
                    PathNode.LineTo(178.0f, 84.0f),
                    PathNode.LineTo(210.27f, 84.0f),
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
        return _airTrafficControl!!
    }

private var _airTrafficControl: ImageVector? = null
