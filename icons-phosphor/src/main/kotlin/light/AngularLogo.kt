package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AngularLogo: ImageVector
    get() {
        if (_angularLogo != null) return _angularLogo!!
        _angularLogo = phosphorLightIcon(
            name = "AngularLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(226.31f, 66.46f),
                    PathNode.LineTo(130.31f, 26.46f),
                    PathNode.CurveTo(128.83041f, 25.84994f, 127.16958f, 25.84994f, 125.69f, 26.46f),
                    PathNode.LineTo(29.69f, 66.46f),
                    PathNode.CurveTo(27.184614f, 67.503845f, 25.691965f, 70.09958f, 26.05f, 72.79f),
                    PathNode.LineTo(42.05f, 192.79f),
                    PathNode.CurveTo(42.31206f, 194.76486f, 43.537247f, 196.48087f, 45.32f, 197.37f),
                    PathNode.LineTo(125.32f, 237.37f),
                    PathNode.CurveTo(127.00737f, 238.2124f, 128.99263f, 238.2124f, 130.68f, 237.37f),
                    PathNode.LineTo(210.68f, 197.37f),
                    PathNode.CurveTo(212.46275f, 196.48087f, 213.68794f, 194.76486f, 213.95f, 192.79f),
                    PathNode.LineTo(229.95f, 72.79f),
                    PathNode.CurveTo(230.30803f, 70.09958f, 228.81537f, 67.503845f, 226.31f, 66.46f),
                    PathNode.Close,
                    PathNode.MoveTo(202.47f, 188.06f),
                    PathNode.LineTo(128.0f, 225.29f),
                    PathNode.LineTo(53.53f, 188.06f),
                    PathNode.LineTo(38.53f, 75.77f),
                    PathNode.LineTo(128.0f, 38.5f),
                    PathNode.LineTo(217.44f, 75.77f),
                    PathNode.Close,
                    PathNode.MoveTo(122.75f, 85.06f),
                    PathNode.LineTo(82.75f, 157.06f),
                    PathNode.CurveTo(81.14285f, 159.95949f, 82.190506f, 163.61285f, 85.09f, 165.22f),
                    PathNode.CurveTo(87.989494f, 166.82715f, 91.64285f, 165.7795f, 93.25f, 162.88f),
                    PathNode.LineTo(104.86f, 142.0f),
                    PathNode.LineTo(151.14f, 142.0f),
                    PathNode.LineTo(162.75f, 162.91f),
                    PathNode.CurveTo(163.80809f, 164.81787f, 165.81837f, 166.00105f, 168.0f, 166.0f),
                    PathNode.CurveTo(169.0161f, 166.0015f, 170.01524f, 165.73964f, 170.9f, 165.24f),
                    PathNode.CurveTo(173.79475f, 163.63403f, 174.84187f, 159.98701f, 173.24f, 157.09f),
                    PathNode.LineTo(133.24f, 85.09f),
                    PathNode.CurveTo(132.18329f, 83.18011f, 130.17273f, 81.994736f, 127.99f, 81.994736f),
                    PathNode.CurveTo(125.80727f, 81.994736f, 123.796715f, 83.18011f, 122.74f, 85.09f),
                    PathNode.Close,
                    PathNode.MoveTo(144.47f, 130.0f),
                    PathNode.LineTo(111.53f, 130.0f),
                    PathNode.LineTo(128.0f, 100.35f),
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
        return _angularLogo!!
    }

private var _angularLogo: ImageVector? = null
