package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Radar2: ImageVector
    get() {
        if (_radar2 != null) return _radar2!!
        _radar2 = tablerOutlineIcon(
            name = "Radar2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.0f, 12.0f),
                    PathNode.CurveTo(11.0f, 12.552285f, 11.447715f, 13.0f, 12.0f, 13.0f),
                    PathNode.CurveTo(12.552285f, 13.0f, 13.0f, 12.552285f, 13.0f, 12.0f),
                    PathNode.CurveTo(13.0f, 11.447715f, 12.552285f, 11.0f, 12.0f, 11.0f),
                    PathNode.CurveTo(11.447715f, 11.0f, 11.0f, 11.447715f, 11.0f, 12.0f)
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
                    PathNode.MoveTo(15.51f, 15.56f),
                    PathNode.CurveTo(17.21077f, 13.882689f, 17.487568f, 11.236626f, 16.170738f, 9.243651f),
                    PathNode.CurveTo(14.853909f, 7.250678f, 12.31129f, 6.467503f, 10.101321f, 7.374157f),
                    PathNode.CurveTo(7.891352f, 8.280812f, 6.631357f, 10.624032f, 7.093621f, 12.967597f),
                    PathNode.CurveTo(7.555884f, 15.311162f, 9.611279f, 17.00043f, 12.0f, 17.0f)
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
                    PathNode.MoveTo(18.832f, 17.86f),
                    PathNode.CurveTo(21.585598f, 14.650206f, 21.732964f, 9.956214f, 19.186127f, 6.580017f),
                    PathNode.CurveTo(16.639292f, 3.203819f, 12.08535f, 2.056259f, 8.242695f, 3.82235f),
                    PathNode.CurveTo(4.40004f, 5.588442f, 2.305355f, 9.791723f, 3.209026f, 13.923122f),
                    PathNode.CurveTo(4.112695f, 18.054522f, 7.770925f, 20.999456f, 12.0f, 21.0f)
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
                    PathNode.MoveTo(12.0f, 12.0f),
                    PathNode.LineTo(12.0f, 21.0f)
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
        return _radar2!!
    }

private var _radar2: ImageVector? = null
