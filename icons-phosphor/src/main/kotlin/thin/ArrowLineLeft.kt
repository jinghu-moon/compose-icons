package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowLineLeft: ImageVector
    get() {
        if (_arrowLineLeft != null) return _arrowLineLeft!!
        _arrowLineLeft = phosphorThinIcon(
            name = "ArrowLineLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 128.0f),
                    PathNode.CurveTo(228.0f, 130.20914f, 226.20914f, 132.0f, 224.0f, 132.0f),
                    PathNode.LineTo(81.66f, 132.0f),
                    PathNode.LineTo(146.83f, 197.17f),
                    PathNode.CurveTo(148.39296f, 198.73297f, 148.39296f, 201.26703f, 146.83f, 202.83f),
                    PathNode.CurveTo(145.26703f, 204.39296f, 142.73297f, 204.39296f, 141.17f, 202.83f),
                    PathNode.LineTo(69.17f, 130.83f),
                    PathNode.CurveTo(68.418884f, 130.07973f, 67.99686f, 129.06163f, 67.99686f, 128.0f),
                    PathNode.CurveTo(67.99686f, 126.93836f, 68.418884f, 125.92027f, 69.17f, 125.17f),
                    PathNode.LineTo(141.17f, 53.17f),
                    PathNode.CurveTo(142.73297f, 51.607033f, 145.26703f, 51.607033f, 146.83f, 53.17f),
                    PathNode.CurveTo(148.39296f, 54.732967f, 148.39296f, 57.267033f, 146.83f, 58.83f),
                    PathNode.LineTo(81.66f, 124.0f),
                    PathNode.LineTo(224.0f, 124.0f),
                    PathNode.CurveTo(226.20914f, 124.0f, 228.0f, 125.79086f, 228.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 36.0f),
                    PathNode.CurveTo(37.79086f, 36.0f, 36.0f, 37.79086f, 36.0f, 40.0f),
                    PathNode.LineTo(36.0f, 216.0f),
                    PathNode.CurveTo(36.0f, 218.20914f, 37.79086f, 220.0f, 40.0f, 220.0f),
                    PathNode.CurveTo(42.20914f, 220.0f, 44.0f, 218.20914f, 44.0f, 216.0f),
                    PathNode.LineTo(44.0f, 40.0f),
                    PathNode.CurveTo(44.0f, 37.79086f, 42.20914f, 36.0f, 40.0f, 36.0f),
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
        return _arrowLineLeft!!
    }

private var _arrowLineLeft: ImageVector? = null
