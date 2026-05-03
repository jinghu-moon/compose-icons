package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WashTumbleOff: ImageVector
    get() {
        if (_washTumbleOff != null) return _washTumbleOff!!
        _washTumbleOff = tablerOutlineIcon(
            name = "WashTumbleOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.116f, 20.127f),
                    PathNode.CurveTo(19.554386f, 20.687155f, 18.79321f, 21.001194f, 18.0f, 21.0f),
                    PathNode.LineTo(6.0f, 21.0f),
                    PathNode.CurveTo(4.343146f, 21.0f, 3.0f, 19.656855f, 3.0f, 18.0f),
                    PathNode.LineTo(3.0f, 6.0f),
                    PathNode.CurveTo(3.0f, 5.173f, 3.335f, 4.424f, 3.877f, 3.88f),
                    PathNode.MoveTo(7.0f, 3.0f),
                    PathNode.LineTo(18.0f, 3.0f),
                    PathNode.CurveTo(19.656855f, 3.0f, 21.0f, 4.343146f, 21.0f, 6.0f),
                    PathNode.LineTo(21.0f, 17.0f)
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
                    PathNode.MoveTo(17.744f, 13.74f),
                    PathNode.CurveTo(18.386541f, 11.621029f, 17.80981f, 9.32041f, 16.243683f, 7.755119f),
                    PathNode.CurveTo(14.677554f, 6.189827f, 12.376627f, 5.614327f, 10.258f, 6.258f),
                    PathNode.MoveTo(7.759f, 7.755f),
                    PathNode.CurveTo(6.221822f, 9.265626f, 5.612935f, 11.484643f, 6.163877f, 13.568239f),
                    PathNode.CurveTo(6.714819f, 15.651835f, 8.34094f, 17.279873f, 10.423885f, 17.833273f),
                    PathNode.CurveTo(12.50683f, 18.38667f, 14.726563f, 17.780397f, 16.239f, 16.245f)
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
        return _washTumbleOff!!
    }

private var _washTumbleOff: ImageVector? = null
