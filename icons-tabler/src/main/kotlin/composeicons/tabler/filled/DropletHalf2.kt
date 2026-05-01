package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DropletHalf2: ImageVector
    get() {
        if (_dropletHalf2 != null) return _dropletHalf2!!
        _dropletHalf2 = tablerFilledIcon(
            name = "DropletHalf2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.905f, 2.923f),
                    PathNode.LineTo(14.003f, 3.058f),
                    PathNode.LineTo(18.923f, 10.364f),
                    PathNode.CurveTo(19.50185f, 11.32897f, 19.85817f, 12.410907f, 19.966f, 13.531f),
                    PathNode.LineTo(19.99f, 13.857f),
                    PathNode.CurveTo(19.997f, 13.904f, 20.0f, 13.951f, 20.0f, 14.0f),
                    PathNode.LineTo(19.998f, 14.06f),
                    PathNode.CurveTo(20.054f, 16.36f, 19.054f, 18.642f, 17.128f, 20.2f),
                    PathNode.CurveTo(14.159f, 22.602f, 9.842f, 22.602f, 6.873f, 20.2f),
                    PathNode.CurveTo(4.969f, 18.66f, 3.969f, 16.413f, 4.008f, 14.129f),
                    PathNode.CurveTo(3.994613f, 14.018014f, 3.999001f, 13.905604f, 4.021f, 13.796f),
                    PathNode.CurveTo(4.090627f, 12.683515f, 4.40221f, 11.599628f, 4.934f, 10.62f),
                    PathNode.LineTo(5.106f, 10.318f),
                    PathNode.LineTo(9.999f, 3.058f),
                    PathNode.CurveTo(10.184f, 2.783f, 10.425f, 2.549f, 10.708f, 2.372f),
                    PathNode.CurveTo(11.763f, 1.712f, 13.154f, 1.959f, 13.905f, 2.922f),
                    PathNode.Close,
                    PathNode.MoveTo(11.845f, 4.03f),
                    PathNode.LineTo(11.768f, 4.068f),
                    PathNode.LineTo(11.727f, 4.098f),
                    PathNode.LineTo(11.69f, 4.134f),
                    PathNode.LineTo(11.657f, 4.176f),
                    PathNode.LineTo(6.794f, 11.39f),
                    PathNode.CurveTo(6.494703f, 11.889601f, 6.275069f, 12.432781f, 6.143f, 13.0f),
                    PathNode.LineTo(17.866f, 13.0f),
                    PathNode.CurveTo(17.759918f, 12.54305f, 17.59522f, 12.101727f, 17.376f, 11.687f),
                    PathNode.LineTo(17.235f, 11.436f),
                    PathNode.LineTo(12.344f, 4.175f),
                    PathNode.CurveTo(12.229266f, 4.019208f, 12.024282f, 3.959763f, 11.844f, 4.03f),
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
        return _dropletHalf2!!
    }

private var _dropletHalf2: ImageVector? = null
