package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LockKeyOpen: ImageVector
    get() {
        if (_lockKeyOpen != null) return _lockKeyOpen!!
        _lockKeyOpen = phosphorThinIcon(
            name = "LockKeyOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 84.0f),
                    PathNode.LineTo(92.0f, 84.0f),
                    PathNode.LineTo(92.0f, 56.0f),
                    PathNode.CurveTo(92.0f, 36.11775f, 108.11775f, 20.0f, 128.0f, 20.0f),
                    PathNode.CurveTo(145.24f, 20.0f, 160.75f, 32.38f, 164.08f, 48.8f),
                    PathNode.CurveTo(164.52184f, 50.964954f, 166.63504f, 52.361828f, 168.8f, 51.92f),
                    PathNode.CurveTo(170.96495f, 51.478172f, 172.36182f, 49.364956f, 171.92f, 47.2f),
                    PathNode.CurveTo(167.78f, 26.81f, 149.31f, 12.0f, 128.0f, 12.0f),
                    PathNode.CurveTo(103.71089f, 12.027555f, 84.02756f, 31.710894f, 84.0f, 56.0f),
                    PathNode.LineTo(84.0f, 84.0f),
                    PathNode.LineTo(48.0f, 84.0f),
                    PathNode.CurveTo(41.37258f, 84.0f, 36.0f, 89.37258f, 36.0f, 96.0f),
                    PathNode.LineTo(36.0f, 208.0f),
                    PathNode.CurveTo(36.0f, 214.62741f, 41.37258f, 220.0f, 48.0f, 220.0f),
                    PathNode.LineTo(208.0f, 220.0f),
                    PathNode.CurveTo(214.62741f, 220.0f, 220.0f, 214.62741f, 220.0f, 208.0f),
                    PathNode.LineTo(220.0f, 96.0f),
                    PathNode.CurveTo(220.0f, 89.37258f, 214.62741f, 84.0f, 208.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 208.0f),
                    PathNode.CurveTo(212.0f, 210.20914f, 210.20914f, 212.0f, 208.0f, 212.0f),
                    PathNode.LineTo(48.0f, 212.0f),
                    PathNode.CurveTo(45.79086f, 212.0f, 44.0f, 210.20914f, 44.0f, 208.0f),
                    PathNode.LineTo(44.0f, 96.0f),
                    PathNode.CurveTo(44.0f, 93.79086f, 45.79086f, 92.0f, 48.0f, 92.0f),
                    PathNode.LineTo(208.0f, 92.0f),
                    PathNode.CurveTo(210.20914f, 92.0f, 212.0f, 93.79086f, 212.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 116.0f),
                    PathNode.CurveTo(115.53307f, 116.01319f, 105.15213f, 125.56952f, 104.109474f, 137.99278f),
                    PathNode.CurveTo(103.06682f, 150.41603f, 111.70967f, 161.56898f, 124.0f, 163.66f),
                    PathNode.LineTo(124.0f, 184.0f),
                    PathNode.CurveTo(124.0f, 186.20914f, 125.79086f, 188.0f, 128.0f, 188.0f),
                    PathNode.CurveTo(130.20914f, 188.0f, 132.0f, 186.20914f, 132.0f, 184.0f),
                    PathNode.LineTo(132.0f, 163.66f),
                    PathNode.CurveTo(144.29033f, 161.56898f, 152.93318f, 150.41603f, 151.89053f, 137.99278f),
                    PathNode.CurveTo(150.84787f, 125.56952f, 140.46693f, 116.01319f, 128.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 156.0f),
                    PathNode.CurveTo(119.163445f, 156.0f, 112.0f, 148.83656f, 112.0f, 140.0f),
                    PathNode.CurveTo(112.0f, 131.16344f, 119.163445f, 124.0f, 128.0f, 124.0f),
                    PathNode.CurveTo(136.83656f, 124.0f, 144.0f, 131.16344f, 144.0f, 140.0f),
                    PathNode.CurveTo(144.0f, 148.83656f, 136.83656f, 156.0f, 128.0f, 156.0f),
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
        return _lockKeyOpen!!
    }

private var _lockKeyOpen: ImageVector? = null
