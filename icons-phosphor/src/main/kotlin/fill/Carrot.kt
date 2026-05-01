package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Carrot: ImageVector
    get() {
        if (_carrot != null) return _carrot!!
        _carrot = phosphorFillIcon(
            name = "Carrot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 80.0f),
                    PathNode.LineTo(199.44f, 80.0f),
                    PathNode.CurveTo(213.92114f, 105.09138f, 209.74149f, 136.78125f, 189.25f, 157.26f),
                    PathNode.CurveTo(180.73f, 165.95f, 169.64f, 174.18f, 157.4f, 181.77f),
                    PathNode.CurveTo(155.82326f, 182.72981f, 153.79448f, 182.48604f, 152.49f, 181.18f),
                    PathNode.LineTo(117.65f, 146.34f),
                    PathNode.CurveTo(116.118904f, 144.8084f, 114.03227f, 143.96297f, 111.86688f, 143.99689f),
                    PathNode.CurveTo(109.70149f, 144.0308f, 107.642365f, 144.94118f, 106.16f, 146.52f),
                    PathNode.CurveTo(103.22675f, 149.81091f, 103.40753f, 154.82869f, 106.57f, 157.9f),
                    PathNode.LineTo(136.45f, 187.78f),
                    PathNode.CurveTo(137.3553f, 188.68364f, 137.77383f, 189.96574f, 137.57607f, 191.22948f),
                    PathNode.CurveTo(137.37828f, 192.49321f, 136.58809f, 193.58612f, 135.45f, 194.17f),
                    PathNode.CurveTo(95.74f, 214.79f, 53.0f, 228.54f, 46.78f, 230.48f),
                    PathNode.CurveTo(40.684734f, 233.31956f, 33.46443f, 232.04507f, 28.709675f, 227.29033f),
                    PathNode.CurveTo(23.954918f, 222.53557f, 22.68043f, 215.31526f, 25.52f, 209.22f),
                    PathNode.CurveTo(28.25f, 200.51f, 54.52f, 118.95f, 90.38f, 75.87f),
                    PathNode.CurveTo(91.10057f, 75.00812f, 92.15037f, 74.488976f, 93.27269f, 74.43952f),
                    PathNode.CurveTo(94.39502f, 74.39006f, 95.486404f, 74.81484f, 96.28f, 75.61f),
                    PathNode.LineTo(138.33f, 117.67f),
                    PathNode.CurveTo(139.90225f, 119.24128f, 142.05736f, 120.08758f, 144.27867f, 120.006004f),
                    PathNode.CurveTo(146.49998f, 119.924446f, 148.58722f, 118.92236f, 150.04f, 117.24f),
                    PathNode.CurveTo(152.76602f, 113.949936f, 152.50479f, 109.11705f, 149.44f, 106.14f),
                    PathNode.LineTo(108.08f, 64.78f),
                    PathNode.CurveTo(107.22587f, 63.929466f, 106.800835f, 62.739117f, 106.92308f, 61.53995f),
                    PathNode.CurveTo(107.04533f, 60.340782f, 107.70181f, 59.260685f, 108.71f, 58.6f),
                    PathNode.CurveTo(128.94691f, 45.24168f, 154.99533f, 44.467354f, 175.99f, 56.6f),
                    PathNode.LineTo(175.99f, 24.0f),
                    PathNode.CurveTo(175.98494f, 21.781305f, 176.9015f, 19.660152f, 178.52072f, 18.143324f),
                    PathNode.CurveTo(180.13994f, 16.626493f, 182.31636f, 15.850232f, 184.53f, 16.0f),
                    PathNode.CurveTo(188.80702f, 16.372086f, 192.06863f, 19.987373f, 192.0f, 24.28f),
                    PathNode.LineTo(192.0f, 52.69f),
                    PathNode.LineTo(218.34f, 26.34f),
                    PathNode.CurveTo(221.46593f, 23.214067f, 226.53407f, 23.21407f, 229.66f, 26.34f),
                    PathNode.CurveTo(232.78593f, 29.46593f, 232.78593f, 34.53407f, 229.66f, 37.66f),
                    PathNode.LineTo(203.31f, 64.0f),
                    PathNode.LineTo(231.72f, 64.0f),
                    PathNode.CurveTo(236.01262f, 63.931362f, 239.62791f, 67.19298f, 240.0f, 71.47f),
                    PathNode.CurveTo(240.14687f, 73.68197f, 239.36931f, 75.85571f, 237.85281f, 77.47269f),
                    PathNode.CurveTo(236.3363f, 79.08966f, 234.21684f, 80.00487f, 232.0f, 80.0f),
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
        return _carrot!!
    }

private var _carrot: ImageVector? = null
