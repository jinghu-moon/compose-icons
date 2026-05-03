package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareRoundedArrowLeft: ImageVector
    get() {
        if (_squareRoundedArrowLeft != null) return _squareRoundedArrowLeft!!
        _squareRoundedArrowLeft = tablerFilledIcon(
            name = "SquareRoundedArrowLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.LineTo(12.324f, 2.001f),
                    PathNode.LineTo(12.642f, 2.005f),
                    PathNode.LineTo(13.258f, 2.022f),
                    PathNode.LineTo(13.557f, 2.035f),
                    PathNode.LineTo(14.136f, 2.069f),
                    PathNode.LineTo(14.689f, 2.115f),
                    PathNode.CurveTo(19.474f, 2.579f, 21.421f, 4.526f, 21.885f, 9.311f),
                    PathNode.LineTo(21.931f, 9.864f),
                    PathNode.LineTo(21.965f, 10.443f),
                    PathNode.CurveTo(21.97f, 10.541f, 21.975f, 10.641f, 21.978f, 10.742f),
                    PathNode.LineTo(21.995f, 11.358f),
                    PathNode.LineTo(22.0f, 12.0f),
                    PathNode.LineTo(21.995f, 12.642f),
                    PathNode.LineTo(21.978f, 13.258f),
                    PathNode.LineTo(21.965f, 13.557f),
                    PathNode.LineTo(21.931f, 14.136f),
                    PathNode.LineTo(21.885f, 14.689f),
                    PathNode.CurveTo(21.421f, 19.474f, 19.474f, 21.421f, 14.689f, 21.885f),
                    PathNode.LineTo(14.136f, 21.931f),
                    PathNode.LineTo(13.557f, 21.965f),
                    PathNode.CurveTo(13.459f, 21.97f, 13.359f, 21.975f, 13.258f, 21.978f),
                    PathNode.LineTo(12.642f, 21.995f),
                    PathNode.LineTo(12.0f, 22.0f),
                    PathNode.LineTo(11.358f, 21.995f),
                    PathNode.LineTo(10.742f, 21.978f),
                    PathNode.LineTo(10.443f, 21.965f),
                    PathNode.LineTo(9.864f, 21.931f),
                    PathNode.LineTo(9.311f, 21.885f),
                    PathNode.CurveTo(4.526f, 21.421f, 2.579f, 19.474f, 2.115f, 14.689f),
                    PathNode.LineTo(2.069f, 14.136f),
                    PathNode.LineTo(2.035f, 13.557f),
                    PathNode.CurveTo(2.030135f, 13.457357f, 2.025802f, 13.357689f, 2.022f, 13.258f),
                    PathNode.LineTo(2.005f, 12.642f),
                    PathNode.CurveTo(2.002f, 12.432f, 2.0f, 12.218f, 2.0f, 12.0f),
                    PathNode.LineTo(2.001f, 11.676f),
                    PathNode.LineTo(2.005f, 11.358f),
                    PathNode.LineTo(2.022f, 10.742f),
                    PathNode.LineTo(2.035f, 10.443f),
                    PathNode.LineTo(2.069f, 9.864f),
                    PathNode.LineTo(2.115f, 9.311f),
                    PathNode.CurveTo(2.579f, 4.526f, 4.526f, 2.579f, 9.311f, 2.115f),
                    PathNode.LineTo(9.864f, 2.069f),
                    PathNode.LineTo(10.443f, 2.035f),
                    PathNode.CurveTo(10.541f, 2.03f, 10.641f, 2.025f, 10.742f, 2.022f),
                    PathNode.LineTo(11.358f, 2.005f),
                    PathNode.CurveTo(11.568f, 2.002f, 11.782f, 2.0f, 12.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.707f, 7.293f),
                    PathNode.CurveTo(12.3165f, 6.902618f, 11.6835f, 6.902618f, 11.293f, 7.293f),
                    PathNode.LineTo(7.293f, 11.293f),
                    PathNode.CurveTo(7.21084f, 11.375749f, 7.143225f, 11.471762f, 7.093f, 11.577f),
                    PathNode.LineTo(7.071f, 11.629f),
                    PathNode.CurveTo(7.042084f, 11.700297f, 7.021937f, 11.774843f, 7.011f, 11.851f),
                    PathNode.LineTo(7.003f, 11.918f),
                    PathNode.LineTo(7.001f, 11.981f),
                    PathNode.LineTo(7.001f, 11.946f),
                    PathNode.LineTo(7.001f, 12.019f),
                    PathNode.CurveTo(7.003637f, 12.139517f, 7.027327f, 12.258644f, 7.071f, 12.371f),
                    PathNode.LineTo(7.094f, 12.423f),
                    PathNode.LineTo(7.124f, 12.484f),
                    PathNode.LineTo(7.146f, 12.521f),
                    PathNode.CurveTo(7.161743f, 12.546279f, 7.178421f, 12.570962f, 7.196f, 12.595f),
                    PathNode.LineTo(7.22f, 12.625f),
                    PathNode.LineTo(7.293f, 12.707f),
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
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _squareRoundedArrowLeft!!
    }

private var _squareRoundedArrowLeft: ImageVector? = null
