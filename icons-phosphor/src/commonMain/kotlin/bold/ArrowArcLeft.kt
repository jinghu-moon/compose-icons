package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowArcLeft: ImageVector
    get() {
        if (_arrowArcLeft != null) return _arrowArcLeft!!
        _arrowArcLeft = phosphorBoldIcon(
            name = "ArrowArcLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.0f, 184.0f),
                    PathNode.CurveTo(236.0f, 190.62741f, 230.62741f, 196.0f, 224.0f, 196.0f),
                    PathNode.CurveTo(217.37259f, 196.0f, 212.0f, 190.62741f, 212.0f, 184.0f),
                    PathNode.CurveTo(212.00246f, 150.02328f, 191.53648f, 119.39105f, 160.14622f, 106.3884f),
                    PathNode.CurveTo(128.75598f, 93.38574f, 92.62394f, 100.57361f, 68.6f, 124.6f),
                    PathNode.LineTo(53.11f, 140.0f),
                    PathNode.LineTo(88.0f, 140.0f),
                    PathNode.CurveTo(94.62742f, 140.0f, 100.0f, 145.37259f, 100.0f, 152.0f),
                    PathNode.CurveTo(100.0f, 158.62741f, 94.62742f, 164.0f, 88.0f, 164.0f),
                    PathNode.LineTo(24.0f, 164.0f),
                    PathNode.CurveTo(17.372583f, 164.0f, 12.0f, 158.62741f, 12.0f, 152.0f),
                    PathNode.LineTo(12.0f, 88.0f),
                    PathNode.CurveTo(12.0f, 81.37258f, 17.372583f, 76.0f, 24.0f, 76.0f),
                    PathNode.CurveTo(30.627417f, 76.0f, 36.0f, 81.37258f, 36.0f, 88.0f),
                    PathNode.LineTo(36.0f, 123.16f),
                    PathNode.LineTo(51.66f, 107.61f),
                    PathNode.CurveTo(82.55325f, 76.73901f, 128.99864f, 67.51294f, 169.34546f, 84.23255f),
                    PathNode.CurveTo(209.69228f, 100.95216f, 235.99796f, 140.32608f, 236.0f, 184.0f),
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
        return _arrowArcLeft!!
    }

private var _arrowArcLeft: ImageVector? = null
