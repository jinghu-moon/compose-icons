package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandSupernova: ImageVector
    get() {
        if (_brandSupernova != null) return _brandSupernova!!
        _brandSupernova = tablerOutlineIcon(
            name = "BrandSupernova",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 12.0f),
                    PathNode.CurveTo(10.0f, 13.104569f, 10.895431f, 14.0f, 12.0f, 14.0f),
                    PathNode.CurveTo(13.104569f, 14.0f, 14.0f, 13.104569f, 14.0f, 12.0f),
                    PathNode.CurveTo(14.0f, 10.895431f, 13.104569f, 10.0f, 12.0f, 10.0f),
                    PathNode.CurveTo(10.895431f, 10.0f, 10.0f, 10.895431f, 10.0f, 12.0f)
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
                    PathNode.MoveTo(15.0f, 15.0f),
                    PathNode.LineTo(15.5f, 15.0f),
                    PathNode.CurveTo(18.538f, 15.0f, 21.0f, 13.657f, 21.0f, 12.0f),
                    PathNode.CurveTo(21.0f, 10.343f, 18.538f, 9.0f, 15.5f, 9.0f),
                    PathNode.CurveTo(13.664f, 9.0f, 12.038f, 9.49f, 11.04f, 10.245f)
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
                    PathNode.MoveTo(9.0f, 9.0f),
                    PathNode.LineTo(8.5f, 9.0f),
                    PathNode.CurveTo(5.462f, 9.0f, 3.0f, 10.343f, 3.0f, 12.0f),
                    PathNode.CurveTo(3.0f, 13.657f, 5.462f, 15.0f, 8.5f, 15.0f),
                    PathNode.CurveTo(10.344f, 15.0f, 11.976f, 14.505f, 12.974f, 13.745f)
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
                    PathNode.MoveTo(15.0f, 9.0f),
                    PathNode.LineTo(15.0f, 8.5f),
                    PathNode.CurveTo(15.0f, 5.462f, 13.657f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(10.343f, 3.0f, 9.0f, 5.462f, 9.0f, 8.5f),
                    PathNode.CurveTo(9.0f, 10.333f, 9.49f, 11.957f, 10.241f, 12.956f)
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
                    PathNode.MoveTo(9.0f, 15.0f),
                    PathNode.LineTo(9.0f, 15.5f),
                    PathNode.CurveTo(9.0f, 18.538f, 10.343f, 21.0f, 12.0f, 21.0f),
                    PathNode.CurveTo(13.657f, 21.0f, 15.0f, 18.538f, 15.0f, 15.5f),
                    PathNode.CurveTo(15.0f, 13.658f, 14.506f, 12.028f, 13.748f, 11.03f)
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
        return _brandSupernova!!
    }

private var _brandSupernova: ImageVector? = null
