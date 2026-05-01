package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowFatDown: ImageVector
    get() {
        if (_arrowFatDown != null) return _arrowFatDown!!
        _arrowFatDown = phosphorBoldIcon(
            name = "ArrowFatDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(235.09f, 131.41f),
                    PathNode.CurveTo(233.23283f, 126.92388f, 228.85533f, 123.99898f, 224.0f, 124.0f),
                    PathNode.LineTo(188.0f, 124.0f),
                    PathNode.LineTo(188.0f, 48.0f),
                    PathNode.CurveTo(188.0f, 36.954304f, 179.0457f, 28.0f, 168.0f, 28.0f),
                    PathNode.LineTo(88.0f, 28.0f),
                    PathNode.CurveTo(76.95431f, 28.0f, 68.0f, 36.954304f, 68.0f, 48.0f),
                    PathNode.LineTo(68.0f, 124.0f),
                    PathNode.LineTo(32.0f, 124.0f),
                    PathNode.CurveTo(27.14534f, 124.00023f, 22.769068f, 126.92546f, 20.912622f, 131.41115f),
                    PathNode.CurveTo(19.056175f, 135.89682f, 20.08533f, 141.05914f, 23.52f, 144.49f),
                    PathNode.LineTo(119.52f, 240.49f),
                    PathNode.CurveTo(121.77162f, 242.74945f, 124.830185f, 244.01947f, 128.02f, 244.01947f),
                    PathNode.CurveTo(131.20982f, 244.01947f, 134.26837f, 242.74945f, 136.52f, 240.49f),
                    PathNode.LineTo(232.52f, 144.49f),
                    PathNode.CurveTo(235.94221f, 141.0505f, 236.95644f, 135.88863f, 235.09f, 131.41f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 215.0f),
                    PathNode.LineTo(61.0f, 148.0f),
                    PathNode.LineTo(80.0f, 148.0f),
                    PathNode.CurveTo(86.62742f, 148.0f, 92.0f, 142.62741f, 92.0f, 136.0f),
                    PathNode.LineTo(92.0f, 52.0f),
                    PathNode.LineTo(164.0f, 52.0f),
                    PathNode.LineTo(164.0f, 136.0f),
                    PathNode.CurveTo(164.0f, 142.62741f, 169.37259f, 148.0f, 176.0f, 148.0f),
                    PathNode.LineTo(195.0f, 148.0f),
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
        return _arrowFatDown!!
    }

private var _arrowFatDown: ImageVector? = null
