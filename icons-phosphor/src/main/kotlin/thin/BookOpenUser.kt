package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BookOpenUser: ImageVector
    get() {
        if (_bookOpenUser != null) return _bookOpenUser!!
        _bookOpenUser = phosphorThinIcon(
            name = "BookOpenUser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 76.0f),
                    PathNode.LineTo(160.0f, 76.0f),
                    PathNode.CurveTo(146.51562f, 76.00625f, 134.16536f, 83.54763f, 128.0f, 95.54f),
                    PathNode.CurveTo(121.83464f, 83.54763f, 109.48438f, 76.00625f, 96.0f, 76.0f),
                    PathNode.LineTo(24.0f, 76.0f),
                    PathNode.CurveTo(21.790861f, 76.0f, 20.0f, 77.79086f, 20.0f, 80.0f),
                    PathNode.LineTo(20.0f, 200.0f),
                    PathNode.CurveTo(20.0f, 202.20914f, 21.790861f, 204.0f, 24.0f, 204.0f),
                    PathNode.LineTo(96.0f, 204.0f),
                    PathNode.CurveTo(111.463974f, 204.0f, 124.0f, 216.53603f, 124.0f, 232.0f),
                    PathNode.CurveTo(124.0f, 234.20914f, 125.79086f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(130.20914f, 236.0f, 132.0f, 234.20914f, 132.0f, 232.0f),
                    PathNode.CurveTo(132.0f, 216.53603f, 144.53603f, 204.0f, 160.0f, 204.0f),
                    PathNode.LineTo(232.0f, 204.0f),
                    PathNode.CurveTo(234.20914f, 204.0f, 236.0f, 202.20914f, 236.0f, 200.0f),
                    PathNode.LineTo(236.0f, 80.0f),
                    PathNode.CurveTo(236.0f, 77.79086f, 234.20914f, 76.0f, 232.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 196.0f),
                    PathNode.LineTo(28.0f, 196.0f),
                    PathNode.LineTo(28.0f, 84.0f),
                    PathNode.LineTo(96.0f, 84.0f),
                    PathNode.CurveTo(111.463974f, 84.0f, 124.0f, 96.536026f, 124.0f, 112.0f),
                    PathNode.LineTo(124.0f, 209.4f),
                    PathNode.CurveTo(117.17713f, 200.92406f, 106.88085f, 195.99657f, 96.0f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 196.0f),
                    PathNode.LineTo(160.0f, 196.0f),
                    PathNode.CurveTo(149.1178f, 196.00044f, 138.82182f, 200.93149f, 132.0f, 209.41f),
                    PathNode.LineTo(132.0f, 112.0f),
                    PathNode.CurveTo(132.0f, 96.536026f, 144.53603f, 84.0f, 160.0f, 84.0f),
                    PathNode.LineTo(228.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.8f, 45.6f),
                    PathNode.CurveTo(101.1096f, 34.520542f, 114.15068f, 28.0f, 128.0f, 28.0f),
                    PathNode.CurveTo(141.84932f, 28.0f, 154.89041f, 34.520542f, 163.2f, 45.6f),
                    PathNode.CurveTo(164.52548f, 47.36731f, 164.16731f, 49.874516f, 162.4f, 51.2f),
                    PathNode.CurveTo(160.63269f, 52.525482f, 158.12549f, 52.167313f, 156.8f, 50.4f),
                    PathNode.CurveTo(150.00124f, 41.33499f, 139.33127f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(116.66874f, 36.0f, 105.99876f, 41.33499f, 99.2f, 50.4f),
                    PathNode.CurveTo(97.87452f, 52.167313f, 95.36731f, 52.525482f, 93.6f, 51.2f),
                    PathNode.CurveTo(91.83269f, 49.874516f, 91.47452f, 47.36731f, 92.8f, 45.6f),
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
        return _bookOpenUser!!
    }

private var _bookOpenUser: ImageVector? = null
