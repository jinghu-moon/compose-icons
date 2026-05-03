package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Onigiri: ImageVector
    get() {
        if (_onigiri != null) return _onigiri!!
        _onigiri = phosphorFillIcon(
            name = "Onigiri",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(231.53f, 146.57f),
                    PathNode.LineTo(175.68f, 50.66f),
                    PathNode.LineTo(175.57f, 50.47f),
                    PathNode.CurveTo(165.35295f, 34.021435f, 147.36348f, 24.018183f, 128.0f, 24.018183f),
                    PathNode.CurveTo(108.63654f, 24.018183f, 90.64706f, 34.021435f, 80.43f, 50.47f),
                    PathNode.LineTo(80.32f, 50.66f),
                    PathNode.LineTo(24.47f, 146.57f),
                    PathNode.CurveTo(13.801318f, 163.84116f, 13.315042f, 185.53362f, 23.199066f, 203.2655f),
                    PathNode.CurveTo(33.08309f, 220.99738f, 51.78942f, 231.9916f, 72.09f, 232.0f),
                    PathNode.LineTo(183.91f, 232.0f),
                    PathNode.CurveTo(204.21057f, 231.9916f, 222.91692f, 220.99738f, 232.80093f, 203.2655f),
                    PathNode.CurveTo(242.68494f, 185.53362f, 242.19868f, 163.84116f, 231.53f, 146.57f),
                    PathNode.Close,
                    PathNode.MoveTo(218.85f, 195.45f),
                    PathNode.CurveTo(211.87561f, 208.2109f, 198.45209f, 216.10597f, 183.91f, 216.0f),
                    PathNode.LineTo(176.0f, 216.0f),
                    PathNode.LineTo(176.0f, 168.0f),
                    PathNode.CurveTo(176.0f, 159.16344f, 168.83656f, 152.0f, 160.0f, 152.0f),
                    PathNode.LineTo(96.0f, 152.0f),
                    PathNode.CurveTo(87.163445f, 152.0f, 80.0f, 159.16344f, 80.0f, 168.0f),
                    PathNode.LineTo(80.0f, 216.0f),
                    PathNode.LineTo(72.09f, 216.0f),
                    PathNode.CurveTo(57.570107f, 216.00421f, 44.18815f, 208.13971f, 37.12697f, 195.45242f),
                    PathNode.CurveTo(30.06579f, 182.76515f, 30.434385f, 167.2477f, 38.09f, 154.91f),
                    PathNode.CurveTo(38.130444f, 154.84547f, 38.16717f, 154.7787f, 38.2f, 154.71f),
                    PathNode.LineTo(94.05f, 58.81f),
                    PathNode.CurveTo(101.35952f, 47.114685f, 114.17835f, 40.00985f, 127.97f, 40.00985f),
                    PathNode.CurveTo(141.76164f, 40.00985f, 154.58047f, 47.114685f, 161.89f, 58.81f),
                    PathNode.LineTo(217.74f, 154.71f),
                    PathNode.CurveTo(217.77283f, 154.7787f, 217.80956f, 154.84547f, 217.85f, 154.91f),
                    PathNode.CurveTo(225.62392f, 167.20793f, 226.00813f, 182.78374f, 218.85f, 195.45f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _onigiri!!
    }

private var _onigiri: ImageVector? = null
