package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandFoursquare: ImageVector
    get() {
        if (_brandFoursquare != null) return _brandFoursquare!!
        _brandFoursquare = tablerOutlineIcon(
            name = "BrandFoursquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 3.0f),
                    PathNode.LineTo(17.0f, 3.0f),
                    PathNode.CurveTo(17.644f, 3.0f, 18.11f, 3.696f, 17.978f, 4.33f),
                    PathNode.LineTo(15.994f, 14.189f),
                    PathNode.CurveTo(15.897069f, 14.663427f, 15.478218f, 15.003116f, 14.994f, 15.0f),
                    PathNode.LineTo(12.74f, 15.0f),
                    PathNode.CurveTo(12.432f, 15.0f, 12.14f, 15.141f, 11.947f, 15.382f),
                    PathNode.LineTo(7.803f, 20.632f),
                    PathNode.CurveTo(7.204f, 21.384f, 5.994f, 20.963f, 5.994f, 20.0f),
                    PathNode.LineTo(5.994f, 4.0f),
                    PathNode.CurveTo(5.994f, 3.436f, 6.434f, 3.0f, 6.994f, 3.0f),
                    PathNode.LineTo(7.0f, 3.0f)
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
                    PathNode.MoveTo(12.0f, 9.0f),
                    PathNode.LineTo(17.0f, 9.0f)
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
        return _brandFoursquare!!
    }

private var _brandFoursquare: ImageVector? = null
