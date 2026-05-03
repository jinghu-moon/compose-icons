package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FileDislike: ImageVector
    get() {
        if (_fileDislike != null) return _fileDislike!!
        _fileDislike = tablerOutlineIcon(
            name = "FileDislike",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 15.0f),
                    PathNode.CurveTo(3.0f, 14.447715f, 3.447715f, 14.0f, 4.0f, 14.0f),
                    PathNode.LineTo(5.0f, 14.0f),
                    PathNode.CurveTo(5.552285f, 14.0f, 6.0f, 14.447715f, 6.0f, 15.0f),
                    PathNode.LineTo(6.0f, 18.0f),
                    PathNode.CurveTo(6.0f, 18.552284f, 5.552285f, 19.0f, 5.0f, 19.0f),
                    PathNode.LineTo(4.0f, 19.0f),
                    PathNode.CurveTo(3.447715f, 19.0f, 3.0f, 18.552284f, 3.0f, 18.0f),
                    PathNode.LineTo(3.0f, 15.0f)
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
                    PathNode.MoveTo(6.0f, 15.0f),
                    PathNode.CurveTo(6.0f, 14.447715f, 6.447716f, 14.0f, 7.0f, 14.0f),
                    PathNode.LineTo(10.756f, 14.0f),
                    PathNode.CurveTo(11.197768f, 13.999969f, 11.587213f, 14.289817f, 11.714f, 14.713f),
                    PathNode.LineTo(12.914f, 17.713f),
                    PathNode.CurveTo(13.004f, 18.016f, 13.047f, 18.343f, 12.858f, 18.597f),
                    PathNode.CurveTo(12.67f, 18.851f, 12.316f, 19.0f, 12.0f, 19.0f),
                    PathNode.LineTo(10.0f, 19.0f),
                    PathNode.LineTo(10.0f, 21.467f),
                    PathNode.CurveTo(9.999757f, 21.951546f, 9.68248f, 22.378868f, 9.218719f, 22.519262f),
                    PathNode.CurveTo(8.754956f, 22.659657f, 8.253947f, 22.480055f, 7.985f, 22.077f),
                    PathNode.LineTo(6.0f, 19.0f),
                    PathNode.LineTo(6.0f, 15.0f)
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
                    PathNode.MoveTo(5.0f, 11.0f),
                    PathNode.LineTo(5.0f, 5.0f),
                    PathNode.CurveTo(5.0f, 3.895431f, 5.895431f, 3.0f, 7.0f, 3.0f),
                    PathNode.LineTo(14.0f, 3.0f),
                    PathNode.LineTo(19.0f, 8.0f),
                    PathNode.LineTo(19.0f, 19.0f),
                    PathNode.CurveTo(19.0f, 20.10457f, 18.10457f, 21.0f, 17.0f, 21.0f),
                    PathNode.LineTo(14.5f, 21.0f)
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
        return _fileDislike!!
    }

private var _fileDislike: ImageVector? = null
