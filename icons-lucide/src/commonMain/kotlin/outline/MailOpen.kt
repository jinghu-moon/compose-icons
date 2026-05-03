package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MailOpen: ImageVector
    get() {
        if (_mailOpen != null) return _mailOpen!!
        _mailOpen = lucideOutlineIcon(
            name = "MailOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.2f, 8.4f),
                    PathNode.CurveTo(21.7f, 8.78f, 22.0f, 9.37f, 22.0f, 10.0f),
                    PathNode.LineTo(22.0f, 20.0f),
                    PathNode.CurveTo(22.0f, 21.10457f, 21.10457f, 22.0f, 20.0f, 22.0f),
                    PathNode.LineTo(4.0f, 22.0f),
                    PathNode.CurveTo(2.895431f, 22.0f, 2.0f, 21.10457f, 2.0f, 20.0f),
                    PathNode.LineTo(2.0f, 10.0f),
                    PathNode.CurveTo(2.0f, 9.370485f, 2.296389f, 8.777709f, 2.8f, 8.4f),
                    PathNode.LineTo(10.8f, 2.4f),
                    PathNode.CurveTo(11.511111f, 1.866667f, 12.488889f, 1.866667f, 13.2f, 2.4f),
                    PathNode.LineTo(21.2f, 8.4f),
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
                    PathNode.MoveTo(22.0f, 10.0f),
                    PathNode.LineTo(13.03f, 15.7f),
                    PathNode.CurveTo(12.400047f, 16.09468f, 11.599953f, 16.09468f, 10.97f, 15.7f),
                    PathNode.LineTo(2.0f, 10.0f)
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
        return _mailOpen!!
    }

private var _mailOpen: ImageVector? = null
