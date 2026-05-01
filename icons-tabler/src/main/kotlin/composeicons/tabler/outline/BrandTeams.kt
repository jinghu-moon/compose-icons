package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandTeams: ImageVector
    get() {
        if (_brandTeams != null) return _brandTeams!!
        _brandTeams = tablerOutlineIcon(
            name = "BrandTeams",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 7.0f),
                    PathNode.LineTo(13.0f, 7.0f),
                    PathNode.LineTo(13.0f, 17.0f),
                    PathNode.LineTo(3.0f, 17.0f),
                    PathNode.LineTo(3.0f, 7.0f)
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
                    PathNode.MoveTo(6.0f, 10.0f),
                    PathNode.LineTo(10.0f, 10.0f)
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
                    PathNode.MoveTo(8.0f, 10.0f),
                    PathNode.LineTo(8.0f, 14.0f)
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
                    PathNode.MoveTo(8.104f, 17.0f),
                    PathNode.CurveTo(8.574f, 19.274f, 10.587f, 21.0f, 13.0f, 21.0f),
                    PathNode.CurveTo(15.761424f, 21.0f, 18.0f, 18.761423f, 18.0f, 16.0f),
                    PathNode.LineTo(18.0f, 9.0f),
                    PathNode.LineTo(13.0f, 9.0f)
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
                    PathNode.MoveTo(18.0f, 18.0f),
                    PathNode.CurveTo(20.209139f, 18.0f, 22.0f, 16.209139f, 22.0f, 14.0f),
                    PathNode.LineTo(22.0f, 9.0f),
                    PathNode.LineTo(18.0f, 9.0f)
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
                    PathNode.MoveTo(13.003f, 8.83f),
                    PathNode.CurveTo(14.32425f, 9.295358f, 15.791676f, 8.784406f, 16.53816f, 7.59907f),
                    PathNode.CurveTo(17.284645f, 6.413735f, 17.11146f, 4.86958f, 16.120941f, 3.87906f),
                    PathNode.CurveTo(15.13042f, 2.88854f, 13.586266f, 2.715354f, 12.400929f, 3.461839f),
                    PathNode.CurveTo(11.215594f, 4.208325f, 10.704642f, 5.67575f, 11.17f, 6.997f)
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
                    PathNode.MoveTo(15.83f, 8.36f),
                    PathNode.CurveTo(16.76322f, 9.197709f, 18.172668f, 9.214402f, 19.125467f, 8.399031f),
                    PathNode.CurveTo(20.078266f, 7.583659f, 20.279552f, 6.188559f, 19.596098f, 5.137109f),
                    PathNode.CurveTo(18.912643f, 4.085658f, 17.55596f, 3.703255f, 16.424f, 4.243f)
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
        return _brandTeams!!
    }

private var _brandTeams: ImageVector? = null
