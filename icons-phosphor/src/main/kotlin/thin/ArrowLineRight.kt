package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowLineRight: ImageVector
    get() {
        if (_arrowLineRight != null) return _arrowLineRight!!
        _arrowLineRight = phosphorThinIcon(
            name = "ArrowLineRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(186.83f, 125.17f),
                    PathNode.CurveTo(187.58112f, 125.92027f, 188.00314f, 126.93836f, 188.00314f, 128.0f),
                    PathNode.CurveTo(188.00314f, 129.06163f, 187.58112f, 130.07973f, 186.83f, 130.83f),
                    PathNode.LineTo(114.83f, 202.83f),
                    PathNode.CurveTo(113.26704f, 204.39296f, 110.73296f, 204.39296f, 109.17f, 202.83f),
                    PathNode.CurveTo(107.60703f, 201.26703f, 107.60703f, 198.73297f, 109.17f, 197.17f),
                    PathNode.LineTo(174.34f, 132.0f),
                    PathNode.LineTo(32.0f, 132.0f),
                    PathNode.CurveTo(29.790861f, 132.0f, 28.0f, 130.20914f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 125.79086f, 29.790861f, 124.0f, 32.0f, 124.0f),
                    PathNode.LineTo(174.34f, 124.0f),
                    PathNode.LineTo(109.17f, 58.83f),
                    PathNode.CurveTo(107.60703f, 57.267033f, 107.60703f, 54.732967f, 109.17f, 53.17f),
                    PathNode.CurveTo(110.73296f, 51.607033f, 113.26704f, 51.607033f, 114.83f, 53.17f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 36.0f),
                    PathNode.CurveTo(213.79086f, 36.0f, 212.0f, 37.79086f, 212.0f, 40.0f),
                    PathNode.LineTo(212.0f, 216.0f),
                    PathNode.CurveTo(212.0f, 218.20914f, 213.79086f, 220.0f, 216.0f, 220.0f),
                    PathNode.CurveTo(218.20914f, 220.0f, 220.0f, 218.20914f, 220.0f, 216.0f),
                    PathNode.LineTo(220.0f, 40.0f),
                    PathNode.CurveTo(220.0f, 37.79086f, 218.20914f, 36.0f, 216.0f, 36.0f),
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
        return _arrowLineRight!!
    }

private var _arrowLineRight: ImageVector? = null
