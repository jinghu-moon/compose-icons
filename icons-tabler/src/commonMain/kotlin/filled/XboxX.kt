package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.XboxX: ImageVector
    get() {
        if (_xboxX != null) return _xboxX!!
        _xboxX = tablerFilledIcon(
            name = "XboxX",
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
                    PathNode.MoveTo(15.6f, 7.2f),
                    PathNode.CurveTo(15.158173f, 6.868629f, 14.531371f, 6.958173f, 14.2f, 7.4f),
                    PathNode.LineTo(12.0f, 10.333f),
                    PathNode.LineTo(9.8f, 7.4f),
                    PathNode.CurveTo(9.468629f, 6.958173f, 8.841827f, 6.868629f, 8.4f, 7.2f),
                    PathNode.CurveTo(7.958173f, 7.531371f, 7.868629f, 8.158173f, 8.2f, 8.6f),
                    PathNode.LineTo(10.75f, 12.0f),
                    PathNode.LineTo(8.2f, 15.4f),
                    PathNode.CurveTo(7.868629f, 15.841827f, 7.958173f, 16.46863f, 8.4f, 16.8f),
                    PathNode.CurveTo(8.841827f, 17.13137f, 9.468629f, 17.041828f, 9.8f, 16.6f),
                    PathNode.LineTo(12.0f, 13.667f),
                    PathNode.LineTo(14.2f, 16.6f),
                    PathNode.CurveTo(14.531371f, 17.041828f, 15.158173f, 17.13137f, 15.6f, 16.8f),
                    PathNode.CurveTo(16.041828f, 16.46863f, 16.13137f, 15.841827f, 15.8f, 15.4f),
                    PathNode.LineTo(13.25f, 12.0f),
                    PathNode.LineTo(15.8f, 8.6f),
                    PathNode.CurveTo(16.13137f, 8.158173f, 16.041828f, 7.531371f, 15.6f, 7.2f)
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
        return _xboxX!!
    }

private var _xboxX: ImageVector? = null
