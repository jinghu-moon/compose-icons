package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Trash: ImageVector
    get() {
        if (_trash != null) return _trash!!
        _trash = phosphorThinIcon(
            name = "Trash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 52.0f),
                    PathNode.LineTo(172.0f, 52.0f),
                    PathNode.LineTo(172.0f, 40.0f),
                    PathNode.CurveTo(172.0f, 28.954306f, 163.0457f, 20.0f, 152.0f, 20.0f),
                    PathNode.LineTo(104.0f, 20.0f),
                    PathNode.CurveTo(92.95431f, 20.0f, 84.0f, 28.954306f, 84.0f, 40.0f),
                    PathNode.LineTo(84.0f, 52.0f),
                    PathNode.LineTo(40.0f, 52.0f),
                    PathNode.CurveTo(37.79086f, 52.0f, 36.0f, 53.79086f, 36.0f, 56.0f),
                    PathNode.CurveTo(36.0f, 58.20914f, 37.79086f, 60.0f, 40.0f, 60.0f),
                    PathNode.LineTo(52.0f, 60.0f),
                    PathNode.LineTo(52.0f, 208.0f),
                    PathNode.CurveTo(52.0f, 214.62741f, 57.37258f, 220.0f, 64.0f, 220.0f),
                    PathNode.LineTo(192.0f, 220.0f),
                    PathNode.CurveTo(198.62741f, 220.0f, 204.0f, 214.62741f, 204.0f, 208.0f),
                    PathNode.LineTo(204.0f, 60.0f),
                    PathNode.LineTo(216.0f, 60.0f),
                    PathNode.CurveTo(218.20914f, 60.0f, 220.0f, 58.20914f, 220.0f, 56.0f),
                    PathNode.CurveTo(220.0f, 53.79086f, 218.20914f, 52.0f, 216.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 40.0f),
                    PathNode.CurveTo(92.0f, 33.37258f, 97.37258f, 28.0f, 104.0f, 28.0f),
                    PathNode.LineTo(152.0f, 28.0f),
                    PathNode.CurveTo(158.62741f, 28.0f, 164.0f, 33.37258f, 164.0f, 40.0f),
                    PathNode.LineTo(164.0f, 52.0f),
                    PathNode.LineTo(92.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 208.0f),
                    PathNode.CurveTo(196.0f, 210.20914f, 194.20914f, 212.0f, 192.0f, 212.0f),
                    PathNode.LineTo(64.0f, 212.0f),
                    PathNode.CurveTo(61.79086f, 212.0f, 60.0f, 210.20914f, 60.0f, 208.0f),
                    PathNode.LineTo(60.0f, 60.0f),
                    PathNode.LineTo(196.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 104.0f),
                    PathNode.LineTo(108.0f, 168.0f),
                    PathNode.CurveTo(108.0f, 170.20914f, 106.20914f, 172.0f, 104.0f, 172.0f),
                    PathNode.CurveTo(101.79086f, 172.0f, 100.0f, 170.20914f, 100.0f, 168.0f),
                    PathNode.LineTo(100.0f, 104.0f),
                    PathNode.CurveTo(100.0f, 101.79086f, 101.79086f, 100.0f, 104.0f, 100.0f),
                    PathNode.CurveTo(106.20914f, 100.0f, 108.0f, 101.79086f, 108.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 104.0f),
                    PathNode.LineTo(156.0f, 168.0f),
                    PathNode.CurveTo(156.0f, 170.20914f, 154.20914f, 172.0f, 152.0f, 172.0f),
                    PathNode.CurveTo(149.79086f, 172.0f, 148.0f, 170.20914f, 148.0f, 168.0f),
                    PathNode.LineTo(148.0f, 104.0f),
                    PathNode.CurveTo(148.0f, 101.79086f, 149.79086f, 100.0f, 152.0f, 100.0f),
                    PathNode.CurveTo(154.20914f, 100.0f, 156.0f, 101.79086f, 156.0f, 104.0f),
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
        return _trash!!
    }

private var _trash: ImageVector? = null
