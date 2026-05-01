package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandPicsart: ImageVector
    get() {
        if (_brandPicsart != null) return _brandPicsart!!
        _brandPicsart = tablerOutlineIcon(
            name = "BrandPicsart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 9.0f),
                    PathNode.CurveTo(5.0f, 12.865993f, 8.134007f, 16.0f, 12.0f, 16.0f),
                    PathNode.CurveTo(15.865993f, 16.0f, 19.0f, 12.865993f, 19.0f, 9.0f),
                    PathNode.CurveTo(19.0f, 5.134007f, 15.865993f, 2.0f, 12.0f, 2.0f),
                    PathNode.CurveTo(8.134007f, 2.0f, 5.0f, 5.134007f, 5.0f, 9.0f)
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
                    PathNode.MoveTo(9.0f, 9.0f),
                    PathNode.CurveTo(9.0f, 10.656855f, 10.343145f, 12.0f, 12.0f, 12.0f),
                    PathNode.CurveTo(13.656855f, 12.0f, 15.0f, 10.656855f, 15.0f, 9.0f),
                    PathNode.CurveTo(15.0f, 7.343146f, 13.656855f, 6.0f, 12.0f, 6.0f),
                    PathNode.CurveTo(10.343145f, 6.0f, 9.0f, 7.343146f, 9.0f, 9.0f)
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
                    PathNode.LineTo(5.0f, 20.0f),
                    PathNode.CurveTo(5.0f, 21.10457f, 5.895431f, 22.0f, 7.0f, 22.0f),
                    PathNode.CurveTo(8.10457f, 22.0f, 9.0f, 21.10457f, 9.0f, 20.0f),
                    PathNode.LineTo(9.0f, 15.5f)
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
        return _brandPicsart!!
    }

private var _brandPicsart: ImageVector? = null
