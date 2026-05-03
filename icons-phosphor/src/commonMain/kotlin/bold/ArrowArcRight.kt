package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowArcRight: ImageVector
    get() {
        if (_arrowArcRight != null) return _arrowArcRight!!
        _arrowArcRight = phosphorBoldIcon(
            name = "ArrowArcRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(244.0f, 88.0f),
                    PathNode.LineTo(244.0f, 152.0f),
                    PathNode.CurveTo(244.0f, 158.62741f, 238.62741f, 164.0f, 232.0f, 164.0f),
                    PathNode.LineTo(168.0f, 164.0f),
                    PathNode.CurveTo(161.37259f, 164.0f, 156.0f, 158.62741f, 156.0f, 152.0f),
                    PathNode.CurveTo(156.0f, 145.37259f, 161.37259f, 140.0f, 168.0f, 140.0f),
                    PathNode.LineTo(202.9f, 140.0f),
                    PathNode.LineTo(187.42f, 124.63f),
                    PathNode.CurveTo(163.4018f, 100.59316f, 127.267746f, 93.39429f, 95.87145f, 106.39107f),
                    PathNode.CurveTo(64.47517f, 119.38784f, 44.00159f, 150.01996f, 44.0f, 184.0f),
                    PathNode.CurveTo(44.0f, 190.62741f, 38.62742f, 196.0f, 32.0f, 196.0f),
                    PathNode.CurveTo(25.372583f, 196.0f, 20.0f, 190.62741f, 20.0f, 184.0f),
                    PathNode.CurveTo(19.998005f, 140.31654f, 46.311382f, 100.933556f, 86.669525f, 84.216354f),
                    PathNode.CurveTo(127.027664f, 67.499146f, 173.48213f, 76.740135f, 204.37f, 107.63f),
                    PathNode.LineTo(220.0f, 123.16f),
                    PathNode.LineTo(220.0f, 88.0f),
                    PathNode.CurveTo(220.0f, 81.37258f, 225.37259f, 76.0f, 232.0f, 76.0f),
                    PathNode.CurveTo(238.62741f, 76.0f, 244.0f, 81.37258f, 244.0f, 88.0f),
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
        return _arrowArcRight!!
    }

private var _arrowArcRight: ImageVector? = null
