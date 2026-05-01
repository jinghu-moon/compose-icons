package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ForkKnife: ImageVector
    get() {
        if (_forkKnife != null) return _forkKnife!!
        _forkKnife = phosphorBoldIcon(
            name = "ForkKnife",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(68.0f, 88.0f),
                    PathNode.LineTo(68.0f, 40.0f),
                    PathNode.CurveTo(68.0f, 33.37258f, 73.37258f, 28.0f, 80.0f, 28.0f),
                    PathNode.CurveTo(86.62742f, 28.0f, 92.0f, 33.37258f, 92.0f, 40.0f),
                    PathNode.LineTo(92.0f, 88.0f),
                    PathNode.CurveTo(92.0f, 94.62742f, 86.62742f, 100.0f, 80.0f, 100.0f),
                    PathNode.CurveTo(73.37258f, 100.0f, 68.0f, 94.62742f, 68.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 40.0f),
                    PathNode.LineTo(220.0f, 224.0f),
                    PathNode.CurveTo(220.0f, 230.62741f, 214.62741f, 236.0f, 208.0f, 236.0f),
                    PathNode.CurveTo(201.37259f, 236.0f, 196.0f, 230.62741f, 196.0f, 224.0f),
                    PathNode.LineTo(196.0f, 180.0f),
                    PathNode.LineTo(152.0f, 180.0f),
                    PathNode.CurveTo(145.37259f, 180.0f, 140.0f, 174.62741f, 140.0f, 168.0f),
                    PathNode.CurveTo(140.37486f, 148.52045f, 142.83217f, 129.13687f, 147.33f, 110.18f),
                    PathNode.CurveTo(157.42f, 68.42f, 176.76f, 40.33f, 203.27f, 29.0f),
                    PathNode.CurveTo(206.97304f, 27.41179f, 211.22597f, 27.78802f, 214.59268f, 30.001638f),
                    PathNode.CurveTo(217.9594f, 32.21526f, 219.99045f, 35.97076f, 220.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 62.92f),
                    PathNode.CurveTo(182.6f, 77.0f, 175.0f, 98.0f, 170.77f, 115.38f),
                    PathNode.CurveTo(167.60475f, 128.73013f, 165.52463f, 142.31442f, 164.55f, 156.0f),
                    PathNode.LineTo(196.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 39.0f),
                    PathNode.CurveTo(127.447716f, 32.37258f, 121.62742f, 27.447716f, 115.0f, 28.0f),
                    PathNode.CurveTo(108.37258f, 28.552284f, 103.447716f, 34.37258f, 104.0f, 41.0f),
                    PathNode.LineTo(108.0f, 88.46f),
                    PathNode.CurveTo(108.0f, 103.92397f, 95.463974f, 116.46f, 80.0f, 116.46f),
                    PathNode.CurveTo(64.536026f, 116.46f, 52.0f, 103.92397f, 52.0f, 88.46f),
                    PathNode.LineTo(56.0f, 41.0f),
                    PathNode.CurveTo(56.552284f, 34.37258f, 51.62742f, 28.552284f, 45.0f, 28.0f),
                    PathNode.CurveTo(38.37258f, 27.447716f, 32.552284f, 32.37258f, 32.0f, 39.0f),
                    PathNode.LineTo(28.0f, 87.0f),
                    PathNode.CurveTo(28.0f, 87.34f, 28.0f, 87.67f, 28.0f, 88.0f),
                    PathNode.CurveTo(28.039497f, 112.081024f, 44.57738f, 132.99731f, 68.0f, 138.59f),
                    PathNode.LineTo(68.0f, 224.0f),
                    PathNode.CurveTo(68.0f, 230.62741f, 73.37258f, 236.0f, 80.0f, 236.0f),
                    PathNode.CurveTo(86.62742f, 236.0f, 92.0f, 230.62741f, 92.0f, 224.0f),
                    PathNode.LineTo(92.0f, 138.59f),
                    PathNode.CurveTo(115.42262f, 132.99731f, 131.9605f, 112.081024f, 132.0f, 88.0f),
                    PathNode.CurveTo(132.0f, 87.67f, 132.0f, 87.34f, 132.0f, 87.0f),
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
        return _forkKnife!!
    }

private var _forkKnife: ImageVector? = null
