package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.DotsSixVertical: ImageVector
    get() {
        if (_dotsSixVertical != null) return _dotsSixVertical!!
        _dotsSixVertical = phosphorRegularIcon(
            name = "DotsSixVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(104.0f, 60.0f),
                    PathNode.CurveTo(104.0f, 66.62742f, 98.62742f, 72.0f, 92.0f, 72.0f),
                    PathNode.CurveTo(85.37258f, 72.0f, 80.0f, 66.62742f, 80.0f, 60.0f),
                    PathNode.CurveTo(80.0f, 53.37258f, 85.37258f, 48.0f, 92.0f, 48.0f),
                    PathNode.CurveTo(98.62742f, 48.0f, 104.0f, 53.37258f, 104.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 72.0f),
                    PathNode.CurveTo(170.62741f, 72.0f, 176.0f, 66.62742f, 176.0f, 60.0f),
                    PathNode.CurveTo(176.0f, 53.37258f, 170.62741f, 48.0f, 164.0f, 48.0f),
                    PathNode.CurveTo(157.37259f, 48.0f, 152.0f, 53.37258f, 152.0f, 60.0f),
                    PathNode.CurveTo(152.0f, 66.62742f, 157.37259f, 72.0f, 164.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 116.0f),
                    PathNode.CurveTo(85.37258f, 116.0f, 80.0f, 121.37258f, 80.0f, 128.0f),
                    PathNode.CurveTo(80.0f, 134.62741f, 85.37258f, 140.0f, 92.0f, 140.0f),
                    PathNode.CurveTo(98.62742f, 140.0f, 104.0f, 134.62741f, 104.0f, 128.0f),
                    PathNode.CurveTo(104.0f, 121.37258f, 98.62742f, 116.0f, 92.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 116.0f),
                    PathNode.CurveTo(157.37259f, 116.0f, 152.0f, 121.37258f, 152.0f, 128.0f),
                    PathNode.CurveTo(152.0f, 134.62741f, 157.37259f, 140.0f, 164.0f, 140.0f),
                    PathNode.CurveTo(170.62741f, 140.0f, 176.0f, 134.62741f, 176.0f, 128.0f),
                    PathNode.CurveTo(176.0f, 121.37258f, 170.62741f, 116.0f, 164.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 184.0f),
                    PathNode.CurveTo(85.37258f, 184.0f, 80.0f, 189.37259f, 80.0f, 196.0f),
                    PathNode.CurveTo(80.0f, 202.62741f, 85.37258f, 208.0f, 92.0f, 208.0f),
                    PathNode.CurveTo(98.62742f, 208.0f, 104.0f, 202.62741f, 104.0f, 196.0f),
                    PathNode.CurveTo(104.0f, 189.37259f, 98.62742f, 184.0f, 92.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 184.0f),
                    PathNode.CurveTo(157.37259f, 184.0f, 152.0f, 189.37259f, 152.0f, 196.0f),
                    PathNode.CurveTo(152.0f, 202.62741f, 157.37259f, 208.0f, 164.0f, 208.0f),
                    PathNode.CurveTo(170.62741f, 208.0f, 176.0f, 202.62741f, 176.0f, 196.0f),
                    PathNode.CurveTo(176.0f, 189.37259f, 170.62741f, 184.0f, 164.0f, 184.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _dotsSixVertical!!
    }

private var _dotsSixVertical: ImageVector? = null
