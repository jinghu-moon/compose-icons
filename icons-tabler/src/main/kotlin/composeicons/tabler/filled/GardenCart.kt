package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.GardenCart: ImageVector
    get() {
        if (_gardenCart != null) return _gardenCart!!
        _gardenCart = tablerFilledIcon(
            name = "GardenCart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.324f, 3.0f),
                    PathNode.CurveTo(4.14129f, 3.000926f, 4.875786f, 3.499037f, 5.179f, 4.258f),
                    PathNode.LineTo(6.276f, 7.0f),
                    PathNode.LineTo(21.0f, 7.0f),
                    PathNode.CurveTo(21.326061f, 7.000021f, 21.631638f, 7.159007f, 21.818796f, 7.426005f),
                    PathNode.CurveTo(22.005953f, 7.693004f, 22.051188f, 8.034481f, 21.94f, 8.341f),
                    PathNode.LineTo(21.894f, 8.447f),
                    PathNode.LineTo(18.96f, 14.318f),
                    PathNode.CurveTo(20.541021f, 15.043662f, 21.349121f, 16.82036f, 20.857073f, 18.488922f),
                    PathNode.CurveTo(20.365025f, 20.157486f, 18.722189f, 21.211418f, 17.0004f, 20.963102f),
                    PathNode.CurveTo(15.278613f, 20.714787f, 14.000525f, 19.239601f, 14.0f, 17.5f),
                    PathNode.LineTo(14.005f, 17.308f),
                    PathNode.CurveTo(14.036404f, 16.735954f, 14.20775f, 16.180365f, 14.504f, 15.69f),
                    PathNode.LineTo(12.058f, 15.432f),
                    PathNode.LineTo(8.612f, 20.182f),
                    PathNode.CurveTo(8.135487f, 20.831833f, 7.315531f, 21.132221f, 6.532f, 20.944f),
                    PathNode.LineTo(6.378f, 20.9f),
                    PathNode.CurveTo(5.556263f, 20.631105f, 5.000355f, 19.864613f, 5.0f, 19.0f),
                    PathNode.LineTo(5.0f, 9.196f),
                    PathNode.LineTo(3.321f, 5.0f),
                    PathNode.LineTo(2.0f, 5.0f),
                    PathNode.CurveTo(1.493025f, 4.999933f, 1.066316f, 4.620493f, 1.007f, 4.117f),
                    PathNode.LineTo(1.0f, 4.0f),
                    PathNode.CurveTo(1.0f, 3.447715f, 1.447715f, 3.0f, 2.0f, 3.0f),
                    PathNode.Close,
                    PathNode.MoveTo(17.5f, 16.0f),
                    PathNode.CurveTo(16.671574f, 16.0f, 16.0f, 16.671574f, 16.0f, 17.5f),
                    PathNode.CurveTo(16.0f, 18.328426f, 16.671574f, 19.0f, 17.5f, 19.0f),
                    PathNode.CurveTo(18.328426f, 19.0f, 19.0f, 18.328426f, 19.0f, 17.5f),
                    PathNode.CurveTo(19.0f, 16.671574f, 18.328426f, 16.0f, 17.5f, 16.0f),
                    PathNode.MoveTo(7.0f, 13.502f),
                    PathNode.LineTo(6.998f, 19.0f),
                    PathNode.LineTo(9.781f, 15.167f),
                    PathNode.CurveTo(8.779296f, 14.954907f, 7.866855f, 14.440393f, 7.167f, 13.693f),
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
        return _gardenCart!!
    }

private var _gardenCart: ImageVector? = null
