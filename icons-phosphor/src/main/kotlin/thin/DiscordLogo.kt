package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.DiscordLogo: ImageVector
    get() {
        if (_discordLogo != null) return _discordLogo!!
        _discordLogo = phosphorThinIcon(
            name = "DiscordLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(100.0f, 140.0f),
                    PathNode.CurveTo(100.0f, 144.41827f, 96.41828f, 148.0f, 92.0f, 148.0f),
                    PathNode.CurveTo(87.58172f, 148.0f, 84.0f, 144.41827f, 84.0f, 140.0f),
                    PathNode.CurveTo(84.0f, 135.58173f, 87.58172f, 132.0f, 92.0f, 132.0f),
                    PathNode.CurveTo(96.41828f, 132.0f, 100.0f, 135.58173f, 100.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 132.0f),
                    PathNode.CurveTo(159.58173f, 132.0f, 156.0f, 135.58173f, 156.0f, 140.0f),
                    PathNode.CurveTo(156.0f, 144.41827f, 159.58173f, 148.0f, 164.0f, 148.0f),
                    PathNode.CurveTo(168.41827f, 148.0f, 172.0f, 144.41827f, 172.0f, 140.0f),
                    PathNode.CurveTo(172.0f, 135.58173f, 168.41827f, 132.0f, 164.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(236.83f, 189.25f),
                    PathNode.LineTo(169.83f, 218.96f),
                    PathNode.CurveTo(168.25095f, 219.63724f, 166.54805f, 219.97781f, 164.83f, 219.96f),
                    PathNode.CurveTo(159.76318f, 219.9679f, 155.22527f, 216.82564f, 153.45f, 212.08f),
                    PathNode.LineTo(144.3f, 187.27f),
                    PathNode.CurveTo(138.94f, 187.72f, 133.49f, 187.96f, 127.96f, 187.96f),
                    PathNode.CurveTo(122.43f, 187.96f, 116.96f, 187.72f, 111.62f, 187.27f),
                    PathNode.LineTo(102.47f, 212.08f),
                    PathNode.CurveTo(100.71301f, 216.82768f, 96.19234f, 219.98499f, 91.13f, 220.0f),
                    PathNode.CurveTo(89.41194f, 220.0178f, 87.709045f, 219.67723f, 86.13f, 219.0f),
                    PathNode.LineTo(19.13f, 189.29f),
                    PathNode.CurveTo(13.788803f, 186.9334f, 10.918601f, 181.0748f, 12.33f, 175.41f),
                    PathNode.LineTo(41.9f, 59.0f),
                    PathNode.CurveTo(43.09315f, 54.350258f, 46.930298f, 50.850872f, 51.67f, 50.09f),
                    PathNode.LineTo(87.73f, 44.17f),
                    PathNode.CurveTo(93.91763f, 43.164143f, 99.85821f, 47.01924f, 101.46f, 53.08f),
                    PathNode.LineTo(105.58f, 69.3f),
                    PathNode.CurveTo(120.47718f, 67.57997f, 135.52281f, 67.57997f, 150.42f, 69.3f),
                    PathNode.LineTo(154.54f, 53.08f),
                    PathNode.CurveTo(156.14178f, 47.01924f, 162.08237f, 43.164143f, 168.27f, 44.17f),
                    PathNode.LineTo(204.33f, 50.09f),
                    PathNode.CurveTo(209.0697f, 50.850872f, 212.90685f, 54.350258f, 214.1f, 59.0f),
                    PathNode.LineTo(243.63f, 175.38f),
                    PathNode.CurveTo(245.03595f, 181.0416f, 242.16666f, 186.89409f, 236.83f, 189.25f),
                    PathNode.Close,
                    PathNode.MoveTo(235.83f, 177.34f),
                    PathNode.LineTo(206.35f, 61.0f),
                    PathNode.CurveTo(205.93732f, 59.417877f, 204.61789f, 58.23631f, 203.0f, 58.0f),
                    PathNode.LineTo(167.0f, 52.05f),
                    PathNode.CurveTo(164.89828f, 51.697487f, 162.87119f, 52.994144f, 162.31f, 55.05f),
                    PathNode.LineTo(158.4f, 70.38f),
                    PathNode.CurveTo(164.69958f, 71.38158f, 170.9365f, 72.74381f, 177.08f, 74.46f),
                    PathNode.CurveTo(178.49f, 74.81575f, 179.59586f, 75.9087f, 179.96814f, 77.31443f),
                    PathNode.CurveTo(180.34042f, 78.72015f, 179.92047f, 80.217186f, 178.87137f, 81.22419f),
                    PathNode.CurveTo(177.82228f, 82.23119f, 176.30931f, 82.589516f, 174.92f, 82.16f),
                    PathNode.CurveTo(159.62811f, 78.00633f, 143.84583f, 75.93432f, 128.0f, 76.0f),
                    PathNode.CurveTo(112.15417f, 75.93432f, 96.37188f, 78.00633f, 81.08f, 82.16f),
                    PathNode.CurveTo(79.69069f, 82.589516f, 78.17773f, 82.23119f, 77.128624f, 81.22419f),
                    PathNode.CurveTo(76.07952f, 80.217186f, 75.65958f, 78.72015f, 76.03186f, 77.31443f),
                    PathNode.CurveTo(76.404144f, 75.9087f, 77.51f, 74.81575f, 78.92f, 74.46f),
                    PathNode.CurveTo(85.0635f, 72.74381f, 91.300415f, 71.38158f, 97.6f, 70.38f),
                    PathNode.LineTo(93.71f, 55.0f),
                    PathNode.CurveTo(93.14882f, 52.944145f, 91.12171f, 51.647488f, 89.02f, 52.0f),
                    PathNode.LineTo(53.0f, 58.0f),
                    PathNode.CurveTo(51.397415f, 58.251038f, 50.096912f, 59.42974f, 49.69f, 61.0f),
                    PathNode.LineTo(20.12f, 177.34f),
                    PathNode.CurveTo(19.672718f, 179.22249f, 20.63699f, 181.15524f, 22.41f, 181.93f),
                    PathNode.LineTo(89.41f, 211.64f),
                    PathNode.CurveTo(90.47732f, 212.10948f, 91.69268f, 212.10948f, 92.76f, 211.64f),
                    PathNode.CurveTo(93.79306f, 211.22203f, 94.604935f, 210.39204f, 95.0f, 209.35f),
                    PathNode.LineTo(103.45f, 186.47f),
                    PathNode.CurveTo(95.16445f, 185.42943f, 86.96597f, 183.78505f, 78.92f, 181.55f),
                    PathNode.CurveTo(76.79094f, 180.95354f, 75.54853f, 178.74406f, 76.145f, 176.615f),
                    PathNode.CurveTo(76.74147f, 174.48595f, 78.95094f, 173.24353f, 81.08f, 173.84f),
                    PathNode.CurveTo(96.37188f, 177.99367f, 112.15417f, 180.06569f, 128.0f, 180.0f),
                    PathNode.CurveTo(143.84583f, 180.06569f, 159.62811f, 177.99367f, 174.92f, 173.84f),
                    PathNode.CurveTo(177.04906f, 173.24353f, 179.25853f, 174.48595f, 179.855f, 176.615f),
                    PathNode.CurveTo(180.45146f, 178.74406f, 179.20906f, 180.95354f, 177.08f, 181.55f),
                    PathNode.CurveTo(169.03403f, 183.78505f, 160.83556f, 185.42943f, 152.55f, 186.47f),
                    PathNode.LineTo(161.0f, 209.35f),
                    PathNode.CurveTo(161.38577f, 210.40141f, 162.19466f, 211.24295f, 163.23f, 211.67f),
                    PathNode.CurveTo(164.29732f, 212.13948f, 165.5127f, 212.13948f, 166.58f, 211.67f),
                    PathNode.LineTo(233.58f, 181.96f),
                    PathNode.CurveTo(235.37045f, 181.18666f, 236.34218f, 179.23479f, 235.88f, 177.34f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _discordLogo!!
    }

private var _discordLogo: ImageVector? = null
