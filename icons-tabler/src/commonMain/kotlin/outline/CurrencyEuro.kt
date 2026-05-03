package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyEuro: ImageVector
    get() {
        if (_currencyEuro != null) return _currencyEuro!!
        _currencyEuro = tablerOutlineIcon(
            name = "CurrencyEuro",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.2f, 7.0f),
                    PathNode.CurveTo(14.844443f, 4.307375f, 11.067763f, 4.337351f, 8.743827f, 7.067118f),
                    PathNode.CurveTo(6.419891f, 9.796885f, 6.419891f, 14.203115f, 8.743827f, 16.932882f),
                    PathNode.CurveTo(11.067763f, 19.66265f, 14.844443f, 19.692627f, 17.2f, 17.0f)
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
                    PathNode.MoveTo(13.0f, 10.0f),
                    PathNode.LineTo(5.0f, 10.0f),
                    PathNode.MoveTo(5.0f, 14.0f),
                    PathNode.LineTo(13.0f, 14.0f)
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
        return _currencyEuro!!
    }

private var _currencyEuro: ImageVector? = null
