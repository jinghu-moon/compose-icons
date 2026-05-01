package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Pants: ImageVector
    get() {
        if (_pants != null) return _pants!!
        _pants = phosphorRegularIcon(
            name = "Pants",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(223.88f, 214.0f),
                    PathNode.LineTo(201.88f, 38.0f),
                    PathNode.CurveTo(200.87183f, 29.997923f, 194.06534f, 23.997232f, 186.0f, 24.0f),
                    PathNode.LineTo(70.0f, 24.0f),
                    PathNode.CurveTo(61.934666f, 23.997232f, 55.128166f, 29.997923f, 54.12f, 38.0f),
                    PathNode.LineTo(32.12f, 214.0f),
                    PathNode.CurveTo(31.54588f, 218.55695f, 32.95777f, 223.14085f, 35.996323f, 226.58507f),
                    PathNode.CurveTo(39.034878f, 230.02927f, 43.407032f, 232.00157f, 48.0f, 232.0f),
                    PathNode.LineTo(88.69f, 232.0f),
                    PathNode.CurveTo(96.01005f, 232.00124f, 102.39744f, 227.03464f, 104.2f, 219.94f),
                    PathNode.LineTo(128.0f, 127.94f),
                    PathNode.LineTo(151.79f, 219.88f),
                    PathNode.CurveTo(153.57024f, 227.00208f, 159.9688f, 231.99889f, 167.31f, 232.0f),
                    PathNode.LineTo(208.0f, 232.0f),
                    PathNode.CurveTo(212.59297f, 232.00157f, 216.96512f, 230.02927f, 220.00368f, 226.58507f),
                    PathNode.CurveTo(223.04224f, 223.14085f, 224.45412f, 218.55695f, 223.88f, 214.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.9f, 95.2f),
                    PathNode.CurveTo(181.23384f, 92.52216f, 172.02335f, 83.58142f, 169.0f, 72.0f),
                    PathNode.LineTo(190.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(186.0f, 40.0f),
                    PathNode.LineTo(188.0f, 56.0f),
                    PathNode.LineTo(68.0f, 56.0f),
                    PathNode.LineTo(70.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(66.0f, 72.0f),
                    PathNode.LineTo(87.0f, 72.0f),
                    PathNode.CurveTo(83.976654f, 83.58142f, 74.76615f, 92.52216f, 63.1f, 95.2f),
                    PathNode.Close,
                    PathNode.MoveTo(88.69f, 216.0f),
                    PathNode.LineTo(48.0f, 216.0f),
                    PathNode.LineTo(61.0f, 111.73f),
                    PathNode.CurveTo(82.41147f, 109.45681f, 99.70093f, 93.22547f, 103.32f, 72.0f),
                    PathNode.LineTo(120.0f, 72.0f),
                    PathNode.LineTo(120.0f, 95.0f),
                    PathNode.Close,
                    PathNode.MoveTo(167.29f, 215.94f),
                    PathNode.LineTo(136.0f, 95.0f),
                    PathNode.LineTo(136.0f, 72.0f),
                    PathNode.LineTo(152.68f, 72.0f),
                    PathNode.CurveTo(156.29907f, 93.22547f, 173.58853f, 109.45681f, 195.0f, 111.73f),
                    PathNode.LineTo(208.0f, 216.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _pants!!
    }

private var _pants: ImageVector? = null
