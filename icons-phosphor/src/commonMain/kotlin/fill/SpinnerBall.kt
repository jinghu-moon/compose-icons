package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SpinnerBall: ImageVector
    get() {
        if (_spinnerBall != null) return _spinnerBall!!
        _spinnerBall = phosphorFillIcon(
            name = "SpinnerBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(167.11f, 49.19f),
                    PathNode.CurveTo(170.24f, 83.71f, 155.0f, 99.44f, 135.0f, 113.61f),
                    PathNode.CurveTo(132.75f, 89.13f, 126.56f, 63.81f, 96.63f, 45.79f),
                    PathNode.CurveTo(119.572784f, 37.022964f, 145.13734f, 38.255867f, 167.13f, 49.19f),
                    PathNode.Close,
                    PathNode.MoveTo(40.18f, 133.54f),
                    PathNode.CurveTo(68.52f, 113.54f, 89.75f, 118.86f, 112.05f, 129.15f),
                    PathNode.CurveTo(92.0f, 143.34f, 73.19f, 161.36f, 72.52f, 196.26f),
                    PathNode.CurveTo(53.454742f, 180.78653f, 41.728832f, 158.04538f, 40.18f, 133.54f),
                    PathNode.Close,
                    PathNode.MoveTo(176.68f, 201.27f),
                    PathNode.CurveTo(145.23f, 186.72f, 139.21f, 165.69f, 136.97f, 141.27f),
                    PathNode.CurveTo(149.69f, 147.13f, 163.28f, 152.02f, 178.27f, 152.02f),
                    PathNode.CurveTo(189.6f, 152.02f, 201.73f, 149.22f, 214.9f, 141.94f),
                    PathNode.CurveTo(210.97238f, 166.174f, 197.12195f, 187.67442f, 176.68f, 201.27f),
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
        return _spinnerBall!!
    }

private var _spinnerBall: ImageVector? = null
