package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SchoolOff: ImageVector
    get() {
        if (_schoolOff != null) return _schoolOff!!
        _schoolOff = tablerOutlineIcon(
            name = "SchoolOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(22.0f, 9.0f),
                    PathNode.LineTo(12.0f, 5.0f),
                    PathNode.LineTo(9.864f, 5.854f),
                    PathNode.MoveTo(7.0f, 7.0f),
                    PathNode.LineTo(2.0f, 9.0f),
                    PathNode.LineTo(12.0f, 13.0f),
                    PathNode.LineTo(12.697f, 12.721f),
                    PathNode.MoveTo(15.575f, 11.57f),
                    PathNode.LineTo(22.0f, 9.0f),
                    PathNode.LineTo(22.0f, 15.0f)
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
                    PathNode.MoveTo(6.0f, 10.6f),
                    PathNode.LineTo(6.0f, 16.0f),
                    PathNode.CurveTo(6.0f, 17.657f, 8.686f, 19.0f, 12.0f, 19.0f),
                    PathNode.CurveTo(14.334f, 19.0f, 16.357f, 18.334f, 17.35f, 17.36f),
                    PathNode.MoveTo(18.0f, 14.0f),
                    PathNode.LineTo(18.0f, 10.6f)
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
        return _schoolOff!!
    }

private var _schoolOff: ImageVector? = null
