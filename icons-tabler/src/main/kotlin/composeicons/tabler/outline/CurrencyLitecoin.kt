package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyLitecoin: ImageVector
    get() {
        if (_currencyLitecoin != null) return _currencyLitecoin!!
        _currencyLitecoin = tablerOutlineIcon(
            name = "CurrencyLitecoin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 19.0f),
                    PathNode.LineTo(9.806f, 19.0f),
                    PathNode.CurveTo(9.226168f, 19.000036f, 8.67486f, 18.74843f, 8.294957f, 18.31039f),
                    PathNode.CurveTo(7.915054f, 17.87235f, 7.743954f, 17.290998f, 7.826f, 16.717f),
                    PathNode.LineTo(9.5f, 5.0f)
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
                    PathNode.MoveTo(14.0f, 9.0f),
                    PathNode.LineTo(5.0f, 13.0f)
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
        return _currencyLitecoin!!
    }

private var _currencyLitecoin: ImageVector? = null
