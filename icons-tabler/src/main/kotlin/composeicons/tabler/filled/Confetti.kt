package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Confetti: ImageVector
    get() {
        if (_confetti != null) return _confetti!!
        _confetti = tablerFilledIcon(
            name = "Confetti",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 5.0f),
                    PathNode.CurveTo(3.0f, 4.447716f, 3.447715f, 4.0f, 4.0f, 4.0f),
                    PathNode.CurveTo(4.000587f, 3.470907f, 4.413211f, 3.033835f, 4.941395f, 3.002828f),
                    PathNode.CurveTo(5.469579f, 2.971821f, 5.930509f, 3.35761f, 5.993f, 3.883f),
                    PathNode.LineTo(6.0f, 4.0f),
                    PathNode.CurveTo(6.529094f, 4.000587f, 6.966165f, 4.413211f, 6.997172f, 4.941395f),
                    PathNode.CurveTo(7.028179f, 5.469579f, 6.642391f, 5.930509f, 6.117f, 5.993f),
                    PathNode.LineTo(6.0f, 6.0f),
                    PathNode.CurveTo(6.0f, 6.552285f, 5.552285f, 7.0f, 5.0f, 7.0f),
                    PathNode.CurveTo(4.447716f, 7.0f, 4.0f, 6.552285f, 4.0f, 6.0f),
                    PathNode.CurveTo(3.447715f, 6.0f, 3.0f, 5.552285f, 3.0f, 5.0f),
                    PathNode.MoveTo(10.53f, 3.757f),
                    PathNode.CurveTo(10.614742f, 3.408179f, 10.879949f, 3.13154f, 11.224884f, 3.03216f),
                    PathNode.CurveTo(11.56982f, 2.932779f, 11.941561f, 3.025906f, 12.198906f, 3.276167f),
                    PathNode.CurveTo(12.456251f, 3.526429f, 12.559715f, 3.895425f, 12.47f, 4.243f),
                    PathNode.LineTo(11.97f, 6.243f),
                    PathNode.CurveTo(11.885258f, 6.591821f, 11.620051f, 6.86846f, 11.275116f, 6.96784f),
                    PathNode.CurveTo(10.93018f, 7.067221f, 10.558439f, 6.974094f, 10.301094f, 6.723833f),
                    PathNode.CurveTo(10.043749f, 6.473572f, 9.940285f, 6.104575f, 10.03f, 5.757f),
                    PathNode.Close,
                    PathNode.MoveTo(17.0f, 5.0f),
                    PathNode.CurveTo(17.0f, 4.447716f, 17.447716f, 4.0f, 18.0f, 4.0f),
                    PathNode.CurveTo(18.000587f, 3.470907f, 18.41321f, 3.033835f, 18.941395f, 3.002828f),
                    PathNode.CurveTo(19.46958f, 2.971821f, 19.93051f, 3.35761f, 19.993f, 3.883f),
                    PathNode.LineTo(20.0f, 4.0f),
                    PathNode.CurveTo(20.529093f, 4.000587f, 20.966166f, 4.413211f, 20.997171f, 4.941395f),
                    PathNode.CurveTo(21.02818f, 5.469579f, 20.642391f, 5.930509f, 20.117f, 5.993f),
                    PathNode.LineTo(20.0f, 6.0f),
                    PathNode.CurveTo(20.0f, 6.552285f, 19.552284f, 7.0f, 19.0f, 7.0f),
                    PathNode.CurveTo(18.447716f, 7.0f, 18.0f, 6.552285f, 18.0f, 6.0f),
                    PathNode.CurveTo(17.447716f, 6.0f, 17.0f, 5.552285f, 17.0f, 5.0f),
                    PathNode.MoveTo(8.19f, 9.293f),
                    PathNode.LineTo(14.707f, 15.811f),
                    PathNode.CurveTo(14.938918f, 16.042454f, 15.04274f, 16.372837f, 14.9849f, 16.695345f),
                    PathNode.CurveTo(14.927059f, 17.017853f, 14.714897f, 17.291567f, 14.417f, 17.428f),
                    PathNode.LineTo(4.844f, 21.815f),
                    PathNode.CurveTo(4.083011f, 22.170135f, 3.181216f, 22.012053f, 2.586399f, 21.419249f),
                    PathNode.CurveTo(1.991581f, 20.826443f, 1.830445f, 19.925188f, 2.183f, 19.163f),
                    PathNode.LineTo(6.573f, 9.583f),
                    PathNode.CurveTo(6.709532f, 9.285483f, 6.983034f, 9.073627f, 7.305235f, 9.015805f),
                    PathNode.CurveTo(7.627436f, 8.957985f, 7.957538f, 9.061522f, 8.189f, 9.293f),
                    PathNode.MoveTo(15.706f, 8.293f),
                    PathNode.CurveTo(16.096382f, 8.6835f, 16.096382f, 9.3165f, 15.706f, 9.707f),
                    PathNode.LineTo(14.706f, 10.707f),
                    PathNode.CurveTo(14.313622f, 11.085972f, 13.689916f, 11.080552f, 13.304181f, 10.694818f),
                    PathNode.CurveTo(12.918447f, 10.309085f, 12.913028f, 9.685379f, 13.292f, 9.293f),
                    PathNode.LineTo(14.292f, 8.293f),
                    PathNode.CurveTo(14.6825f, 7.902618f, 15.3155f, 7.902618f, 15.706f, 8.293f),
                    PathNode.MoveTo(19.756f, 11.53f),
                    PathNode.CurveTo(20.289967f, 11.400279f, 20.828566f, 11.725702f, 20.962097f, 12.258729f),
                    PathNode.CurveTo(21.095629f, 12.791756f, 20.77406f, 13.332665f, 20.242f, 13.47f),
                    PathNode.LineTo(18.242f, 13.97f),
                    PathNode.CurveTo(17.708033f, 14.099721f, 17.169434f, 13.774298f, 17.035902f, 13.241271f),
                    PathNode.CurveTo(16.90237f, 12.708244f, 17.22394f, 12.167335f, 17.756f, 12.03f),
                    PathNode.Close,
                    PathNode.MoveTo(17.0f, 19.0f),
                    PathNode.CurveTo(17.0f, 18.447716f, 17.447716f, 18.0f, 18.0f, 18.0f),
                    PathNode.CurveTo(18.000587f, 17.470907f, 18.41321f, 17.033834f, 18.941395f, 17.002829f),
                    PathNode.CurveTo(19.46958f, 16.97182f, 19.93051f, 17.357609f, 19.993f, 17.883f),
                    PathNode.LineTo(20.0f, 18.0f),
                    PathNode.CurveTo(20.529093f, 18.000587f, 20.966166f, 18.41321f, 20.997171f, 18.941395f),
                    PathNode.CurveTo(21.02818f, 19.46958f, 20.642391f, 19.93051f, 20.117f, 19.993f),
                    PathNode.LineTo(20.0f, 20.0f),
                    PathNode.CurveTo(20.0f, 20.552284f, 19.552284f, 21.0f, 19.0f, 21.0f),
                    PathNode.CurveTo(18.447716f, 21.0f, 18.0f, 20.552284f, 18.0f, 20.0f),
                    PathNode.CurveTo(17.447716f, 20.0f, 17.0f, 19.552284f, 17.0f, 19.0f)
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
        return _confetti!!
    }

private var _confetti: ImageVector? = null
