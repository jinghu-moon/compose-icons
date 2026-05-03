package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChartLineUp: ImageVector
    get() {
        if (_chartLineUp != null) return _chartLineUp!!
        _chartLineUp = phosphorBoldIcon(
            name = "ChartLineUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.0f, 208.0f),
                    PathNode.CurveTo(236.0f, 214.62741f, 230.62741f, 220.0f, 224.0f, 220.0f),
                    PathNode.LineTo(32.0f, 220.0f),
                    PathNode.CurveTo(25.372583f, 220.0f, 20.0f, 214.62741f, 20.0f, 208.0f),
                    PathNode.LineTo(20.0f, 48.0f),
                    PathNode.CurveTo(20.0f, 41.37258f, 25.372583f, 36.0f, 32.0f, 36.0f),
                    PathNode.CurveTo(38.62742f, 36.0f, 44.0f, 41.37258f, 44.0f, 48.0f),
                    PathNode.LineTo(44.0f, 147.0f),
                    PathNode.LineTo(87.51f, 103.48f),
                    PathNode.CurveTo(89.76162f, 101.22054f, 92.82018f, 99.95054f, 96.01f, 99.95054f),
                    PathNode.CurveTo(99.19982f, 99.95054f, 102.25838f, 101.22054f, 104.51f, 103.48f),
                    PathNode.LineTo(128.0f, 127.0f),
                    PathNode.LineTo(171.0f, 84.0f),
                    PathNode.LineTo(160.0f, 84.0f),
                    PathNode.CurveTo(153.37259f, 84.0f, 148.0f, 78.62742f, 148.0f, 72.0f),
                    PathNode.CurveTo(148.0f, 65.37258f, 153.37259f, 60.0f, 160.0f, 60.0f),
                    PathNode.LineTo(200.0f, 60.0f),
                    PathNode.CurveTo(206.62741f, 60.0f, 212.0f, 65.37258f, 212.0f, 72.0f),
                    PathNode.LineTo(212.0f, 112.0f),
                    PathNode.CurveTo(212.0f, 118.62742f, 206.62741f, 124.0f, 200.0f, 124.0f),
                    PathNode.CurveTo(193.37259f, 124.0f, 188.0f, 118.62742f, 188.0f, 112.0f),
                    PathNode.LineTo(188.0f, 101.0f),
                    PathNode.LineTo(136.49f, 152.52f),
                    PathNode.CurveTo(134.23837f, 154.77945f, 131.17982f, 156.04947f, 127.99f, 156.04947f),
                    PathNode.CurveTo(124.80018f, 156.04947f, 121.74162f, 154.77945f, 119.49f, 152.52f),
                    PathNode.LineTo(96.0f, 129.0f),
                    PathNode.LineTo(44.0f, 181.0f),
                    PathNode.LineTo(44.0f, 196.0f),
                    PathNode.LineTo(224.0f, 196.0f),
                    PathNode.CurveTo(230.62741f, 196.0f, 236.0f, 201.37259f, 236.0f, 208.0f),
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
        return _chartLineUp!!
    }

private var _chartLineUp: ImageVector? = null
