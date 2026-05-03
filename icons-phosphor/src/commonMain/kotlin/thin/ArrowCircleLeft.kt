package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowCircleLeft: ImageVector
    get() {
        if (_arrowCircleLeft != null) return _arrowCircleLeft!!
        _arrowCircleLeft = phosphorThinIcon(
            name = "ArrowCircleLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 28.0f),
                    PathNode.CurveTo(72.77152f, 28.0f, 28.0f, 72.77152f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 183.22847f, 72.77152f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(183.22847f, 228.0f, 228.0f, 183.22847f, 228.0f, 128.0f),
                    PathNode.CurveTo(227.93938f, 72.79665f, 183.20334f, 28.060623f, 128.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 220.0f),
                    PathNode.CurveTo(77.18981f, 220.0f, 36.0f, 178.8102f, 36.0f, 128.0f),
                    PathNode.CurveTo(36.0f, 77.18981f, 77.18981f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(178.8102f, 36.0f, 220.0f, 77.18981f, 220.0f, 128.0f),
                    PathNode.CurveTo(219.94489f, 178.78735f, 178.78735f, 219.94489f, 128.0f, 220.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 128.0f),
                    PathNode.CurveTo(172.0f, 130.20914f, 170.20914f, 132.0f, 168.0f, 132.0f),
                    PathNode.LineTo(97.66f, 132.0f),
                    PathNode.LineTo(122.83f, 157.17f),
                    PathNode.CurveTo(124.39297f, 158.73297f, 124.39297f, 161.26703f, 122.83f, 162.83f),
                    PathNode.CurveTo(121.26704f, 164.39296f, 118.73296f, 164.39296f, 117.17f, 162.83f),
                    PathNode.LineTo(85.17f, 130.83f),
                    PathNode.CurveTo(84.418884f, 130.07973f, 83.99686f, 129.06163f, 83.99686f, 128.0f),
                    PathNode.CurveTo(83.99686f, 126.93836f, 84.418884f, 125.92027f, 85.17f, 125.17f),
                    PathNode.LineTo(117.17f, 93.17f),
                    PathNode.CurveTo(118.73296f, 91.60703f, 121.26704f, 91.60703f, 122.83f, 93.17f),
                    PathNode.CurveTo(124.39297f, 94.73296f, 124.39297f, 97.26704f, 122.83f, 98.83f),
                    PathNode.LineTo(97.66f, 124.0f),
                    PathNode.LineTo(168.0f, 124.0f),
                    PathNode.CurveTo(170.20914f, 124.0f, 172.0f, 125.79086f, 172.0f, 128.0f),
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
        return _arrowCircleLeft!!
    }

private var _arrowCircleLeft: ImageVector? = null
