package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Heartbeat: ImageVector
    get() {
        if (_heartbeat != null) return _heartbeat!!
        _heartbeat = tablerOutlineIcon(
            name = "Heartbeat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.5f, 13.572f),
                    PathNode.LineTo(12.0f, 21.0f),
                    PathNode.LineTo(9.104f, 18.132f),
                    PathNode.MoveTo(2.987f, 10.028f),
                    PathNode.CurveTo(2.969855f, 7.864571f, 4.34608f, 5.935531f, 6.397344f, 5.247755f),
                    PathNode.CurveTo(8.448608f, 4.55998f, 10.709527f, 5.26951f, 12.0f, 7.006f),
                    PathNode.CurveTo(13.127275f, 5.506787f, 14.998826f, 4.764613f, 16.847204f, 5.083817f),
                    PathNode.CurveTo(18.695583f, 5.40302f, 20.209822f, 6.729896f, 20.768993f, 8.520349f),
                    PathNode.CurveTo(21.328163f, 10.310802f, 20.838194f, 12.263607f, 19.5f, 13.578f)
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
                    PathNode.MoveTo(3.0f, 13.0f),
                    PathNode.LineTo(5.0f, 13.0f),
                    PathNode.LineTo(7.0f, 16.0f),
                    PathNode.LineTo(9.0f, 10.0f),
                    PathNode.LineTo(10.0f, 13.0f),
                    PathNode.LineTo(13.0f, 13.0f)
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
        return _heartbeat!!
    }

private var _heartbeat: ImageVector? = null
