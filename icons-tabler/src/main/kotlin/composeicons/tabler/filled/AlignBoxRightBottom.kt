package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AlignBoxRightBottom: ImageVector
    get() {
        if (_alignBoxRightBottom != null) return _alignBoxRightBottom!!
        _alignBoxRightBottom = tablerFilledIcon(
            name = "AlignBoxRightBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.333f, 2.0f),
                    PathNode.CurveTo(20.293f, 2.0f, 21.893f, 3.537f, 21.995f, 5.472f),
                    PathNode.LineTo(22.0f, 5.667f),
                    PathNode.LineTo(22.0f, 18.333f),
                    PathNode.CurveTo(22.0f, 20.293f, 20.463f, 21.893f, 18.528f, 21.995f),
                    PathNode.LineTo(18.333f, 22.0f),
                    PathNode.LineTo(5.667f, 22.0f),
                    PathNode.CurveTo(3.717474f, 22.000101f, 2.10867f, 20.474768f, 2.005f, 18.528f),
                    PathNode.LineTo(2.0f, 18.333f),
                    PathNode.LineTo(2.0f, 5.667f),
                    PathNode.CurveTo(2.0f, 3.707f, 3.537f, 2.107f, 5.472f, 2.005f),
                    PathNode.LineTo(5.667f, 2.0f),
                    PathNode.LineTo(18.333f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(18.0f, 17.0f),
                    PathNode.LineTo(16.0f, 17.0f),
                    PathNode.LineTo(15.883f, 17.007f),
                    PathNode.CurveTo(15.35761f, 17.06949f, 14.971821f, 17.53042f, 15.002828f, 18.058605f),
                    PathNode.CurveTo(15.033835f, 18.58679f, 15.470906f, 18.999413f, 16.0f, 19.0f),
                    PathNode.LineTo(18.0f, 19.0f),
                    PathNode.LineTo(18.117f, 18.993f),
                    PathNode.CurveTo(18.642391f, 18.93051f, 19.02818f, 18.46958f, 18.997171f, 17.941395f),
                    PathNode.CurveTo(18.966166f, 17.41321f, 18.529093f, 17.000587f, 18.0f, 17.0f),
                    PathNode.Close,
                    PathNode.MoveTo(18.0f, 14.0f),
                    PathNode.LineTo(12.0f, 14.0f),
                    PathNode.LineTo(11.883f, 14.007f),
                    PathNode.CurveTo(11.35761f, 14.06949f, 10.971821f, 14.530421f, 11.002828f, 15.058605f),
                    PathNode.CurveTo(11.033835f, 15.586789f, 11.470906f, 15.999413f, 12.0f, 16.0f),
                    PathNode.LineTo(18.0f, 16.0f),
                    PathNode.LineTo(18.117f, 15.993f),
                    PathNode.CurveTo(18.642391f, 15.93051f, 19.02818f, 15.469579f, 18.997171f, 14.941395f),
                    PathNode.CurveTo(18.966166f, 14.413211f, 18.529093f, 14.000587f, 18.0f, 14.0f),
                    PathNode.Close,
                    PathNode.MoveTo(18.0f, 11.0f),
                    PathNode.LineTo(14.0f, 11.0f),
                    PathNode.LineTo(13.883f, 11.007f),
                    PathNode.CurveTo(13.35761f, 11.06949f, 12.971821f, 11.530421f, 13.002828f, 12.058605f),
                    PathNode.CurveTo(13.033835f, 12.586789f, 13.470906f, 12.999413f, 14.0f, 13.0f),
                    PathNode.LineTo(18.0f, 13.0f),
                    PathNode.LineTo(18.117f, 12.993f),
                    PathNode.CurveTo(18.642391f, 12.93051f, 19.02818f, 12.469579f, 18.997171f, 11.941395f),
                    PathNode.CurveTo(18.966166f, 11.413211f, 18.529093f, 11.000587f, 18.0f, 11.0f),
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
        return _alignBoxRightBottom!!
    }

private var _alignBoxRightBottom: ImageVector? = null
