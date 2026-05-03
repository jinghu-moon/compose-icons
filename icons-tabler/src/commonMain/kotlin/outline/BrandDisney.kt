package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandDisney: ImageVector
    get() {
        if (_brandDisney != null) return _brandDisney!!
        _brandDisney = tablerOutlineIcon(
            name = "BrandDisney",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.22f, 5.838f),
                    PathNode.CurveTo(1.913f, 5.688f, 2.0f, 5.26f, 2.0f, 5.044f),
                    PathNode.CurveTo(2.0f, 4.828f, 2.424f, 4.0f, 6.34f, 4.0f),
                    PathNode.CurveTo(11.034f, 4.0f, 21.0f, 7.645f, 21.0f, 14.042f),
                    PathNode.CurveTo(21.0f, 20.439f, 12.29f, 18.973f, 10.565f, 18.562f),
                    PathNode.CurveTo(8.841f, 18.15f, 5.0f, 16.306f, 5.0f, 14.388f),
                    PathNode.CurveTo(5.0f, 12.993f, 8.08f, 12.0f, 11.715f, 12.0f),
                    PathNode.CurveTo(15.349f, 12.0f, 17.0f, 13.041f, 17.0f, 14.0f),
                    PathNode.CurveTo(17.0f, 14.5f, 16.926f, 15.229f, 16.0f, 15.5f)
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
                    PathNode.MoveTo(10.02f, 8.0f),
                    PathNode.CurveTo(9.964239f, 12.333154f, 9.964239f, 16.666845f, 10.02f, 21.0f)
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
        return _brandDisney!!
    }

private var _brandDisney: ImageVector? = null
