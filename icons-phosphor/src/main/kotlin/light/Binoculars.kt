package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Binoculars: ImageVector
    get() {
        if (_binoculars != null) return _binoculars!!
        _binoculars = phosphorLightIcon(
            name = "Binoculars",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(233.0f, 147.24f),
                    PathNode.LineTo(191.43f, 52.6f),
                    PathNode.CurveTo(191.13058f, 51.917675f, 190.7067f, 51.29709f, 190.18f, 50.77f),
                    PathNode.CurveTo(178.46501f, 39.05854f, 159.47499f, 39.05854f, 147.76f, 50.77f),
                    PathNode.CurveTo(146.6369f, 51.89169f, 146.00404f, 53.412704f, 146.0f, 55.0f),
                    PathNode.LineTo(146.0f, 82.0f),
                    PathNode.LineTo(110.0f, 82.0f),
                    PathNode.LineTo(110.0f, 55.0f),
                    PathNode.CurveTo(110.00125f, 53.405773f, 109.36799f, 51.876587f, 108.24f, 50.75f),
                    PathNode.CurveTo(96.525f, 39.038544f, 77.535f, 39.038544f, 65.82f, 50.75f),
                    PathNode.CurveTo(65.29331f, 51.277092f, 64.86942f, 51.897675f, 64.57f, 52.58f),
                    PathNode.LineTo(23.0f, 147.24f),
                    PathNode.CurveTo(14.36155f, 164.22166f, 17.08577f, 184.77115f, 29.850544f, 198.9154f),
                    PathNode.CurveTo(42.61532f, 213.05968f, 62.77849f, 217.87102f, 80.554504f, 211.01442f),
                    PathNode.CurveTo(98.33052f, 204.15782f, 110.03995f, 187.0525f, 110.0f, 168.0f),
                    PathNode.LineTo(110.0f, 94.0f),
                    PathNode.LineTo(146.0f, 94.0f),
                    PathNode.LineTo(146.0f, 168.0f),
                    PathNode.CurveTo(145.96005f, 187.0525f, 157.66948f, 204.15782f, 175.4455f, 211.01442f),
                    PathNode.CurveTo(193.2215f, 217.87102f, 213.38467f, 213.05968f, 226.14946f, 198.9154f),
                    PathNode.CurveTo(238.91423f, 184.77115f, 241.63844f, 164.22166f, 233.0f, 147.24f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 202.0f),
                    PathNode.CurveTo(45.222317f, 202.0f, 30.0f, 186.77768f, 30.0f, 168.0f),
                    PathNode.CurveTo(30.0f, 149.22232f, 45.222317f, 134.0f, 64.0f, 134.0f),
                    PathNode.CurveTo(82.77768f, 134.0f, 98.0f, 149.22232f, 98.0f, 168.0f),
                    PathNode.CurveTo(98.0f, 186.77768f, 82.77768f, 202.0f, 64.0f, 202.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 122.0f),
                    PathNode.CurveTo(57.61084f, 121.99762f, 51.291958f, 123.33293f, 45.45f, 125.92f),
                    PathNode.LineTo(75.06f, 58.54f),
                    PathNode.CurveTo(81.515366f, 52.790874f, 91.146034f, 52.442425f, 98.0f, 57.71f),
                    PathNode.LineTo(98.0f, 137.0f),
                    PathNode.CurveTo(89.288734f, 127.42951f, 76.94141f, 121.98216f, 64.0f, 122.0f),
                    PathNode.Close,
                    PathNode.MoveTo(158.0f, 57.72f),
                    PathNode.CurveTo(164.85397f, 52.452423f, 174.48463f, 52.800873f, 180.94f, 58.55f),
                    PathNode.LineTo(210.55f, 125.92f),
                    PathNode.CurveTo(192.47508f, 117.910835f, 171.30257f, 122.37499f, 158.0f, 137.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 202.0f),
                    PathNode.CurveTo(173.22232f, 202.0f, 158.0f, 186.77768f, 158.0f, 168.0f),
                    PathNode.CurveTo(158.0f, 149.22232f, 173.22232f, 134.0f, 192.0f, 134.0f),
                    PathNode.CurveTo(210.77768f, 134.0f, 226.0f, 149.22232f, 226.0f, 168.0f),
                    PathNode.CurveTo(226.0f, 186.77768f, 210.77768f, 202.0f, 192.0f, 202.0f),
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
        return _binoculars!!
    }

private var _binoculars: ImageVector? = null
