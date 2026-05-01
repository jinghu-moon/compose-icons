package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CassetteTape: ImageVector
    get() {
        if (_cassetteTape != null) return _cassetteTape!!
        _cassetteTape = phosphorFillIcon(
            name = "CassetteTape",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(156.3f, 96.0f),
                    PathNode.CurveTo(150.5672f, 105.89639f, 150.5672f, 118.10361f, 156.3f, 128.0f),
                    PathNode.LineTo(99.7f, 128.0f),
                    PathNode.CurveTo(105.4328f, 118.10361f, 105.4328f, 105.89639f, 99.7f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 96.0f),
                    PathNode.CurveTo(63.163445f, 96.0f, 56.0f, 103.163445f, 56.0f, 112.0f),
                    PathNode.CurveTo(56.0f, 120.836555f, 63.163445f, 128.0f, 72.0f, 128.0f),
                    PathNode.CurveTo(80.836555f, 128.0f, 88.0f, 120.836555f, 88.0f, 112.0f),
                    PathNode.CurveTo(88.0f, 103.163445f, 80.836555f, 96.0f, 72.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 64.0f),
                    PathNode.LineTo(240.0f, 192.0f),
                    PathNode.CurveTo(240.0f, 200.83656f, 232.83656f, 208.0f, 224.0f, 208.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(23.163445f, 208.0f, 16.0f, 200.83656f, 16.0f, 192.0f),
                    PathNode.LineTo(16.0f, 64.0f),
                    PathNode.CurveTo(16.0f, 55.163445f, 23.163445f, 48.0f, 32.0f, 48.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(232.83656f, 48.0f, 240.0f, 55.163445f, 240.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(186.0f, 192.0f),
                    PathNode.LineTo(170.4f, 171.2f),
                    PathNode.CurveTo(168.88918f, 169.18555f, 166.51805f, 168.0f, 164.0f, 168.0f),
                    PathNode.LineTo(92.0f, 168.0f),
                    PathNode.CurveTo(89.48194f, 168.0f, 87.11083f, 169.18555f, 85.6f, 171.2f),
                    PathNode.LineTo(70.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 112.0f),
                    PathNode.CurveTo(216.0f, 94.32689f, 201.67311f, 80.0f, 184.0f, 80.0f),
                    PathNode.LineTo(72.0f, 80.0f),
                    PathNode.CurveTo(54.32689f, 80.0f, 40.0f, 94.32689f, 40.0f, 112.0f),
                    PathNode.CurveTo(40.0f, 129.67311f, 54.32689f, 144.0f, 72.0f, 144.0f),
                    PathNode.LineTo(184.0f, 144.0f),
                    PathNode.CurveTo(201.67311f, 144.0f, 216.0f, 129.67311f, 216.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 96.0f),
                    PathNode.CurveTo(175.16344f, 96.0f, 168.0f, 103.163445f, 168.0f, 112.0f),
                    PathNode.CurveTo(168.0f, 120.836555f, 175.16344f, 128.0f, 184.0f, 128.0f),
                    PathNode.CurveTo(192.83656f, 128.0f, 200.0f, 120.836555f, 200.0f, 112.0f),
                    PathNode.CurveTo(200.0f, 103.163445f, 192.83656f, 96.0f, 184.0f, 96.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _cassetteTape!!
    }

private var _cassetteTape: ImageVector? = null
