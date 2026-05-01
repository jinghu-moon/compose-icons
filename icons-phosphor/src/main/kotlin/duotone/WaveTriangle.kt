package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.WaveTriangle: ImageVector
    get() {
        if (_waveTriangle != null) return _waveTriangle!!
        _waveTriangle = phosphorDuotoneIcon(
            name = "WaveTriangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(76.0f, 56.0f),
                    PathNode.LineTo(128.0f, 128.0f),
                    PathNode.LineTo(24.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 128.0f),
                    PathNode.LineTo(128.0f, 128.0f),
                    PathNode.LineTo(180.0f, 200.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(238.48f, 132.68f),
                    PathNode.LineTo(186.48f, 204.68f),
                    PathNode.CurveTo(184.97734f, 206.77432f, 182.55763f, 208.0163f, 179.98f, 208.0163f),
                    PathNode.CurveTo(177.40237f, 208.0163f, 174.98265f, 206.77432f, 173.48f, 204.68f),
                    PathNode.LineTo(76.0f, 69.66f),
                    PathNode.LineTo(30.49f, 132.66f),
                    PathNode.CurveTo(27.905308f, 136.24985f, 22.89985f, 137.0647f, 19.31f, 134.48f),
                    PathNode.CurveTo(15.720149f, 131.89531f, 14.905308f, 126.889854f, 17.49f, 123.3f),
                    PathNode.LineTo(69.49f, 51.3f),
                    PathNode.CurveTo(70.99266f, 49.205677f, 73.41238f, 47.963688f, 75.99f, 47.963688f),
                    PathNode.CurveTo(78.56763f, 47.963688f, 80.98734f, 49.205677f, 82.49f, 51.3f),
                    PathNode.LineTo(180.0f, 186.3f),
                    PathNode.LineTo(225.51f, 123.3f),
                    PathNode.CurveTo(228.09471f, 119.71015f, 233.10014f, 118.89531f, 236.69f, 121.48f),
                    PathNode.CurveTo(240.27985f, 124.06469f, 241.09471f, 129.07014f, 238.51f, 132.66f),
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
        return _waveTriangle!!
    }

private var _waveTriangle: ImageVector? = null
