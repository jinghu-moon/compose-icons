package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SecurityCamera: ImageVector
    get() {
        if (_securityCamera != null) return _securityCamera!!
        _securityCamera = phosphorBoldIcon(
            name = "SecurityCamera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(244.0f, 132.0f),
                    PathNode.CurveTo(237.37259f, 132.0f, 232.0f, 137.37259f, 232.0f, 144.0f),
                    PathNode.LineTo(232.0f, 156.0f),
                    PathNode.LineTo(197.0f, 156.0f),
                    PathNode.LineTo(182.65f, 141.66f),
                    PathNode.LineTo(230.17f, 94.14f),
                    PathNode.CurveTo(237.97765f, 86.33f, 237.97765f, 73.67f, 230.17f, 65.86f),
                    PathNode.LineTo(174.17f, 9.86f),
                    PathNode.CurveTo(170.41783f, 6.098332f, 165.32309f, 3.984249f, 160.01f, 3.984249f),
                    PathNode.CurveTo(154.69691f, 3.984249f, 149.60217f, 6.098332f, 145.85f, 9.86f),
                    PathNode.LineTo(6.42f, 150.47f),
                    PathNode.CurveTo(0.143825f, 156.76746f, -1.724932f, 166.22356f, 1.683927f, 174.43501f),
                    PathNode.CurveTo(5.092785f, 182.64645f, 13.10909f, 187.99893f, 22.0f, 188.0f),
                    PathNode.LineTo(55.7f, 188.0f),
                    PathNode.LineTo(81.84f, 214.14f),
                    PathNode.CurveTo(85.59096f, 217.89249f, 90.67926f, 220.00073f, 95.985f, 220.00073f),
                    PathNode.CurveTo(101.29073f, 220.00073f, 106.37904f, 217.89249f, 110.13f, 214.14f),
                    PathNode.LineTo(165.64f, 158.63f),
                    PathNode.LineTo(181.16f, 174.14f),
                    PathNode.CurveTo(184.9035f, 177.90659f, 189.99956f, 180.01704f, 195.31f, 180.0f),
                    PathNode.LineTo(232.0f, 180.0f),
                    PathNode.LineTo(232.0f, 192.0f),
                    PathNode.CurveTo(232.0f, 198.62741f, 237.37259f, 204.0f, 244.0f, 204.0f),
                    PathNode.CurveTo(250.62741f, 204.0f, 256.0f, 198.62741f, 256.0f, 192.0f),
                    PathNode.LineTo(256.0f, 144.0f),
                    PathNode.CurveTo(256.0f, 137.37259f, 250.62741f, 132.0f, 244.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 29.67f),
                    PathNode.LineTo(175.0f, 44.67f),
                    PathNode.LineTo(55.71f, 164.0f),
                    PathNode.LineTo(26.81f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 194.34f),
                    PathNode.LineTo(77.65f, 176.0f),
                    PathNode.LineTo(192.0f, 61.66f),
                    PathNode.LineTo(210.34f, 80.0f),
                    PathNode.LineTo(157.17f, 133.17f),
                    PathNode.LineTo(157.17f, 133.17f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _securityCamera!!
    }

private var _securityCamera: ImageVector? = null
