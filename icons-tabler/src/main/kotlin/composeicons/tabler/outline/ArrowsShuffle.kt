package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowsShuffle: ImageVector
    get() {
        if (_arrowsShuffle != null) return _arrowsShuffle!!
        _arrowsShuffle = tablerOutlineIcon(
            name = "ArrowsShuffle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 4.0f),
                    PathNode.LineTo(21.0f, 7.0f),
                    PathNode.LineTo(18.0f, 10.0f)
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
                    PathNode.MoveTo(18.0f, 20.0f),
                    PathNode.LineTo(21.0f, 17.0f),
                    PathNode.LineTo(18.0f, 14.0f)
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
                    PathNode.MoveTo(3.0f, 7.0f),
                    PathNode.LineTo(6.0f, 7.0f),
                    PathNode.CurveTo(8.761424f, 7.0f, 11.0f, 9.238576f, 11.0f, 12.0f),
                    PathNode.CurveTo(11.0f, 14.761424f, 13.238576f, 17.0f, 16.0f, 17.0f),
                    PathNode.LineTo(21.0f, 17.0f)
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
                    PathNode.MoveTo(21.0f, 7.0f),
                    PathNode.LineTo(16.0f, 7.0f),
                    PathNode.CurveTo(14.917891f, 6.998406f, 13.864731f, 7.349459f, 13.0f, 8.0f),
                    PathNode.MoveTo(9.0f, 16.0f),
                    PathNode.CurveTo(8.135064f, 16.65015f, 7.082039f, 17.001158f, 6.0f, 17.0f),
                    PathNode.LineTo(3.0f, 17.0f)
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
        return _arrowsShuffle!!
    }

private var _arrowsShuffle: ImageVector? = null
