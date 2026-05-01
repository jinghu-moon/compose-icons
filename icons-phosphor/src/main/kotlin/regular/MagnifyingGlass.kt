package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.MagnifyingGlass: ImageVector
    get() {
        if (_magnifyingGlass != null) return _magnifyingGlass!!
        _magnifyingGlass = phosphorRegularIcon(
            name = "MagnifyingGlass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(229.66f, 218.34f),
                    PathNode.LineTo(179.59f, 168.28f),
                    PathNode.CurveTo(209.73773f, 132.08572f, 206.08473f, 78.58063f, 171.29742f, 46.819717f),
                    PathNode.CurveTo(136.51012f, 15.058808f, 82.89431f, 16.277315f, 49.585815f, 49.585815f),
                    PathNode.CurveTo(16.277315f, 82.89431f, 15.058808f, 136.51012f, 46.819717f, 171.29742f),
                    PathNode.CurveTo(78.58063f, 206.08473f, 132.08572f, 209.73773f, 168.28f, 179.59f),
                    PathNode.LineTo(218.34f, 229.66f),
                    PathNode.CurveTo(221.46593f, 232.78593f, 226.53407f, 232.78593f, 229.66f, 229.66f),
                    PathNode.CurveTo(232.78593f, 226.53407f, 232.78593f, 221.46593f, 229.66f, 218.34f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 112.0f),
                    PathNode.CurveTo(40.0f, 72.2355f, 72.2355f, 40.0f, 112.0f, 40.0f),
                    PathNode.CurveTo(151.7645f, 40.0f, 184.0f, 72.2355f, 184.0f, 112.0f),
                    PathNode.CurveTo(184.0f, 151.7645f, 151.7645f, 184.0f, 112.0f, 184.0f),
                    PathNode.CurveTo(72.25378f, 183.95592f, 40.04409f, 151.74623f, 40.0f, 112.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _magnifyingGlass!!
    }

private var _magnifyingGlass: ImageVector? = null
