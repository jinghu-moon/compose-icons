package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleArrowLeft: ImageVector
    get() {
        if (_circleArrowLeft != null) return _circleArrowLeft!!
        _circleArrowLeft = tablerFilledIcon(
            name = "CircleArrowLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.CurveTo(17.462755f, 1.995679f, 21.91809f, 6.375938f, 22.006598f, 11.837977f),
                    PathNode.CurveTo(22.095106f, 17.300018f, 17.784027f, 21.822329f, 12.324f, 21.995f),
                    PathNode.LineTo(12.0f, 22.0f),
                    PathNode.LineTo(11.676f, 21.995f),
                    PathNode.CurveTo(6.215973f, 21.822329f, 1.904895f, 17.300018f, 1.993402f, 11.837977f),
                    PathNode.CurveTo(2.081909f, 6.375938f, 6.537245f, 1.995679f, 12.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.707f, 7.293f),
                    PathNode.CurveTo(12.3165f, 6.902618f, 11.6835f, 6.902618f, 11.293f, 7.293f),
                    PathNode.LineTo(7.293f, 11.293f),
                    PathNode.CurveTo(7.263482f, 11.322648f, 7.235766f, 11.354038f, 7.21f, 11.387f),
                    PathNode.LineTo(7.146f, 11.479f),
                    PathNode.LineTo(7.094f, 11.577f),
                    PathNode.LineTo(7.05f, 11.687f),
                    PathNode.LineTo(7.02f, 11.799f),
                    PathNode.LineTo(7.003f, 11.925f),
                    PathNode.LineTo(7.0f, 12.0f),
                    PathNode.LineTo(7.004f, 12.09f),
                    PathNode.LineTo(7.011f, 12.148f),
                    PathNode.LineTo(7.036f, 12.266f),
                    PathNode.LineTo(7.071f, 12.371f),
                    PathNode.LineTo(7.125f, 12.484f),
                    PathNode.LineTo(7.168f, 12.554f),
                    PathNode.LineTo(7.239f, 12.649f),
                    PathNode.LineTo(7.293f, 12.707f),
                    PathNode.LineTo(11.293f, 16.707f),
                    PathNode.LineTo(11.387f, 16.79f),
                    PathNode.CurveTo(11.80413f, 17.112535f, 12.400022f, 17.055767f, 12.748752f, 16.660278f),
                    PathNode.CurveTo(13.097481f, 16.264788f, 13.07921f, 15.666476f, 12.707f, 15.293f),
                    PathNode.LineTo(10.415f, 13.0f),
                    PathNode.LineTo(16.0f, 13.0f),
                    PathNode.LineTo(16.117f, 12.993f),
                    PathNode.CurveTo(16.642391f, 12.93051f, 17.02818f, 12.469579f, 16.997171f, 11.941395f),
                    PathNode.CurveTo(16.966166f, 11.413211f, 16.529093f, 11.000587f, 16.0f, 11.0f),
                    PathNode.LineTo(10.414f, 11.0f),
                    PathNode.LineTo(12.707f, 8.707f),
                    PathNode.LineTo(12.79f, 8.613f),
                    PathNode.CurveTo(13.098803f, 8.214915f, 13.063235f, 7.649269f, 12.707f, 7.293f),
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
        return _circleArrowLeft!!
    }

private var _circleArrowLeft: ImageVector? = null
