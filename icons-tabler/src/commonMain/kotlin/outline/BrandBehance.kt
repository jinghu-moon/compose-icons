package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandBehance: ImageVector
    get() {
        if (_brandBehance != null) return _brandBehance!!
        _brandBehance = tablerOutlineIcon(
            name = "BrandBehance",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 18.0f),
                    PathNode.LineTo(3.0f, 6.0f),
                    PathNode.LineTo(7.5f, 6.0f),
                    PathNode.CurveTo(9.156855f, 6.0f, 10.5f, 7.343146f, 10.5f, 9.0f),
                    PathNode.CurveTo(10.5f, 10.656855f, 9.156855f, 12.0f, 7.5f, 12.0f),
                    PathNode.CurveTo(9.156855f, 12.0f, 10.5f, 13.343145f, 10.5f, 15.0f),
                    PathNode.CurveTo(10.5f, 16.656855f, 9.156855f, 18.0f, 7.5f, 18.0f),
                    PathNode.LineTo(3.0f, 18.0f)
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
                    PathNode.MoveTo(3.0f, 12.0f),
                    PathNode.LineTo(7.5f, 12.0f)
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
                    PathNode.MoveTo(14.0f, 13.0f),
                    PathNode.LineTo(21.0f, 13.0f),
                    PathNode.CurveTo(21.0f, 11.067003f, 19.432997f, 9.5f, 17.5f, 9.5f),
                    PathNode.CurveTo(15.567003f, 9.5f, 14.0f, 11.067003f, 14.0f, 13.0f),
                    PathNode.LineTo(14.0f, 15.0f),
                    PathNode.CurveTo(14.211856f, 16.537659f, 15.411139f, 17.752104f, 16.946014f, 17.98326f),
                    PathNode.CurveTo(18.48089f, 18.214417f, 19.984665f, 17.407057f, 20.64f, 16.0f)
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
                    PathNode.MoveTo(16.0f, 6.0f),
                    PathNode.LineTo(19.0f, 6.0f)
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
        return _brandBehance!!
    }

private var _brandBehance: ImageVector? = null
