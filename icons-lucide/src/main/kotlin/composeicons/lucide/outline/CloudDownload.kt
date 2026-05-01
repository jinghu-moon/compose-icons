package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CloudDownload: ImageVector
    get() {
        if (_cloudDownload != null) return _cloudDownload!!
        _cloudDownload = lucideOutlineIcon(
            name = "CloudDownload",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 13.0f),
                    PathNode.LineTo(12.0f, 21.0f),
                    PathNode.LineTo(8.0f, 17.0f)
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
                    PathNode.MoveTo(12.0f, 21.0f),
                    PathNode.LineTo(16.0f, 17.0f)
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
                    PathNode.MoveTo(4.393f, 15.269f),
                    PathNode.CurveTo(2.153191f, 13.309624f, 1.397055f, 10.14829f, 2.507882f, 7.3875f),
                    PathNode.CurveTo(3.61871f, 4.626709f, 6.353646f, 2.870038f, 9.326335f, 3.007953f),
                    PathNode.CurveTo(12.299024f, 3.145868f, 14.859563f, 5.148219f, 15.71f, 8.0f),
                    PathNode.LineTo(17.5f, 8.0f),
                    PathNode.CurveTo(19.496534f, 7.999749f, 21.254522f, 9.315042f, 21.817776f, 11.230477f),
                    PathNode.CurveTo(22.381033f, 13.145913f, 21.614864f, 15.20346f, 19.936f, 16.284f)
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
        return _cloudDownload!!
    }

private var _cloudDownload: ImageVector? = null
