package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NumberCircleThree: ImageVector
    get() {
        if (_numberCircleThree != null) return _numberCircleThree!!
        _numberCircleThree = phosphorFillIcon(
            name = "NumberCircleThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(124.0f, 188.0f),
                    PathNode.CurveTo(114.31899f, 188.03065f, 105.0404f, 184.12938f, 98.29f, 177.19f),
                    PathNode.CurveTo(96.1612f, 175.17609f, 95.303894f, 172.15942f, 96.05538f, 169.32697f),
                    PathNode.CurveTo(96.80688f, 166.4945f, 99.04689f, 164.2996f, 101.89405f, 163.60588f),
                    PathNode.CurveTo(104.74122f, 162.91217f, 107.739815f, 163.83067f, 109.71f, 166.0f),
                    PathNode.CurveTo(116.06322f, 172.48157f, 125.98441f, 173.87253f, 133.87509f, 169.38797f),
                    PathNode.CurveTo(141.76576f, 164.9034f, 145.64746f, 155.66774f, 143.32974f, 146.89265f),
                    PathNode.CurveTo(141.01201f, 138.11755f, 133.07602f, 132.00323f, 124.0f, 132.0f),
                    PathNode.CurveTo(121.01689f, 131.99916f, 118.28204f, 130.33862f, 116.90525f, 127.692245f),
                    PathNode.CurveTo(115.52846f, 125.04585f, 115.73844f, 121.85326f, 117.45f, 119.41f),
                    PathNode.LineTo(136.63f, 92.0f),
                    PathNode.LineTo(104.0f, 92.0f),
                    PathNode.CurveTo(99.58172f, 92.0f, 96.0f, 88.41828f, 96.0f, 84.0f),
                    PathNode.CurveTo(96.0f, 79.58172f, 99.58172f, 76.0f, 104.0f, 76.0f),
                    PathNode.LineTo(152.0f, 76.0f),
                    PathNode.CurveTo(154.98311f, 76.00084f, 157.71796f, 77.66137f, 159.09476f, 80.307755f),
                    PathNode.CurveTo(160.47154f, 82.95415f, 160.26155f, 86.14674f, 158.55f, 88.59f),
                    PathNode.LineTo(137.55f, 118.59f),
                    PathNode.CurveTo(153.58377f, 125.024185f, 162.78603f, 141.94138f, 159.47583f, 158.89789f),
                    PathNode.CurveTo(156.16563f, 175.8544f, 141.27646f, 188.06853f, 124.0f, 188.0f),
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
        return _numberCircleThree!!
    }

private var _numberCircleThree: ImageVector? = null
