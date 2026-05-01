package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.EmpathizeOff: ImageVector
    get() {
        if (_empathizeOff != null) return _empathizeOff!!
        _empathizeOff = tablerOutlineIcon(
            name = "EmpathizeOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 8.0f),
                    PathNode.CurveTo(13.380712f, 8.0f, 14.5f, 6.880712f, 14.5f, 5.5f),
                    PathNode.CurveTo(14.5f, 4.119288f, 13.380712f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(10.619288f, 3.0f, 9.5f, 4.119288f, 9.5f, 5.5f)
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
                    PathNode.MoveTo(12.317f, 12.315f),
                    PathNode.LineTo(12.0f, 12.632f),
                    PathNode.LineTo(11.272f, 11.905f),
                    PathNode.CurveTo(10.493614f, 11.116472f, 9.352431f, 10.805409f, 8.281571f, 11.08987f),
                    PathNode.CurveTo(7.210711f, 11.374331f, 6.374332f, 12.210711f, 6.089871f, 13.28157f),
                    PathNode.CurveTo(5.805409f, 14.352431f, 6.116472f, 15.493614f, 6.905f, 16.272f),
                    PathNode.LineTo(12.0f, 21.368f),
                    PathNode.LineTo(16.689f, 16.678f),
                    PathNode.MoveTo(18.013f, 14.005f),
                    PathNode.CurveTo(17.976421f, 12.352431f, 16.644604f, 11.021935f, 14.992f, 10.987f)
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
        return _empathizeOff!!
    }

private var _empathizeOff: ImageVector? = null
