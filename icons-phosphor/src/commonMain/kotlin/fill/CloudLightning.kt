package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CloudLightning: ImageVector
    get() {
        if (_cloudLightning != null) return _cloudLightning!!
        _cloudLightning = phosphorFillIcon(
            name = "CloudLightning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(156.0f, 168.0f),
                    PathNode.LineTo(132.53f, 168.0f),
                    PathNode.LineTo(118.13f, 192.0f),
                    PathNode.LineTo(144.0f, 192.0f),
                    PathNode.CurveTo(146.88345f, 191.9991f, 149.54431f, 193.54999f, 150.96463f, 196.05937f),
                    PathNode.CurveTo(152.38495f, 198.56876f, 152.34499f, 201.64833f, 150.86f, 204.12f),
                    PathNode.LineTo(126.86f, 244.12f),
                    PathNode.CurveTo(124.58459f, 247.90868f, 119.66867f, 249.1354f, 115.88f, 246.86f),
                    PathNode.CurveTo(112.09132f, 244.58458f, 110.864586f, 239.66867f, 113.14f, 235.88f),
                    PathNode.LineTo(129.87f, 208.0f),
                    PathNode.LineTo(104.0f, 208.0f),
                    PathNode.CurveTo(101.11654f, 208.0009f, 98.4557f, 206.45001f, 97.03537f, 203.94063f),
                    PathNode.CurveTo(95.61504f, 201.43124f, 95.655014f, 198.35167f, 97.14f, 195.88f),
                    PathNode.LineTo(113.87f, 168.0f),
                    PathNode.LineTo(76.87f, 168.0f),
                    PathNode.CurveTo(48.12f, 168.0f, 24.2f, 145.07f, 24.0f, 116.36f),
                    PathNode.CurveTo(23.866924f, 93.15803f, 39.09585f, 72.66523f, 61.35f, 66.1f),
                    PathNode.CurveTo(62.719044f, 65.70401f, 64.19537f, 66.06635f, 65.22552f, 67.05117f),
                    PathNode.CurveTo(66.25567f, 68.035995f, 66.68402f, 69.49454f, 66.35f, 70.88f),
                    PathNode.CurveTo(65.07106f, 76.30133f, 64.28453f, 81.827126f, 64.0f, 87.39f),
                    PathNode.CurveTo(63.7282f, 91.79398f, 67.01467f, 95.61268f, 71.41f, 96.0f),
                    PathNode.LineTo(72.01f, 96.0f),
                    PathNode.CurveTo(76.31533f, 95.95416f, 79.84812f, 92.57877f, 80.09f, 88.28f),
                    PathNode.CurveTo(82.12082f, 46.839863f, 117.011314f, 14.686499f, 158.4791f, 16.04048f),
                    PathNode.CurveTo(199.94685f, 17.39446f, 232.66557f, 51.75536f, 231.98878f, 93.2397f),
                    PathNode.CurveTo(231.31201f, 134.72406f, 197.48987f, 167.9994f, 156.0f, 168.0f),
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
        return _cloudLightning!!
    }

private var _cloudLightning: ImageVector? = null
