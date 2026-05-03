package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HeartCode: ImageVector
    get() {
        if (_heartCode != null) return _heartCode!!
        _heartCode = tablerOutlineIcon(
            name = "HeartCode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.5f, 12.572f),
                    PathNode.LineTo(18.964f, 13.102f),
                    PathNode.MoveTo(11.054f, 19.062f),
                    PathNode.LineTo(4.5f, 12.573f),
                    PathNode.CurveTo(3.153f, 11.26026f, 2.656663f, 9.302649f, 3.215479f, 7.506703f),
                    PathNode.CurveTo(3.774295f, 5.710757f, 5.293711f, 4.380356f, 7.147728f, 4.063625f),
                    PathNode.CurveTo(9.001744f, 3.746894f, 10.876657f, 4.497426f, 12.0f, 6.006f),
                    PathNode.CurveTo(13.127275f, 4.506787f, 14.998826f, 3.764614f, 16.847204f, 4.083817f),
                    PathNode.CurveTo(18.695583f, 4.40302f, 20.209822f, 5.729896f, 20.768993f, 7.520349f),
                    PathNode.CurveTo(21.328163f, 9.310802f, 20.838194f, 11.263607f, 19.5f, 12.578f)
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
                    PathNode.MoveTo(20.0f, 21.0f),
                    PathNode.LineTo(22.0f, 19.0f),
                    PathNode.LineTo(20.0f, 17.0f)
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
                    PathNode.MoveTo(17.0f, 17.0f),
                    PathNode.LineTo(15.0f, 19.0f),
                    PathNode.LineTo(17.0f, 21.0f)
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
        return _heartCode!!
    }

private var _heartCode: ImageVector? = null
