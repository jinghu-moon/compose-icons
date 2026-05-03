package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CaretCircleLeft: ImageVector
    get() {
        if (_caretCircleLeft != null) return _caretCircleLeft!!
        _caretCircleLeft = phosphorThinIcon(
            name = "CaretCircleLeft",
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
                    PathNode.MoveTo(146.83f, 90.83f),
                    PathNode.LineTo(109.66f, 128.0f),
                    PathNode.LineTo(146.83f, 165.17f),
                    PathNode.CurveTo(148.39296f, 166.73297f, 148.39296f, 169.26703f, 146.83f, 170.83f),
                    PathNode.CurveTo(145.26703f, 172.39296f, 142.73297f, 172.39296f, 141.17f, 170.83f),
                    PathNode.LineTo(101.17f, 130.83f),
                    PathNode.CurveTo(100.418884f, 130.07973f, 99.99686f, 129.06163f, 99.99686f, 128.0f),
                    PathNode.CurveTo(99.99686f, 126.93836f, 100.418884f, 125.92027f, 101.17f, 125.17f),
                    PathNode.LineTo(141.17f, 85.17f),
                    PathNode.CurveTo(142.73297f, 83.60703f, 145.26703f, 83.60703f, 146.83f, 85.17f),
                    PathNode.CurveTo(148.39296f, 86.73296f, 148.39296f, 89.26704f, 146.83f, 90.83f),
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
        return _caretCircleLeft!!
    }

private var _caretCircleLeft: ImageVector? = null
