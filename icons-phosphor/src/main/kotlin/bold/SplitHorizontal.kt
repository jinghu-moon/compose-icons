package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SplitHorizontal: ImageVector
    get() {
        if (_splitHorizontal != null) return _splitHorizontal!!
        _splitHorizontal = phosphorBoldIcon(
            name = "SplitHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(116.0f, 48.0f),
                    PathNode.LineTo(116.0f, 208.0f),
                    PathNode.CurveTo(116.0f, 214.62741f, 110.62742f, 220.0f, 104.0f, 220.0f),
                    PathNode.CurveTo(97.37258f, 220.0f, 92.0f, 214.62741f, 92.0f, 208.0f),
                    PathNode.LineTo(92.0f, 140.0f),
                    PathNode.LineTo(53.0f, 140.0f),
                    PathNode.LineTo(64.52f, 151.51f),
                    PathNode.CurveTo(69.21442f, 156.20442f, 69.21442f, 163.81558f, 64.52f, 168.51f),
                    PathNode.CurveTo(59.82558f, 173.20442f, 52.21442f, 173.20442f, 47.52f, 168.51f),
                    PathNode.LineTo(15.52f, 136.51f),
                    PathNode.CurveTo(13.260546f, 134.25838f, 11.990538f, 131.19981f, 11.990538f, 128.01f),
                    PathNode.CurveTo(11.990538f, 124.82018f, 13.260546f, 121.76162f, 15.52f, 119.51f),
                    PathNode.LineTo(47.52f, 87.51f),
                    PathNode.CurveTo(52.21442f, 82.81558f, 59.82558f, 82.81558f, 64.52f, 87.51f),
                    PathNode.CurveTo(69.214424f, 92.20442f, 69.214424f, 99.81558f, 64.52f, 104.51f),
                    PathNode.LineTo(53.0f, 116.0f),
                    PathNode.LineTo(92.0f, 116.0f),
                    PathNode.LineTo(92.0f, 48.0f),
                    PathNode.CurveTo(92.0f, 41.37258f, 97.37258f, 36.0f, 104.0f, 36.0f),
                    PathNode.CurveTo(110.62742f, 36.0f, 116.0f, 41.37258f, 116.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(240.49f, 119.51f),
                    PathNode.LineTo(208.49f, 87.51f),
                    PathNode.CurveTo(203.79558f, 82.81558f, 196.18442f, 82.81558f, 191.49f, 87.51f),
                    PathNode.CurveTo(186.79558f, 92.20442f, 186.79558f, 99.81558f, 191.49f, 104.51f),
                    PathNode.LineTo(203.0f, 116.0f),
                    PathNode.LineTo(164.0f, 116.0f),
                    PathNode.LineTo(164.0f, 48.0f),
                    PathNode.CurveTo(164.0f, 41.37258f, 158.62741f, 36.0f, 152.0f, 36.0f),
                    PathNode.CurveTo(145.37259f, 36.0f, 140.0f, 41.37258f, 140.0f, 48.0f),
                    PathNode.LineTo(140.0f, 208.0f),
                    PathNode.CurveTo(140.0f, 214.62741f, 145.37259f, 220.0f, 152.0f, 220.0f),
                    PathNode.CurveTo(158.62741f, 220.0f, 164.0f, 214.62741f, 164.0f, 208.0f),
                    PathNode.LineTo(164.0f, 140.0f),
                    PathNode.LineTo(203.0f, 140.0f),
                    PathNode.LineTo(191.48f, 151.51f),
                    PathNode.CurveTo(186.78558f, 156.20442f, 186.78558f, 163.81558f, 191.48f, 168.51f),
                    PathNode.CurveTo(196.17442f, 173.20442f, 203.78558f, 173.20442f, 208.48f, 168.51f),
                    PathNode.LineTo(240.48f, 136.51f),
                    PathNode.CurveTo(242.74078f, 134.2597f, 244.01259f, 131.20189f, 244.01447f, 128.01207f),
                    PathNode.CurveTo(244.01634f, 124.82226f, 242.74812f, 121.762955f, 240.49f, 119.51f),
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
        return _splitHorizontal!!
    }

private var _splitHorizontal: ImageVector? = null
