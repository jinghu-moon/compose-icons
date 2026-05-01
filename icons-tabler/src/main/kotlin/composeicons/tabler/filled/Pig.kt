package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Pig: ImageVector
    get() {
        if (_pig != null) return _pig!!
        _pig = tablerFilledIcon(
            name = "Pig",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.999f, 2.0f),
                    PathNode.CurveTo(16.264389f, 1.999735f, 16.519001f, 2.104974f, 16.706753f, 2.292539f),
                    PathNode.CurveTo(16.894506f, 2.480105f, 17.0f, 2.73461f, 17.0f, 3.0f),
                    PathNode.LineTo(17.0f, 6.255f),
                    PathNode.LineTo(17.026f, 6.273f),
                    PathNode.CurveTo(17.955778f, 6.92715f, 18.712244f, 7.79791f, 19.23f, 8.81f),
                    PathNode.LineTo(19.322f, 9.0f),
                    PathNode.LineTo(19.998f, 9.0f),
                    PathNode.CurveTo(21.044624f, 8.999669f, 21.914503f, 9.806323f, 21.993f, 10.85f),
                    PathNode.LineTo(21.998f, 11.0f),
                    PathNode.LineTo(21.998f, 13.0f),
                    PathNode.CurveTo(21.998f, 14.104569f, 21.10257f, 15.0f, 19.998f, 15.0f),
                    PathNode.LineTo(19.322f, 15.0f),
                    PathNode.LineTo(19.218f, 15.213f),
                    PathNode.CurveTo(18.925056f, 15.779907f, 18.555971f, 16.304096f, 18.121f, 16.771f),
                    PathNode.LineTo(17.998f, 16.896f),
                    PathNode.LineTo(17.998f, 18.5f),
                    PathNode.CurveTo(17.998203f, 19.817196f, 16.976358f, 20.908592f, 15.662f, 20.995f),
                    PathNode.LineTo(15.5f, 21.0f),
                    PathNode.CurveTo(14.34f, 21.0f, 13.365f, 20.21f, 13.082f, 19.14f),
                    PathNode.LineTo(13.05f, 18.999f),
                    PathNode.LineTo(9.0f, 19.0f),
                    PathNode.LineTo(8.95f, 18.998f),
                    PathNode.LineTo(8.918f, 19.139f),
                    PathNode.CurveTo(8.643528f, 20.177725f, 7.736089f, 20.924932f, 6.664f, 20.995f),
                    PathNode.LineTo(6.5f, 21.0f),
                    PathNode.CurveTo(5.119288f, 21.0f, 4.0f, 19.880713f, 4.0f, 18.5f),
                    PathNode.LineTo(4.0f, 16.898f),
                    PathNode.LineTo(3.944f, 16.843f),
                    PathNode.CurveTo(2.139686f, 14.959407f, 1.532295f, 12.228844f, 2.368f, 9.758f),
                    PathNode.LineTo(2.46f, 9.502f),
                    PathNode.CurveTo(3.495662f, 6.790907f, 6.096825f, 5.000047f, 8.999f, 5.0f),
                    PathNode.LineTo(11.195f, 5.0f),
                    PathNode.LineTo(15.445f, 2.168f),
                    PathNode.CurveTo(15.575672f, 2.080836f, 15.725039f, 2.025679f, 15.881f, 2.007f),
                    PathNode.Close,
                    PathNode.MoveTo(15.0f, 10.0f),
                    PathNode.CurveTo(14.493025f, 10.000067f, 14.066316f, 10.379507f, 14.007f, 10.883f),
                    PathNode.LineTo(14.0f, 11.01f),
                    PathNode.CurveTo(14.000587f, 11.539093f, 14.413211f, 11.976165f, 14.941395f, 12.007172f),
                    PathNode.CurveTo(15.469579f, 12.038179f, 15.93051f, 11.65239f, 15.993f, 11.127f),
                    PathNode.LineTo(16.0f, 11.0f),
                    PathNode.CurveTo(16.0f, 10.447715f, 15.552285f, 10.0f, 15.0f, 10.0f)
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
        return _pig!!
    }

private var _pig: ImageVector? = null
