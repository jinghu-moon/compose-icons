package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BookOpen: ImageVector
    get() {
        if (_bookOpen != null) return _bookOpen!!
        _bookOpen = phosphorFillIcon(
            name = "BookOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 56.0f),
                    PathNode.LineTo(240.0f, 200.0f),
                    PathNode.CurveTo(240.0f, 204.41827f, 236.41827f, 208.0f, 232.0f, 208.0f),
                    PathNode.LineTo(160.0f, 208.0f),
                    PathNode.CurveTo(146.76855f, 207.99995f, 136.03308f, 218.7086f, 136.0f, 231.94f),
                    PathNode.CurveTo(136.06557f, 235.28734f, 134.01407f, 238.3125f, 130.88f, 239.49f),
                    PathNode.CurveTo(128.41519f, 240.44112f, 125.639755f, 240.114f, 123.463615f, 238.6159f),
                    PathNode.CurveTo(121.287476f, 237.11781f, 119.99128f, 234.64194f, 120.0f, 232.0f),
                    PathNode.CurveTo(120.0f, 218.74516f, 109.25484f, 208.0f, 96.0f, 208.0f),
                    PathNode.LineTo(24.0f, 208.0f),
                    PathNode.CurveTo(19.581722f, 208.0f, 16.0f, 204.41827f, 16.0f, 200.0f),
                    PathNode.LineTo(16.0f, 56.0f),
                    PathNode.CurveTo(16.0f, 51.581722f, 19.581722f, 48.0f, 24.0f, 48.0f),
                    PathNode.LineTo(88.0f, 48.0f),
                    PathNode.CurveTo(105.67311f, 48.0f, 120.0f, 62.32689f, 120.0f, 80.0f),
                    PathNode.LineTo(120.0f, 167.73f),
                    PathNode.CurveTo(119.94234f, 172.013f, 123.20232f, 175.61339f, 127.47f, 175.98f),
                    PathNode.CurveTo(129.68198f, 176.12688f, 131.85571f, 175.34932f, 133.47269f, 173.83281f),
                    PathNode.CurveTo(135.08966f, 172.3163f, 136.00487f, 170.19684f, 136.0f, 167.98f),
                    PathNode.LineTo(136.0f, 80.0f),
                    PathNode.CurveTo(136.0f, 62.32689f, 150.32689f, 48.0f, 168.0f, 48.0f),
                    PathNode.LineTo(232.0f, 48.0f),
                    PathNode.CurveTo(236.41827f, 48.0f, 240.0f, 51.581722f, 240.0f, 56.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _bookOpen!!
    }

private var _bookOpen: ImageVector? = null
