package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CircleNotch: ImageVector
    get() {
        if (_circleNotch != null) return _circleNotch!!
        _circleNotch = phosphorLightIcon(
            name = "CircleNotch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(230.0f, 128.0f),
                    PathNode.CurveTo(230.0f, 184.33304f, 184.33304f, 230.0f, 128.0f, 230.0f),
                    PathNode.CurveTo(71.666954f, 230.0f, 26.0f, 184.33304f, 26.0f, 128.0f),
                    PathNode.CurveTo(26.0f, 87.82f, 49.35f, 51.14f, 85.5f, 34.55f),
                    PathNode.CurveTo(88.48181f, 33.311234f, 91.90924f, 34.65437f, 93.2555f, 37.58922f),
                    PathNode.CurveTo(94.60176f, 40.524067f, 93.38401f, 43.99802f, 90.5f, 45.45f),
                    PathNode.CurveTo(58.61f, 60.09f, 38.0f, 92.49f, 38.0f, 128.0f),
                    PathNode.CurveTo(38.0f, 177.70563f, 78.29437f, 218.0f, 128.0f, 218.0f),
                    PathNode.CurveTo(177.70563f, 218.0f, 218.0f, 177.70563f, 218.0f, 128.0f),
                    PathNode.CurveTo(218.0f, 92.49f, 197.39f, 60.09f, 165.5f, 45.45f),
                    PathNode.CurveTo(162.616f, 43.99802f, 161.39824f, 40.524067f, 162.74449f, 37.58922f),
                    PathNode.CurveTo(164.09076f, 34.65437f, 167.51819f, 33.311234f, 170.5f, 34.55f),
                    PathNode.CurveTo(206.65f, 51.14f, 230.0f, 87.82f, 230.0f, 128.0f),
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
        return _circleNotch!!
    }

private var _circleNotch: ImageVector? = null
