package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TerminalWindow: ImageVector
    get() {
        if (_terminalWindow != null) return _terminalWindow!!
        _terminalWindow = phosphorThinIcon(
            name = "TerminalWindow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(122.5f, 124.88f),
                    PathNode.CurveTo(123.44628f, 125.63919f, 123.99688f, 126.786804f, 123.99688f, 128.0f),
                    PathNode.CurveTo(123.99688f, 129.21318f, 123.44628f, 130.36081f, 122.5f, 131.12f),
                    PathNode.LineTo(82.5f, 163.12f),
                    PathNode.CurveTo(80.77261f, 164.41768f, 78.32693f, 164.10915f, 76.975945f, 162.42313f),
                    PathNode.CurveTo(75.62497f, 160.73709f, 75.85699f, 158.28296f, 77.5f, 156.88f),
                    PathNode.LineTo(113.6f, 128.0f),
                    PathNode.LineTo(77.5f, 99.12f),
                    PathNode.CurveTo(75.85699f, 97.71703f, 75.62497f, 95.2629f, 76.975945f, 93.57688f),
                    PathNode.CurveTo(78.32693f, 91.89086f, 80.77261f, 91.58233f, 82.5f, 92.88f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 156.0f),
                    PathNode.LineTo(136.0f, 156.0f),
                    PathNode.CurveTo(133.79086f, 156.0f, 132.0f, 157.79086f, 132.0f, 160.0f),
                    PathNode.CurveTo(132.0f, 162.20914f, 133.79086f, 164.0f, 136.0f, 164.0f),
                    PathNode.LineTo(176.0f, 164.0f),
                    PathNode.CurveTo(178.20914f, 164.0f, 180.0f, 162.20914f, 180.0f, 160.0f),
                    PathNode.CurveTo(180.0f, 157.79086f, 178.20914f, 156.0f, 176.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 56.0f),
                    PathNode.LineTo(228.0f, 200.0f),
                    PathNode.CurveTo(228.0f, 206.62741f, 222.62741f, 212.0f, 216.0f, 212.0f),
                    PathNode.LineTo(40.0f, 212.0f),
                    PathNode.CurveTo(33.37258f, 212.0f, 28.0f, 206.62741f, 28.0f, 200.0f),
                    PathNode.LineTo(28.0f, 56.0f),
                    PathNode.CurveTo(28.0f, 49.37258f, 33.37258f, 44.0f, 40.0f, 44.0f),
                    PathNode.LineTo(216.0f, 44.0f),
                    PathNode.CurveTo(222.62741f, 44.0f, 228.0f, 49.37258f, 228.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 56.0f),
                    PathNode.CurveTo(220.0f, 53.79086f, 218.20914f, 52.0f, 216.0f, 52.0f),
                    PathNode.LineTo(40.0f, 52.0f),
                    PathNode.CurveTo(37.79086f, 52.0f, 36.0f, 53.79086f, 36.0f, 56.0f),
                    PathNode.LineTo(36.0f, 200.0f),
                    PathNode.CurveTo(36.0f, 202.20914f, 37.79086f, 204.0f, 40.0f, 204.0f),
                    PathNode.LineTo(216.0f, 204.0f),
                    PathNode.CurveTo(218.20914f, 204.0f, 220.0f, 202.20914f, 220.0f, 200.0f),
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
        return _terminalWindow!!
    }

private var _terminalWindow: ImageVector? = null
