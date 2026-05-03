package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Ruler: ImageVector
    get() {
        if (_ruler != null) return _ruler!!
        _ruler = phosphorDuotoneIcon(
            name = "Ruler",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(229.66f, 90.34f),
                    PathNode.LineTo(90.34f, 229.66f),
                    PathNode.CurveTo(87.21623f, 232.78172f, 82.15377f, 232.78172f, 79.03f, 229.66f),
                    PathNode.LineTo(26.34f, 177.0f),
                    PathNode.CurveTo(23.218275f, 173.87624f, 23.218275f, 168.81377f, 26.34f, 165.69f),
                    PathNode.LineTo(165.66f, 26.34f),
                    PathNode.CurveTo(168.78375f, 23.218275f, 173.84624f, 23.218275f, 176.97f, 26.34f),
                    PathNode.LineTo(229.66f, 79.0f),
                    PathNode.CurveTo(231.16835f, 80.50135f, 232.01633f, 82.54182f, 232.01633f, 84.67f),
                    PathNode.CurveTo(232.01633f, 86.79818f, 231.16835f, 88.83865f, 229.66f, 90.34f),
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
                    PathNode.MoveTo(235.32f, 73.37f),
                    PathNode.LineTo(182.63f, 20.69f),
                    PathNode.CurveTo(179.62932f, 17.688627f, 175.5591f, 16.002417f, 171.315f, 16.002417f),
                    PathNode.CurveTo(167.0709f, 16.002417f, 163.00069f, 17.688627f, 160.0f, 20.69f),
                    PathNode.LineTo(20.68f, 160.0f),
                    PathNode.CurveTo(17.678629f, 163.00069f, 15.992416f, 167.0709f, 15.992416f, 171.315f),
                    PathNode.CurveTo(15.992416f, 175.5591f, 17.678629f, 179.62932f, 20.68f, 182.63f),
                    PathNode.LineTo(73.37f, 235.31f),
                    PathNode.CurveTo(76.37069f, 238.31137f, 80.4409f, 239.99759f, 84.685f, 239.99759f),
                    PathNode.CurveTo(88.92911f, 239.99759f, 92.99931f, 238.31137f, 96.0f, 235.31f),
                    PathNode.LineTo(235.32f, 96.0f),
                    PathNode.CurveTo(238.32137f, 92.99931f, 240.00758f, 88.92911f, 240.00758f, 84.685f),
                    PathNode.CurveTo(240.00758f, 80.4409f, 238.32137f, 76.37069f, 235.32f, 73.37f),
                    PathNode.Close,
                    PathNode.MoveTo(84.68f, 224.0f),
                    PathNode.LineTo(32.0f, 171.31f),
                    PathNode.LineTo(64.0f, 139.31f),
                    PathNode.LineTo(90.34f, 165.66f),
                    PathNode.CurveTo(93.465935f, 168.78593f, 98.534065f, 168.78593f, 101.66f, 165.66f),
                    PathNode.CurveTo(104.785934f, 162.53407f, 104.785934f, 157.46593f, 101.66f, 154.34f),
                    PathNode.LineTo(75.31f, 128.0f),
                    PathNode.LineTo(96.0f, 107.31f),
                    PathNode.LineTo(122.34f, 133.66f),
                    PathNode.CurveTo(125.465935f, 136.78593f, 130.53407f, 136.78593f, 133.66f, 133.66f),
                    PathNode.CurveTo(136.78593f, 130.53407f, 136.78593f, 125.465935f, 133.66f, 122.34f),
                    PathNode.LineTo(107.31f, 96.0f),
                    PathNode.LineTo(128.0f, 75.31f),
                    PathNode.LineTo(154.34f, 101.66f),
                    PathNode.CurveTo(157.46593f, 104.785934f, 162.53407f, 104.785934f, 165.66f, 101.66f),
                    PathNode.CurveTo(168.78593f, 98.534065f, 168.78593f, 93.465935f, 165.66f, 90.34f),
                    PathNode.LineTo(139.31f, 64.0f),
                    PathNode.LineTo(171.31f, 32.0f),
                    PathNode.LineTo(224.0f, 84.69f),
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
        return _ruler!!
    }

private var _ruler: ImageVector? = null
