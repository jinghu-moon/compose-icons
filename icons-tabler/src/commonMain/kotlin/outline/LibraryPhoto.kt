package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LibraryPhoto: ImageVector
    get() {
        if (_libraryPhoto != null) return _libraryPhoto!!
        _libraryPhoto = tablerOutlineIcon(
            name = "LibraryPhoto",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 5.667f),
                    PathNode.CurveTo(7.0f, 4.194057f, 8.194057f, 3.0f, 9.667f, 3.0f),
                    PathNode.LineTo(18.333f, 3.0f),
                    PathNode.CurveTo(19.805943f, 3.0f, 21.0f, 4.194057f, 21.0f, 5.667f),
                    PathNode.LineTo(21.0f, 14.333f),
                    PathNode.CurveTo(21.0f, 15.805943f, 19.805943f, 17.0f, 18.333f, 17.0f),
                    PathNode.LineTo(9.667f, 17.0f),
                    PathNode.CurveTo(8.194057f, 17.0f, 7.0f, 15.805943f, 7.0f, 14.333f),
                    PathNode.LineTo(7.0f, 5.667f)
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
                    PathNode.MoveTo(4.012f, 7.26f),
                    PathNode.CurveTo(3.387801f, 7.615847f, 3.001733f, 8.278496f, 3.0f, 8.997f),
                    PathNode.LineTo(3.0f, 18.997f),
                    PathNode.CurveTo(3.0f, 20.097f, 3.9f, 20.997f, 5.0f, 20.997f),
                    PathNode.LineTo(15.0f, 20.997f),
                    PathNode.CurveTo(15.75f, 20.997f, 16.158f, 20.612f, 16.5f, 19.997f)
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
                    PathNode.MoveTo(17.0f, 7.0f),
                    PathNode.LineTo(17.01f, 7.0f)
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
                    PathNode.MoveTo(7.0f, 13.0f),
                    PathNode.LineTo(10.644f, 9.356f),
                    PathNode.CurveTo(10.870952f, 9.128836f, 11.178891f, 9.001198f, 11.5f, 9.001198f),
                    PathNode.CurveTo(11.821109f, 9.001198f, 12.129048f, 9.128836f, 12.356f, 9.356f),
                    PathNode.LineTo(16.0f, 13.0f)
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
                    PathNode.MoveTo(15.0f, 12.0f),
                    PathNode.LineTo(16.644f, 10.356f),
                    PathNode.CurveTo(16.87095f, 10.128836f, 17.178892f, 10.001198f, 17.5f, 10.001198f),
                    PathNode.CurveTo(17.821108f, 10.001198f, 18.12905f, 10.128836f, 18.356f, 10.356f),
                    PathNode.LineTo(21.0f, 13.0f)
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
        return _libraryPhoto!!
    }

private var _libraryPhoto: ImageVector? = null
