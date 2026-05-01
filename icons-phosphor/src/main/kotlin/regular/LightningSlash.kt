package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.LightningSlash: ImageVector
    get() {
        if (_lightningSlash != null) return _lightningSlash!!
        _lightningSlash = phosphorRegularIcon(
            name = "LightningSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(53.92f, 34.62f),
                    PathNode.CurveTo(52.008102f, 32.46484f, 49.085068f, 31.50414f, 46.26741f, 32.104855f),
                    PathNode.CurveTo(43.44975f, 32.70557f, 41.17271f, 34.774906f, 40.30605f, 37.52244f),
                    PathNode.CurveTo(39.439384f, 40.26998f, 40.116978f, 43.271305f, 42.08f, 45.38f),
                    PathNode.LineTo(81.33f, 88.56f),
                    PathNode.LineTo(42.15f, 130.56f),
                    PathNode.CurveTo(40.30234f, 132.50688f, 39.554127f, 135.2506f, 40.157665f, 137.86592f),
                    PathNode.CurveTo(40.761204f, 140.48125f, 42.63605f, 142.61964f, 45.15f, 143.56f),
                    PathNode.LineTo(102.78f, 165.17f),
                    PathNode.LineTo(88.16f, 238.43f),
                    PathNode.CurveTo(87.47802f, 241.93027f, 89.19517f, 245.45929f, 92.37027f, 247.08278f),
                    PathNode.CurveTo(95.545364f, 248.70628f, 99.41165f, 248.0322f, 101.85f, 245.43f),
                    PathNode.LineTo(163.71f, 179.15f),
                    PathNode.LineTo(202.08f, 221.35f),
                    PathNode.CurveTo(203.9919f, 223.50516f, 206.91493f, 224.46587f, 209.73259f, 223.86514f),
                    PathNode.CurveTo(212.55025f, 223.26443f, 214.82729f, 221.1951f, 215.69395f, 218.44756f),
                    PathNode.CurveTo(216.56061f, 215.70001f, 215.88303f, 212.6987f, 213.92f, 210.59f),
                    PathNode.Close,
                    PathNode.MoveTo(109.37f, 214.0f),
                    PathNode.LineTo(119.84f, 161.62f),
                    PathNode.CurveTo(120.61387f, 157.78352f, 118.49845f, 153.95038f, 114.84f, 152.56f),
                    PathNode.LineTo(62.0f, 132.71f),
                    PathNode.LineTo(92.12f, 100.44f),
                    PathNode.LineTo(152.9f, 167.3f),
                    PathNode.Close,
                    PathNode.MoveTo(108.66f, 71.0f),
                    PathNode.CurveTo(107.10797f, 69.552216f, 106.194885f, 67.54701f, 106.12174f, 65.425804f),
                    PathNode.CurveTo(106.04859f, 63.304592f, 106.82139f, 61.241257f, 108.27f, 59.69f),
                    PathNode.LineTo(154.15f, 10.53f),
                    PathNode.CurveTo(156.58835f, 7.9278f, 160.45464f, 7.253716f, 163.62973f, 8.877214f),
                    PathNode.CurveTo(166.80486f, 10.500713f, 168.52197f, 14.029727f, 167.84f, 17.53f),
                    PathNode.LineTo(153.18f, 90.9f),
                    PathNode.LineTo(210.81f, 112.51f),
                    PathNode.CurveTo(213.305f, 113.45651f, 215.16379f, 115.584724f, 215.76602f, 118.18438f),
                    PathNode.CurveTo(216.36826f, 120.78403f, 215.63463f, 123.5128f, 213.81f, 125.46f),
                    PathNode.LineTo(191.51f, 149.35f),
                    PathNode.CurveTo(188.47826f, 152.48686f, 183.4923f, 152.61642f, 180.30171f, 149.64128f),
                    PathNode.CurveTo(177.11113f, 146.66614f, 176.8924f, 141.68329f, 179.81f, 138.44f),
                    PathNode.LineTo(194.0f, 123.29f),
                    PathNode.LineTo(141.2f, 103.49f),
                    PathNode.CurveTo(137.54155f, 102.09962f, 135.42613f, 98.26648f, 136.2f, 94.43f),
                    PathNode.LineTo(146.67f, 42.05f),
                    PathNode.LineTo(120.0f, 70.62f),
                    PathNode.CurveTo(118.54983f, 72.17975f, 116.537575f, 73.09687f, 114.40902f, 73.1682f),
                    PathNode.CurveTo(112.28047f, 73.239525f, 110.211334f, 72.45917f, 108.66f, 71.0f),
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
        return _lightningSlash!!
    }

private var _lightningSlash: ImageVector? = null
