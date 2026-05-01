package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandCrunchbase: ImageVector
    get() {
        if (_brandCrunchbase != null) return _brandCrunchbase!!
        _brandCrunchbase = tablerOutlineIcon(
            name = "BrandCrunchbase",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 19.0f),
                    PathNode.LineTo(3.0f, 5.0f),
                    PathNode.CurveTo(3.0f, 3.895431f, 3.895431f, 3.0f, 5.0f, 3.0f),
                    PathNode.LineTo(19.0f, 3.0f),
                    PathNode.CurveTo(20.10457f, 3.0f, 21.0f, 3.895431f, 21.0f, 5.0f),
                    PathNode.LineTo(21.0f, 19.0f),
                    PathNode.CurveTo(21.0f, 20.10457f, 20.10457f, 21.0f, 19.0f, 21.0f),
                    PathNode.LineTo(5.0f, 21.0f),
                    PathNode.CurveTo(3.895431f, 21.0f, 3.0f, 20.10457f, 3.0f, 19.0f)
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
                    PathNode.MoveTo(10.414f, 11.586f),
                    PathNode.CurveTo(9.842052f, 11.013879f, 8.981769f, 10.842656f, 8.234346f, 11.152184f),
                    PathNode.CurveTo(7.486923f, 11.46171f, 6.999573f, 12.191021f, 6.999573f, 13.0f),
                    PathNode.CurveTo(6.999573f, 13.808979f, 7.486923f, 14.53829f, 8.234346f, 14.847816f),
                    PathNode.CurveTo(8.981769f, 15.157344f, 9.842052f, 14.986121f, 10.414f, 14.414f)
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
                    PathNode.MoveTo(13.0f, 13.0f),
                    PathNode.CurveTo(13.0f, 14.104569f, 13.895431f, 15.0f, 15.0f, 15.0f),
                    PathNode.CurveTo(16.10457f, 15.0f, 17.0f, 14.104569f, 17.0f, 13.0f),
                    PathNode.CurveTo(17.0f, 11.895431f, 16.10457f, 11.0f, 15.0f, 11.0f),
                    PathNode.CurveTo(13.895431f, 11.0f, 13.0f, 11.895431f, 13.0f, 13.0f)
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
                    PathNode.MoveTo(13.0f, 7.0f),
                    PathNode.LineTo(13.0f, 13.0f)
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
        return _brandCrunchbase!!
    }

private var _brandCrunchbase: ImageVector? = null
