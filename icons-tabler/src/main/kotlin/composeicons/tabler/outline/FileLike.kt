package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FileLike: ImageVector
    get() {
        if (_fileLike != null) return _fileLike!!
        _fileLike = tablerOutlineIcon(
            name = "FileLike",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 17.0f),
                    PathNode.CurveTo(3.0f, 16.447716f, 3.447715f, 16.0f, 4.0f, 16.0f),
                    PathNode.LineTo(5.0f, 16.0f),
                    PathNode.CurveTo(5.552285f, 16.0f, 6.0f, 16.447716f, 6.0f, 17.0f),
                    PathNode.LineTo(6.0f, 20.0f),
                    PathNode.CurveTo(6.0f, 20.552284f, 5.552285f, 21.0f, 5.0f, 21.0f),
                    PathNode.LineTo(4.0f, 21.0f),
                    PathNode.CurveTo(3.447715f, 21.0f, 3.0f, 20.552284f, 3.0f, 20.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 20.0f),
                    PathNode.CurveTo(6.0f, 20.552284f, 6.447716f, 21.0f, 7.0f, 21.0f),
                    PathNode.LineTo(10.756f, 21.0f),
                    PathNode.CurveTo(11.197768f, 21.00003f, 11.587213f, 20.710184f, 11.714f, 20.287f),
                    PathNode.LineTo(12.914f, 17.287f),
                    PathNode.CurveTo(13.004f, 16.984f, 13.047f, 16.657f, 12.858f, 16.403f),
                    PathNode.CurveTo(12.67f, 16.149f, 12.316f, 16.0f, 12.0f, 16.0f),
                    PathNode.LineTo(10.0f, 16.0f),
                    PathNode.LineTo(10.0f, 13.533f),
                    PathNode.CurveTo(9.999757f, 13.048453f, 9.68248f, 12.621133f, 9.218719f, 12.480738f),
                    PathNode.CurveTo(8.754956f, 12.340343f, 8.253947f, 12.519945f, 7.985f, 12.923f),
                    PathNode.LineTo(6.0f, 16.0f),
                    PathNode.LineTo(6.0f, 20.0f)
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
                    PathNode.MoveTo(5.0f, 12.1f),
                    PathNode.LineTo(5.0f, 5.0f),
                    PathNode.CurveTo(5.0f, 3.895431f, 5.895431f, 3.0f, 7.0f, 3.0f),
                    PathNode.LineTo(14.0f, 3.0f),
                    PathNode.LineTo(19.0f, 8.0f),
                    PathNode.LineTo(19.0f, 19.0f),
                    PathNode.CurveTo(19.0f, 20.10457f, 18.10457f, 21.0f, 17.0f, 21.0f),
                    PathNode.LineTo(14.7f, 21.0f)
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
        return _fileLike!!
    }

private var _fileLike: ImageVector? = null
