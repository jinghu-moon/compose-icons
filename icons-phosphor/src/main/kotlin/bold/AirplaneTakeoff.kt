package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AirplaneTakeoff: ImageVector
    get() {
        if (_airplaneTakeoff != null) return _airplaneTakeoff!!
        _airplaneTakeoff = phosphorBoldIcon(
            name = "AirplaneTakeoff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(180.0f, 216.0f),
                    PathNode.CurveTo(180.0f, 222.62741f, 174.62741f, 228.0f, 168.0f, 228.0f),
                    PathNode.LineTo(24.0f, 228.0f),
                    PathNode.CurveTo(17.372583f, 228.0f, 12.0f, 222.62741f, 12.0f, 216.0f),
                    PathNode.CurveTo(12.0f, 209.37259f, 17.372583f, 204.0f, 24.0f, 204.0f),
                    PathNode.LineTo(168.0f, 204.0f),
                    PathNode.CurveTo(174.62741f, 204.0f, 180.0f, 209.37259f, 180.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(251.79f, 89.88f),
                    PathNode.CurveTo(251.15881f, 93.26397f, 249.10477f, 96.21393f, 246.15f, 97.98f),
                    PathNode.LineTo(98.75f, 186.0f),
                    PathNode.LineTo(98.62f, 186.07f),
                    PathNode.CurveTo(81.8363f, 195.92403f, 60.560623f, 193.50299f, 46.42f, 180.13f),
                    PathNode.LineTo(46.23f, 179.95f),
                    PathNode.LineTo(10.23f, 144.7f),
                    PathNode.CurveTo(5.415117f, 140.11212f, 3.1958f, 133.43094f, 4.308672f, 126.874016f),
                    PathNode.CurveTo(5.421544f, 120.3171f, 9.721004f, 114.74231f, 15.78f, 112.0f),
                    PathNode.LineTo(18.72f, 110.56f),
                    PathNode.CurveTo(21.56318f, 109.168106f, 24.841179f, 108.95604f, 27.84f, 109.97f),
                    PathNode.LineTo(54.34f, 118.91f),
                    PathNode.LineTo(68.49f, 110.35f),
                    PathNode.LineTo(50.42f, 92.78f),
                    PathNode.CurveTo(45.45366f, 88.17972f, 43.15149f, 81.37942f, 44.302025f, 74.70833f),
                    PathNode.CurveTo(45.45256f, 68.03725f, 49.89962f, 62.400955f, 56.12f, 59.73f),
                    PathNode.LineTo(56.6f, 59.53f),
                    PathNode.LineTo(63.75f, 56.83f),
                    PathNode.CurveTo(66.45856f, 55.817997f, 69.441444f, 55.817997f, 72.15f, 56.83f),
                    PathNode.LineTo(124.29f, 76.0f),
                    PathNode.LineTo(174.22f, 46.2f),
                    PathNode.CurveTo(192.90337f, 35.0576f, 216.93321f, 39.315945f, 230.65f, 56.2f),
                    PathNode.CurveTo(230.71213f, 56.26894f, 230.76897f, 56.342484f, 230.82f, 56.42f),
                    PathNode.LineTo(249.46f, 80.3f),
                    PathNode.CurveTo(251.58038f, 83.00861f, 252.42957f, 86.50012f, 251.79f, 89.88f),
                    PathNode.Close,
                    PathNode.MoveTo(222.18f, 84.34f),
                    PathNode.LineTo(212.0f, 71.29f),
                    PathNode.CurveTo(205.76376f, 63.690014f, 194.91058f, 61.786243f, 186.46f, 66.81f),
                    PathNode.LineTo(131.69f, 99.51f),
                    PathNode.CurveTo(128.58418f, 101.38267f, 124.79804f, 101.75025f, 121.39f, 100.51f),
                    PathNode.LineTo(75.39f, 83.57f),
                    PathNode.LineTo(96.39f, 103.97f),
                    PathNode.CurveTo(99.055046f, 106.560684f, 100.36921f, 110.240074f, 99.948456f, 113.93292f),
                    PathNode.CurveTo(99.5277f, 117.62577f, 97.419525f, 120.91522f, 94.24f, 122.84f),
                    PathNode.LineTo(62.0f, 142.29f),
                    PathNode.CurveTo(58.98869f, 144.10368f, 55.33355f, 144.50575f, 52.0f, 143.39f),
                    PathNode.LineTo(38.65f, 138.89f),
                    PathNode.LineTo(62.96f, 162.69f),
                    PathNode.CurveTo(69.37829f, 168.68805f, 78.9713f, 169.76523f, 86.56f, 165.34f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _airplaneTakeoff!!
    }

private var _airplaneTakeoff: ImageVector? = null
