package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SprayBottle: ImageVector
    get() {
        if (_sprayBottle != null) return _sprayBottle!!
        _sprayBottle = phosphorLightIcon(
            name = "SprayBottle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 78.0f),
                    PathNode.CurveTo(203.3137f, 78.0f, 206.0f, 75.313705f, 206.0f, 72.0f),
                    PathNode.CurveTo(205.96693f, 42.19033f, 181.80966f, 18.033068f, 152.0f, 18.0f),
                    PathNode.LineTo(80.0f, 18.0f),
                    PathNode.CurveTo(72.26801f, 18.0f, 66.0f, 24.268015f, 66.0f, 32.0f),
                    PathNode.LineTo(66.0f, 80.0f),
                    PathNode.CurveTo(66.0f, 94.359406f, 54.3594f, 106.0f, 40.0f, 106.0f),
                    PathNode.CurveTo(36.68629f, 106.0f, 34.0f, 108.686295f, 34.0f, 112.0f),
                    PathNode.CurveTo(34.0f, 115.313705f, 36.68629f, 118.0f, 40.0f, 118.0f),
                    PathNode.CurveTo(60.98682f, 118.0f, 78.0f, 100.986824f, 78.0f, 80.0f),
                    PathNode.LineTo(78.0f, 78.0f),
                    PathNode.LineTo(114.0f, 78.0f),
                    PathNode.LineTo(114.0f, 104.62f),
                    PathNode.CurveTo(114.01781f, 112.522156f, 110.42298f, 119.99911f, 104.24f, 124.92f),
                    PathNode.LineTo(88.24f, 137.71f),
                    PathNode.CurveTo(79.21236f, 144.90717f, 73.96778f, 155.8346f, 74.0f, 167.38f),
                    PathNode.LineTo(74.0f, 224.0f),
                    PathNode.CurveTo(74.0f, 231.73198f, 80.26801f, 238.0f, 88.0f, 238.0f),
                    PathNode.LineTo(192.0f, 238.0f),
                    PathNode.CurveTo(199.73198f, 238.0f, 206.0f, 231.73198f, 206.0f, 224.0f),
                    PathNode.LineTo(206.0f, 211.47f),
                    PathNode.CurveTo(206.00903f, 164.65448f, 193.79637f, 118.64761f, 170.57f, 78.0f),
                    PathNode.Close,
                    PathNode.MoveTo(78.0f, 32.0f),
                    PathNode.CurveTo(78.0f, 30.89543f, 78.89543f, 30.0f, 80.0f, 30.0f),
                    PathNode.LineTo(152.0f, 30.0f),
                    PathNode.CurveTo(172.86887f, 30.025381f, 190.56323f, 45.34886f, 193.57f, 66.0f),
                    PathNode.LineTo(78.0f, 66.0f),
                    PathNode.Close,
                    PathNode.MoveTo(194.0f, 211.47f),
                    PathNode.LineTo(194.0f, 224.0f),
                    PathNode.CurveTo(194.0f, 225.10457f, 193.10457f, 226.0f, 192.0f, 226.0f),
                    PathNode.LineTo(88.0f, 226.0f),
                    PathNode.CurveTo(86.89543f, 226.0f, 86.0f, 225.10457f, 86.0f, 224.0f),
                    PathNode.LineTo(86.0f, 167.38f),
                    PathNode.CurveTo(85.98219f, 159.47784f, 89.57702f, 152.0009f, 95.76f, 147.08f),
                    PathNode.LineTo(111.76f, 134.29f),
                    PathNode.CurveTo(120.78764f, 127.092834f, 126.03222f, 116.16541f, 126.0f, 104.62f),
                    PathNode.LineTo(126.0f, 78.0f),
                    PathNode.LineTo(156.64f, 78.0f),
                    PathNode.CurveTo(181.08905f, 118.225746f, 194.013f, 164.397f, 194.0f, 211.47f),
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
        return _sprayBottle!!
    }

private var _sprayBottle: ImageVector? = null
