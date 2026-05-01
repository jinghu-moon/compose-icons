package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LinktreeLogo: ImageVector
    get() {
        if (_linktreeLogo != null) return _linktreeLogo!!
        _linktreeLogo = phosphorBoldIcon(
            name = "LinktreeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(140.0f, 164.0f),
                    PathNode.LineTo(140.0f, 232.0f),
                    PathNode.CurveTo(140.0f, 238.62741f, 134.62741f, 244.0f, 128.0f, 244.0f),
                    PathNode.CurveTo(121.37258f, 244.0f, 116.0f, 238.62741f, 116.0f, 232.0f),
                    PathNode.LineTo(116.0f, 164.0f),
                    PathNode.CurveTo(116.0f, 157.37259f, 121.37258f, 152.0f, 128.0f, 152.0f),
                    PathNode.CurveTo(134.62741f, 152.0f, 140.0f, 157.37259f, 140.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 92.0f),
                    PathNode.LineTo(157.0f, 92.0f),
                    PathNode.LineTo(192.52f, 56.49f),
                    PathNode.CurveTo(197.21442f, 51.79558f, 197.21442f, 44.18442f, 192.52f, 39.49f),
                    PathNode.CurveTo(187.82558f, 34.79558f, 180.21442f, 34.79558f, 175.52f, 39.49f),
                    PathNode.LineTo(140.0f, 75.0f),
                    PathNode.LineTo(140.0f, 24.0f),
                    PathNode.CurveTo(140.0f, 17.372583f, 134.62741f, 12.0f, 128.0f, 12.0f),
                    PathNode.CurveTo(121.37258f, 12.0f, 116.0f, 17.372583f, 116.0f, 24.0f),
                    PathNode.LineTo(116.0f, 75.0f),
                    PathNode.LineTo(80.49f, 39.51f),
                    PathNode.CurveTo(75.79558f, 34.81558f, 68.18442f, 34.81558f, 63.49f, 39.51f),
                    PathNode.CurveTo(58.79558f, 44.20442f, 58.79558f, 51.81558f, 63.49f, 56.51f),
                    PathNode.LineTo(99.0f, 92.0f),
                    PathNode.LineTo(48.0f, 92.0f),
                    PathNode.CurveTo(41.37258f, 92.0f, 36.0f, 97.37258f, 36.0f, 104.0f),
                    PathNode.CurveTo(36.0f, 110.62742f, 41.37258f, 116.0f, 48.0f, 116.0f),
                    PathNode.LineTo(99.0f, 116.0f),
                    PathNode.LineTo(63.51f, 151.51f),
                    PathNode.CurveTo(58.81558f, 156.20442f, 58.81558f, 163.81558f, 63.51f, 168.51f),
                    PathNode.CurveTo(68.20442f, 173.20442f, 75.81558f, 173.20442f, 80.51f, 168.51f),
                    PathNode.LineTo(128.0f, 121.0f),
                    PathNode.LineTo(175.51f, 168.52f),
                    PathNode.CurveTo(180.20442f, 173.21442f, 187.81558f, 173.21442f, 192.51f, 168.52f),
                    PathNode.CurveTo(197.20442f, 163.82558f, 197.20442f, 156.21442f, 192.51f, 151.52f),
                    PathNode.LineTo(157.0f, 116.0f),
                    PathNode.LineTo(208.0f, 116.0f),
                    PathNode.CurveTo(214.62741f, 116.0f, 220.0f, 110.62742f, 220.0f, 104.0f),
                    PathNode.CurveTo(220.0f, 97.37258f, 214.62741f, 92.0f, 208.0f, 92.0f),
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
        return _linktreeLogo!!
    }

private var _linktreeLogo: ImageVector? = null
