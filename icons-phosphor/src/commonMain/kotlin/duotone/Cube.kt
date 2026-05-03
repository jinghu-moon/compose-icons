package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Cube: ImageVector
    get() {
        if (_cube != null) return _cube!!
        _cube = phosphorDuotoneIcon(
            name = "Cube",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 129.09f),
                    PathNode.LineTo(128.0f, 232.0f),
                    PathNode.CurveTo(126.656334f, 231.99445f, 125.33571f, 231.65053f, 124.16f, 231.0f),
                    PathNode.LineTo(36.16f, 182.84f),
                    PathNode.CurveTo(33.600735f, 181.4397f, 32.006622f, 178.7573f, 32.0f, 175.84f),
                    PathNode.LineTo(32.0f, 80.2f),
                    PathNode.CurveTo(32.00037f, 79.07286f, 32.23891f, 77.95852f, 32.7f, 76.93f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(223.68f, 66.15f),
                    PathNode.LineTo(135.68f, 18.0f),
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
                    PathNode.MoveTo(128.0f, 32.0f),
                    PathNode.LineTo(128.0f, 32.0f),
                    PathNode.LineTo(208.34f, 76.0f),
                    PathNode.LineTo(128.0f, 120.0f),
                    PathNode.LineTo(47.66f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 90.0f),
                    PathNode.LineTo(120.0f, 133.78f),
                    PathNode.LineTo(120.0f, 219.57f),
                    PathNode.LineTo(40.0f, 175.82f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 219.57f),
                    PathNode.LineTo(136.0f, 133.82f),
                    PathNode.LineTo(216.0f, 90.0f),
                    PathNode.LineTo(216.0f, 175.78f),
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
        return _cube!!
    }

private var _cube: ImageVector? = null
