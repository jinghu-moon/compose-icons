package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TextHThree: ImageVector
    get() {
        if (_textHThree != null) return _textHThree!!
        _textHThree = phosphorRegularIcon(
            name = "TextHThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(152.0f, 56.0f),
                    PathNode.LineTo(152.0f, 176.0f),
                    PathNode.CurveTo(152.0f, 180.41827f, 148.41827f, 184.0f, 144.0f, 184.0f),
                    PathNode.CurveTo(139.58173f, 184.0f, 136.0f, 180.41827f, 136.0f, 176.0f),
                    PathNode.LineTo(136.0f, 124.0f),
                    PathNode.LineTo(48.0f, 124.0f),
                    PathNode.LineTo(48.0f, 176.0f),
                    PathNode.CurveTo(48.0f, 180.41827f, 44.418278f, 184.0f, 40.0f, 184.0f),
                    PathNode.CurveTo(35.581722f, 184.0f, 32.0f, 180.41827f, 32.0f, 176.0f),
                    PathNode.LineTo(32.0f, 56.0f),
                    PathNode.CurveTo(32.0f, 51.581722f, 35.581722f, 48.0f, 40.0f, 48.0f),
                    PathNode.CurveTo(44.418278f, 48.0f, 48.0f, 51.581722f, 48.0f, 56.0f),
                    PathNode.LineTo(48.0f, 108.0f),
                    PathNode.LineTo(136.0f, 108.0f),
                    PathNode.LineTo(136.0f, 56.0f),
                    PathNode.CurveTo(136.0f, 51.581722f, 139.58173f, 48.0f, 144.0f, 48.0f),
                    PathNode.CurveTo(148.41827f, 48.0f, 152.0f, 51.581722f, 152.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(225.52f, 146.63f),
                    PathNode.LineTo(246.52f, 116.63f),
                    PathNode.CurveTo(248.25137f, 114.19035f, 248.47691f, 110.98855f, 247.10463f, 108.33029f),
                    PathNode.CurveTo(245.73235f, 105.67201f, 242.99158f, 104.00151f, 240.0f, 104.0f),
                    PathNode.LineTo(192.0f, 104.0f),
                    PathNode.CurveTo(187.58173f, 104.0f, 184.0f, 107.58172f, 184.0f, 112.0f),
                    PathNode.CurveTo(184.0f, 116.41828f, 187.58173f, 120.0f, 192.0f, 120.0f),
                    PathNode.LineTo(224.63f, 120.0f),
                    PathNode.LineTo(205.45f, 147.41f),
                    PathNode.CurveTo(203.73845f, 149.85327f, 203.52846f, 153.04585f, 204.90524f, 155.69225f),
                    PathNode.CurveTo(206.28204f, 158.33862f, 209.01689f, 159.99916f, 212.0f, 160.0f),
                    PathNode.CurveTo(221.07602f, 160.00323f, 229.01201f, 166.11755f, 231.32974f, 174.89265f),
                    PathNode.CurveTo(233.64746f, 183.66774f, 229.76576f, 192.9034f, 221.87509f, 197.38797f),
                    PathNode.CurveTo(213.9844f, 201.87253f, 204.06322f, 200.48157f, 197.71f, 194.0f),
                    PathNode.CurveTo(195.73982f, 191.83067f, 192.74121f, 190.91217f, 189.89406f, 191.60588f),
                    PathNode.CurveTo(187.04689f, 192.2996f, 184.80687f, 194.4945f, 184.05539f, 197.32697f),
                    PathNode.CurveTo(183.3039f, 200.15942f, 184.16121f, 203.17609f, 186.29f, 205.19f),
                    PathNode.CurveTo(196.52698f, 215.6345f, 212.06522f, 218.84804f, 225.60533f, 213.32097f),
                    PathNode.CurveTo(239.14545f, 207.7939f, 247.99629f, 194.62476f, 248.0f, 180.0f),
                    PathNode.CurveTo(247.98296f, 165.34232f, 239.09753f, 152.15253f, 225.52f, 146.63f),
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
        return _textHThree!!
    }

private var _textHThree: ImageVector? = null
