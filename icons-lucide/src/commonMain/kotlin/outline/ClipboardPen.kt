package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ClipboardPen: ImageVector
    get() {
        if (_clipboardPen != null) return _clipboardPen!!
        _clipboardPen = lucideOutlineIcon(
            name = "ClipboardPen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 4.0f),
                    PathNode.LineTo(18.0f, 4.0f),
                    PathNode.CurveTo(19.10457f, 4.0f, 20.0f, 4.895431f, 20.0f, 6.0f),
                    PathNode.LineTo(20.0f, 8.0f)
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
                    PathNode.MoveTo(21.34f, 15.664f),
                    PathNode.CurveTo(22.16953f, 14.834468f, 22.16953f, 13.489532f, 21.34f, 12.66f),
                    PathNode.CurveTo(20.510468f, 11.830468f, 19.165531f, 11.830468f, 18.336f, 12.66f),
                    PathNode.LineTo(13.326f, 17.672f),
                    PathNode.CurveTo(13.088247f, 17.909622f, 12.914221f, 18.203335f, 12.82f, 18.526f),
                    PathNode.LineTo(11.983f, 21.396f),
                    PathNode.CurveTo(11.931881f, 21.571264f, 11.980351f, 21.760458f, 12.109447f, 21.889553f),
                    PathNode.CurveTo(12.238542f, 22.018648f, 12.427735f, 22.06712f, 12.603f, 22.016f),
                    PathNode.LineTo(15.473f, 21.179f),
                    PathNode.CurveTo(15.795666f, 21.08478f, 16.089378f, 20.910753f, 16.327f, 20.673f),
                    PathNode.Close
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
                    PathNode.MoveTo(8.0f, 22.0f),
                    PathNode.LineTo(6.0f, 22.0f),
                    PathNode.CurveTo(4.895431f, 22.0f, 4.0f, 21.10457f, 4.0f, 20.0f),
                    PathNode.LineTo(4.0f, 6.0f),
                    PathNode.CurveTo(4.0f, 4.895431f, 4.895431f, 4.0f, 6.0f, 4.0f),
                    PathNode.LineTo(8.0f, 4.0f)
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
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _clipboardPen!!
    }

private var _clipboardPen: ImageVector? = null
