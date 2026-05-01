package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowLineDownRight: ImageVector
    get() {
        if (_arrowLineDownRight != null) return _arrowLineDownRight!!
        _arrowLineDownRight = phosphorThinIcon(
            name = "ArrowLineDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.0f, 40.0f),
                    PathNode.CurveTo(220.0f, 42.20914f, 218.20914f, 44.0f, 216.0f, 44.0f),
                    PathNode.LineTo(40.0f, 44.0f),
                    PathNode.CurveTo(37.79086f, 44.0f, 36.0f, 42.20914f, 36.0f, 40.0f),
                    PathNode.CurveTo(36.0f, 37.79086f, 37.79086f, 36.0f, 40.0f, 36.0f),
                    PathNode.LineTo(216.0f, 36.0f),
                    PathNode.CurveTo(218.20914f, 36.0f, 220.0f, 37.79086f, 220.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 100.0f),
                    PathNode.CurveTo(189.79086f, 100.0f, 188.0f, 101.79086f, 188.0f, 104.0f),
                    PathNode.LineTo(188.0f, 190.34f),
                    PathNode.LineTo(82.83f, 85.17f),
                    PathNode.CurveTo(81.26704f, 83.60703f, 78.73296f, 83.60703f, 77.17f, 85.17f),
                    PathNode.CurveTo(75.60703f, 86.73296f, 75.60703f, 89.26704f, 77.17f, 90.83f),
                    PathNode.LineTo(182.34f, 196.0f),
                    PathNode.LineTo(96.0f, 196.0f),
                    PathNode.CurveTo(93.79086f, 196.0f, 92.0f, 197.79086f, 92.0f, 200.0f),
                    PathNode.CurveTo(92.0f, 202.20914f, 93.79086f, 204.0f, 96.0f, 204.0f),
                    PathNode.LineTo(192.0f, 204.0f),
                    PathNode.CurveTo(194.20914f, 204.0f, 196.0f, 202.20914f, 196.0f, 200.0f),
                    PathNode.LineTo(196.0f, 104.0f),
                    PathNode.CurveTo(196.0f, 101.79086f, 194.20914f, 100.0f, 192.0f, 100.0f),
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
        return _arrowLineDownRight!!
    }

private var _arrowLineDownRight: ImageVector? = null
