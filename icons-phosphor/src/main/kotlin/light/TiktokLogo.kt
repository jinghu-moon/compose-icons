package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TiktokLogo: ImageVector
    get() {
        if (_tiktokLogo != null) return _tiktokLogo!!
        _tiktokLogo = phosphorLightIcon(
            name = "TiktokLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 74.0f),
                    PathNode.CurveTo(196.39948f, 73.96694f, 174.03307f, 51.600533f, 174.0f, 24.0f),
                    PathNode.CurveTo(174.0f, 20.68629f, 171.3137f, 18.0f, 168.0f, 18.0f),
                    PathNode.LineTo(128.0f, 18.0f),
                    PathNode.CurveTo(124.686295f, 18.0f, 122.0f, 20.68629f, 122.0f, 24.0f),
                    PathNode.LineTo(122.0f, 156.0f),
                    PathNode.CurveTo(121.99331f, 166.89847f, 114.00838f, 176.14938f, 103.227844f, 177.74841f),
                    PathNode.CurveTo(92.44732f, 179.34744f, 82.12095f, 172.81255f, 78.95111f, 162.38524f),
                    PathNode.CurveTo(75.781265f, 151.95793f, 80.72349f, 140.78148f, 90.57f, 136.11f),
                    PathNode.CurveTo(92.66411f, 135.11736f, 93.99934f, 133.00746f, 94.0f, 130.69f),
                    PathNode.LineTo(94.0f, 88.0f),
                    PathNode.CurveTo(93.998215f, 86.23494f, 93.21933f, 84.5602f, 91.87067f, 83.42154f),
                    PathNode.CurveTo(90.521996f, 82.28288f, 88.74038f, 81.79582f, 87.0f, 82.09f),
                    PathNode.CurveTo(52.2f, 88.28f, 26.0f, 120.05f, 26.0f, 156.0f),
                    PathNode.CurveTo(26.0f, 196.86908f, 59.130928f, 230.0f, 100.0f, 230.0f),
                    PathNode.CurveTo(140.86908f, 230.0f, 174.0f, 196.86908f, 174.0f, 156.0f),
                    PathNode.LineTo(174.0f, 112.93f),
                    PathNode.CurveTo(189.256f, 121.53715f, 206.48352f, 126.04042f, 224.0f, 126.0f),
                    PathNode.CurveTo(227.3137f, 126.0f, 230.0f, 123.313705f, 230.0f, 120.0f),
                    PathNode.LineTo(230.0f, 80.0f),
                    PathNode.CurveTo(230.0f, 76.686295f, 227.3137f, 74.0f, 224.0f, 74.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 113.8f),
                    PathNode.CurveTo(201.237f, 112.72943f, 185.11768f, 106.94382f, 171.5f, 97.11f),
                    PathNode.CurveTo(169.66978f, 95.79556f, 167.25745f, 95.61738f, 165.25398f, 96.64863f),
                    PathNode.CurveTo(163.25052f, 97.67989f, 161.99376f, 99.74671f, 162.0f, 102.0f),
                    PathNode.LineTo(162.0f, 156.0f),
                    PathNode.CurveTo(162.0f, 190.24165f, 134.24165f, 218.0f, 100.0f, 218.0f),
                    PathNode.CurveTo(65.75835f, 218.0f, 38.0f, 190.24165f, 38.0f, 156.0f),
                    PathNode.CurveTo(38.0f, 128.28f, 56.47f, 103.52f, 82.0f, 95.62f),
                    PathNode.LineTo(82.0f, 127.15f),
                    PathNode.CurveTo(68.126976f, 135.80728f, 62.382008f, 153.11415f, 68.32408f, 168.34901f),
                    PathNode.CurveTo(74.26615f, 183.58388f, 90.21187f, 192.43068f, 106.2829f, 189.40886f),
                    PathNode.CurveTo(122.35393f, 186.38702f, 133.99731f, 172.35266f, 134.0f, 156.0f),
                    PathNode.LineTo(134.0f, 30.0f),
                    PathNode.LineTo(162.29f, 30.0f),
                    PathNode.CurveTo(165.19164f, 59.482445f, 188.51755f, 82.808365f, 218.0f, 85.71f),
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
        return _tiktokLogo!!
    }

private var _tiktokLogo: ImageVector? = null
