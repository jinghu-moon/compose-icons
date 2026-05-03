package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Backpack: ImageVector
    get() {
        if (_backpack != null) return _backpack!!
        _backpack = phosphorThinIcon(
            name = "Backpack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(164.0f, 44.17f),
                    PathNode.LineTo(164.0f, 32.0f),
                    PathNode.CurveTo(164.0f, 20.954306f, 155.0457f, 12.0f, 144.0f, 12.0f),
                    PathNode.LineTo(112.0f, 12.0f),
                    PathNode.CurveTo(100.95431f, 12.0f, 92.0f, 20.954306f, 92.0f, 32.0f),
                    PathNode.LineTo(92.0f, 44.17f),
                    PathNode.CurveTo(64.93054f, 46.282654f, 44.032444f, 68.84824f, 44.0f, 96.0f),
                    PathNode.LineTo(44.0f, 216.0f),
                    PathNode.CurveTo(44.0f, 222.62741f, 49.37258f, 228.0f, 56.0f, 228.0f),
                    PathNode.LineTo(200.0f, 228.0f),
                    PathNode.CurveTo(206.62741f, 228.0f, 212.0f, 222.62741f, 212.0f, 216.0f),
                    PathNode.LineTo(212.0f, 96.0f),
                    PathNode.CurveTo(211.96754f, 68.84824f, 191.06946f, 46.282654f, 164.0f, 44.17f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 20.0f),
                    PathNode.LineTo(144.0f, 20.0f),
                    PathNode.CurveTo(150.62741f, 20.0f, 156.0f, 25.372583f, 156.0f, 32.0f),
                    PathNode.LineTo(156.0f, 44.0f),
                    PathNode.LineTo(100.0f, 44.0f),
                    PathNode.LineTo(100.0f, 32.0f),
                    PathNode.CurveTo(100.0f, 25.372583f, 105.37258f, 20.0f, 112.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 164.0f),
                    PathNode.LineTo(84.0f, 164.0f),
                    PathNode.LineTo(84.0f, 152.0f),
                    PathNode.CurveTo(84.0f, 145.37259f, 89.37258f, 140.0f, 96.0f, 140.0f),
                    PathNode.LineTo(160.0f, 140.0f),
                    PathNode.CurveTo(166.62741f, 140.0f, 172.0f, 145.37259f, 172.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 172.0f),
                    PathNode.LineTo(140.0f, 172.0f),
                    PathNode.LineTo(140.0f, 184.0f),
                    PathNode.CurveTo(140.0f, 186.20914f, 141.79086f, 188.0f, 144.0f, 188.0f),
                    PathNode.CurveTo(146.20914f, 188.0f, 148.0f, 186.20914f, 148.0f, 184.0f),
                    PathNode.LineTo(148.0f, 172.0f),
                    PathNode.LineTo(172.0f, 172.0f),
                    PathNode.LineTo(172.0f, 220.0f),
                    PathNode.LineTo(84.0f, 220.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 216.0f),
                    PathNode.CurveTo(204.0f, 218.20914f, 202.20914f, 220.0f, 200.0f, 220.0f),
                    PathNode.LineTo(180.0f, 220.0f),
                    PathNode.LineTo(180.0f, 152.0f),
                    PathNode.CurveTo(180.0f, 140.9543f, 171.0457f, 132.0f, 160.0f, 132.0f),
                    PathNode.LineTo(96.0f, 132.0f),
                    PathNode.CurveTo(84.95431f, 132.0f, 76.0f, 140.9543f, 76.0f, 152.0f),
                    PathNode.LineTo(76.0f, 220.0f),
                    PathNode.LineTo(56.0f, 220.0f),
                    PathNode.CurveTo(53.79086f, 220.0f, 52.0f, 218.20914f, 52.0f, 216.0f),
                    PathNode.LineTo(52.0f, 96.0f),
                    PathNode.CurveTo(52.027554f, 71.71089f, 71.71089f, 52.027554f, 96.0f, 52.0f),
                    PathNode.LineTo(160.0f, 52.0f),
                    PathNode.CurveTo(184.28911f, 52.027554f, 203.97244f, 71.71089f, 204.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(148.0f, 88.0f),
                    PathNode.CurveTo(148.0f, 90.20914f, 146.20914f, 92.0f, 144.0f, 92.0f),
                    PathNode.LineTo(112.0f, 92.0f),
                    PathNode.CurveTo(109.79086f, 92.0f, 108.0f, 90.20914f, 108.0f, 88.0f),
                    PathNode.CurveTo(108.0f, 85.79086f, 109.79086f, 84.0f, 112.0f, 84.0f),
                    PathNode.LineTo(144.0f, 84.0f),
                    PathNode.CurveTo(146.20914f, 84.0f, 148.0f, 85.79086f, 148.0f, 88.0f),
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
        return _backpack!!
    }

private var _backpack: ImageVector? = null
