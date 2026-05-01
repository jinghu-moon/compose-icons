package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChartBar: ImageVector
    get() {
        if (_chartBar != null) return _chartBar!!
        _chartBar = phosphorBoldIcon(
            name = "ChartBar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 196.0f),
                    PathNode.LineTo(220.0f, 196.0f),
                    PathNode.LineTo(220.0f, 40.0f),
                    PathNode.CurveTo(220.0f, 33.37258f, 214.62741f, 28.0f, 208.0f, 28.0f),
                    PathNode.LineTo(152.0f, 28.0f),
                    PathNode.CurveTo(145.37259f, 28.0f, 140.0f, 33.37258f, 140.0f, 40.0f),
                    PathNode.LineTo(140.0f, 76.0f),
                    PathNode.LineTo(96.0f, 76.0f),
                    PathNode.CurveTo(89.37258f, 76.0f, 84.0f, 81.37258f, 84.0f, 88.0f),
                    PathNode.LineTo(84.0f, 124.0f),
                    PathNode.LineTo(48.0f, 124.0f),
                    PathNode.CurveTo(41.37258f, 124.0f, 36.0f, 129.37259f, 36.0f, 136.0f),
                    PathNode.LineTo(36.0f, 196.0f),
                    PathNode.LineTo(32.0f, 196.0f),
                    PathNode.CurveTo(25.372583f, 196.0f, 20.0f, 201.37259f, 20.0f, 208.0f),
                    PathNode.CurveTo(20.0f, 214.62741f, 25.372583f, 220.0f, 32.0f, 220.0f),
                    PathNode.LineTo(224.0f, 220.0f),
                    PathNode.CurveTo(230.62741f, 220.0f, 236.0f, 214.62741f, 236.0f, 208.0f),
                    PathNode.CurveTo(236.0f, 201.37259f, 230.62741f, 196.0f, 224.0f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 52.0f),
                    PathNode.LineTo(196.0f, 52.0f),
                    PathNode.LineTo(196.0f, 196.0f),
                    PathNode.LineTo(164.0f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 100.0f),
                    PathNode.LineTo(140.0f, 100.0f),
                    PathNode.LineTo(140.0f, 196.0f),
                    PathNode.LineTo(108.0f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 148.0f),
                    PathNode.LineTo(84.0f, 148.0f),
                    PathNode.LineTo(84.0f, 196.0f),
                    PathNode.LineTo(60.0f, 196.0f),
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
        return _chartBar!!
    }

private var _chartBar: ImageVector? = null
