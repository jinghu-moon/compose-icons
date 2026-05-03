package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TestTube: ImageVector
    get() {
        if (_testTube != null) return _testTube!!
        _testTube = phosphorDuotoneIcon(
            name = "TestTube",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(167.18f, 140.82f),
                    PathNode.LineTo(94.77f, 213.23f),
                    PathNode.CurveTo(80.410484f, 227.58916f, 57.129505f, 227.58916f, 42.77f, 213.23f),
                    PathNode.LineTo(42.77f, 213.23f),
                    PathNode.CurveTo(28.410843f, 198.8705f, 28.410843f, 175.58951f, 42.77f, 161.23f),
                    PathNode.LineTo(72.77f, 131.23f),
                    PathNode.CurveTo(82.14f, 127.58f, 98.55f, 124.87f, 119.95f, 136.05f),
                    PathNode.CurveTo(141.35f, 147.23f, 157.81f, 144.47f, 167.18f, 140.82f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(237.66f, 86.34f),
                    PathNode.LineTo(177.66f, 26.34f),
                    PathNode.CurveTo(176.15945f, 24.837784f, 174.12328f, 23.993708f, 172.0f, 23.993708f),
                    PathNode.CurveTo(169.87672f, 23.993708f, 167.84055f, 24.837784f, 166.34f, 26.34f),
                    PathNode.LineTo(37.11f, 155.57f),
                    PathNode.CurveTo(19.624664f, 173.05533f, 19.624666f, 201.40466f, 37.11f, 218.89f),
                    PathNode.CurveTo(54.595337f, 236.37532f, 82.944664f, 236.37532f, 100.43f, 218.89f),
                    PathNode.LineTo(212.32f, 107.0f),
                    PathNode.LineTo(234.53f, 99.6f),
                    PathNode.CurveTo(237.16228f, 98.724495f, 239.15312f, 96.54782f, 239.79088f, 93.84807f),
                    PathNode.CurveTo(240.42863f, 91.14831f, 239.62225f, 88.31086f, 237.66f, 86.35f),
                    PathNode.Close,
                    PathNode.MoveTo(89.11f, 207.57f),
                    PathNode.CurveTo(77.81822f, 218.45264f, 59.890926f, 218.28725f, 48.801834f, 207.19817f),
                    PathNode.CurveTo(37.712746f, 196.10907f, 37.54737f, 178.18178f, 48.43f, 166.89f),
                    PathNode.LineTo(77.23f, 138.09f),
                    PathNode.CurveTo(85.7f, 135.19f, 98.98f, 134.09f, 116.3f, 143.09f),
                    PathNode.CurveTo(126.9f, 148.63f, 136.48f, 151.09f, 144.86f, 151.82f),
                    PathNode.Close,
                    PathNode.MoveTo(205.47f, 92.41f),
                    PathNode.CurveTo(204.29095f, 92.80157f, 203.21931f, 93.46236f, 202.34f, 94.34f),
                    PathNode.LineTo(162.77f, 133.91f),
                    PathNode.CurveTo(154.3f, 136.81f, 141.02f, 137.91f, 123.7f, 128.91f),
                    PathNode.CurveTo(113.1f, 123.37f, 103.52f, 120.91f, 95.14f, 120.18f),
                    PathNode.LineTo(172.0f, 43.31f),
                    PathNode.LineTo(217.19f, 88.5f),
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
        return _testTube!!
    }

private var _testTube: ImageVector? = null
