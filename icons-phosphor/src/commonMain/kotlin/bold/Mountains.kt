package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Mountains: ImageVector
    get() {
        if (_mountains != null) return _mountains!!
        _mountains = phosphorBoldIcon(
            name = "Mountains",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(160.0f, 80.0f),
                    PathNode.CurveTo(177.67311f, 80.0f, 192.0f, 65.67311f, 192.0f, 48.0f),
                    PathNode.CurveTo(192.0f, 30.326887f, 177.67311f, 16.0f, 160.0f, 16.0f),
                    PathNode.CurveTo(142.32689f, 16.0f, 128.0f, 30.326887f, 128.0f, 48.0f),
                    PathNode.CurveTo(128.0f, 65.67311f, 142.32689f, 80.0f, 160.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 40.0f),
                    PathNode.CurveTo(164.41827f, 40.0f, 168.0f, 43.581722f, 168.0f, 48.0f),
                    PathNode.CurveTo(168.0f, 52.418278f, 164.41827f, 56.0f, 160.0f, 56.0f),
                    PathNode.CurveTo(155.58173f, 56.0f, 152.0f, 52.418278f, 152.0f, 48.0f),
                    PathNode.CurveTo(152.0f, 43.581722f, 155.58173f, 40.0f, 160.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(254.32f, 193.88f),
                    PathNode.LineTo(199.76f, 101.8f),
                    PathNode.CurveTo(196.17903f, 95.70047f, 189.62294f, 91.9672f, 182.55f, 92.0f),
                    PathNode.LineTo(182.55f, 92.0f),
                    PathNode.CurveTo(175.47954f, 91.96666f, 168.9262f, 95.70055f, 165.35f, 101.8f),
                    PathNode.LineTo(146.65f, 133.35f),
                    PathNode.LineTo(109.23f, 69.85f),
                    PathNode.CurveTo(105.634476f, 63.749565f, 99.08118f, 60.00515f, 92.0f, 60.00515f),
                    PathNode.CurveTo(84.91882f, 60.00515f, 78.365524f, 63.749565f, 74.77f, 69.85f),
                    PathNode.LineTo(1.66f, 193.91f),
                    PathNode.CurveTo(-0.525211f, 197.62013f, -0.555125f, 202.21664f, 1.581612f, 205.95491f),
                    PathNode.CurveTo(3.71835f, 209.69316f, 7.694165f, 212.00006f, 12.0f, 212.0f),
                    PathNode.LineTo(244.0f, 212.0f),
                    PathNode.CurveTo(248.31166f, 211.99925f, 252.29147f, 209.68541f, 254.42531f, 205.93878f),
                    PathNode.CurveTo(256.55914f, 202.19217f, 256.51895f, 197.58876f, 254.32f, 193.88f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 87.87f),
                    PathNode.LineTo(108.57f, 116.0f),
                    PathNode.LineTo(75.43f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(33.0f, 188.0f),
                    PathNode.LineTo(61.28f, 140.0f),
                    PathNode.LineTo(122.72f, 140.0f),
                    PathNode.LineTo(151.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(178.86f, 188.0f),
                    PathNode.LineTo(160.56f, 157.0f),
                    PathNode.LineTo(182.56f, 119.9f),
                    PathNode.LineTo(222.94f, 188.0f),
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
        return _mountains!!
    }

private var _mountains: ImageVector? = null
