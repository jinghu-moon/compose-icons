package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DotsSix: ImageVector
    get() {
        if (_dotsSix != null) return _dotsSix!!
        _dotsSix = phosphorLightIcon(
            name = "DotsSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(70.0f, 92.0f),
                    PathNode.CurveTo(70.0f, 97.52285f, 65.52285f, 102.0f, 60.0f, 102.0f),
                    PathNode.CurveTo(54.477154f, 102.0f, 50.0f, 97.52285f, 50.0f, 92.0f),
                    PathNode.CurveTo(50.0f, 86.47715f, 54.477154f, 82.0f, 60.0f, 82.0f),
                    PathNode.CurveTo(65.52285f, 82.0f, 70.0f, 86.47715f, 70.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 82.0f),
                    PathNode.CurveTo(122.47715f, 82.0f, 118.0f, 86.47715f, 118.0f, 92.0f),
                    PathNode.CurveTo(118.0f, 97.52285f, 122.47715f, 102.0f, 128.0f, 102.0f),
                    PathNode.CurveTo(133.52284f, 102.0f, 138.0f, 97.52285f, 138.0f, 92.0f),
                    PathNode.CurveTo(138.0f, 86.47715f, 133.52284f, 82.0f, 128.0f, 82.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 102.0f),
                    PathNode.CurveTo(201.52284f, 102.0f, 206.0f, 97.52285f, 206.0f, 92.0f),
                    PathNode.CurveTo(206.0f, 86.47715f, 201.52284f, 82.0f, 196.0f, 82.0f),
                    PathNode.CurveTo(190.47716f, 82.0f, 186.0f, 86.47715f, 186.0f, 92.0f),
                    PathNode.CurveTo(186.0f, 97.52285f, 190.47716f, 102.0f, 196.0f, 102.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 154.0f),
                    PathNode.CurveTo(54.477154f, 154.0f, 50.0f, 158.47716f, 50.0f, 164.0f),
                    PathNode.CurveTo(50.0f, 169.52284f, 54.477154f, 174.0f, 60.0f, 174.0f),
                    PathNode.CurveTo(65.52285f, 174.0f, 70.0f, 169.52284f, 70.0f, 164.0f),
                    PathNode.CurveTo(70.0f, 158.47716f, 65.52285f, 154.0f, 60.0f, 154.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 154.0f),
                    PathNode.CurveTo(122.47715f, 154.0f, 118.0f, 158.47716f, 118.0f, 164.0f),
                    PathNode.CurveTo(118.0f, 169.52284f, 122.47715f, 174.0f, 128.0f, 174.0f),
                    PathNode.CurveTo(133.52284f, 174.0f, 138.0f, 169.52284f, 138.0f, 164.0f),
                    PathNode.CurveTo(138.0f, 158.47716f, 133.52284f, 154.0f, 128.0f, 154.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 154.0f),
                    PathNode.CurveTo(190.47716f, 154.0f, 186.0f, 158.47716f, 186.0f, 164.0f),
                    PathNode.CurveTo(186.0f, 169.52284f, 190.47716f, 174.0f, 196.0f, 174.0f),
                    PathNode.CurveTo(201.52284f, 174.0f, 206.0f, 169.52284f, 206.0f, 164.0f),
                    PathNode.CurveTo(206.0f, 158.47716f, 201.52284f, 154.0f, 196.0f, 154.0f),
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
        return _dotsSix!!
    }

private var _dotsSix: ImageVector? = null
