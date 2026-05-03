package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyRupeeNepalese: ImageVector
    get() {
        if (_currencyRupeeNepalese != null) return _currencyRupeeNepalese!!
        _currencyRupeeNepalese = tablerOutlineIcon(
            name = "CurrencyRupeeNepalese",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 5.0f),
                    PathNode.LineTo(4.0f, 5.0f),
                    PathNode.LineTo(7.0f, 5.0f),
                    PathNode.CurveTo(9.209139f, 5.0f, 11.0f, 6.790861f, 11.0f, 9.0f),
                    PathNode.CurveTo(11.0f, 11.209139f, 9.209139f, 13.0f, 7.0f, 13.0f),
                    PathNode.LineTo(4.0f, 13.0f),
                    PathNode.LineTo(10.0f, 19.0f)
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
                    PathNode.MoveTo(21.0f, 17.0f),
                    PathNode.LineTo(16.414f, 12.586f),
                    PathNode.CurveTo(15.629242f, 11.828055f, 14.38183f, 11.838895f, 13.610363f, 12.610363f),
                    PathNode.CurveTo(12.838895f, 13.38183f, 12.828055f, 14.629242f, 13.586f, 15.414f),
                    PathNode.LineTo(14.293f, 16.121f)
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
        return _currencyRupeeNepalese!!
    }

private var _currencyRupeeNepalese: ImageVector? = null
