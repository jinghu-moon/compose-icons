package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.MagnifyingGlassMinus: ImageVector
    get() {
        if (_magnifyingGlassMinus != null) return _magnifyingGlassMinus!!
        _magnifyingGlassMinus = phosphorRegularIcon(
            name = "MagnifyingGlassMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(152.0f, 112.0f),
                    PathNode.CurveTo(152.0f, 116.41828f, 148.41827f, 120.0f, 144.0f, 120.0f),
                    PathNode.LineTo(80.0f, 120.0f),
                    PathNode.CurveTo(75.58172f, 120.0f, 72.0f, 116.41828f, 72.0f, 112.0f),
                    PathNode.CurveTo(72.0f, 107.58172f, 75.58172f, 104.0f, 80.0f, 104.0f),
                    PathNode.LineTo(144.0f, 104.0f),
                    PathNode.CurveTo(148.41827f, 104.0f, 152.0f, 107.58172f, 152.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(229.66f, 229.66f),
                    PathNode.CurveTo(228.15945f, 231.16223f, 226.12328f, 232.00629f, 224.0f, 232.00629f),
                    PathNode.CurveTo(221.87672f, 232.00629f, 219.84055f, 231.16223f, 218.34f, 229.66f),
                    PathNode.LineTo(168.28f, 179.59f),
                    PathNode.CurveTo(132.08572f, 209.73773f, 78.58063f, 206.08473f, 46.819717f, 171.29742f),
                    PathNode.CurveTo(15.058808f, 136.51012f, 16.277315f, 82.89431f, 49.585815f, 49.585815f),
                    PathNode.CurveTo(82.89431f, 16.277315f, 136.51012f, 15.058808f, 171.29742f, 46.819717f),
                    PathNode.CurveTo(206.08473f, 78.58063f, 209.73773f, 132.08572f, 179.59f, 168.28f),
                    PathNode.LineTo(229.66f, 218.34f),
                    PathNode.CurveTo(231.16223f, 219.84055f, 232.00629f, 221.87672f, 232.00629f, 224.0f),
                    PathNode.CurveTo(232.00629f, 226.12328f, 231.16223f, 228.15945f, 229.66f, 229.66f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 184.0f),
                    PathNode.CurveTo(151.7645f, 184.0f, 184.0f, 151.7645f, 184.0f, 112.0f),
                    PathNode.CurveTo(184.0f, 72.2355f, 151.7645f, 40.0f, 112.0f, 40.0f),
                    PathNode.CurveTo(72.2355f, 40.0f, 40.0f, 72.2355f, 40.0f, 112.0f),
                    PathNode.CurveTo(40.04409f, 151.74623f, 72.25378f, 183.95592f, 112.0f, 184.0f),
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
        return _magnifyingGlassMinus!!
    }

private var _magnifyingGlassMinus: ImageVector? = null
