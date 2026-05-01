package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Send: ImageVector
    get() {
        if (_send != null) return _send!!
        _send = tablerOutlineIcon(
            name = "Send",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 14.0f),
                    PathNode.LineTo(21.0f, 3.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 3.0f),
                    PathNode.LineTo(14.5f, 21.0f),
                    PathNode.CurveTo(14.410403f, 21.195515f, 14.215067f, 21.320871f, 14.0f, 21.320871f),
                    PathNode.CurveTo(13.784933f, 21.320871f, 13.589597f, 21.195515f, 13.5f, 21.0f),
                    PathNode.LineTo(10.0f, 14.0f),
                    PathNode.LineTo(3.0f, 10.5f),
                    PathNode.CurveTo(2.804484f, 10.410403f, 2.679129f, 10.215067f, 2.679129f, 10.0f),
                    PathNode.CurveTo(2.679129f, 9.784933f, 2.804484f, 9.589597f, 3.0f, 9.5f),
                    PathNode.LineTo(21.0f, 3.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _send!!
    }

private var _send: ImageVector? = null
