package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.EqualApproximately: ImageVector
    get() {
        if (_equalApproximately != null) return _equalApproximately!!
        _equalApproximately = lucideOutlineIcon(
            name = "EqualApproximately",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 15.0f),
                    PathNode.CurveTo(7.134083f, 13.636301f, 9.865917f, 13.636301f, 12.0f, 15.0f),
                    PathNode.CurveTo(14.134083f, 16.363699f, 16.865917f, 16.363699f, 19.0f, 15.0f)
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
                    PathNode.MoveTo(5.0f, 9.0f),
                    PathNode.CurveTo(7.134083f, 7.636301f, 9.865917f, 7.636301f, 12.0f, 9.0f),
                    PathNode.CurveTo(14.134083f, 10.363699f, 16.865917f, 10.363699f, 19.0f, 9.0f)
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
        return _equalApproximately!!
    }

private var _equalApproximately: ImageVector? = null
