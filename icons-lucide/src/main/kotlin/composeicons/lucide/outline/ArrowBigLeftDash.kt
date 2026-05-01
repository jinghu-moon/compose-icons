package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ArrowBigLeftDash: ImageVector
    get() {
        if (_arrowBigLeftDash != null) return _arrowBigLeftDash!!
        _arrowBigLeftDash = lucideOutlineIcon(
            name = "ArrowBigLeftDash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.0f, 9.0f),
                    PathNode.CurveTo(12.447715f, 9.0f, 12.0f, 8.552285f, 12.0f, 8.0f),
                    PathNode.LineTo(12.0f, 4.707f),
                    PathNode.CurveTo(12.000061f, 4.420998f, 11.827806f, 4.163131f, 11.563578f, 4.053675f),
                    PathNode.CurveTo(11.29935f, 3.944218f, 10.995203f, 4.004736f, 10.793f, 4.207f),
                    PathNode.LineTo(3.853f, 11.147f),
                    PathNode.CurveTo(3.62663f, 11.373358f, 3.499456f, 11.680373f, 3.499456f, 12.0005f),
                    PathNode.CurveTo(3.499456f, 12.320627f, 3.62663f, 12.627642f, 3.853f, 12.854f),
                    PathNode.LineTo(10.793f, 19.794f),
                    PathNode.CurveTo(10.995203f, 19.996264f, 11.29935f, 20.056782f, 11.563578f, 19.947325f),
                    PathNode.CurveTo(11.827806f, 19.83787f, 12.000061f, 19.580002f, 12.0f, 19.294f),
                    PathNode.LineTo(12.0f, 16.0f),
                    PathNode.CurveTo(12.0f, 15.447715f, 12.447715f, 15.0f, 13.0f, 15.0f),
                    PathNode.LineTo(15.0f, 15.0f),
                    PathNode.CurveTo(15.552285f, 15.0f, 16.0f, 14.552285f, 16.0f, 14.0f),
                    PathNode.LineTo(16.0f, 10.0f),
                    PathNode.CurveTo(16.0f, 9.447715f, 15.552285f, 9.0f, 15.0f, 9.0f),
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
                    PathNode.MoveTo(20.0f, 9.0f),
                    PathNode.LineTo(20.0f, 15.0f)
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
        return _arrowBigLeftDash!!
    }

private var _arrowBigLeftDash: ImageVector? = null
