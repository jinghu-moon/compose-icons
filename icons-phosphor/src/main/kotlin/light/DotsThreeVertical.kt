package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DotsThreeVertical: ImageVector
    get() {
        if (_dotsThreeVertical != null) return _dotsThreeVertical!!
        _dotsThreeVertical = phosphorLightIcon(
            name = "DotsThreeVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(118.0f, 60.0f),
                    PathNode.CurveTo(118.0f, 54.477154f, 122.47715f, 50.0f, 128.0f, 50.0f),
                    PathNode.CurveTo(133.52284f, 50.0f, 138.0f, 54.477154f, 138.0f, 60.0f),
                    PathNode.CurveTo(138.0f, 65.52285f, 133.52284f, 70.0f, 128.0f, 70.0f),
                    PathNode.CurveTo(122.47715f, 70.0f, 118.0f, 65.52285f, 118.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 118.0f),
                    PathNode.CurveTo(122.47715f, 118.0f, 118.0f, 122.47715f, 118.0f, 128.0f),
                    PathNode.CurveTo(118.0f, 133.52284f, 122.47715f, 138.0f, 128.0f, 138.0f),
                    PathNode.CurveTo(133.52284f, 138.0f, 138.0f, 133.52284f, 138.0f, 128.0f),
                    PathNode.CurveTo(138.0f, 122.47715f, 133.52284f, 118.0f, 128.0f, 118.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 186.0f),
                    PathNode.CurveTo(122.47715f, 186.0f, 118.0f, 190.47716f, 118.0f, 196.0f),
                    PathNode.CurveTo(118.0f, 201.52284f, 122.47715f, 206.0f, 128.0f, 206.0f),
                    PathNode.CurveTo(133.52284f, 206.0f, 138.0f, 201.52284f, 138.0f, 196.0f),
                    PathNode.CurveTo(138.0f, 190.47716f, 133.52284f, 186.0f, 128.0f, 186.0f),
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
        return _dotsThreeVertical!!
    }

private var _dotsThreeVertical: ImageVector? = null
