package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TeaBag: ImageVector
    get() {
        if (_teaBag != null) return _teaBag!!
        _teaBag = phosphorThinIcon(
            name = "TeaBag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 164.0f),
                    PathNode.CurveTo(212.9543f, 164.0f, 204.0f, 155.0457f, 204.0f, 144.0f),
                    PathNode.LineTo(204.0f, 64.0f),
                    PathNode.CurveTo(204.0f, 35.281193f, 180.71881f, 12.0f, 152.0f, 12.0f),
                    PathNode.CurveTo(123.2812f, 12.0f, 100.0f, 35.281193f, 100.0f, 64.0f),
                    PathNode.LineTo(100.0f, 76.0f),
                    PathNode.LineTo(76.53f, 76.0f),
                    PathNode.CurveTo(72.317154f, 76.012665f, 68.416275f, 78.22278f, 66.24f, 81.83f),
                    PathNode.LineTo(45.71f, 116.0f),
                    PathNode.CurveTo(44.582966f, 117.878395f, 43.991596f, 120.02945f, 44.0f, 122.22f),
                    PathNode.LineTo(44.0f, 216.0f),
                    PathNode.CurveTo(44.0f, 222.62741f, 49.37258f, 228.0f, 56.0f, 228.0f),
                    PathNode.LineTo(152.0f, 228.0f),
                    PathNode.CurveTo(158.62741f, 228.0f, 164.0f, 222.62741f, 164.0f, 216.0f),
                    PathNode.LineTo(164.0f, 122.22f),
                    PathNode.CurveTo(164.00113f, 120.04303f, 163.41002f, 117.90675f, 162.29f, 116.04f),
                    PathNode.LineTo(141.76f, 81.83f),
                    PathNode.CurveTo(139.58372f, 78.22278f, 135.68285f, 76.012665f, 131.47f, 76.0f),
                    PathNode.LineTo(108.0f, 76.0f),
                    PathNode.LineTo(108.0f, 64.0f),
                    PathNode.CurveTo(108.0f, 39.69947f, 127.69947f, 20.0f, 152.0f, 20.0f),
                    PathNode.CurveTo(176.30052f, 20.0f, 196.0f, 39.69947f, 196.0f, 64.0f),
                    PathNode.LineTo(196.0f, 144.0f),
                    PathNode.CurveTo(196.0f, 159.46397f, 208.53603f, 172.0f, 224.0f, 172.0f),
                    PathNode.CurveTo(226.20914f, 172.0f, 228.0f, 170.20914f, 228.0f, 168.0f),
                    PathNode.CurveTo(228.0f, 165.79086f, 226.20914f, 164.0f, 224.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(131.47f, 84.0f),
                    PathNode.CurveTo(132.87465f, 83.999565f, 134.1766f, 84.73595f, 134.9f, 85.94f),
                    PathNode.LineTo(155.43f, 120.16f),
                    PathNode.CurveTo(155.80334f, 120.78225f, 156.00038f, 121.49434f, 156.0f, 122.22f),
                    PathNode.LineTo(156.0f, 216.0f),
                    PathNode.CurveTo(156.0f, 218.20914f, 154.20914f, 220.0f, 152.0f, 220.0f),
                    PathNode.LineTo(56.0f, 220.0f),
                    PathNode.CurveTo(53.79086f, 220.0f, 52.0f, 218.20914f, 52.0f, 216.0f),
                    PathNode.LineTo(52.0f, 122.22f),
                    PathNode.CurveTo(51.999626f, 121.49434f, 52.19666f, 120.78225f, 52.57f, 120.16f),
                    PathNode.LineTo(73.1f, 85.94f),
                    PathNode.CurveTo(73.823395f, 84.73595f, 75.12534f, 83.999565f, 76.53f, 84.0f),
                    PathNode.LineTo(100.0f, 84.0f),
                    PathNode.LineTo(100.0f, 136.0f),
                    PathNode.CurveTo(100.0f, 138.20914f, 101.79086f, 140.0f, 104.0f, 140.0f),
                    PathNode.CurveTo(106.20914f, 140.0f, 108.0f, 138.20914f, 108.0f, 136.0f),
                    PathNode.LineTo(108.0f, 84.0f),
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
        return _teaBag!!
    }

private var _teaBag: ImageVector? = null
