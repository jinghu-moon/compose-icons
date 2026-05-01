package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Repeat: ImageVector
    get() {
        if (_repeat != null) return _repeat!!
        _repeat = phosphorBoldIcon(
            name = "Repeat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.0f, 128.0f),
                    PathNode.CurveTo(20.044094f, 86.04464f, 54.044636f, 52.044098f, 96.0f, 52.0f),
                    PathNode.LineTo(195.0f, 52.0f),
                    PathNode.LineTo(191.48f, 48.49f),
                    PathNode.CurveTo(186.78558f, 43.79558f, 186.78558f, 36.18442f, 191.48f, 31.49f),
                    PathNode.CurveTo(196.17442f, 26.79558f, 203.78558f, 26.79558f, 208.48f, 31.49f),
                    PathNode.LineTo(232.48f, 55.49f),
                    PathNode.CurveTo(234.73946f, 57.741623f, 236.00946f, 60.800182f, 236.00946f, 63.99f),
                    PathNode.CurveTo(236.00946f, 67.17982f, 234.73946f, 70.23838f, 232.48f, 72.49f),
                    PathNode.LineTo(208.48f, 96.49f),
                    PathNode.CurveTo(203.78558f, 101.18442f, 196.17442f, 101.18442f, 191.48f, 96.49f),
                    PathNode.CurveTo(186.78558f, 91.79558f, 186.78558f, 84.18442f, 191.48f, 79.49f),
                    PathNode.LineTo(195.0f, 76.0f),
                    PathNode.LineTo(96.0f, 76.0f),
                    PathNode.CurveTo(67.2949f, 76.033066f, 44.033066f, 99.2949f, 44.0f, 128.0f),
                    PathNode.CurveTo(44.0f, 134.62741f, 38.62742f, 140.0f, 32.0f, 140.0f),
                    PathNode.CurveTo(25.372583f, 140.0f, 20.0f, 134.62741f, 20.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 116.0f),
                    PathNode.CurveTo(217.37259f, 116.0f, 212.0f, 121.37258f, 212.0f, 128.0f),
                    PathNode.CurveTo(211.96693f, 156.7051f, 188.7051f, 179.96693f, 160.0f, 180.0f),
                    PathNode.LineTo(61.0f, 180.0f),
                    PathNode.LineTo(64.52f, 176.49f),
                    PathNode.CurveTo(69.214424f, 171.79558f, 69.214424f, 164.18442f, 64.52f, 159.49f),
                    PathNode.CurveTo(59.82558f, 154.79558f, 52.21442f, 154.79558f, 47.52f, 159.49f),
                    PathNode.LineTo(23.52f, 183.49f),
                    PathNode.CurveTo(21.260546f, 185.74162f, 19.990538f, 188.80019f, 19.990538f, 191.99f),
                    PathNode.CurveTo(19.990538f, 195.17982f, 21.260546f, 198.23837f, 23.52f, 200.49f),
                    PathNode.LineTo(47.52f, 224.49f),
                    PathNode.CurveTo(52.21442f, 229.18442f, 59.82558f, 229.18442f, 64.52f, 224.49f),
                    PathNode.CurveTo(69.214424f, 219.79558f, 69.214424f, 212.18442f, 64.52f, 207.49f),
                    PathNode.LineTo(61.0f, 204.0f),
                    PathNode.LineTo(160.0f, 204.0f),
                    PathNode.CurveTo(201.95538f, 203.9559f, 235.9559f, 169.95538f, 236.0f, 128.0f),
                    PathNode.CurveTo(236.0f, 121.37258f, 230.62741f, 116.0f, 224.0f, 116.0f),
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
        return _repeat!!
    }

private var _repeat: ImageVector? = null
