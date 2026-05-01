package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Lighthouse: ImageVector
    get() {
        if (_lighthouse != null) return _lighthouse!!
        _lighthouse = phosphorBoldIcon(
            name = "Lighthouse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.0f, 84.0f),
                    PathNode.CurveTo(213.37259f, 84.0f, 208.0f, 89.37258f, 208.0f, 96.0f),
                    PathNode.LineTo(208.0f, 104.0f),
                    PathNode.LineTo(192.87f, 104.0f),
                    PathNode.LineTo(187.94f, 54.8f),
                    PathNode.CurveTo(187.65367f, 51.797215f, 186.247f, 49.012398f, 184.0f, 47.0f),
                    PathNode.LineTo(141.1f, 8.89f),
                    PathNode.LineTo(140.8f, 8.64f),
                    PathNode.CurveTo(133.38438f, 2.463331f, 122.61562f, 2.463331f, 115.2f, 8.64f),
                    PathNode.LineTo(114.9f, 8.89f),
                    PathNode.LineTo(72.0f, 47.0f),
                    PathNode.CurveTo(69.739655f, 48.992702f, 68.31174f, 51.762863f, 68.0f, 54.76f),
                    PathNode.LineTo(63.13f, 104.0f),
                    PathNode.LineTo(48.0f, 104.0f),
                    PathNode.LineTo(48.0f, 96.0f),
                    PathNode.CurveTo(48.0f, 89.37258f, 42.62742f, 84.0f, 36.0f, 84.0f),
                    PathNode.CurveTo(29.372583f, 84.0f, 24.0f, 89.37258f, 24.0f, 96.0f),
                    PathNode.LineTo(24.0f, 116.0f),
                    PathNode.CurveTo(24.0f, 122.62742f, 29.372583f, 128.0f, 36.0f, 128.0f),
                    PathNode.LineTo(60.72f, 128.0f),
                    PathNode.LineTo(52.09f, 214.1f),
                    PathNode.CurveTo(51.554684f, 219.70941f, 53.41051f, 225.2844f, 57.20105f, 229.4538f),
                    PathNode.CurveTo(60.99159f, 233.6232f, 66.3651f, 236.00012f, 72.0f, 236.0f),
                    PathNode.LineTo(184.0f, 236.0f),
                    PathNode.CurveTo(189.64275f, 235.99867f, 195.02237f, 233.61374f, 198.81241f, 229.43329f),
                    PathNode.CurveTo(202.60243f, 225.25282f, 204.45016f, 219.66586f, 203.9f, 214.05f),
                    PathNode.LineTo(195.28f, 128.0f),
                    PathNode.LineTo(220.0f, 128.0f),
                    PathNode.CurveTo(226.62741f, 128.0f, 232.0f, 122.62742f, 232.0f, 116.0f),
                    PathNode.LineTo(232.0f, 96.0f),
                    PathNode.CurveTo(232.0f, 89.37258f, 226.62741f, 84.0f, 220.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 29.36f),
                    PathNode.LineTo(144.46f, 44.0f),
                    PathNode.LineTo(111.54f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(90.86f, 68.0f),
                    PathNode.LineTo(165.14f, 68.0f),
                    PathNode.LineTo(168.75f, 104.0f),
                    PathNode.LineTo(140.0f, 104.0f),
                    PathNode.LineTo(140.0f, 96.0f),
                    PathNode.CurveTo(140.0f, 89.37258f, 134.62741f, 84.0f, 128.0f, 84.0f),
                    PathNode.CurveTo(121.37258f, 84.0f, 116.0f, 89.37258f, 116.0f, 96.0f),
                    PathNode.LineTo(116.0f, 104.0f),
                    PathNode.LineTo(87.25f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.42f, 212.0f),
                    PathNode.LineTo(79.63f, 180.0f),
                    PathNode.LineTo(176.37f, 180.0f),
                    PathNode.LineTo(179.58f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(174.0f, 156.0f),
                    PathNode.LineTo(82.0f, 156.0f),
                    PathNode.LineTo(84.8f, 128.0f),
                    PathNode.LineTo(171.12f, 128.0f),
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
        return _lighthouse!!
    }

private var _lighthouse: ImageVector? = null
