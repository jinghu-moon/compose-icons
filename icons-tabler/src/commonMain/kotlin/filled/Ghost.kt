package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Ghost: ImageVector
    get() {
        if (_ghost != null) return _ghost!!
        _ghost = tablerFilledIcon(
            name = "Ghost",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 3.0f),
                    PathNode.CurveTo(16.320908f, 3.00005f, 19.860971f, 6.431203f, 19.996f, 10.75f),
                    PathNode.LineTo(20.0f, 11.0f),
                    PathNode.LineTo(19.999f, 17.954f),
                    PathNode.LineTo(20.009f, 18.057f),
                    PathNode.CurveTo(20.073277f, 19.141548f, 19.499865f, 20.16416f, 18.541f, 20.675f),
                    PathNode.LineTo(18.378f, 20.755f),
                    PathNode.CurveTo(17.325f, 21.23f, 16.095f, 21.003f, 15.249f, 20.162f),
                    PathNode.LineTo(15.112f, 20.016f),
                    PathNode.CurveTo(14.988806f, 19.858486f, 14.799968f, 19.766445f, 14.6f, 19.766445f),
                    PathNode.CurveTo(14.400032f, 19.766445f, 14.211194f, 19.858486f, 14.088f, 20.016f),
                    PathNode.CurveTo(13.585774f, 20.658634f, 12.815604f, 21.034204f, 12.0f, 21.034204f),
                    PathNode.CurveTo(11.184396f, 21.034204f, 10.414226f, 20.658634f, 9.912f, 20.016f),
                    PathNode.CurveTo(9.788896f, 19.85832f, 9.600044f, 19.766108f, 9.4f, 19.766f),
                    PathNode.CurveTo(9.2f, 19.766f, 9.011f, 19.858f, 8.85f, 20.062f),
                    PathNode.CurveTo(8.064912f, 20.951132f, 6.802161f, 21.24421f, 5.705703f, 20.79177f),
                    PathNode.CurveTo(4.609245f, 20.339333f, 3.920619f, 19.241047f, 3.991f, 18.057f),
                    PathNode.LineTo(3.999f, 17.966f),
                    PathNode.LineTo(4.0f, 11.0f),
                    PathNode.LineTo(4.004f, 10.75f),
                    PathNode.CurveTo(4.139029f, 6.431203f, 7.679092f, 3.00005f, 12.0f, 3.0f),
                    PathNode.Close,
                    PathNode.MoveTo(14.82f, 13.429f),
                    PathNode.CurveTo(14.50471f, 12.976179f, 13.882233f, 12.864304f, 13.429f, 13.179f),
                    PathNode.CurveTo(12.570247f, 13.777225f, 11.429753f, 13.777225f, 10.571f, 13.179f),
                    PathNode.CurveTo(10.117575f, 12.863646f, 9.494354f, 12.975574f, 9.179f, 13.429f),
                    PathNode.CurveTo(8.863646f, 13.882425f, 8.975574f, 14.505646f, 9.429f, 14.821f),
                    PathNode.CurveTo(10.974226f, 15.896691f, 13.025774f, 15.896691f, 14.571f, 14.821f),
                    PathNode.CurveTo(14.788752f, 14.669568f, 14.937425f, 14.437834f, 14.984309f, 14.17678f),
                    PathNode.CurveTo(15.031194f, 13.915726f, 14.972449f, 13.646739f, 14.821f, 13.429f),
                    PathNode.Close,
                    PathNode.MoveTo(10.01f, 9.0f),
                    PathNode.LineTo(9.883f, 9.007f),
                    PathNode.CurveTo(9.35761f, 9.06949f, 8.971821f, 9.530421f, 9.002828f, 10.058605f),
                    PathNode.CurveTo(9.033835f, 10.586789f, 9.470906f, 10.999413f, 10.0f, 11.0f),
                    PathNode.LineTo(10.127f, 10.993f),
                    PathNode.CurveTo(10.65239f, 10.93051f, 11.038179f, 10.469579f, 11.007172f, 9.941395f),
                    PathNode.CurveTo(10.976165f, 9.413211f, 10.539093f, 9.000587f, 10.01f, 9.0f),
                    PathNode.Close,
                    PathNode.MoveTo(14.01f, 9.0f),
                    PathNode.LineTo(13.883f, 9.007f),
                    PathNode.CurveTo(13.35761f, 9.06949f, 12.971821f, 9.530421f, 13.002828f, 10.058605f),
                    PathNode.CurveTo(13.033835f, 10.586789f, 13.470906f, 10.999413f, 14.0f, 11.0f),
                    PathNode.LineTo(14.127f, 10.993f),
                    PathNode.CurveTo(14.65239f, 10.93051f, 15.038179f, 10.469579f, 15.007172f, 9.941395f),
                    PathNode.CurveTo(14.976165f, 9.413211f, 14.539093f, 9.000587f, 14.01f, 9.0f),
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
        return _ghost!!
    }

private var _ghost: ImageVector? = null
