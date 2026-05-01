package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SailboatOff: ImageVector
    get() {
        if (_sailboatOff != null) return _sailboatOff!!
        _sailboatOff = tablerOutlineIcon(
            name = "SailboatOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.0f, 20.0f),
                    PathNode.CurveTo(2.461177f, 20.642508f, 3.209288f, 21.016563f, 4.0f, 21.0f),
                    PathNode.CurveTo(4.790712f, 21.016563f, 5.538824f, 20.642508f, 6.0f, 20.0f),
                    PathNode.CurveTo(6.461177f, 19.357492f, 7.209288f, 18.983437f, 8.0f, 19.0f),
                    PathNode.CurveTo(8.790711f, 18.983437f, 9.538824f, 19.357492f, 10.0f, 20.0f),
                    PathNode.CurveTo(10.461176f, 20.642508f, 11.209289f, 21.016563f, 12.0f, 21.0f),
                    PathNode.CurveTo(12.790711f, 21.016563f, 13.538824f, 20.642508f, 14.0f, 20.0f),
                    PathNode.CurveTo(14.461176f, 19.357492f, 15.209289f, 18.983437f, 16.0f, 19.0f),
                    PathNode.CurveTo(16.790712f, 18.983437f, 17.538824f, 19.357492f, 18.0f, 20.0f),
                    PathNode.CurveTo(18.461176f, 20.642508f, 19.209288f, 21.016563f, 20.0f, 21.0f),
                    PathNode.CurveTo(20.790712f, 21.016563f, 21.538824f, 20.642508f, 22.0f, 20.0f)
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
                    PathNode.MoveTo(4.0f, 18.0f),
                    PathNode.LineTo(3.0f, 15.0f),
                    PathNode.LineTo(15.0f, 15.0f),
                    PathNode.MoveTo(19.0f, 15.0f),
                    PathNode.LineTo(21.0f, 15.0f),
                    PathNode.LineTo(20.494f, 16.517f)
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
                    PathNode.MoveTo(11.0f, 11.0f),
                    PathNode.LineTo(11.0f, 12.0f),
                    PathNode.LineTo(12.0f, 12.0f),
                    PathNode.MoveTo(16.0f, 12.0f),
                    PathNode.LineTo(18.0f, 12.0f),
                    PathNode.LineTo(11.0f, 3.0f),
                    PathNode.LineTo(11.0f, 7.0f)
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
                    PathNode.MoveTo(7.713f, 7.718f),
                    PathNode.LineTo(6.0f, 12.0f)
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
        return _sailboatOff!!
    }

private var _sailboatOff: ImageVector? = null
