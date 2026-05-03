package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Robot: ImageVector
    get() {
        if (_robot != null) return _robot!!
        _robot = phosphorRegularIcon(
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
                    PathNode.MoveTo(216.0f, 192.0f),
                    PathNode.CurveTo(216.0f, 200.83656f, 208.83656f, 208.0f, 200.0f, 208.0f),
                    PathNode.LineTo(56.0f, 208.0f),
                    PathNode.CurveTo(47.163445f, 208.0f, 40.0f, 200.83656f, 40.0f, 192.0f),
                    PathNode.LineTo(40.0f, 80.0f),
                    PathNode.CurveTo(40.0f, 71.163445f, 47.163445f, 64.0f, 56.0f, 64.0f),
                    PathNode.LineTo(200.0f, 64.0f),
                    PathNode.CurveTo(208.83656f, 64.0f, 216.0f, 71.163445f, 216.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 136.0f),
                    PathNode.LineTo(92.0f, 136.0f),
                    PathNode.CurveTo(76.536026f, 136.0f, 64.0f, 148.53603f, 64.0f, 164.0f),
                    PathNode.CurveTo(64.0f, 179.46397f, 76.536026f, 192.0f, 92.0f, 192.0f),
                    PathNode.LineTo(164.0f, 192.0f),
                    PathNode.CurveTo(179.46397f, 192.0f, 192.0f, 179.46397f, 192.0f, 164.0f),
                    PathNode.CurveTo(192.0f, 148.53603f, 179.46397f, 136.0f, 164.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 152.0f),
                    PathNode.LineTo(140.0f, 176.0f),
                    PathNode.LineTo(116.0f, 176.0f),
                    PathNode.LineTo(116.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 164.0f),
                    PathNode.CurveTo(80.0f, 157.37259f, 85.37258f, 152.0f, 92.0f, 152.0f),
                    PathNode.LineTo(100.0f, 152.0f),
                    PathNode.LineTo(100.0f, 176.0f),
                    PathNode.LineTo(92.0f, 176.0f),
                    PathNode.CurveTo(85.37258f, 176.0f, 80.0f, 170.62741f, 80.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 176.0f),
                    PathNode.LineTo(156.0f, 176.0f),
                    PathNode.LineTo(156.0f, 152.0f),
                    PathNode.LineTo(164.0f, 152.0f),
                    PathNode.CurveTo(170.62741f, 152.0f, 176.0f, 157.37259f, 176.0f, 164.0f),
                    PathNode.CurveTo(176.0f, 170.62741f, 170.62741f, 176.0f, 164.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 108.0f),
                    PathNode.CurveTo(72.0f, 101.37258f, 77.37258f, 96.0f, 84.0f, 96.0f),
                    PathNode.CurveTo(90.62742f, 96.0f, 96.0f, 101.37258f, 96.0f, 108.0f),
                    PathNode.CurveTo(96.0f, 114.62742f, 90.62742f, 120.0f, 84.0f, 120.0f),
                    PathNode.CurveTo(77.37258f, 120.0f, 72.0f, 114.62742f, 72.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 108.0f),
                    PathNode.CurveTo(160.0f, 101.37258f, 165.37259f, 96.0f, 172.0f, 96.0f),
                    PathNode.CurveTo(178.62741f, 96.0f, 184.0f, 101.37258f, 184.0f, 108.0f),
                    PathNode.CurveTo(184.0f, 114.62742f, 178.62741f, 120.0f, 172.0f, 120.0f),
                    PathNode.CurveTo(165.37259f, 120.0f, 160.0f, 114.62742f, 160.0f, 108.0f),
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
        return _robot!!
    }

private var _robot: ImageVector? = null
