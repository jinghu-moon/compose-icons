package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Lightbulb: ImageVector
    get() {
        if (_lightbulb != null) return _lightbulb!!
        _lightbulb = phosphorLightIcon(
            name = "Lightbulb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(174.0f, 232.0f),
                    PathNode.CurveTo(174.0f, 235.3137f, 171.3137f, 238.0f, 168.0f, 238.0f),
                    PathNode.LineTo(88.0f, 238.0f),
                    PathNode.CurveTo(84.686295f, 238.0f, 82.0f, 235.3137f, 82.0f, 232.0f),
                    PathNode.CurveTo(82.0f, 228.6863f, 84.686295f, 226.0f, 88.0f, 226.0f),
                    PathNode.LineTo(168.0f, 226.0f),
                    PathNode.CurveTo(171.3137f, 226.0f, 174.0f, 228.6863f, 174.0f, 232.0f),
                    PathNode.Close,
                    PathNode.MoveTo(214.0f, 104.0f),
                    PathNode.CurveTo(214.06813f, 130.4132f, 201.93306f, 155.37721f, 181.12f, 171.64f),
                    PathNode.CurveTo(176.65683f, 175.07062f, 174.0289f, 180.37077f, 174.0f, 186.0f),
                    PathNode.LineTo(174.0f, 192.0f),
                    PathNode.CurveTo(174.0f, 199.73198f, 167.73198f, 206.0f, 160.0f, 206.0f),
                    PathNode.LineTo(96.0f, 206.0f),
                    PathNode.CurveTo(88.26801f, 206.0f, 82.0f, 199.73198f, 82.0f, 192.0f),
                    PathNode.LineTo(82.0f, 186.0f),
                    PathNode.CurveTo(81.99448f, 180.429f, 79.409706f, 175.1745f, 75.0f, 171.77f),
                    PathNode.LineTo(75.0f, 171.77f),
                    PathNode.CurveTo(54.256157f, 155.61502f, 42.08838f, 130.82225f, 42.0f, 104.53f),
                    PathNode.CurveTo(41.74f, 57.91f, 79.39f, 19.12f, 125.93f, 18.0f),
                    PathNode.CurveTo(149.09512f, 17.442259f, 171.50514f, 26.256123f, 188.08379f, 42.4451f),
                    PathNode.CurveTo(204.66243f, 58.634075f, 214.00671f, 80.828156f, 214.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(202.0f, 104.0f),
                    PathNode.CurveTo(202.00583f, 84.05986f, 193.96419f, 64.96124f, 179.69691f, 51.03093f),
                    PathNode.CurveTo(165.42964f, 37.100613f, 146.1443f, 29.517664f, 126.21f, 30.0f),
                    PathNode.CurveTo(86.17f, 31.0f, 53.78f, 64.34f, 54.0f, 104.42f),
                    PathNode.CurveTo(54.07679f, 127.0479f, 64.54821f, 148.38527f, 82.4f, 162.29f),
                    PathNode.CurveTo(89.73228f, 167.96844f, 94.01687f, 176.72601f, 94.0f, 186.0f),
                    PathNode.LineTo(94.0f, 192.0f),
                    PathNode.CurveTo(94.0f, 193.10457f, 94.89543f, 194.0f, 96.0f, 194.0f),
                    PathNode.LineTo(160.0f, 194.0f),
                    PathNode.CurveTo(161.10457f, 194.0f, 162.0f, 193.10457f, 162.0f, 192.0f),
                    PathNode.LineTo(162.0f, 186.0f),
                    PathNode.CurveTo(162.02484f, 176.69336f, 166.34207f, 167.91869f, 173.7f, 162.22f),
                    PathNode.CurveTo(191.62073f, 148.22719f, 202.06708f, 126.73644f, 202.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(181.92f, 95.0f),
                    PathNode.CurveTo(177.82224f, 72.101814f, 159.8982f, 54.17777f, 137.0f, 50.08f),
                    PathNode.CurveTo(133.73047f, 49.527714f, 130.63228f, 51.730473f, 130.08f, 55.0f),
                    PathNode.CurveTo(129.52771f, 58.269527f, 131.73047f, 61.36771f, 135.0f, 61.92f),
                    PathNode.CurveTo(152.38f, 64.84f, 167.13f, 79.6f, 170.08f, 97.0f),
                    PathNode.CurveTo(170.56758f, 99.884605f, 173.06448f, 101.99703f, 175.99f, 102.0f),
                    PathNode.CurveTo(176.32484f, 101.99774f, 176.65906f, 101.971f, 176.99f, 101.92f),
                    PathNode.CurveTo(178.5624f, 101.65809f, 179.96594f, 100.781235f, 180.89087f, 99.48295f),
                    PathNode.CurveTo(181.81581f, 98.18468f, 182.18608f, 96.57169f, 181.92f, 95.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _lightbulb!!
    }

private var _lightbulb: ImageVector? = null
