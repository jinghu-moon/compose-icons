package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowElbowRightUp: ImageVector
    get() {
        if (_arrowElbowRightUp != null) return _arrowElbowRightUp!!
        _arrowElbowRightUp = phosphorBoldIcon(
            name = "ArrowElbowRightUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.49f, 104.49f),
                    PathNode.CurveTo(222.23837f, 106.74945f, 219.17982f, 108.01946f, 215.99f, 108.01946f),
                    PathNode.CurveTo(212.80019f, 108.01946f, 209.74162f, 106.74945f, 207.49f, 104.49f),
                    PathNode.LineTo(180.0f, 77.0f),
                    PathNode.LineTo(180.0f, 192.0f),
                    PathNode.CurveTo(180.0f, 198.62741f, 174.62741f, 204.0f, 168.0f, 204.0f),
                    PathNode.LineTo(24.0f, 204.0f),
                    PathNode.CurveTo(17.372583f, 204.0f, 12.0f, 198.62741f, 12.0f, 192.0f),
                    PathNode.CurveTo(12.0f, 185.37259f, 17.372583f, 180.0f, 24.0f, 180.0f),
                    PathNode.LineTo(156.0f, 180.0f),
                    PathNode.LineTo(156.0f, 77.0f),
                    PathNode.LineTo(128.49f, 104.52f),
                    PathNode.CurveTo(123.79558f, 109.214424f, 116.18442f, 109.214424f, 111.49f, 104.52f),
                    PathNode.CurveTo(106.79558f, 99.82558f, 106.79558f, 92.214424f, 111.49f, 87.52f),
                    PathNode.LineTo(159.49f, 39.52f),
                    PathNode.CurveTo(161.74162f, 37.260548f, 164.80019f, 35.990536f, 167.99f, 35.990536f),
                    PathNode.CurveTo(171.17982f, 35.990536f, 174.23837f, 37.260548f, 176.49f, 39.52f),
                    PathNode.LineTo(224.49f, 87.52f),
                    PathNode.CurveTo(229.17592f, 92.20623f, 229.17592f, 99.803764f, 224.49f, 104.49f),
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
        return _arrowElbowRightUp!!
    }

private var _arrowElbowRightUp: ImageVector? = null
