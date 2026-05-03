package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowsDownUp: ImageVector
    get() {
        if (_arrowsDownUp != null) return _arrowsDownUp!!
        _arrowsDownUp = phosphorThinIcon(
            name = "ArrowsDownUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(114.83f, 173.17f),
                    PathNode.CurveTo(115.581116f, 173.92027f, 116.00314f, 174.93837f, 116.00314f, 176.0f),
                    PathNode.CurveTo(116.00314f, 177.06163f, 115.581116f, 178.07973f, 114.83f, 178.83f),
                    PathNode.LineTo(82.83f, 210.83f),
                    PathNode.CurveTo(82.07973f, 211.58112f, 81.06164f, 212.00314f, 80.0f, 212.00314f),
                    PathNode.CurveTo(78.93836f, 212.00314f, 77.92027f, 211.58112f, 77.17f, 210.83f),
                    PathNode.LineTo(45.17f, 178.83f),
                    PathNode.CurveTo(43.607033f, 177.26703f, 43.607033f, 174.73297f, 45.17f, 173.17f),
                    PathNode.CurveTo(46.732967f, 171.60704f, 49.267033f, 171.60704f, 50.83f, 173.17f),
                    PathNode.LineTo(76.0f, 198.34f),
                    PathNode.LineTo(76.0f, 48.0f),
                    PathNode.CurveTo(76.0f, 45.79086f, 77.79086f, 44.0f, 80.0f, 44.0f),
                    PathNode.CurveTo(82.20914f, 44.0f, 84.0f, 45.79086f, 84.0f, 48.0f),
                    PathNode.LineTo(84.0f, 198.34f),
                    PathNode.LineTo(109.17f, 173.17f),
                    PathNode.CurveTo(109.92027f, 172.41888f, 110.93836f, 171.99686f, 112.0f, 171.99686f),
                    PathNode.CurveTo(113.06164f, 171.99686f, 114.07973f, 172.41888f, 114.83f, 173.17f),
                    PathNode.Close,
                    PathNode.MoveTo(210.83f, 77.17f),
                    PathNode.LineTo(178.83f, 45.17f),
                    PathNode.CurveTo(178.07973f, 44.41889f, 177.06163f, 43.996853f, 176.0f, 43.996853f),
                    PathNode.CurveTo(174.93837f, 43.996853f, 173.92027f, 44.41889f, 173.17f, 45.17f),
                    PathNode.LineTo(141.17f, 77.17f),
                    PathNode.CurveTo(139.60704f, 78.73296f, 139.60704f, 81.26704f, 141.17f, 82.83f),
                    PathNode.CurveTo(142.73297f, 84.39297f, 145.26703f, 84.39297f, 146.83f, 82.83f),
                    PathNode.LineTo(172.0f, 57.66f),
                    PathNode.LineTo(172.0f, 208.0f),
                    PathNode.CurveTo(172.0f, 210.20914f, 173.79086f, 212.0f, 176.0f, 212.0f),
                    PathNode.CurveTo(178.20914f, 212.0f, 180.0f, 210.20914f, 180.0f, 208.0f),
                    PathNode.LineTo(180.0f, 57.66f),
                    PathNode.LineTo(205.17f, 82.83f),
                    PathNode.CurveTo(206.73297f, 84.39297f, 209.26703f, 84.39297f, 210.83f, 82.83f),
                    PathNode.CurveTo(212.39296f, 81.26704f, 212.39296f, 78.73296f, 210.83f, 77.17f),
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
        return _arrowsDownUp!!
    }

private var _arrowsDownUp: ImageVector? = null
