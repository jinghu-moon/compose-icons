package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Peace: ImageVector
    get() {
        if (_peace != null) return _peace!!
        _peace = phosphorRegularIcon(
            name = "Peace",
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
                    PathNode.MoveTo(216.0f, 128.0f),
                    PathNode.CurveTo(216.01735f, 143.33511f, 212.0032f, 158.40536f, 204.36f, 171.7f),
                    PathNode.LineTo(136.0f, 123.84f),
                    PathNode.LineTo(136.0f, 40.37f),
                    PathNode.CurveTo(181.28595f, 44.556038f, 215.9453f, 82.52103f, 216.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 40.37f),
                    PathNode.LineTo(120.0f, 123.84f),
                    PathNode.LineTo(51.64f, 171.7f),
                    PathNode.CurveTo(36.770176f, 145.70657f, 36.13953f, 113.93536f, 49.96615f, 87.37232f),
                    PathNode.CurveTo(63.79276f, 60.809288f, 90.17865f, 43.10074f, 120.0f, 40.37f),
                    PathNode.Close,
                    PathNode.MoveTo(60.84f, 184.79f),
                    PathNode.LineTo(120.0f, 143.37f),
                    PathNode.LineTo(120.0f, 215.63f),
                    PathNode.CurveTo(96.991875f, 213.52924f, 75.73746f, 202.44936f, 60.84f, 184.79f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 215.63f),
                    PathNode.LineTo(136.0f, 143.37f),
                    PathNode.LineTo(195.16f, 184.79f),
                    PathNode.CurveTo(180.26254f, 202.44936f, 159.00812f, 213.52924f, 136.0f, 215.63f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _peace!!
    }

private var _peace: ImageVector? = null
