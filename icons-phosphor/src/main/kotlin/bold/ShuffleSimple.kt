package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ShuffleSimple: ImageVector
    get() {
        if (_shuffleSimple != null) return _shuffleSimple!!
        _shuffleSimple = phosphorBoldIcon(
            name = "ShuffleSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.0f, 48.0f),
                    PathNode.LineTo(220.0f, 88.0f),
                    PathNode.CurveTo(220.0f, 94.62742f, 214.62741f, 100.0f, 208.0f, 100.0f),
                    PathNode.CurveTo(201.37259f, 100.0f, 196.0f, 94.62742f, 196.0f, 88.0f),
                    PathNode.LineTo(196.0f, 77.0f),
                    PathNode.LineTo(164.77f, 108.2f),
                    PathNode.CurveTo(160.07558f, 112.89442f, 152.46442f, 112.89442f, 147.77f, 108.2f),
                    PathNode.CurveTo(143.07558f, 103.50558f, 143.07558f, 95.89442f, 147.77f, 91.2f),
                    PathNode.LineTo(179.0f, 60.0f),
                    PathNode.LineTo(168.0f, 60.0f),
                    PathNode.CurveTo(161.37259f, 60.0f, 156.0f, 54.62742f, 156.0f, 48.0f),
                    PathNode.CurveTo(156.0f, 41.37258f, 161.37259f, 36.0f, 168.0f, 36.0f),
                    PathNode.LineTo(208.0f, 36.0f),
                    PathNode.CurveTo(214.62741f, 36.0f, 220.0f, 41.37258f, 220.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 156.0f),
                    PathNode.CurveTo(201.37259f, 156.0f, 196.0f, 161.37259f, 196.0f, 168.0f),
                    PathNode.LineTo(196.0f, 179.0f),
                    PathNode.LineTo(56.49f, 39.51f),
                    PathNode.CurveTo(51.79558f, 34.81558f, 44.18442f, 34.81558f, 39.49f, 39.51f),
                    PathNode.CurveTo(34.79558f, 44.20442f, 34.79558f, 51.81558f, 39.49f, 56.51f),
                    PathNode.LineTo(179.0f, 196.0f),
                    PathNode.LineTo(168.0f, 196.0f),
                    PathNode.CurveTo(161.37259f, 196.0f, 156.0f, 201.37259f, 156.0f, 208.0f),
                    PathNode.CurveTo(156.0f, 214.62741f, 161.37259f, 220.0f, 168.0f, 220.0f),
                    PathNode.LineTo(208.0f, 220.0f),
                    PathNode.CurveTo(214.62741f, 220.0f, 220.0f, 214.62741f, 220.0f, 208.0f),
                    PathNode.LineTo(220.0f, 168.0f),
                    PathNode.CurveTo(220.0f, 161.37259f, 214.62741f, 156.0f, 208.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(91.23f, 147.8f),
                    PathNode.LineTo(39.51f, 199.51f),
                    PathNode.CurveTo(34.81558f, 204.20442f, 34.81558f, 211.81558f, 39.51f, 216.51f),
                    PathNode.CurveTo(44.20442f, 221.20442f, 51.81558f, 221.20442f, 56.51f, 216.51f),
                    PathNode.LineTo(108.22f, 164.79f),
                    PathNode.CurveTo(112.91442f, 160.09558f, 112.91442f, 152.48442f, 108.22f, 147.79f),
                    PathNode.CurveTo(103.52558f, 143.09558f, 95.91442f, 143.09558f, 91.22f, 147.79f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _shuffleSimple!!
    }

private var _shuffleSimple: ImageVector? = null
