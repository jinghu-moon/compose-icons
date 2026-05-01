package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SelectionBackground: ImageVector
    get() {
        if (_selectionBackground != null) return _selectionBackground!!
        _selectionBackground = phosphorThinIcon(
            name = "SelectionBackground",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(160.0f, 84.0f),
                    PathNode.LineTo(48.0f, 84.0f),
                    PathNode.CurveTo(41.37258f, 84.0f, 36.0f, 89.37258f, 36.0f, 96.0f),
                    PathNode.LineTo(36.0f, 208.0f),
                    PathNode.CurveTo(36.0f, 214.62741f, 41.37258f, 220.0f, 48.0f, 220.0f),
                    PathNode.LineTo(160.0f, 220.0f),
                    PathNode.CurveTo(166.62741f, 220.0f, 172.0f, 214.62741f, 172.0f, 208.0f),
                    PathNode.LineTo(172.0f, 96.0f),
                    PathNode.CurveTo(172.0f, 89.37258f, 166.62741f, 84.0f, 160.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 208.0f),
                    PathNode.CurveTo(164.0f, 210.20914f, 162.20914f, 212.0f, 160.0f, 212.0f),
                    PathNode.LineTo(48.0f, 212.0f),
                    PathNode.CurveTo(45.79086f, 212.0f, 44.0f, 210.20914f, 44.0f, 208.0f),
                    PathNode.LineTo(44.0f, 96.0f),
                    PathNode.CurveTo(44.0f, 93.79086f, 45.79086f, 92.0f, 48.0f, 92.0f),
                    PathNode.LineTo(160.0f, 92.0f),
                    PathNode.CurveTo(162.20914f, 92.0f, 164.0f, 93.79086f, 164.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 40.0f),
                    PathNode.CurveTo(140.0f, 37.79086f, 141.79086f, 36.0f, 144.0f, 36.0f),
                    PathNode.LineTo(160.0f, 36.0f),
                    PathNode.CurveTo(162.20914f, 36.0f, 164.0f, 37.79086f, 164.0f, 40.0f),
                    PathNode.CurveTo(164.0f, 42.20914f, 162.20914f, 44.0f, 160.0f, 44.0f),
                    PathNode.LineTo(144.0f, 44.0f),
                    PathNode.CurveTo(141.79086f, 44.0f, 140.0f, 42.20914f, 140.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 48.0f),
                    PathNode.LineTo(220.0f, 56.0f),
                    PathNode.CurveTo(220.0f, 58.20914f, 218.20914f, 60.0f, 216.0f, 60.0f),
                    PathNode.CurveTo(213.79086f, 60.0f, 212.0f, 58.20914f, 212.0f, 56.0f),
                    PathNode.LineTo(212.0f, 48.0f),
                    PathNode.CurveTo(212.0f, 45.79086f, 210.20914f, 44.0f, 208.0f, 44.0f),
                    PathNode.LineTo(200.0f, 44.0f),
                    PathNode.CurveTo(197.79086f, 44.0f, 196.0f, 42.20914f, 196.0f, 40.0f),
                    PathNode.CurveTo(196.0f, 37.79086f, 197.79086f, 36.0f, 200.0f, 36.0f),
                    PathNode.LineTo(208.0f, 36.0f),
                    PathNode.CurveTo(214.62741f, 36.0f, 220.0f, 41.37258f, 220.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 96.0f),
                    PathNode.LineTo(220.0f, 112.0f),
                    PathNode.CurveTo(220.0f, 114.20914f, 218.20914f, 116.0f, 216.0f, 116.0f),
                    PathNode.CurveTo(213.79086f, 116.0f, 212.0f, 114.20914f, 212.0f, 112.0f),
                    PathNode.LineTo(212.0f, 96.0f),
                    PathNode.CurveTo(212.0f, 93.79086f, 213.79086f, 92.0f, 216.0f, 92.0f),
                    PathNode.CurveTo(218.20914f, 92.0f, 220.0f, 93.79086f, 220.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 152.0f),
                    PathNode.LineTo(220.0f, 160.0f),
                    PathNode.CurveTo(220.0f, 166.62741f, 214.62741f, 172.0f, 208.0f, 172.0f),
                    PathNode.LineTo(200.0f, 172.0f),
                    PathNode.CurveTo(197.79086f, 172.0f, 196.0f, 170.20914f, 196.0f, 168.0f),
                    PathNode.CurveTo(196.0f, 165.79086f, 197.79086f, 164.0f, 200.0f, 164.0f),
                    PathNode.LineTo(208.0f, 164.0f),
                    PathNode.CurveTo(210.20914f, 164.0f, 212.0f, 162.20914f, 212.0f, 160.0f),
                    PathNode.LineTo(212.0f, 152.0f),
                    PathNode.CurveTo(212.0f, 149.79086f, 213.79086f, 148.0f, 216.0f, 148.0f),
                    PathNode.CurveTo(218.20914f, 148.0f, 220.0f, 149.79086f, 220.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 56.0f),
                    PathNode.LineTo(84.0f, 48.0f),
                    PathNode.CurveTo(84.0f, 41.37258f, 89.37258f, 36.0f, 96.0f, 36.0f),
                    PathNode.LineTo(104.0f, 36.0f),
                    PathNode.CurveTo(106.20914f, 36.0f, 108.0f, 37.79086f, 108.0f, 40.0f),
                    PathNode.CurveTo(108.0f, 42.20914f, 106.20914f, 44.0f, 104.0f, 44.0f),
                    PathNode.LineTo(96.0f, 44.0f),
                    PathNode.CurveTo(93.79086f, 44.0f, 92.0f, 45.79086f, 92.0f, 48.0f),
                    PathNode.LineTo(92.0f, 56.0f),
                    PathNode.CurveTo(92.0f, 58.20914f, 90.20914f, 60.0f, 88.0f, 60.0f),
                    PathNode.CurveTo(85.79086f, 60.0f, 84.0f, 58.20914f, 84.0f, 56.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _selectionBackground!!
    }

private var _selectionBackground: ImageVector? = null
