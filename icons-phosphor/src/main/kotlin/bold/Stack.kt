package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Stack: ImageVector
    get() {
        if (_stack != null) return _stack!!
        _stack = phosphorBoldIcon(
            name = "Stack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(234.36f, 170.0f),
                    PathNode.CurveTo(237.66399f, 175.72609f, 235.71443f, 183.04588f, 230.0f, 186.37f),
                    PathNode.LineTo(134.0f, 242.37f),
                    PathNode.CurveTo(130.26186f, 244.55229f, 125.638145f, 244.55229f, 121.9f, 242.37f),
                    PathNode.LineTo(25.9f, 186.37f),
                    PathNode.CurveTo(20.172808f, 183.03143f, 18.236439f, 175.68219f, 21.575f, 169.955f),
                    PathNode.CurveTo(24.91356f, 164.22781f, 32.262806f, 162.29144f, 37.99f, 165.63f),
                    PathNode.LineTo(127.99f, 218.11f),
                    PathNode.LineTo(218.0f, 165.63f),
                    PathNode.CurveTo(223.72647f, 162.33447f, 231.0396f, 164.28793f, 234.36f, 170.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 117.63f),
                    PathNode.LineTo(128.0f, 170.11f),
                    PathNode.LineTo(38.05f, 117.63f),
                    PathNode.CurveTo(32.34921f, 114.56919f, 25.248243f, 116.57933f, 21.997671f, 122.174095f),
                    PathNode.CurveTo(18.747099f, 127.76885f, 20.517582f, 134.93333f, 26.0f, 138.37f),
                    PathNode.LineTo(122.0f, 194.37f),
                    PathNode.CurveTo(125.738144f, 196.55229f, 130.36186f, 196.55229f, 134.1f, 194.37f),
                    PathNode.LineTo(230.1f, 138.37f),
                    PathNode.CurveTo(235.8272f, 135.02867f, 237.76132f, 127.67719f, 234.42f, 121.95f),
                    PathNode.CurveTo(231.07867f, 116.22281f, 223.72719f, 114.28868f, 218.0f, 117.63f),
                    PathNode.Close,
                    PathNode.MoveTo(20.0f, 80.0f),
                    PathNode.CurveTo(20.007957f, 75.72079f, 22.294079f, 71.76961f, 26.0f, 69.63f),
                    PathNode.LineTo(122.0f, 13.63f),
                    PathNode.CurveTo(125.74153f, 11.460258f, 130.35847f, 11.460258f, 134.1f, 13.63f),
                    PathNode.LineTo(230.1f, 69.63f),
                    PathNode.CurveTo(233.79112f, 71.77934f, 236.06154f, 75.7287f, 236.06154f, 80.0f),
                    PathNode.CurveTo(236.06154f, 84.2713f, 233.79112f, 88.22066f, 230.1f, 90.37f),
                    PathNode.LineTo(134.1f, 146.37f),
                    PathNode.CurveTo(130.36186f, 148.55229f, 125.738144f, 148.55229f, 122.0f, 146.37f),
                    PathNode.LineTo(26.0f, 90.37f),
                    PathNode.CurveTo(22.294079f, 88.23039f, 20.007957f, 84.27921f, 20.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(55.82f, 80.0f),
                    PathNode.LineTo(128.0f, 122.11f),
                    PathNode.LineTo(200.18f, 80.0f),
                    PathNode.LineTo(128.0f, 37.89f),
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
        return _stack!!
    }

private var _stack: ImageVector? = null
