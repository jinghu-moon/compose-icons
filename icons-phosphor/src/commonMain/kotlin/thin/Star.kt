package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Star: ImageVector
    get() {
        if (_star != null) return _star!!
        _star = phosphorThinIcon(
            name = "Star",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(235.36f, 98.49f),
                    PathNode.CurveTo(233.84843f, 93.72077f, 229.58034f, 90.35623f, 224.59f, 90.0f),
                    PathNode.LineTo(163.12f, 85.0f),
                    PathNode.LineTo(139.44f, 27.67f),
                    PathNode.CurveTo(137.53252f, 23.032707f, 133.01428f, 20.005667f, 128.0f, 20.005667f),
                    PathNode.CurveTo(122.985725f, 20.005667f, 118.46747f, 23.032707f, 116.56f, 27.67f),
                    PathNode.LineTo(92.88f, 85.0f),
                    PathNode.LineTo(31.41f, 90.0f),
                    PathNode.CurveTo(26.41546f, 90.42412f, 22.162357f, 93.8021f, 20.61859f, 98.57097f),
                    PathNode.CurveTo(19.074823f, 103.33984f, 20.541502f, 108.56941f, 24.34f, 111.84f),
                    PathNode.LineTo(71.19f, 152.25f),
                    PathNode.LineTo(56.87f, 212.64f),
                    PathNode.CurveTo(55.64313f, 217.52394f, 57.50441f, 222.66365f, 61.574f, 225.62955f),
                    PathNode.CurveTo(65.64359f, 228.59544f, 71.10635f, 228.79347f, 75.38f, 226.13f),
                    PathNode.LineTo(128.0f, 193.77f),
                    PathNode.LineTo(180.62f, 226.13f),
                    PathNode.CurveTo(184.851f, 228.80266f, 190.2896f, 228.60005f, 194.31f, 225.62f),
                    PathNode.CurveTo(198.44325f, 222.69487f, 200.35725f, 217.53264f, 199.13f, 212.62f),
                    PathNode.LineTo(184.81f, 152.2f),
                    PathNode.LineTo(231.66f, 111.79f),
                    PathNode.CurveTo(235.50197f, 108.53356f, 236.9683f, 103.26267f, 235.36f, 98.49f),
                    PathNode.Close,
                    PathNode.MoveTo(226.43f, 105.75f),
                    PathNode.LineTo(177.75f, 147.75f),
                    PathNode.CurveTo(176.61984f, 148.72476f, 176.12636f, 150.24765f, 176.47f, 151.7f),
                    PathNode.LineTo(191.34f, 214.49f),
                    PathNode.CurveTo(191.7865f, 216.2467f, 191.1022f, 218.0967f, 189.62f, 219.14f),
                    PathNode.CurveTo(188.20941f, 220.19246f, 186.2953f, 220.26408f, 184.81f, 219.32f),
                    PathNode.LineTo(130.1f, 185.67f),
                    PathNode.CurveTo(128.8126f, 184.87589f, 127.187386f, 184.87589f, 125.9f, 185.67f),
                    PathNode.LineTo(71.19f, 219.32f),
                    PathNode.CurveTo(69.7047f, 220.26408f, 67.79059f, 220.19246f, 66.38f, 219.14f),
                    PathNode.CurveTo(64.8978f, 218.0967f, 64.2135f, 216.2467f, 64.66f, 214.49f),
                    PathNode.LineTo(79.53f, 151.7f),
                    PathNode.CurveTo(79.87364f, 150.24765f, 79.38016f, 148.72476f, 78.25f, 147.75f),
                    PathNode.LineTo(29.57f, 105.75f),
                    PathNode.CurveTo(28.193632f, 104.58969f, 27.66963f, 102.70408f, 28.25f, 101.0f),
                    PathNode.CurveTo(28.78363f, 99.31262f, 30.294525f, 98.12295f, 32.06f, 98.0f),
                    PathNode.LineTo(96.0f, 92.79f),
                    PathNode.CurveTo(97.49961f, 92.67082f, 98.80556f, 91.720345f, 99.38f, 90.33f),
                    PathNode.LineTo(124.0f, 30.73f),
                    PathNode.CurveTo(124.65987f, 29.076998f, 126.260155f, 27.992731f, 128.04f, 27.992731f),
                    PathNode.CurveTo(129.81984f, 27.992731f, 131.42014f, 29.076998f, 132.08f, 30.73f),
                    PathNode.LineTo(156.7f, 90.33f),
                    PathNode.CurveTo(157.26135f, 91.696465f, 158.53015f, 92.64229f, 160.0f, 92.79f),
                    PathNode.LineTo(223.9f, 97.94f),
                    PathNode.CurveTo(225.66548f, 98.062935f, 227.17639f, 99.25262f, 227.71f, 100.94f),
                    PathNode.CurveTo(228.32732f, 102.653404f, 227.81728f, 104.57004f, 226.43f, 105.75f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _star!!
    }

private var _star: ImageVector? = null
