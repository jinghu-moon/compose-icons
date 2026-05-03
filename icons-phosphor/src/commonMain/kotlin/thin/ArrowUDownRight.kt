package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowUDownRight: ImageVector
    get() {
        if (_arrowUDownRight != null) return _arrowUDownRight!!
        _arrowUDownRight = phosphorThinIcon(
            name = "ArrowUDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(226.83f, 170.83f),
                    PathNode.LineTo(178.83f, 218.83f),
                    PathNode.CurveTo(177.26703f, 220.39296f, 174.73297f, 220.39296f, 173.17f, 218.83f),
                    PathNode.CurveTo(171.60704f, 217.26703f, 171.60704f, 214.73297f, 173.17f, 213.17f),
                    PathNode.LineTo(214.34f, 172.0f),
                    PathNode.LineTo(88.0f, 172.0f),
                    PathNode.CurveTo(54.862915f, 172.0f, 28.0f, 145.13708f, 28.0f, 112.0f),
                    PathNode.CurveTo(28.0f, 78.862915f, 54.862915f, 52.0f, 88.0f, 52.0f),
                    PathNode.LineTo(176.0f, 52.0f),
                    PathNode.CurveTo(178.20914f, 52.0f, 180.0f, 53.79086f, 180.0f, 56.0f),
                    PathNode.CurveTo(180.0f, 58.20914f, 178.20914f, 60.0f, 176.0f, 60.0f),
                    PathNode.LineTo(88.0f, 60.0f),
                    PathNode.CurveTo(59.281193f, 60.0f, 36.0f, 83.2812f, 36.0f, 112.0f),
                    PathNode.CurveTo(36.0f, 140.71881f, 59.281193f, 164.0f, 88.0f, 164.0f),
                    PathNode.LineTo(214.34f, 164.0f),
                    PathNode.LineTo(173.17f, 122.83f),
                    PathNode.CurveTo(171.60704f, 121.26704f, 171.60704f, 118.73296f, 173.17f, 117.17f),
                    PathNode.CurveTo(174.73297f, 115.60703f, 177.26703f, 115.60703f, 178.83f, 117.17f),
                    PathNode.LineTo(226.83f, 165.17f),
                    PathNode.CurveTo(227.58112f, 165.92027f, 228.00314f, 166.93837f, 228.00314f, 168.0f),
                    PathNode.CurveTo(228.00314f, 169.06163f, 227.58112f, 170.07973f, 226.83f, 170.83f),
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
        return _arrowUDownRight!!
    }

private var _arrowUDownRight: ImageVector? = null
