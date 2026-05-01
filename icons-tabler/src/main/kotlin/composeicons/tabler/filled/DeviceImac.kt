package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DeviceImac: ImageVector
    get() {
        if (_deviceImac != null) return _deviceImac!!
        _deviceImac = tablerFilledIcon(
            name = "DeviceImac",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 22.0f),
                    PathNode.CurveTo(7.447716f, 22.0f, 7.0f, 21.552284f, 7.0f, 21.0f),
                    PathNode.CurveTo(7.0f, 20.447716f, 7.447716f, 20.0f, 8.0f, 20.0f),
                    PathNode.LineTo(8.616f, 20.0f),
                    PathNode.LineTo(8.866f, 18.0f),
                    PathNode.LineTo(4.0f, 18.0f),
                    PathNode.CurveTo(2.895431f, 18.0f, 2.0f, 17.10457f, 2.0f, 16.0f),
                    PathNode.LineTo(2.0f, 4.0f),
                    PathNode.CurveTo(2.0f, 2.895431f, 2.895431f, 2.0f, 4.0f, 2.0f),
                    PathNode.LineTo(20.0f, 2.0f),
                    PathNode.CurveTo(21.10457f, 2.0f, 22.0f, 2.895431f, 22.0f, 4.0f),
                    PathNode.LineTo(22.0f, 16.0f),
                    PathNode.CurveTo(22.0f, 17.10457f, 21.10457f, 18.0f, 20.0f, 18.0f),
                    PathNode.LineTo(15.133f, 18.0f),
                    PathNode.LineTo(15.383f, 20.0f),
                    PathNode.LineTo(16.0f, 20.0f),
                    PathNode.CurveTo(16.552284f, 20.0f, 17.0f, 20.447716f, 17.0f, 21.0f),
                    PathNode.CurveTo(17.0f, 21.552284f, 16.552284f, 22.0f, 16.0f, 22.0f),
                    PathNode.Close,
                    PathNode.MoveTo(13.116f, 18.0f),
                    PathNode.LineTo(10.883f, 18.0f),
                    PathNode.LineTo(10.633f, 20.0f),
                    PathNode.LineTo(13.366f, 20.0f),
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
        return _deviceImac!!
    }

private var _deviceImac: ImageVector? = null
