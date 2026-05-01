package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandNextcloud: ImageVector
    get() {
        if (_brandNextcloud != null) return _brandNextcloud!!
        _brandNextcloud = tablerOutlineIcon(
            name = "BrandNextcloud",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 12.0f),
                    PathNode.CurveTo(7.0f, 14.761424f, 9.238576f, 17.0f, 12.0f, 17.0f),
                    PathNode.CurveTo(14.761424f, 17.0f, 17.0f, 14.761424f, 17.0f, 12.0f),
                    PathNode.CurveTo(17.0f, 9.238576f, 14.761424f, 7.0f, 12.0f, 7.0f),
                    PathNode.CurveTo(9.238576f, 7.0f, 7.0f, 9.238576f, 7.0f, 12.0f)
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
                    PathNode.MoveTo(2.0f, 12.5f),
                    PathNode.CurveTo(2.0f, 13.880712f, 3.119288f, 15.0f, 4.5f, 15.0f),
                    PathNode.CurveTo(5.880712f, 15.0f, 7.0f, 13.880712f, 7.0f, 12.5f),
                    PathNode.CurveTo(7.0f, 11.119288f, 5.880712f, 10.0f, 4.5f, 10.0f),
                    PathNode.CurveTo(3.119288f, 10.0f, 2.0f, 11.119288f, 2.0f, 12.5f)
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
                    PathNode.MoveTo(17.0f, 12.5f),
                    PathNode.CurveTo(17.0f, 13.880712f, 18.119287f, 15.0f, 19.5f, 15.0f),
                    PathNode.CurveTo(20.880713f, 15.0f, 22.0f, 13.880712f, 22.0f, 12.5f),
                    PathNode.CurveTo(22.0f, 11.119288f, 20.880713f, 10.0f, 19.5f, 10.0f),
                    PathNode.CurveTo(18.119287f, 10.0f, 17.0f, 11.119288f, 17.0f, 12.5f)
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
        return _brandNextcloud!!
    }

private var _brandNextcloud: ImageVector? = null
