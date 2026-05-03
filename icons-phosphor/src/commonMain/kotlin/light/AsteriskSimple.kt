package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AsteriskSimple: ImageVector
    get() {
        if (_asteriskSimple != null) return _asteriskSimple!!
        _asteriskSimple = phosphorLightIcon(
            name = "AsteriskSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(210.23f, 101.57f),
                    PathNode.LineTo(137.63f, 130.57f),
                    PathNode.LineTo(188.74f, 196.28f),
                    PathNode.CurveTo(190.77242f, 198.89783f, 190.29784f, 202.66759f, 187.68f, 204.7f),
                    PathNode.CurveTo(185.06216f, 206.7324f, 181.2924f, 206.25783f, 179.26f, 203.64f),
                    PathNode.LineTo(128.0f, 137.77f),
                    PathNode.LineTo(76.74f, 203.68f),
                    PathNode.CurveTo(74.70759f, 206.29784f, 70.937836f, 206.77242f, 68.32f, 204.74f),
                    PathNode.CurveTo(65.70217f, 202.7076f, 65.22759f, 198.93784f, 67.26f, 196.32f),
                    PathNode.LineTo(118.37f, 130.61f),
                    PathNode.LineTo(45.77f, 101.61f),
                    PathNode.CurveTo(43.763393f, 100.82478f, 42.331936f, 99.023865f, 42.019756f, 96.89183f),
                    PathNode.CurveTo(41.70758f, 94.7598f, 42.562634f, 92.62408f, 44.259884f, 91.29654f),
                    PathNode.CurveTo(45.957134f, 89.968994f, 48.235916f, 89.6535f, 50.23f, 90.47f),
                    PathNode.LineTo(122.0f, 119.14f),
                    PathNode.LineTo(122.0f, 40.0f),
                    PathNode.CurveTo(122.0f, 36.68629f, 124.686295f, 34.0f, 128.0f, 34.0f),
                    PathNode.CurveTo(131.3137f, 34.0f, 134.0f, 36.68629f, 134.0f, 40.0f),
                    PathNode.LineTo(134.0f, 119.14f),
                    PathNode.LineTo(205.77f, 90.43f),
                    PathNode.CurveTo(207.76408f, 89.6135f, 210.04286f, 89.92899f, 211.74011f, 91.25654f),
                    PathNode.CurveTo(213.43736f, 92.58408f, 214.29242f, 94.719795f, 213.98024f, 96.85183f),
                    PathNode.CurveTo(213.66806f, 98.983864f, 212.2366f, 100.78478f, 210.23f, 101.57f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _asteriskSimple!!
    }

private var _asteriskSimple: ImageVector? = null
