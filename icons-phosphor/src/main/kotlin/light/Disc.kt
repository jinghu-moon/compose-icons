package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Disc: ImageVector
    get() {
        if (_disc != null) return _disc!!
        _disc = phosphorLightIcon(
            name = "Disc",
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
                    PathNode.MoveTo(165.52f, 122.0f),
                    PathNode.CurveTo(164.58003f, 116.119804f, 162.26375f, 110.544975f, 158.76f, 105.73f),
                    PathNode.LineTo(195.76f, 68.78f),
                    PathNode.CurveTo(208.76366f, 83.61088f, 216.51077f, 102.31782f, 217.8f, 122.0f),
                    PathNode.Close,
                    PathNode.MoveTo(154.0f, 128.0f),
                    PathNode.CurveTo(154.0f, 142.3594f, 142.3594f, 154.0f, 128.0f, 154.0f),
                    PathNode.CurveTo(113.640594f, 154.0f, 102.0f, 142.3594f, 102.0f, 128.0f),
                    PathNode.CurveTo(102.0f, 113.640594f, 113.640594f, 102.0f, 128.0f, 102.0f),
                    PathNode.CurveTo(142.3594f, 102.0f, 154.0f, 113.640594f, 154.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 218.0f),
                    PathNode.CurveTo(87.993706f, 218.0313f, 52.769104f, 191.65068f, 41.54456f, 153.25127f),
                    PathNode.CurveTo(30.320015f, 114.851875f, 45.790314f, 73.6526f, 79.51493f, 52.131584f),
                    PathNode.CurveTo(113.239555f, 30.610567f, 157.12192f, 33.934555f, 187.22f, 60.29f),
                    PathNode.LineTo(150.27f, 97.24f),
                    PathNode.CurveTo(136.49388f, 87.27104f, 117.77183f, 87.66797f, 104.430595f, 98.211845f),
                    PathNode.CurveTo(91.08937f, 108.75572f, 86.37718f, 126.87942f, 92.8932f, 142.5862f),
                    PathNode.CurveTo(99.4092f, 158.293f, 115.566956f, 167.75874f, 132.4541f, 165.76227f),
                    PathNode.CurveTo(149.34125f, 163.76581f, 162.84625f, 150.79323f, 165.52f, 134.0f),
                    PathNode.LineTo(217.8f, 134.0f),
                    PathNode.CurveTo(214.58429f, 181.24413f, 175.35341f, 217.94118f, 128.0f, 218.0f),
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
        return _disc!!
    }

private var _disc: ImageVector? = null
