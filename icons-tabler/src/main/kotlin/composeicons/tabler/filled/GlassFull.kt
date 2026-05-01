package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.GlassFull: ImageVector
    get() {
        if (_glassFull != null) return _glassFull!!
        _glassFull = tablerFilledIcon(
            name = "GlassFull",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.004f, 10.229f),
                    PathNode.LineTo(5.001f, 10.043f),
                    PathNode.LineTo(5.002f, 9.93f),
                    PathNode.LineTo(5.01f, 9.859f),
                    PathNode.LineTo(6.01f, 2.859f),
                    PathNode.CurveTo(6.07402f, 2.408152f, 6.43455f, 2.057488f, 6.887f, 2.006f),
                    PathNode.LineTo(7.0f, 2.0f),
                    PathNode.LineTo(17.0f, 2.0f),
                    PathNode.CurveTo(17.455044f, 1.999757f, 17.852875f, 2.306761f, 17.968f, 2.747f),
                    PathNode.LineTo(17.99f, 2.859f),
                    PathNode.LineTo(18.996f, 9.909f),
                    PathNode.LineTo(19.0f, 10.0f),
                    PathNode.CurveTo(19.0f, 13.226f, 16.44f, 15.564f, 13.0f, 15.945f),
                    PathNode.LineTo(13.0f, 20.0f),
                    PathNode.LineTo(16.0f, 20.0f),
                    PathNode.CurveTo(16.529093f, 20.000587f, 16.966166f, 20.41321f, 16.997171f, 20.941395f),
                    PathNode.CurveTo(17.02818f, 21.46958f, 16.642391f, 21.93051f, 16.117f, 21.993f),
                    PathNode.LineTo(16.0f, 22.0f),
                    PathNode.LineTo(8.0f, 22.0f),
                    PathNode.CurveTo(7.470907f, 21.999413f, 7.033836f, 21.58679f, 7.002828f, 21.058605f),
                    PathNode.CurveTo(6.971821f, 20.53042f, 7.35761f, 20.06949f, 7.883f, 20.007f),
                    PathNode.LineTo(8.0f, 20.0f),
                    PathNode.LineTo(11.0f, 20.0f),
                    PathNode.LineTo(11.0f, 15.945f),
                    PathNode.CurveTo(7.642f, 15.574f, 5.122f, 13.336f, 5.004f, 10.229f),
                    PathNode.Close,
                    PathNode.MoveTo(16.133f, 4.0f),
                    PathNode.LineTo(7.866f, 4.0f),
                    PathNode.LineTo(7.259f, 8.258001f),
                    PathNode.CurveTo(8.998365f, 7.730685f, 10.882996f, 8.020091f, 12.384f, 9.045f),
                    PathNode.LineTo(12.6f, 9.2f),
                    PathNode.CurveTo(13.854657f, 10.14143f, 15.543777f, 10.26264f, 16.92f, 9.51f),
                    PathNode.LineTo(16.133f, 4.0f),
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
        return _glassFull!!
    }

private var _glassFull: ImageVector? = null
