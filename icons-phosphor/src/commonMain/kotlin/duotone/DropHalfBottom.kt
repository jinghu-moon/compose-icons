package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.DropHalfBottom: ImageVector
    get() {
        if (_dropHalfBottom != null) return _dropHalfBottom!!
        _dropHalfBottom = phosphorDuotoneIcon(
            name = "DropHalfBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 144.0f),
                    PathNode.CurveTo(208.0f, 188.18279f, 172.18279f, 224.0f, 128.0f, 224.0f),
                    PathNode.CurveTo(83.81722f, 224.0f, 48.0f, 188.18279f, 48.0f, 144.0f),
                    PathNode.CurveTo(48.007294f, 138.6406f, 48.442005f, 133.2903f, 49.3f, 128.0f),
                    PathNode.LineTo(206.7f, 128.0f),
                    PathNode.CurveTo(207.558f, 133.2903f, 207.9927f, 138.6406f, 208.0f, 144.0f),
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
                    PathNode.MoveTo(174.0f, 47.75f),
                    PathNode.CurveTo(161.6478f, 33.484356f, 147.74547f, 20.638535f, 132.55f, 9.45f),
                    PathNode.CurveTo(129.79443f, 7.519659f, 126.12557f, 7.519659f, 123.37f, 9.45f),
                    PathNode.CurveTo(108.202515f, 20.643194f, 94.327194f, 33.48885f, 82.0f, 47.75f),
                    PathNode.CurveTo(54.51f, 79.32f, 40.0f, 112.6f, 40.0f, 144.0f),
                    PathNode.CurveTo(40.0f, 192.60106f, 79.39894f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(176.60106f, 232.0f, 216.0f, 192.60106f, 216.0f, 144.0f),
                    PathNode.CurveTo(216.0f, 112.6f, 201.49f, 79.32f, 174.0f, 47.75f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 26.0f),
                    PathNode.CurveTo(142.16f, 37.1f, 184.86f, 73.74f, 196.84f, 120.0f),
                    PathNode.LineTo(59.16f, 120.0f),
                    PathNode.CurveTo(71.14f, 73.76f, 113.84f, 37.12f, 128.0f, 26.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 216.0f),
                    PathNode.CurveTo(88.25378f, 215.95592f, 56.04409f, 183.74623f, 56.0f, 144.0f),
                    PathNode.QuadTo(56.0f, 140.0f, 56.36f, 136.0f),
                    PathNode.LineTo(199.64f, 136.0f),
                    PathNode.QuadTo(200.0f, 140.0f, 200.0f, 144.0f),
                    PathNode.CurveTo(199.95592f, 183.74623f, 167.74623f, 215.95592f, 128.0f, 216.0f),
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
        return _dropHalfBottom!!
    }

private var _dropHalfBottom: ImageVector? = null
