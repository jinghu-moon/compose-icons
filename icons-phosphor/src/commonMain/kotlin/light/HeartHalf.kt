package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HeartHalf: ImageVector
    get() {
        if (_heartHalf != null) return _heartHalf!!
        _heartHalf = phosphorLightIcon(
            name = "HeartHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(169.1f, 54.82f),
                    PathNode.CurveTo(172.364f, 54.212486f, 174.51752f, 51.074f, 173.91f, 47.81f),
                    PathNode.CurveTo(173.30249f, 44.545998f, 170.164f, 42.392487f, 166.9f, 43.0f),
                    PathNode.CurveTo(150.3f, 46.13f, 136.65f, 54.82f, 128.0f, 67.4f),
                    PathNode.CurveTo(117.3f, 51.5f, 99.0f, 42.0f, 78.0f, 42.0f),
                    PathNode.CurveTo(44.878906f, 42.038574f, 18.038574f, 68.87891f, 18.0f, 102.0f),
                    PathNode.CurveTo(18.0f, 131.2f, 36.2f, 161.59f, 72.1f, 192.31f),
                    PathNode.CurveTo(88.55049f, 206.32764f, 106.32014f, 218.71884f, 125.16f, 229.31f),
                    PathNode.CurveTo(126.93018f, 230.27574f, 129.06981f, 230.27574f, 130.84f, 229.31f),
                    PathNode.LineTo(130.84f, 229.31f),
                    PathNode.CurveTo(145.09732f, 221.33461f, 158.74164f, 212.30971f, 171.66f, 202.31f),
                    PathNode.CurveTo(174.28612f, 200.28864f, 174.77637f, 196.52112f, 172.755f, 193.895f),
                    PathNode.CurveTo(170.73364f, 191.26889f, 166.96611f, 190.77864f, 164.34f, 192.8f),
                    PathNode.CurveTo(154.60631f, 200.25914f, 144.47835f, 207.18915f, 134.0f, 213.56f),
                    PathNode.LineTo(134.0f, 81.28f),
                    PathNode.CurveTo(140.0f, 67.5f, 152.76f, 57.88f, 169.1f, 54.82f),
                    PathNode.Close,
                    PathNode.MoveTo(122.0f, 213.54f),
                    PathNode.CurveTo(97.4f, 198.51f, 30.0f, 152.7f, 30.0f, 102.0f),
                    PathNode.CurveTo(30.02756f, 75.501755f, 51.501755f, 54.02756f, 78.0f, 54.0f),
                    PathNode.CurveTo(97.87f, 54.0f, 114.62f, 64.4f, 122.0f, 81.22f),
                    PathNode.Close,
                    PathNode.MoveTo(232.33f, 102.0f),
                    PathNode.CurveTo(232.10692f, 102.01498f, 231.88309f, 102.01498f, 231.66f, 102.0f),
                    PathNode.CurveTo(228.6069f, 101.99309f, 226.04584f, 99.69459f, 225.71f, 96.66f),
                    PathNode.CurveTo(224.14973f, 82.588486f, 216.44319f, 69.92849f, 204.66f, 62.08f),
                    PathNode.CurveTo(201.89857f, 60.23537f, 201.15536f, 56.501423f, 203.0f, 53.74f),
                    PathNode.CurveTo(204.84464f, 50.978577f, 208.57858f, 50.23537f, 211.34f, 52.08f),
                    PathNode.CurveTo(226.06296f, 61.89516f, 235.68803f, 77.722176f, 237.63f, 95.31f),
                    PathNode.CurveTo(237.82402f, 96.90174f, 237.37282f, 98.504906f, 236.37708f, 99.761795f),
                    PathNode.CurveTo(235.38133f, 101.018684f, 233.9239f, 101.82471f, 232.33f, 102.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.67f, 138.72f),
                    PathNode.CurveTo(223.09f, 149.92f, 214.92f, 161.37f, 204.41f, 172.72f),
                    PathNode.CurveTo(202.15944f, 175.15558f, 198.36058f, 175.30556f, 195.925f, 173.055f),
                    PathNode.CurveTo(193.48943f, 170.80444f, 193.33945f, 167.00557f, 195.59f, 164.57f),
                    PathNode.CurveTo(205.34f, 154.03f, 212.86f, 143.52f, 217.94f, 133.33f),
                    PathNode.CurveTo(218.85675f, 131.3435f, 220.78209f, 130.01349f, 222.96445f, 129.8591f),
                    PathNode.CurveTo(225.14682f, 129.70471f, 227.24022f, 130.75043f, 228.4275f, 132.58807f),
                    PathNode.CurveTo(229.61478f, 134.42574f, 229.7077f, 136.76393f, 228.67f, 138.69f),
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
        return _heartHalf!!
    }

private var _heartHalf: ImageVector? = null
