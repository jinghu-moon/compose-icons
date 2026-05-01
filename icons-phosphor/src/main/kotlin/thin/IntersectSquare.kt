package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.IntersectSquare: ImageVector
    get() {
        if (_intersectSquare != null) return _intersectSquare!!
        _intersectSquare = phosphorThinIcon(
            name = "IntersectSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 92.0f),
                    PathNode.LineTo(164.0f, 92.0f),
                    PathNode.LineTo(164.0f, 40.0f),
                    PathNode.CurveTo(164.0f, 37.79086f, 162.20914f, 36.0f, 160.0f, 36.0f),
                    PathNode.LineTo(40.0f, 36.0f),
                    PathNode.CurveTo(37.79086f, 36.0f, 36.0f, 37.79086f, 36.0f, 40.0f),
                    PathNode.LineTo(36.0f, 160.0f),
                    PathNode.CurveTo(36.0f, 162.20914f, 37.79086f, 164.0f, 40.0f, 164.0f),
                    PathNode.LineTo(92.0f, 164.0f),
                    PathNode.LineTo(92.0f, 216.0f),
                    PathNode.CurveTo(92.0f, 218.20914f, 93.79086f, 220.0f, 96.0f, 220.0f),
                    PathNode.LineTo(216.0f, 220.0f),
                    PathNode.CurveTo(218.20914f, 220.0f, 220.0f, 218.20914f, 220.0f, 216.0f),
                    PathNode.LineTo(220.0f, 96.0f),
                    PathNode.CurveTo(220.0f, 93.79086f, 218.20914f, 92.0f, 216.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 156.0f),
                    PathNode.LineTo(44.0f, 44.0f),
                    PathNode.LineTo(156.0f, 44.0f),
                    PathNode.LineTo(156.0f, 92.0f),
                    PathNode.LineTo(96.0f, 92.0f),
                    PathNode.CurveTo(93.79086f, 92.0f, 92.0f, 93.79086f, 92.0f, 96.0f),
                    PathNode.LineTo(92.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 105.66f),
                    PathNode.LineTo(150.34f, 156.0f),
                    PathNode.LineTo(100.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 150.34f),
                    PathNode.LineTo(105.66f, 100.0f),
                    PathNode.LineTo(156.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 212.0f),
                    PathNode.LineTo(100.0f, 212.0f),
                    PathNode.LineTo(100.0f, 164.0f),
                    PathNode.LineTo(160.0f, 164.0f),
                    PathNode.CurveTo(162.20914f, 164.0f, 164.0f, 162.20914f, 164.0f, 160.0f),
                    PathNode.LineTo(164.0f, 100.0f),
                    PathNode.LineTo(212.0f, 100.0f),
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
        return _intersectSquare!!
    }

private var _intersectSquare: ImageVector? = null
