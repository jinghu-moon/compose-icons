package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Ruler: ImageVector
    get() {
        if (_ruler != null) return _ruler!!
        _ruler = phosphorLightIcon(
            name = "Ruler",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(233.91f, 74.79f),
                    PathNode.LineTo(181.22f, 22.1f),
                    PathNode.CurveTo(178.59445f, 19.474182f, 175.03328f, 17.99899f, 171.32f, 17.99899f),
                    PathNode.CurveTo(167.60672f, 17.99899f, 164.04555f, 19.474182f, 161.42f, 22.1f),
                    PathNode.LineTo(22.09f, 161.41f),
                    PathNode.CurveTo(19.464182f, 164.03555f, 17.98899f, 167.59673f, 17.98899f, 171.31f),
                    PathNode.CurveTo(17.98899f, 175.02328f, 19.464182f, 178.58444f, 22.09f, 181.21f),
                    PathNode.LineTo(74.78f, 233.9f),
                    PathNode.CurveTo(77.405556f, 236.52582f, 80.96672f, 238.001f, 84.68f, 238.001f),
                    PathNode.CurveTo(88.39328f, 238.001f, 91.95445f, 236.52582f, 94.58f, 233.9f),
                    PathNode.LineTo(233.91f, 94.59f),
                    PathNode.CurveTo(236.53581f, 91.96445f, 238.01102f, 88.40328f, 238.01102f, 84.69f),
                    PathNode.CurveTo(238.01102f, 80.97672f, 236.53581f, 77.41555f, 233.91f, 74.79f),
                    PathNode.Close,
                    PathNode.MoveTo(225.42f, 86.1f),
                    PathNode.LineTo(86.1f, 225.41f),
                    PathNode.LineTo(86.1f, 225.41f),
                    PathNode.CurveTo(85.72486f, 225.78555f, 85.21582f, 225.99657f, 84.685f, 225.99657f),
                    PathNode.CurveTo(84.15418f, 225.99657f, 83.645134f, 225.78555f, 83.27f, 225.41f),
                    PathNode.LineTo(30.58f, 172.73f),
                    PathNode.CurveTo(30.204447f, 172.35486f, 29.993427f, 171.84583f, 29.993427f, 171.315f),
                    PathNode.CurveTo(29.993427f, 170.78418f, 30.204447f, 170.27513f, 30.58f, 169.9f),
                    PathNode.LineTo(64.0f, 136.48f),
                    PathNode.LineTo(91.76f, 164.24f),
                    PathNode.CurveTo(93.25577f, 165.84523f, 95.508446f, 166.506f, 97.6343f, 165.96309f),
                    PathNode.CurveTo(99.76018f, 165.42018f, 101.42017f, 163.76018f, 101.96308f, 161.63431f),
                    PathNode.CurveTo(102.506f, 159.50844f, 101.84522f, 157.25575f, 100.24f, 155.76f),
                    PathNode.LineTo(72.48f, 128.0f),
                    PathNode.LineTo(96.0f, 104.48f),
                    PathNode.LineTo(123.76f, 132.24f),
                    PathNode.CurveTo(126.12408f, 134.44287f, 129.80807f, 134.37787f, 132.09297f, 132.09297f),
                    PathNode.CurveTo(134.37787f, 129.80807f, 134.44287f, 126.12408f, 132.24f, 123.76f),
                    PathNode.LineTo(104.48f, 96.0f),
                    PathNode.LineTo(128.0f, 72.49f),
                    PathNode.LineTo(155.76f, 100.24f),
                    PathNode.CurveTo(158.12408f, 102.44287f, 161.80807f, 102.37787f, 164.09297f, 100.09297f),
                    PathNode.CurveTo(166.37787f, 97.808075f, 166.44287f, 94.12408f, 164.24f, 91.76f),
                    PathNode.LineTo(136.49f, 64.0f),
                    PathNode.LineTo(169.9f, 30.59f),
                    PathNode.CurveTo(170.27513f, 30.214445f, 170.78418f, 30.003428f, 171.315f, 30.003428f),
                    PathNode.CurveTo(171.84583f, 30.003428f, 172.35486f, 30.214445f, 172.73f, 30.59f),
                    PathNode.LineTo(225.42f, 83.27f),
                    PathNode.CurveTo(225.79555f, 83.645134f, 226.00658f, 84.15418f, 226.00658f, 84.685f),
                    PathNode.CurveTo(226.00658f, 85.21582f, 225.79555f, 85.72486f, 225.42f, 86.1f),
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
        return _ruler!!
    }

private var _ruler: ImageVector? = null
