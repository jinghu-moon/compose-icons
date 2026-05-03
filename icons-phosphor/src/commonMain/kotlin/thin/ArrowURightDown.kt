package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowURightDown: ImageVector
    get() {
        if (_arrowURightDown != null) return _arrowURightDown!!
        _arrowURightDown = phosphorThinIcon(
            name = "ArrowURightDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(218.83f, 178.83f),
                    PathNode.LineTo(170.83f, 226.83f),
                    PathNode.CurveTo(170.07973f, 227.58112f, 169.06163f, 228.00314f, 168.0f, 228.00314f),
                    PathNode.CurveTo(166.93837f, 228.00314f, 165.92027f, 227.58112f, 165.17f, 226.83f),
                    PathNode.LineTo(117.17f, 178.83f),
                    PathNode.CurveTo(115.60703f, 177.26703f, 115.60703f, 174.73297f, 117.17f, 173.17f),
                    PathNode.CurveTo(118.73296f, 171.60704f, 121.26704f, 171.60704f, 122.83f, 173.17f),
                    PathNode.LineTo(164.0f, 214.34f),
                    PathNode.LineTo(164.0f, 88.0f),
                    PathNode.CurveTo(164.0f, 59.281193f, 140.71881f, 36.0f, 112.0f, 36.0f),
                    PathNode.CurveTo(83.2812f, 36.0f, 60.0f, 59.281193f, 60.0f, 88.0f),
                    PathNode.LineTo(60.0f, 176.0f),
                    PathNode.CurveTo(60.0f, 178.20914f, 58.20914f, 180.0f, 56.0f, 180.0f),
                    PathNode.CurveTo(53.79086f, 180.0f, 52.0f, 178.20914f, 52.0f, 176.0f),
                    PathNode.LineTo(52.0f, 88.0f),
                    PathNode.CurveTo(52.0f, 54.862915f, 78.862915f, 28.0f, 112.0f, 28.0f),
                    PathNode.CurveTo(145.13708f, 28.0f, 172.0f, 54.862915f, 172.0f, 88.0f),
                    PathNode.LineTo(172.0f, 214.34f),
                    PathNode.LineTo(213.17f, 173.17f),
                    PathNode.CurveTo(214.73297f, 171.60704f, 217.26703f, 171.60704f, 218.83f, 173.17f),
                    PathNode.CurveTo(220.39296f, 174.73297f, 220.39296f, 177.26703f, 218.83f, 178.83f),
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
        return _arrowURightDown!!
    }

private var _arrowURightDown: ImageVector? = null
