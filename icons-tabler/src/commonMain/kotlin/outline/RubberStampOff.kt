package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RubberStampOff: ImageVector
    get() {
        if (_rubberStampOff != null) return _rubberStampOff!!
        _rubberStampOff = tablerOutlineIcon(
            name = "RubberStampOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.273f, 8.273f),
                    PathNode.CurveTo(9.078f, 10.614f, 11.13f, 13.8f, 6.789f, 13.8f),
                    PathNode.CurveTo(4.421f, 13.8f, 3.0f, 13.8f, 3.0f, 17.85f),
                    PathNode.LineTo(17.85f, 17.85f)
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
                    PathNode.MoveTo(5.0f, 21.0f),
                    PathNode.LineTo(19.0f, 21.0f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.712f, 4.722f),
                    PathNode.CurveTo(9.458061f, 3.642141f, 10.687484f, 2.998265f, 12.0f, 3.0f),
                    PathNode.CurveTo(14.209139f, 3.0f, 16.0f, 4.790861f, 16.0f, 7.0f),
                    PathNode.CurveTo(16.0f, 7.992f, 15.194f, 9.464f, 14.777f, 10.785f),
                    PathNode.MoveTo(20.975f, 16.981f),
                    PathNode.CurveTo(20.793f, 14.098f, 19.643f, 13.828f, 17.803f, 13.803f)
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
        return _rubberStampOff!!
    }

private var _rubberStampOff: ImageVector? = null
