package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MushroomOff: ImageVector
    get() {
        if (_mushroomOff != null) return _mushroomOff!!
        _mushroomOff = tablerOutlineIcon(
            name = "MushroomOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.874f, 5.89f),
                    PathNode.CurveTo(4.658848f, 7.35383f, 3.99568f, 9.197535f, 4.0f, 11.1f),
                    PathNode.CurveTo(4.0f, 11.597056f, 4.402944f, 12.0f, 4.9f, 12.0f),
                    PathNode.LineTo(12.0f, 12.0f),
                    PathNode.MoveTo(16.0f, 12.0f),
                    PathNode.LineTo(19.1f, 12.0f),
                    PathNode.CurveTo(19.597055f, 12.0f, 20.0f, 11.597056f, 20.0f, 11.1f),
                    PathNode.CurveTo(20.0f, 6.626f, 16.418f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(10.57f, 3.0f, 9.226f, 3.38f, 8.064f, 4.047f)
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
                    PathNode.MoveTo(10.0f, 12.0f),
                    PathNode.LineTo(10.0f, 19.0f),
                    PathNode.CurveTo(10.0f, 20.10457f, 10.895431f, 21.0f, 12.0f, 21.0f),
                    PathNode.CurveTo(13.104569f, 21.0f, 14.0f, 20.10457f, 14.0f, 19.0f),
                    PathNode.LineTo(14.0f, 14.0f)
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
        return _mushroomOff!!
    }

private var _mushroomOff: ImageVector? = null
