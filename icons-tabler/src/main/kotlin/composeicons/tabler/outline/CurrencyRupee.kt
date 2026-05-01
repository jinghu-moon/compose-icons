package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyRupee: ImageVector
    get() {
        if (_currencyRupee != null) return _currencyRupee!!
        _currencyRupee = tablerOutlineIcon(
            name = "CurrencyRupee",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 5.0f),
                    PathNode.LineTo(7.0f, 5.0f),
                    PathNode.LineTo(10.0f, 5.0f),
                    PathNode.CurveTo(12.209139f, 5.0f, 14.0f, 6.790861f, 14.0f, 9.0f),
                    PathNode.CurveTo(14.0f, 11.209139f, 12.209139f, 13.0f, 10.0f, 13.0f),
                    PathNode.LineTo(7.0f, 13.0f),
                    PathNode.LineTo(13.0f, 19.0f)
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
                    PathNode.MoveTo(7.0f, 9.0f),
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
        }
        return _currencyRupee!!
    }

private var _currencyRupee: ImageVector? = null
