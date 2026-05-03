package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Devices: ImageVector
    get() {
        if (_devices != null) return _devices!!
        _devices = phosphorThinIcon(
            name = "Devices",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 76.0f),
                    PathNode.LineTo(204.0f, 76.0f),
                    PathNode.LineTo(204.0f, 64.0f),
                    PathNode.CurveTo(204.0f, 52.954304f, 195.0457f, 44.0f, 184.0f, 44.0f),
                    PathNode.LineTo(40.0f, 44.0f),
                    PathNode.CurveTo(28.954306f, 44.0f, 20.0f, 52.954304f, 20.0f, 64.0f),
                    PathNode.LineTo(20.0f, 160.0f),
                    PathNode.CurveTo(20.0f, 171.0457f, 28.954306f, 180.0f, 40.0f, 180.0f),
                    PathNode.LineTo(156.0f, 180.0f),
                    PathNode.LineTo(156.0f, 192.0f),
                    PathNode.CurveTo(156.0f, 203.0457f, 164.9543f, 212.0f, 176.0f, 212.0f),
                    PathNode.LineTo(224.0f, 212.0f),
                    PathNode.CurveTo(235.0457f, 212.0f, 244.0f, 203.0457f, 244.0f, 192.0f),
                    PathNode.LineTo(244.0f, 96.0f),
                    PathNode.CurveTo(244.0f, 84.95431f, 235.0457f, 76.0f, 224.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 172.0f),
                    PathNode.CurveTo(33.37258f, 172.0f, 28.0f, 166.62741f, 28.0f, 160.0f),
                    PathNode.LineTo(28.0f, 64.0f),
                    PathNode.CurveTo(28.0f, 57.37258f, 33.37258f, 52.0f, 40.0f, 52.0f),
                    PathNode.LineTo(184.0f, 52.0f),
                    PathNode.CurveTo(190.62741f, 52.0f, 196.0f, 57.37258f, 196.0f, 64.0f),
                    PathNode.LineTo(196.0f, 76.0f),
                    PathNode.LineTo(176.0f, 76.0f),
                    PathNode.CurveTo(164.9543f, 76.0f, 156.0f, 84.95431f, 156.0f, 96.0f),
                    PathNode.LineTo(156.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 192.0f),
                    PathNode.CurveTo(236.0f, 198.62741f, 230.62741f, 204.0f, 224.0f, 204.0f),
                    PathNode.LineTo(176.0f, 204.0f),
                    PathNode.CurveTo(169.37259f, 204.0f, 164.0f, 198.62741f, 164.0f, 192.0f),
                    PathNode.LineTo(164.0f, 96.0f),
                    PathNode.CurveTo(164.0f, 89.37258f, 169.37259f, 84.0f, 176.0f, 84.0f),
                    PathNode.LineTo(224.0f, 84.0f),
                    PathNode.CurveTo(230.62741f, 84.0f, 236.0f, 89.37258f, 236.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 208.0f),
                    PathNode.CurveTo(132.0f, 210.20914f, 130.20914f, 212.0f, 128.0f, 212.0f),
                    PathNode.LineTo(88.0f, 212.0f),
                    PathNode.CurveTo(85.79086f, 212.0f, 84.0f, 210.20914f, 84.0f, 208.0f),
                    PathNode.CurveTo(84.0f, 205.79086f, 85.79086f, 204.0f, 88.0f, 204.0f),
                    PathNode.LineTo(128.0f, 204.0f),
                    PathNode.CurveTo(130.20914f, 204.0f, 132.0f, 205.79086f, 132.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 112.0f),
                    PathNode.CurveTo(212.0f, 114.20914f, 210.20914f, 116.0f, 208.0f, 116.0f),
                    PathNode.LineTo(192.0f, 116.0f),
                    PathNode.CurveTo(189.79086f, 116.0f, 188.0f, 114.20914f, 188.0f, 112.0f),
                    PathNode.CurveTo(188.0f, 109.79086f, 189.79086f, 108.0f, 192.0f, 108.0f),
                    PathNode.LineTo(208.0f, 108.0f),
                    PathNode.CurveTo(210.20914f, 108.0f, 212.0f, 109.79086f, 212.0f, 112.0f),
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
        return _devices!!
    }

private var _devices: ImageVector? = null
