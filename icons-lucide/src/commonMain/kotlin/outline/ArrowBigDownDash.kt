package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ArrowBigDownDash: ImageVector
    get() {
        if (_arrowBigDownDash != null) return _arrowBigDownDash!!
        _arrowBigDownDash = lucideOutlineIcon(
            name = "ArrowBigDownDash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 8.0f),
                    PathNode.CurveTo(14.552285f, 8.0f, 15.0f, 8.447715f, 15.0f, 9.0f),
                    PathNode.LineTo(15.0f, 11.0f),
                    PathNode.CurveTo(15.0f, 11.552285f, 15.447715f, 12.0f, 16.0f, 12.0f),
                    PathNode.LineTo(19.293f, 12.0f),
                    PathNode.CurveTo(19.579002f, 11.999939f, 19.836868f, 12.172194f, 19.946325f, 12.436422f),
                    PathNode.CurveTo(20.055782f, 12.70065f, 19.995264f, 13.004797f, 19.793f, 13.207f),
                    PathNode.LineTo(12.854f, 20.146f),
                    PathNode.CurveTo(12.627602f, 20.372677f, 12.320373f, 20.500044f, 12.0f, 20.500044f),
                    PathNode.CurveTo(11.679627f, 20.500044f, 11.372398f, 20.372677f, 11.146f, 20.146f),
                    PathNode.LineTo(4.206f, 13.206f),
                    PathNode.CurveTo(4.004449f, 13.003704f, 3.944386f, 12.700021f, 4.053752f, 12.436231f),
                    PathNode.CurveTo(4.163118f, 12.17244f, 4.420437f, 12.000342f, 4.706f, 12.0f),
                    PathNode.LineTo(8.0f, 12.0f),
                    PathNode.CurveTo(8.552285f, 12.0f, 9.0f, 11.552285f, 9.0f, 11.0f),
                    PathNode.LineTo(9.0f, 9.0f),
                    PathNode.CurveTo(9.0f, 8.447715f, 9.447715f, 8.0f, 10.0f, 8.0f),
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
                    PathNode.MoveTo(9.0f, 4.0f),
                    PathNode.LineTo(15.0f, 4.0f)
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
        return _arrowBigDownDash!!
    }

private var _arrowBigDownDash: ImageVector? = null
