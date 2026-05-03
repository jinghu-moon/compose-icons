package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AppleLogo: ImageVector
    get() {
        if (_appleLogo != null) return _appleLogo!!
        _appleLogo = phosphorLightIcon(
            name = "AppleLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(219.4f, 167.84f),
                    PathNode.CurveTo(201.71f, 155.69f, 198.0f, 135.12f, 198.0f, 120.0f),
                    PathNode.CurveTo(198.0f, 101.58f, 211.86f, 85.71f, 220.12f, 77.88f),
                    PathNode.CurveTo(221.31558f, 76.74695f, 221.99278f, 75.172195f, 221.99278f, 73.525f),
                    PathNode.CurveTo(221.99278f, 71.87781f, 221.31558f, 70.303055f, 220.12f, 69.17f),
                    PathNode.CurveTo(208.0f, 57.7f, 187.07f, 50.0f, 168.0f, 50.0f),
                    PathNode.CurveTo(153.69992f, 50.013412f, 139.74467f, 54.39187f, 128.0f, 62.55f),
                    PathNode.CurveTo(100.23041f, 43.150772f, 62.527035f, 46.56185f, 38.69f, 70.63f),
                    PathNode.CurveTo(24.943628f, 84.679665f, 17.4787f, 103.70097f, 18.0f, 123.35f),
                    PathNode.CurveTo(18.795135f, 156.90375f, 33.038643f, 188.73094f, 57.53f, 211.68f),
                    PathNode.CurveTo(64.57847f, 218.3305f, 73.90931f, 222.02419f, 83.6f, 222.0f),
                    PathNode.LineTo(171.3f, 222.0f),
                    PathNode.CurveTo(181.78786f, 222.035f, 191.8196f, 217.7145f, 199.0f, 210.07f),
                    PathNode.CurveTo(205.81174f, 202.74886f, 211.70216f, 194.62181f, 216.54f, 185.87f),
                    PathNode.CurveTo(223.09f, 173.87f, 222.31f, 172.12f, 221.54f, 170.39f),
                    PathNode.CurveTo(221.07825f, 169.35718f, 220.33704f, 168.47397f, 219.4f, 167.84f),
                    PathNode.Close,
                    PathNode.MoveTo(190.17f, 201.84f),
                    PathNode.CurveTo(185.28076f, 207.05486f, 178.44838f, 210.0094f, 171.3f, 210.0f),
                    PathNode.LineTo(83.6f, 210.0f),
                    PathNode.CurveTo(76.98301f, 210.03345f, 70.60513f, 207.5281f, 65.78f, 203.0f),
                    PathNode.CurveTo(43.596985f, 182.21819f, 30.70302f, 153.38875f, 30.0f, 123.0f),
                    PathNode.CurveTo(29.541855f, 106.607994f, 35.751877f, 90.731125f, 47.21f, 79.0f),
                    PathNode.CurveTo(57.955833f, 68.06159f, 72.66647f, 61.930653f, 88.0f, 62.0f),
                    PathNode.LineTo(88.81f, 62.0f),
                    PathNode.CurveTo(101.71703f, 62.12774f, 114.20358f, 66.60584f, 124.25f, 74.71f),
                    PathNode.CurveTo(126.44199f, 76.465f, 129.558f, 76.465f, 131.75f, 74.71f),
                    PathNode.CurveTo(142.0146f, 66.435104f, 154.81541f, 61.946877f, 168.0f, 62.0f),
                    PathNode.CurveTo(181.89f, 62.0f, 196.81f, 66.68f, 207.11f, 74.0f),
                    PathNode.CurveTo(197.67f, 84.14f, 186.01f, 100.59f, 186.01f, 120.0f),
                    PathNode.CurveTo(186.01f, 143.78f, 193.82f, 162.6f, 208.67f, 174.77f),
                    PathNode.CurveTo(203.93053f, 184.70518f, 197.69089f, 193.85217f, 190.17f, 201.89f),
                    PathNode.Close,
                    PathNode.MoveTo(130.17f, 30.45f),
                    PathNode.CurveTo(134.52458f, 13.678926f, 149.67284f, 1.977385f, 167.0f, 2.0f),
                    PathNode.LineTo(168.0f, 2.0f),
                    PathNode.CurveTo(171.3137f, 2.0f, 174.0f, 4.686292f, 174.0f, 8.0f),
                    PathNode.CurveTo(174.0f, 11.313708f, 171.3137f, 14.0f, 168.0f, 14.0f),
                    PathNode.LineTo(167.0f, 14.0f),
                    PathNode.CurveTo(155.14195f, 13.997442f, 144.78452f, 22.0185f, 141.82f, 33.5f),
                    PathNode.CurveTo(140.99158f, 36.708775f, 137.71878f, 38.638428f, 134.51f, 37.81f),
                    PathNode.CurveTo(131.30122f, 36.98157f, 129.37157f, 33.708775f, 130.2f, 30.5f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _appleLogo!!
    }

private var _appleLogo: ImageVector? = null
