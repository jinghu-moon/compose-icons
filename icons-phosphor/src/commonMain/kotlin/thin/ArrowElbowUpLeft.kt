package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowElbowUpLeft: ImageVector
    get() {
        if (_arrowElbowUpLeft != null) return _arrowElbowUpLeft!!
        _arrowElbowUpLeft = phosphorThinIcon(
            name = "ArrowElbowUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(196.0f, 80.0f),
                    PathNode.LineTo(196.0f, 224.0f),
                    PathNode.CurveTo(196.0f, 226.20914f, 194.20914f, 228.0f, 192.0f, 228.0f),
                    PathNode.CurveTo(189.79086f, 228.0f, 188.0f, 226.20914f, 188.0f, 224.0f),
                    PathNode.LineTo(188.0f, 84.0f),
                    PathNode.LineTo(57.66f, 84.0f),
                    PathNode.LineTo(98.83f, 125.17f),
                    PathNode.CurveTo(100.39297f, 126.73296f, 100.39297f, 129.26703f, 98.83f, 130.83f),
                    PathNode.CurveTo(97.26704f, 132.39296f, 94.73296f, 132.39296f, 93.17f, 130.83f),
                    PathNode.LineTo(45.17f, 82.83f),
                    PathNode.CurveTo(44.41889f, 82.07973f, 43.996853f, 81.06164f, 43.996853f, 80.0f),
                    PathNode.CurveTo(43.996853f, 78.93836f, 44.41889f, 77.92027f, 45.17f, 77.17f),
                    PathNode.LineTo(93.17f, 29.17f),
                    PathNode.CurveTo(94.73296f, 27.607035f, 97.26704f, 27.607035f, 98.83f, 29.17f),
                    PathNode.CurveTo(100.39297f, 30.732965f, 100.39297f, 33.267033f, 98.83f, 34.83f),
                    PathNode.LineTo(57.66f, 76.0f),
                    PathNode.LineTo(192.0f, 76.0f),
                    PathNode.CurveTo(194.20914f, 76.0f, 196.0f, 77.79086f, 196.0f, 80.0f),
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
        return _arrowElbowUpLeft!!
    }

private var _arrowElbowUpLeft: ImageVector? = null
