package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Wheelchair: ImageVector
    get() {
        if (_wheelchair != null) return _wheelchair!!
        _wheelchair = phosphorFillIcon(
            name = "Wheelchair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(250.53f, 199.59f),
                    PathNode.LineTo(226.53f, 207.59f),
                    PathNode.CurveTo(222.75465f, 208.85349f, 218.62476f, 207.14868f, 216.84f, 203.59f),
                    PathNode.LineTo(187.05f, 144.0f),
                    PathNode.LineTo(104.0f, 144.0f),
                    PathNode.CurveTo(99.58172f, 144.0f, 96.0f, 140.41827f, 96.0f, 136.0f),
                    PathNode.LineTo(96.0f, 106.34f),
                    PathNode.CurveTo(69.36378f, 114.29158f, 52.592236f, 140.57858f, 56.60559f, 168.08511f),
                    PathNode.CurveTo(60.61895f, 195.59163f, 84.20223f, 215.99063f, 112.0f, 216.0f),
                    PathNode.CurveTo(137.91f, 216.0f, 162.09f, 197.95f, 168.25f, 174.0f),
                    PathNode.CurveTo(169.35457f, 169.71979f, 173.71979f, 167.14543f, 178.0f, 168.25f),
                    PathNode.CurveTo(182.28021f, 169.35457f, 184.85457f, 173.71979f, 183.75f, 178.0f),
                    PathNode.CurveTo(175.69f, 209.3f, 145.52f, 232.0f, 112.0f, 232.0f),
                    PathNode.CurveTo(75.36711f, 231.97838f, 44.59034f, 204.4542f, 40.494057f, 168.05104f),
                    PathNode.CurveTo(36.397778f, 131.64789f, 60.288013f, 97.972275f, 96.0f, 89.81f),
                    PathNode.LineTo(96.0f, 70.81f),
                    PathNode.CurveTo(82.67699f, 66.837845f, 74.286224f, 53.691734f, 76.293335f, 39.934837f),
                    PathNode.CurveTo(78.30044f, 26.177937f, 90.09746f, 15.977184f, 104.0f, 15.977184f),
                    PathNode.CurveTo(117.90254f, 15.977184f, 129.69957f, 26.177937f, 131.70667f, 39.934837f),
                    PathNode.CurveTo(133.71378f, 53.691734f, 125.32301f, 66.837845f, 112.0f, 70.81f),
                    PathNode.LineTo(112.0f, 88.0f),
                    PathNode.LineTo(168.0f, 88.0f),
                    PathNode.CurveTo(172.41827f, 88.0f, 176.0f, 91.58172f, 176.0f, 96.0f),
                    PathNode.CurveTo(176.0f, 100.41828f, 172.41827f, 104.0f, 168.0f, 104.0f),
                    PathNode.LineTo(112.0f, 104.0f),
                    PathNode.LineTo(112.0f, 128.0f),
                    PathNode.LineTo(192.0f, 128.0f),
                    PathNode.CurveTo(195.02771f, 128.00162f, 197.7951f, 129.71236f, 199.15f, 132.42f),
                    PathNode.LineTo(228.05f, 190.22f),
                    PathNode.LineTo(245.47f, 184.41f),
                    PathNode.CurveTo(249.66183f, 183.01273f, 254.19272f, 185.27815f, 255.59f, 189.47f),
                    PathNode.CurveTo(256.98727f, 193.66183f, 254.72185f, 198.19272f, 250.53f, 199.59f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _wheelchair!!
    }

private var _wheelchair: ImageVector? = null
