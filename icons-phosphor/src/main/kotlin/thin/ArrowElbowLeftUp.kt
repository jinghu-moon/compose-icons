package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowElbowLeftUp: ImageVector
    get() {
        if (_arrowElbowLeftUp != null) return _arrowElbowLeftUp!!
        _arrowElbowLeftUp = phosphorThinIcon(
            name = "ArrowElbowLeftUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.0f, 192.0f),
                    PathNode.CurveTo(236.0f, 194.20914f, 234.20914f, 196.0f, 232.0f, 196.0f),
                    PathNode.LineTo(88.0f, 196.0f),
                    PathNode.CurveTo(85.79086f, 196.0f, 84.0f, 194.20914f, 84.0f, 192.0f),
                    PathNode.LineTo(84.0f, 57.66f),
                    PathNode.LineTo(42.83f, 98.83f),
                    PathNode.CurveTo(41.267033f, 100.39297f, 38.732967f, 100.39297f, 37.17f, 98.83f),
                    PathNode.CurveTo(35.607033f, 97.26704f, 35.607033f, 94.73296f, 37.17f, 93.17f),
                    PathNode.LineTo(85.17f, 45.17f),
                    PathNode.CurveTo(85.92027f, 44.41889f, 86.93836f, 43.996853f, 88.0f, 43.996853f),
                    PathNode.CurveTo(89.06164f, 43.996853f, 90.07973f, 44.41889f, 90.83f, 45.17f),
                    PathNode.LineTo(138.83f, 93.17f),
                    PathNode.CurveTo(140.39296f, 94.73296f, 140.39296f, 97.26704f, 138.83f, 98.83f),
                    PathNode.CurveTo(137.26703f, 100.39297f, 134.73297f, 100.39297f, 133.17f, 98.83f),
                    PathNode.LineTo(92.0f, 57.66f),
                    PathNode.LineTo(92.0f, 188.0f),
                    PathNode.LineTo(232.0f, 188.0f),
                    PathNode.CurveTo(234.20914f, 188.0f, 236.0f, 189.79086f, 236.0f, 192.0f),
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
        return _arrowElbowLeftUp!!
    }

private var _arrowElbowLeftUp: ImageVector? = null
