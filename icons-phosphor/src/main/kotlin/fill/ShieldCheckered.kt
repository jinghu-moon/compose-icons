package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ShieldCheckered: ImageVector
    get() {
        if (_shieldCheckered != null) return _shieldCheckered!!
        _shieldCheckered = phosphorFillIcon(
            name = "ShieldCheckered",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
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
                    PathNode.MoveTo(128.0f, 223.62f),
                    PathNode.CurveTo(113.85208f, 218.67969f, 100.67948f, 211.29802f, 89.08f, 201.81f),
                    PathNode.CurveTo(65.83f, 182.79f, 52.37f, 158.0f, 48.9f, 128.0f),
                    PathNode.LineTo(128.0f, 128.0f),
                    PathNode.LineTo(128.0f, 56.0f),
                    PathNode.LineTo(208.0f, 56.0f),
                    PathNode.LineTo(208.0f, 112.0f),
                    PathNode.CurveTo(208.00305f, 117.34607f, 207.70256f, 122.68799f, 207.1f, 128.0f),
                    PathNode.LineTo(128.0f, 128.0f),
                    PathNode.LineTo(128.0f, 223.62f),
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
        return _shieldCheckered!!
    }

private var _shieldCheckered: ImageVector? = null
