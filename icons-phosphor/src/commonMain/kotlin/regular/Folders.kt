package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Folders: ImageVector
    get() {
        if (_folders != null) return _folders!!
        _folders = phosphorRegularIcon(
            name = "Folders",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 64.0f),
                    PathNode.LineTo(154.67f, 64.0f),
                    PathNode.LineTo(126.93f, 43.2f),
                    PathNode.CurveTo(124.15643f, 41.13055f, 120.79053f, 40.008583f, 117.33f, 40.0f),
                    PathNode.LineTo(72.0f, 40.0f),
                    PathNode.CurveTo(63.163445f, 40.0f, 56.0f, 47.163445f, 56.0f, 56.0f),
                    PathNode.LineTo(56.0f, 72.0f),
                    PathNode.LineTo(40.0f, 72.0f),
                    PathNode.CurveTo(31.163445f, 72.0f, 24.0f, 79.163445f, 24.0f, 88.0f),
                    PathNode.LineTo(24.0f, 200.0f),
                    PathNode.CurveTo(24.0f, 208.83656f, 31.163445f, 216.0f, 40.0f, 216.0f),
                    PathNode.LineTo(192.89f, 216.0f),
                    PathNode.CurveTo(201.23045f, 215.98898f, 207.98898f, 209.23045f, 208.0f, 200.89f),
                    PathNode.LineTo(208.0f, 184.0f),
                    PathNode.LineTo(224.89f, 184.0f),
                    PathNode.CurveTo(233.23045f, 183.98898f, 239.98898f, 177.23045f, 240.0f, 168.89f),
                    PathNode.LineTo(240.0f, 80.0f),
                    PathNode.CurveTo(240.0f, 71.163445f, 232.83656f, 64.0f, 224.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 200.0f),
                    PathNode.LineTo(40.0f, 200.0f),
                    PathNode.LineTo(40.0f, 88.0f),
                    PathNode.LineTo(85.33f, 88.0f),
                    PathNode.LineTo(115.2f, 110.4f),
                    PathNode.CurveTo(116.58477f, 111.438576f, 118.269035f, 112.0f, 120.0f, 112.0f),
                    PathNode.LineTo(192.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 168.0f),
                    PathNode.LineTo(208.0f, 168.0f),
                    PathNode.LineTo(208.0f, 112.0f),
                    PathNode.CurveTo(208.0f, 103.163445f, 200.83656f, 96.0f, 192.0f, 96.0f),
                    PathNode.LineTo(122.67f, 96.0f),
                    PathNode.LineTo(94.93f, 75.2f),
                    PathNode.CurveTo(92.15643f, 73.130554f, 88.79053f, 72.00858f, 85.33f, 72.0f),
                    PathNode.LineTo(72.0f, 72.0f),
                    PathNode.LineTo(72.0f, 56.0f),
                    PathNode.LineTo(117.33f, 56.0f),
                    PathNode.LineTo(147.2f, 78.4f),
                    PathNode.CurveTo(148.58476f, 79.438576f, 150.26904f, 80.0f, 152.0f, 80.0f),
                    PathNode.LineTo(224.0f, 80.0f),
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
        return _folders!!
    }

private var _folders: ImageVector? = null
