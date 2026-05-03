package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BroadcastOff: ImageVector
    get() {
        if (_broadcastOff != null) return _broadcastOff!!
        _broadcastOff = tablerOutlineIcon(
            name = "BroadcastOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.364f, 19.364f),
                    PathNode.CurveTo(21.391052f, 16.341042f, 21.871826f, 11.604983f, 19.514008f, 8.035388f),
                    PathNode.CurveTo(17.156187f, 4.465793f, 12.611436f, 3.049238f, 8.643f, 4.647f),
                    PathNode.MoveTo(6.155f, 6.156f),
                    PathNode.CurveTo(4.246503f, 7.785892f, 3.10527f, 10.13866f, 3.006726f, 12.646487f),
                    PathNode.CurveTo(2.908183f, 15.154314f, 3.861281f, 17.589378f, 5.636f, 19.364f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.536f, 16.536f),
                    PathNode.CurveTo(16.966381f, 15.105994f, 17.394344f, 12.955075f, 16.620277f, 11.086456f),
                    PathNode.CurveTo(15.84621f, 9.217838f, 14.022601f, 7.999623f, 12.0f, 8.0f),
                    PathNode.MoveTo(9.0f, 9.0f),
                    PathNode.CurveTo(7.840352f, 9.869754f, 7.115242f, 11.199967f, 7.012592f, 12.645899f),
                    PathNode.CurveTo(6.909941f, 14.09183f, 7.439855f, 15.511143f, 8.465f, 16.536f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 12.0f),
                    PathNode.CurveTo(11.447715f, 12.0f, 11.0f, 12.447715f, 11.0f, 13.0f),
                    PathNode.CurveTo(11.0f, 13.552285f, 11.447715f, 14.0f, 12.0f, 14.0f),
                    PathNode.CurveTo(12.552285f, 14.0f, 13.0f, 13.552285f, 13.0f, 13.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _broadcastOff!!
    }

private var _broadcastOff: ImageVector? = null
