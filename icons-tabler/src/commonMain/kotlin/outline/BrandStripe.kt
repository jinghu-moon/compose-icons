package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandStripe: ImageVector
    get() {
        if (_brandStripe != null) return _brandStripe!!
        _brandStripe = tablerOutlineIcon(
            name = "BrandStripe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.453f, 8.056f),
                    PathNode.CurveTo(11.453f, 7.433f, 11.971f, 7.077f, 12.895f, 7.077f),
                    PathNode.CurveTo(14.585f, 7.077f, 16.305f, 7.42f, 17.5f, 8.0f),
                    PathNode.LineTo(18.0f, 4.0f),
                    PathNode.CurveTo(17.052f, 3.551f, 15.18f, 3.0f, 12.5f, 3.0f),
                    PathNode.CurveTo(10.605f, 3.0f, 9.127f, 3.087f, 8.0f, 4.0f),
                    PathNode.CurveTo(6.828f, 4.956f, 6.0f, 6.33f, 6.0f, 8.0f),
                    PathNode.CurveTo(6.0f, 11.03f, 7.958f, 12.906f, 11.0f, 14.0f),
                    PathNode.CurveTo(12.961f, 14.69f, 14.0f, 14.743f, 14.0f, 15.5f),
                    PathNode.CurveTo(14.0f, 16.235f, 13.149f, 17.0f, 12.0f, 17.0f),
                    PathNode.CurveTo(10.577f, 17.0f, 8.037f, 16.391f, 6.5f, 15.5f),
                    PathNode.LineTo(6.0f, 19.5f),
                    PathNode.CurveTo(7.321f, 20.234f, 9.474f, 21.0f, 12.0f, 21.0f),
                    PathNode.CurveTo(14.0f, 21.0f, 15.957f, 20.532f, 17.084f, 19.64f),
                    PathNode.CurveTo(18.347f, 18.661f, 19.0f, 17.372f, 19.0f, 15.5f),
                    PathNode.CurveTo(19.0f, 12.404f, 17.085f, 10.953f, 14.0f, 9.863f),
                    PathNode.CurveTo(12.354f, 9.258f, 11.456f, 8.793f, 11.456f, 8.056f),
                    PathNode.LineTo(11.453f, 8.056f)
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
        return _brandStripe!!
    }

private var _brandStripe: ImageVector? = null
