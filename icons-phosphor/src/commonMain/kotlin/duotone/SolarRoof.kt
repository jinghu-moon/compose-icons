package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SolarRoof: ImageVector
    get() {
        if (_solarRoof != null) return _solarRoof!!
        _solarRoof = phosphorDuotoneIcon(
            name = "SolarRoof",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 128.0f),
                    PathNode.LineTo(96.0f, 128.0f),
                    PathNode.LineTo(56.0f, 48.0f),
                    PathNode.LineTo(200.0f, 48.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(247.16f, 124.42f),
                    PathNode.LineTo(207.16f, 44.42f),
                    PathNode.CurveTo(205.80348f, 41.70914f, 203.03131f, 39.99783f, 200.0f, 40.0f),
                    PathNode.LineTo(56.0f, 40.0f),
                    PathNode.CurveTo(52.96868f, 39.99783f, 50.196514f, 41.70914f, 48.84f, 44.42f),
                    PathNode.LineTo(8.84f, 124.42f),
                    PathNode.CurveTo(8.288568f, 125.53291f, 8.001125f, 126.757965f, 8.0f, 128.0f),
                    PathNode.LineTo(8.0f, 184.0f),
                    PathNode.CurveTo(8.0f, 192.83656f, 15.163444f, 200.0f, 24.0f, 200.0f),
                    PathNode.LineTo(232.0f, 200.0f),
                    PathNode.CurveTo(240.83656f, 200.0f, 248.0f, 192.83656f, 248.0f, 184.0f),
                    PathNode.LineTo(248.0f, 128.0f),
                    PathNode.CurveTo(247.99887f, 126.757965f, 247.71143f, 125.53291f, 247.16f, 124.42f),
                    PathNode.Close,
                    PathNode.MoveTo(99.06f, 56.0f),
                    PathNode.LineTo(111.06f, 80.0f),
                    PathNode.LineTo(80.94f, 80.0f),
                    PathNode.LineTo(68.94f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(147.06f, 56.0f),
                    PathNode.LineTo(159.06f, 80.0f),
                    PathNode.LineTo(128.94f, 80.0f),
                    PathNode.LineTo(116.94f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.94f, 120.0f),
                    PathNode.LineTo(88.94f, 96.0f),
                    PathNode.LineTo(119.06f, 96.0f),
                    PathNode.LineTo(131.06f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(148.94f, 120.0f),
                    PathNode.LineTo(136.94f, 96.0f),
                    PathNode.LineTo(167.06f, 96.0f),
                    PathNode.LineTo(179.06f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.94f, 120.0f),
                    PathNode.LineTo(184.94f, 96.0f),
                    PathNode.LineTo(215.06f, 96.0f),
                    PathNode.LineTo(227.06f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(207.06f, 80.0f),
                    PathNode.LineTo(176.94f, 80.0f),
                    PathNode.LineTo(164.94f, 56.0f),
                    PathNode.LineTo(195.06f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(24.0f, 129.89f),
                    PathNode.LineTo(56.0f, 65.89f),
                    PathNode.LineTo(88.0f, 129.89f),
                    PathNode.LineTo(88.0f, 184.0f),
                    PathNode.LineTo(24.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 184.0f),
                    PathNode.LineTo(104.0f, 136.0f),
                    PathNode.LineTo(232.0f, 136.0f),
                    PathNode.LineTo(232.0f, 184.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _solarRoof!!
    }

private var _solarRoof: ImageVector? = null
