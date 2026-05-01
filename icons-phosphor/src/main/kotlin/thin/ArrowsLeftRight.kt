package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowsLeftRight: ImageVector
    get() {
        if (_arrowsLeftRight != null) return _arrowsLeftRight!!
        _arrowsLeftRight = phosphorThinIcon(
            name = "ArrowsLeftRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(210.83f, 173.17f),
                    PathNode.CurveTo(211.58112f, 173.92027f, 212.00314f, 174.93837f, 212.00314f, 176.0f),
                    PathNode.CurveTo(212.00314f, 177.06163f, 211.58112f, 178.07973f, 210.83f, 178.83f),
                    PathNode.LineTo(178.83f, 210.83f),
                    PathNode.CurveTo(177.26703f, 212.39296f, 174.73297f, 212.39296f, 173.17f, 210.83f),
                    PathNode.CurveTo(171.60704f, 209.26703f, 171.60704f, 206.73297f, 173.17f, 205.17f),
                    PathNode.LineTo(198.34f, 180.0f),
                    PathNode.LineTo(48.0f, 180.0f),
                    PathNode.CurveTo(45.79086f, 180.0f, 44.0f, 178.20914f, 44.0f, 176.0f),
                    PathNode.CurveTo(44.0f, 173.79086f, 45.79086f, 172.0f, 48.0f, 172.0f),
                    PathNode.LineTo(198.34f, 172.0f),
                    PathNode.LineTo(173.17f, 146.83f),
                    PathNode.CurveTo(171.60704f, 145.26703f, 171.60704f, 142.73297f, 173.17f, 141.17f),
                    PathNode.CurveTo(174.73297f, 139.60704f, 177.26703f, 139.60704f, 178.83f, 141.17f),
                    PathNode.Close,
                    PathNode.MoveTo(77.17f, 114.83f),
                    PathNode.CurveTo(78.73296f, 116.39297f, 81.26704f, 116.39297f, 82.83f, 114.83f),
                    PathNode.CurveTo(84.39297f, 113.26704f, 84.39297f, 110.73296f, 82.83f, 109.17f),
                    PathNode.LineTo(57.66f, 84.0f),
                    PathNode.LineTo(208.0f, 84.0f),
                    PathNode.CurveTo(210.20914f, 84.0f, 212.0f, 82.20914f, 212.0f, 80.0f),
                    PathNode.CurveTo(212.0f, 77.79086f, 210.20914f, 76.0f, 208.0f, 76.0f),
                    PathNode.LineTo(57.66f, 76.0f),
                    PathNode.LineTo(82.83f, 50.83f),
                    PathNode.CurveTo(84.39297f, 49.267033f, 84.39297f, 46.732967f, 82.83f, 45.17f),
                    PathNode.CurveTo(81.26704f, 43.607033f, 78.73296f, 43.607033f, 77.17f, 45.17f),
                    PathNode.LineTo(45.17f, 77.17f),
                    PathNode.CurveTo(44.41889f, 77.92027f, 43.996853f, 78.93836f, 43.996853f, 80.0f),
                    PathNode.CurveTo(43.996853f, 81.06164f, 44.41889f, 82.07973f, 45.17f, 82.83f),
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
        return _arrowsLeftRight!!
    }

private var _arrowsLeftRight: ImageVector? = null
