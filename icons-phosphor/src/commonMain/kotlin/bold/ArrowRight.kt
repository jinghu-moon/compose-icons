package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowRight: ImageVector
    get() {
        if (_arrowRight != null) return _arrowRight!!
        _arrowRight = phosphorBoldIcon(
            name = "ArrowRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.49f, 136.49f),
                    PathNode.LineTo(152.49f, 208.49f),
                    PathNode.CurveTo(147.79558f, 213.18442f, 140.18442f, 213.18442f, 135.49f, 208.49f),
                    PathNode.CurveTo(130.79558f, 203.79558f, 130.79558f, 196.18442f, 135.49f, 191.49f),
                    PathNode.LineTo(187.0f, 140.0f),
                    PathNode.LineTo(40.0f, 140.0f),
                    PathNode.CurveTo(33.37258f, 140.0f, 28.0f, 134.62741f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 121.37258f, 33.37258f, 116.0f, 40.0f, 116.0f),
                    PathNode.LineTo(187.0f, 116.0f),
                    PathNode.LineTo(135.51f, 64.48f),
                    PathNode.CurveTo(130.81558f, 59.78558f, 130.81558f, 52.17442f, 135.51f, 47.48f),
                    PathNode.CurveTo(140.20442f, 42.78558f, 147.81558f, 42.78558f, 152.51f, 47.48f),
                    PathNode.LineTo(224.51f, 119.48f),
                    PathNode.CurveTo(226.76988f, 121.73468f, 228.03824f, 124.79688f, 228.03448f, 127.98916f),
                    PathNode.CurveTo(228.03073f, 131.18143f, 226.75517f, 134.24065f, 224.49f, 136.49f),
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
        return _arrowRight!!
    }

private var _arrowRight: ImageVector? = null
