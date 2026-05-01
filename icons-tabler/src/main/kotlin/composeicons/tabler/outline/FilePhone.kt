package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FilePhone: ImageVector
    get() {
        if (_filePhone != null) return _filePhone!!
        _filePhone = tablerOutlineIcon(
            name = "FilePhone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 3.0f),
                    PathNode.LineTo(14.0f, 7.0f),
                    PathNode.CurveTo(14.0f, 7.552285f, 14.447715f, 8.0f, 15.0f, 8.0f),
                    PathNode.LineTo(19.0f, 8.0f)
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
                    PathNode.MoveTo(17.0f, 21.0f),
                    PathNode.LineTo(7.0f, 21.0f),
                    PathNode.CurveTo(5.895431f, 21.0f, 5.0f, 20.10457f, 5.0f, 19.0f),
                    PathNode.LineTo(5.0f, 5.0f),
                    PathNode.CurveTo(5.0f, 3.895431f, 5.895431f, 3.0f, 7.0f, 3.0f),
                    PathNode.LineTo(14.0f, 3.0f),
                    PathNode.LineTo(19.0f, 8.0f),
                    PathNode.LineTo(19.0f, 19.0f),
                    PathNode.CurveTo(19.0f, 20.10457f, 18.10457f, 21.0f, 17.0f, 21.0f)
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
                    PathNode.MoveTo(9.0f, 12.0f),
                    PathNode.CurveTo(9.0f, 12.276142f, 9.223858f, 12.5f, 9.5f, 12.5f),
                    PathNode.CurveTo(9.776142f, 12.5f, 10.0f, 12.276142f, 10.0f, 12.0f),
                    PathNode.LineTo(10.0f, 11.0f),
                    PathNode.CurveTo(10.0f, 10.723858f, 9.776142f, 10.5f, 9.5f, 10.5f),
                    PathNode.CurveTo(9.223858f, 10.5f, 9.0f, 10.723858f, 9.0f, 11.0f),
                    PathNode.LineTo(9.0f, 12.0f),
                    PathNode.CurveTo(9.0f, 14.761424f, 11.238576f, 17.0f, 14.0f, 17.0f),
                    PathNode.LineTo(15.0f, 17.0f),
                    PathNode.CurveTo(15.276142f, 17.0f, 15.5f, 16.776142f, 15.5f, 16.5f),
                    PathNode.CurveTo(15.5f, 16.223858f, 15.276142f, 16.0f, 15.0f, 16.0f),
                    PathNode.LineTo(14.0f, 16.0f),
                    PathNode.CurveTo(13.723858f, 16.0f, 13.5f, 16.223858f, 13.5f, 16.5f),
                    PathNode.CurveTo(13.5f, 16.776142f, 13.723858f, 17.0f, 14.0f, 17.0f)
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
        return _filePhone!!
    }

private var _filePhone: ImageVector? = null
