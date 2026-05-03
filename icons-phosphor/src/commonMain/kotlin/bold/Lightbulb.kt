package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Lightbulb: ImageVector
    get() {
        if (_lightbulb != null) return _lightbulb!!
        _lightbulb = phosphorBoldIcon(
            name = "Lightbulb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(180.0f, 232.0f),
                    PathNode.CurveTo(180.0f, 238.62741f, 174.62741f, 244.0f, 168.0f, 244.0f),
                    PathNode.LineTo(88.0f, 244.0f),
                    PathNode.CurveTo(81.37258f, 244.0f, 76.0f, 238.62741f, 76.0f, 232.0f),
                    PathNode.CurveTo(76.0f, 225.37259f, 81.37258f, 220.0f, 88.0f, 220.0f),
                    PathNode.LineTo(168.0f, 220.0f),
                    PathNode.CurveTo(174.62741f, 220.0f, 180.0f, 225.37259f, 180.0f, 232.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 104.0f),
                    PathNode.CurveTo(220.07396f, 132.25279f, 207.09346f, 158.95563f, 184.83f, 176.35f),
                    PathNode.CurveTo(181.81479f, 178.64705f, 180.03166f, 182.20963f, 180.0f, 186.0f),
                    PathNode.LineTo(180.0f, 188.0f),
                    PathNode.CurveTo(180.0f, 199.0457f, 171.0457f, 208.0f, 160.0f, 208.0f),
                    PathNode.LineTo(96.0f, 208.0f),
                    PathNode.CurveTo(84.95431f, 208.0f, 76.0f, 199.0457f, 76.0f, 188.0f),
                    PathNode.LineTo(76.0f, 186.0f),
                    PathNode.CurveTo(75.99559f, 182.27203f, 74.25883f, 178.75784f, 71.3f, 176.49f),
                    PathNode.CurveTo(49.1001f, 159.19823f, 36.083355f, 132.65955f, 36.0f, 104.52f),
                    PathNode.CurveTo(35.73f, 54.69f, 76.0f, 13.2f, 125.79f, 12.0f),
                    PathNode.CurveTo(150.57054f, 11.404555f, 174.5429f, 20.833878f, 192.27722f, 38.152184f),
                    PathNode.CurveTo(210.01155f, 55.47049f, 220.00716f, 79.2123f, 220.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 104.0f),
                    PathNode.CurveTo(196.0054f, 85.67572f, 188.61508f, 68.124825f, 175.50348f, 55.32384f),
                    PathNode.CurveTo(162.39189f, 42.522858f, 144.66888f, 35.555367f, 126.35f, 36.0f),
                    PathNode.CurveTo(89.56f, 36.88f, 59.8f, 67.55f, 60.0f, 104.38f),
                    PathNode.CurveTo(60.06946f, 125.17748f, 69.69286f, 144.78932f, 86.1f, 157.57f),
                    PathNode.CurveTo(94.35464f, 163.9409f, 99.42844f, 173.58842f, 100.0f, 184.0f),
                    PathNode.LineTo(156.1f, 184.0f),
                    PathNode.CurveTo(156.68277f, 173.56932f, 161.7519f, 163.9015f, 170.0f, 157.49f),
                    PathNode.CurveTo(186.45618f, 144.62715f, 196.05144f, 124.88674f, 196.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(175.93f, 98.68f),
                    PathNode.CurveTo(173.76425f, 80.36386f, 161.39708f, 64.8613f, 144.02f, 58.68f),
                    PathNode.CurveTo(137.82759f, 56.656727f, 131.15193f, 59.94364f, 128.97978f, 66.08541f),
                    PathNode.CurveTo(126.807625f, 72.227196f, 129.93245f, 78.980225f, 136.02f, 81.3f),
                    PathNode.CurveTo(144.75272f, 84.36097f, 150.99031f, 92.11435f, 152.11f, 101.3f),
                    PathNode.CurveTo(152.83902f, 107.888756f, 158.77126f, 112.639015f, 165.36f, 111.91f),
                    PathNode.CurveTo(171.94876f, 111.180984f, 176.69902f, 105.24876f, 175.97f, 98.66f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _lightbulb!!
    }

private var _lightbulb: ImageVector? = null
