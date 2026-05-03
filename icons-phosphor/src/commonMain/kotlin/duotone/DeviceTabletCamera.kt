package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.DeviceTabletCamera: ImageVector
    get() {
        if (_deviceTabletCamera != null) return _deviceTabletCamera!!
        _deviceTabletCamera = phosphorDuotoneIcon(
            name = "DeviceTabletCamera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 48.0f),
                    PathNode.LineTo(208.0f, 208.0f),
                    PathNode.CurveTo(208.0f, 216.83656f, 200.83656f, 224.0f, 192.0f, 224.0f),
                    PathNode.LineTo(64.0f, 224.0f),
                    PathNode.CurveTo(55.163445f, 224.0f, 48.0f, 216.83656f, 48.0f, 208.0f),
                    PathNode.LineTo(48.0f, 48.0f),
                    PathNode.CurveTo(48.0f, 39.163445f, 55.163445f, 32.0f, 64.0f, 32.0f),
                    PathNode.LineTo(192.0f, 32.0f),
                    PathNode.CurveTo(200.83656f, 32.0f, 208.0f, 39.163445f, 208.0f, 48.0f),
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
                    PathNode.MoveTo(192.0f, 24.0f),
                    PathNode.LineTo(64.0f, 24.0f),
                    PathNode.CurveTo(50.745167f, 24.0f, 40.0f, 34.745167f, 40.0f, 48.0f),
                    PathNode.LineTo(40.0f, 208.0f),
                    PathNode.CurveTo(40.0f, 221.25484f, 50.745167f, 232.0f, 64.0f, 232.0f),
                    PathNode.LineTo(192.0f, 232.0f),
                    PathNode.CurveTo(205.25484f, 232.0f, 216.0f, 221.25484f, 216.0f, 208.0f),
                    PathNode.LineTo(216.0f, 48.0f),
                    PathNode.CurveTo(216.0f, 34.745167f, 205.25484f, 24.0f, 192.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 208.0f),
                    PathNode.CurveTo(200.0f, 212.41827f, 196.41827f, 216.0f, 192.0f, 216.0f),
                    PathNode.LineTo(64.0f, 216.0f),
                    PathNode.CurveTo(59.581722f, 216.0f, 56.0f, 212.41827f, 56.0f, 208.0f),
                    PathNode.LineTo(56.0f, 48.0f),
                    PathNode.CurveTo(56.0f, 43.581722f, 59.581722f, 40.0f, 64.0f, 40.0f),
                    PathNode.LineTo(192.0f, 40.0f),
                    PathNode.CurveTo(196.41827f, 40.0f, 200.0f, 43.581722f, 200.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 68.0f),
                    PathNode.CurveTo(140.0f, 74.62742f, 134.62741f, 80.0f, 128.0f, 80.0f),
                    PathNode.CurveTo(121.37258f, 80.0f, 116.0f, 74.62742f, 116.0f, 68.0f),
                    PathNode.CurveTo(116.0f, 61.37258f, 121.37258f, 56.0f, 128.0f, 56.0f),
                    PathNode.CurveTo(134.62741f, 56.0f, 140.0f, 61.37258f, 140.0f, 68.0f),
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
        return _deviceTabletCamera!!
    }

private var _deviceTabletCamera: ImageVector? = null
