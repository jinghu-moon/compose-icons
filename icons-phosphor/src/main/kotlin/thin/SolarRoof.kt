package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SolarRoof: ImageVector
    get() {
        if (_solarRoof != null) return _solarRoof!!
        _solarRoof = phosphorThinIcon(
            name = "SolarRoof",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(243.58f, 126.21f),
                    PathNode.LineTo(203.58f, 46.21f),
                    PathNode.CurveTo(202.90175f, 44.854572f, 201.51566f, 43.998917f, 200.0f, 44.0f),
                    PathNode.LineTo(56.0f, 44.0f),
                    PathNode.CurveTo(54.48434f, 43.998917f, 53.098255f, 44.854572f, 52.42f, 46.21f),
                    PathNode.LineTo(12.42f, 126.21f),
                    PathNode.CurveTo(12.142909f, 126.76596f, 11.99911f, 127.378815f, 12.0f, 128.0f),
                    PathNode.LineTo(12.0f, 184.0f),
                    PathNode.CurveTo(12.0f, 190.62741f, 17.372583f, 196.0f, 24.0f, 196.0f),
                    PathNode.LineTo(232.0f, 196.0f),
                    PathNode.CurveTo(238.62741f, 196.0f, 244.0f, 190.62741f, 244.0f, 184.0f),
                    PathNode.LineTo(244.0f, 128.0f),
                    PathNode.CurveTo(244.00089f, 127.378815f, 243.85709f, 126.76596f, 243.58f, 126.21f),
                    PathNode.Close,
                    PathNode.MoveTo(98.47f, 124.0f),
                    PathNode.LineTo(82.47f, 92.0f),
                    PathNode.LineTo(121.53f, 92.0f),
                    PathNode.LineTo(137.53f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(101.53f, 52.0f),
                    PathNode.LineTo(117.53f, 84.0f),
                    PathNode.LineTo(78.47f, 84.0f),
                    PathNode.LineTo(62.47f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(149.53f, 52.0f),
                    PathNode.LineTo(165.53f, 84.0f),
                    PathNode.LineTo(126.47f, 84.0f),
                    PathNode.LineTo(110.47f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(146.47f, 124.0f),
                    PathNode.LineTo(130.47f, 92.0f),
                    PathNode.LineTo(169.53f, 92.0f),
                    PathNode.LineTo(185.53f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(194.47f, 124.0f),
                    PathNode.LineTo(178.47f, 92.0f),
                    PathNode.LineTo(217.53f, 92.0f),
                    PathNode.LineTo(233.53f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(213.53f, 84.0f),
                    PathNode.LineTo(174.47f, 84.0f),
                    PathNode.LineTo(158.47f, 52.0f),
                    PathNode.LineTo(197.53f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(20.0f, 184.0f),
                    PathNode.LineTo(20.0f, 128.94f),
                    PathNode.LineTo(56.0f, 56.94f),
                    PathNode.LineTo(92.0f, 128.94f),
                    PathNode.LineTo(92.0f, 188.0f),
                    PathNode.LineTo(24.0f, 188.0f),
                    PathNode.CurveTo(21.790861f, 188.0f, 20.0f, 186.20914f, 20.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 188.0f),
                    PathNode.LineTo(100.0f, 188.0f),
                    PathNode.LineTo(100.0f, 132.0f),
                    PathNode.LineTo(236.0f, 132.0f),
                    PathNode.LineTo(236.0f, 184.0f),
                    PathNode.CurveTo(236.0f, 186.20914f, 234.20914f, 188.0f, 232.0f, 188.0f),
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
        return _solarRoof!!
    }

private var _solarRoof: ImageVector? = null
