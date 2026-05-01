package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.DeviceMobileSpeaker: ImageVector
    get() {
        if (_deviceMobileSpeaker != null) return _deviceMobileSpeaker!!
        _deviceMobileSpeaker = phosphorFillIcon(
            name = "DeviceMobileSpeaker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.0f, 16.0f),
                    PathNode.LineTo(80.0f, 16.0f),
                    PathNode.CurveTo(66.74516f, 16.0f, 56.0f, 26.745167f, 56.0f, 40.0f),
                    PathNode.LineTo(56.0f, 216.0f),
                    PathNode.CurveTo(56.0f, 229.25484f, 66.74516f, 240.0f, 80.0f, 240.0f),
                    PathNode.LineTo(176.0f, 240.0f),
                    PathNode.CurveTo(189.25484f, 240.0f, 200.0f, 229.25484f, 200.0f, 216.0f),
                    PathNode.LineTo(200.0f, 40.0f),
                    PathNode.CurveTo(200.0f, 26.745167f, 189.25484f, 16.0f, 176.0f, 16.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 64.0f),
                    PathNode.LineTo(96.0f, 64.0f),
                    PathNode.CurveTo(91.58172f, 64.0f, 88.0f, 60.418278f, 88.0f, 56.0f),
                    PathNode.CurveTo(88.0f, 51.581722f, 91.58172f, 48.0f, 96.0f, 48.0f),
                    PathNode.LineTo(160.0f, 48.0f),
                    PathNode.CurveTo(164.41827f, 48.0f, 168.0f, 51.581722f, 168.0f, 56.0f),
                    PathNode.CurveTo(168.0f, 60.418278f, 164.41827f, 64.0f, 160.0f, 64.0f),
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
        return _deviceMobileSpeaker!!
    }

private var _deviceMobileSpeaker: ImageVector? = null
