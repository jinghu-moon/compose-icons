package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.DropletOff: ImageVector
    get() {
        if (_dropletOff != null) return _dropletOff!!
        _dropletOff = lucideOutlineIcon(
            name = "DropletOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.715f, 13.186f),
                    PathNode.CurveTo(18.29f, 11.858f, 17.384f, 10.607f, 16.0f, 9.5f),
                    PathNode.CurveTo(14.0f, 7.9f, 12.5f, 5.5f, 12.0f, 3.0f),
                    PathNode.CurveTo(11.81708f, 3.896242f, 11.519991f, 4.765329f, 11.116f, 5.586f)
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
                    PathNode.MoveTo(2.0f, 2.0f),
                    PathNode.LineTo(22.0f, 22.0f)
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
                    PathNode.MoveTo(8.795f, 8.797f),
                    PathNode.CurveTo(8.541465f, 9.043987f, 8.276157f, 9.278594f, 8.0f, 9.5f),
                    PathNode.CurveTo(6.0f, 11.1f, 5.0f, 13.0f, 5.0f, 15.0f),
                    PathNode.CurveTo(4.999673f, 18.230492f, 7.210095f, 21.041643f, 10.349504f, 21.803345f),
                    PathNode.CurveTo(13.488914f, 22.565048f, 16.741838f, 21.079447f, 18.222f, 18.208f)
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
        return _dropletOff!!
    }

private var _dropletOff: ImageVector? = null
