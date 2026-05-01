package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareArrowLeft: ImageVector
    get() {
        if (_squareArrowLeft != null) return _squareArrowLeft!!
        _squareArrowLeft = tablerFilledIcon(
            name = "SquareArrowLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 2.0f),
                    PathNode.CurveTo(20.656855f, 2.0f, 22.0f, 3.343146f, 22.0f, 5.0f),
                    PathNode.LineTo(22.0f, 19.0f),
                    PathNode.CurveTo(22.0f, 20.656855f, 20.656855f, 22.0f, 19.0f, 22.0f),
                    PathNode.LineTo(5.0f, 22.0f),
                    PathNode.CurveTo(3.343146f, 22.0f, 2.0f, 20.656855f, 2.0f, 19.0f),
                    PathNode.LineTo(2.0f, 5.0f),
                    PathNode.CurveTo(2.0f, 3.343146f, 3.343146f, 2.0f, 5.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.707f, 7.293f),
                    PathNode.CurveTo(12.3165f, 6.902618f, 11.6835f, 6.902618f, 11.293f, 7.293f),
                    PathNode.LineTo(7.293f, 11.293f),
                    PathNode.LineTo(7.21f, 11.387f),
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
                    PathNode.LineTo(7.196f, 12.595f),
                    PathNode.CurveTo(7.226f, 12.635f, 7.257f, 12.672f, 7.293f, 12.707f),
                    PathNode.LineTo(11.293f, 16.707f),
                    PathNode.LineTo(11.387f, 16.79f),
                    PathNode.CurveTo(11.785086f, 17.098803f, 12.350732f, 17.063234f, 12.707f, 16.707f),
                    PathNode.LineTo(12.79f, 16.613f),
                    PathNode.CurveTo(13.098803f, 16.214914f, 13.063235f, 15.649268f, 12.707f, 15.293f),
                    PathNode.LineTo(10.415f, 13.0f),
                    PathNode.LineTo(16.0f, 13.0f),
                    PathNode.LineTo(16.117f, 12.993f),
                    PathNode.CurveTo(16.642391f, 12.93051f, 17.02818f, 12.469579f, 16.997171f, 11.941395f),
                    PathNode.CurveTo(16.966166f, 11.413211f, 16.529093f, 11.000587f, 16.0f, 11.0f),
                    PathNode.LineTo(10.415f, 11.0f),
                    PathNode.LineTo(12.707f, 8.707f),
                    PathNode.LineTo(12.79f, 8.613f),
                    PathNode.CurveTo(13.098803f, 8.214915f, 13.063235f, 7.649269f, 12.707f, 7.293f),
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
        return _squareArrowLeft!!
    }

private var _squareArrowLeft: ImageVector? = null
