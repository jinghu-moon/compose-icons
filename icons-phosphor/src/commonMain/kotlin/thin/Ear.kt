package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Ear: ImageVector
    get() {
        if (_ear != null) return _ear!!
        _ear = phosphorThinIcon(
            name = "Ear",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.0f, 104.0f),
                    PathNode.CurveTo(212.0f, 106.20914f, 210.20914f, 108.0f, 208.0f, 108.0f),
                    PathNode.CurveTo(205.79086f, 108.0f, 204.0f, 106.20914f, 204.0f, 104.0f),
                    PathNode.CurveTo(204.0f, 62.02636f, 169.97365f, 28.0f, 128.0f, 28.0f),
                    PathNode.CurveTo(86.02636f, 28.0f, 52.0f, 62.02636f, 52.0f, 104.0f),
                    PathNode.CurveTo(52.0f, 132.4f, 61.55f, 141.61f, 70.79f, 150.52f),
                    PathNode.CurveTo(79.25f, 158.67f, 88.0f, 167.11f, 88.0f, 188.0f),
                    PathNode.CurveTo(88.0f, 210.09138f, 105.90861f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(139.37f, 228.0f, 148.83f, 223.24f, 156.92f, 213.45f),
                    PathNode.CurveTo(158.34615f, 211.81699f, 160.81367f, 211.61745f, 162.4837f, 213.00008f),
                    PathNode.CurveTo(164.15372f, 214.38272f, 164.41818f, 216.84415f, 163.08f, 218.55f),
                    PathNode.CurveTo(153.52f, 230.13f, 141.71f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(101.501755f, 235.97244f, 80.02756f, 214.49825f, 80.0f, 188.0f),
                    PathNode.CurveTo(80.0f, 170.51f, 73.16f, 163.91f, 65.24f, 156.28f),
                    PathNode.CurveTo(55.28f, 146.68f, 44.0f, 135.79f, 44.0f, 104.0f),
                    PathNode.CurveTo(44.0f, 57.60808f, 81.60808f, 20.0f, 128.0f, 20.0f),
                    PathNode.CurveTo(174.39192f, 20.0f, 212.0f, 57.60808f, 212.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(175.86f, 164.54f),
                    PathNode.CurveTo(173.94882f, 163.43753f, 171.50586f, 164.09077f, 170.4f, 166.0f),
                    PathNode.CurveTo(167.68774f, 170.71175f, 162.14665f, 173.01138f, 156.89516f, 171.60474f),
                    PathNode.CurveTo(151.64366f, 170.19809f, 147.99394f, 165.43661f, 148.0f, 160.0f),
                    PathNode.CurveTo(148.0f, 149.33f, 153.44f, 142.08f, 159.2f, 134.4f),
                    PathNode.CurveTo(165.49f, 126.0f, 172.0f, 117.33f, 172.0f, 104.0f),
                    PathNode.CurveTo(172.0f, 79.69947f, 152.30052f, 60.0f, 128.0f, 60.0f),
                    PathNode.CurveTo(103.69947f, 60.0f, 84.0f, 79.69947f, 84.0f, 104.0f),
                    PathNode.CurveTo(84.0f, 106.20914f, 85.79086f, 108.0f, 88.0f, 108.0f),
                    PathNode.CurveTo(90.20914f, 108.0f, 92.0f, 106.20914f, 92.0f, 104.0f),
                    PathNode.CurveTo(92.0f, 84.11775f, 108.11775f, 68.0f, 128.0f, 68.0f),
                    PathNode.CurveTo(147.88223f, 68.0f, 164.0f, 84.11775f, 164.0f, 104.0f),
                    PathNode.CurveTo(164.0f, 114.67f, 158.56f, 121.92f, 152.8f, 129.6f),
                    PathNode.CurveTo(146.51f, 138.0f, 140.0f, 146.67f, 140.0f, 160.0f),
                    PathNode.CurveTo(140.0004f, 169.05176f, 146.08023f, 176.97482f, 154.82355f, 179.31761f),
                    PathNode.CurveTo(163.56688f, 181.66042f, 172.79372f, 177.83882f, 177.32f, 170.0f),
                    PathNode.CurveTo(178.42247f, 168.08882f, 177.76923f, 165.64586f, 175.86f, 164.54f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _ear!!
    }

private var _ear: ImageVector? = null
