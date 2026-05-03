package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BookmarkSimple: ImageVector
    get() {
        if (_bookmarkSimple != null) return _bookmarkSimple!!
        _bookmarkSimple = phosphorThinIcon(
            name = "BookmarkSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 36.0f),
                    PathNode.LineTo(72.0f, 36.0f),
                    PathNode.CurveTo(65.37258f, 36.0f, 60.0f, 41.37258f, 60.0f, 48.0f),
                    PathNode.LineTo(60.0f, 224.0f),
                    PathNode.CurveTo(60.000725f, 225.45375f, 60.790115f, 226.79266f, 62.0618f, 227.49707f),
                    PathNode.CurveTo(63.33348f, 228.20148f, 64.88723f, 228.16049f, 66.12f, 227.39f),
                    PathNode.LineTo(128.0f, 188.72f),
                    PathNode.LineTo(189.89f, 227.39f),
                    PathNode.CurveTo(190.52263f, 227.78624f, 191.25352f, 227.99754f, 192.0f, 228.0f),
                    PathNode.CurveTo(192.67828f, 227.998f, 193.34525f, 227.8261f, 193.94f, 227.5f),
                    PathNode.CurveTo(195.21191f, 226.7946f, 196.0007f, 225.45442f, 196.0f, 224.0f),
                    PathNode.LineTo(196.0f, 48.0f),
                    PathNode.CurveTo(196.0f, 41.37258f, 190.62741f, 36.0f, 184.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 216.78f),
                    PathNode.LineTo(130.11f, 180.61f),
                    PathNode.CurveTo(128.81291f, 179.79932f, 127.16708f, 179.79932f, 125.87f, 180.61f),
                    PathNode.LineTo(68.0f, 216.78f),
                    PathNode.LineTo(68.0f, 48.0f),
                    PathNode.CurveTo(68.0f, 45.79086f, 69.79086f, 44.0f, 72.0f, 44.0f),
                    PathNode.LineTo(184.0f, 44.0f),
                    PathNode.CurveTo(186.20914f, 44.0f, 188.0f, 45.79086f, 188.0f, 48.0f),
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
        return _bookmarkSimple!!
    }

private var _bookmarkSimple: ImageVector? = null
