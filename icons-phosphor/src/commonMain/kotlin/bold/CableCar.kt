package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CableCar: ImageVector
    get() {
        if (_cableCar != null) return _cableCar!!
        _cableCar = phosphorBoldIcon(
            name = "CableCar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(251.81f, 29.89f),
                    PathNode.CurveTo(250.64317f, 23.36848f, 244.4121f, 19.026426f, 237.89f, 20.19f),
                    PathNode.LineTo(13.89f, 60.19f),
                    PathNode.CurveTo(7.777902f, 61.290737f, 3.515515f, 66.8731f, 4.063724f, 73.05928f),
                    PathNode.CurveTo(4.611932f, 79.24546f, 9.789583f, 83.991264f, 16.0f, 84.0f),
                    PathNode.CurveTo(16.710955f, 84.000824f, 17.420523f, 83.93723f, 18.12f, 83.81f),
                    PathNode.LineTo(116.0f, 66.33f),
                    PathNode.LineTo(116.0f, 92.0f),
                    PathNode.LineTo(64.0f, 92.0f),
                    PathNode.CurveTo(44.11775f, 92.0f, 28.0f, 108.11775f, 28.0f, 128.0f),
                    PathNode.LineTo(28.0f, 192.0f),
                    PathNode.CurveTo(28.0f, 211.88223f, 44.11775f, 228.0f, 64.0f, 228.0f),
                    PathNode.LineTo(192.0f, 228.0f),
                    PathNode.CurveTo(211.88223f, 228.0f, 228.0f, 211.88223f, 228.0f, 192.0f),
                    PathNode.LineTo(228.0f, 128.0f),
                    PathNode.CurveTo(228.0f, 108.11775f, 211.88223f, 92.0f, 192.0f, 92.0f),
                    PathNode.LineTo(140.0f, 92.0f),
                    PathNode.LineTo(140.0f, 62.05f),
                    PathNode.LineTo(242.11f, 43.81f),
                    PathNode.CurveTo(248.63152f, 42.643173f, 252.97357f, 36.412094f, 251.81f, 29.89f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 156.0f),
                    PathNode.LineTo(108.0f, 116.0f),
                    PathNode.LineTo(148.0f, 116.0f),
                    PathNode.LineTo(148.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 116.0f),
                    PathNode.LineTo(84.0f, 116.0f),
                    PathNode.LineTo(84.0f, 156.0f),
                    PathNode.LineTo(52.0f, 156.0f),
                    PathNode.LineTo(52.0f, 128.0f),
                    PathNode.CurveTo(52.0f, 121.37258f, 57.37258f, 116.0f, 64.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 204.0f),
                    PathNode.LineTo(64.0f, 204.0f),
                    PathNode.CurveTo(57.37258f, 204.0f, 52.0f, 198.62741f, 52.0f, 192.0f),
                    PathNode.LineTo(52.0f, 180.0f),
                    PathNode.LineTo(204.0f, 180.0f),
                    PathNode.LineTo(204.0f, 192.0f),
                    PathNode.CurveTo(204.0f, 198.62741f, 198.62741f, 204.0f, 192.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 128.0f),
                    PathNode.LineTo(204.0f, 156.0f),
                    PathNode.LineTo(172.0f, 156.0f),
                    PathNode.LineTo(172.0f, 116.0f),
                    PathNode.LineTo(192.0f, 116.0f),
                    PathNode.CurveTo(198.62741f, 116.0f, 204.0f, 121.37258f, 204.0f, 128.0f),
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
        return _cableCar!!
    }

private var _cableCar: ImageVector? = null
