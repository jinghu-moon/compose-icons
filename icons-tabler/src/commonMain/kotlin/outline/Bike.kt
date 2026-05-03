package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Bike: ImageVector
    get() {
        if (_bike != null) return _bike!!
        _bike = tablerOutlineIcon(
            name = "Bike",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.0f, 18.0f),
                    PathNode.CurveTo(2.0f, 19.656855f, 3.343146f, 21.0f, 5.0f, 21.0f),
                    PathNode.CurveTo(6.656854f, 21.0f, 8.0f, 19.656855f, 8.0f, 18.0f),
                    PathNode.CurveTo(8.0f, 16.343145f, 6.656854f, 15.0f, 5.0f, 15.0f),
                    PathNode.CurveTo(3.343146f, 15.0f, 2.0f, 16.343145f, 2.0f, 18.0f)
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
                    PathNode.MoveTo(16.0f, 18.0f),
                    PathNode.CurveTo(16.0f, 19.656855f, 17.343145f, 21.0f, 19.0f, 21.0f),
                    PathNode.CurveTo(20.656855f, 21.0f, 22.0f, 19.656855f, 22.0f, 18.0f),
                    PathNode.CurveTo(22.0f, 16.343145f, 20.656855f, 15.0f, 19.0f, 15.0f),
                    PathNode.CurveTo(17.343145f, 15.0f, 16.0f, 16.343145f, 16.0f, 18.0f)
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
                    PathNode.MoveTo(12.0f, 19.0f),
                    PathNode.LineTo(12.0f, 15.0f),
                    PathNode.LineTo(9.0f, 12.0f),
                    PathNode.LineTo(14.0f, 8.0f),
                    PathNode.LineTo(16.0f, 11.0f),
                    PathNode.LineTo(19.0f, 11.0f)
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
                    PathNode.MoveTo(16.0f, 5.0f),
                    PathNode.CurveTo(16.0f, 5.552285f, 16.447716f, 6.0f, 17.0f, 6.0f),
                    PathNode.CurveTo(17.552284f, 6.0f, 18.0f, 5.552285f, 18.0f, 5.0f),
                    PathNode.CurveTo(18.0f, 4.447716f, 17.552284f, 4.0f, 17.0f, 4.0f),
                    PathNode.CurveTo(16.447716f, 4.0f, 16.0f, 4.447716f, 16.0f, 5.0f)
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
        return _bike!!
    }

private var _bike: ImageVector? = null
