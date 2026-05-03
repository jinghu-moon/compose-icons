package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Checks: ImageVector
    get() {
        if (_checks != null) return _checks!!
        _checks = phosphorFillIcon(
            name = "Checks",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 48.0f),
                    PathNode.LineTo(32.0f, 48.0f),
                    PathNode.CurveTo(23.163445f, 48.0f, 16.0f, 55.163445f, 16.0f, 64.0f),
                    PathNode.LineTo(16.0f, 192.0f),
                    PathNode.CurveTo(16.0f, 200.83656f, 23.163445f, 208.0f, 32.0f, 208.0f),
                    PathNode.LineTo(224.0f, 208.0f),
                    PathNode.CurveTo(232.83656f, 208.0f, 240.0f, 200.83656f, 240.0f, 192.0f),
                    PathNode.LineTo(240.0f, 64.0f),
                    PathNode.CurveTo(240.0f, 55.163445f, 232.83656f, 48.0f, 224.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 168.0f),
                    PathNode.CurveTo(69.87763f, 168.00166f, 67.841576f, 167.15993f, 66.34f, 165.66f),
                    PathNode.LineTo(42.34f, 141.66f),
                    PathNode.CurveTo(39.21407f, 138.53407f, 39.21407f, 133.46593f, 42.34f, 130.34f),
                    PathNode.CurveTo(45.46593f, 127.214066f, 50.53407f, 127.214066f, 53.66f, 130.34f),
                    PathNode.LineTo(72.0f, 148.69f),
                    PathNode.LineTo(130.34f, 90.34f),
                    PathNode.CurveTo(133.46593f, 87.214066f, 138.53407f, 87.214066f, 141.66f, 90.34f),
                    PathNode.CurveTo(144.78593f, 93.465935f, 144.78593f, 98.534065f, 141.66f, 101.66f),
                    PathNode.LineTo(77.66f, 165.66f),
                    PathNode.CurveTo(76.158424f, 167.15993f, 74.12237f, 168.00166f, 72.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(213.66f, 101.66f),
                    PathNode.LineTo(149.66f, 165.66f),
                    PathNode.CurveTo(148.15945f, 167.16223f, 146.12328f, 168.00629f, 144.0f, 168.00629f),
                    PathNode.CurveTo(141.87672f, 168.00629f, 139.84055f, 167.16223f, 138.34f, 165.66f),
                    PathNode.LineTo(122.34f, 149.66f),
                    PathNode.CurveTo(119.214066f, 146.53407f, 119.214066f, 141.46593f, 122.34f, 138.34f),
                    PathNode.CurveTo(125.465935f, 135.21407f, 130.53407f, 135.21407f, 133.66f, 138.34f),
                    PathNode.LineTo(144.0f, 148.69f),
                    PathNode.LineTo(202.34f, 90.34f),
                    PathNode.CurveTo(205.46593f, 87.214066f, 210.53407f, 87.214066f, 213.66f, 90.34f),
                    PathNode.CurveTo(216.78593f, 93.465935f, 216.78593f, 98.534065f, 213.66f, 101.66f),
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
        return _checks!!
    }

private var _checks: ImageVector? = null
