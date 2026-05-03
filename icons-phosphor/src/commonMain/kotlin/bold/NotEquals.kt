package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NotEquals: ImageVector
    get() {
        if (_notEquals != null) return _notEquals!!
        _notEquals = phosphorBoldIcon(
            name = "NotEquals",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 160.0f),
                    PathNode.CurveTo(228.0f, 166.62741f, 222.62741f, 172.0f, 216.0f, 172.0f),
                    PathNode.LineTo(104.22f, 172.0f),
                    PathNode.LineTo(56.88f, 224.07f),
                    PathNode.CurveTo(52.402496f, 228.87978f, 44.889294f, 229.19368f, 40.026184f, 224.77417f),
                    PathNode.CurveTo(35.16307f, 220.35464f, 34.75911f, 212.84575f, 39.12f, 207.93f),
                    PathNode.LineTo(71.78f, 172.0f),
                    PathNode.LineTo(40.0f, 172.0f),
                    PathNode.CurveTo(33.37258f, 172.0f, 28.0f, 166.62741f, 28.0f, 160.0f),
                    PathNode.CurveTo(28.0f, 153.37259f, 33.37258f, 148.0f, 40.0f, 148.0f),
                    PathNode.LineTo(93.6f, 148.0f),
                    PathNode.LineTo(130.0f, 108.0f),
                    PathNode.LineTo(40.0f, 108.0f),
                    PathNode.CurveTo(33.37258f, 108.0f, 28.0f, 102.62742f, 28.0f, 96.0f),
                    PathNode.CurveTo(28.0f, 89.37258f, 33.37258f, 84.0f, 40.0f, 84.0f),
                    PathNode.LineTo(151.78f, 84.0f),
                    PathNode.LineTo(199.12f, 31.93f),
                    PathNode.CurveTo(203.5975f, 27.120228f, 211.1107f, 26.80632f, 215.9738f, 31.225838f),
                    PathNode.CurveTo(220.83693f, 35.64535f, 221.24089f, 43.15425f, 216.88f, 48.07f),
                    PathNode.LineTo(184.22f, 84.0f),
                    PathNode.LineTo(216.0f, 84.0f),
                    PathNode.CurveTo(222.62741f, 84.0f, 228.0f, 89.37258f, 228.0f, 96.0f),
                    PathNode.CurveTo(228.0f, 102.62742f, 222.62741f, 108.0f, 216.0f, 108.0f),
                    PathNode.LineTo(162.4f, 108.0f),
                    PathNode.LineTo(126.0f, 148.0f),
                    PathNode.LineTo(216.0f, 148.0f),
                    PathNode.CurveTo(222.62741f, 148.0f, 228.0f, 153.37259f, 228.0f, 160.0f),
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
        return _notEquals!!
    }

private var _notEquals: ImageVector? = null
