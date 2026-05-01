package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CallBell: ImageVector
    get() {
        if (_callBell != null) return _callBell!!
        _callBell = phosphorBoldIcon(
            name = "CallBell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(24.0f, 180.0f),
                    PathNode.LineTo(232.0f, 180.0f),
                    PathNode.CurveTo(238.62741f, 180.0f, 244.0f, 174.62741f, 244.0f, 168.0f),
                    PathNode.CurveTo(244.0f, 161.37259f, 238.62741f, 156.0f, 232.0f, 156.0f),
                    PathNode.LineTo(227.91f, 156.0f),
                    PathNode.CurveTo(225.88367f, 107.00147f, 188.67738f, 66.67597f, 140.0f, 60.72f),
                    PathNode.LineTo(140.0f, 44.0f),
                    PathNode.LineTo(152.0f, 44.0f),
                    PathNode.CurveTo(158.62741f, 44.0f, 164.0f, 38.62742f, 164.0f, 32.0f),
                    PathNode.CurveTo(164.0f, 25.372583f, 158.62741f, 20.0f, 152.0f, 20.0f),
                    PathNode.LineTo(104.0f, 20.0f),
                    PathNode.CurveTo(97.37258f, 20.0f, 92.0f, 25.372583f, 92.0f, 32.0f),
                    PathNode.CurveTo(92.0f, 38.62742f, 97.37258f, 44.0f, 104.0f, 44.0f),
                    PathNode.LineTo(116.0f, 44.0f),
                    PathNode.LineTo(116.0f, 60.72f),
                    PathNode.CurveTo(67.32261f, 66.67597f, 30.116327f, 107.00147f, 28.09f, 156.0f),
                    PathNode.LineTo(24.0f, 156.0f),
                    PathNode.CurveTo(17.372583f, 156.0f, 12.0f, 161.37259f, 12.0f, 168.0f),
                    PathNode.CurveTo(12.0f, 174.62741f, 17.372583f, 180.0f, 24.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 84.0f),
                    PathNode.CurveTo(168.39932f, 84.04778f, 201.71848f, 115.65906f, 203.89f, 156.0f),
                    PathNode.LineTo(52.11f, 156.0f),
                    PathNode.CurveTo(54.281525f, 115.65906f, 87.600685f, 84.04778f, 128.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(244.0f, 208.0f),
                    PathNode.CurveTo(244.0f, 214.62741f, 238.62741f, 220.0f, 232.0f, 220.0f),
                    PathNode.LineTo(24.0f, 220.0f),
                    PathNode.CurveTo(17.372583f, 220.0f, 12.0f, 214.62741f, 12.0f, 208.0f),
                    PathNode.CurveTo(12.0f, 201.37259f, 17.372583f, 196.0f, 24.0f, 196.0f),
                    PathNode.LineTo(232.0f, 196.0f),
                    PathNode.CurveTo(238.62741f, 196.0f, 244.0f, 201.37259f, 244.0f, 208.0f),
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
        return _callBell!!
    }

private var _callBell: ImageVector? = null
