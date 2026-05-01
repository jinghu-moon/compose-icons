package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BookmarksSimple: ImageVector
    get() {
        if (_bookmarksSimple != null) return _bookmarksSimple!!
        _bookmarksSimple = phosphorBoldIcon(
            name = "BookmarksSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(156.0f, 56.0f),
                    PathNode.LineTo(60.0f, 56.0f),
                    PathNode.CurveTo(48.954304f, 56.0f, 40.0f, 64.95431f, 40.0f, 76.0f),
                    PathNode.LineTo(40.0f, 228.0f),
                    PathNode.CurveTo(39.99504f, 232.50299f, 42.511463f, 236.62975f, 46.516895f, 238.68727f),
                    PathNode.CurveTo(50.522327f, 240.7448f, 55.342525f, 240.38675f, 59.0f, 237.76f),
                    PathNode.LineTo(108.0f, 202.76f),
                    PathNode.LineTo(157.0f, 237.76f),
                    PathNode.CurveTo(160.65747f, 240.38675f, 165.47768f, 240.7448f, 169.48311f, 238.68727f),
                    PathNode.CurveTo(173.48854f, 236.62975f, 176.00496f, 232.50299f, 176.0f, 228.0f),
                    PathNode.LineTo(176.0f, 76.0f),
                    PathNode.CurveTo(176.0f, 64.95431f, 167.0457f, 56.0f, 156.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 204.68f),
                    PathNode.LineTo(115.0f, 178.23f),
                    PathNode.CurveTo(110.81685f, 175.22572f, 105.18315f, 175.22572f, 101.0f, 178.23f),
                    PathNode.LineTo(64.0f, 204.68f),
                    PathNode.LineTo(64.0f, 80.0f),
                    PathNode.LineTo(152.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 36.0f),
                    PathNode.LineTo(216.0f, 188.0f),
                    PathNode.CurveTo(216.0f, 194.62741f, 210.62741f, 200.0f, 204.0f, 200.0f),
                    PathNode.CurveTo(197.37259f, 200.0f, 192.0f, 194.62741f, 192.0f, 188.0f),
                    PathNode.LineTo(192.0f, 40.0f),
                    PathNode.LineTo(92.0f, 40.0f),
                    PathNode.CurveTo(85.37258f, 40.0f, 80.0f, 34.62742f, 80.0f, 28.0f),
                    PathNode.CurveTo(80.0f, 21.372583f, 85.37258f, 16.0f, 92.0f, 16.0f),
                    PathNode.LineTo(196.0f, 16.0f),
                    PathNode.CurveTo(207.0457f, 16.0f, 216.0f, 24.954306f, 216.0f, 36.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _bookmarksSimple!!
    }

private var _bookmarksSimple: ImageVector? = null
