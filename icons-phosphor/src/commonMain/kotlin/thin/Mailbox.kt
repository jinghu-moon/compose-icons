package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Mailbox: ImageVector
    get() {
        if (_mailbox != null) return _mailbox!!
        _mailbox = phosphorThinIcon(
            name = "Mailbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(100.0f, 152.0f),
                    PathNode.CurveTo(100.0f, 154.20914f, 98.20914f, 156.0f, 96.0f, 156.0f),
                    PathNode.LineTo(56.0f, 156.0f),
                    PathNode.CurveTo(53.79086f, 156.0f, 52.0f, 154.20914f, 52.0f, 152.0f),
                    PathNode.CurveTo(52.0f, 149.79086f, 53.79086f, 148.0f, 56.0f, 148.0f),
                    PathNode.LineTo(96.0f, 148.0f),
                    PathNode.CurveTo(98.20914f, 148.0f, 100.0f, 149.79086f, 100.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 116.0f),
                    PathNode.LineTo(236.0f, 176.0f),
                    PathNode.CurveTo(236.0f, 182.62741f, 230.62741f, 188.0f, 224.0f, 188.0f),
                    PathNode.LineTo(132.0f, 188.0f),
                    PathNode.LineTo(132.0f, 224.0f),
                    PathNode.CurveTo(132.0f, 226.20914f, 130.20914f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(125.79086f, 228.0f, 124.0f, 226.20914f, 124.0f, 224.0f),
                    PathNode.LineTo(124.0f, 188.0f),
                    PathNode.LineTo(32.0f, 188.0f),
                    PathNode.CurveTo(25.372583f, 188.0f, 20.0f, 182.62741f, 20.0f, 176.0f),
                    PathNode.LineTo(20.0f, 116.0f),
                    PathNode.CurveTo(20.03307f, 85.08576f, 45.085766f, 60.03307f, 76.0f, 60.0f),
                    PathNode.LineTo(156.0f, 60.0f),
                    PathNode.LineTo(156.0f, 24.0f),
                    PathNode.CurveTo(156.0f, 21.790861f, 157.79086f, 20.0f, 160.0f, 20.0f),
                    PathNode.LineTo(192.0f, 20.0f),
                    PathNode.CurveTo(194.20914f, 20.0f, 196.0f, 21.790861f, 196.0f, 24.0f),
                    PathNode.CurveTo(196.0f, 26.209139f, 194.20914f, 28.0f, 192.0f, 28.0f),
                    PathNode.LineTo(164.0f, 28.0f),
                    PathNode.LineTo(164.0f, 60.0f),
                    PathNode.LineTo(180.0f, 60.0f),
                    PathNode.CurveTo(210.91423f, 60.03307f, 235.96693f, 85.08576f, 236.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(124.0f, 180.0f),
                    PathNode.LineTo(124.0f, 116.0f),
                    PathNode.CurveTo(124.0f, 89.49033f, 102.50967f, 68.0f, 76.0f, 68.0f),
                    PathNode.CurveTo(49.490334f, 68.0f, 28.0f, 89.49033f, 28.0f, 116.0f),
                    PathNode.LineTo(28.0f, 176.0f),
                    PathNode.CurveTo(28.0f, 178.20914f, 29.790861f, 180.0f, 32.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 116.0f),
                    PathNode.CurveTo(227.97244f, 89.501755f, 206.49825f, 68.02756f, 180.0f, 68.0f),
                    PathNode.LineTo(164.0f, 68.0f),
                    PathNode.LineTo(164.0f, 144.0f),
                    PathNode.CurveTo(164.0f, 146.20914f, 162.20914f, 148.0f, 160.0f, 148.0f),
                    PathNode.CurveTo(157.79086f, 148.0f, 156.0f, 146.20914f, 156.0f, 144.0f),
                    PathNode.LineTo(156.0f, 68.0f),
                    PathNode.LineTo(104.82f, 68.0f),
                    PathNode.CurveTo(121.67835f, 78.11894f, 131.99486f, 96.33793f, 132.0f, 116.0f),
                    PathNode.LineTo(132.0f, 180.0f),
                    PathNode.LineTo(224.0f, 180.0f),
                    PathNode.CurveTo(226.20914f, 180.0f, 228.0f, 178.20914f, 228.0f, 176.0f),
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
        return _mailbox!!
    }

private var _mailbox: ImageVector? = null
