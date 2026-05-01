package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Diamonds: ImageVector
    get() {
        if (_diamonds != null) return _diamonds!!
        _diamonds = tablerOutlineIcon(
            name = "Diamonds",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.831f, 20.413f),
                    PathNode.LineTo(5.456f, 13.503f),
                    PathNode.CurveTo(4.848f, 12.72f, 4.848f, 11.28f, 5.456f, 10.503f),
                    PathNode.LineTo(10.831f, 3.592f),
                    PathNode.CurveTo(11.105922f, 3.222444f, 11.539399f, 3.004648f, 12.0f, 3.004648f),
                    PathNode.CurveTo(12.460601f, 3.004648f, 12.894078f, 3.222444f, 13.169f, 3.592f),
                    PathNode.LineTo(18.544f, 10.502f),
                    PathNode.CurveTo(19.152f, 11.285f, 19.152f, 12.725f, 18.544f, 13.502f),
                    PathNode.LineTo(13.169f, 20.413f),
                    PathNode.CurveTo(12.894078f, 20.782557f, 12.460601f, 21.00035f, 12.0f, 21.00035f),
                    PathNode.CurveTo(11.539399f, 21.00035f, 11.105922f, 20.782557f, 10.831f, 20.413f)
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
        return _diamonds!!
    }

private var _diamonds: ImageVector? = null
