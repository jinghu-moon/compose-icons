package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.MagnifyingGlass: ImageVector
    get() {
        if (_magnifyingGlass != null) return _magnifyingGlass!!
        _magnifyingGlass = phosphorDuotoneIcon(
            name = "MagnifyingGlass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 112.0f),
                    PathNode.CurveTo(192.0f, 156.18279f, 156.18279f, 192.0f, 112.0f, 192.0f),
                    PathNode.CurveTo(67.81722f, 192.0f, 32.0f, 156.18279f, 32.0f, 112.0f),
                    PathNode.CurveTo(32.0f, 67.81722f, 67.81722f, 32.0f, 112.0f, 32.0f),
                    PathNode.CurveTo(156.18279f, 32.0f, 192.0f, 67.81722f, 192.0f, 112.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(229.66f, 218.34f),
                    PathNode.LineTo(179.6f, 168.28f),
                    PathNode.CurveTo(209.80093f, 132.05905f, 206.16989f, 78.48998f, 171.35736f, 46.675816f),
                    PathNode.CurveTo(136.54483f, 14.861648f, 82.86615f, 16.057005f, 49.504353f, 49.389328f),
                    PathNode.CurveTo(16.142557f, 82.72165f, 14.899759f, 136.39926f, 46.683147f, 171.2399f),
                    PathNode.CurveTo(78.46653f, 206.08052f, 132.03238f, 209.75891f, 168.28f, 179.59f),
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
