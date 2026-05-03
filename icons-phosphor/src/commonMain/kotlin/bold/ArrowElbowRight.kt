package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowElbowRight: ImageVector
    get() {
        if (_arrowElbowRight != null) return _arrowElbowRight!!
        _arrowElbowRight = phosphorBoldIcon(
            name = "ArrowElbowRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(244.0f, 80.0f),
                    PathNode.LineTo(244.0f, 152.0f),
                    PathNode.CurveTo(244.0f, 158.62741f, 238.62741f, 164.0f, 232.0f, 164.0f),
                    PathNode.CurveTo(225.37259f, 164.0f, 220.0f, 158.62741f, 220.0f, 152.0f),
                    PathNode.LineTo(220.0f, 109.0f),
                    PathNode.LineTo(128.49f, 200.52f),
                    PathNode.CurveTo(126.23838f, 202.77945f, 123.17982f, 204.04947f, 119.99f, 204.04947f),
                    PathNode.CurveTo(116.80018f, 204.04947f, 113.74162f, 202.77945f, 111.49f, 200.52f),
                    PathNode.LineTo(15.49f, 104.52f),
                    PathNode.CurveTo(10.79558f, 99.82558f, 10.79558f, 92.214424f, 15.49f, 87.52f),
                    PathNode.CurveTo(20.18442f, 82.82558f, 27.79558f, 82.82558f, 32.49f, 87.52f),
                    PathNode.LineTo(120.0f, 175.0f),
                    PathNode.LineTo(203.0f, 92.0f),
                    PathNode.LineTo(160.0f, 92.0f),
                    PathNode.CurveTo(153.37259f, 92.0f, 148.0f, 86.62742f, 148.0f, 80.0f),
                    PathNode.CurveTo(148.0f, 73.37258f, 153.37259f, 68.0f, 160.0f, 68.0f),
                    PathNode.LineTo(232.0f, 68.0f),
                    PathNode.CurveTo(238.62741f, 68.0f, 244.0f, 73.37258f, 244.0f, 80.0f),
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
        return _arrowElbowRight!!
    }

private var _arrowElbowRight: ImageVector? = null
