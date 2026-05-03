package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Robot: ImageVector
    get() {
        if (_robot != null) return _robot!!
        _robot = phosphorFillIcon(
            name = "Robot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 48.0f),
                    PathNode.LineTo(136.0f, 48.0f),
                    PathNode.LineTo(136.0f, 16.0f),
                    PathNode.CurveTo(136.0f, 11.581722f, 132.41827f, 8.0f, 128.0f, 8.0f),
                    PathNode.CurveTo(123.58172f, 8.0f, 120.0f, 11.581722f, 120.0f, 16.0f),
                    PathNode.LineTo(120.0f, 48.0f),
                    PathNode.LineTo(56.0f, 48.0f),
                    PathNode.CurveTo(38.32689f, 48.0f, 24.0f, 62.32689f, 24.0f, 80.0f),
                    PathNode.LineTo(24.0f, 192.0f),
                    PathNode.CurveTo(24.0f, 209.67311f, 38.32689f, 224.0f, 56.0f, 224.0f),
                    PathNode.LineTo(200.0f, 224.0f),
                    PathNode.CurveTo(217.67311f, 224.0f, 232.0f, 209.67311f, 232.0f, 192.0f),
                    PathNode.LineTo(232.0f, 80.0f),
                    PathNode.CurveTo(232.0f, 62.32689f, 217.67311f, 48.0f, 200.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 96.0f),
                    PathNode.CurveTo(178.62741f, 96.0f, 184.0f, 101.37258f, 184.0f, 108.0f),
                    PathNode.CurveTo(184.0f, 114.62742f, 178.62741f, 120.0f, 172.0f, 120.0f),
                    PathNode.CurveTo(165.37259f, 120.0f, 160.0f, 114.62742f, 160.0f, 108.0f),
                    PathNode.CurveTo(160.0f, 101.37258f, 165.37259f, 96.0f, 172.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 184.0f),
                    PathNode.LineTo(80.0f, 184.0f),
                    PathNode.CurveTo(71.163445f, 184.0f, 64.0f, 176.83656f, 64.0f, 168.0f),
                    PathNode.CurveTo(64.0f, 159.16344f, 71.163445f, 152.0f, 80.0f, 152.0f),
                    PathNode.LineTo(96.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 120.0f),
                    PathNode.CurveTo(77.37258f, 120.0f, 72.0f, 114.62742f, 72.0f, 108.0f),
                    PathNode.CurveTo(72.0f, 101.37258f, 77.37258f, 96.0f, 84.0f, 96.0f),
                    PathNode.CurveTo(90.62742f, 96.0f, 96.0f, 101.37258f, 96.0f, 108.0f),
                    PathNode.CurveTo(96.0f, 114.62742f, 90.62742f, 120.0f, 84.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 184.0f),
                    PathNode.LineTo(112.0f, 184.0f),
                    PathNode.LineTo(112.0f, 152.0f),
                    PathNode.LineTo(144.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 184.0f),
                    PathNode.LineTo(160.0f, 184.0f),
                    PathNode.LineTo(160.0f, 152.0f),
                    PathNode.LineTo(176.0f, 152.0f),
                    PathNode.CurveTo(184.83656f, 152.0f, 192.0f, 159.16344f, 192.0f, 168.0f),
                    PathNode.CurveTo(192.0f, 176.83656f, 184.83656f, 184.0f, 176.0f, 184.0f),
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
        return _robot!!
    }

private var _robot: ImageVector? = null
