package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Ladder: ImageVector
    get() {
        if (_ladder != null) return _ladder!!
        _ladder = phosphorThinIcon(
            name = "Ladder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(211.76f, 214.63f),
                    PathNode.LineTo(160.26f, 73.0f),
                    PathNode.LineTo(170.8f, 44.0f),
                    PathNode.LineTo(184.0f, 44.0f),
                    PathNode.CurveTo(186.20914f, 44.0f, 188.0f, 42.20914f, 188.0f, 40.0f),
                    PathNode.CurveTo(188.0f, 37.79086f, 186.20914f, 36.0f, 184.0f, 36.0f),
                    PathNode.LineTo(88.0f, 36.0f),
                    PathNode.CurveTo(85.79086f, 36.0f, 84.0f, 37.79086f, 84.0f, 40.0f),
                    PathNode.CurveTo(84.0f, 42.20914f, 85.79086f, 44.0f, 88.0f, 44.0f),
                    PathNode.LineTo(98.29f, 44.0f),
                    PathNode.LineTo(36.29f, 214.63f),
                    PathNode.CurveTo(35.92615f, 215.62718f, 35.973587f, 216.72809f, 36.42186f, 217.6903f),
                    PathNode.CurveTo(36.870136f, 218.6525f, 37.682484f, 219.39705f, 38.68f, 219.76f),
                    PathNode.CurveTo(39.10412f, 219.91089f, 39.54991f, 219.99194f, 40.0f, 220.0f),
                    PathNode.CurveTo(41.681553f, 220.00081f, 43.18407f, 218.94984f, 43.76f, 217.37f),
                    PathNode.LineTo(54.44f, 188.0f),
                    PathNode.LineTo(109.93f, 188.0f),
                    PathNode.LineTo(100.24f, 214.63f),
                    PathNode.CurveTo(99.87615f, 215.62718f, 99.923584f, 216.72809f, 100.371864f, 217.6903f),
                    PathNode.CurveTo(100.82014f, 218.6525f, 101.632484f, 219.39705f, 102.63f, 219.76f),
                    PathNode.CurveTo(103.06976f, 219.91707f, 103.533035f, 219.99821f, 104.0f, 220.0f),
                    PathNode.CurveTo(105.68155f, 220.00081f, 107.18407f, 218.94984f, 107.76f, 217.37f),
                    PathNode.LineTo(127.17f, 164.0f),
                    PathNode.LineTo(184.83f, 164.0f),
                    PathNode.LineTo(204.24f, 217.37f),
                    PathNode.CurveTo(204.81593f, 218.94984f, 206.31845f, 220.00081f, 208.0f, 220.0f),
                    PathNode.CurveTo(208.46689f, 219.99745f, 208.93004f, 219.91632f, 209.37f, 219.76f),
                    PathNode.CurveTo(210.36752f, 219.39705f, 211.17987f, 218.6525f, 211.62814f, 217.6903f),
                    PathNode.CurveTo(212.07642f, 216.72809f, 212.12386f, 215.62718f, 211.76f, 214.63f),
                    PathNode.Close,
                    PathNode.MoveTo(130.29f, 132.0f),
                    PathNode.LineTo(74.8f, 132.0f),
                    PathNode.LineTo(89.35f, 92.0f),
                    PathNode.LineTo(144.83f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(162.29f, 44.0f),
                    PathNode.LineTo(147.74f, 84.0f),
                    PathNode.LineTo(92.26f, 84.0f),
                    PathNode.LineTo(106.8f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(57.35f, 180.0f),
                    PathNode.LineTo(71.89f, 140.0f),
                    PathNode.LineTo(127.38f, 140.0f),
                    PathNode.LineTo(112.83f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(130.07f, 156.0f),
                    PathNode.LineTo(156.0f, 84.7f),
                    PathNode.LineTo(181.92f, 156.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _ladder!!
    }

private var _ladder: ImageVector? = null
