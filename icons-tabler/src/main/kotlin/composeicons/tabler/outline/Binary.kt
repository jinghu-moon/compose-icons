package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Binary: ImageVector
    get() {
        if (_binary != null) return _binary!!
        _binary = tablerOutlineIcon(
            name = "Binary",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.0f, 10.0f),
                    PathNode.LineTo(11.0f, 5.0f),
                    PathNode.LineTo(10.0f, 5.0f),
                    PathNode.MoveTo(18.0f, 19.0f),
                    PathNode.LineTo(18.0f, 14.0f),
                    PathNode.LineTo(17.0f, 14.0f)
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
                    PathNode.MoveTo(15.0f, 5.5f),
                    PathNode.CurveTo(15.0f, 5.223858f, 15.223858f, 5.0f, 15.5f, 5.0f),
                    PathNode.LineTo(17.5f, 5.0f),
                    PathNode.CurveTo(17.776142f, 5.0f, 18.0f, 5.223858f, 18.0f, 5.5f),
                    PathNode.LineTo(18.0f, 9.5f),
                    PathNode.CurveTo(18.0f, 9.776142f, 17.776142f, 10.0f, 17.5f, 10.0f),
                    PathNode.LineTo(15.5f, 10.0f),
                    PathNode.CurveTo(15.223858f, 10.0f, 15.0f, 9.776142f, 15.0f, 9.5f),
                    PathNode.LineTo(15.0f, 5.5f)
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
                    PathNode.MoveTo(10.0f, 14.5f),
                    PathNode.CurveTo(10.0f, 14.223858f, 10.223858f, 14.0f, 10.5f, 14.0f),
                    PathNode.LineTo(12.5f, 14.0f),
                    PathNode.CurveTo(12.776142f, 14.0f, 13.0f, 14.223858f, 13.0f, 14.5f),
                    PathNode.LineTo(13.0f, 18.5f),
                    PathNode.CurveTo(13.0f, 18.776142f, 12.776142f, 19.0f, 12.5f, 19.0f),
                    PathNode.LineTo(10.5f, 19.0f),
                    PathNode.CurveTo(10.223858f, 19.0f, 10.0f, 18.776142f, 10.0f, 18.5f),
                    PathNode.LineTo(10.0f, 14.5f)
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
                    PathNode.MoveTo(6.0f, 10.0f),
                    PathNode.LineTo(6.01f, 10.0f),
                    PathNode.MoveTo(6.0f, 19.0f),
                    PathNode.LineTo(6.01f, 19.0f)
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
        return _binary!!
    }

private var _binary: ImageVector? = null
