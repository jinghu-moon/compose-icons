package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowFatLinesDown: ImageVector
    get() {
        if (_arrowFatLinesDown != null) return _arrowFatLinesDown!!
        _arrowFatLinesDown = phosphorBoldIcon(
            name = "ArrowFatLinesDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(235.09f, 131.41f),
                    PathNode.CurveTo(233.23283f, 126.92388f, 228.85533f, 123.99898f, 224.0f, 124.0f),
                    PathNode.LineTo(188.0f, 124.0f),
                    PathNode.LineTo(188.0f, 120.0f),
                    PathNode.CurveTo(188.0f, 113.37258f, 182.62741f, 108.0f, 176.0f, 108.0f),
                    PathNode.LineTo(80.0f, 108.0f),
                    PathNode.CurveTo(73.37258f, 108.0f, 68.0f, 113.37258f, 68.0f, 120.0f),
                    PathNode.LineTo(68.0f, 124.0f),
                    PathNode.LineTo(32.0f, 124.0f),
                    PathNode.CurveTo(27.14352f, 123.99618f, 22.763542f, 126.91993f, 20.904531f, 131.40652f),
                    PathNode.CurveTo(19.045519f, 135.89313f, 20.074038f, 141.05786f, 23.51f, 144.49f),
                    PathNode.LineTo(119.51f, 240.49f),
                    PathNode.CurveTo(121.76162f, 242.74945f, 124.82018f, 244.01947f, 128.01f, 244.01947f),
                    PathNode.CurveTo(131.19981f, 244.01947f, 134.25838f, 242.74945f, 136.51f, 240.49f),
                    PathNode.LineTo(232.51f, 144.49f),
                    PathNode.CurveTo(235.93567f, 141.05276f, 236.9539f, 135.8906f, 235.09f, 131.41f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 215.0f),
                    PathNode.LineTo(61.0f, 148.0f),
                    PathNode.LineTo(80.0f, 148.0f),
                    PathNode.CurveTo(86.62742f, 148.0f, 92.0f, 142.62741f, 92.0f, 136.0f),
                    PathNode.LineTo(92.0f, 132.0f),
                    PathNode.LineTo(164.0f, 132.0f),
                    PathNode.LineTo(164.0f, 136.0f),
                    PathNode.CurveTo(164.0f, 142.62741f, 169.37259f, 148.0f, 176.0f, 148.0f),
                    PathNode.LineTo(195.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 40.0f),
                    PathNode.CurveTo(68.0f, 33.37258f, 73.37258f, 28.0f, 80.0f, 28.0f),
                    PathNode.LineTo(176.0f, 28.0f),
                    PathNode.CurveTo(182.62741f, 28.0f, 188.0f, 33.37258f, 188.0f, 40.0f),
                    PathNode.CurveTo(188.0f, 46.62742f, 182.62741f, 52.0f, 176.0f, 52.0f),
                    PathNode.LineTo(80.0f, 52.0f),
                    PathNode.CurveTo(73.37258f, 52.0f, 68.0f, 46.62742f, 68.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 80.0f),
                    PathNode.CurveTo(68.0f, 73.37258f, 73.37258f, 68.0f, 80.0f, 68.0f),
                    PathNode.LineTo(176.0f, 68.0f),
                    PathNode.CurveTo(182.62741f, 68.0f, 188.0f, 73.37258f, 188.0f, 80.0f),
                    PathNode.CurveTo(188.0f, 86.62742f, 182.62741f, 92.0f, 176.0f, 92.0f),
                    PathNode.LineTo(80.0f, 92.0f),
                    PathNode.CurveTo(73.37258f, 92.0f, 68.0f, 86.62742f, 68.0f, 80.0f),
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
        return _arrowFatLinesDown!!
    }

private var _arrowFatLinesDown: ImageVector? = null
