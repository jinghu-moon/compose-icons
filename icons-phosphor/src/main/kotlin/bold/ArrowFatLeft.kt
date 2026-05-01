package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowFatLeft: ImageVector
    get() {
        if (_arrowFatLeft != null) return _arrowFatLeft!!
        _arrowFatLeft = phosphorBoldIcon(
            name = "ArrowFatLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 68.0f),
                    PathNode.LineTo(132.0f, 68.0f),
                    PathNode.LineTo(132.0f, 32.0f),
                    PathNode.CurveTo(131.99977f, 27.14534f, 129.07454f, 22.769068f, 124.58886f, 20.912622f),
                    PathNode.CurveTo(120.10317f, 19.056175f, 114.94085f, 20.08533f, 111.51f, 23.52f),
                    PathNode.LineTo(15.51f, 119.52f),
                    PathNode.CurveTo(13.250546f, 121.77162f, 11.980537f, 124.830185f, 11.980537f, 128.02f),
                    PathNode.CurveTo(11.980537f, 131.20982f, 13.250546f, 134.26837f, 15.51f, 136.52f),
                    PathNode.LineTo(111.51f, 232.52f),
                    PathNode.CurveTo(114.94599f, 235.95987f, 120.11805f, 236.98651f, 124.60738f, 235.11978f),
                    PathNode.CurveTo(129.09671f, 233.25307f, 132.016f, 228.86194f, 132.0f, 224.0f),
                    PathNode.LineTo(132.0f, 188.0f),
                    PathNode.LineTo(208.0f, 188.0f),
                    PathNode.CurveTo(219.0457f, 188.0f, 228.0f, 179.0457f, 228.0f, 168.0f),
                    PathNode.LineTo(228.0f, 88.0f),
                    PathNode.CurveTo(228.0f, 76.95431f, 219.0457f, 68.0f, 208.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 164.0f),
                    PathNode.LineTo(120.0f, 164.0f),
                    PathNode.CurveTo(113.37258f, 164.0f, 108.0f, 169.37259f, 108.0f, 176.0f),
                    PathNode.LineTo(108.0f, 195.0f),
                    PathNode.LineTo(41.0f, 128.0f),
                    PathNode.LineTo(108.0f, 61.0f),
                    PathNode.LineTo(108.0f, 80.0f),
                    PathNode.CurveTo(108.0f, 86.62742f, 113.37258f, 92.0f, 120.0f, 92.0f),
                    PathNode.LineTo(204.0f, 92.0f),
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
        return _arrowFatLeft!!
    }

private var _arrowFatLeft: ImageVector? = null
