package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ClipboardPenLine: ImageVector
    get() {
        if (_clipboardPenLine != null) return _clipboardPenLine!!
        _clipboardPenLine = lucideOutlineIcon(
            name = "ClipboardPenLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 2.0f),
                    PathNode.LineTo(15.0f, 2.0f),
                    PathNode.CurveTo(15.552285f, 2.0f, 16.0f, 2.447715f, 16.0f, 3.0f),
                    PathNode.LineTo(16.0f, 5.0f),
                    PathNode.CurveTo(16.0f, 5.552285f, 15.552285f, 6.0f, 15.0f, 6.0f),
                    PathNode.LineTo(9.0f, 6.0f),
                    PathNode.CurveTo(8.447715f, 6.0f, 8.0f, 5.552285f, 8.0f, 5.0f),
                    PathNode.LineTo(8.0f, 3.0f),
                    PathNode.CurveTo(8.0f, 2.447715f, 8.447715f, 2.0f, 9.0f, 2.0f),
                    PathNode.Close
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
                    PathNode.MoveTo(8.0f, 4.0f),
                    PathNode.LineTo(6.0f, 4.0f),
                    PathNode.CurveTo(4.895431f, 4.0f, 4.0f, 4.895431f, 4.0f, 6.0f),
                    PathNode.LineTo(4.0f, 20.0f),
                    PathNode.CurveTo(4.0f, 21.10457f, 4.895431f, 22.0f, 6.0f, 22.0f),
                    PathNode.LineTo(18.0f, 22.0f),
                    PathNode.CurveTo(19.10457f, 22.0f, 20.0f, 21.10457f, 20.0f, 20.0f),
                    PathNode.LineTo(20.0f, 19.5f)
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
                    PathNode.MoveTo(16.0f, 4.0f),
                    PathNode.LineTo(18.0f, 4.0f),
                    PathNode.CurveTo(18.713799f, 4.000732f, 19.3731f, 4.381832f, 19.73f, 5.0f)
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
                    PathNode.MoveTo(8.0f, 18.0f),
                    PathNode.LineTo(9.0f, 18.0f)
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
                    PathNode.MoveTo(21.378f, 12.626f),
                    PathNode.CurveTo(22.20753f, 11.796469f, 22.20753f, 10.451531f, 21.378f, 9.622f),
                    PathNode.CurveTo(20.548468f, 8.792468f, 19.203531f, 8.792468f, 18.374f, 9.622f),
                    PathNode.LineTo(14.364f, 13.634f),
                    PathNode.CurveTo(14.126247f, 13.871622f, 13.952221f, 14.165335f, 13.858f, 14.488f),
                    PathNode.LineTo(13.021f, 17.358f),
                    PathNode.CurveTo(12.969881f, 17.533264f, 13.018352f, 17.722458f, 13.147447f, 17.851551f),
                    PathNode.CurveTo(13.276542f, 17.980648f, 13.465735f, 18.02912f, 13.641f, 17.978f),
                    PathNode.LineTo(16.511f, 17.141f),
                    PathNode.CurveTo(16.833666f, 17.04678f, 17.127378f, 16.872753f, 17.365f, 16.635f),
                    PathNode.Close
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
        return _clipboardPenLine!!
    }

private var _clipboardPenLine: ImageVector? = null
