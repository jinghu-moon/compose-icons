package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ShieldCheckered: ImageVector
    get() {
        if (_shieldCheckered != null) return _shieldCheckered!!
        _shieldCheckered = phosphorDuotoneIcon(
            name = "ShieldCheckered",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 48.0f),
                    PathNode.LineTo(128.0f, 128.0f),
                    PathNode.LineTo(40.87f, 128.0f),
                    PathNode.CurveTo(40.28791f, 122.68657f, 39.997475f, 117.34522f, 40.0f, 112.0f),
                    PathNode.LineTo(40.0f, 56.0f),
                    PathNode.CurveTo(40.0f, 51.581722f, 43.581722f, 48.0f, 48.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 128.0f),
                    PathNode.LineTo(128.0f, 232.0f),
                    PathNode.CurveTo(128.0f, 232.0f, 206.06f, 210.7f, 215.13f, 128.0f),
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
                    PathNode.MoveTo(208.0f, 40.0f),
                    PathNode.LineTo(48.0f, 40.0f),
                    PathNode.CurveTo(39.163445f, 40.0f, 32.0f, 47.163445f, 32.0f, 56.0f),
                    PathNode.LineTo(32.0f, 112.0f),
                    PathNode.CurveTo(32.0f, 164.72f, 57.52f, 196.67f, 78.93f, 214.19f),
                    PathNode.CurveTo(101.99f, 233.05f, 124.93f, 239.46f, 125.93f, 239.72f),
                    PathNode.CurveTo(127.305016f, 240.09406f, 128.75499f, 240.09406f, 130.13f, 239.72f),
                    PathNode.CurveTo(131.13f, 239.46f, 154.04f, 233.05f, 177.13f, 214.19f),
                    PathNode.CurveTo(198.48f, 196.67f, 224.0f, 164.72f, 224.0f, 112.0f),
                    PathNode.LineTo(224.0f, 56.0f),
                    PathNode.CurveTo(224.0f, 47.163445f, 216.83656f, 40.0f, 208.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 220.55f),
                    PathNode.CurveTo(108.872314f, 215.76505f, 98.46292f, 209.45816f, 89.07f, 201.81f),
                    PathNode.CurveTo(67.92f, 184.51f, 54.87f, 162.44f, 50.07f, 136.0f),
                    PathNode.LineTo(120.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 120.0f),
                    PathNode.LineTo(48.23f, 120.0f),
                    PathNode.CurveTo(48.08f, 117.37f, 48.0f, 114.71f, 48.0f, 112.0f),
                    PathNode.LineTo(48.0f, 56.0f),
                    PathNode.LineTo(120.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(167.4f, 201.42f),
                    PathNode.CurveTo(157.8811f, 209.23074f, 147.3109f, 215.66374f, 136.0f, 220.53f),
                    PathNode.LineTo(136.0f, 136.0f),
                    PathNode.LineTo(205.91f, 136.0f),
                    PathNode.CurveTo(201.16f, 162.24f, 188.27f, 184.18f, 167.4f, 201.42f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 112.0f),
                    PathNode.CurveTo(208.0f, 114.71f, 207.92f, 117.37f, 207.77f, 120.0f),
                    PathNode.LineTo(136.0f, 120.0f),
                    PathNode.LineTo(136.0f, 56.0f),
                    PathNode.LineTo(208.0f, 56.0f),
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
        return _shieldCheckered!!
    }

private var _shieldCheckered: ImageVector? = null
