package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Signature: ImageVector
    get() {
        if (_signature != null) return _signature!!
        _signature = tablerOutlineIcon(
            name = "Signature",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 17.0f),
                    PathNode.CurveTo(6.333f, 13.667f, 8.0f, 11.0f, 8.0f, 9.0f),
                    PathNode.CurveTo(8.0f, 6.0f, 7.0f, 6.0f, 6.0f, 6.0f),
                    PathNode.CurveTo(5.0f, 6.0f, 3.968f, 7.085f, 4.0f, 9.0f),
                    PathNode.CurveTo(4.034f, 11.048f, 5.658f, 13.877f, 6.5f, 15.0f),
                    PathNode.CurveTo(8.0f, 17.0f, 9.0f, 17.5f, 10.0f, 16.0f),
                    PathNode.LineTo(12.0f, 13.0f),
                    PathNode.CurveTo(12.333f, 15.667f, 13.333f, 17.0f, 15.0f, 17.0f),
                    PathNode.CurveTo(15.53f, 17.0f, 17.639f, 15.0f, 18.0f, 15.0f),
                    PathNode.CurveTo(18.517f, 15.0f, 19.517f, 15.667f, 21.0f, 17.0f)
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
        return _signature!!
    }

private var _signature: ImageVector? = null
