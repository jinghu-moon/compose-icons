package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.GreaterThanOrEqual: ImageVector
    get() {
        if (_greaterThanOrEqual != null) return _greaterThanOrEqual!!
        _greaterThanOrEqual = phosphorRegularIcon(
            name = "GreaterThanOrEqual",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(53.24f, 152.49f),
                    PathNode.LineTo(184.86f, 104.0f),
                    PathNode.LineTo(53.24f, 55.51f),
                    PathNode.CurveTo(50.446995f, 54.606895f, 48.372894f, 52.246716f, 47.836163f, 49.36082f),
                    PathNode.CurveTo(47.299435f, 46.474922f, 48.386288f, 43.526855f, 50.66784f, 41.67997f),
                    PathNode.CurveTo(52.949387f, 39.83308f, 56.059162f, 39.38402f, 58.77f, 40.51f),
                    PathNode.LineTo(210.77f, 96.51f),
                    PathNode.CurveTo(213.90553f, 97.67386f, 215.98611f, 100.665436f, 215.98611f, 104.01f),
                    PathNode.CurveTo(215.98611f, 107.35456f, 213.90553f, 110.34614f, 210.77f, 111.51f),
                    PathNode.LineTo(58.77f, 167.51f),
                    PathNode.CurveTo(57.882153f, 167.83304f, 56.94479f, 167.99886f, 56.0f, 168.0f),
                    PathNode.CurveTo(52.12119f, 168.00156f, 48.80008f, 165.2204f, 48.12052f, 161.40158f),
                    PathNode.CurveTo(47.440968f, 157.58276f, 49.598766f, 153.82663f, 53.24f, 152.49f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 192.0f),
                    PathNode.LineTo(56.0f, 192.0f),
                    PathNode.CurveTo(51.581722f, 192.0f, 48.0f, 195.58173f, 48.0f, 200.0f),
                    PathNode.CurveTo(48.0f, 204.41827f, 51.581722f, 208.0f, 56.0f, 208.0f),
                    PathNode.LineTo(208.0f, 208.0f),
                    PathNode.CurveTo(212.41827f, 208.0f, 216.0f, 204.41827f, 216.0f, 200.0f),
                    PathNode.CurveTo(216.0f, 195.58173f, 212.41827f, 192.0f, 208.0f, 192.0f),
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
        return _greaterThanOrEqual!!
    }

private var _greaterThanOrEqual: ImageVector? = null
