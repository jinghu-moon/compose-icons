package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Hexagon: ImageVector
    get() {
        if (_hexagon != null) return _hexagon!!
        _hexagon = phosphorDuotoneIcon(
            name = "Hexagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 80.18f),
                    PathNode.LineTo(224.0f, 175.82f),
                    PathNode.CurveTo(223.99338f, 178.7373f, 222.39926f, 181.41971f, 219.84f, 182.82f),
                    PathNode.LineTo(131.84f, 231.0f),
                    PathNode.CurveTo(129.44737f, 232.30914f, 126.552635f, 232.30914f, 124.16f, 231.0f),
                    PathNode.LineTo(36.16f, 182.82f),
                    PathNode.CurveTo(33.600735f, 181.41971f, 32.006622f, 178.7373f, 32.0f, 175.82f),
                    PathNode.LineTo(32.0f, 80.18f),
                    PathNode.CurveTo(32.006622f, 77.2627f, 33.600735f, 74.5803f, 36.16f, 73.18f),
                    PathNode.LineTo(124.16f, 25.0f),
                    PathNode.CurveTo(126.552635f, 23.690865f, 129.44737f, 23.690865f, 131.84f, 25.0f),
                    PathNode.LineTo(219.84f, 73.18f),
                    PathNode.CurveTo(222.39926f, 74.5803f, 223.99338f, 77.2627f, 224.0f, 80.18f),
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
                    PathNode.MoveTo(223.68f, 66.15f),
                    PathNode.LineTo(135.68f, 18.0f),
                    PathNode.CurveTo(130.90053f, 15.359137f, 125.099464f, 15.359137f, 120.32f, 18.0f),
                    PathNode.LineTo(32.32f, 66.17f),
                    PathNode.CurveTo(27.201473f, 68.9706f, 24.013245f, 74.3354f, 24.0f, 80.17f),
                    PathNode.LineTo(24.0f, 175.81f),
                    PathNode.CurveTo(24.013245f, 181.64459f, 27.201473f, 187.0094f, 32.32f, 189.81f),
                    PathNode.LineTo(120.32f, 237.98f),
                    PathNode.CurveTo(125.099464f, 240.62086f, 130.90053f, 240.62086f, 135.68f, 237.98f),
                    PathNode.LineTo(223.68f, 189.81f),
                    PathNode.CurveTo(228.79852f, 187.0094f, 231.98676f, 181.64459f, 232.0f, 175.81f),
                    PathNode.LineTo(232.0f, 80.18f),
                    PathNode.CurveTo(231.9977f, 74.33465f, 228.80794f, 68.955765f, 223.68f, 66.15f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 175.82f),
                    PathNode.LineTo(128.0f, 224.0f),
                    PathNode.LineTo(40.0f, 175.82f),
                    PathNode.LineTo(40.0f, 80.18f),
                    PathNode.LineTo(128.0f, 32.0f),
                    PathNode.LineTo(128.0f, 32.0f),
                    PathNode.LineTo(216.0f, 80.17f),
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
        return _hexagon!!
    }

private var _hexagon: ImageVector? = null
