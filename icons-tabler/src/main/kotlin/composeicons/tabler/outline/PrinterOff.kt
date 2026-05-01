package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PrinterOff: ImageVector
    get() {
        if (_printerOff != null) return _printerOff!!
        _printerOff = tablerOutlineIcon(
            name = "PrinterOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.412f, 16.416f),
                    PathNode.CurveTo(20.775f, 16.054f, 21.0f, 15.553f, 21.0f, 15.0f),
                    PathNode.LineTo(21.0f, 11.0f),
                    PathNode.CurveTo(21.0f, 9.895431f, 20.10457f, 9.0f, 19.0f, 9.0f),
                    PathNode.LineTo(13.0f, 9.0f),
                    PathNode.MoveTo(9.0f, 9.0f),
                    PathNode.LineTo(5.0f, 9.0f),
                    PathNode.CurveTo(3.895431f, 9.0f, 3.0f, 9.895431f, 3.0f, 11.0f),
                    PathNode.LineTo(3.0f, 15.0f),
                    PathNode.CurveTo(3.0f, 16.10457f, 3.895431f, 17.0f, 5.0f, 17.0f),
                    PathNode.LineTo(7.0f, 17.0f)
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
                    PathNode.MoveTo(17.0f, 9.0f),
                    PathNode.LineTo(17.0f, 5.0f),
                    PathNode.CurveTo(17.0f, 3.895431f, 16.10457f, 3.0f, 15.0f, 3.0f),
                    PathNode.LineTo(9.0f, 3.0f),
                    PathNode.CurveTo(8.449f, 3.0f, 7.95f, 3.223f, 7.588f, 3.584f),
                    PathNode.MoveTo(7.0f, 7.0f),
                    PathNode.LineTo(7.0f, 9.0f)
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
                    PathNode.MoveTo(17.0f, 17.0f),
                    PathNode.LineTo(17.0f, 19.0f),
                    PathNode.CurveTo(17.0f, 20.10457f, 16.10457f, 21.0f, 15.0f, 21.0f),
                    PathNode.LineTo(9.0f, 21.0f),
                    PathNode.CurveTo(7.895431f, 21.0f, 7.0f, 20.10457f, 7.0f, 19.0f),
                    PathNode.LineTo(7.0f, 15.0f),
                    PathNode.CurveTo(7.0f, 13.895431f, 7.895431f, 13.0f, 9.0f, 13.0f),
                    PathNode.LineTo(13.0f, 13.0f)
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
        return _printerOff!!
    }

private var _printerOff: ImageVector? = null
