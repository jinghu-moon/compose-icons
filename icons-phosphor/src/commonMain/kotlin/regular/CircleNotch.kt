package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CircleNotch: ImageVector
    get() {
        if (_circleNotch != null) return _circleNotch!!
        _circleNotch = phosphorRegularIcon(
            name = "CircleNotch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 128.0f),
                    PathNode.CurveTo(232.0f, 185.4376f, 185.4376f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(70.562386f, 232.0f, 24.0f, 185.4376f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 87.0f, 47.81f, 49.64f, 84.66f, 32.73f),
                    PathNode.CurveTo(88.67511f, 30.885368f, 93.42537f, 32.64489f, 95.27f, 36.66f),
                    PathNode.CurveTo(97.11463f, 40.67511f, 95.35511f, 45.42537f, 91.34f, 47.27f),
                    PathNode.CurveTo(60.15f, 61.59f, 40.0f, 93.27f, 40.0f, 128.0f),
                    PathNode.CurveTo(40.0f, 176.60106f, 79.39894f, 216.0f, 128.0f, 216.0f),
                    PathNode.CurveTo(176.60106f, 216.0f, 216.0f, 176.60106f, 216.0f, 128.0f),
                    PathNode.CurveTo(216.0f, 93.27f, 195.85f, 61.59f, 164.66f, 47.27f),
                    PathNode.CurveTo(160.6449f, 45.42537f, 158.88538f, 40.67511f, 160.73f, 36.66f),
                    PathNode.CurveTo(162.57463f, 32.64489f, 167.32489f, 30.885368f, 171.34f, 32.73f),
                    PathNode.CurveTo(208.19f, 49.64f, 232.0f, 87.0f, 232.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _circleNotch!!
    }

private var _circleNotch: ImageVector? = null
