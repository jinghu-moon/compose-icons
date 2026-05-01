package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowFatLineLeft: ImageVector
    get() {
        if (_arrowFatLineLeft != null) return _arrowFatLineLeft!!
        _arrowFatLineLeft = phosphorBoldIcon(
            name = "ArrowFatLineLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.0f, 68.0f),
                    PathNode.LineTo(132.0f, 68.0f),
                    PathNode.LineTo(132.0f, 32.0f),
                    PathNode.CurveTo(132.00381f, 27.14352f, 129.08008f, 22.763542f, 124.59348f, 20.904531f),
                    PathNode.CurveTo(120.10689f, 19.045519f, 114.94214f, 20.074038f, 111.51f, 23.51f),
                    PathNode.LineTo(15.51f, 119.51f),
                    PathNode.CurveTo(13.250546f, 121.76162f, 11.980537f, 124.82018f, 11.980537f, 128.01f),
                    PathNode.CurveTo(11.980537f, 131.19981f, 13.250546f, 134.25838f, 15.51f, 136.51f),
                    PathNode.LineTo(111.51f, 232.51f),
                    PathNode.CurveTo(114.94471f, 235.94856f, 120.11433f, 236.97581f, 124.602745f, 235.11168f),
                    PathNode.CurveTo(129.09116f, 233.24754f, 132.01193f, 228.86012f, 132.0f, 224.0f),
                    PathNode.LineTo(132.0f, 188.0f),
                    PathNode.LineTo(176.0f, 188.0f),
                    PathNode.CurveTo(182.62741f, 188.0f, 188.0f, 182.62741f, 188.0f, 176.0f),
                    PathNode.LineTo(188.0f, 80.0f),
                    PathNode.CurveTo(188.0f, 73.37258f, 182.62741f, 68.0f, 176.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 164.0f),
                    PathNode.LineTo(120.0f, 164.0f),
                    PathNode.CurveTo(113.37258f, 164.0f, 108.0f, 169.37259f, 108.0f, 176.0f),
                    PathNode.LineTo(108.0f, 195.0f),
                    PathNode.LineTo(41.0f, 128.0f),
                    PathNode.LineTo(108.0f, 61.0f),
                    PathNode.LineTo(108.0f, 80.0f),
                    PathNode.CurveTo(108.0f, 86.62742f, 113.37258f, 92.0f, 120.0f, 92.0f),
                    PathNode.LineTo(164.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 80.0f),
                    PathNode.LineTo(228.0f, 176.0f),
                    PathNode.CurveTo(228.0f, 182.62741f, 222.62741f, 188.0f, 216.0f, 188.0f),
                    PathNode.CurveTo(209.37259f, 188.0f, 204.0f, 182.62741f, 204.0f, 176.0f),
                    PathNode.LineTo(204.0f, 80.0f),
                    PathNode.CurveTo(204.0f, 73.37258f, 209.37259f, 68.0f, 216.0f, 68.0f),
                    PathNode.CurveTo(222.62741f, 68.0f, 228.0f, 73.37258f, 228.0f, 80.0f),
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
        return _arrowFatLineLeft!!
    }

private var _arrowFatLineLeft: ImageVector? = null
