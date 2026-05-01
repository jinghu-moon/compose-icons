package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ArrowBigLeft: ImageVector
    get() {
        if (_arrowBigLeft != null) return _arrowBigLeft!!
        _arrowBigLeft = lucideOutlineIcon(
            name = "ArrowBigLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.793f, 19.793f),
                    PathNode.CurveTo(10.995203f, 19.995264f, 11.29935f, 20.055782f, 11.563578f, 19.946325f),
                    PathNode.CurveTo(11.827806f, 19.836868f, 12.000061f, 19.579002f, 12.0f, 19.293f),
                    PathNode.LineTo(12.0f, 16.0f),
                    PathNode.CurveTo(12.0f, 15.447715f, 12.447715f, 15.0f, 13.0f, 15.0f),
                    PathNode.LineTo(19.0f, 15.0f),
                    PathNode.CurveTo(19.552284f, 15.0f, 20.0f, 14.552285f, 20.0f, 14.0f),
                    PathNode.LineTo(20.0f, 10.0f),
                    PathNode.CurveTo(20.0f, 9.447715f, 19.552284f, 9.0f, 19.0f, 9.0f),
                    PathNode.LineTo(13.0f, 9.0f),
                    PathNode.CurveTo(12.447715f, 9.0f, 12.0f, 8.552285f, 12.0f, 8.0f),
                    PathNode.LineTo(12.0f, 4.707f),
                    PathNode.CurveTo(12.000061f, 4.420998f, 11.827806f, 4.163131f, 11.563578f, 4.053675f),
                    PathNode.CurveTo(11.29935f, 3.944218f, 10.995203f, 4.004736f, 10.793f, 4.207f),
                    PathNode.LineTo(3.853f, 11.147f),
                    PathNode.CurveTo(3.62663f, 11.373358f, 3.499456f, 11.680373f, 3.499456f, 12.0005f),
                    PathNode.CurveTo(3.499456f, 12.320627f, 3.62663f, 12.627642f, 3.853f, 12.854f),
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
        return _arrowBigLeft!!
    }

private var _arrowBigLeft: ImageVector? = null
