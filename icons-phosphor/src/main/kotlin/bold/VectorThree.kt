package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.VectorThree: ImageVector
    get() {
        if (_vectorThree != null) return _vectorThree!!
        _vectorThree = phosphorBoldIcon(
            name = "VectorThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.49f, 144.49f),
                    PathNode.LineTo(208.49f, 176.49f),
                    PathNode.CurveTo(203.79558f, 181.18442f, 196.18442f, 181.18442f, 191.49f, 176.49f),
                    PathNode.CurveTo(186.79558f, 171.79558f, 186.79558f, 164.18442f, 191.49f, 159.49f),
                    PathNode.LineTo(203.0f, 148.0f),
                    PathNode.LineTo(125.0f, 148.0f),
                    PathNode.LineTo(77.0f, 196.0f),
                    PathNode.LineTo(96.0f, 196.0f),
                    PathNode.CurveTo(102.62742f, 196.0f, 108.0f, 201.37259f, 108.0f, 208.0f),
                    PathNode.CurveTo(108.0f, 214.62741f, 102.62742f, 220.0f, 96.0f, 220.0f),
                    PathNode.LineTo(48.0f, 220.0f),
                    PathNode.CurveTo(41.37258f, 220.0f, 36.0f, 214.62741f, 36.0f, 208.0f),
                    PathNode.LineTo(36.0f, 160.0f),
                    PathNode.CurveTo(36.0f, 153.37259f, 41.37258f, 148.0f, 48.0f, 148.0f),
                    PathNode.CurveTo(54.62742f, 148.0f, 60.0f, 153.37259f, 60.0f, 160.0f),
                    PathNode.LineTo(60.0f, 179.0f),
                    PathNode.LineTo(108.0f, 131.0f),
                    PathNode.LineTo(108.0f, 53.0f),
                    PathNode.LineTo(96.49f, 64.49f),
                    PathNode.CurveTo(91.79558f, 69.18442f, 84.18442f, 69.18442f, 79.49f, 64.49f),
                    PathNode.CurveTo(74.79558f, 59.79558f, 74.79558f, 52.18442f, 79.49f, 47.49f),
                    PathNode.LineTo(111.49f, 15.49f),
                    PathNode.CurveTo(113.74162f, 13.230546f, 116.80018f, 11.960537f, 119.99f, 11.960537f),
                    PathNode.CurveTo(123.17982f, 11.960537f, 126.23838f, 13.230546f, 128.49f, 15.49f),
                    PathNode.LineTo(160.49f, 47.49f),
                    PathNode.CurveTo(165.18442f, 52.18442f, 165.18442f, 59.79558f, 160.49f, 64.49f),
                    PathNode.CurveTo(155.79558f, 69.18442f, 148.18442f, 69.18442f, 143.49f, 64.49f),
                    PathNode.LineTo(132.0f, 53.0f),
                    PathNode.LineTo(132.0f, 124.0f),
                    PathNode.LineTo(203.0f, 124.0f),
                    PathNode.LineTo(191.48f, 112.49f),
                    PathNode.CurveTo(186.78558f, 107.79558f, 186.78558f, 100.18442f, 191.48f, 95.49f),
                    PathNode.CurveTo(196.17442f, 90.79558f, 203.78558f, 90.79558f, 208.48f, 95.49f),
                    PathNode.LineTo(240.48f, 127.49f),
                    PathNode.CurveTo(242.74078f, 129.7403f, 244.01259f, 132.79811f, 244.01447f, 135.98793f),
                    PathNode.CurveTo(244.01634f, 139.17773f, 242.74812f, 142.23705f, 240.49f, 144.49f),
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
        return _vectorThree!!
    }

private var _vectorThree: ImageVector? = null
