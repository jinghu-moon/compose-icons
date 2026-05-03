package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ListHeart: ImageVector
    get() {
        if (_listHeart != null) return _listHeart!!
        _listHeart = phosphorRegularIcon(
            name = "ListHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(32.0f, 64.0f),
                    PathNode.CurveTo(32.0f, 59.581722f, 35.581722f, 56.0f, 40.0f, 56.0f),
                    PathNode.LineTo(216.0f, 56.0f),
                    PathNode.CurveTo(220.41827f, 56.0f, 224.0f, 59.581722f, 224.0f, 64.0f),
                    PathNode.CurveTo(224.0f, 68.41828f, 220.41827f, 72.0f, 216.0f, 72.0f),
                    PathNode.LineTo(40.0f, 72.0f),
                    PathNode.CurveTo(35.581722f, 72.0f, 32.0f, 68.41828f, 32.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 136.0f),
                    PathNode.LineTo(104.0f, 136.0f),
                    PathNode.CurveTo(108.41828f, 136.0f, 112.0f, 132.41827f, 112.0f, 128.0f),
                    PathNode.CurveTo(112.0f, 123.58172f, 108.41828f, 120.0f, 104.0f, 120.0f),
                    PathNode.LineTo(40.0f, 120.0f),
                    PathNode.CurveTo(35.581722f, 120.0f, 32.0f, 123.58172f, 32.0f, 128.0f),
                    PathNode.CurveTo(32.0f, 132.41827f, 35.581722f, 136.0f, 40.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 184.0f),
                    PathNode.LineTo(40.0f, 184.0f),
                    PathNode.CurveTo(35.581722f, 184.0f, 32.0f, 187.58173f, 32.0f, 192.0f),
                    PathNode.CurveTo(32.0f, 196.41827f, 35.581722f, 200.0f, 40.0f, 200.0f),
                    PathNode.LineTo(120.0f, 200.0f),
                    PathNode.CurveTo(124.41828f, 200.0f, 128.0f, 196.41827f, 128.0f, 192.0f),
                    PathNode.CurveTo(128.0f, 187.58173f, 124.41828f, 184.0f, 120.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(248.0f, 144.0f),
                    PathNode.CurveTo(248.0f, 180.52f, 197.72f, 206.08f, 195.58f, 207.16f),
                    PathNode.CurveTo(193.32652f, 208.28764f, 190.67348f, 208.28764f, 188.42f, 207.16f),
                    PathNode.CurveTo(186.28f, 206.08f, 136.0f, 180.52f, 136.0f, 144.0f),
                    PathNode.CurveTo(136.0108f, 130.69612f, 144.2519f, 118.78671f, 156.69844f, 114.08814f),
                    PathNode.CurveTo(169.145f, 109.38958f, 183.20032f, 112.88209f, 192.0f, 122.86f),
                    PathNode.CurveTo(200.79968f, 112.88209f, 214.855f, 109.38958f, 227.30156f, 114.08814f),
                    PathNode.CurveTo(239.7481f, 118.78671f, 247.9892f, 130.69612f, 248.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 144.0f),
                    PathNode.CurveTo(232.0f, 135.16344f, 224.83656f, 128.0f, 216.0f, 128.0f),
                    PathNode.CurveTo(207.16344f, 128.0f, 200.0f, 135.16344f, 200.0f, 144.0f),
                    PathNode.CurveTo(200.0f, 148.41827f, 196.41827f, 152.0f, 192.0f, 152.0f),
                    PathNode.CurveTo(187.58173f, 152.0f, 184.0f, 148.41827f, 184.0f, 144.0f),
                    PathNode.CurveTo(184.0f, 135.16344f, 176.83656f, 128.0f, 168.0f, 128.0f),
                    PathNode.CurveTo(159.16344f, 128.0f, 152.0f, 135.16344f, 152.0f, 144.0f),
                    PathNode.CurveTo(152.0f, 164.18f, 178.21f, 183.14f, 192.0f, 190.93f),
                    PathNode.CurveTo(205.79f, 183.15f, 232.0f, 164.19f, 232.0f, 144.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _listHeart!!
    }

private var _listHeart: ImageVector? = null
