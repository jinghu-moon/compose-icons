package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.InnerShadowLeft: ImageVector
    get() {
        if (_innerShadowLeft != null) return _innerShadowLeft!!
        _innerShadowLeft = tablerFilledIcon(
            name = "InnerShadowLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.929f, 4.929f),
                    PathNode.CurveTo(8.834f, 1.024f, 15.166f, 1.024f, 19.071f, 4.929f),
                    PathNode.CurveTo(22.976f, 8.834f, 22.976f, 15.166f, 19.071f, 19.071f),
                    PathNode.CurveTo(15.166f, 22.976f, 8.834f, 22.976f, 4.929f, 19.071f),
                    PathNode.CurveTo(1.024f, 15.166f, 1.024f, 8.834f, 4.929f, 4.929f),
                    PathNode.Close,
                    PathNode.MoveTo(8.464f, 7.05f),
                    PathNode.CurveTo(8.0735f, 6.659618f, 7.4405f, 6.659618f, 7.05f, 7.05f),
                    PathNode.CurveTo(5.737091f, 8.362775f, 4.999495f, 10.143361f, 4.999495f, 12.0f),
                    PathNode.CurveTo(4.999495f, 13.856639f, 5.737091f, 15.637225f, 7.05f, 16.95f),
                    PathNode.CurveTo(7.301075f, 17.209957f, 7.672878f, 17.314213f, 8.022508f, 17.222696f),
                    PathNode.CurveTo(8.372137f, 17.131182f, 8.645182f, 16.858137f, 8.736697f, 16.508507f),
                    PathNode.CurveTo(8.828213f, 16.158878f, 8.723956f, 15.787074f, 8.464f, 15.536f),
                    PathNode.CurveTo(7.526033f, 14.59828f, 6.999068f, 13.326311f, 6.999068f, 12.0f),
                    PathNode.CurveTo(6.999068f, 10.673689f, 7.526033f, 9.40172f, 8.464f, 8.464f),
                    PathNode.CurveTo(8.854382f, 8.0735f, 8.854382f, 7.4405f, 8.464f, 7.05f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _innerShadowLeft!!
    }

private var _innerShadowLeft: ImageVector? = null
