package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandHbo: ImageVector
    get() {
        if (_brandHbo != null) return _brandHbo!!
        _brandHbo = tablerOutlineIcon(
            name = "BrandHbo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.0f, 16.0f),
                    PathNode.LineTo(2.0f, 8.0f)
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
                    PathNode.MoveTo(6.0f, 8.0f),
                    PathNode.LineTo(6.0f, 16.0f)
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
                    PathNode.MoveTo(2.0f, 12.0f),
                    PathNode.LineTo(6.0f, 12.0f)
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
                    PathNode.MoveTo(9.0f, 16.0f),
                    PathNode.LineTo(11.0f, 16.0f),
                    PathNode.CurveTo(12.104569f, 16.0f, 13.0f, 15.104569f, 13.0f, 14.0f),
                    PathNode.CurveTo(13.0f, 12.895431f, 12.104569f, 12.0f, 11.0f, 12.0f),
                    PathNode.LineTo(9.0f, 12.0f),
                    PathNode.LineTo(11.0f, 12.0f),
                    PathNode.CurveTo(12.104569f, 12.0f, 13.0f, 11.104569f, 13.0f, 10.0f),
                    PathNode.CurveTo(13.0f, 8.895431f, 12.104569f, 8.0f, 11.0f, 8.0f),
                    PathNode.LineTo(9.0f, 8.0f),
                    PathNode.LineTo(9.0f, 16.0f)
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
                    PathNode.MoveTo(19.0f, 8.0f),
                    PathNode.CurveTo(21.209139f, 8.0f, 23.0f, 9.790861f, 23.0f, 12.0f),
                    PathNode.CurveTo(23.0f, 14.209139f, 21.209139f, 16.0f, 19.0f, 16.0f),
                    PathNode.CurveTo(16.790861f, 16.0f, 15.0f, 14.209139f, 15.0f, 12.0f),
                    PathNode.CurveTo(15.0f, 9.790861f, 16.790861f, 8.0f, 19.0f, 8.0f)
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
                    PathNode.MoveTo(18.0f, 12.0f),
                    PathNode.CurveTo(18.0f, 12.552285f, 18.447716f, 13.0f, 19.0f, 13.0f),
                    PathNode.CurveTo(19.552284f, 13.0f, 20.0f, 12.552285f, 20.0f, 12.0f),
                    PathNode.CurveTo(20.0f, 11.447715f, 19.552284f, 11.0f, 19.0f, 11.0f),
                    PathNode.CurveTo(18.447716f, 11.0f, 18.0f, 11.447715f, 18.0f, 12.0f)
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
        return _brandHbo!!
    }

private var _brandHbo: ImageVector? = null
