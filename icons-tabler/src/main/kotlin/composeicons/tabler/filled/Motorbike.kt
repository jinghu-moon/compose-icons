package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Motorbike: ImageVector
    get() {
        if (_motorbike != null) return _motorbike!!
        _motorbike = tablerFilledIcon(
            name = "Motorbike",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 5.0f),
                    PathNode.CurveTo(15.378666f, 5.000202f, 15.724736f, 5.214271f, 15.894f, 5.553f),
                    PathNode.LineTo(19.119f, 12.002f),
                    PathNode.LineTo(19.199f, 12.005f),
                    PathNode.CurveTo(21.37957f, 12.113618f, 23.070234f, 13.950687f, 22.997799f, 16.13276f),
                    PathNode.CurveTo(22.925362f, 18.31483f, 21.116585f, 20.035732f, 18.93361f, 19.999496f),
                    PathNode.CurveTo(16.750637f, 19.963259f, 14.999974f, 18.183273f, 15.0f, 16.0f),
                    PathNode.LineTo(15.005f, 15.8f),
                    PathNode.CurveTo(15.074747f, 14.396208f, 15.876155f, 13.132027f, 17.116f, 12.47f),
                    PathNode.LineTo(16.559f, 11.355f),
                    PathNode.LineTo(13.207f, 14.707f),
                    PathNode.CurveTo(13.019507f, 14.894549f, 12.765195f, 14.999944f, 12.5f, 15.0f),
                    PathNode.LineTo(8.874f, 15.0f),
                    PathNode.QuadTo(8.998f, 15.481f, 9.0f, 16.0f),
                    PathNode.CurveTo(9.0f, 18.209139f, 7.209139f, 20.0f, 5.0f, 20.0f),
                    PathNode.CurveTo(2.790861f, 20.0f, 1.0f, 18.209139f, 1.0f, 16.0f),
                    PathNode.LineTo(1.005f, 15.8f),
                    PathNode.CurveTo(1.077794f, 14.336954f, 1.944493f, 13.030725f, 3.264231f, 12.395041f),
                    PathNode.CurveTo(4.583968f, 11.759356f, 6.14562f, 11.895912f, 7.335f, 12.751f),
                    PathNode.LineTo(9.084f, 11.0f),
                    PathNode.LineTo(6.0f, 11.0f),
                    PathNode.CurveTo(5.493026f, 10.999933f, 5.066316f, 10.620493f, 5.007f, 10.117f),
                    PathNode.LineTo(5.0f, 10.0f),
                    PathNode.CurveTo(5.0f, 9.447715f, 5.447716f, 9.0f, 6.0f, 9.0f),
                    PathNode.LineTo(15.381f, 9.0f),
                    PathNode.LineTo(14.381f, 7.0f),
                    PathNode.LineTo(13.0f, 7.0f),
                    PathNode.CurveTo(12.493025f, 6.999933f, 12.066316f, 6.620493f, 12.007f, 6.117f),
                    PathNode.LineTo(12.0f, 6.0f),
                    PathNode.CurveTo(12.0f, 5.447716f, 12.447715f, 5.0f, 13.0f, 5.0f),
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
        return _motorbike!!
    }

private var _motorbike: ImageVector? = null
