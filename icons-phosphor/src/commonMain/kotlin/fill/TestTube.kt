package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TestTube: ImageVector
    get() {
        if (_testTube != null) return _testTube!!
        _testTube = phosphorFillIcon(
            name = "TestTube",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
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
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _testTube!!
    }

private var _testTube: ImageVector? = null
