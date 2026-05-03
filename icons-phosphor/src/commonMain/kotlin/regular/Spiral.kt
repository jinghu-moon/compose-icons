package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Spiral: ImageVector
    get() {
        if (_spiral != null) return _spiral!!
        _spiral = phosphorRegularIcon(
            name = "Spiral",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.0f, 144.0f),
                    PathNode.CurveTo(248.0f, 148.41827f, 244.41827f, 152.0f, 240.0f, 152.0f),
                    PathNode.CurveTo(235.58173f, 152.0f, 232.0f, 148.41827f, 232.0f, 144.0f),
                    PathNode.CurveTo(231.93938f, 91.00579f, 188.9942f, 48.06062f, 136.0f, 48.0f),
                    PathNode.CurveTo(87.42178f, 48.055107f, 48.055107f, 87.42178f, 48.0f, 136.0f),
                    PathNode.CurveTo(48.0496f, 180.16223f, 83.83778f, 215.9504f, 128.0f, 216.0f),
                    PathNode.CurveTo(167.74623f, 215.95592f, 199.95592f, 183.74623f, 200.0f, 144.0f),
                    PathNode.CurveTo(199.96143f, 108.66977f, 171.33023f, 80.03858f, 136.0f, 80.0f),
                    PathNode.CurveTo(105.08576f, 80.033066f, 80.033066f, 105.08576f, 80.0f, 136.0f),
                    PathNode.CurveTo(80.02756f, 162.49825f, 101.501755f, 183.97244f, 128.0f, 184.0f),
                    PathNode.CurveTo(150.09138f, 184.0f, 168.0f, 166.09138f, 168.0f, 144.0f),
                    PathNode.CurveTo(168.0f, 126.32689f, 153.67311f, 112.0f, 136.0f, 112.0f),
                    PathNode.CurveTo(122.74516f, 112.0f, 112.0f, 122.74516f, 112.0f, 136.0f),
                    PathNode.CurveTo(112.0f, 144.83656f, 119.163445f, 152.0f, 128.0f, 152.0f),
                    PathNode.CurveTo(132.41827f, 152.0f, 136.0f, 148.41827f, 136.0f, 144.0f),
                    PathNode.CurveTo(131.58173f, 144.0f, 128.0f, 140.41827f, 128.0f, 136.0f),
                    PathNode.CurveTo(128.0f, 131.58173f, 131.58173f, 128.0f, 136.0f, 128.0f),
                    PathNode.CurveTo(144.83656f, 128.0f, 152.0f, 135.16344f, 152.0f, 144.0f),
                    PathNode.CurveTo(152.0f, 157.25484f, 141.25484f, 168.0f, 128.0f, 168.0f),
                    PathNode.CurveTo(110.32689f, 168.0f, 96.0f, 153.67311f, 96.0f, 136.0f),
                    PathNode.CurveTo(96.0f, 113.90861f, 113.90861f, 96.0f, 136.0f, 96.0f),
                    PathNode.CurveTo(162.49825f, 96.02756f, 183.97244f, 117.501755f, 184.0f, 144.0f),
                    PathNode.CurveTo(183.96693f, 174.91423f, 158.91423f, 199.96693f, 128.0f, 200.0f),
                    PathNode.CurveTo(92.66977f, 199.96143f, 64.03858f, 171.33023f, 64.0f, 136.0f),
                    PathNode.CurveTo(64.04409f, 96.25378f, 96.25378f, 64.04409f, 136.0f, 64.0f),
                    PathNode.CurveTo(180.16223f, 64.0496f, 215.9504f, 99.83778f, 216.0f, 144.0f),
                    PathNode.CurveTo(215.94489f, 192.57822f, 176.57822f, 231.94489f, 128.0f, 232.0f),
                    PathNode.CurveTo(75.00579f, 231.93938f, 32.06062f, 188.9942f, 32.0f, 136.0f),
                    PathNode.CurveTo(32.060627f, 78.58752f, 78.58752f, 32.060627f, 136.0f, 32.0f),
                    PathNode.CurveTo(197.82848f, 32.06614f, 247.93387f, 82.17153f, 248.0f, 144.0f),
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
        return _spiral!!
    }

private var _spiral: ImageVector? = null
