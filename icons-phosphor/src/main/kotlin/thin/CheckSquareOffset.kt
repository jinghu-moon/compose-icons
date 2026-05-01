package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CheckSquareOffset: ImageVector
    get() {
        if (_checkSquareOffset != null) return _checkSquareOffset!!
        _checkSquareOffset = phosphorThinIcon(
            name = "CheckSquareOffset",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.0f, 48.0f),
                    PathNode.LineTo(220.0f, 208.0f),
                    PathNode.CurveTo(220.0f, 214.62741f, 214.62741f, 220.0f, 208.0f, 220.0f),
                    PathNode.LineTo(136.0f, 220.0f),
                    PathNode.CurveTo(133.79086f, 220.0f, 132.0f, 218.20914f, 132.0f, 216.0f),
                    PathNode.CurveTo(132.0f, 213.79086f, 133.79086f, 212.0f, 136.0f, 212.0f),
                    PathNode.LineTo(208.0f, 212.0f),
                    PathNode.CurveTo(210.20914f, 212.0f, 212.0f, 210.20914f, 212.0f, 208.0f),
                    PathNode.LineTo(212.0f, 48.0f),
                    PathNode.CurveTo(212.0f, 45.79086f, 210.20914f, 44.0f, 208.0f, 44.0f),
                    PathNode.LineTo(48.0f, 44.0f),
                    PathNode.CurveTo(45.79086f, 44.0f, 44.0f, 45.79086f, 44.0f, 48.0f),
                    PathNode.LineTo(44.0f, 144.0f),
                    PathNode.CurveTo(44.0f, 146.20914f, 42.20914f, 148.0f, 40.0f, 148.0f),
                    PathNode.CurveTo(37.79086f, 148.0f, 36.0f, 146.20914f, 36.0f, 144.0f),
                    PathNode.LineTo(36.0f, 48.0f),
                    PathNode.CurveTo(36.0f, 41.37258f, 41.37258f, 36.0f, 48.0f, 36.0f),
                    PathNode.LineTo(208.0f, 36.0f),
                    PathNode.CurveTo(214.62741f, 36.0f, 220.0f, 41.37258f, 220.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(117.17f, 157.17f),
                    PathNode.LineTo(64.0f, 210.34f),
                    PathNode.LineTo(42.83f, 189.17f),
                    PathNode.CurveTo(41.267033f, 187.60704f, 38.732967f, 187.60704f, 37.17f, 189.17f),
                    PathNode.CurveTo(35.607033f, 190.73297f, 35.607033f, 193.26703f, 37.17f, 194.83f),
                    PathNode.LineTo(61.17f, 218.83f),
                    PathNode.CurveTo(61.920273f, 219.58112f, 62.938362f, 220.00314f, 64.0f, 220.00314f),
                    PathNode.CurveTo(65.06164f, 220.00314f, 66.07973f, 219.58112f, 66.83f, 218.83f),
                    PathNode.LineTo(122.83f, 162.83f),
                    PathNode.CurveTo(124.39297f, 161.26703f, 124.39297f, 158.73297f, 122.83f, 157.17f),
                    PathNode.CurveTo(121.26704f, 155.60704f, 118.73296f, 155.60704f, 117.17f, 157.17f),
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
        return _checkSquareOffset!!
    }

private var _checkSquareOffset: ImageVector? = null
