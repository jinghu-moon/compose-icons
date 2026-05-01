package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Moon: ImageVector
    get() {
        if (_moon != null) return _moon!!
        _moon = phosphorDuotoneIcon(
            name = "Moon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(227.89f, 147.89f),
                    PathNode.CurveTo(214.5685f, 191.69067f, 172.17136f, 219.9899f, 126.61122f, 215.49149f),
                    PathNode.CurveTo(81.05109f, 210.99307f, 45.00692f, 174.94891f, 40.508514f, 129.38878f),
                    PathNode.CurveTo(36.01011f, 83.82864f, 64.30932f, 41.4315f, 108.11f, 28.11f),
                    PathNode.CurveTo(97.862885f, 62.01553f, 107.099266f, 98.80905f, 132.14511f, 123.8549f),
                    PathNode.CurveTo(157.19095f, 148.90074f, 193.98447f, 158.13712f, 227.89f, 147.89f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(233.54f, 142.23f),
                    PathNode.CurveTo(231.4488f, 140.13445f, 228.3713f, 139.36508f, 225.54f, 140.23f),
                    PathNode.CurveTo(194.45912f, 149.62619f, 160.72934f, 141.16037f, 137.76949f, 118.200516f),
                    PathNode.CurveTo(114.80963f, 95.24067f, 106.3438f, 61.510883f, 115.74f, 30.43f),
                    PathNode.CurveTo(116.61221f, 27.597378f, 115.84687f, 24.514666f, 113.75111f, 22.418898f),
                    PathNode.CurveTo(111.655334f, 20.323128f, 108.572624f, 19.55779f, 105.74f, 20.43f),
                    PathNode.CurveTo(84.65028f, 26.89045f, 66.135376f, 39.837933f, 52.83f, 57.43f),
                    PathNode.CurveTo(29.096561f, 88.94011f, 25.233795f, 131.16554f, 42.856083f, 166.45886f),
                    PathNode.CurveTo(60.478374f, 201.75217f, 96.55179f, 224.0371f, 136.0f, 224.0f),
                    PathNode.CurveTo(158.56346f, 224.0695f, 180.5266f, 216.7344f, 198.52f, 203.12f),
                    PathNode.CurveTo(216.11208f, 189.81462f, 229.05956f, 171.29973f, 235.52f, 150.21f),
                    PathNode.CurveTo(236.38197f, 147.3884f, 235.62099f, 144.3214f, 233.54f, 142.23f),
                    PathNode.Close,
                    PathNode.MoveTo(188.9f, 190.34f),
                    PathNode.CurveTo(153.8657f, 216.72774f, 104.74848f, 213.28851f, 73.73339f, 182.27596f),
                    PathNode.CurveTo(42.718307f, 151.26338f, 39.2751f, 102.14644f, 65.66f, 67.11f),
                    PathNode.CurveTo(73.97404f, 56.130608f, 84.72266f, 47.230476f, 97.06f, 41.11f),
                    PathNode.CurveTo(96.357185f, 46.042255f, 96.002975f, 51.017925f, 96.0f, 56.0f),
                    PathNode.CurveTo(96.06063f, 113.41248f, 142.58752f, 159.93938f, 200.0f, 160.0f),
                    PathNode.CurveTo(204.9921f, 159.99844f, 209.97783f, 159.64423f, 214.92f, 158.94f),
                    PathNode.CurveTo(208.79381f, 171.27945f, 199.88667f, 182.02824f, 188.9f, 190.34f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _moon!!
    }

private var _moon: ImageVector? = null
