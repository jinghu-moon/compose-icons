package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowLineDown: ImageVector
    get() {
        if (_arrowLineDown != null) return _arrowLineDown!!
        _arrowLineDown = phosphorThinIcon(
            name = "ArrowLineDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(53.17f, 114.83f),
                    PathNode.CurveTo(51.607033f, 113.26704f, 51.607033f, 110.73296f, 53.17f, 109.17f),
                    PathNode.CurveTo(54.732967f, 107.60703f, 57.267033f, 107.60703f, 58.83f, 109.17f),
                    PathNode.LineTo(124.0f, 174.34f),
                    PathNode.LineTo(124.0f, 32.0f),
                    PathNode.CurveTo(124.0f, 29.790861f, 125.79086f, 28.0f, 128.0f, 28.0f),
                    PathNode.CurveTo(130.20914f, 28.0f, 132.0f, 29.790861f, 132.0f, 32.0f),
                    PathNode.LineTo(132.0f, 174.34f),
                    PathNode.LineTo(197.17f, 109.17f),
                    PathNode.CurveTo(198.73297f, 107.60703f, 201.26703f, 107.60703f, 202.83f, 109.17f),
                    PathNode.CurveTo(204.39296f, 110.73296f, 204.39296f, 113.26704f, 202.83f, 114.83f),
                    PathNode.LineTo(130.83f, 186.83f),
                    PathNode.CurveTo(130.07973f, 187.58112f, 129.06163f, 188.00314f, 128.0f, 188.00314f),
                    PathNode.CurveTo(126.93836f, 188.00314f, 125.92027f, 187.58112f, 125.17f, 186.83f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 212.0f),
                    PathNode.LineTo(40.0f, 212.0f),
                    PathNode.CurveTo(37.79086f, 212.0f, 36.0f, 213.79086f, 36.0f, 216.0f),
                    PathNode.CurveTo(36.0f, 218.20914f, 37.79086f, 220.0f, 40.0f, 220.0f),
                    PathNode.LineTo(216.0f, 220.0f),
                    PathNode.CurveTo(218.20914f, 220.0f, 220.0f, 218.20914f, 220.0f, 216.0f),
                    PathNode.CurveTo(220.0f, 213.79086f, 218.20914f, 212.0f, 216.0f, 212.0f),
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
        return _arrowLineDown!!
    }

private var _arrowLineDown: ImageVector? = null
