package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ChartArea: ImageVector
    get() {
        if (_chartArea != null) return _chartArea!!
        _chartArea = lucideOutlineIcon(
            name = "ChartArea",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(3.0f, 19.0f),
                    PathNode.CurveTo(3.0f, 20.10457f, 3.895431f, 21.0f, 5.0f, 21.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
                    PathNode.MoveTo(7.0f, 11.207f),
                    PathNode.CurveTo(7.000028f, 11.074648f, 7.052531f, 10.947705f, 7.146f, 10.854f),
                    PathNode.LineTo(9.146f, 8.854f),
                    PathNode.CurveTo(9.239804f, 8.759958f, 9.367173f, 8.707107f, 9.5f, 8.707107f),
                    PathNode.CurveTo(9.632827f, 8.707107f, 9.760196f, 8.759958f, 9.854f, 8.854f),
                    PathNode.LineTo(13.146f, 12.146f),
                    PathNode.CurveTo(13.239804f, 12.240042f, 13.367173f, 12.292893f, 13.5f, 12.292893f),
                    PathNode.CurveTo(13.632827f, 12.292893f, 13.760196f, 12.240042f, 13.854f, 12.146f),
                    PathNode.LineTo(18.146f, 7.854f),
                    PathNode.CurveTo(18.288885f, 7.710753f, 18.504019f, 7.667736f, 18.691f, 7.745025f),
                    PathNode.CurveTo(18.877983f, 7.822315f, 18.999956f, 8.004673f, 19.0f, 8.207f),
                    PathNode.LineTo(19.0f, 16.0f),
                    PathNode.CurveTo(19.0f, 16.552284f, 18.552284f, 17.0f, 18.0f, 17.0f),
                    PathNode.LineTo(8.0f, 17.0f),
                    PathNode.CurveTo(7.447716f, 17.0f, 7.0f, 16.552284f, 7.0f, 16.0f),
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
        return _chartArea!!
    }

private var _chartArea: ImageVector? = null
