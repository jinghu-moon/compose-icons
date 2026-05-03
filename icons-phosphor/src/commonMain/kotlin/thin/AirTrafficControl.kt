package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AirTrafficControl: ImageVector
    get() {
        if (_airTrafficControl != null) return _airTrafficControl!!
        _airTrafficControl = phosphorThinIcon(
            name = "AirTrafficControl",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(225.83f, 73.11f),
                    PathNode.CurveTo(223.58275f, 69.90551f, 219.91394f, 67.99832f, 216.0f, 68.0f),
                    PathNode.LineTo(132.0f, 68.0f),
                    PathNode.LineTo(132.0f, 28.0f),
                    PathNode.LineTo(152.0f, 28.0f),
                    PathNode.CurveTo(154.20914f, 28.0f, 156.0f, 26.209139f, 156.0f, 24.0f),
                    PathNode.CurveTo(156.0f, 21.790861f, 154.20914f, 20.0f, 152.0f, 20.0f),
                    PathNode.LineTo(104.0f, 20.0f),
                    PathNode.CurveTo(101.79086f, 20.0f, 100.0f, 21.790861f, 100.0f, 24.0f),
                    PathNode.CurveTo(100.0f, 26.209139f, 101.79086f, 28.0f, 104.0f, 28.0f),
                    PathNode.LineTo(124.0f, 28.0f),
                    PathNode.LineTo(124.0f, 68.0f),
                    PathNode.LineTo(40.0f, 68.0f),
                    PathNode.CurveTo(36.085243f, 67.9993f, 32.41624f, 69.908195f, 30.16994f, 73.11436f),
                    PathNode.CurveTo(27.923637f, 76.32051f, 27.382458f, 80.42083f, 28.72f, 84.1f),
                    PathNode.LineTo(54.91f, 156.1f),
                    PathNode.CurveTo(56.633213f, 160.84004f, 61.136444f, 163.9967f, 66.18f, 164.0f),
                    PathNode.LineTo(100.0f, 164.0f),
                    PathNode.LineTo(100.0f, 232.0f),
                    PathNode.CurveTo(100.0f, 234.20914f, 101.79086f, 236.0f, 104.0f, 236.0f),
                    PathNode.CurveTo(106.20914f, 236.0f, 108.0f, 234.20914f, 108.0f, 232.0f),
                    PathNode.LineTo(108.0f, 164.0f),
                    PathNode.LineTo(148.0f, 164.0f),
                    PathNode.LineTo(148.0f, 232.0f),
                    PathNode.CurveTo(148.0f, 234.20914f, 149.79086f, 236.0f, 152.0f, 236.0f),
                    PathNode.CurveTo(154.20914f, 236.0f, 156.0f, 234.20914f, 156.0f, 232.0f),
                    PathNode.LineTo(156.0f, 164.0f),
                    PathNode.LineTo(189.82f, 164.0f),
                    PathNode.CurveTo(194.86356f, 163.9967f, 199.36679f, 160.84004f, 201.09f, 156.1f),
                    PathNode.LineTo(227.28f, 84.1f),
                    PathNode.CurveTo(228.61905f, 80.41954f, 228.07779f, 76.317215f, 225.83f, 73.11f),
                    PathNode.Close,
                    PathNode.MoveTo(107.34f, 156.0f),
                    PathNode.LineTo(92.79f, 76.0f),
                    PathNode.LineTo(163.21f, 76.0f),
                    PathNode.LineTo(148.66f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(62.42f, 153.37f),
                    PathNode.LineTo(36.24f, 81.37f),
                    PathNode.CurveTo(35.79278f, 80.14322f, 35.972492f, 78.77537f, 36.72143f, 77.70574f),
                    PathNode.CurveTo(37.470367f, 76.63612f, 38.69424f, 75.99937f, 40.0f, 76.0f),
                    PathNode.LineTo(84.66f, 76.0f),
                    PathNode.LineTo(99.2f, 156.0f),
                    PathNode.LineTo(66.2f, 156.0f),
                    PathNode.CurveTo(64.51112f, 156.00925f, 62.998425f, 154.95676f, 62.42f, 153.37f),
                    PathNode.Close,
                    PathNode.MoveTo(219.76f, 81.37f),
                    PathNode.LineTo(193.58f, 153.37f),
                    PathNode.CurveTo(193.00407f, 154.94984f, 191.50156f, 156.00081f, 189.82f, 156.0f),
                    PathNode.LineTo(156.82f, 156.0f),
                    PathNode.LineTo(171.37f, 76.0f),
                    PathNode.LineTo(216.0f, 76.0f),
                    PathNode.CurveTo(217.30576f, 75.99937f, 218.52963f, 76.63612f, 219.27856f, 77.70574f),
                    PathNode.CurveTo(220.02751f, 78.77537f, 220.20723f, 80.14322f, 219.76f, 81.37f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _airTrafficControl!!
    }

private var _airTrafficControl: ImageVector? = null
