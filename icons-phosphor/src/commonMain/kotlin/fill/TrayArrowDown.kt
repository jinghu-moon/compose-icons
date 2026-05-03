package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TrayArrowDown: ImageVector
    get() {
        if (_trayArrowDown != null) return _trayArrowDown!!
        _trayArrowDown = phosphorFillIcon(
            name = "TrayArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(90.34f, 114.34f),
                    PathNode.CurveTo(91.840546f, 112.83778f, 93.876724f, 111.993706f, 96.0f, 111.993706f),
                    PathNode.CurveTo(98.123276f, 111.993706f, 100.159454f, 112.83778f, 101.66f, 114.34f),
                    PathNode.LineTo(120.0f, 132.69f),
                    PathNode.LineTo(120.0f, 72.0f),
                    PathNode.CurveTo(120.0f, 67.58172f, 123.58172f, 64.0f, 128.0f, 64.0f),
                    PathNode.CurveTo(132.41827f, 64.0f, 136.0f, 67.58172f, 136.0f, 72.0f),
                    PathNode.LineTo(136.0f, 132.69f),
                    PathNode.LineTo(154.34f, 114.34f),
                    PathNode.CurveTo(157.46593f, 111.214066f, 162.53407f, 111.214066f, 165.66f, 114.34f),
                    PathNode.CurveTo(168.78593f, 117.465935f, 168.78593f, 122.534065f, 165.66f, 125.66f),
                    PathNode.LineTo(133.66f, 157.66f),
                    PathNode.CurveTo(132.15945f, 159.16223f, 130.12328f, 160.00629f, 128.0f, 160.00629f),
                    PathNode.CurveTo(125.876724f, 160.00629f, 123.840546f, 159.16223f, 122.34f, 157.66f),
                    PathNode.LineTo(90.34f, 125.66f),
                    PathNode.CurveTo(88.83778f, 124.159454f, 87.993706f, 122.123276f, 87.993706f, 120.0f),
                    PathNode.CurveTo(87.993706f, 117.876724f, 88.83778f, 115.840546f, 90.34f, 114.34f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.LineTo(48.0f, 168.0f),
                    PathNode.LineTo(76.69f, 168.0f),
                    PathNode.LineTo(96.0f, 187.32f),
                    PathNode.CurveTo(98.993805f, 190.32768f, 103.066315f, 192.01285f, 107.31f, 192.0f),
                    PathNode.LineTo(148.69f, 192.0f),
                    PathNode.CurveTo(152.93579f, 192.01357f, 157.00975f, 190.32419f, 160.0f, 187.31f),
                    PathNode.LineTo(179.31f, 168.0f),
                    PathNode.LineTo(208.0f, 168.0f),
                    PathNode.LineTo(208.0f, 208.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _trayArrowDown!!
    }

private var _trayArrowDown: ImageVector? = null
