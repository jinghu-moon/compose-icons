package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DeviceGamepad3: ImageVector
    get() {
        if (_deviceGamepad3 != null) return _deviceGamepad3!!
        _deviceGamepad3 = tablerFilledIcon(
            name = "DeviceGamepad3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.707f, 14.293f),
                    PathNode.LineTo(15.707f, 17.293f),
                    PathNode.CurveTo(15.894549f, 17.480494f, 15.999944f, 17.734806f, 16.0f, 18.0f),
                    PathNode.LineTo(16.0f, 20.0f),
                    PathNode.CurveTo(16.0f, 21.10457f, 15.104569f, 22.0f, 14.0f, 22.0f),
                    PathNode.LineTo(10.0f, 22.0f),
                    PathNode.CurveTo(8.895431f, 22.0f, 8.0f, 21.10457f, 8.0f, 20.0f),
                    PathNode.LineTo(8.0f, 18.0f),
                    PathNode.CurveTo(8.000057f, 17.734806f, 8.105451f, 17.480494f, 8.293f, 17.293f),
                    PathNode.LineTo(11.293f, 14.293f),
                    PathNode.CurveTo(11.6835f, 13.902618f, 12.3165f, 13.902618f, 12.707f, 14.293f),
                    PathNode.MoveTo(6.0f, 8.0f),
                    PathNode.CurveTo(6.265195f, 8.000057f, 6.519508f, 8.105451f, 6.707f, 8.293f),
                    PathNode.LineTo(9.707f, 11.293f),
                    PathNode.CurveTo(10.097382f, 11.6835f, 10.097382f, 12.3165f, 9.707f, 12.707f),
                    PathNode.LineTo(6.707f, 15.707f),
                    PathNode.CurveTo(6.519508f, 15.894549f, 6.265195f, 15.999944f, 6.0f, 16.0f),
                    PathNode.LineTo(4.0f, 16.0f),
                    PathNode.CurveTo(2.895431f, 16.0f, 2.0f, 15.104569f, 2.0f, 14.0f),
                    PathNode.LineTo(2.0f, 10.0f),
                    PathNode.CurveTo(2.0f, 8.895431f, 2.895431f, 8.0f, 4.0f, 8.0f),
                    PathNode.Close,
                    PathNode.MoveTo(20.0f, 8.0f),
                    PathNode.CurveTo(21.10457f, 8.0f, 22.0f, 8.895431f, 22.0f, 10.0f),
                    PathNode.LineTo(22.0f, 14.0f),
                    PathNode.CurveTo(22.0f, 15.104569f, 21.10457f, 16.0f, 20.0f, 16.0f),
                    PathNode.LineTo(18.0f, 16.0f),
                    PathNode.CurveTo(17.734806f, 15.999944f, 17.480494f, 15.894549f, 17.293f, 15.707f),
                    PathNode.LineTo(14.293f, 12.707f),
                    PathNode.CurveTo(13.902618f, 12.3165f, 13.902618f, 11.6835f, 14.293f, 11.293f),
                    PathNode.LineTo(17.293f, 8.293f),
                    PathNode.CurveTo(17.480494f, 8.105451f, 17.734806f, 8.000057f, 18.0f, 8.0f),
                    PathNode.Close,
                    PathNode.MoveTo(14.0f, 2.0f),
                    PathNode.CurveTo(15.104569f, 2.0f, 16.0f, 2.895431f, 16.0f, 4.0f),
                    PathNode.LineTo(16.0f, 6.0f),
                    PathNode.CurveTo(15.999944f, 6.265195f, 15.894549f, 6.519508f, 15.707f, 6.707f),
                    PathNode.LineTo(12.707f, 9.707f),
                    PathNode.CurveTo(12.3165f, 10.097382f, 11.6835f, 10.097382f, 11.293f, 9.707f),
                    PathNode.LineTo(8.293f, 6.707f),
                    PathNode.CurveTo(8.105451f, 6.519508f, 8.000057f, 6.265195f, 8.0f, 6.0f),
                    PathNode.LineTo(8.0f, 4.0f),
                    PathNode.CurveTo(8.0f, 2.895431f, 8.895431f, 2.0f, 10.0f, 2.0f),
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
        return _deviceGamepad3!!
    }

private var _deviceGamepad3: ImageVector? = null
