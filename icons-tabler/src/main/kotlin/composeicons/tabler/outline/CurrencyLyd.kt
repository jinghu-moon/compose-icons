package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyLyd: ImageVector
    get() {
        if (_currencyLyd != null) return _currencyLyd!!
        _currencyLyd = tablerOutlineIcon(
            name = "CurrencyLyd",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.0f, 15.0f),
                    PathNode.LineTo(11.01f, 15.0f)
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
                    PathNode.MoveTo(21.0f, 5.0f),
                    PathNode.LineTo(21.0f, 15.0f),
                    PathNode.CurveTo(21.0f, 16.10457f, 20.10457f, 17.0f, 19.0f, 17.0f),
                    PathNode.LineTo(16.236f, 17.0f),
                    PathNode.CurveTo(15.478309f, 16.999975f, 14.785688f, 16.571781f, 14.447f, 15.894f),
                    PathNode.LineTo(14.0f, 15.0f)
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
                    PathNode.MoveTo(5.0f, 8.0f),
                    PathNode.LineTo(7.773f, 12.687f),
                    PathNode.CurveTo(8.2f, 13.384f, 8.007f, 14.313f, 7.343f, 14.762f),
                    PathNode.CurveTo(7.114887f, 14.916756f, 6.845654f, 14.99965f, 6.57f, 15.0f),
                    PathNode.LineTo(4.346f, 15.0f),
                    PathNode.CurveTo(4.090983f, 14.998738f, 3.847672f, 14.892809f, 3.673f, 14.707f),
                    PathNode.LineTo(3.0f, 14.0f)
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
        return _currencyLyd!!
    }

private var _currencyLyd: ImageVector? = null
