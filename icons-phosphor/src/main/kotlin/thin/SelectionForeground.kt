package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SelectionForeground: ImageVector
    get() {
        if (_selectionForeground != null) return _selectionForeground!!
        _selectionForeground = phosphorThinIcon(
            name = "SelectionForeground",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(60.0f, 216.0f),
                    PathNode.CurveTo(60.0f, 218.20914f, 58.20914f, 220.0f, 56.0f, 220.0f),
                    PathNode.LineTo(48.0f, 220.0f),
                    PathNode.CurveTo(41.37258f, 220.0f, 36.0f, 214.62741f, 36.0f, 208.0f),
                    PathNode.LineTo(36.0f, 200.0f),
                    PathNode.CurveTo(36.0f, 197.79086f, 37.79086f, 196.0f, 40.0f, 196.0f),
                    PathNode.CurveTo(42.20914f, 196.0f, 44.0f, 197.79086f, 44.0f, 200.0f),
                    PathNode.LineTo(44.0f, 208.0f),
                    PathNode.CurveTo(44.0f, 210.20914f, 45.79086f, 212.0f, 48.0f, 212.0f),
                    PathNode.LineTo(56.0f, 212.0f),
                    PathNode.CurveTo(58.20914f, 212.0f, 60.0f, 213.79086f, 60.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 212.0f),
                    PathNode.LineTo(96.0f, 212.0f),
                    PathNode.CurveTo(93.79086f, 212.0f, 92.0f, 213.79086f, 92.0f, 216.0f),
                    PathNode.CurveTo(92.0f, 218.20914f, 93.79086f, 220.0f, 96.0f, 220.0f),
                    PathNode.LineTo(112.0f, 220.0f),
                    PathNode.CurveTo(114.20914f, 220.0f, 116.0f, 218.20914f, 116.0f, 216.0f),
                    PathNode.CurveTo(116.0f, 213.79086f, 114.20914f, 212.0f, 112.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 164.0f),
                    PathNode.CurveTo(42.20914f, 164.0f, 44.0f, 162.20914f, 44.0f, 160.0f),
                    PathNode.LineTo(44.0f, 144.0f),
                    PathNode.CurveTo(44.0f, 141.79086f, 42.20914f, 140.0f, 40.0f, 140.0f),
                    PathNode.CurveTo(37.79086f, 140.0f, 36.0f, 141.79086f, 36.0f, 144.0f),
                    PathNode.LineTo(36.0f, 160.0f),
                    PathNode.CurveTo(36.0f, 162.20914f, 37.79086f, 164.0f, 40.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 196.0f),
                    PathNode.CurveTo(165.79086f, 196.0f, 164.0f, 197.79086f, 164.0f, 200.0f),
                    PathNode.LineTo(164.0f, 208.0f),
                    PathNode.CurveTo(164.0f, 210.20914f, 162.20914f, 212.0f, 160.0f, 212.0f),
                    PathNode.LineTo(152.0f, 212.0f),
                    PathNode.CurveTo(149.79086f, 212.0f, 148.0f, 213.79086f, 148.0f, 216.0f),
                    PathNode.CurveTo(148.0f, 218.20914f, 149.79086f, 220.0f, 152.0f, 220.0f),
                    PathNode.LineTo(160.0f, 220.0f),
                    PathNode.CurveTo(166.62741f, 220.0f, 172.0f, 214.62741f, 172.0f, 208.0f),
                    PathNode.LineTo(172.0f, 200.0f),
                    PathNode.CurveTo(172.0f, 197.79086f, 170.20914f, 196.0f, 168.0f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 108.0f),
                    PathNode.CurveTo(170.20914f, 108.0f, 172.0f, 106.20914f, 172.0f, 104.0f),
                    PathNode.LineTo(172.0f, 96.0f),
                    PathNode.CurveTo(172.0f, 89.37258f, 166.62741f, 84.0f, 160.0f, 84.0f),
                    PathNode.LineTo(152.0f, 84.0f),
                    PathNode.CurveTo(149.79086f, 84.0f, 148.0f, 85.79086f, 148.0f, 88.0f),
                    PathNode.CurveTo(148.0f, 90.20914f, 149.79086f, 92.0f, 152.0f, 92.0f),
                    PathNode.LineTo(160.0f, 92.0f),
                    PathNode.CurveTo(162.20914f, 92.0f, 164.0f, 93.79086f, 164.0f, 96.0f),
                    PathNode.LineTo(164.0f, 104.0f),
                    PathNode.CurveTo(164.0f, 106.20914f, 165.79086f, 108.0f, 168.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 84.0f),
                    PathNode.LineTo(48.0f, 84.0f),
                    PathNode.CurveTo(41.37258f, 84.0f, 36.0f, 89.37258f, 36.0f, 96.0f),
                    PathNode.LineTo(36.0f, 104.0f),
                    PathNode.CurveTo(36.0f, 106.20914f, 37.79086f, 108.0f, 40.0f, 108.0f),
                    PathNode.CurveTo(42.20914f, 108.0f, 44.0f, 106.20914f, 44.0f, 104.0f),
                    PathNode.LineTo(44.0f, 96.0f),
                    PathNode.CurveTo(44.0f, 93.79086f, 45.79086f, 92.0f, 48.0f, 92.0f),
                    PathNode.LineTo(56.0f, 92.0f),
                    PathNode.CurveTo(58.20914f, 92.0f, 60.0f, 90.20914f, 60.0f, 88.0f),
                    PathNode.CurveTo(60.0f, 85.79086f, 58.20914f, 84.0f, 56.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 36.0f),
                    PathNode.LineTo(96.0f, 36.0f),
                    PathNode.CurveTo(89.37258f, 36.0f, 84.0f, 41.37258f, 84.0f, 48.0f),
                    PathNode.LineTo(84.0f, 88.0f),
                    PathNode.LineTo(84.0f, 88.0f),
                    PathNode.CurveTo(84.0f, 90.20914f, 85.79086f, 92.0f, 88.0f, 92.0f),
                    PathNode.LineTo(112.0f, 92.0f),
                    PathNode.CurveTo(114.20914f, 92.0f, 116.0f, 90.20914f, 116.0f, 88.0f),
                    PathNode.CurveTo(116.0f, 85.79086f, 114.20914f, 84.0f, 112.0f, 84.0f),
                    PathNode.LineTo(92.0f, 84.0f),
                    PathNode.LineTo(92.0f, 48.0f),
                    PathNode.CurveTo(92.0f, 45.79086f, 93.79086f, 44.0f, 96.0f, 44.0f),
                    PathNode.LineTo(208.0f, 44.0f),
                    PathNode.CurveTo(210.20914f, 44.0f, 212.0f, 45.79086f, 212.0f, 48.0f),
                    PathNode.LineTo(212.0f, 160.0f),
                    PathNode.CurveTo(212.0f, 162.20914f, 210.20914f, 164.0f, 208.0f, 164.0f),
                    PathNode.LineTo(172.0f, 164.0f),
                    PathNode.LineTo(172.0f, 144.0f),
                    PathNode.CurveTo(172.0f, 141.79086f, 170.20914f, 140.0f, 168.0f, 140.0f),
                    PathNode.CurveTo(165.79086f, 140.0f, 164.0f, 141.79086f, 164.0f, 144.0f),
                    PathNode.LineTo(164.0f, 168.0f),
                    PathNode.CurveTo(164.01f, 170.01207f, 165.51306f, 171.70354f, 167.51f, 171.95f),
                    PathNode.CurveTo(167.67091f, 171.98521f, 167.8353f, 172.00198f, 168.0f, 172.0f),
                    PathNode.LineTo(208.0f, 172.0f),
                    PathNode.CurveTo(214.62741f, 172.0f, 220.0f, 166.62741f, 220.0f, 160.0f),
                    PathNode.LineTo(220.0f, 48.0f),
                    PathNode.CurveTo(220.0f, 41.37258f, 214.62741f, 36.0f, 208.0f, 36.0f),
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
        return _selectionForeground!!
    }

private var _selectionForeground: ImageVector? = null
