package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BellSlash: ImageVector
    get() {
        if (_bellSlash != null) return _bellSlash!!
        _bellSlash = phosphorBoldIcon(
            name = "BellSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.88f, 207.93f),
                    PathNode.LineTo(56.88f, 31.93f),
                    PathNode.CurveTo(54.012154f, 28.697262f, 49.6276f, 27.25621f, 45.401115f, 28.157282f),
                    PathNode.CurveTo(41.174625f, 29.058353f, 37.759064f, 32.16236f, 36.459072f, 36.283665f),
                    PathNode.CurveTo(35.15908f, 40.404972f, 36.175465f, 44.906956f, 39.12f, 48.07f),
                    PathNode.LineTo(53.92f, 64.36f),
                    PathNode.CurveTo(47.384502f, 76.54904f, 43.97597f, 90.16942f, 44.0f, 104.0f),
                    PathNode.CurveTo(44.0f, 129.58f, 39.41f, 151.0f, 30.73f, 165.93f),
                    PathNode.CurveTo(27.131416f, 172.1313f, 27.11236f, 179.78084f, 30.68f, 186.0f),
                    PathNode.CurveTo(34.21413f, 192.22615f, 40.840923f, 196.05225f, 48.0f, 196.0f),
                    PathNode.LineTo(84.19f, 196.0f),
                    PathNode.CurveTo(86.29895f, 218.61995f, 105.28195f, 235.9154f, 128.0f, 235.9154f),
                    PathNode.CurveTo(150.71805f, 235.9154f, 169.70105f, 218.61995f, 171.81f, 196.0f),
                    PathNode.LineTo(173.6f, 196.0f),
                    PathNode.LineTo(199.12f, 224.07f),
                    PathNode.CurveTo(203.5975f, 228.87978f, 211.1107f, 229.19368f, 215.9738f, 224.77417f),
                    PathNode.CurveTo(220.83693f, 220.35464f, 221.24089f, 212.84575f, 216.88f, 207.93f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 104.0f),
                    PathNode.CurveTo(67.99202f, 97.08407f, 69.18298f, 90.21911f, 71.52f, 83.71f),
                    PathNode.LineTo(151.78f, 172.0f),
                    PathNode.LineTo(54.68f, 172.0f),
                    PathNode.CurveTo(63.52f, 154.0f, 68.0f, 131.14f, 68.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 212.0f),
                    PathNode.CurveTo(118.49463f, 212.00194f, 110.30107f, 205.31332f, 108.4f, 196.0f),
                    PathNode.LineTo(147.6f, 196.0f),
                    PathNode.CurveTo(145.69893f, 205.31332f, 137.50537f, 212.00194f, 128.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.89f, 42.35f),
                    PathNode.CurveTo(87.64873f, 39.419365f, 87.62252f, 36.11566f, 88.81713f, 33.1657f),
                    PathNode.CurveTo(90.01174f, 30.215736f, 92.32932f, 27.86117f, 95.26f, 26.62f),
                    PathNode.CurveTo(121.2048f, 15.639301f, 150.92659f, 18.396074f, 174.4092f, 33.961292f),
                    PathNode.CurveTo(197.89178f, 49.526512f, 212.00775f, 75.82716f, 212.0f, 104.0f),
                    PathNode.CurveTo(212.0f, 122.68f, 214.38f, 138.93f, 219.07f, 152.28f),
                    PathNode.CurveTo(221.27916f, 158.53186f, 218.00186f, 165.39085f, 211.75f, 167.6f),
                    PathNode.CurveTo(205.49814f, 169.80914f, 198.63914f, 166.53186f, 196.43f, 160.28f),
                    PathNode.CurveTo(190.83f, 144.32f, 188.0f, 125.4f, 188.0f, 104.0f),
                    PathNode.CurveTo(188.0076f, 83.87656f, 177.92673f, 65.08935f, 161.15457f, 53.969612f),
                    PathNode.CurveTo(144.38245f, 42.849876f, 123.15281f, 40.878563f, 104.62f, 48.72f),
                    PathNode.CurveTo(101.68936f, 49.96127f, 98.38566f, 49.98748f, 95.4357f, 48.79287f),
                    PathNode.CurveTo(92.48573f, 47.598255f, 90.13118f, 45.280678f, 88.89f, 42.35f),
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
        return _bellSlash!!
    }

private var _bellSlash: ImageVector? = null
