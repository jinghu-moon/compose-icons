package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SpeakerHifi: ImageVector
    get() {
        if (_speakerHifi != null) return _speakerHifi!!
        _speakerHifi = phosphorLightIcon(
            name = "SpeakerHifi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 26.0f),
                    PathNode.LineTo(64.0f, 26.0f),
                    PathNode.CurveTo(56.268013f, 26.0f, 50.0f, 32.268013f, 50.0f, 40.0f),
                    PathNode.LineTo(50.0f, 216.0f),
                    PathNode.CurveTo(50.0f, 223.73198f, 56.268013f, 230.0f, 64.0f, 230.0f),
                    PathNode.LineTo(192.0f, 230.0f),
                    PathNode.CurveTo(199.73198f, 230.0f, 206.0f, 223.73198f, 206.0f, 216.0f),
                    PathNode.LineTo(206.0f, 40.0f),
                    PathNode.CurveTo(206.0f, 32.268013f, 199.73198f, 26.0f, 192.0f, 26.0f),
                    PathNode.Close,
                    PathNode.MoveTo(194.0f, 216.0f),
                    PathNode.CurveTo(194.0f, 217.10457f, 193.10457f, 218.0f, 192.0f, 218.0f),
                    PathNode.LineTo(64.0f, 218.0f),
                    PathNode.CurveTo(62.89543f, 218.0f, 62.0f, 217.10457f, 62.0f, 216.0f),
                    PathNode.LineTo(62.0f, 40.0f),
                    PathNode.CurveTo(62.0f, 38.89543f, 62.89543f, 38.0f, 64.0f, 38.0f),
                    PathNode.LineTo(192.0f, 38.0f),
                    PathNode.CurveTo(193.10457f, 38.0f, 194.0f, 38.89543f, 194.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(118.0f, 76.0f),
                    PathNode.CurveTo(118.0f, 70.47715f, 122.47715f, 66.0f, 128.0f, 66.0f),
                    PathNode.CurveTo(133.52284f, 66.0f, 138.0f, 70.47715f, 138.0f, 76.0f),
                    PathNode.CurveTo(138.0f, 81.52285f, 133.52284f, 86.0f, 128.0f, 86.0f),
                    PathNode.CurveTo(122.47715f, 86.0f, 118.0f, 81.52285f, 118.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 114.0f),
                    PathNode.CurveTo(107.013176f, 114.0f, 90.0f, 131.01318f, 90.0f, 152.0f),
                    PathNode.CurveTo(90.0f, 172.98682f, 107.013176f, 190.0f, 128.0f, 190.0f),
                    PathNode.CurveTo(148.98682f, 190.0f, 166.0f, 172.98682f, 166.0f, 152.0f),
                    PathNode.CurveTo(166.0f, 131.01318f, 148.98682f, 114.0f, 128.0f, 114.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 178.0f),
                    PathNode.CurveTo(113.640594f, 178.0f, 102.0f, 166.3594f, 102.0f, 152.0f),
                    PathNode.CurveTo(102.0f, 137.6406f, 113.640594f, 126.0f, 128.0f, 126.0f),
                    PathNode.CurveTo(142.3594f, 126.0f, 154.0f, 137.6406f, 154.0f, 152.0f),
                    PathNode.CurveTo(154.0f, 166.3594f, 142.3594f, 178.0f, 128.0f, 178.0f),
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
        return _speakerHifi!!
    }

private var _speakerHifi: ImageVector? = null
