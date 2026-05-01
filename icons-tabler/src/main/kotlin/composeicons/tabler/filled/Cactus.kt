package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Cactus: ImageVector
    get() {
        if (_cactus != null) return _cactus!!
        _cactus = tablerFilledIcon(
            name = "Cactus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 22.0f),
                    PathNode.CurveTo(6.470907f, 21.999413f, 6.033836f, 21.58679f, 6.002828f, 21.058605f),
                    PathNode.CurveTo(5.971821f, 20.53042f, 6.35761f, 20.06949f, 6.883f, 20.007f),
                    PathNode.LineTo(7.0f, 20.0f),
                    PathNode.LineTo(9.0f, 20.0f),
                    PathNode.LineTo(9.0f, 14.0f),
                    PathNode.CurveTo(6.868599f, 14.000002f, 5.11157f, 12.328735f, 5.005f, 10.2f),
                    PathNode.LineTo(5.0f, 10.0f),
                    PathNode.LineTo(5.0f, 9.0f),
                    PathNode.CurveTo(5.000587f, 8.470906f, 5.413211f, 8.033836f, 5.941395f, 8.002828f),
                    PathNode.CurveTo(6.469579f, 7.971821f, 6.930509f, 8.35761f, 6.993f, 8.883f),
                    PathNode.LineTo(7.0f, 9.0f),
                    PathNode.LineTo(7.0f, 10.0f),
                    PathNode.CurveTo(6.999669f, 11.046625f, 7.806323f, 11.916503f, 8.85f, 11.995f),
                    PathNode.LineTo(9.0f, 12.0f),
                    PathNode.LineTo(9.0f, 5.0f),
                    PathNode.CurveTo(8.998435f, 3.376305f, 10.288967f, 2.046048f, 11.911963f, 1.998401f),
                    PathNode.CurveTo(13.534959f, 1.950753f, 14.901308f, 3.20301f, 14.995f, 4.824f),
                    PathNode.LineTo(15.0f, 5.0f),
                    PathNode.LineTo(15.0f, 15.0f),
                    PathNode.CurveTo(16.046625f, 15.000331f, 16.916504f, 14.193677f, 16.995f, 13.15f),
                    PathNode.LineTo(17.0f, 13.0f),
                    PathNode.LineTo(17.0f, 8.0f),
                    PathNode.CurveTo(17.000587f, 7.470907f, 17.41321f, 7.033836f, 17.941395f, 7.002828f),
                    PathNode.CurveTo(18.46958f, 6.971821f, 18.93051f, 7.35761f, 18.993f, 7.883f),
                    PathNode.LineTo(19.0f, 8.0f),
                    PathNode.LineTo(19.0f, 13.0f),
                    PathNode.CurveTo(19.000002f, 15.131401f, 17.328735f, 16.88843f, 15.2f, 16.995f),
                    PathNode.LineTo(15.0f, 17.0f),
                    PathNode.LineTo(15.0f, 20.0f),
                    PathNode.LineTo(17.0f, 20.0f),
                    PathNode.CurveTo(17.529093f, 20.000587f, 17.966166f, 20.41321f, 17.997171f, 20.941395f),
                    PathNode.CurveTo(18.02818f, 21.46958f, 17.642391f, 21.93051f, 17.117f, 21.993f),
                    PathNode.LineTo(17.0f, 22.0f),
                    PathNode.LineTo(7.0f, 22.0f),
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
        return _cactus!!
    }

private var _cactus: ImageVector? = null
