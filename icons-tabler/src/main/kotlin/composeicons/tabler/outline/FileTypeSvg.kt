package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FileTypeSvg: ImageVector
    get() {
        if (_fileTypeSvg != null) return _fileTypeSvg!!
        _fileTypeSvg = tablerOutlineIcon(
            name = "FileTypeSvg",
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
                    PathNode.MoveTo(5.0f, 12.0f),
                    PathNode.LineTo(5.0f, 5.0f),
                    PathNode.CurveTo(5.0f, 3.895431f, 5.895431f, 3.0f, 7.0f, 3.0f),
                    PathNode.LineTo(14.0f, 3.0f),
                    PathNode.LineTo(19.0f, 8.0f),
                    PathNode.LineTo(19.0f, 12.0f)
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
                    PathNode.MoveTo(4.0f, 20.25f),
                    PathNode.CurveTo(4.0f, 20.664f, 4.336f, 21.0f, 4.75f, 21.0f),
                    PathNode.LineTo(6.0f, 21.0f),
                    PathNode.CurveTo(6.552285f, 21.0f, 7.0f, 20.552284f, 7.0f, 20.0f),
                    PathNode.LineTo(7.0f, 19.0f),
                    PathNode.CurveTo(7.0f, 18.447716f, 6.552285f, 18.0f, 6.0f, 18.0f),
                    PathNode.LineTo(5.0f, 18.0f),
                    PathNode.CurveTo(4.447716f, 18.0f, 4.0f, 17.552284f, 4.0f, 17.0f),
                    PathNode.LineTo(4.0f, 16.0f),
                    PathNode.CurveTo(4.0f, 15.447715f, 4.447716f, 15.0f, 5.0f, 15.0f),
                    PathNode.LineTo(6.25f, 15.0f),
                    PathNode.CurveTo(6.664214f, 15.0f, 7.0f, 15.335787f, 7.0f, 15.75f)
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
                    PathNode.MoveTo(10.0f, 15.0f),
                    PathNode.LineTo(12.0f, 21.0f),
                    PathNode.LineTo(14.0f, 15.0f)
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
                    PathNode.MoveTo(20.0f, 15.0f),
                    PathNode.LineTo(19.0f, 15.0f),
                    PathNode.CurveTo(17.89543f, 15.0f, 17.0f, 15.895431f, 17.0f, 17.0f),
                    PathNode.LineTo(17.0f, 19.0f),
                    PathNode.CurveTo(17.0f, 20.10457f, 17.89543f, 21.0f, 19.0f, 21.0f),
                    PathNode.LineTo(20.0f, 21.0f),
                    PathNode.LineTo(20.0f, 18.0f)
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
        return _fileTypeSvg!!
    }

private var _fileTypeSvg: ImageVector? = null
