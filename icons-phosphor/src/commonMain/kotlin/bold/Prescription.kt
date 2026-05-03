package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Prescription: ImageVector
    get() {
        if (_prescription != null) return _prescription!!
        _prescription = phosphorBoldIcon(
            name = "Prescription",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(189.0f, 188.0f),
                    PathNode.LineTo(208.52f, 168.49f),
                    PathNode.CurveTo(213.21442f, 163.79558f, 213.21442f, 156.18442f, 208.52f, 151.49f),
                    PathNode.CurveTo(203.82558f, 146.79558f, 196.21442f, 146.79558f, 191.52f, 151.49f),
                    PathNode.LineTo(172.0f, 171.0f),
                    PathNode.LineTo(138.93f, 138.0f),
                    PathNode.CurveTo(165.9826f, 130.56952f, 183.36229f, 104.26785f, 179.58913f, 76.46825f),
                    PathNode.CurveTo(175.81595f, 48.668633f, 152.05446f, 27.950947f, 124.0f, 28.0f),
                    PathNode.LineTo(72.0f, 28.0f),
                    PathNode.CurveTo(65.37258f, 28.0f, 60.0f, 33.37258f, 60.0f, 40.0f),
                    PathNode.LineTo(60.0f, 192.0f),
                    PathNode.CurveTo(60.0f, 198.62741f, 65.37258f, 204.0f, 72.0f, 204.0f),
                    PathNode.CurveTo(78.62742f, 204.0f, 84.0f, 198.62741f, 84.0f, 192.0f),
                    PathNode.LineTo(84.0f, 140.0f),
                    PathNode.LineTo(107.0f, 140.0f),
                    PathNode.LineTo(155.0f, 188.0f),
                    PathNode.LineTo(135.48f, 207.51f),
                    PathNode.CurveTo(130.78558f, 212.20442f, 130.78558f, 219.81558f, 135.48f, 224.51f),
                    PathNode.CurveTo(140.17442f, 229.20442f, 147.78558f, 229.20442f, 152.48f, 224.51f),
                    PathNode.LineTo(172.0f, 205.0f),
                    PathNode.LineTo(191.51f, 224.52f),
                    PathNode.CurveTo(196.20442f, 229.21442f, 203.81558f, 229.21442f, 208.51f, 224.52f),
                    PathNode.CurveTo(213.20442f, 219.82558f, 213.20442f, 212.21442f, 208.51f, 207.52f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 52.0f),
                    PathNode.LineTo(124.0f, 52.0f),
                    PathNode.CurveTo(141.67311f, 52.0f, 156.0f, 66.32689f, 156.0f, 84.0f),
                    PathNode.CurveTo(156.0f, 101.67311f, 141.67311f, 116.0f, 124.0f, 116.0f),
                    PathNode.LineTo(84.0f, 116.0f),
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
        return _prescription!!
    }

private var _prescription: ImageVector? = null
