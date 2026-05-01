package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BookmarkSimple: ImageVector
    get() {
        if (_bookmarkSimple != null) return _bookmarkSimple!!
        _bookmarkSimple = phosphorBoldIcon(
            name = "BookmarkSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 28.0f),
                    PathNode.LineTo(72.0f, 28.0f),
                    PathNode.CurveTo(60.954304f, 28.0f, 52.0f, 36.954304f, 52.0f, 48.0f),
                    PathNode.LineTo(52.0f, 224.0f),
                    PathNode.CurveTo(51.998535f, 228.36302f, 54.365288f, 232.38307f, 58.181023f, 234.49876f),
                    PathNode.CurveTo(61.996758f, 236.61447f, 66.660164f, 236.4924f, 70.36f, 234.18f),
                    PathNode.LineTo(127.99f, 198.18f),
                    PathNode.LineTo(185.64f, 234.18f),
                    PathNode.CurveTo(189.33984f, 236.4924f, 194.00325f, 236.61447f, 197.81898f, 234.49876f),
                    PathNode.CurveTo(201.63472f, 232.38307f, 204.00146f, 228.36302f, 204.0f, 224.0f),
                    PathNode.LineTo(204.0f, 48.0f),
                    PathNode.CurveTo(204.0f, 36.954304f, 195.0457f, 28.0f, 184.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 202.35f),
                    PathNode.LineTo(134.35f, 173.82f),
                    PathNode.CurveTo(130.45876f, 171.38795f, 125.52125f, 171.38795f, 121.63f, 173.82f),
                    PathNode.LineTo(76.0f, 202.35f),
                    PathNode.LineTo(76.0f, 52.0f),
                    PathNode.LineTo(180.0f, 52.0f),
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
        return _bookmarkSimple!!
    }

private var _bookmarkSimple: ImageVector? = null
