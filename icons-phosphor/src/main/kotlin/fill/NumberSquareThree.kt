package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NumberSquareThree: ImageVector
    get() {
        if (_numberSquareThree != null) return _numberSquareThree!!
        _numberSquareThree = phosphorFillIcon(
            name = "NumberSquareThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(124.0f, 184.0f),
                    PathNode.CurveTo(114.31899f, 184.03065f, 105.0404f, 180.12938f, 98.29f, 173.19f),
                    PathNode.CurveTo(96.1612f, 171.17609f, 95.303894f, 168.15942f, 96.05538f, 165.32697f),
                    PathNode.CurveTo(96.80688f, 162.4945f, 99.04689f, 160.2996f, 101.89405f, 159.60588f),
                    PathNode.CurveTo(104.74122f, 158.91217f, 107.739815f, 159.83067f, 109.71f, 162.0f),
                    PathNode.CurveTo(116.06322f, 168.48157f, 125.98441f, 169.87253f, 133.87509f, 165.38797f),
                    PathNode.CurveTo(141.76576f, 160.9034f, 145.64746f, 151.66774f, 143.32974f, 142.89265f),
                    PathNode.CurveTo(141.01201f, 134.11755f, 133.07602f, 128.00323f, 124.0f, 128.0f),
                    PathNode.CurveTo(121.01689f, 127.99916f, 118.28204f, 126.33863f, 116.90525f, 123.692245f),
                    PathNode.CurveTo(115.52846f, 121.04585f, 115.73844f, 117.85326f, 117.45f, 115.41f),
                    PathNode.LineTo(136.63f, 88.0f),
                    PathNode.LineTo(104.0f, 88.0f),
                    PathNode.CurveTo(99.58172f, 88.0f, 96.0f, 84.41828f, 96.0f, 80.0f),
                    PathNode.CurveTo(96.0f, 75.58172f, 99.58172f, 72.0f, 104.0f, 72.0f),
                    PathNode.LineTo(152.0f, 72.0f),
                    PathNode.CurveTo(154.98311f, 72.00084f, 157.71796f, 73.66137f, 159.09476f, 76.307755f),
                    PathNode.CurveTo(160.47154f, 78.95415f, 160.26155f, 82.14674f, 158.55f, 84.59f),
                    PathNode.LineTo(137.55f, 114.59f),
                    PathNode.CurveTo(153.58377f, 121.024185f, 162.78603f, 137.94138f, 159.47583f, 154.89789f),
                    PathNode.CurveTo(156.16563f, 171.8544f, 141.27646f, 184.06853f, 124.0f, 184.0f),
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
        return _numberSquareThree!!
    }

private var _numberSquareThree: ImageVector? = null
