package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyXrp: ImageVector
    get() {
        if (_currencyXrp != null) return _currencyXrp!!
        _currencyXrp = tablerOutlineIcon(
            name = "CurrencyXrp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 5.0f),
                    PathNode.LineTo(8.585f, 8.585f),
                    PathNode.CurveTo(10.471158f, 10.470798f, 13.528842f, 10.470798f, 15.415f, 8.585f),
                    PathNode.LineTo(19.0f, 5.0f)
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
                    PathNode.MoveTo(5.0f, 19.0f),
                    PathNode.LineTo(8.585f, 15.415f),
                    PathNode.CurveTo(10.471158f, 13.529202f, 13.528842f, 13.529202f, 15.415f, 15.415f),
                    PathNode.LineTo(19.0f, 18.999f)
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
        return _currencyXrp!!
    }

private var _currencyXrp: ImageVector? = null
