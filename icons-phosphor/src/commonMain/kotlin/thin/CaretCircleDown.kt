package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CaretCircleDown: ImageVector
    get() {
        if (_caretCircleDown != null) return _caretCircleDown!!
        _caretCircleDown = phosphorThinIcon(
            name = "CaretCircleDown",
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
                    PathNode.MoveTo(170.83f, 109.17f),
                    PathNode.CurveTo(171.58112f, 109.92027f, 172.00314f, 110.93836f, 172.00314f, 112.0f),
                    PathNode.CurveTo(172.00314f, 113.06164f, 171.58112f, 114.07973f, 170.83f, 114.83f),
                    PathNode.LineTo(130.83f, 154.83f),
                    PathNode.CurveTo(130.07973f, 155.58112f, 129.06163f, 156.00314f, 128.0f, 156.00314f),
                    PathNode.CurveTo(126.93836f, 156.00314f, 125.92027f, 155.58112f, 125.17f, 154.83f),
                    PathNode.LineTo(85.17f, 114.83f),
                    PathNode.CurveTo(83.60703f, 113.26704f, 83.60703f, 110.73296f, 85.17f, 109.17f),
                    PathNode.CurveTo(86.73296f, 107.60703f, 89.26704f, 107.60703f, 90.83f, 109.17f),
                    PathNode.LineTo(128.0f, 146.34f),
                    PathNode.LineTo(165.17f, 109.17f),
                    PathNode.CurveTo(165.92027f, 108.418884f, 166.93837f, 107.99686f, 168.0f, 107.99686f),
                    PathNode.CurveTo(169.06163f, 107.99686f, 170.07973f, 108.418884f, 170.83f, 109.17f),
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
        return _caretCircleDown!!
    }

private var _caretCircleDown: ImageVector? = null
