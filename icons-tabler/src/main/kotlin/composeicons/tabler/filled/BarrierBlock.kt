package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BarrierBlock: ImageVector
    get() {
        if (_barrierBlock != null) return _barrierBlock!!
        _barrierBlock = tablerFilledIcon(
            name = "BarrierBlock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 21.0f),
                    PathNode.CurveTo(14.447715f, 21.0f, 14.0f, 20.552284f, 14.0f, 20.0f),
                    PathNode.CurveTo(14.0f, 19.447716f, 14.447715f, 19.0f, 15.0f, 19.0f),
                    PathNode.LineTo(16.0f, 19.0f),
                    PathNode.LineTo(16.0f, 17.0f),
                    PathNode.LineTo(8.0f, 17.0f),
                    PathNode.LineTo(8.0f, 19.0f),
                    PathNode.LineTo(9.0f, 19.0f),
                    PathNode.CurveTo(9.552285f, 19.0f, 10.0f, 19.447716f, 10.0f, 20.0f),
                    PathNode.CurveTo(10.0f, 20.552284f, 9.552285f, 21.0f, 9.0f, 21.0f),
                    PathNode.LineTo(5.0f, 21.0f),
                    PathNode.CurveTo(4.447716f, 21.0f, 4.0f, 20.552284f, 4.0f, 20.0f),
                    PathNode.CurveTo(4.0f, 19.447716f, 4.447716f, 19.0f, 5.0f, 19.0f),
                    PathNode.LineTo(6.0f, 19.0f),
                    PathNode.LineTo(6.0f, 17.0f),
                    PathNode.LineTo(5.0f, 17.0f),
                    PathNode.CurveTo(3.895431f, 17.0f, 3.0f, 16.10457f, 3.0f, 15.0f),
                    PathNode.LineTo(3.0f, 8.0f),
                    PathNode.CurveTo(3.0f, 6.895431f, 3.895431f, 6.0f, 5.0f, 6.0f),
                    PathNode.LineTo(6.0f, 6.0f),
                    PathNode.LineTo(6.0f, 5.0f),
                    PathNode.CurveTo(6.0f, 4.447716f, 6.447716f, 4.0f, 7.0f, 4.0f),
                    PathNode.CurveTo(7.552285f, 4.0f, 8.0f, 4.447716f, 8.0f, 5.0f),
                    PathNode.LineTo(8.0f, 6.0f),
                    PathNode.LineTo(16.0f, 6.0f),
                    PathNode.LineTo(16.0f, 5.0f),
                    PathNode.CurveTo(16.0f, 4.447716f, 16.447716f, 4.0f, 17.0f, 4.0f),
                    PathNode.CurveTo(17.552284f, 4.0f, 18.0f, 4.447716f, 18.0f, 5.0f),
                    PathNode.LineTo(18.0f, 6.0f),
                    PathNode.LineTo(19.0f, 6.0f),
                    PathNode.CurveTo(20.10457f, 6.0f, 21.0f, 6.895431f, 21.0f, 8.0f),
                    PathNode.LineTo(21.0f, 15.0f),
                    PathNode.CurveTo(21.0f, 16.10457f, 20.10457f, 17.0f, 19.0f, 17.0f),
                    PathNode.LineTo(18.0f, 17.0f),
                    PathNode.LineTo(18.0f, 19.0f),
                    PathNode.LineTo(19.0f, 19.0f),
                    PathNode.CurveTo(19.552284f, 19.0f, 20.0f, 19.447716f, 20.0f, 20.0f),
                    PathNode.CurveTo(20.0f, 20.552284f, 19.552284f, 21.0f, 19.0f, 21.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.914f, 8.0f),
                    PathNode.LineTo(5.914f, 15.0f),
                    PathNode.LineTo(10.084f, 15.0f),
                    PathNode.LineTo(17.0f, 8.0f),
                    PathNode.Close,
                    PathNode.MoveTo(19.0f, 10.914f),
                    PathNode.LineTo(14.914f, 15.0f),
                    PathNode.LineTo(19.0f, 15.0f),
                    PathNode.Close,
                    PathNode.MoveTo(8.084f, 8.0f),
                    PathNode.LineTo(5.0f, 8.0f),
                    PathNode.LineTo(5.0f, 11.084f),
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
        return _barrierBlock!!
    }

private var _barrierBlock: ImageVector? = null
