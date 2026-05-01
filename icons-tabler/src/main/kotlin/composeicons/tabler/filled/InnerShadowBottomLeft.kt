package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.InnerShadowBottomLeft: ImageVector
    get() {
        if (_innerShadowBottomLeft != null) return _innerShadowBottomLeft!!
        _innerShadowBottomLeft = tablerFilledIcon(
            name = "InnerShadowBottomLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.CurveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f),
                    PathNode.CurveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f),
                    PathNode.CurveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(6.0f, 11.0f),
                    PathNode.CurveTo(5.447716f, 11.0f, 5.0f, 11.447715f, 5.0f, 12.0f),
                    PathNode.CurveTo(5.0f, 15.865993f, 8.134007f, 19.0f, 12.0f, 19.0f),
                    PathNode.CurveTo(12.552285f, 19.0f, 13.0f, 18.552284f, 13.0f, 18.0f),
                    PathNode.CurveTo(13.0f, 17.447716f, 12.552285f, 17.0f, 12.0f, 17.0f),
                    PathNode.CurveTo(9.238576f, 17.0f, 7.0f, 14.761424f, 7.0f, 12.0f),
                    PathNode.CurveTo(7.0f, 11.447715f, 6.552285f, 11.0f, 6.0f, 11.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _innerShadowBottomLeft!!
    }

private var _innerShadowBottomLeft: ImageVector? = null
