package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowsHorizontal: ImageVector
    get() {
        if (_arrowsHorizontal != null) return _arrowsHorizontal!!
        _arrowsHorizontal = phosphorBoldIcon(
            name = "ArrowsHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.49f, 136.49f),
                    PathNode.LineTo(208.49f, 168.49f),
                    PathNode.CurveTo(203.79558f, 173.18442f, 196.18442f, 173.18442f, 191.49f, 168.49f),
                    PathNode.CurveTo(186.79558f, 163.79558f, 186.79558f, 156.18442f, 191.49f, 151.49f),
                    PathNode.LineTo(203.0f, 140.0f),
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
                    PathNode.LineTo(203.0f, 116.0f),
                    PathNode.LineTo(191.48f, 104.49f),
                    PathNode.CurveTo(186.78558f, 99.79558f, 186.78558f, 92.18442f, 191.48f, 87.49f),
                    PathNode.CurveTo(196.17442f, 82.79558f, 203.78558f, 82.79558f, 208.48f, 87.49f),
                    PathNode.LineTo(240.48f, 119.49f),
                    PathNode.CurveTo(242.74078f, 121.740295f, 244.01259f, 124.7981f, 244.01447f, 127.98792f),
                    PathNode.CurveTo(244.01634f, 131.17773f, 242.74812f, 134.23705f, 240.49f, 136.49f),
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
        return _arrowsHorizontal!!
    }

private var _arrowsHorizontal: ImageVector? = null
