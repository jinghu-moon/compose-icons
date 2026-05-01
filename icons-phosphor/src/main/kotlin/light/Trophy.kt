package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Trophy: ImageVector
    get() {
        if (_trophy != null) return _trophy!!
        _trophy = phosphorLightIcon(
            name = "Trophy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 66.0f),
                    PathNode.LineTo(206.0f, 66.0f),
                    PathNode.LineTo(206.0f, 48.0f),
                    PathNode.CurveTo(206.0f, 44.68629f, 203.3137f, 42.0f, 200.0f, 42.0f),
                    PathNode.LineTo(56.0f, 42.0f),
                    PathNode.CurveTo(52.68629f, 42.0f, 50.0f, 44.68629f, 50.0f, 48.0f),
                    PathNode.LineTo(50.0f, 66.0f),
                    PathNode.LineTo(24.0f, 66.0f),
                    PathNode.CurveTo(16.268013f, 66.0f, 10.0f, 72.26801f, 10.0f, 80.0f),
                    PathNode.LineTo(10.0f, 96.0f),
                    PathNode.CurveTo(10.0f, 116.986824f, 27.01318f, 134.0f, 48.0f, 134.0f),
                    PathNode.LineTo(53.14f, 134.0f),
                    PathNode.CurveTo(62.287132f, 165.08113f, 89.69576f, 187.27153f, 122.0f, 189.75f),
                    PathNode.LineTo(122.0f, 218.0f),
                    PathNode.LineTo(96.0f, 218.0f),
                    PathNode.CurveTo(92.686295f, 218.0f, 90.0f, 220.6863f, 90.0f, 224.0f),
                    PathNode.CurveTo(90.0f, 227.3137f, 92.686295f, 230.0f, 96.0f, 230.0f),
                    PathNode.LineTo(160.0f, 230.0f),
                    PathNode.CurveTo(163.3137f, 230.0f, 166.0f, 227.3137f, 166.0f, 224.0f),
                    PathNode.CurveTo(166.0f, 220.6863f, 163.3137f, 218.0f, 160.0f, 218.0f),
                    PathNode.LineTo(134.0f, 218.0f),
                    PathNode.LineTo(134.0f, 189.75f),
                    PathNode.CurveTo(166.44f, 187.23f, 193.43f, 164.45f, 202.62f, 134.0f),
                    PathNode.LineTo(208.0f, 134.0f),
                    PathNode.CurveTo(228.98682f, 134.0f, 246.0f, 116.986824f, 246.0f, 96.0f),
                    PathNode.LineTo(246.0f, 80.0f),
                    PathNode.CurveTo(246.0f, 72.26801f, 239.73198f, 66.0f, 232.0f, 66.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 122.0f),
                    PathNode.CurveTo(33.6406f, 122.0f, 22.0f, 110.359406f, 22.0f, 96.0f),
                    PathNode.LineTo(22.0f, 80.0f),
                    PathNode.CurveTo(22.0f, 78.89543f, 22.89543f, 78.0f, 24.0f, 78.0f),
                    PathNode.LineTo(50.0f, 78.0f),
                    PathNode.LineTo(50.0f, 112.0f),
                    PathNode.CurveTo(50.00973f, 115.34357f, 50.226814f, 118.68331f, 50.65f, 122.0f),
                    PathNode.Close,
                    PathNode.MoveTo(194.0f, 111.1f),
                    PathNode.CurveTo(194.0f, 147.72f, 164.62f, 177.73f, 128.5f, 178.0f),
                    PathNode.CurveTo(110.90924f, 178.13327f, 93.99315f, 171.23859f, 81.50739f, 158.84671f),
                    PathNode.CurveTo(69.02164f, 146.45485f, 61.999496f, 129.59126f, 62.0f, 112.0f),
                    PathNode.LineTo(62.0f, 54.0f),
                    PathNode.LineTo(194.0f, 54.0f),
                    PathNode.Close,
                    PathNode.MoveTo(234.0f, 96.0f),
                    PathNode.CurveTo(234.0f, 110.359406f, 222.3594f, 122.0f, 208.0f, 122.0f),
                    PathNode.LineTo(205.23f, 122.0f),
                    PathNode.CurveTo(205.7397f, 118.38898f, 205.997f, 114.74681f, 206.0f, 111.1f),
                    PathNode.LineTo(206.0f, 78.0f),
                    PathNode.LineTo(232.0f, 78.0f),
                    PathNode.CurveTo(233.10457f, 78.0f, 234.0f, 78.89543f, 234.0f, 80.0f),
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
        return _trophy!!
    }

private var _trophy: ImageVector? = null
