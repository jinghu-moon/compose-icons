package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowLeft: ImageVector
    get() {
        if (_arrowLeft != null) return _arrowLeft!!
        _arrowLeft = phosphorThinIcon(
            name = "ArrowLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.0f, 128.0f),
                    PathNode.CurveTo(220.0f, 130.20914f, 218.20914f, 132.0f, 216.0f, 132.0f),
                    PathNode.LineTo(49.66f, 132.0f),
                    PathNode.LineTo(114.83f, 197.17f),
                    PathNode.CurveTo(116.39297f, 198.73297f, 116.39297f, 201.26703f, 114.83f, 202.83f),
                    PathNode.CurveTo(113.26704f, 204.39296f, 110.73296f, 204.39296f, 109.17f, 202.83f),
                    PathNode.LineTo(37.17f, 130.83f),
                    PathNode.CurveTo(36.41889f, 130.07973f, 35.996853f, 129.06163f, 35.996853f, 128.0f),
                    PathNode.CurveTo(35.996853f, 126.93836f, 36.41889f, 125.92027f, 37.17f, 125.17f),
                    PathNode.LineTo(109.17f, 53.17f),
                    PathNode.CurveTo(110.73296f, 51.607033f, 113.26704f, 51.607033f, 114.83f, 53.17f),
                    PathNode.CurveTo(116.39297f, 54.732967f, 116.39297f, 57.267033f, 114.83f, 58.83f),
                    PathNode.LineTo(49.66f, 124.0f),
                    PathNode.LineTo(216.0f, 124.0f),
                    PathNode.CurveTo(218.20914f, 124.0f, 220.0f, 125.79086f, 220.0f, 128.0f),
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
        return _arrowLeft!!
    }

private var _arrowLeft: ImageVector? = null
