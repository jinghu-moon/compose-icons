package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Ladder: ImageVector
    get() {
        if (_ladder != null) return _ladder!!
        _ladder = phosphorLightIcon(
            name = "Ladder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(213.64f, 214.0f),
                    PathNode.LineTo(162.38f, 73.0f),
                    PathNode.LineTo(172.2f, 46.0f),
                    PathNode.LineTo(184.0f, 46.0f),
                    PathNode.CurveTo(187.3137f, 46.0f, 190.0f, 43.31371f, 190.0f, 40.0f),
                    PathNode.CurveTo(190.0f, 36.68629f, 187.3137f, 34.0f, 184.0f, 34.0f),
                    PathNode.LineTo(88.0f, 34.0f),
                    PathNode.CurveTo(84.686295f, 34.0f, 82.0f, 36.68629f, 82.0f, 40.0f),
                    PathNode.CurveTo(82.0f, 43.31371f, 84.686295f, 46.0f, 88.0f, 46.0f),
                    PathNode.LineTo(95.43f, 46.0f),
                    PathNode.LineTo(34.36f, 214.0f),
                    PathNode.CurveTo(33.26487f, 217.1144f, 34.891445f, 220.52841f, 38.0f, 221.64f),
                    PathNode.CurveTo(38.64209f, 221.87007f, 39.31798f, 221.99173f, 40.0f, 222.0f),
                    PathNode.CurveTo(42.52361f, 222.00046f, 44.777767f, 220.42174f, 45.64f, 218.05f),
                    PathNode.LineTo(55.84f, 190.0f),
                    PathNode.LineTo(107.07f, 190.0f),
                    PathNode.LineTo(98.36f, 214.0f),
                    PathNode.CurveTo(97.816025f, 215.4958f, 97.88868f, 217.14645f, 98.56197f, 218.58868f),
                    PathNode.CurveTo(99.23527f, 220.03091f, 100.45401f, 221.14653f, 101.95f, 221.69f),
                    PathNode.CurveTo(102.592094f, 221.92007f, 103.26798f, 222.04173f, 103.95f, 222.05f),
                    PathNode.CurveTo(106.47361f, 222.05045f, 108.72777f, 220.47174f, 109.59f, 218.1f),
                    PathNode.LineTo(128.57f, 166.0f),
                    PathNode.LineTo(183.43f, 166.0f),
                    PathNode.LineTo(202.36f, 218.05f),
                    PathNode.CurveTo(203.22223f, 220.42174f, 205.4764f, 222.00046f, 208.0f, 222.0f),
                    PathNode.CurveTo(208.69882f, 221.99734f, 209.39209f, 221.8756f, 210.05f, 221.64f),
                    PathNode.CurveTo(213.13869f, 220.50806f, 214.74004f, 217.1002f, 213.64f, 214.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.89f, 130.0f),
                    PathNode.LineTo(77.66f, 130.0f),
                    PathNode.LineTo(90.75f, 94.0f),
                    PathNode.LineTo(142.0f, 94.0f),
                    PathNode.Close,
                    PathNode.MoveTo(159.43f, 46.0f),
                    PathNode.LineTo(146.34f, 82.0f),
                    PathNode.LineTo(95.11f, 82.0f),
                    PathNode.LineTo(108.2f, 46.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.2f, 178.0f),
                    PathNode.LineTo(73.29f, 142.0f),
                    PathNode.LineTo(124.52f, 142.0f),
                    PathNode.LineTo(111.43f, 178.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.93f, 154.0f),
                    PathNode.LineTo(156.0f, 90.56f),
                    PathNode.LineTo(179.07f, 154.0f),
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
        return _ladder!!
    }

private var _ladder: ImageVector? = null
