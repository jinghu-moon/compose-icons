package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.HeartHandshake: ImageVector
    get() {
        if (_heartHandshake != null) return _heartHandshake!!
        _heartHandshake = lucideOutlineIcon(
            name = "HeartHandshake",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.414f, 14.414f),
                    PathNode.CurveTo(21.0f, 12.828f, 22.0f, 11.5f, 22.0f, 9.5f),
                    PathNode.CurveTo(21.999958f, 7.221946f, 20.595556f, 5.179691f, 18.468391f, 4.364399f),
                    PathNode.CurveTo(16.341227f, 3.549108f, 13.93161f, 4.129542f, 12.409f, 5.824f),
                    PathNode.CurveTo(12.178848f, 6.038952f, 11.821677f, 6.039388f, 11.591f, 5.825f),
                    PathNode.CurveTo(10.068512f, 4.130678f, 7.659144f, 3.550187f, 5.532076f, 4.36522f),
                    PathNode.CurveTo(3.405007f, 5.180253f, 2.000456f, 7.222129f, 2.0f, 9.5f),
                    PathNode.CurveTo(2.0f, 11.8f, 3.5f, 13.5f, 5.0f, 15.0f),
                    PathNode.LineTo(10.535f, 20.362f),
                    PathNode.CurveTo(10.904828f, 20.75968f, 11.420473f, 20.98987f, 11.963452f, 20.999678f),
                    PathNode.CurveTo(12.506431f, 21.009483f, 13.030052f, 20.798065f, 13.414f, 20.414f),
                    PathNode.CurveTo(13.811619f, 20.015816f, 14.034619f, 19.475887f, 14.033869f, 18.913172f),
                    PathNode.CurveTo(14.033118f, 18.350454f, 13.80868f, 17.81112f, 13.41f, 17.414f),
                    PathNode.CurveTo(13.936038f, 17.995735f, 14.739847f, 18.240242f, 15.500719f, 18.049961f),
                    PathNode.CurveTo(16.261591f, 17.859684f, 16.855684f, 17.265593f, 17.045963f, 16.504719f),
                    PathNode.CurveTo(17.236242f, 15.743847f, 16.991735f, 14.940038f, 16.41f, 14.414f),
                    PathNode.CurveTo(16.808336f, 14.812391f, 17.348627f, 15.03621f, 17.912f, 15.03621f),
                    PathNode.CurveTo(18.475372f, 15.03621f, 19.015665f, 14.812391f, 19.414f, 14.414f),
                    PathNode.CurveTo(20.194763f, 13.633f, 20.194763f, 12.367f, 19.414f, 11.586f),
                    PathNode.LineTo(17.533f, 9.704f),
                    PathNode.CurveTo(17.081009f, 9.251809f, 16.467854f, 8.997755f, 15.8285f, 8.997755f),
                    PathNode.CurveTo(15.189146f, 8.997755f, 14.575993f, 9.251809f, 14.124f, 9.704f),
                    PathNode.LineTo(12.414f, 11.414f),
                    PathNode.CurveTo(11.633f, 12.194764f, 10.367f, 12.194764f, 9.586f, 11.414f),
                    PathNode.CurveTo(8.805236f, 10.633f, 8.805236f, 9.367f, 9.586f, 8.586f),
                    PathNode.LineTo(12.409f, 5.824f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _heartHandshake!!
    }

private var _heartHandshake: ImageVector? = null
