package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DeviceWatch: ImageVector
    get() {
        if (_deviceWatch != null) return _deviceWatch!!
        _deviceWatch = tablerFilledIcon(
            name = "DeviceWatch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 2.0f),
                    PathNode.CurveTo(15.552285f, 2.0f, 16.0f, 2.447715f, 16.0f, 3.0f),
                    PathNode.LineTo(16.0f, 5.126f),
                    PathNode.CurveTo(17.726f, 5.571f, 19.0f, 7.136f, 19.0f, 9.0f),
                    PathNode.LineTo(19.0f, 15.0f),
                    PathNode.CurveTo(19.000463f, 16.824371f, 17.76644f, 18.417908f, 16.0f, 18.874f),
                    PathNode.LineTo(16.0f, 21.0f),
                    PathNode.CurveTo(16.0f, 21.552284f, 15.552285f, 22.0f, 15.0f, 22.0f),
                    PathNode.LineTo(9.0f, 22.0f),
                    PathNode.CurveTo(8.447715f, 22.0f, 8.0f, 21.552284f, 8.0f, 21.0f),
                    PathNode.LineTo(8.0f, 18.874f),
                    PathNode.CurveTo(6.23356f, 18.417908f, 4.999537f, 16.824371f, 5.0f, 15.0f),
                    PathNode.LineTo(5.0f, 9.0f),
                    PathNode.CurveTo(4.999537f, 7.175628f, 6.23356f, 5.582093f, 8.0f, 5.126f),
                    PathNode.LineTo(8.0f, 3.0f),
                    PathNode.CurveTo(8.0f, 2.447715f, 8.447715f, 2.0f, 9.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(14.0f, 19.0f),
                    PathNode.LineTo(10.0f, 19.0f),
                    PathNode.LineTo(10.0f, 20.0f),
                    PathNode.LineTo(14.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(14.0f, 4.0f),
                    PathNode.LineTo(10.0f, 4.0f),
                    PathNode.LineTo(10.0f, 5.0f),
                    PathNode.LineTo(14.0f, 5.0f),
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
        return _deviceWatch!!
    }

private var _deviceWatch: ImageVector? = null
