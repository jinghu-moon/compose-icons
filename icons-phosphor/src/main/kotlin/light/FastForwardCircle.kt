package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FastForwardCircle: ImageVector
    get() {
        if (_fastForwardCircle != null) return _fastForwardCircle!!
        _fastForwardCircle = phosphorLightIcon(
            name = "FastForwardCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 26.0f),
                    PathNode.CurveTo(71.666954f, 26.0f, 26.0f, 71.666954f, 26.0f, 128.0f),
                    PathNode.CurveTo(26.0f, 184.33304f, 71.666954f, 230.0f, 128.0f, 230.0f),
                    PathNode.CurveTo(184.33304f, 230.0f, 230.0f, 184.33304f, 230.0f, 128.0f),
                    PathNode.CurveTo(229.93387f, 71.69437f, 184.30563f, 26.066126f, 128.0f, 26.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 218.0f),
                    PathNode.CurveTo(78.29437f, 218.0f, 38.0f, 177.70563f, 38.0f, 128.0f),
                    PathNode.CurveTo(38.0f, 78.29437f, 78.29437f, 38.0f, 128.0f, 38.0f),
                    PathNode.CurveTo(177.70563f, 38.0f, 218.0f, 78.29437f, 218.0f, 128.0f),
                    PathNode.CurveTo(217.94489f, 177.68279f, 177.68279f, 217.94489f, 128.0f, 218.0f),
                    PathNode.Close,
                    PathNode.MoveTo(191.6f, 123.2f),
                    PathNode.LineTo(143.6f, 87.2f),
                    PathNode.CurveTo(141.78189f, 85.83642f, 139.34943f, 85.61709f, 137.31671f, 86.63344f),
                    PathNode.CurveTo(135.28401f, 87.64978f, 134.0f, 89.72737f, 134.0f, 92.0f),
                    PathNode.LineTo(134.0f, 122.0f),
                    PathNode.LineTo(87.6f, 87.2f),
                    PathNode.CurveTo(85.78189f, 85.83642f, 83.34943f, 85.61709f, 81.31672f, 86.63344f),
                    PathNode.CurveTo(79.284004f, 87.64978f, 78.0f, 89.72737f, 78.0f, 92.0f),
                    PathNode.LineTo(78.0f, 164.0f),
                    PathNode.CurveTo(78.0f, 166.27263f, 79.284004f, 168.3502f, 81.31672f, 169.36656f),
                    PathNode.CurveTo(83.34943f, 170.38292f, 85.78189f, 170.16357f, 87.6f, 168.8f),
                    PathNode.LineTo(134.0f, 134.0f),
                    PathNode.LineTo(134.0f, 164.0f),
                    PathNode.CurveTo(134.0f, 166.27263f, 135.28401f, 168.3502f, 137.31671f, 169.36656f),
                    PathNode.CurveTo(139.34943f, 170.38292f, 141.78189f, 170.16357f, 143.6f, 168.8f),
                    PathNode.LineTo(191.6f, 132.8f),
                    PathNode.CurveTo(193.11082f, 131.66687f, 194.0f, 129.88855f, 194.0f, 128.0f),
                    PathNode.CurveTo(194.0f, 126.11146f, 193.11082f, 124.33313f, 191.6f, 123.2f),
                    PathNode.Close,
                    PathNode.MoveTo(90.0f, 152.0f),
                    PathNode.LineTo(90.0f, 104.0f),
                    PathNode.LineTo(122.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(146.0f, 152.0f),
                    PathNode.LineTo(146.0f, 104.0f),
                    PathNode.LineTo(178.0f, 128.0f),
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
        return _fastForwardCircle!!
    }

private var _fastForwardCircle: ImageVector? = null
