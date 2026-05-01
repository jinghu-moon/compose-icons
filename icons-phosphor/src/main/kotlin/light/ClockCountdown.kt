package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ClockCountdown: ImageVector
    get() {
        if (_clockCountdown != null) return _clockCountdown!!
        _clockCountdown = phosphorLightIcon(
            name = "ClockCountdown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(230.0f, 136.49f),
                    PathNode.CurveTo(225.36427f, 190.42413f, 179.44778f, 231.37009f, 125.336914f, 229.82315f),
                    PathNode.CurveTo(71.22603f, 228.27623f, 27.72377f, 184.77397f, 26.176842f, 130.66309f),
                    PathNode.CurveTo(24.629915f, 76.5522f, 65.57587f, 30.635727f, 119.51f, 26.0f),
                    PathNode.CurveTo(122.82371f, 25.723858f, 125.73386f, 28.18629f, 126.01f, 31.5f),
                    PathNode.CurveTo(126.28614f, 34.81371f, 123.82371f, 37.723858f, 120.51f, 38.0f),
                    PathNode.CurveTo(72.902176f, 42.07696f, 36.749435f, 82.59856f, 38.106625f, 130.36136f),
                    PathNode.CurveTo(39.463818f, 178.12415f, 77.85923f, 216.52744f, 125.62175f, 217.89442f),
                    PathNode.CurveTo(173.38426f, 219.26141f, 213.91327f, 183.11699f, 218.0f, 135.51f),
                    PathNode.CurveTo(218.27614f, 132.19629f, 221.1863f, 129.73386f, 224.5f, 130.01f),
                    PathNode.CurveTo(227.8137f, 130.28615f, 230.27614f, 133.19629f, 230.0f, 136.51f),
                    PathNode.Close,
                    PathNode.MoveTo(122.0f, 72.0f),
                    PathNode.LineTo(122.0f, 128.0f),
                    PathNode.CurveTo(122.0f, 131.3137f, 124.686295f, 134.0f, 128.0f, 134.0f),
                    PathNode.LineTo(184.0f, 134.0f),
                    PathNode.CurveTo(187.3137f, 134.0f, 190.0f, 131.3137f, 190.0f, 128.0f),
                    PathNode.CurveTo(190.0f, 124.686295f, 187.3137f, 122.0f, 184.0f, 122.0f),
                    PathNode.LineTo(134.0f, 122.0f),
                    PathNode.LineTo(134.0f, 72.0f),
                    PathNode.CurveTo(134.0f, 68.686295f, 131.3137f, 66.0f, 128.0f, 66.0f),
                    PathNode.CurveTo(124.686295f, 66.0f, 122.0f, 68.686295f, 122.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 46.0f),
                    PathNode.CurveTo(165.52284f, 46.0f, 170.0f, 41.522846f, 170.0f, 36.0f),
                    PathNode.CurveTo(170.0f, 30.477152f, 165.52284f, 26.0f, 160.0f, 26.0f),
                    PathNode.CurveTo(154.47716f, 26.0f, 150.0f, 30.477152f, 150.0f, 36.0f),
                    PathNode.CurveTo(150.0f, 41.522846f, 154.47716f, 46.0f, 160.0f, 46.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 70.0f),
                    PathNode.CurveTo(201.52284f, 70.0f, 206.0f, 65.52285f, 206.0f, 60.0f),
                    PathNode.CurveTo(206.0f, 54.477154f, 201.52284f, 50.0f, 196.0f, 50.0f),
                    PathNode.CurveTo(190.47716f, 50.0f, 186.0f, 54.477154f, 186.0f, 60.0f),
                    PathNode.CurveTo(186.0f, 65.52285f, 190.47716f, 70.0f, 196.0f, 70.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 106.0f),
                    PathNode.CurveTo(225.52284f, 106.0f, 230.0f, 101.52285f, 230.0f, 96.0f),
                    PathNode.CurveTo(230.0f, 90.47715f, 225.52284f, 86.0f, 220.0f, 86.0f),
                    PathNode.CurveTo(214.47716f, 86.0f, 210.0f, 90.47715f, 210.0f, 96.0f),
                    PathNode.CurveTo(210.0f, 101.52285f, 214.47716f, 106.0f, 220.0f, 106.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _clockCountdown!!
    }

private var _clockCountdown: ImageVector? = null
