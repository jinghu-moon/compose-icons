package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SteeringWheel: ImageVector
    get() {
        if (_steeringWheel != null) return _steeringWheel!!
        _steeringWheel = phosphorFillIcon(
            name = "SteeringWheel",
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
                    PathNode.MoveTo(49.63f, 168.0f),
                    PathNode.LineTo(90.45f, 168.0f),
                    PathNode.LineTo(107.45f, 213.58f),
                    PathNode.CurveTo(82.46263f, 207.52357f, 61.35306f, 190.88272f, 49.63f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 156.0f),
                    PathNode.CurveTo(119.163445f, 156.0f, 112.0f, 148.83656f, 112.0f, 140.0f),
                    PathNode.CurveTo(112.0f, 131.16344f, 119.163445f, 124.0f, 128.0f, 124.0f),
                    PathNode.CurveTo(136.83656f, 124.0f, 144.0f, 131.16344f, 144.0f, 140.0f),
                    PathNode.CurveTo(144.0f, 148.83656f, 136.83656f, 156.0f, 128.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(148.46f, 213.59f),
                    PathNode.LineTo(165.55f, 168.0f),
                    PathNode.LineTo(206.37f, 168.0f),
                    PathNode.CurveTo(194.63062f, 190.90787f, 173.48349f, 207.55608f, 148.46f, 213.59f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 96.0f),
                    PathNode.CurveTo(95.76786f, 96.03907f, 64.59124f, 107.492935f, 40.0f, 128.33f),
                    PathNode.LineTo(40.0f, 128.0f),
                    PathNode.CurveTo(40.0f, 79.39894f, 79.39894f, 40.0f, 128.0f, 40.0f),
                    PathNode.CurveTo(176.60106f, 40.0f, 216.0f, 79.39894f, 216.0f, 128.0f),
                    PathNode.LineTo(216.0f, 128.33f),
                    PathNode.CurveTo(191.40875f, 107.492935f, 160.23215f, 96.03907f, 128.0f, 96.0f),
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
        return _steeringWheel!!
    }

private var _steeringWheel: ImageVector? = null
