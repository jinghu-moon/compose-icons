package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SplitVertical: ImageVector
    get() {
        if (_splitVertical != null) return _splitVertical!!
        _splitVertical = phosphorBoldIcon(
            name = "SplitVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.0f, 152.0f),
                    PathNode.CurveTo(220.0f, 158.62741f, 214.62741f, 164.0f, 208.0f, 164.0f),
                    PathNode.LineTo(140.0f, 164.0f),
                    PathNode.LineTo(140.0f, 203.0f),
                    PathNode.LineTo(151.51f, 191.48f),
                    PathNode.CurveTo(156.20442f, 186.78558f, 163.81558f, 186.78558f, 168.51f, 191.48f),
                    PathNode.CurveTo(173.20442f, 196.17442f, 173.20442f, 203.78558f, 168.51f, 208.48f),
                    PathNode.LineTo(136.51f, 240.48f),
                    PathNode.CurveTo(134.25838f, 242.73946f, 131.19981f, 244.00946f, 128.01f, 244.00946f),
                    PathNode.CurveTo(124.82018f, 244.00946f, 121.76162f, 242.73946f, 119.51f, 240.48f),
                    PathNode.LineTo(87.51f, 208.48f),
                    PathNode.CurveTo(82.81558f, 203.78558f, 82.81558f, 196.17442f, 87.51f, 191.48f),
                    PathNode.CurveTo(92.20442f, 186.78558f, 99.81558f, 186.78558f, 104.51f, 191.48f),
                    PathNode.LineTo(116.0f, 203.0f),
                    PathNode.LineTo(116.0f, 164.0f),
                    PathNode.LineTo(48.0f, 164.0f),
                    PathNode.CurveTo(41.37258f, 164.0f, 36.0f, 158.62741f, 36.0f, 152.0f),
                    PathNode.CurveTo(36.0f, 145.37259f, 41.37258f, 140.0f, 48.0f, 140.0f),
                    PathNode.LineTo(208.0f, 140.0f),
                    PathNode.CurveTo(214.62741f, 140.0f, 220.0f, 145.37259f, 220.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 116.0f),
                    PathNode.LineTo(208.0f, 116.0f),
                    PathNode.CurveTo(214.62741f, 116.0f, 220.0f, 110.62742f, 220.0f, 104.0f),
                    PathNode.CurveTo(220.0f, 97.37258f, 214.62741f, 92.0f, 208.0f, 92.0f),
                    PathNode.LineTo(140.0f, 92.0f),
                    PathNode.LineTo(140.0f, 53.0f),
                    PathNode.LineTo(151.51f, 64.52f),
                    PathNode.CurveTo(156.20442f, 69.214424f, 163.81558f, 69.214424f, 168.51f, 64.52f),
                    PathNode.CurveTo(173.20442f, 59.82558f, 173.20442f, 52.21442f, 168.51f, 47.52f),
                    PathNode.LineTo(136.51f, 15.52f),
                    PathNode.CurveTo(134.25838f, 13.260546f, 131.19981f, 11.990538f, 128.01f, 11.990538f),
                    PathNode.CurveTo(124.82018f, 11.990538f, 121.76162f, 13.260546f, 119.51f, 15.52f),
                    PathNode.LineTo(87.51f, 47.52f),
                    PathNode.CurveTo(82.81558f, 52.21442f, 82.81558f, 59.82558f, 87.51f, 64.52f),
                    PathNode.CurveTo(92.20442f, 69.214424f, 99.81558f, 69.214424f, 104.51f, 64.52f),
                    PathNode.LineTo(116.0f, 53.0f),
                    PathNode.LineTo(116.0f, 92.0f),
                    PathNode.LineTo(48.0f, 92.0f),
                    PathNode.CurveTo(41.37258f, 92.0f, 36.0f, 97.37258f, 36.0f, 104.0f),
                    PathNode.CurveTo(36.0f, 110.62742f, 41.37258f, 116.0f, 48.0f, 116.0f),
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
        return _splitVertical!!
    }

private var _splitVertical: ImageVector? = null
