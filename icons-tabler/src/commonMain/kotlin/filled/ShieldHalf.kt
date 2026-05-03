package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ShieldHalf: ImageVector
    get() {
        if (_shieldHalf != null) return _shieldHalf!!
        _shieldHalf = tablerFilledIcon(
            name = "ShieldHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.998f, 2.0f),
                    PathNode.LineTo(12.03f, 2.002f),
                    PathNode.LineTo(12.116f, 2.007f),
                    PathNode.CurveTo(12.235321f, 2.020845f, 12.351171f, 2.056074f, 12.458f, 2.111f),
                    PathNode.LineTo(12.563f, 2.173f),
                    PathNode.LineTo(12.66f, 2.249f),
                    PathNode.LineTo(12.676f, 2.264f),
                    PathNode.LineTo(12.923f, 2.474f),
                    PathNode.CurveTo(14.94031f, 4.149565f, 17.489864f, 5.049303f, 20.112f, 5.011f),
                    PathNode.LineTo(20.454f, 5.001f),
                    PathNode.CurveTo(20.914154f, 4.980007f, 21.32912f, 5.276058f, 21.459f, 5.718f),
                    PathNode.CurveTo(22.451826f, 9.095279f, 22.032593f, 12.730811f, 20.297144f, 15.793478f),
                    PathNode.CurveTo(18.561699f, 18.856146f, 15.658408f, 21.084097f, 12.251f, 21.968f),
                    PathNode.CurveTo(12.086389f, 22.010683f, 11.913611f, 22.010683f, 11.749f, 21.968f),
                    PathNode.CurveTo(8.341408f, 21.084318f, 5.437877f, 18.856457f, 3.702225f, 15.793764f),
                    PathNode.CurveTo(1.966573f, 12.731071f, 1.547205f, 9.095416f, 2.54f, 5.718f),
                    PathNode.CurveTo(2.669881f, 5.276058f, 3.084847f, 4.980007f, 3.545f, 5.001f),
                    PathNode.CurveTo(6.400674f, 5.131511f, 9.19499f, 4.145197f, 11.336f, 2.251f),
                    PathNode.LineTo(11.382f, 2.215f),
                    PathNode.LineTo(11.435f, 2.174f),
                    PathNode.CurveTo(11.502486f, 2.127942f, 11.575363f, 2.090328f, 11.652f, 2.062f),
                    PathNode.LineTo(11.727f, 2.039f),
                    PathNode.LineTo(11.763f, 2.029f),
                    PathNode.CurveTo(11.802515f, 2.019231f, 11.842589f, 2.011884f, 11.883f, 2.007f),
                    PathNode.LineTo(11.969f, 2.002f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 4.296f),
                    PathNode.LineTo(11.824f, 4.431f),
                    PathNode.CurveTo(9.711576f, 6.007329f, 7.169896f, 6.90431f, 4.536f, 7.003f),
                    PathNode.LineTo(4.272f, 7.009f),
                    PathNode.LineTo(4.208f, 7.319f),
                    PathNode.CurveTo(3.741247f, 9.762177f, 4.116315f, 12.29142f, 5.272f, 14.494f),
                    PathNode.LineTo(5.442f, 14.808f),
                    PathNode.CurveTo(6.854231f, 17.299597f, 9.182546f, 19.142159f, 11.932f, 19.944f),
                    PathNode.LineTo(12.0f, 19.963f),
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
        return _shieldHalf!!
    }

private var _shieldHalf: ImageVector? = null
