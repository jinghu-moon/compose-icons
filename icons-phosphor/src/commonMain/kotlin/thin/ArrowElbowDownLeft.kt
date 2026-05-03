package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowElbowDownLeft: ImageVector
    get() {
        if (_arrowElbowDownLeft != null) return _arrowElbowDownLeft!!
        _arrowElbowDownLeft = phosphorThinIcon(
            name = "ArrowElbowDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(196.0f, 32.0f),
                    PathNode.LineTo(196.0f, 176.0f),
                    PathNode.CurveTo(196.0f, 178.20914f, 194.20914f, 180.0f, 192.0f, 180.0f),
                    PathNode.LineTo(57.66f, 180.0f),
                    PathNode.LineTo(98.83f, 221.17f),
                    PathNode.CurveTo(100.39297f, 222.73297f, 100.39297f, 225.26703f, 98.83f, 226.83f),
                    PathNode.CurveTo(97.26704f, 228.39296f, 94.73296f, 228.39296f, 93.17f, 226.83f),
                    PathNode.LineTo(45.17f, 178.83f),
                    PathNode.CurveTo(44.41889f, 178.07973f, 43.996853f, 177.06163f, 43.996853f, 176.0f),
                    PathNode.CurveTo(43.996853f, 174.93837f, 44.41889f, 173.92027f, 45.17f, 173.17f),
                    PathNode.LineTo(93.17f, 125.17f),
                    PathNode.CurveTo(94.73296f, 123.60703f, 97.26704f, 123.60703f, 98.83f, 125.17f),
                    PathNode.CurveTo(100.39297f, 126.73296f, 100.39297f, 129.26703f, 98.83f, 130.83f),
                    PathNode.LineTo(57.66f, 172.0f),
                    PathNode.LineTo(188.0f, 172.0f),
                    PathNode.LineTo(188.0f, 32.0f),
                    PathNode.CurveTo(188.0f, 29.790861f, 189.79086f, 28.0f, 192.0f, 28.0f),
                    PathNode.CurveTo(194.20914f, 28.0f, 196.0f, 29.790861f, 196.0f, 32.0f),
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
        return _arrowElbowDownLeft!!
    }

private var _arrowElbowDownLeft: ImageVector? = null
