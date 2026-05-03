package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Feather: ImageVector
    get() {
        if (_feather != null) return _feather!!
        _feather = phosphorThinIcon(
            name = "Feather",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.0f, 80.0f),
                    PathNode.CurveTo(235.99887f, 55.737f, 221.38493f, 33.862797f, 198.97043f, 24.573938f),
                    PathNode.CurveTo(176.55591f, 15.28508f, 150.75316f, 20.4101f, 133.59f, 37.56f),
                    PathNode.LineTo(63.52f, 106.83f),
                    PathNode.CurveTo(61.259533f, 109.07198f, 59.99172f, 112.12627f, 60.0f, 115.31f),
                    PathNode.LineTo(60.0f, 190.31f),
                    PathNode.LineTo(29.17f, 221.17f),
                    PathNode.CurveTo(27.607035f, 222.73297f, 27.607035f, 225.26703f, 29.17f, 226.83f),
                    PathNode.CurveTo(30.732965f, 228.39296f, 33.267033f, 228.39296f, 34.83f, 226.83f),
                    PathNode.LineTo(65.66f, 196.0f),
                    PathNode.LineTo(140.66f, 196.0f),
                    PathNode.CurveTo(143.84007f, 195.99985f, 146.89009f, 194.73741f, 149.14f, 192.49f),
                    PathNode.LineTo(149.14f, 192.49f),
                    PathNode.LineTo(218.0f, 122.83f),
                    PathNode.LineTo(218.0f, 122.83f),
                    PathNode.LineTo(218.4f, 122.43f),
                    PathNode.CurveTo(229.69745f, 111.204506f, 236.03491f, 95.92616f, 236.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(139.23f, 43.23f),
                    PathNode.CurveTo(159.44795f, 23.41973f, 191.79745f, 23.419464f, 212.01573f, 43.229404f),
                    PathNode.CurveTo(232.23401f, 63.03935f, 232.89369f, 95.38211f, 213.5f, 116.0f),
                    PathNode.LineTo(145.66f, 116.0f),
                    PathNode.LineTo(186.83f, 74.83f),
                    PathNode.CurveTo(188.39296f, 73.26704f, 188.39296f, 70.73296f, 186.83f, 69.17f),
                    PathNode.CurveTo(185.26703f, 67.60703f, 182.73297f, 67.60703f, 181.17f, 69.17f),
                    PathNode.LineTo(116.0f, 134.34f),
                    PathNode.LineTo(116.0f, 66.19f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 115.31f),
                    PathNode.CurveTo(68.00179f, 114.25717f, 68.418594f, 113.247505f, 69.16f, 112.5f),
                    PathNode.LineTo(108.0f, 74.1f),
                    PathNode.LineTo(108.0f, 142.34f),
                    PathNode.LineTo(68.0f, 182.34f),
                    PathNode.Close,
                    PathNode.MoveTo(143.51f, 186.83f),
                    PathNode.CurveTo(142.76166f, 187.57751f, 141.74773f, 187.9982f, 140.69f, 188.0f),
                    PathNode.LineTo(73.69f, 188.0f),
                    PathNode.LineTo(137.69f, 124.0f),
                    PathNode.LineTo(205.69f, 124.0f),
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
        return _feather!!
    }

private var _feather: ImageVector? = null
