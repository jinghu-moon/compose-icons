package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.LightningSlash: ImageVector
    get() {
        if (_lightningSlash != null) return _lightningSlash!!
        _lightningSlash = phosphorFillIcon(
            name = "LightningSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(105.72f, 67.81f),
                    PathNode.CurveTo(104.309456f, 66.278656f, 104.309456f, 63.92135f, 105.72f, 62.39f),
                    PathNode.LineTo(154.11f, 10.54f),
                    PathNode.CurveTo(156.5464f, 7.927783f, 160.41936f, 7.247325f, 163.60028f, 8.872608f),
                    PathNode.CurveTo(166.78119f, 10.497891f, 168.49916f, 14.035032f, 167.81f, 17.54f),
                    PathNode.LineTo(153.18f, 90.9f),
                    PathNode.LineTo(210.61f, 112.43f),
                    PathNode.CurveTo(212.35977f, 113.05512f, 213.84691f, 114.25329f, 214.83f, 115.83f),
                    PathNode.CurveTo(216.69737f, 118.90027f, 216.28836f, 122.83893f, 213.83f, 125.46f),
                    PathNode.LineTo(188.56f, 152.53f),
                    PathNode.CurveTo(187.80273f, 153.35085f, 186.7368f, 153.81773f, 185.62f, 153.81773f),
                    PathNode.CurveTo(184.5032f, 153.81773f, 183.43724f, 153.35085f, 182.68f, 152.53f),
                    PathNode.Close,
                    PathNode.MoveTo(133.48f, 122.13f),
                    PathNode.LineTo(53.92f, 34.62f),
                    PathNode.CurveTo(52.008102f, 32.46484f, 49.085068f, 31.50414f, 46.26741f, 32.104855f),
                    PathNode.CurveTo(43.44975f, 32.70557f, 41.17271f, 34.774906f, 40.30605f, 37.52244f),
                    PathNode.CurveTo(39.439384f, 40.26998f, 40.116978f, 43.271305f, 42.08f, 45.38f),
                    PathNode.LineTo(81.34f, 88.56f),
                    PathNode.LineTo(42.34f, 130.39f),
                    PathNode.CurveTo(41.01871f, 131.71301f, 40.192524f, 133.45013f, 40.0f, 135.31f),
                    PathNode.CurveTo(39.690548f, 138.88539f, 41.799946f, 142.22935f, 45.16f, 143.49f),
                    PathNode.LineTo(102.79f, 165.1f),
                    PathNode.LineTo(88.16f, 238.43f),
                    PathNode.CurveTo(87.47802f, 241.93027f, 89.19517f, 245.45929f, 92.37027f, 247.08278f),
                    PathNode.CurveTo(95.545364f, 248.70628f, 99.41165f, 248.0322f, 101.85f, 245.43f),
                    PathNode.LineTo(163.71f, 179.15f),
                    PathNode.LineTo(202.08f, 221.35f),
                    PathNode.CurveTo(203.9919f, 223.50516f, 206.91493f, 224.46587f, 209.73259f, 223.86514f),
                    PathNode.CurveTo(212.55025f, 223.26443f, 214.82729f, 221.1951f, 215.69395f, 218.44756f),
                    PathNode.CurveTo(216.56061f, 215.70001f, 215.88303f, 212.6987f, 213.92f, 210.59f),
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
        return _lightningSlash!!
    }

private var _lightningSlash: ImageVector? = null
