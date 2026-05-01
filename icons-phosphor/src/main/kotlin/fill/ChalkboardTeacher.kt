package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ChalkboardTeacher: ImageVector
    get() {
        if (_chalkboardTeacher != null) return _chalkboardTeacher!!
        _chalkboardTeacher = phosphorFillIcon(
            name = "ChalkboardTeacher",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 40.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(31.163445f, 40.0f, 24.0f, 47.163445f, 24.0f, 56.0f),
                    PathNode.LineTo(24.0f, 200.0f),
                    PathNode.CurveTo(24.0f, 208.83656f, 31.163445f, 216.0f, 40.0f, 216.0f),
                    PathNode.LineTo(53.39f, 216.0f),
                    PathNode.CurveTo(56.4804f, 216.001f, 59.29499f, 214.22194f, 60.62f, 211.43f),
                    PathNode.CurveTo(68.56051f, 194.66548f, 85.45004f, 183.97691f, 104.0f, 183.97691f),
                    PathNode.CurveTo(122.54996f, 183.97691f, 139.4395f, 194.66548f, 147.38f, 211.43f),
                    PathNode.CurveTo(148.705f, 214.22194f, 151.5196f, 216.001f, 154.61f, 216.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(224.83656f, 216.0f, 232.0f, 208.83656f, 232.0f, 200.0f),
                    PathNode.LineTo(232.0f, 56.0f),
                    PathNode.CurveTo(232.0f, 47.163445f, 224.83656f, 40.0f, 216.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 168.0f),
                    PathNode.CurveTo(86.32689f, 168.0f, 72.0f, 153.67311f, 72.0f, 136.0f),
                    PathNode.CurveTo(72.0f, 118.32689f, 86.32689f, 104.0f, 104.0f, 104.0f),
                    PathNode.CurveTo(121.67311f, 104.0f, 136.0f, 118.32689f, 136.0f, 136.0f),
                    PathNode.CurveTo(136.0f, 153.67311f, 121.67311f, 168.0f, 104.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 200.0f),
                    PathNode.LineTo(159.43f, 200.0f),
                    PathNode.CurveTo(155.9424f, 193.98665f, 151.49739f, 188.58238f, 146.27f, 184.0f),
                    PathNode.LineTo(192.0f, 184.0f),
                    PathNode.CurveTo(196.41827f, 184.0f, 200.0f, 180.41827f, 200.0f, 176.0f),
                    PathNode.LineTo(200.0f, 80.0f),
                    PathNode.CurveTo(200.0f, 75.58172f, 196.41827f, 72.0f, 192.0f, 72.0f),
                    PathNode.LineTo(64.0f, 72.0f),
                    PathNode.CurveTo(59.581722f, 72.0f, 56.0f, 75.58172f, 56.0f, 80.0f),
                    PathNode.LineTo(56.0f, 176.0f),
                    PathNode.CurveTo(55.99816f, 179.64949f, 58.466396f, 182.83763f, 62.0f, 183.75f),
                    PathNode.CurveTo(56.65213f, 188.38342f, 52.11336f, 193.87523f, 48.57f, 200.0f),
                    PathNode.LineTo(40.0f, 200.0f),
                    PathNode.LineTo(40.0f, 56.0f),
                    PathNode.LineTo(216.0f, 56.0f),
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
        return _chalkboardTeacher!!
    }

private var _chalkboardTeacher: ImageVector? = null
