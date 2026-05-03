package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyDinar: ImageVector
    get() {
        if (_currencyDinar != null) return _currencyDinar!!
        _currencyDinar = tablerOutlineIcon(
            name = "CurrencyDinar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 20.01f),
                    PathNode.LineTo(14.0f, 20.0f)
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
                    PathNode.MoveTo(6.0f, 13.0f),
                    PathNode.LineTo(8.386f, 12.1f),
                    PathNode.CurveTo(8.792663f, 11.94675f, 9.053794f, 11.548395f, 9.032115f, 11.114356f),
                    PathNode.CurveTo(9.010436f, 10.680316f, 8.71091f, 10.309965f, 8.291001f, 10.198f),
                    PathNode.LineTo(6.777f, 9.794f),
                    PathNode.CurveTo(6.357921f, 9.682733f, 6.058296f, 9.314068f, 6.035052f, 8.881093f),
                    PathNode.CurveTo(6.011808f, 8.448118f, 6.270242f, 8.049495f, 6.675f, 7.894f),
                    PathNode.LineTo(9.0f, 7.0f)
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
                    PathNode.MoveTo(3.0f, 14.0f),
                    PathNode.LineTo(3.0f, 15.0f),
                    PathNode.CurveTo(3.0f, 16.656855f, 4.343146f, 18.0f, 6.0f, 18.0f),
                    PathNode.LineTo(10.161f, 18.0f),
                    PathNode.CurveTo(11.01237f, 18.000032f, 11.823659f, 17.638329f, 12.392669f, 17.005037f),
                    PathNode.CurveTo(12.961678f, 16.371744f, 13.234813f, 15.526513f, 13.144f, 14.68f),
                    PathNode.LineTo(12.0f, 4.0f)
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
                    PathNode.MoveTo(16.0f, 17.0f),
                    PathNode.LineTo(17.0f, 18.0f),
                    PathNode.LineTo(19.0f, 18.0f),
                    PathNode.CurveTo(19.742182f, 17.999813f, 20.423235f, 17.588657f, 20.769085f, 16.931982f),
                    PathNode.CurveTo(21.114935f, 16.275307f, 21.068705f, 15.481113f, 20.649f, 14.869f),
                    PathNode.LineTo(17.996f, 11.0f)
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
        return _currencyDinar!!
    }

private var _currencyDinar: ImageVector? = null
