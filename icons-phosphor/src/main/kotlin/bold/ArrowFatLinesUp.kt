package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowFatLinesUp: ImageVector
    get() {
        if (_arrowFatLinesUp != null) return _arrowFatLinesUp!!
        _arrowFatLinesUp = phosphorBoldIcon(
            name = "ArrowFatLinesUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.49f, 111.51f),
                    PathNode.LineTo(136.49f, 15.51f),
                    PathNode.CurveTo(134.23837f, 13.250546f, 131.17982f, 11.980537f, 127.99f, 11.980537f),
                    PathNode.CurveTo(124.80018f, 11.980537f, 121.74162f, 13.250546f, 119.49f, 15.51f),
                    PathNode.LineTo(23.49f, 111.51f),
                    PathNode.CurveTo(20.05144f, 114.94471f, 19.024178f, 120.11433f, 20.888327f, 124.602745f),
                    PathNode.CurveTo(22.752478f, 129.09116f, 27.139877f, 132.01193f, 32.0f, 132.0f),
                    PathNode.LineTo(68.0f, 132.0f),
                    PathNode.LineTo(68.0f, 136.0f),
                    PathNode.CurveTo(68.0f, 142.62741f, 73.37258f, 148.0f, 80.0f, 148.0f),
                    PathNode.LineTo(176.0f, 148.0f),
                    PathNode.CurveTo(182.62741f, 148.0f, 188.0f, 142.62741f, 188.0f, 136.0f),
                    PathNode.LineTo(188.0f, 132.0f),
                    PathNode.LineTo(224.0f, 132.0f),
                    PathNode.CurveTo(228.85648f, 132.00381f, 233.23645f, 129.08008f, 235.09547f, 124.59348f),
                    PathNode.CurveTo(236.95448f, 120.10689f, 235.92596f, 114.94214f, 232.49f, 111.51f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 108.0f),
                    PathNode.CurveTo(169.37259f, 108.0f, 164.0f, 113.37258f, 164.0f, 120.0f),
                    PathNode.LineTo(164.0f, 124.0f),
                    PathNode.LineTo(92.0f, 124.0f),
                    PathNode.LineTo(92.0f, 120.0f),
                    PathNode.CurveTo(92.0f, 113.37258f, 86.62742f, 108.0f, 80.0f, 108.0f),
                    PathNode.LineTo(61.0f, 108.0f),
                    PathNode.LineTo(128.0f, 41.0f),
                    PathNode.LineTo(195.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 216.0f),
                    PathNode.CurveTo(188.0f, 222.62741f, 182.62741f, 228.0f, 176.0f, 228.0f),
                    PathNode.LineTo(80.0f, 228.0f),
                    PathNode.CurveTo(73.37258f, 228.0f, 68.0f, 222.62741f, 68.0f, 216.0f),
                    PathNode.CurveTo(68.0f, 209.37259f, 73.37258f, 204.0f, 80.0f, 204.0f),
                    PathNode.LineTo(176.0f, 204.0f),
                    PathNode.CurveTo(182.62741f, 204.0f, 188.0f, 209.37259f, 188.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 176.0f),
                    PathNode.CurveTo(188.0f, 182.62741f, 182.62741f, 188.0f, 176.0f, 188.0f),
                    PathNode.LineTo(80.0f, 188.0f),
                    PathNode.CurveTo(73.37258f, 188.0f, 68.0f, 182.62741f, 68.0f, 176.0f),
                    PathNode.CurveTo(68.0f, 169.37259f, 73.37258f, 164.0f, 80.0f, 164.0f),
                    PathNode.LineTo(176.0f, 164.0f),
                    PathNode.CurveTo(182.62741f, 164.0f, 188.0f, 169.37259f, 188.0f, 176.0f),
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
        return _arrowFatLinesUp!!
    }

private var _arrowFatLinesUp: ImageVector? = null
