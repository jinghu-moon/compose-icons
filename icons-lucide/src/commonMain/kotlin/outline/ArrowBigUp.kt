package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ArrowBigUp: ImageVector
    get() {
        if (_arrowBigUp != null) return _arrowBigUp!!
        _arrowBigUp = lucideOutlineIcon(
            name = "ArrowBigUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 19.0f),
                    PathNode.CurveTo(9.0f, 19.552284f, 9.447715f, 20.0f, 10.0f, 20.0f),
                    PathNode.LineTo(14.0f, 20.0f),
                    PathNode.CurveTo(14.552285f, 20.0f, 15.0f, 19.552284f, 15.0f, 19.0f),
                    PathNode.LineTo(15.0f, 13.0f),
                    PathNode.CurveTo(15.0f, 12.447715f, 15.447715f, 12.0f, 16.0f, 12.0f),
                    PathNode.LineTo(19.293f, 12.0f),
                    PathNode.CurveTo(19.579002f, 12.000061f, 19.836868f, 11.827806f, 19.946325f, 11.563578f),
                    PathNode.CurveTo(20.055782f, 11.29935f, 19.995264f, 10.995203f, 19.793f, 10.793f),
                    PathNode.LineTo(12.707f, 3.707f),
                    PathNode.CurveTo(12.3165f, 3.316618f, 11.6835f, 3.316618f, 11.293f, 3.707f),
                    PathNode.LineTo(4.207f, 10.793f),
                    PathNode.CurveTo(4.004736f, 10.995203f, 3.944218f, 11.29935f, 4.053675f, 11.563578f),
                    PathNode.CurveTo(4.163131f, 11.827806f, 4.420998f, 12.000061f, 4.707f, 12.0f),
                    PathNode.LineTo(8.0f, 12.0f),
                    PathNode.CurveTo(8.552285f, 12.0f, 9.0f, 12.447715f, 9.0f, 13.0f),
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
        return _arrowBigUp!!
    }

private var _arrowBigUp: ImageVector? = null
