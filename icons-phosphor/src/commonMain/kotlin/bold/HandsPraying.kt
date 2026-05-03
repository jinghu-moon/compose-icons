package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HandsPraying: ImageVector
    get() {
        if (_handsPraying != null) return _handsPraying!!
        _handsPraying = phosphorBoldIcon(
            name = "HandsPraying",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(238.15f, 177.18f),
                    PathNode.LineTo(202.62f, 141.65f),
                    PathNode.LineTo(166.45f, 22.3f),
                    PathNode.CurveTo(164.12288f, 14.590227f, 158.32275f, 8.413205f, 150.77455f, 5.605942f),
                    PathNode.CurveTo(143.22635f, 2.798677f, 134.79945f, 3.684511f, 128.0f, 8.0f),
                    PathNode.CurveTo(121.20054f, 3.684511f, 112.77366f, 2.798677f, 105.22546f, 5.605942f),
                    PathNode.CurveTo(97.67725f, 8.413205f, 91.87713f, 14.590227f, 89.55f, 22.3f),
                    PathNode.LineTo(53.38f, 141.65f),
                    PathNode.LineTo(17.85f, 177.18f),
                    PathNode.CurveTo(10.042361f, 184.98999f, 10.042361f, 197.65001f, 17.85f, 205.46f),
                    PathNode.LineTo(50.54f, 238.15f),
                    PathNode.CurveTo(58.35f, 245.95764f, 71.01f, 245.95764f, 78.82f, 238.15f),
                    PathNode.LineTo(127.11f, 189.87f),
                    PathNode.CurveTo(127.42f, 189.56f, 127.71f, 189.25f, 128.0f, 188.93f),
                    PathNode.CurveTo(128.29f, 189.25f, 128.58f, 189.56f, 128.89f, 189.87f),
                    PathNode.LineTo(177.18f, 238.15f),
                    PathNode.CurveTo(184.98999f, 245.95764f, 197.65001f, 245.95764f, 205.46f, 238.15f),
                    PathNode.LineTo(238.15f, 205.46f),
                    PathNode.CurveTo(245.95764f, 197.65001f, 245.95764f, 184.98999f, 238.15f, 177.18f),
                    PathNode.Close,
                    PathNode.MoveTo(64.68f, 218.35f),
                    PathNode.LineTo(37.68f, 191.35f),
                    PathNode.LineTo(48.68f, 180.35f),
                    PathNode.LineTo(75.68f, 207.35f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 158.75f),
                    PathNode.CurveTo(116.01549f, 164.05719f, 113.90507f, 169.14957f, 110.14f, 172.89f),
                    PathNode.LineTo(92.68f, 190.35f),
                    PathNode.LineTo(65.68f, 163.35f),
                    PathNode.LineTo(72.51f, 156.52f),
                    PathNode.CurveTo(73.90786f, 155.12688f, 74.93858f, 153.40898f, 75.51f, 151.52f),
                    PathNode.LineTo(112.51f, 29.29f),
                    PathNode.CurveTo(112.77041f, 28.450882f, 113.604126f, 27.927286f, 114.47307f, 28.057129f),
                    PathNode.CurveTo(115.342026f, 28.186972f, 115.98626f, 28.93141f, 115.99f, 29.81f),
                    PathNode.Close,
                    PathNode.MoveTo(163.5f, 190.53f),
                    PathNode.LineTo(145.86f, 172.89f),
                    PathNode.CurveTo(142.09494f, 169.14957f, 139.98451f, 164.05719f, 140.0f, 158.75f),
                    PathNode.LineTo(140.0f, 29.75f),
                    PathNode.CurveTo(140.00374f, 28.87141f, 140.64798f, 28.126972f, 141.51692f, 27.99713f),
                    PathNode.CurveTo(142.38588f, 27.867287f, 143.21959f, 28.390882f, 143.48f, 29.23f),
                    PathNode.LineTo(180.48f, 151.46f),
                    PathNode.CurveTo(181.05142f, 153.34897f, 182.08215f, 155.06688f, 183.48f, 156.46f),
                    PathNode.LineTo(191.08f, 164.06f),
                    PathNode.Close,
                    PathNode.MoveTo(191.32f, 218.35f),
                    PathNode.LineTo(180.47f, 207.51f),
                    PathNode.LineTo(208.1f, 181.07f),
                    PathNode.LineTo(218.35f, 191.32f),
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
        return _handsPraying!!
    }

private var _handsPraying: ImageVector? = null
