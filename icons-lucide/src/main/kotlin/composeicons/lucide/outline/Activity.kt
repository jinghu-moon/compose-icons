package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Activity: ImageVector
    get() {
        if (_activity != null) return _activity!!
        _activity = lucideOutlineIcon(
            name = "Activity",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(22.0f, 12.0f),
                    PathNode.LineTo(19.52f, 12.0f),
                    PathNode.CurveTo(18.621813f, 11.998078f, 17.83251f, 12.595168f, 17.59f, 13.46f),
                    PathNode.LineTo(15.24f, 21.82f),
                    PathNode.CurveTo(15.208889f, 21.926666f, 15.111111f, 22.0f, 15.0f, 22.0f),
                    PathNode.CurveTo(14.888889f, 22.0f, 14.791111f, 21.926666f, 14.76f, 21.82f),
                    PathNode.LineTo(9.24f, 2.18f),
                    PathNode.CurveTo(9.208889f, 2.073333f, 9.111111f, 2.0f, 9.0f, 2.0f),
                    PathNode.CurveTo(8.888889f, 2.0f, 8.791111f, 2.073333f, 8.76f, 2.18f),
                    PathNode.LineTo(6.41f, 10.54f),
                    PathNode.CurveTo(6.168494f, 11.40126f, 5.384477f, 11.99744f, 4.49f, 12.0f),
                    PathNode.LineTo(2.0f, 12.0f)
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
        return _activity!!
    }

private var _activity: ImageVector? = null
