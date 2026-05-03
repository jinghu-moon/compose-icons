package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BellPlus: ImageVector
    get() {
        if (_bellPlus != null) return _bellPlus!!
        _bellPlus = tablerFilledIcon(
            name = "BellPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.235f, 19.0f),
                    PathNode.CurveTo(15.1f, 19.0f, 15.557f, 20.024f, 14.98f, 20.668f),
                    PathNode.CurveTo(14.221871f, 21.516378f, 13.137763f, 22.000954f, 12.0f, 22.0f),
                    PathNode.CurveTo(10.862237f, 22.000954f, 9.778129f, 21.516378f, 9.02f, 20.668f),
                    PathNode.CurveTo(8.468f, 20.052f, 8.862f, 19.089f, 9.654f, 19.007f),
                    PathNode.LineTo(9.764f, 19.001f),
                    PathNode.LineTo(14.235f, 19.001f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.CurveTo(13.358f, 2.0f, 14.506f, 2.903f, 14.875f, 4.141f),
                    PathNode.LineTo(14.921f, 4.312f),
                    PathNode.LineTo(14.929f, 4.355f),
                    PathNode.CurveTo(17.165161f, 5.616509f, 18.661413f, 7.873157f, 18.953f, 10.424f),
                    PathNode.LineTo(18.981f, 10.711f),
                    PathNode.LineTo(19.0f, 11.0f),
                    PathNode.LineTo(19.0f, 13.931f),
                    PathNode.LineTo(19.021f, 14.067f),
                    PathNode.CurveTo(19.157925f, 14.803823f, 19.565672f, 15.462713f, 20.164f, 15.914f),
                    PathNode.LineTo(20.331f, 16.031f),
                    PathNode.LineTo(20.493f, 16.13f),
                    PathNode.CurveTo(21.353f, 16.617f, 21.053f, 17.896f, 20.116f, 17.994f),
                    PathNode.LineTo(20.0f, 18.0f),
                    PathNode.LineTo(4.0f, 18.0f),
                    PathNode.CurveTo(2.972f, 18.0f, 2.613f, 16.636f, 3.507f, 16.13f),
                    PathNode.CurveTo(4.2783f, 15.693515f, 4.817139f, 14.938334f, 4.979f, 14.067f),
                    PathNode.LineTo(5.0f, 13.924f),
                    PathNode.LineTo(5.001f, 10.954f),
                    PathNode.CurveTo(5.124806f, 8.301907f, 6.556288f, 5.884008f, 8.822f, 4.5f),
                    PathNode.LineTo(9.07f, 4.354f),
                    PathNode.LineTo(9.08f, 4.311f),
                    PathNode.CurveTo(9.369734f, 3.086205f, 10.392496f, 2.172027f, 11.642f, 2.021f),
                    PathNode.LineTo(11.824f, 2.004f),
                    PathNode.LineTo(12.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 8.0f),
                    PathNode.CurveTo(11.447715f, 8.0f, 11.0f, 8.447715f, 11.0f, 9.0f),
                    PathNode.LineTo(11.0f, 10.0f),
                    PathNode.LineTo(10.0f, 10.0f),
                    PathNode.LineTo(9.883f, 10.007f),
                    PathNode.CurveTo(9.35761f, 10.06949f, 8.971821f, 10.530421f, 9.002828f, 11.058605f),
                    PathNode.CurveTo(9.033835f, 11.586789f, 9.470906f, 11.999413f, 10.0f, 12.0f),
                    PathNode.LineTo(11.0f, 12.0f),
                    PathNode.LineTo(11.0f, 13.0f),
                    PathNode.LineTo(11.007f, 13.117f),
                    PathNode.CurveTo(11.06949f, 13.64239f, 11.530421f, 14.028179f, 12.058605f, 13.997172f),
                    PathNode.CurveTo(12.586789f, 13.966165f, 12.999413f, 13.529094f, 13.0f, 13.0f),
                    PathNode.LineTo(13.0f, 12.0f),
                    PathNode.LineTo(14.0f, 12.0f),
                    PathNode.LineTo(14.117f, 11.993f),
                    PathNode.CurveTo(14.64239f, 11.93051f, 15.028179f, 11.469579f, 14.997172f, 10.941395f),
                    PathNode.CurveTo(14.966165f, 10.413211f, 14.529094f, 10.000587f, 14.0f, 10.0f),
                    PathNode.LineTo(13.0f, 10.0f),
                    PathNode.LineTo(13.0f, 9.0f),
                    PathNode.LineTo(12.993f, 8.883f),
                    PathNode.CurveTo(12.933684f, 8.379507f, 12.506975f, 8.000067f, 12.0f, 8.0f),
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
        return _bellPlus!!
    }

private var _bellPlus: ImageVector? = null
