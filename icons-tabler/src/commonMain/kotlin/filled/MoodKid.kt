package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.MoodKid: ImageVector
    get() {
        if (_moodKid != null) return _moodKid!!
        _moodKid = tablerFilledIcon(
            name = "MoodKid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 3.34f),
                    PathNode.CurveTo(21.1674f, 5.746208f, 23.030024f, 10.779379f, 21.433f, 15.318825f),
                    PathNode.CurveTo(19.835976f, 19.858273f, 15.232252f, 22.616514f, 10.476249f, 21.883377f),
                    PathNode.CurveTo(5.720245f, 21.15024f, 2.160861f, 17.133654f, 2.005f, 12.324f),
                    PathNode.LineTo(2.0f, 12.0f),
                    PathNode.LineTo(2.005f, 11.676f),
                    PathNode.CurveTo(2.143001f, 7.410401f, 4.972937f, 3.702486f, 9.051f, 2.444f),
                    PathNode.CurveTo(8.885464f, 3.321708f, 9.119628f, 4.227533f, 9.689792f, 4.915055f),
                    PathNode.CurveTo(10.259956f, 5.602577f, 11.106818f, 6.00029f, 12.0f, 6.0f),
                    PathNode.CurveTo(12.552285f, 6.0f, 13.0f, 5.552285f, 13.0f, 5.0f),
                    PathNode.CurveTo(13.0f, 4.447716f, 12.552285f, 4.0f, 12.0f, 4.0f),
                    PathNode.LineTo(11.883f, 3.993f),
                    PathNode.CurveTo(11.35761f, 3.930509f, 10.971821f, 3.469579f, 11.002828f, 2.941395f),
                    PathNode.CurveTo(11.033835f, 2.413211f, 11.470906f, 2.000587f, 12.0f, 2.0f),
                    PathNode.CurveTo(13.726f, 2.0f, 15.453f, 2.447f, 17.0f, 3.34f),
                    PathNode.Close,
                    PathNode.MoveTo(15.2f, 14.286f),
                    PathNode.CurveTo(14.805646f, 13.899457f, 14.172624f, 13.905725f, 13.786f, 14.3f),
                    PathNode.CurveTo(13.315757f, 14.780097f, 12.672028f, 15.050656f, 12.0f, 15.050656f),
                    PathNode.CurveTo(11.327972f, 15.050656f, 10.684243f, 14.780097f, 10.214f, 14.3f),
                    PathNode.CurveTo(9.825724f, 13.915112f, 9.200322f, 13.913386f, 8.809928f, 14.296126f),
                    PathNode.CurveTo(8.419534f, 14.678865f, 8.408875f, 15.304179f, 8.786f, 15.7f),
                    PathNode.CurveTo(9.63238f, 16.563675f, 10.790747f, 17.050364f, 12.0f, 17.050364f),
                    PathNode.CurveTo(13.209253f, 17.050364f, 14.36762f, 16.563675f, 15.214f, 15.7f),
                    PathNode.CurveTo(15.600543f, 15.305646f, 15.594275f, 14.672624f, 15.2f, 14.286f),
                    PathNode.Close,
                    PathNode.MoveTo(9.01f, 9.0f),
                    PathNode.LineTo(8.883f, 9.007f),
                    PathNode.CurveTo(8.35761f, 9.06949f, 7.971821f, 9.530421f, 8.002828f, 10.058605f),
                    PathNode.CurveTo(8.033836f, 10.586789f, 8.470906f, 10.999413f, 9.0f, 11.0f),
                    PathNode.LineTo(9.127f, 10.993f),
                    PathNode.CurveTo(9.65239f, 10.93051f, 10.038179f, 10.469579f, 10.007172f, 9.941395f),
                    PathNode.CurveTo(9.976165f, 9.413211f, 9.539093f, 9.000587f, 9.01f, 9.0f),
                    PathNode.Close,
                    PathNode.MoveTo(15.01f, 9.0f),
                    PathNode.LineTo(14.883f, 9.007f),
                    PathNode.CurveTo(14.35761f, 9.06949f, 13.971821f, 9.530421f, 14.002828f, 10.058605f),
                    PathNode.CurveTo(14.033835f, 10.586789f, 14.470906f, 10.999413f, 15.0f, 11.0f),
                    PathNode.LineTo(15.127f, 10.993f),
                    PathNode.CurveTo(15.65239f, 10.93051f, 16.03818f, 10.469579f, 16.007172f, 9.941395f),
                    PathNode.CurveTo(15.976165f, 9.413211f, 15.539093f, 9.000587f, 15.01f, 9.0f),
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
        return _moodKid!!
    }

private var _moodKid: ImageVector? = null
