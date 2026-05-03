package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DeviceFloppy: ImageVector
    get() {
        if (_deviceFloppy != null) return _deviceFloppy!!
        _deviceFloppy = tablerFilledIcon(
            name = "DeviceFloppy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 3.0f),
                    PathNode.CurveTo(16.265194f, 3.000057f, 16.519506f, 3.105451f, 16.707f, 3.293f),
                    PathNode.LineTo(20.707f, 7.293f),
                    PathNode.CurveTo(20.89455f, 7.480493f, 20.999943f, 7.734805f, 21.0f, 8.0f),
                    PathNode.LineTo(21.0f, 18.0f),
                    PathNode.CurveTo(21.0f, 19.656855f, 19.656855f, 21.0f, 18.0f, 21.0f),
                    PathNode.LineTo(6.0f, 21.0f),
                    PathNode.CurveTo(4.343146f, 21.0f, 3.0f, 19.656855f, 3.0f, 18.0f),
                    PathNode.LineTo(3.0f, 6.0f),
                    PathNode.CurveTo(3.0f, 4.343146f, 4.343146f, 3.0f, 6.0f, 3.0f),
                    PathNode.LineTo(7.0f, 3.0f),
                    PathNode.LineTo(7.0f, 7.0f),
                    PathNode.CurveTo(7.000067f, 7.506975f, 7.379507f, 7.933684f, 7.883f, 7.993f),
                    PathNode.LineTo(8.0f, 8.0f),
                    PathNode.LineTo(14.0f, 8.0f),
                    PathNode.CurveTo(14.552285f, 8.0f, 15.0f, 7.552285f, 15.0f, 7.0f),
                    PathNode.LineTo(15.0f, 3.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 11.0f),
                    PathNode.CurveTo(10.38306f, 10.999152f, 9.057368f, 12.281907f, 9.005f, 13.898f),
                    PathNode.CurveTo(9.001597f, 13.931892f, 8.999928f, 13.965937f, 9.0f, 14.0f),
                    PathNode.CurveTo(9.0f, 15.656855f, 10.343145f, 17.0f, 12.0f, 17.0f),
                    PathNode.CurveTo(13.656855f, 17.0f, 15.0f, 15.656855f, 15.0f, 14.0f),
                    PathNode.CurveTo(15.0f, 12.343145f, 13.656855f, 11.0f, 12.0f, 11.0f),
                    PathNode.MoveTo(13.0f, 3.0f),
                    PathNode.LineTo(13.0f, 6.0f),
                    PathNode.LineTo(9.0f, 6.0f),
                    PathNode.LineTo(9.0f, 3.0f),
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
        return _deviceFloppy!!
    }

private var _deviceFloppy: ImageVector? = null
