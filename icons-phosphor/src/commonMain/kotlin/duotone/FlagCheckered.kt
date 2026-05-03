package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FlagCheckered: ImageVector
    get() {
        if (_flagCheckered != null) return _flagCheckered!!
        _flagCheckered = phosphorDuotoneIcon(
            name = "FlagCheckered",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 56.0f),
                    PathNode.LineTo(224.0f, 116.0f),
                    PathNode.CurveTo(204.11f, 133.23f, 185.77f, 134.39f, 168.0f, 129.48f),
                    PathNode.LineTo(168.0f, 69.48f),
                    PathNode.CurveTo(185.76f, 74.39f, 204.11f, 73.23f, 224.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 102.52f),
                    PathNode.LineTo(104.0f, 42.52f),
                    PathNode.CurveTo(86.24f, 37.61f, 67.89f, 38.77f, 48.0f, 56.0f),
                    PathNode.LineTo(48.0f, 116.0f),
                    PathNode.CurveTo(67.89f, 98.78f, 86.23f, 97.61f, 104.0f, 102.52f),
                    PathNode.LineTo(104.0f, 162.52f),
                    PathNode.CurveTo(125.62f, 168.52f, 146.38f, 183.52f, 168.0f, 189.52f),
                    PathNode.LineTo(168.0f, 129.52f),
                    PathNode.CurveTo(146.38f, 123.52f, 125.62f, 108.52f, 104.0f, 102.52f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(227.32f, 48.75f),
                    PathNode.CurveTo(224.468f, 47.454987f, 221.12259f, 47.943512f, 218.76f, 50.0f),
                    PathNode.CurveTo(190.76f, 74.22f, 167.04f, 62.48f, 139.55f, 48.87f),
                    PathNode.CurveTo(111.07f, 34.76f, 78.78f, 18.79f, 42.76f, 50.0f),
                    PathNode.CurveTo(41.018864f, 51.5092f, 40.013f, 53.695854f, 40.0f, 56.0f),
                    PathNode.LineTo(40.0f, 224.0f),
                    PathNode.CurveTo(40.0f, 228.41827f, 43.581722f, 232.0f, 48.0f, 232.0f),
                    PathNode.CurveTo(52.418278f, 232.0f, 56.0f, 228.41827f, 56.0f, 224.0f),
                    PathNode.LineTo(56.0f, 179.77f),
                    PathNode.CurveTo(82.79f, 158.61f, 105.87f, 170.02f, 132.45f, 183.18f),
                    PathNode.CurveTo(160.94f, 197.27f, 193.22f, 213.24f, 229.24f, 182.05f),
                    PathNode.CurveTo(230.98114f, 180.5408f, 231.987f, 178.35414f, 232.0f, 176.05f),
                    PathNode.LineTo(232.0f, 56.0f),
                    PathNode.CurveTo(231.98883f, 52.877014f, 230.16139f, 50.04603f, 227.32f, 48.75f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 71.6f),
                    PathNode.LineTo(216.0f, 112.25f),
                    PathNode.CurveTo(202.0f, 123.31f, 189.0f, 125.47f, 176.0f, 123.13f),
                    PathNode.LineTo(176.0f, 79.34f),
                    PathNode.CurveTo(189.82791f, 81.50015f, 203.97603f, 78.76249f, 216.0f, 71.6f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 75.36f),
                    PathNode.LineTo(160.0f, 118.36f),
                    PathNode.CurveTo(153.34f, 115.69f, 146.57f, 112.36f, 139.55f, 108.88f),
                    PathNode.CurveTo(130.73f, 104.51f, 121.55f, 99.97f, 112.0f, 96.7f),
                    PathNode.LineTo(112.0f, 53.7f),
                    PathNode.CurveTo(118.66f, 56.36f, 125.43f, 59.7f, 132.45f, 63.18f),
                    PathNode.CurveTo(141.27f, 67.55f, 150.46f, 72.09f, 160.0f, 75.36f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 48.91f),
                    PathNode.LineTo(96.0f, 92.69f),
                    PathNode.CurveTo(82.170944f, 90.5337f, 68.023026f, 93.27486f, 56.0f, 100.44f),
                    PathNode.LineTo(56.0f, 59.78f),
                    PathNode.CurveTo(70.0f, 48.72f, 83.0f, 46.57f, 96.0f, 48.91f),
                    PathNode.Close,
                    PathNode.MoveTo(86.58f, 152.0f),
                    PathNode.CurveTo(75.8154f, 152.01878f, 65.253685f, 154.93034f, 56.0f, 160.43f),
                    PathNode.LineTo(56.0f, 119.78f),
                    PathNode.CurveTo(70.0f, 108.72f, 83.0f, 106.56f, 96.0f, 108.9f),
                    PathNode.LineTo(96.0f, 152.7f),
                    PathNode.CurveTo(92.8809f, 152.24065f, 89.73274f, 152.0067f, 86.58f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 156.67f),
                    PathNode.LineTo(112.0f, 113.67f),
                    PathNode.CurveTo(118.66f, 116.33f, 125.43f, 119.67f, 132.45f, 123.15f),
                    PathNode.CurveTo(141.27f, 127.52f, 150.45f, 132.05f, 160.0f, 135.32f),
                    PathNode.LineTo(160.0f, 178.32f),
                    PathNode.CurveTo(153.34f, 175.65f, 146.57f, 172.32f, 139.55f, 168.84f),
                    PathNode.CurveTo(130.73f, 164.47f, 121.54f, 159.94f, 112.0f, 156.67f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 183.12f),
                    PathNode.LineTo(176.0f, 139.32f),
                    PathNode.CurveTo(179.11862f, 139.78606f, 182.26678f, 140.02667f, 185.42f, 140.04f),
                    PathNode.CurveTo(196.18799f, 140.00667f, 206.74931f, 137.0814f, 216.0f, 131.57f),
                    PathNode.LineTo(216.0f, 172.25f),
                    PathNode.CurveTo(202.0f, 183.31f, 189.0f, 185.46f, 176.0f, 183.12f),
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
        return _flagCheckered!!
    }

private var _flagCheckered: ImageVector? = null
