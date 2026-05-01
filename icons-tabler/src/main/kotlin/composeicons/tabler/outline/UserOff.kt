package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.UserOff: ImageVector
    get() {
        if (_userOff != null) return _userOff!!
        _userOff = tablerOutlineIcon(
            name = "UserOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.180001f, 8.189f),
                    PathNode.CurveTo(8.570565f, 9.439394f, 9.547256f, 10.420191f, 10.796f, 10.816f),
                    PathNode.MoveTo(14.303f, 10.271f),
                    PathNode.CurveTo(15.607598f, 9.350628f, 16.239937f, 7.742602f, 15.911686f, 6.180131f),
                    PathNode.CurveTo(15.583437f, 4.61766f, 14.357474f, 3.400032f, 12.792802f, 3.082448f),
                    PathNode.CurveTo(11.228128f, 2.764863f, 9.624453f, 3.408154f, 8.713f, 4.719f)
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
                    PathNode.MoveTo(6.0f, 21.0f),
                    PathNode.LineTo(6.0f, 19.0f),
                    PathNode.CurveTo(6.0f, 16.790861f, 7.790861f, 15.0f, 10.0f, 15.0f),
                    PathNode.LineTo(14.0f, 15.0f),
                    PathNode.CurveTo(14.412f, 15.0f, 14.81f, 15.062f, 15.183f, 15.178f),
                    PathNode.MoveTo(17.816f, 17.796f),
                    PathNode.CurveTo(17.936f, 18.176f, 18.0f, 18.581f, 18.0f, 19.0f),
                    PathNode.LineTo(18.0f, 21.0f)
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
        return _userOff!!
    }

private var _userOff: ImageVector? = null
