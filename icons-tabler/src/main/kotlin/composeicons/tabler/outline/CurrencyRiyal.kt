package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyRiyal: ImageVector
    get() {
        if (_currencyRiyal != null) return _currencyRiyal!!
        _currencyRiyal = tablerOutlineIcon(
            name = "CurrencyRiyal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 9.0f),
                    PathNode.LineTo(15.0f, 11.0f),
                    PathNode.CurveTo(15.0f, 12.104569f, 14.104569f, 13.0f, 13.0f, 13.0f),
                    PathNode.CurveTo(11.895431f, 13.0f, 11.0f, 12.104569f, 11.0f, 11.0f),
                    PathNode.LineTo(11.0f, 10.0f),
                    PathNode.LineTo(11.0f, 11.0f),
                    PathNode.CurveTo(11.0f, 12.104569f, 10.104569f, 13.0f, 9.0f, 13.0f),
                    PathNode.CurveTo(7.895431f, 13.0f, 7.0f, 12.104569f, 7.0f, 11.0f),
                    PathNode.LineTo(7.0f, 10.0f),
                    PathNode.LineTo(7.0f, 14.0f),
                    PathNode.CurveTo(7.0f, 15.104569f, 6.10457f, 16.0f, 5.0f, 16.0f),
                    PathNode.CurveTo(3.895431f, 16.0f, 3.0f, 15.104569f, 3.0f, 14.0f),
                    PathNode.LineTo(3.0f, 12.0f)
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
                    PathNode.MoveTo(18.0f, 12.01f),
                    PathNode.LineTo(18.0f, 12.0f)
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
                    PathNode.MoveTo(22.0f, 10.0f),
                    PathNode.LineTo(22.0f, 11.0f),
                    PathNode.CurveTo(22.0f, 13.761424f, 19.761423f, 16.0f, 17.0f, 16.0f)
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
        return _currencyRiyal!!
    }

private var _currencyRiyal: ImageVector? = null
