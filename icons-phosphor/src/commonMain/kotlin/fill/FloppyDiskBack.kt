package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FloppyDiskBack: ImageVector
    get() {
        if (_floppyDiskBack != null) return _floppyDiskBack!!
        _floppyDiskBack = phosphorFillIcon(
            name = "FloppyDiskBack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(83.31f, 32.0f),
                    PathNode.CurveTo(79.06421f, 31.986435f, 74.99025f, 33.67581f, 72.0f, 36.69f),
                    PathNode.LineTo(36.69f, 72.0f),
                    PathNode.CurveTo(33.67581f, 74.99025f, 31.986435f, 79.06421f, 32.0f, 83.31f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 184.0f),
                    PathNode.CurveTo(110.32689f, 184.0f, 96.0f, 169.67311f, 96.0f, 152.0f),
                    PathNode.CurveTo(96.0f, 134.32689f, 110.32689f, 120.0f, 128.0f, 120.0f),
                    PathNode.CurveTo(145.67311f, 120.0f, 160.0f, 134.32689f, 160.0f, 152.0f),
                    PathNode.CurveTo(160.0f, 169.67311f, 145.67311f, 184.0f, 128.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 80.0f),
                    PathNode.CurveTo(172.0f, 82.20914f, 170.20914f, 84.0f, 168.0f, 84.0f),
                    PathNode.LineTo(88.0f, 84.0f),
                    PathNode.CurveTo(85.79086f, 84.0f, 84.0f, 82.20914f, 84.0f, 80.0f),
                    PathNode.LineTo(84.0f, 48.0f),
                    PathNode.LineTo(172.0f, 48.0f),
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
        return _floppyDiskBack!!
    }

private var _floppyDiskBack: ImageVector? = null
