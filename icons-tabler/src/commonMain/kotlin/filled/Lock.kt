package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Lock: ImageVector
    get() {
        if (_lock != null) return _lock!!
        _lock = tablerFilledIcon(
            name = "Lock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.CurveTo(14.761424f, 2.0f, 17.0f, 4.238577f, 17.0f, 7.0f),
                    PathNode.LineTo(17.0f, 10.0f),
                    PathNode.CurveTo(18.656855f, 10.0f, 20.0f, 11.343145f, 20.0f, 13.0f),
                    PathNode.LineTo(20.0f, 19.0f),
                    PathNode.CurveTo(20.0f, 20.656855f, 18.656855f, 22.0f, 17.0f, 22.0f),
                    PathNode.LineTo(7.0f, 22.0f),
                    PathNode.CurveTo(5.343146f, 22.0f, 4.0f, 20.656855f, 4.0f, 19.0f),
                    PathNode.LineTo(4.0f, 13.0f),
                    PathNode.CurveTo(4.0f, 11.343145f, 5.343146f, 10.0f, 7.0f, 10.0f),
                    PathNode.LineTo(7.0f, 7.0f),
                    PathNode.CurveTo(7.0f, 4.238577f, 9.238576f, 2.0f, 12.0f, 2.0f),
                    PathNode.MoveTo(12.0f, 14.0f),
                    PathNode.CurveTo(10.953375f, 13.999669f, 10.083497f, 14.806323f, 10.005f, 15.85f),
                    PathNode.LineTo(10.0f, 16.0f),
                    PathNode.CurveTo(10.0f, 17.10457f, 10.895431f, 18.0f, 12.0f, 18.0f),
                    PathNode.CurveTo(13.104569f, 18.0f, 14.0f, 17.10457f, 14.0f, 16.0f),
                    PathNode.CurveTo(14.0f, 14.895431f, 13.104569f, 14.0f, 12.0f, 14.0f),
                    PathNode.MoveTo(12.0f, 4.0f),
                    PathNode.CurveTo(10.343145f, 4.0f, 9.0f, 5.343146f, 9.0f, 7.0f),
                    PathNode.LineTo(9.0f, 10.0f),
                    PathNode.LineTo(15.0f, 10.0f),
                    PathNode.LineTo(15.0f, 7.0f),
                    PathNode.CurveTo(15.0f, 5.343146f, 13.656855f, 4.0f, 12.0f, 4.0f)
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
        return _lock!!
    }

private var _lock: ImageVector? = null
