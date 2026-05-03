package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Pulse: ImageVector
    get() {
        if (_pulse != null) return _pulse!!
        _pulse = phosphorBoldIcon(
            name = "Pulse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(244.0f, 128.0f),
                    PathNode.CurveTo(244.0f, 134.62741f, 238.62741f, 140.0f, 232.0f, 140.0f),
                    PathNode.LineTo(207.42f, 140.0f),
                    PathNode.LineTo(170.73f, 213.37f),
                    PathNode.CurveTo(168.69684f, 217.43306f, 164.54338f, 219.99947f, 160.0f, 220.0f),
                    PathNode.LineTo(159.4f, 220.0f),
                    PathNode.CurveTo(154.64502f, 219.75932f, 150.48203f, 216.73027f, 148.79f, 212.28f),
                    PathNode.LineTo(95.0f, 71.15f),
                    PathNode.LineTo(66.92f, 133.0f),
                    PathNode.CurveTo(64.96328f, 137.26906f, 60.69613f, 140.00441f, 56.0f, 140.0f),
                    PathNode.LineTo(24.0f, 140.0f),
                    PathNode.CurveTo(17.372583f, 140.0f, 12.0f, 134.62741f, 12.0f, 128.0f),
                    PathNode.CurveTo(12.0f, 121.37258f, 17.372583f, 116.0f, 24.0f, 116.0f),
                    PathNode.LineTo(48.27f, 116.0f),
                    PathNode.LineTo(85.08f, 35.0f),
                    PathNode.CurveTo(87.08727f, 30.597643f, 91.54203f, 27.831406f, 96.37798f, 27.984373f),
                    PathNode.CurveTo(101.21394f, 28.13734f, 105.48497f, 31.179585f, 107.21f, 35.7f),
                    PathNode.LineTo(161.49f, 178.16f),
                    PathNode.LineTo(189.27f, 122.6f),
                    PathNode.CurveTo(191.31152f, 118.548584f, 195.46329f, 115.994835f, 200.0f, 116.0f),
                    PathNode.LineTo(232.0f, 116.0f),
                    PathNode.CurveTo(238.62741f, 116.0f, 244.0f, 121.37258f, 244.0f, 128.0f),
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
        return _pulse!!
    }

private var _pulse: ImageVector? = null
