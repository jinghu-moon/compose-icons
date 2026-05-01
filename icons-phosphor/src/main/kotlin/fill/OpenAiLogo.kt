package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.OpenAiLogo: ImageVector
    get() {
        if (_openAiLogo != null) return _openAiLogo!!
        _openAiLogo = phosphorFillIcon(
            name = "OpenAiLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.32f, 114.24f),
                    PathNode.CurveTo(231.93044f, 95.61052f, 228.95978f, 74.330025f, 216.5385f, 58.496883f),
                    PathNode.CurveTo(204.11723f, 42.663746f, 184.15556f, 34.71287f, 164.25f, 37.67f),
                    PathNode.CurveTo(151.91428f, 21.780018f, 132.00357f, 13.727258f, 112.08983f, 16.574144f),
                    PathNode.CurveTo(92.176094f, 19.421032f, 75.3193f, 32.73011f, 67.93f, 51.44f),
                    PathNode.CurveTo(47.991177f, 54.169308f, 31.050125f, 67.38758f, 23.554235f, 86.06424f),
                    PathNode.CurveTo(16.058346f, 104.74089f, 19.160467f, 126.0035f, 31.68f, 141.76f),
                    PathNode.CurveTo(25.609018f, 156.63765f, 26.221489f, 173.40636f, 33.361652f, 187.80148f),
                    PathNode.CurveTo(40.501812f, 202.1966f, 53.481613f, 212.83095f, 69.0f, 217.0f),
                    PathNode.CurveTo(73.755f, 218.30157f, 78.66015f, 218.97397f, 83.59f, 219.0f),
                    PathNode.CurveTo(86.32461f, 218.99731f, 89.05531f, 218.79343f, 91.76f, 218.39f),
                    PathNode.CurveTo(104.09813f, 234.27425f, 124.007f, 242.3218f, 143.91737f, 239.47302f),
                    PathNode.CurveTo(163.82774f, 236.62425f, 180.68114f, 223.31677f, 188.07f, 204.61f),
                    PathNode.CurveTo(208.00882f, 201.88069f, 224.94987f, 188.66241f, 232.44577f, 169.98576f),
                    PathNode.CurveTo(239.94165f, 151.30911f, 236.83954f, 130.0465f, 224.32f, 114.29f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 137.24f),
                    PathNode.LineTo(128.0f, 146.48f),
                    PathNode.LineTo(112.0f, 137.24f),
                    PathNode.LineTo(112.0f, 118.76f),
                    PathNode.LineTo(128.0f, 109.52f),
                    PathNode.LineTo(144.0f, 118.76f),
                    PathNode.Close,
                    PathNode.MoveTo(182.85f, 54.43f),
                    PathNode.CurveTo(203.8141f, 60.0342f, 216.48619f, 81.331825f, 211.41f, 102.43f),
                    PathNode.CurveTo(210.46f, 101.8f, 209.5f, 101.19f, 208.5f, 100.62f),
                    PathNode.LineTo(164.0f, 74.88f),
                    PathNode.CurveTo(161.5248f, 73.450935f, 158.4752f, 73.450935f, 156.0f, 74.88f),
                    PathNode.LineTo(112.0f, 100.29f),
                    PathNode.LineTo(112.0f, 81.81f),
                    PathNode.LineTo(152.5f, 58.43f),
                    PathNode.CurveTo(161.67734f, 53.09945f, 172.60493f, 51.659237f, 182.85f, 54.43f),
                    PathNode.Close,
                    PathNode.MoveTo(40.85f, 86.93f),
                    PathNode.CurveTo(45.94943f, 78.03873f, 54.28631f, 71.46094f, 64.12f, 68.57f),
                    PathNode.CurveTo(64.05f, 69.71f, 64.0f, 70.85f, 64.0f, 72.0f),
                    PathNode.LineTo(64.0f, 123.38f),
                    PathNode.CurveTo(63.99936f, 126.23877f, 65.52424f, 128.88062f, 68.0f, 130.31f),
                    PathNode.LineTo(112.0f, 155.71f),
                    PathNode.LineTo(96.0f, 165.0f),
                    PathNode.LineTo(55.5f, 141.57f),
                    PathNode.CurveTo(36.369274f, 130.52399f, 29.814825f, 106.06121f, 40.86f, 86.93f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 224.0f),
                    PathNode.CurveTo(125.75937f, 224.02737f, 115.90246f, 220.1054f, 108.48f, 213.05f),
                    PathNode.CurveTo(109.48f, 212.54f, 110.48f, 212.0f, 111.48f, 211.42f),
                    PathNode.LineTo(156.0f, 185.73f),
                    PathNode.CurveTo(158.47267f, 184.3024f, 159.99707f, 181.66518f, 160.0f, 178.81f),
                    PathNode.LineTo(160.0f, 128.0f),
                    PathNode.LineTo(176.0f, 137.24f),
                    PathNode.LineTo(176.0f, 184.0f),
                    PathNode.CurveTo(176.0f, 206.09138f, 158.09138f, 224.0f, 136.0f, 224.0f),
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
        return _openAiLogo!!
    }

private var _openAiLogo: ImageVector? = null
