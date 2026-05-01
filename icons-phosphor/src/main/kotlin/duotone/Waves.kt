package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Waves: ImageVector
    get() {
        if (_waves != null) return _waves!!
        _waves = phosphorDuotoneIcon(
            name = "Waves",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 70.39f),
                    PathNode.LineTo(216.0f, 182.39f),
                    PathNode.CurveTo(144.0f, 242.08f, 112.0f, 125.92f, 40.0f, 185.61f),
                    PathNode.LineTo(40.0f, 73.61f),
                    PathNode.CurveTo(112.0f, 13.92f, 144.0f, 130.08f, 216.0f, 70.39f),
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
                    PathNode.MoveTo(222.16f, 177.25f),
                    PathNode.CurveTo(224.98268f, 180.63518f, 224.5355f, 185.66577f, 221.16f, 188.5f),
                    PathNode.CurveTo(203.8f, 202.89f, 188.3f, 208.0f, 174.16f, 208.0f),
                    PathNode.CurveTo(155.58f, 208.0f, 139.34f, 199.18f, 124.23f, 191.0f),
                    PathNode.CurveTo(98.88f, 177.24f, 76.99f, 165.36f, 45.16f, 191.74f),
                    PathNode.CurveTo(42.963898f, 193.5923f, 39.9432f, 194.12479f, 37.246105f, 193.13506f),
                    PathNode.CurveTo(34.549015f, 192.14532f, 32.589733f, 189.78537f, 32.11301f, 186.95224f),
                    PathNode.CurveTo(31.63629f, 184.11911f, 32.71534f, 181.2479f, 34.94f, 179.43f),
                    PathNode.CurveTo(75.11f, 146.15f, 105.26f, 162.51f, 131.87f, 176.95f),
                    PathNode.CurveTo(157.22f, 190.7f, 179.11f, 202.58f, 210.94f, 176.21f),
                    PathNode.CurveTo(214.33115f, 173.41718f, 219.33997f, 173.88144f, 222.16f, 177.25f),
                    PathNode.Close,
                    PathNode.MoveTo(210.89f, 120.25f),
                    PathNode.CurveTo(179.06f, 146.63f, 157.17f, 134.75f, 131.82f, 120.99f),
                    PathNode.CurveTo(105.21f, 106.56f, 75.06f, 90.2f, 34.89f, 123.48f),
                    PathNode.CurveTo(31.531216f, 126.312965f, 31.085964f, 131.32466f, 33.892708f, 134.7054f),
                    PathNode.CurveTo(36.69945f, 138.08612f, 41.707535f, 138.57036f, 45.11f, 135.79f),
                    PathNode.CurveTo(76.94f, 109.41f, 98.83f, 121.29f, 124.18f, 135.05f),
                    PathNode.CurveTo(139.29f, 143.24f, 155.53f, 152.05f, 174.11f, 152.05f),
                    PathNode.CurveTo(188.25f, 152.05f, 203.75f, 146.94f, 221.11f, 132.55f),
                    PathNode.CurveTo(223.33466f, 130.7321f, 224.41371f, 127.86089f, 223.937f, 125.02776f),
                    PathNode.CurveTo(223.46027f, 122.19463f, 221.50099f, 119.83468f, 218.8039f, 118.84494f),
                    PathNode.CurveTo(216.1068f, 117.85521f, 213.0861f, 118.3877f, 210.89f, 120.24f),
                    PathNode.Close,
                    PathNode.MoveTo(45.11f, 79.8f),
                    PathNode.CurveTo(76.94f, 53.43f, 98.83f, 65.31f, 124.18f, 79.06f),
                    PathNode.CurveTo(139.29f, 87.26f, 155.53f, 96.06f, 174.11f, 96.06f),
                    PathNode.CurveTo(188.25f, 96.06f, 203.75f, 90.94f, 221.11f, 76.56f),
                    PathNode.CurveTo(223.33466f, 74.742096f, 224.41371f, 71.870895f, 223.937f, 69.037766f),
                    PathNode.CurveTo(223.46027f, 66.204636f, 221.50099f, 63.84468f, 218.8039f, 62.854946f),
                    PathNode.CurveTo(216.1068f, 61.86521f, 213.0861f, 62.397697f, 210.89f, 64.25f),
                    PathNode.CurveTo(179.06f, 90.63f, 157.17f, 78.75f, 131.82f, 64.99f),
                    PathNode.CurveTo(105.21f, 50.58f, 75.06f, 34.22f, 34.89f, 67.5f),
                    PathNode.CurveTo(32.58628f, 69.29282f, 31.44196f, 72.19811f, 31.904266f, 75.08041f),
                    PathNode.CurveTo(32.366573f, 77.96269f, 34.362106f, 80.364365f, 37.11096f, 81.34678f),
                    PathNode.CurveTo(39.859818f, 82.32919f, 42.925552f, 81.73637f, 45.11f, 79.8f),
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
        return _waves!!
    }

private var _waves: ImageVector? = null
