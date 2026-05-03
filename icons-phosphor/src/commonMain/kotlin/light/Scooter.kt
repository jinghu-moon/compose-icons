package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Scooter: ImageVector
    get() {
        if (_scooter != null) return _scooter!!
        _scooter = phosphorLightIcon(
            name = "Scooter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.0f, 138.0f),
                    PathNode.CurveTo(210.3635f, 138.00327f, 208.72934f, 138.12357f, 207.11f, 138.36f),
                    PathNode.LineTo(173.69f, 38.1f),
                    PathNode.CurveTo(172.87265f, 35.65172f, 170.58112f, 34.000526f, 168.0f, 34.0f),
                    PathNode.LineTo(136.0f, 34.0f),
                    PathNode.CurveTo(132.6863f, 34.0f, 130.0f, 36.68629f, 130.0f, 40.0f),
                    PathNode.CurveTo(130.0f, 43.31371f, 132.6863f, 46.0f, 136.0f, 46.0f),
                    PathNode.LineTo(163.68f, 46.0f),
                    PathNode.LineTo(181.92f, 100.73f),
                    PathNode.LineTo(125.16f, 170.0f),
                    PathNode.LineTo(77.94f, 170.0f),
                    PathNode.CurveTo(76.89756f, 152.42882f, 62.61656f, 138.55844f, 45.02244f, 138.02895f),
                    PathNode.CurveTo(27.428328f, 137.49945f, 12.339067f, 150.48593f, 10.241864f, 167.96263f),
                    PathNode.CurveTo(8.14466f, 185.43932f, 19.73301f, 201.6271f, 36.95288f, 205.27528f),
                    PathNode.CurveTo(54.172756f, 208.92348f, 71.32994f, 198.82568f, 76.5f, 182.0f),
                    PathNode.LineTo(128.0f, 182.0f),
                    PathNode.CurveTo(129.79819f, 181.99902f, 131.50114f, 181.19159f, 132.64f, 179.8f),
                    PathNode.LineTo(186.4f, 114.18f),
                    PathNode.LineTo(195.73f, 142.18f),
                    PathNode.CurveTo(180.69627f, 150.41435f, 174.1431f, 168.55202f, 180.44191f, 184.49387f),
                    PathNode.CurveTo(186.7407f, 200.4357f, 203.92152f, 209.1958f, 220.52347f, 204.93051f),
                    PathNode.CurveTo(237.12543f, 200.66524f, 247.95613f, 184.70857f, 245.79074f, 167.70479f),
                    PathNode.CurveTo(243.62532f, 150.70102f, 229.14107f, 137.96817f, 212.0f, 138.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 194.0f),
                    PathNode.CurveTo(31.849735f, 194.0f, 22.0f, 184.15027f, 22.0f, 172.0f),
                    PathNode.CurveTo(22.0f, 159.84973f, 31.849735f, 150.0f, 44.0f, 150.0f),
                    PathNode.CurveTo(56.150265f, 150.0f, 66.0f, 159.84973f, 66.0f, 172.0f),
                    PathNode.CurveTo(66.0f, 184.15027f, 56.150265f, 194.0f, 44.0f, 194.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 194.0f),
                    PathNode.CurveTo(199.84973f, 194.0f, 190.0f, 184.15027f, 190.0f, 172.0f),
                    PathNode.CurveTo(190.0f, 159.84973f, 199.84973f, 150.0f, 212.0f, 150.0f),
                    PathNode.CurveTo(224.15027f, 150.0f, 234.0f, 159.84973f, 234.0f, 172.0f),
                    PathNode.CurveTo(234.0f, 184.15027f, 224.15027f, 194.0f, 212.0f, 194.0f),
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
        return _scooter!!
    }

private var _scooter: ImageVector? = null
