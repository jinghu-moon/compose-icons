package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CloudMoon: ImageVector
    get() {
        if (_cloudMoon != null) return _cloudMoon!!
        _cloudMoon = phosphorBoldIcon(
            name = "CloudMoon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(172.0f, 68.0f),
                    PathNode.CurveTo(170.34f, 68.0f, 168.69f, 68.06f, 167.05f, 68.16f),
                    PathNode.CurveTo(162.24205f, 37.517166f, 139.27917f, 12.879583f, 109.05f, 5.93f),
                    PathNode.CurveTo(105.0239f, 5.009907f, 100.80757f, 6.224779f, 97.888306f, 9.146072f),
                    PathNode.CurveTo(94.96905f, 12.067367f, 93.7571f, 16.284542f, 94.68f, 20.31f),
                    PathNode.CurveTo(98.68852f, 37.780552f, 93.42577f, 56.084442f, 80.75021f, 68.75798f),
                    PathNode.CurveTo(68.074646f, 81.43151f, 49.76991f, 86.69132f, 32.3f, 82.68f),
                    PathNode.CurveTo(28.271784f, 81.758545f, 24.052855f, 82.97449f, 21.132935f, 85.898476f),
                    PathNode.CurveTo(18.213015f, 88.82245f, 17.002945f, 93.04306f, 17.93f, 97.07f),
                    PathNode.CurveTo(21.962494f, 114.281425f, 31.823093f, 129.56871f, 45.84f, 140.34f),
                    PathNode.CurveTo(34.094017f, 157.47717f, 32.80111f, 179.70882f, 42.481358f, 198.09207f),
                    PathNode.CurveTo(52.161606f, 216.4753f, 71.22379f, 227.98836f, 92.0f, 228.0f),
                    PathNode.LineTo(172.0f, 228.0f),
                    PathNode.CurveTo(216.18279f, 228.0f, 252.0f, 192.18279f, 252.0f, 148.0f),
                    PathNode.CurveTo(252.0f, 103.81722f, 216.18279f, 68.0f, 172.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(119.89f, 36.0f),
                    PathNode.CurveTo(132.93959f, 44.230503f, 141.62556f, 57.864697f, 143.57f, 73.17f),
                    PathNode.CurveTo(123.308334f, 80.87379f, 107.016464f, 96.43363f, 98.39f, 116.32f),
                    PathNode.CurveTo(96.26775f, 116.09272f, 94.13433f, 115.985886f, 92.0f, 116.0f),
                    PathNode.CurveTo(82.07556f, 115.9923f, 72.32936f, 118.63686f, 63.77f, 123.66f),
                    PathNode.CurveTo(57.499f, 119.57321f, 52.170715f, 114.19719f, 48.14f, 107.89f),
                    PathNode.CurveTo(86.88695f, 105.72328f, 117.79881f, 74.75109f, 119.89f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 204.0f),
                    PathNode.LineTo(92.0f, 204.0f),
                    PathNode.CurveTo(74.32689f, 204.0f, 60.0f, 189.67311f, 60.0f, 172.0f),
                    PathNode.CurveTo(60.0f, 154.32689f, 74.32689f, 140.0f, 92.0f, 140.0f),
                    PathNode.LineTo(92.28f, 140.0f),
                    PathNode.CurveTo(92.17f, 141.1f, 92.08f, 142.2f, 92.02f, 143.3f),
                    PathNode.CurveTo(91.6334f, 149.92741f, 96.69258f, 155.6134f, 103.32f, 156.0f),
                    PathNode.CurveTo(109.94742f, 156.3866f, 115.6334f, 151.32742f, 116.02f, 144.7f),
                    PathNode.CurveTo(116.2316f, 140.98447f, 116.8145f, 137.29944f, 117.76f, 133.7f),
                    PathNode.LineTo(117.91f, 133.15f),
                    PathNode.CurveTo(125.56834f, 105.15031f, 153.33401f, 87.627975f, 181.90405f, 92.76471f),
                    PathNode.CurveTo(210.47409f, 97.90144f, 230.39732f, 123.997986f, 227.82294f, 152.91174f),
                    PathNode.CurveTo(225.24855f, 181.8255f, 201.02814f, 203.99162f, 172.0f, 204.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _cloudMoon!!
    }

private var _cloudMoon: ImageVector? = null
