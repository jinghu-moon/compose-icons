package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AirTrafficControl: ImageVector
    get() {
        if (_airTrafficControl != null) return _airTrafficControl!!
        _airTrafficControl = phosphorLightIcon(
            name = "AirTrafficControl",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(227.47f, 72.0f),
                    PathNode.CurveTo(224.85634f, 68.246414f, 220.5739f, 66.00625f, 216.0f, 66.0f),
                    PathNode.LineTo(134.0f, 66.0f),
                    PathNode.LineTo(134.0f, 30.0f),
                    PathNode.LineTo(152.0f, 30.0f),
                    PathNode.CurveTo(155.3137f, 30.0f, 158.0f, 27.31371f, 158.0f, 24.0f),
                    PathNode.CurveTo(158.0f, 20.68629f, 155.3137f, 18.0f, 152.0f, 18.0f),
                    PathNode.LineTo(104.0f, 18.0f),
                    PathNode.CurveTo(100.686295f, 18.0f, 98.0f, 20.68629f, 98.0f, 24.0f),
                    PathNode.CurveTo(98.0f, 27.31371f, 100.686295f, 30.0f, 104.0f, 30.0f),
                    PathNode.LineTo(122.0f, 30.0f),
                    PathNode.LineTo(122.0f, 66.0f),
                    PathNode.LineTo(40.0f, 66.0f),
                    PathNode.CurveTo(35.433624f, 65.99958f, 31.153994f, 68.22618f, 28.533478f, 71.96579f),
                    PathNode.CurveTo(25.912962f, 75.70541f, 25.280909f, 80.48803f, 26.84f, 84.78f),
                    PathNode.LineTo(53.03f, 156.78f),
                    PathNode.CurveTo(55.039516f, 162.31194f, 60.294384f, 165.99634f, 66.18f, 166.0f),
                    PathNode.LineTo(98.0f, 166.0f),
                    PathNode.LineTo(98.0f, 232.0f),
                    PathNode.CurveTo(98.0f, 235.3137f, 100.686295f, 238.0f, 104.0f, 238.0f),
                    PathNode.CurveTo(107.313705f, 238.0f, 110.0f, 235.3137f, 110.0f, 232.0f),
                    PathNode.LineTo(110.0f, 166.0f),
                    PathNode.LineTo(146.0f, 166.0f),
                    PathNode.LineTo(146.0f, 232.0f),
                    PathNode.CurveTo(146.0f, 235.3137f, 148.6863f, 238.0f, 152.0f, 238.0f),
                    PathNode.CurveTo(155.3137f, 238.0f, 158.0f, 235.3137f, 158.0f, 232.0f),
                    PathNode.LineTo(158.0f, 166.0f),
                    PathNode.LineTo(189.82f, 166.0f),
                    PathNode.CurveTo(195.71661f, 166.00897f, 200.98674f, 162.32228f, 203.0f, 156.78f),
                    PathNode.LineTo(229.19f, 84.78f),
                    PathNode.CurveTo(230.72949f, 80.49382f, 230.0879f, 75.726654f, 227.47f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(109.0f, 154.0f),
                    PathNode.LineTo(95.19f, 78.0f),
                    PathNode.LineTo(160.81f, 78.0f),
                    PathNode.LineTo(147.0f, 154.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.3f, 152.68f),
                    PathNode.LineTo(38.12f, 80.68f),
                    PathNode.CurveTo(37.896927f, 80.067345f, 37.986492f, 79.384415f, 38.36f, 78.85f),
                    PathNode.CurveTo(38.728043f, 78.307884f, 39.344868f, 77.9882f, 40.0f, 78.0f),
                    PathNode.LineTo(83.0f, 78.0f),
                    PathNode.LineTo(96.82f, 154.0f),
                    PathNode.LineTo(66.18f, 154.0f),
                    PathNode.CurveTo(65.33794f, 153.99965f, 64.5863f, 153.4719f, 64.3f, 152.68f),
                    PathNode.Close,
                    PathNode.MoveTo(217.88f, 80.68f),
                    PathNode.LineTo(191.7f, 152.68f),
                    PathNode.CurveTo(191.4137f, 153.4719f, 190.66206f, 153.99965f, 189.82f, 154.0f),
                    PathNode.LineTo(159.19f, 154.0f),
                    PathNode.LineTo(173.0f, 78.0f),
                    PathNode.LineTo(216.0f, 78.0f),
                    PathNode.CurveTo(216.65514f, 77.9882f, 217.27196f, 78.307884f, 217.64f, 78.85f),
                    PathNode.CurveTo(218.0135f, 79.384415f, 218.10307f, 80.067345f, 217.88f, 80.68f),
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
        return _airTrafficControl!!
    }

private var _airTrafficControl: ImageVector? = null
