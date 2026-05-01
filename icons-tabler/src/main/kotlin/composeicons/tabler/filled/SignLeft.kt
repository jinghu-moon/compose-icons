package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SignLeft: ImageVector
    get() {
        if (_signLeft != null) return _signLeft!!
        _signLeft = tablerFilledIcon(
            name = "SignLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 2.0f),
                    PathNode.CurveTo(14.506975f, 2.000067f, 14.933684f, 2.379507f, 14.993f, 2.883f),
                    PathNode.LineTo(15.0f, 3.0f),
                    PathNode.LineTo(15.0f, 5.0f),
                    PathNode.LineTo(18.0f, 5.0f),
                    PathNode.CurveTo(18.506975f, 5.000067f, 18.933683f, 5.379507f, 18.993f, 5.883f),
                    PathNode.LineTo(19.0f, 6.0f),
                    PathNode.LineTo(19.0f, 11.0f),
                    PathNode.CurveTo(18.999933f, 11.506975f, 18.620493f, 11.933684f, 18.117f, 11.993f),
                    PathNode.LineTo(18.0f, 12.0f),
                    PathNode.LineTo(15.0f, 12.0f),
                    PathNode.LineTo(15.0f, 20.0f),
                    PathNode.LineTo(16.0f, 20.0f),
                    PathNode.CurveTo(16.529093f, 20.000587f, 16.966166f, 20.41321f, 16.997171f, 20.941395f),
                    PathNode.CurveTo(17.02818f, 21.46958f, 16.642391f, 21.93051f, 16.117f, 21.993f),
                    PathNode.LineTo(16.0f, 22.0f),
                    PathNode.LineTo(12.0f, 22.0f),
                    PathNode.CurveTo(11.470906f, 21.999413f, 11.033835f, 21.58679f, 11.002828f, 21.058605f),
                    PathNode.CurveTo(10.971821f, 20.53042f, 11.35761f, 20.06949f, 11.883f, 20.007f),
                    PathNode.LineTo(12.0f, 20.0f),
                    PathNode.LineTo(13.0f, 20.0f),
                    PathNode.LineTo(13.0f, 12.0f),
                    PathNode.LineTo(8.0f, 12.0f),
                    PathNode.CurveTo(7.741146f, 12.000007f, 7.492375f, 11.899638f, 7.306f, 11.72f),
                    PathNode.LineTo(7.219f, 11.625f),
                    PathNode.LineTo(5.219f, 9.125f),
                    PathNode.CurveTo(4.955758f, 8.796015f, 4.926965f, 8.337322f, 5.147f, 7.978f),
                    PathNode.LineTo(5.219f, 7.875f),
                    PathNode.LineTo(7.219f, 5.375f),
                    PathNode.CurveTo(7.380657f, 5.172909f, 7.614366f, 5.041358f, 7.871f, 5.008f),
                    PathNode.LineTo(8.0f, 5.0f),
                    PathNode.LineTo(13.0f, 5.0f),
                    PathNode.LineTo(13.0f, 3.0f),
                    PathNode.CurveTo(13.0f, 2.447715f, 13.447715f, 2.0f, 14.0f, 2.0f),
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
        return _signLeft!!
    }

private var _signLeft: ImageVector? = null
