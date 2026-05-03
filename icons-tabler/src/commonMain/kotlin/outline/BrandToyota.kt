package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandToyota: ImageVector
    get() {
        if (_brandToyota != null) return _brandToyota!!
        _brandToyota = tablerOutlineIcon(
            name = "BrandToyota",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.0f, 12.0f),
                    PathNode.CurveTo(2.0f, 15.865993f, 6.477153f, 19.0f, 12.0f, 19.0f),
                    PathNode.CurveTo(17.522848f, 19.0f, 22.0f, 15.865993f, 22.0f, 12.0f),
                    PathNode.CurveTo(22.0f, 8.134007f, 17.522848f, 5.0f, 12.0f, 5.0f),
                    PathNode.CurveTo(6.477153f, 5.0f, 2.0f, 8.134007f, 2.0f, 12.0f)
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
                    PathNode.MoveTo(9.0f, 12.0f),
                    PathNode.CurveTo(9.0f, 15.866f, 10.343f, 19.0f, 12.0f, 19.0f),
                    PathNode.CurveTo(13.657f, 19.0f, 15.0f, 15.866f, 15.0f, 12.0f),
                    PathNode.CurveTo(15.0f, 8.134f, 13.657f, 5.0f, 12.0f, 5.0f),
                    PathNode.CurveTo(10.343f, 5.0f, 9.0f, 8.134f, 9.0f, 12.0f)
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
                    PathNode.MoveTo(6.415f, 6.191f),
                    PathNode.CurveTo(5.527f, 6.694f, 5.0f, 7.321f, 5.0f, 8.0f),
                    PathNode.CurveTo(5.0f, 9.657f, 8.134f, 11.0f, 12.0f, 11.0f),
                    PathNode.CurveTo(15.866f, 11.0f, 19.0f, 9.657f, 19.0f, 8.0f),
                    PathNode.CurveTo(19.0f, 7.322f, 18.475f, 6.696f, 17.59f, 6.194f)
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
        return _brandToyota!!
    }

private var _brandToyota: ImageVector? = null
