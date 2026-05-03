package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ArrowBigDown: ImageVector
    get() {
        if (_arrowBigDown != null) return _arrowBigDown!!
        _arrowBigDown = lucideOutlineIcon(
            name = "ArrowBigDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 5.0f),
                    PathNode.CurveTo(9.0f, 4.447716f, 9.447715f, 4.0f, 10.0f, 4.0f),
                    PathNode.LineTo(14.0f, 4.0f),
                    PathNode.CurveTo(14.552285f, 4.0f, 15.0f, 4.447716f, 15.0f, 5.0f),
                    PathNode.LineTo(15.0f, 11.0f),
                    PathNode.CurveTo(15.0f, 11.552285f, 15.447715f, 12.0f, 16.0f, 12.0f),
                    PathNode.LineTo(19.293f, 12.0f),
                    PathNode.CurveTo(19.579002f, 11.999939f, 19.836868f, 12.172194f, 19.946325f, 12.436422f),
                    PathNode.CurveTo(20.055782f, 12.70065f, 19.995264f, 13.004797f, 19.793f, 13.207f),
                    PathNode.LineTo(12.707f, 20.293f),
                    PathNode.CurveTo(12.3165f, 20.683382f, 11.6835f, 20.683382f, 11.293f, 20.293f),
                    PathNode.LineTo(4.207f, 13.207f),
                    PathNode.CurveTo(4.004736f, 13.004797f, 3.944218f, 12.70065f, 4.053675f, 12.436422f),
                    PathNode.CurveTo(4.163131f, 12.172194f, 4.420998f, 11.999939f, 4.707f, 12.0f),
                    PathNode.LineTo(8.0f, 12.0f),
                    PathNode.CurveTo(8.552285f, 12.0f, 9.0f, 11.552285f, 9.0f, 11.0f),
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
        return _arrowBigDown!!
    }

private var _arrowBigDown: ImageVector? = null
