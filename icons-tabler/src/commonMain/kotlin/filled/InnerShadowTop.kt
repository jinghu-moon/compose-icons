package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.InnerShadowTop: ImageVector
    get() {
        if (_innerShadowTop != null) return _innerShadowTop!!
        _innerShadowTop = tablerFilledIcon(
            name = "InnerShadowTop",
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
                    PathNode.MoveTo(16.949f, 7.05f),
                    PathNode.CurveTo(14.215386f, 4.31666f, 9.783613f, 4.31666f, 7.05f, 7.05f),
                    PathNode.CurveTo(6.671028f, 7.442379f, 6.676448f, 8.066085f, 7.062182f, 8.451818f),
                    PathNode.CurveTo(7.447915f, 8.837552f, 8.071621f, 8.842972f, 8.464f, 8.464f),
                    PathNode.CurveTo(9.40172f, 7.526033f, 10.673689f, 6.999068f, 12.0f, 6.999068f),
                    PathNode.CurveTo(13.326311f, 6.999068f, 14.59828f, 7.526033f, 15.536f, 8.464f),
                    PathNode.CurveTo(15.928379f, 8.842972f, 16.552084f, 8.837552f, 16.937819f, 8.451818f),
                    PathNode.CurveTo(17.323553f, 8.066085f, 17.328972f, 7.442379f, 16.95f, 7.05f),
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
        return _innerShadowTop!!
    }

private var _innerShadowTop: ImageVector? = null
