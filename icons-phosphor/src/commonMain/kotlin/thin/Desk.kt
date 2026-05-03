package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Desk: ImageVector
    get() {
        if (_desk != null) return _desk!!
        _desk = phosphorThinIcon(
            name = "Desk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.0f, 68.0f),
                    PathNode.LineTo(8.0f, 68.0f),
                    PathNode.CurveTo(5.790861f, 68.0f, 4.0f, 69.79086f, 4.0f, 72.0f),
                    PathNode.CurveTo(4.0f, 74.20914f, 5.790861f, 76.0f, 8.0f, 76.0f),
                    PathNode.LineTo(20.0f, 76.0f),
                    PathNode.LineTo(20.0f, 192.0f),
                    PathNode.CurveTo(20.0f, 194.20914f, 21.790861f, 196.0f, 24.0f, 196.0f),
                    PathNode.CurveTo(26.209139f, 196.0f, 28.0f, 194.20914f, 28.0f, 192.0f),
                    PathNode.LineTo(28.0f, 140.0f),
                    PathNode.LineTo(228.0f, 140.0f),
                    PathNode.LineTo(228.0f, 192.0f),
                    PathNode.CurveTo(228.0f, 194.20914f, 229.79086f, 196.0f, 232.0f, 196.0f),
                    PathNode.CurveTo(234.20914f, 196.0f, 236.0f, 194.20914f, 236.0f, 192.0f),
                    PathNode.LineTo(236.0f, 76.0f),
                    PathNode.LineTo(248.0f, 76.0f),
                    PathNode.CurveTo(250.20914f, 76.0f, 252.0f, 74.20914f, 252.0f, 72.0f),
                    PathNode.CurveTo(252.0f, 69.79086f, 250.20914f, 68.0f, 248.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(28.0f, 76.0f),
                    PathNode.LineTo(124.0f, 76.0f),
                    PathNode.LineTo(124.0f, 132.0f),
                    PathNode.LineTo(28.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 132.0f),
                    PathNode.LineTo(132.0f, 132.0f),
                    PathNode.LineTo(132.0f, 76.0f),
                    PathNode.LineTo(228.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 104.0f),
                    PathNode.CurveTo(92.0f, 106.20914f, 90.20914f, 108.0f, 88.0f, 108.0f),
                    PathNode.LineTo(64.0f, 108.0f),
                    PathNode.CurveTo(61.79086f, 108.0f, 60.0f, 106.20914f, 60.0f, 104.0f),
                    PathNode.CurveTo(60.0f, 101.79086f, 61.79086f, 100.0f, 64.0f, 100.0f),
                    PathNode.LineTo(88.0f, 100.0f),
                    PathNode.CurveTo(90.20914f, 100.0f, 92.0f, 101.79086f, 92.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 104.0f),
                    PathNode.CurveTo(164.0f, 101.79086f, 165.79086f, 100.0f, 168.0f, 100.0f),
                    PathNode.LineTo(192.0f, 100.0f),
                    PathNode.CurveTo(194.20914f, 100.0f, 196.0f, 101.79086f, 196.0f, 104.0f),
                    PathNode.CurveTo(196.0f, 106.20914f, 194.20914f, 108.0f, 192.0f, 108.0f),
                    PathNode.LineTo(168.0f, 108.0f),
                    PathNode.CurveTo(165.79086f, 108.0f, 164.0f, 106.20914f, 164.0f, 104.0f),
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
        return _desk!!
    }

private var _desk: ImageVector? = null
