package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DotsThree: ImageVector
    get() {
        if (_dotsThree != null) return _dotsThree!!
        _dotsThree = phosphorLightIcon(
            name = "DotsThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(138.0f, 128.0f),
                    PathNode.CurveTo(138.0f, 133.52284f, 133.52284f, 138.0f, 128.0f, 138.0f),
                    PathNode.CurveTo(122.47715f, 138.0f, 118.0f, 133.52284f, 118.0f, 128.0f),
                    PathNode.CurveTo(118.0f, 122.47715f, 122.47715f, 118.0f, 128.0f, 118.0f),
                    PathNode.CurveTo(133.52284f, 118.0f, 138.0f, 122.47715f, 138.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 118.0f),
                    PathNode.CurveTo(54.477154f, 118.0f, 50.0f, 122.47715f, 50.0f, 128.0f),
                    PathNode.CurveTo(50.0f, 133.52284f, 54.477154f, 138.0f, 60.0f, 138.0f),
                    PathNode.CurveTo(65.52285f, 138.0f, 70.0f, 133.52284f, 70.0f, 128.0f),
                    PathNode.CurveTo(70.0f, 122.47715f, 65.52285f, 118.0f, 60.0f, 118.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 118.0f),
                    PathNode.CurveTo(190.47716f, 118.0f, 186.0f, 122.47715f, 186.0f, 128.0f),
                    PathNode.CurveTo(186.0f, 133.52284f, 190.47716f, 138.0f, 196.0f, 138.0f),
                    PathNode.CurveTo(201.52284f, 138.0f, 206.0f, 133.52284f, 206.0f, 128.0f),
                    PathNode.CurveTo(206.0f, 122.47715f, 201.52284f, 118.0f, 196.0f, 118.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _dotsThree!!
    }

private var _dotsThree: ImageVector? = null
