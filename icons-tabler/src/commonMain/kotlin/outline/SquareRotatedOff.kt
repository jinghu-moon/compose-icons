package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SquareRotatedOff: ImageVector
    get() {
        if (_squareRotatedOff != null) return _squareRotatedOff!!
        _squareRotatedOff = tablerOutlineIcon(
            name = "SquareRotatedOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.964f, 16.952f),
                    PathNode.LineTo(13.502f, 20.413f),
                    PathNode.CurveTo(12.72f, 21.196f, 11.28f, 21.196f, 10.502f, 20.413f),
                    PathNode.LineTo(3.591f, 13.503f),
                    PathNode.CurveTo(2.808f, 12.72f, 2.808f, 11.28f, 3.591f, 10.503f),
                    PathNode.LineTo(7.046f, 7.047f),
                    PathNode.MoveTo(9.046f, 5.047f),
                    PathNode.LineTo(10.499f, 3.595f),
                    PathNode.CurveTo(11.281f, 2.812f, 12.721f, 2.812f, 13.499f, 3.595f),
                    PathNode.LineTo(20.41f, 10.505f),
                    PathNode.CurveTo(21.193f, 11.288f, 21.193f, 12.728f, 20.41f, 13.505f),
                    PathNode.LineTo(18.962f, 14.955f)
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
        return _squareRotatedOff!!
    }

private var _squareRotatedOff: ImageVector? = null
