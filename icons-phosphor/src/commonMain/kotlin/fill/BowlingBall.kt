package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BowlingBall: ImageVector
    get() {
        if (_bowlingBall != null) return _bowlingBall!!
        _bowlingBall = phosphorFillIcon(
            name = "BowlingBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 128.0f),
                    PathNode.CurveTo(125.37258f, 128.0f, 120.0f, 122.62742f, 120.0f, 116.0f),
                    PathNode.CurveTo(120.0f, 109.37258f, 125.37258f, 104.0f, 132.0f, 104.0f),
                    PathNode.CurveTo(138.62741f, 104.0f, 144.0f, 109.37258f, 144.0f, 116.0f),
                    PathNode.CurveTo(144.0f, 122.62742f, 138.62741f, 128.0f, 132.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 92.0f),
                    PathNode.CurveTo(152.0f, 85.37258f, 157.37259f, 80.0f, 164.0f, 80.0f),
                    PathNode.CurveTo(170.62741f, 80.0f, 176.0f, 85.37258f, 176.0f, 92.0f),
                    PathNode.CurveTo(176.0f, 98.62742f, 170.62741f, 104.0f, 164.0f, 104.0f),
                    PathNode.CurveTo(157.37259f, 104.0f, 152.0f, 98.62742f, 152.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 144.0f),
                    PathNode.CurveTo(165.37259f, 144.0f, 160.0f, 138.62741f, 160.0f, 132.0f),
                    PathNode.CurveTo(160.0f, 125.37258f, 165.37259f, 120.0f, 172.0f, 120.0f),
                    PathNode.CurveTo(178.62741f, 120.0f, 184.0f, 125.37258f, 184.0f, 132.0f),
                    PathNode.CurveTo(184.0f, 138.62741f, 178.62741f, 144.0f, 172.0f, 144.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _bowlingBall!!
    }

private var _bowlingBall: ImageVector? = null
