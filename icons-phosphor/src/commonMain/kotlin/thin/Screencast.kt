package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Screencast: ImageVector
    get() {
        if (_screencast != null) return _screencast!!
        _screencast = phosphorThinIcon(
            name = "Screencast",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 56.0f),
                    PathNode.LineTo(228.0f, 200.0f),
                    PathNode.CurveTo(228.0f, 206.62741f, 222.62741f, 212.0f, 216.0f, 212.0f),
                    PathNode.LineTo(144.0f, 212.0f),
                    PathNode.CurveTo(141.79086f, 212.0f, 140.0f, 210.20914f, 140.0f, 208.0f),
                    PathNode.CurveTo(140.0f, 205.79086f, 141.79086f, 204.0f, 144.0f, 204.0f),
                    PathNode.LineTo(216.0f, 204.0f),
                    PathNode.CurveTo(218.20914f, 204.0f, 220.0f, 202.20914f, 220.0f, 200.0f),
                    PathNode.LineTo(220.0f, 56.0f),
                    PathNode.CurveTo(220.0f, 53.79086f, 218.20914f, 52.0f, 216.0f, 52.0f),
                    PathNode.LineTo(40.0f, 52.0f),
                    PathNode.CurveTo(37.79086f, 52.0f, 36.0f, 53.79086f, 36.0f, 56.0f),
                    PathNode.LineTo(36.0f, 96.0f),
                    PathNode.CurveTo(36.0f, 98.20914f, 34.20914f, 100.0f, 32.0f, 100.0f),
                    PathNode.CurveTo(29.790861f, 100.0f, 28.0f, 98.20914f, 28.0f, 96.0f),
                    PathNode.LineTo(28.0f, 56.0f),
                    PathNode.CurveTo(28.0f, 49.37258f, 33.37258f, 44.0f, 40.0f, 44.0f),
                    PathNode.LineTo(216.0f, 44.0f),
                    PathNode.CurveTo(222.62741f, 44.0f, 228.0f, 49.37258f, 228.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 188.0f),
                    PathNode.CurveTo(29.790861f, 188.0f, 28.0f, 189.79086f, 28.0f, 192.0f),
                    PathNode.CurveTo(28.0f, 194.20914f, 29.790861f, 196.0f, 32.0f, 196.0f),
                    PathNode.CurveTo(38.62742f, 196.0f, 44.0f, 201.37259f, 44.0f, 208.0f),
                    PathNode.CurveTo(44.0f, 210.20914f, 45.79086f, 212.0f, 48.0f, 212.0f),
                    PathNode.CurveTo(50.20914f, 212.0f, 52.0f, 210.20914f, 52.0f, 208.0f),
                    PathNode.CurveTo(52.0f, 196.9543f, 43.045696f, 188.0f, 32.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 156.0f),
                    PathNode.CurveTo(29.790861f, 156.0f, 28.0f, 157.79086f, 28.0f, 160.0f),
                    PathNode.CurveTo(28.0f, 162.20914f, 29.790861f, 164.0f, 32.0f, 164.0f),
                    PathNode.CurveTo(56.28911f, 164.02756f, 75.97244f, 183.71089f, 76.0f, 208.0f),
                    PathNode.CurveTo(76.0f, 210.20914f, 77.79086f, 212.0f, 80.0f, 212.0f),
                    PathNode.CurveTo(82.20914f, 212.0f, 84.0f, 210.20914f, 84.0f, 208.0f),
                    PathNode.CurveTo(83.966934f, 179.2949f, 60.7051f, 156.03307f, 32.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 124.0f),
                    PathNode.CurveTo(29.790861f, 124.0f, 28.0f, 125.79086f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 130.20914f, 29.790861f, 132.0f, 32.0f, 132.0f),
                    PathNode.CurveTo(73.95536f, 132.0441f, 107.95591f, 166.04462f, 108.0f, 208.0f),
                    PathNode.CurveTo(108.0f, 210.20914f, 109.79086f, 212.0f, 112.0f, 212.0f),
                    PathNode.CurveTo(114.20914f, 212.0f, 116.0f, 210.20914f, 116.0f, 208.0f),
                    PathNode.CurveTo(115.95039f, 161.62865f, 78.37135f, 124.04961f, 32.0f, 124.0f),
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
        return _screencast!!
    }

private var _screencast: ImageVector? = null
