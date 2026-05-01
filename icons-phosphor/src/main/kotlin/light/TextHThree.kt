package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextHThree: ImageVector
    get() {
        if (_textHThree != null) return _textHThree!!
        _textHThree = phosphorLightIcon(
            name = "TextHThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(246.0f, 180.0f),
                    PathNode.CurveTo(245.99973f, 193.81589f, 237.63919f, 206.25786f, 224.84764f, 211.4785f),
                    PathNode.CurveTo(212.0561f, 216.69913f, 197.37732f, 213.66023f, 187.71f, 203.79f),
                    PathNode.CurveTo(185.39316f, 201.4207f, 185.4357f, 197.62184f, 187.805f, 195.305f),
                    PathNode.CurveTo(190.1743f, 192.98816f, 193.97314f, 193.0307f, 196.29f, 195.4f),
                    PathNode.CurveTo(203.27931f, 202.53053f, 214.19418f, 204.06004f, 222.8742f, 199.12529f),
                    PathNode.CurveTo(231.55424f, 194.19052f, 235.82259f, 184.0291f, 233.27017f, 174.37611f),
                    PathNode.CurveTo(230.71777f, 164.72313f, 221.98474f, 157.99948f, 212.0f, 158.0f),
                    PathNode.CurveTo(209.76219f, 158.00151f, 207.70949f, 156.75755f, 206.67522f, 154.77309f),
                    PathNode.CurveTo(205.64095f, 152.78862f, 205.79698f, 150.3935f, 207.08f, 148.56f),
                    PathNode.LineTo(228.48f, 118.0f),
                    PathNode.LineTo(192.0f, 118.0f),
                    PathNode.CurveTo(188.6863f, 118.0f, 186.0f, 115.313705f, 186.0f, 112.0f),
                    PathNode.CurveTo(186.0f, 108.686295f, 188.6863f, 106.0f, 192.0f, 106.0f),
                    PathNode.LineTo(240.0f, 106.0f),
                    PathNode.CurveTo(242.23602f, 106.00221f, 244.2853f, 107.24762f, 245.3171f, 109.231346f),
                    PathNode.CurveTo(246.34888f, 111.21508f, 246.19199f, 113.60798f, 244.91f, 115.44f),
                    PathNode.LineTo(222.39f, 147.62f),
                    PathNode.CurveTo(236.44864f, 152.15192f, 245.98383f, 165.22896f, 246.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 50.0f),
                    PathNode.CurveTo(140.6863f, 50.0f, 138.0f, 52.68629f, 138.0f, 56.0f),
                    PathNode.LineTo(138.0f, 110.0f),
                    PathNode.LineTo(46.0f, 110.0f),
                    PathNode.LineTo(46.0f, 56.0f),
                    PathNode.CurveTo(46.0f, 52.68629f, 43.31371f, 50.0f, 40.0f, 50.0f),
                    PathNode.CurveTo(36.68629f, 50.0f, 34.0f, 52.68629f, 34.0f, 56.0f),
                    PathNode.LineTo(34.0f, 176.0f),
                    PathNode.CurveTo(34.0f, 179.3137f, 36.68629f, 182.0f, 40.0f, 182.0f),
                    PathNode.CurveTo(43.31371f, 182.0f, 46.0f, 179.3137f, 46.0f, 176.0f),
                    PathNode.LineTo(46.0f, 122.0f),
                    PathNode.LineTo(138.0f, 122.0f),
                    PathNode.LineTo(138.0f, 176.0f),
                    PathNode.CurveTo(138.0f, 179.3137f, 140.6863f, 182.0f, 144.0f, 182.0f),
                    PathNode.CurveTo(147.3137f, 182.0f, 150.0f, 179.3137f, 150.0f, 176.0f),
                    PathNode.LineTo(150.0f, 56.0f),
                    PathNode.CurveTo(150.0f, 52.68629f, 147.3137f, 50.0f, 144.0f, 50.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _textHThree!!
    }

private var _textHThree: ImageVector? = null
