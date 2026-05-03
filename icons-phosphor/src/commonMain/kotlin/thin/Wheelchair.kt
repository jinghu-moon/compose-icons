package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Wheelchair: ImageVector
    get() {
        if (_wheelchair != null) return _wheelchair!!
        _wheelchair = phosphorThinIcon(
            name = "Wheelchair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(251.79f, 190.73f),
                    PathNode.CurveTo(251.08731f, 188.63797f, 248.82304f, 187.51031f, 246.73f, 188.21f),
                    PathNode.LineTo(226.03f, 195.11f),
                    PathNode.LineTo(195.58f, 134.21f),
                    PathNode.CurveTo(194.90175f, 132.85457f, 193.51566f, 131.99892f, 192.0f, 132.0f),
                    PathNode.LineTo(108.0f, 132.0f),
                    PathNode.LineTo(108.0f, 100.15f),
                    PathNode.CurveTo(109.32f, 100.06f, 110.65f, 100.0f, 112.0f, 100.0f),
                    PathNode.LineTo(168.0f, 100.0f),
                    PathNode.CurveTo(170.20914f, 100.0f, 172.0f, 98.20914f, 172.0f, 96.0f),
                    PathNode.CurveTo(172.0f, 93.79086f, 170.20914f, 92.0f, 168.0f, 92.0f),
                    PathNode.LineTo(112.0f, 92.0f),
                    PathNode.CurveTo(110.66f, 92.0f, 109.32f, 92.0f, 108.0f, 92.13f),
                    PathNode.LineTo(108.0f, 75.71f),
                    PathNode.CurveTo(122.53531f, 73.61201f, 132.97981f, 60.640266f, 131.92812f, 45.99204f),
                    PathNode.CurveTo(130.87642f, 31.343813f, 118.685936f, 19.997187f, 104.0f, 19.997187f),
                    PathNode.CurveTo(89.314064f, 19.997187f, 77.12358f, 31.343813f, 76.07189f, 45.99204f),
                    PathNode.CurveTo(75.020195f, 60.640266f, 85.46469f, 73.61201f, 100.0f, 75.71f),
                    PathNode.LineTo(100.0f, 93.08f),
                    PathNode.CurveTo(65.36544f, 99.327354f, 41.2205f, 130.96918f, 44.33836f, 166.02429f),
                    PathNode.CurveTo(47.456215f, 201.07939f, 76.806526f, 227.96326f, 112.0f, 228.0f),
                    PathNode.CurveTo(143.72f, 228.0f, 172.27f, 206.55f, 179.87f, 177.0f),
                    PathNode.CurveTo(180.3284f, 174.89943f, 179.04433f, 172.81224f, 176.96269f, 172.27435f),
                    PathNode.CurveTo(174.88107f, 171.73647f, 172.7466f, 172.9403f, 172.13f, 175.0f),
                    PathNode.CurveTo(165.42f, 201.08f, 140.13f, 220.0f, 112.0f, 220.0f),
                    PathNode.CurveTo(81.193855f, 220.00566f, 55.38904f, 196.68057f, 52.292805f, 166.03043f),
                    PathNode.CurveTo(49.19657f, 135.38028f, 69.81512f, 107.36557f, 100.0f, 101.21f),
                    PathNode.LineTo(100.0f, 136.0f),
                    PathNode.CurveTo(100.0f, 138.20914f, 101.79086f, 140.0f, 104.0f, 140.0f),
                    PathNode.LineTo(189.53f, 140.0f),
                    PathNode.LineTo(220.42f, 201.79f),
                    PathNode.CurveTo(221.09825f, 203.14543f, 222.48434f, 204.00108f, 224.0f, 204.0f),
                    PathNode.CurveTo(224.42865f, 203.99936f, 224.85431f, 203.92842f, 225.26f, 203.79f),
                    PathNode.LineTo(249.26f, 195.79f),
                    PathNode.CurveTo(250.26654f, 195.45456f, 251.09859f, 194.73299f, 251.57306f, 193.78403f),
                    PathNode.CurveTo(252.04755f, 192.83508f, 252.12558f, 191.7365f, 251.79f, 190.73f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 48.0f),
                    PathNode.CurveTo(84.0f, 36.954304f, 92.95431f, 28.0f, 104.0f, 28.0f),
                    PathNode.CurveTo(115.04569f, 28.0f, 124.0f, 36.954304f, 124.0f, 48.0f),
                    PathNode.CurveTo(124.0f, 59.045696f, 115.04569f, 68.0f, 104.0f, 68.0f),
                    PathNode.CurveTo(92.95431f, 68.0f, 84.0f, 59.045696f, 84.0f, 48.0f),
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
        return _wheelchair!!
    }

private var _wheelchair: ImageVector? = null
