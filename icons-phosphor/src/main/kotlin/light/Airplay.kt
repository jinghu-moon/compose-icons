package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Airplay: ImageVector
    get() {
        if (_airplay != null) return _airplay!!
        _airplay = phosphorLightIcon(
            name = "Airplay",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(132.56f, 156.1f),
                    PathNode.CurveTo(131.4201f, 154.77051f, 129.75626f, 154.00537f, 128.005f, 154.00537f),
                    PathNode.CurveTo(126.25374f, 154.00537f, 124.58989f, 154.77051f, 123.45f, 156.1f),
                    PathNode.LineTo(75.45f, 212.1f),
                    PathNode.CurveTo(73.928795f, 213.87848f, 73.5805f, 216.37915f, 74.55782f, 218.50563f),
                    PathNode.CurveTo(75.53514f, 220.6321f, 77.65969f, 221.99626f, 80.0f, 222.0f),
                    PathNode.LineTo(176.0f, 222.0f),
                    PathNode.CurveTo(178.34212f, 222.00015f, 180.47023f, 220.63747f, 181.45009f, 218.51016f),
                    PathNode.CurveTo(182.42993f, 216.38286f, 182.08238f, 213.87985f, 180.56f, 212.1f),
                    PathNode.Close,
                    PathNode.MoveTo(93.05f, 210.0f),
                    PathNode.LineTo(128.05f, 169.22f),
                    PathNode.LineTo(163.0f, 210.0f),
                    PathNode.Close,
                    PathNode.MoveTo(230.0f, 64.0f),
                    PathNode.LineTo(230.0f, 176.0f),
                    PathNode.CurveTo(230.0f, 188.15027f, 220.15027f, 198.0f, 208.0f, 198.0f),
                    PathNode.LineTo(200.0f, 198.0f),
                    PathNode.CurveTo(196.6863f, 198.0f, 194.0f, 195.3137f, 194.0f, 192.0f),
                    PathNode.CurveTo(194.0f, 188.6863f, 196.6863f, 186.0f, 200.0f, 186.0f),
                    PathNode.LineTo(208.0f, 186.0f),
                    PathNode.CurveTo(213.52284f, 186.0f, 218.0f, 181.52284f, 218.0f, 176.0f),
                    PathNode.LineTo(218.0f, 64.0f),
                    PathNode.CurveTo(218.0f, 58.477154f, 213.52284f, 54.0f, 208.0f, 54.0f),
                    PathNode.LineTo(48.0f, 54.0f),
                    PathNode.CurveTo(42.477154f, 54.0f, 38.0f, 58.477154f, 38.0f, 64.0f),
                    PathNode.LineTo(38.0f, 176.0f),
                    PathNode.CurveTo(38.0f, 181.52284f, 42.477154f, 186.0f, 48.0f, 186.0f),
                    PathNode.LineTo(56.0f, 186.0f),
                    PathNode.CurveTo(59.31371f, 186.0f, 62.0f, 188.6863f, 62.0f, 192.0f),
                    PathNode.CurveTo(62.0f, 195.3137f, 59.31371f, 198.0f, 56.0f, 198.0f),
                    PathNode.LineTo(48.0f, 198.0f),
                    PathNode.CurveTo(35.849735f, 198.0f, 26.0f, 188.15027f, 26.0f, 176.0f),
                    PathNode.LineTo(26.0f, 64.0f),
                    PathNode.CurveTo(26.0f, 51.849735f, 35.849735f, 42.0f, 48.0f, 42.0f),
                    PathNode.LineTo(208.0f, 42.0f),
                    PathNode.CurveTo(220.15027f, 42.0f, 230.0f, 51.849735f, 230.0f, 64.0f),
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
        return _airplay!!
    }

private var _airplay: ImageVector? = null
