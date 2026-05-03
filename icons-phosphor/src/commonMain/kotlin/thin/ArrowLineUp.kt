package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowLineUp: ImageVector
    get() {
        if (_arrowLineUp != null) return _arrowLineUp!!
        _arrowLineUp = phosphorThinIcon(
            name = "ArrowLineUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(202.83f, 141.17f),
                    PathNode.CurveTo(204.39296f, 142.73297f, 204.39296f, 145.26703f, 202.83f, 146.83f),
                    PathNode.CurveTo(201.26703f, 148.39296f, 198.73297f, 148.39296f, 197.17f, 146.83f),
                    PathNode.LineTo(132.0f, 81.66f),
                    PathNode.LineTo(132.0f, 224.0f),
                    PathNode.CurveTo(132.0f, 226.20914f, 130.20914f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(125.79086f, 228.0f, 124.0f, 226.20914f, 124.0f, 224.0f),
                    PathNode.LineTo(124.0f, 81.66f),
                    PathNode.LineTo(58.83f, 146.83f),
                    PathNode.CurveTo(57.267033f, 148.39296f, 54.732967f, 148.39296f, 53.17f, 146.83f),
                    PathNode.CurveTo(51.607033f, 145.26703f, 51.607033f, 142.73297f, 53.17f, 141.17f),
                    PathNode.LineTo(125.17f, 69.17f),
                    PathNode.CurveTo(125.92027f, 68.418884f, 126.93836f, 67.99686f, 128.0f, 67.99686f),
                    PathNode.CurveTo(129.06163f, 67.99686f, 130.07973f, 68.418884f, 130.83f, 69.17f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 36.0f),
                    PathNode.LineTo(40.0f, 36.0f),
                    PathNode.CurveTo(37.79086f, 36.0f, 36.0f, 37.79086f, 36.0f, 40.0f),
                    PathNode.CurveTo(36.0f, 42.20914f, 37.79086f, 44.0f, 40.0f, 44.0f),
                    PathNode.LineTo(216.0f, 44.0f),
                    PathNode.CurveTo(218.20914f, 44.0f, 220.0f, 42.20914f, 220.0f, 40.0f),
                    PathNode.CurveTo(220.0f, 37.79086f, 218.20914f, 36.0f, 216.0f, 36.0f),
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
        return _arrowLineUp!!
    }

private var _arrowLineUp: ImageVector? = null
