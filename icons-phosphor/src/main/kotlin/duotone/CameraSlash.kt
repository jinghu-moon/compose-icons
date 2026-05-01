package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CameraSlash: ImageVector
    get() {
        if (_cameraSlash != null) return _cameraSlash!!
        _cameraSlash = phosphorDuotoneIcon(
            name = "CameraSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 64.0f),
                    PathNode.LineTo(176.0f, 64.0f),
                    PathNode.LineTo(160.0f, 40.0f),
                    PathNode.LineTo(96.0f, 40.0f),
                    PathNode.LineTo(80.0f, 64.0f),
                    PathNode.LineTo(48.0f, 64.0f),
                    PathNode.CurveTo(39.163445f, 64.0f, 32.0f, 71.163445f, 32.0f, 80.0f),
                    PathNode.LineTo(32.0f, 192.0f),
                    PathNode.CurveTo(32.0f, 200.83656f, 39.163445f, 208.0f, 48.0f, 208.0f),
                    PathNode.LineTo(208.0f, 208.0f),
                    PathNode.CurveTo(216.83656f, 208.0f, 224.0f, 200.83656f, 224.0f, 192.0f),
                    PathNode.LineTo(224.0f, 80.0f),
                    PathNode.CurveTo(224.0f, 71.163445f, 216.83656f, 64.0f, 208.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 168.0f),
                    PathNode.CurveTo(108.11775f, 168.0f, 92.0f, 151.88223f, 92.0f, 132.0f),
                    PathNode.CurveTo(92.0f, 112.11775f, 108.11775f, 96.0f, 128.0f, 96.0f),
                    PathNode.CurveTo(147.88223f, 96.0f, 164.0f, 112.11775f, 164.0f, 132.0f),
                    PathNode.CurveTo(164.0f, 151.88223f, 147.88223f, 168.0f, 128.0f, 168.0f),
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
                    PathNode.MoveTo(53.92f, 34.62f),
                    PathNode.CurveTo(52.008102f, 32.46484f, 49.085068f, 31.50414f, 46.26741f, 32.104855f),
                    PathNode.CurveTo(43.44975f, 32.70557f, 41.17271f, 34.774906f, 40.30605f, 37.52244f),
                    PathNode.CurveTo(39.439384f, 40.26998f, 40.116978f, 43.271305f, 42.08f, 45.38f),
                    PathNode.LineTo(51.73f, 56.0f),
                    PathNode.LineTo(48.0f, 56.0f),
                    PathNode.CurveTo(34.745167f, 56.0f, 24.0f, 66.74516f, 24.0f, 80.0f),
                    PathNode.LineTo(24.0f, 192.0f),
                    PathNode.CurveTo(24.0f, 205.25484f, 34.745167f, 216.0f, 48.0f, 216.0f),
                    PathNode.LineTo(197.19f, 216.0f),
                    PathNode.LineTo(202.08f, 221.38f),
                    PathNode.CurveTo(203.9919f, 223.53516f, 206.91493f, 224.49586f, 209.73259f, 223.89514f),
                    PathNode.CurveTo(212.55025f, 223.29443f, 214.82729f, 221.2251f, 215.69395f, 218.47755f),
                    PathNode.CurveTo(216.56061f, 215.73003f, 215.88303f, 212.7287f, 213.92f, 210.62f),
                    PathNode.Close,
                    PathNode.MoveTo(105.58f, 115.23f),
                    PathNode.LineTo(142.58f, 155.92f),
                    PathNode.CurveTo(138.19296f, 158.60707f, 133.14452f, 160.0198f, 128.0f, 160.0f),
                    PathNode.CurveTo(117.40158f, 159.99907f, 107.71203f, 154.01419f, 102.96634f, 144.53764f),
                    PathNode.CurveTo(98.22066f, 135.06108f, 99.2323f, 123.71724f, 105.58f, 115.23f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 200.0f),
                    PathNode.CurveTo(43.581722f, 200.0f, 40.0f, 196.41827f, 40.0f, 192.0f),
                    PathNode.LineTo(40.0f, 80.0f),
                    PathNode.CurveTo(40.0f, 75.58172f, 43.581722f, 72.0f, 48.0f, 72.0f),
                    PathNode.LineTo(66.28f, 72.0f),
                    PathNode.LineTo(94.69f, 103.26f),
                    PathNode.CurveTo(83.45059f, 116.28929f, 80.83766f, 134.67473f, 88.00192f, 150.31955f),
                    PathNode.CurveTo(95.16618f, 165.96436f, 110.79283f, 175.99731f, 128.0f, 176.0f),
                    PathNode.CurveTo(137.11427f, 175.9804f, 145.99974f, 173.1443f, 153.44f, 167.88f),
                    PathNode.LineTo(182.64f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 80.0f),
                    PathNode.LineTo(232.0f, 186.0f),
                    PathNode.CurveTo(232.0f, 190.41827f, 228.41827f, 194.0f, 224.0f, 194.0f),
                    PathNode.CurveTo(219.58173f, 194.0f, 216.0f, 190.41827f, 216.0f, 186.0f),
                    PathNode.LineTo(216.0f, 80.0f),
                    PathNode.CurveTo(216.0f, 75.58172f, 212.41827f, 72.0f, 208.0f, 72.0f),
                    PathNode.LineTo(176.0f, 72.0f),
                    PathNode.CurveTo(173.32791f, 71.9984f, 170.83302f, 70.66279f, 169.35f, 68.44f),
                    PathNode.LineTo(155.71f, 48.0f),
                    PathNode.LineTo(100.24f, 48.0f),
                    PathNode.CurveTo(97.56075f, 51.322628f, 92.74493f, 51.956707f, 89.29694f, 49.44083f),
                    PathNode.CurveTo(85.84896f, 46.924953f, 84.983345f, 42.14531f, 87.33f, 38.58f),
                    PathNode.LineTo(89.33f, 35.58f),
                    PathNode.CurveTo(90.81235f, 33.343697f, 93.31701f, 31.999365f, 96.0f, 32.0f),
                    PathNode.LineTo(160.0f, 32.0f),
                    PathNode.CurveTo(162.67564f, 31.998262f, 165.17502f, 33.334263f, 166.66f, 35.56f),
                    PathNode.LineTo(180.28f, 56.0f),
                    PathNode.LineTo(208.0f, 56.0f),
                    PathNode.CurveTo(221.25484f, 56.0f, 232.0f, 66.74516f, 232.0f, 80.0f),
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
        return _cameraSlash!!
    }

private var _cameraSlash: ImageVector? = null
