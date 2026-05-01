package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.At: ImageVector
    get() {
        if (_at != null) return _at!!
        _at = phosphorLightIcon(
            name = "At",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 26.0f),
                    PathNode.CurveTo(71.666954f, 26.0f, 26.0f, 71.666954f, 26.0f, 128.0f),
                    PathNode.CurveTo(26.0f, 184.33304f, 71.666954f, 230.0f, 128.0f, 230.0f),
                    PathNode.CurveTo(149.13f, 230.0f, 171.31f, 223.65f, 187.32f, 213.0f),
                    PathNode.CurveTo(190.08142f, 211.16365f, 190.83134f, 207.43642f, 188.995f, 204.675f),
                    PathNode.CurveTo(187.15865f, 201.91357f, 183.43143f, 201.16365f, 180.67f, 203.0f),
                    PathNode.CurveTo(166.77f, 212.25f, 146.58f, 218.0f, 128.0f, 218.0f),
                    PathNode.CurveTo(78.29437f, 218.0f, 38.0f, 177.70563f, 38.0f, 128.0f),
                    PathNode.CurveTo(38.0f, 78.29437f, 78.29437f, 38.0f, 128.0f, 38.0f),
                    PathNode.CurveTo(177.70563f, 38.0f, 218.0f, 78.29437f, 218.0f, 128.0f),
                    PathNode.CurveTo(218.0f, 157.58f, 204.22f, 162.0f, 196.0f, 162.0f),
                    PathNode.CurveTo(187.78f, 162.0f, 174.0f, 157.58f, 174.0f, 128.0f),
                    PathNode.LineTo(174.0f, 88.0f),
                    PathNode.CurveTo(174.0f, 84.686295f, 171.3137f, 82.0f, 168.0f, 82.0f),
                    PathNode.CurveTo(164.6863f, 82.0f, 162.0f, 84.686295f, 162.0f, 88.0f),
                    PathNode.LineTo(162.0f, 97.0f),
                    PathNode.CurveTo(148.77852f, 82.46213f, 127.78212f, 77.92843f, 109.74004f, 85.71565f),
                    PathNode.CurveTo(91.69797f, 93.50287f, 80.59501f, 111.89112f, 82.10482f, 131.48392f),
                    PathNode.CurveTo(83.61464f, 151.0767f, 97.40377f, 167.54678f, 116.42591f, 172.47784f),
                    PathNode.CurveTo(135.44804f, 177.4089f, 155.50197f, 169.71188f, 166.34f, 153.32f),
                    PathNode.CurveTo(171.76f, 166.6f, 182.0f, 174.0f, 196.0f, 174.0f),
                    PathNode.CurveTo(217.29f, 174.0f, 230.0f, 156.8f, 230.0f, 128.0f),
                    PathNode.CurveTo(229.93387f, 71.69437f, 184.30563f, 26.066126f, 128.0f, 26.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 162.0f),
                    PathNode.CurveTo(109.22232f, 162.0f, 94.0f, 146.77768f, 94.0f, 128.0f),
                    PathNode.CurveTo(94.0f, 109.22232f, 109.22232f, 94.0f, 128.0f, 94.0f),
                    PathNode.CurveTo(146.77768f, 94.0f, 162.0f, 109.22232f, 162.0f, 128.0f),
                    PathNode.CurveTo(162.0f, 146.77768f, 146.77768f, 162.0f, 128.0f, 162.0f),
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
        return _at!!
    }

private var _at: ImageVector? = null
