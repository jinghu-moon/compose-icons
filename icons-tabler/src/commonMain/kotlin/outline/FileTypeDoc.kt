package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FileTypeDoc: ImageVector
    get() {
        if (_fileTypeDoc != null) return _fileTypeDoc!!
        _fileTypeDoc = tablerOutlineIcon(
            name = "FileTypeDoc",
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
                    PathNode.MoveTo(5.0f, 12.0f),
                    PathNode.LineTo(5.0f, 5.0f),
                    PathNode.CurveTo(5.0f, 3.895431f, 5.895431f, 3.0f, 7.0f, 3.0f),
                    PathNode.LineTo(14.0f, 3.0f),
                    PathNode.LineTo(19.0f, 8.0f),
                    PathNode.LineTo(19.0f, 12.0f)
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
                    PathNode.MoveTo(5.0f, 15.0f),
                    PathNode.LineTo(5.0f, 21.0f),
                    PathNode.LineTo(6.0f, 21.0f),
                    PathNode.CurveTo(7.10457f, 21.0f, 8.0f, 20.10457f, 8.0f, 19.0f),
                    PathNode.LineTo(8.0f, 17.0f),
                    PathNode.CurveTo(8.0f, 15.895431f, 7.10457f, 15.0f, 6.0f, 15.0f),
                    PathNode.LineTo(5.0f, 15.0f)
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
                    PathNode.MoveTo(20.0f, 16.5f),
                    PathNode.CurveTo(20.0f, 15.671573f, 19.328426f, 15.0f, 18.5f, 15.0f),
                    PathNode.CurveTo(17.671574f, 15.0f, 17.0f, 15.671573f, 17.0f, 16.5f),
                    PathNode.LineTo(17.0f, 19.5f),
                    PathNode.CurveTo(17.0f, 20.328426f, 17.671574f, 21.0f, 18.5f, 21.0f),
                    PathNode.CurveTo(19.328426f, 21.0f, 20.0f, 20.328426f, 20.0f, 19.5f)
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
                    PathNode.MoveTo(12.5f, 15.0f),
                    PathNode.CurveTo(13.328427f, 15.0f, 14.0f, 15.671573f, 14.0f, 16.5f),
                    PathNode.LineTo(14.0f, 19.5f),
                    PathNode.CurveTo(14.0f, 20.328426f, 13.328427f, 21.0f, 12.5f, 21.0f),
                    PathNode.CurveTo(11.671573f, 21.0f, 11.0f, 20.328426f, 11.0f, 19.5f),
                    PathNode.LineTo(11.0f, 16.5f),
                    PathNode.CurveTo(11.0f, 15.671573f, 11.671573f, 15.0f, 12.5f, 15.0f)
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
        return _fileTypeDoc!!
    }

private var _fileTypeDoc: ImageVector? = null
