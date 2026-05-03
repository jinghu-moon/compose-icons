package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Lamp: ImageVector
    get() {
        if (_lamp != null) return _lamp!!
        _lamp = phosphorBoldIcon(
            name = "Lamp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(251.0f, 147.27f),
                    PathNode.LineTo(203.0f, 35.27f),
                    PathNode.CurveTo(201.11241f, 30.868872f, 196.78882f, 28.011366f, 192.0f, 28.0f),
                    PathNode.LineTo(64.0f, 28.0f),
                    PathNode.CurveTo(59.21118f, 28.011366f, 54.887585f, 30.868872f, 53.0f, 35.27f),
                    PathNode.LineTo(5.0f, 147.27f),
                    PathNode.CurveTo(3.411792f, 150.97304f, 3.788019f, 155.22597f, 6.001639f, 158.59268f),
                    PathNode.CurveTo(8.215258f, 161.9594f, 11.970759f, 163.99045f, 16.0f, 164.0f),
                    PathNode.LineTo(116.0f, 164.0f),
                    PathNode.LineTo(116.0f, 204.0f),
                    PathNode.LineTo(96.0f, 204.0f),
                    PathNode.CurveTo(89.37258f, 204.0f, 84.0f, 209.37259f, 84.0f, 216.0f),
                    PathNode.CurveTo(84.0f, 222.62741f, 89.37258f, 228.0f, 96.0f, 228.0f),
                    PathNode.LineTo(160.0f, 228.0f),
                    PathNode.CurveTo(166.62741f, 228.0f, 172.0f, 222.62741f, 172.0f, 216.0f),
                    PathNode.CurveTo(172.0f, 209.37259f, 166.62741f, 204.0f, 160.0f, 204.0f),
                    PathNode.LineTo(140.0f, 204.0f),
                    PathNode.LineTo(140.0f, 164.0f),
                    PathNode.LineTo(188.0f, 164.0f),
                    PathNode.LineTo(188.0f, 192.0f),
                    PathNode.CurveTo(188.0f, 198.62741f, 193.37259f, 204.0f, 200.0f, 204.0f),
                    PathNode.CurveTo(206.62741f, 204.0f, 212.0f, 198.62741f, 212.0f, 192.0f),
                    PathNode.LineTo(212.0f, 164.0f),
                    PathNode.LineTo(240.0f, 164.0f),
                    PathNode.CurveTo(244.02924f, 163.99045f, 247.78476f, 161.9594f, 249.99837f, 158.59268f),
                    PathNode.CurveTo(252.21198f, 155.22597f, 252.58821f, 150.97304f, 251.0f, 147.27f),
                    PathNode.Close,
                    PathNode.MoveTo(34.2f, 140.0f),
                    PathNode.LineTo(71.91f, 52.0f),
                    PathNode.LineTo(184.09f, 52.0f),
                    PathNode.LineTo(221.8f, 140.0f),
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
        return _lamp!!
    }

private var _lamp: ImageVector? = null
