package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ArrowBigRight: ImageVector
    get() {
        if (_arrowBigRight != null) return _arrowBigRight!!
        _arrowBigRight = lucideOutlineIcon(
            name = "ArrowBigRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.207f, 19.793f),
                    PathNode.CurveTo(13.004797f, 19.995264f, 12.70065f, 20.055782f, 12.436422f, 19.946325f),
                    PathNode.CurveTo(12.172194f, 19.836868f, 11.999939f, 19.579002f, 12.0f, 19.293f),
                    PathNode.LineTo(12.0f, 16.0f),
                    PathNode.CurveTo(12.0f, 15.447715f, 11.552285f, 15.0f, 11.0f, 15.0f),
                    PathNode.LineTo(5.0f, 15.0f),
                    PathNode.CurveTo(4.447716f, 15.0f, 4.0f, 14.552285f, 4.0f, 14.0f),
                    PathNode.LineTo(4.0f, 10.0f),
                    PathNode.CurveTo(4.0f, 9.447715f, 4.447716f, 9.0f, 5.0f, 9.0f),
                    PathNode.LineTo(11.0f, 9.0f),
                    PathNode.CurveTo(11.552285f, 9.0f, 12.0f, 8.552285f, 12.0f, 8.0f),
                    PathNode.LineTo(12.0f, 4.707f),
                    PathNode.CurveTo(11.999939f, 4.420998f, 12.172194f, 4.163131f, 12.436422f, 4.053675f),
                    PathNode.CurveTo(12.70065f, 3.944218f, 13.004797f, 4.004736f, 13.207f, 4.207f),
                    PathNode.LineTo(20.147f, 11.147f),
                    PathNode.CurveTo(20.37337f, 11.373358f, 20.500544f, 11.680373f, 20.500544f, 12.0005f),
                    PathNode.CurveTo(20.500544f, 12.320627f, 20.37337f, 12.627642f, 20.147f, 12.854f),
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
        return _arrowBigRight!!
    }

private var _arrowBigRight: ImageVector? = null
