package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GridNine: ImageVector
    get() {
        if (_gridNine != null) return _gridNine!!
        _gridNine = phosphorThinIcon(
            name = "GridNine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 52.0f),
                    PathNode.LineTo(40.0f, 52.0f),
                    PathNode.CurveTo(33.37258f, 52.0f, 28.0f, 57.37258f, 28.0f, 64.0f),
                    PathNode.LineTo(28.0f, 192.0f),
                    PathNode.CurveTo(28.0f, 198.62741f, 33.37258f, 204.0f, 40.0f, 204.0f),
                    PathNode.LineTo(216.0f, 204.0f),
                    PathNode.CurveTo(222.62741f, 204.0f, 228.0f, 198.62741f, 228.0f, 192.0f),
                    PathNode.LineTo(228.0f, 64.0f),
                    PathNode.CurveTo(228.0f, 57.37258f, 222.62741f, 52.0f, 216.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 148.0f),
                    PathNode.LineTo(100.0f, 108.0f),
                    PathNode.LineTo(156.0f, 108.0f),
                    PathNode.LineTo(156.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 156.0f),
                    PathNode.LineTo(156.0f, 196.0f),
                    PathNode.LineTo(100.0f, 196.0f),
                    PathNode.LineTo(100.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 108.0f),
                    PathNode.LineTo(92.0f, 108.0f),
                    PathNode.LineTo(92.0f, 148.0f),
                    PathNode.LineTo(36.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 100.0f),
                    PathNode.LineTo(100.0f, 60.0f),
                    PathNode.LineTo(156.0f, 60.0f),
                    PathNode.LineTo(156.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 108.0f),
                    PathNode.LineTo(220.0f, 108.0f),
                    PathNode.LineTo(220.0f, 148.0f),
                    PathNode.LineTo(164.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 64.0f),
                    PathNode.LineTo(220.0f, 100.0f),
                    PathNode.LineTo(164.0f, 100.0f),
                    PathNode.LineTo(164.0f, 60.0f),
                    PathNode.LineTo(216.0f, 60.0f),
                    PathNode.CurveTo(218.20914f, 60.0f, 220.0f, 61.79086f, 220.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 60.0f),
                    PathNode.LineTo(92.0f, 60.0f),
                    PathNode.LineTo(92.0f, 100.0f),
                    PathNode.LineTo(36.0f, 100.0f),
                    PathNode.LineTo(36.0f, 64.0f),
                    PathNode.CurveTo(36.0f, 61.79086f, 37.79086f, 60.0f, 40.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 192.0f),
                    PathNode.LineTo(36.0f, 156.0f),
                    PathNode.LineTo(92.0f, 156.0f),
                    PathNode.LineTo(92.0f, 196.0f),
                    PathNode.LineTo(40.0f, 196.0f),
                    PathNode.CurveTo(37.79086f, 196.0f, 36.0f, 194.20914f, 36.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 196.0f),
                    PathNode.LineTo(164.0f, 196.0f),
                    PathNode.LineTo(164.0f, 156.0f),
                    PathNode.LineTo(220.0f, 156.0f),
                    PathNode.LineTo(220.0f, 192.0f),
                    PathNode.CurveTo(220.0f, 194.20914f, 218.20914f, 196.0f, 216.0f, 196.0f),
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
        return _gridNine!!
    }

private var _gridNine: ImageVector? = null
