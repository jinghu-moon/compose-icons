package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BookmarkSimple: ImageVector
    get() {
        if (_bookmarkSimple != null) return _bookmarkSimple!!
        _bookmarkSimple = phosphorFillIcon(
            name = "BookmarkSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 32.0f),
                    PathNode.LineTo(72.0f, 32.0f),
                    PathNode.CurveTo(63.163445f, 32.0f, 56.0f, 39.163445f, 56.0f, 48.0f),
                    PathNode.LineTo(56.0f, 224.0f),
                    PathNode.CurveTo(56.001446f, 226.90749f, 57.58023f, 229.5853f, 60.123596f, 230.99413f),
                    PathNode.CurveTo(62.66696f, 232.40295f, 65.77445f, 232.32097f, 68.24f, 230.78f),
                    PathNode.LineTo(128.0f, 193.43f),
                    PathNode.LineTo(187.77f, 230.78f),
                    PathNode.CurveTo(190.23508f, 232.31563f, 193.33876f, 232.39468f, 195.87883f, 230.98654f),
                    PathNode.CurveTo(198.41888f, 229.5784f, 199.99629f, 226.90427f, 200.0f, 224.0f),
                    PathNode.LineTo(200.0f, 48.0f),
                    PathNode.CurveTo(200.0f, 39.163445f, 192.83656f, 32.0f, 184.0f, 32.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _bookmarkSimple!!
    }

private var _bookmarkSimple: ImageVector? = null
