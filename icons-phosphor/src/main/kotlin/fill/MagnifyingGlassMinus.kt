package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MagnifyingGlassMinus: ImageVector
    get() {
        if (_magnifyingGlassMinus != null) return _magnifyingGlassMinus!!
        _magnifyingGlassMinus = phosphorFillIcon(
            name = "MagnifyingGlassMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
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
                    PathNode.MoveTo(144.0f, 120.0f),
                    PathNode.LineTo(80.0f, 120.0f),
                    PathNode.CurveTo(75.58172f, 120.0f, 72.0f, 116.41828f, 72.0f, 112.0f),
                    PathNode.CurveTo(72.0f, 107.58172f, 75.58172f, 104.0f, 80.0f, 104.0f),
                    PathNode.LineTo(144.0f, 104.0f),
                    PathNode.CurveTo(148.41827f, 104.0f, 152.0f, 107.58172f, 152.0f, 112.0f),
                    PathNode.CurveTo(152.0f, 116.41828f, 148.41827f, 120.0f, 144.0f, 120.0f),
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
        return _magnifyingGlassMinus!!
    }

private var _magnifyingGlassMinus: ImageVector? = null
