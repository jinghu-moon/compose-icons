package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TwitterLogo: ImageVector
    get() {
        if (_twitterLogo != null) return _twitterLogo!!
        _twitterLogo = phosphorBoldIcon(
            name = "TwitterLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(251.09f, 67.41f),
                    PathNode.CurveTo(249.23283f, 62.923885f, 244.85533f, 59.998974f, 240.0f, 60.0f),
                    PathNode.LineTo(211.82f, 60.0f),
                    PathNode.CurveTo(202.20003f, 45.19267f, 185.80693f, 36.183403f, 168.15f, 36.0f),
                    PathNode.CurveTo(154.4474f, 35.816017f, 141.2506f, 41.17046f, 131.55f, 50.85f),
                    PathNode.CurveTo(121.57465f, 60.633537f, 115.96819f, 74.02773f, 116.0f, 88.0f),
                    PathNode.LineTo(116.0f, 88.78f),
                    PathNode.CurveTo(79.17f, 77.21f, 49.62f, 47.88f, 49.3f, 47.55f),
                    PathNode.CurveTo(46.01261f, 44.2371f, 41.102596f, 43.130768f, 36.71208f, 44.71367f),
                    PathNode.CurveTo(32.32156f, 46.296574f, 29.247095f, 50.281532f, 28.83f, 54.93f),
                    PathNode.CurveTo(22.52f, 125.1f, 53.48f, 162.72f, 70.89f, 178.05f),
                    PathNode.CurveTo(56.4f, 192.83f, 36.0f, 200.68f, 35.8f, 200.76f),
                    PathNode.CurveTo(32.363724f, 202.03912f, 29.700813f, 204.81909f, 28.570595f, 208.30717f),
                    PathNode.CurveTo(27.440376f, 211.79527f, 27.966888f, 215.60867f, 30.0f, 218.66f),
                    PathNode.CurveTo(32.0f, 221.55f, 43.44f, 236.0f, 80.0f, 236.0f),
                    PathNode.CurveTo(152.25f, 236.0f, 212.7f, 180.74f, 219.6f, 109.37f),
                    PathNode.LineTo(248.48f, 80.49f),
                    PathNode.CurveTo(251.91606f, 77.059525f, 252.94629f, 71.896515f, 251.09f, 67.41f),
                    PathNode.Close,
                    PathNode.MoveTo(199.52f, 95.52f),
                    PathNode.CurveTo(197.45134f, 97.57967f, 196.20964f, 100.32635f, 196.03f, 103.24f),
                    PathNode.CurveTo(192.14f, 164.23f, 141.18f, 212.0f, 80.0f, 212.0f),
                    PathNode.CurveTo(75.82345f, 212.0243f, 71.6502f, 211.76035f, 67.51f, 211.21f),
                    PathNode.CurveTo(78.0f, 204.55f, 89.72f, 195.07f, 98.0f, 182.66f),
                    PathNode.CurveTo(99.83054f, 179.91444f, 100.44971f, 176.53622f, 99.711845f, 173.31993f),
                    PathNode.CurveTo(98.97399f, 170.10364f, 96.944244f, 167.33311f, 94.1f, 165.66f),
                    PathNode.CurveTo(93.98f, 165.59f, 81.77f, 158.17f, 70.67f, 141.24f),
                    PathNode.CurveTo(59.57f, 124.31f, 53.41f, 104.24f, 52.21f, 81.46f),
                    PathNode.CurveTo(69.37f, 94.4f, 96.0f, 110.79f, 126.0f, 115.84f),
                    PathNode.CurveTo(129.48419f, 116.42893f, 133.05086f, 115.452286f, 135.74896f, 113.17046f),
                    PathNode.CurveTo(138.44707f, 110.88863f, 140.0023f, 107.53362f, 140.0f, 104.0f),
                    PathNode.LineTo(140.0f, 88.0f),
                    PathNode.CurveTo(139.9827f, 80.44974f, 143.01535f, 73.21248f, 148.41f, 67.93f),
                    PathNode.CurveTo(153.56177f, 62.776573f, 160.57361f, 59.91776f, 167.86f, 60.0f),
                    PathNode.CurveTo(178.99011f, 60.149006f, 189.04015f, 66.69203f, 193.68f, 76.81f),
                    PathNode.CurveTo(195.59187f, 81.17981f, 199.91023f, 84.00246f, 204.68f, 84.0f),
                    PathNode.LineTo(211.0f, 84.0f),
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
        return _twitterLogo!!
    }

private var _twitterLogo: ImageVector? = null
