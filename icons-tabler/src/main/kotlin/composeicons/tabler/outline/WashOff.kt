package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WashOff: ImageVector
    get() {
        if (_washOff != null) return _washOff!!
        _washOff = tablerOutlineIcon(
            name = "WashOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 6.0f),
                    PathNode.LineTo(4.721f, 16.329f),
                    PathNode.CurveTo(4.881831f, 17.293377f, 5.716306f, 18.00012f, 6.694f, 18.0f),
                    PathNode.LineTo(17.306f, 18.0f),
                    PathNode.CurveTo(17.514f, 18.0f, 17.716f, 17.968f, 17.906f, 17.908f),
                    PathNode.MoveTo(19.427f, 15.436f),
                    PathNode.LineTo(21.0f, 6.0f)
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
                    PathNode.MoveTo(3.486f, 8.965f),
                    PathNode.CurveTo(3.654f, 8.985f, 3.826f, 8.998f, 4.0f, 9.0f),
                    PathNode.CurveTo(4.79f, 9.009f, 5.539f, 8.822f, 6.0f, 8.5f),
                    PathNode.CurveTo(6.461f, 8.180001f, 7.21f, 7.993f, 8.0f, 8.0f),
                    PathNode.MoveTo(12.92f, 8.919f),
                    PathNode.CurveTo(13.348f, 8.836f, 13.725f, 8.692f, 14.0f, 8.501f),
                    PathNode.CurveTo(14.461f, 8.179f, 15.21f, 7.993f, 16.0f, 8.001001f),
                    PathNode.CurveTo(16.79f, 7.993f, 17.539f, 8.179f, 18.0f, 8.501f),
                    PathNode.CurveTo(18.461f, 8.821f, 19.21f, 9.009f, 20.0f, 9.001f),
                    PathNode.CurveTo(20.17f, 9.001f, 20.339f, 8.986f, 20.503f, 8.966f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _washOff!!
    }

private var _washOff: ImageVector? = null
