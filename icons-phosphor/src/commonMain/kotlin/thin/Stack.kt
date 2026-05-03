package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Stack: ImageVector
    get() {
        if (_stack != null) return _stack!!
        _stack = phosphorThinIcon(
            name = "Stack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(227.45f, 174.0f),
                    PathNode.CurveTo(227.9875f, 174.91724f, 228.13774f, 176.0107f, 227.86755f, 177.03893f),
                    PathNode.CurveTo(227.59737f, 178.06714f, 226.92897f, 178.9455f, 226.01f, 179.48f),
                    PathNode.LineTo(130.01f, 235.48f),
                    PathNode.CurveTo(128.7724f, 236.19453f, 127.247604f, 236.19453f, 126.01f, 235.48f),
                    PathNode.LineTo(30.01f, 179.48f),
                    PathNode.CurveTo(28.200989f, 178.33002f, 27.62008f, 175.95842f, 28.692827f, 174.10255f),
                    PathNode.CurveTo(29.765575f, 172.2467f, 32.1106f, 171.56639f, 34.01f, 172.56f),
                    PathNode.LineTo(128.01f, 227.39f),
                    PathNode.LineTo(222.01f, 172.56f),
                    PathNode.CurveTo(223.9115f, 171.46767f, 226.33795f, 172.10997f, 227.45f, 174.0f),
                    PathNode.Close,
                    PathNode.MoveTo(222.0f, 124.54f),
                    PathNode.LineTo(128.0f, 179.37f),
                    PathNode.LineTo(34.0f, 124.54f),
                    PathNode.CurveTo(32.100597f, 123.546394f, 29.755575f, 124.22671f, 28.682825f, 126.08256f),
                    PathNode.CurveTo(27.610079f, 127.938416f, 28.19099f, 130.31001f, 30.0f, 131.46f),
                    PathNode.LineTo(126.0f, 187.46f),
                    PathNode.CurveTo(127.2376f, 188.17453f, 128.76239f, 188.17453f, 130.0f, 187.46f),
                    PathNode.LineTo(226.0f, 131.46f),
                    PathNode.CurveTo(227.809f, 130.31001f, 228.38992f, 127.938416f, 227.31717f, 126.08256f),
                    PathNode.CurveTo(226.24443f, 124.22671f, 223.8994f, 123.546394f, 222.0f, 124.54f),
                    PathNode.Close,
                    PathNode.MoveTo(28.0f, 80.0f),
                    PathNode.CurveTo(28.001465f, 78.5724f, 28.763664f, 77.2538f, 30.0f, 76.54f),
                    PathNode.LineTo(126.0f, 20.54f),
                    PathNode.CurveTo(127.2376f, 19.825468f, 128.76239f, 19.825468f, 130.0f, 20.54f),
                    PathNode.LineTo(226.0f, 76.54f),
                    PathNode.CurveTo(227.23361f, 77.25559f, 227.9929f, 78.57387f, 227.9929f, 80.0f),
                    PathNode.CurveTo(227.9929f, 81.42613f, 227.23361f, 82.74441f, 226.0f, 83.46f),
                    PathNode.LineTo(130.0f, 139.46f),
                    PathNode.CurveTo(128.76239f, 140.17453f, 127.2376f, 140.17453f, 126.0f, 139.46f),
                    PathNode.LineTo(30.0f, 83.46f),
                    PathNode.CurveTo(28.763664f, 82.7462f, 28.001465f, 81.4276f, 28.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(39.94f, 80.0f),
                    PathNode.LineTo(128.0f, 131.37f),
                    PathNode.LineTo(216.06f, 80.0f),
                    PathNode.LineTo(128.0f, 28.63f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _stack!!
    }

private var _stack: ImageVector? = null
