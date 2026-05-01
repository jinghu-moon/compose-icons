package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Dress: ImageVector
    get() {
        if (_dress != null) return _dress!!
        _dress = phosphorBoldIcon(
            name = "Dress",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(218.38f, 208.12f),
                    PathNode.CurveTo(218.32f, 208.0f, 218.27f, 207.87f, 218.21f, 207.75f),
                    PathNode.LineTo(173.67f, 112.88f),
                    PathNode.LineTo(193.0f, 82.56f),
                    PathNode.CurveTo(193.06f, 82.47f, 193.12f, 82.38f, 193.17f, 82.29f),
                    PathNode.CurveTo(196.97026f, 75.95631f, 196.97026f, 68.04369f, 193.17f, 61.71f),
                    PathNode.CurveTo(193.03f, 61.47f, 192.87f, 61.23f, 192.71f, 61.0f),
                    PathNode.LineTo(172.0f, 31.44f),
                    PathNode.LineTo(172.0f, 12.0f),
                    PathNode.CurveTo(172.0f, 5.372583f, 166.62741f, 0f, 160.0f, 0f),
                    PathNode.CurveTo(153.37259f, 0f, 148.0f, 5.372583f, 148.0f, 12.0f),
                    PathNode.LineTo(148.0f, 31.0f),
                    PathNode.LineTo(143.62f, 36.47f),
                    PathNode.CurveTo(139.82463f, 41.21625f, 134.07715f, 43.979378f, 128.0f, 43.979378f),
                    PathNode.CurveTo(121.92285f, 43.979378f, 116.17537f, 41.21625f, 112.38f, 36.47f),
                    PathNode.LineTo(108.0f, 31.0f),
                    PathNode.LineTo(108.0f, 12.0f),
                    PathNode.CurveTo(108.0f, 5.372583f, 102.62742f, 0f, 96.0f, 0f),
                    PathNode.CurveTo(89.37258f, 0f, 84.0f, 5.372583f, 84.0f, 12.0f),
                    PathNode.LineTo(84.0f, 31.44f),
                    PathNode.LineTo(63.31f, 61.0f),
                    PathNode.CurveTo(63.15f, 61.23f, 62.99f, 61.47f, 62.85f, 61.71f),
                    PathNode.CurveTo(59.049744f, 68.04369f, 59.049744f, 75.95631f, 62.85f, 82.29f),
                    PathNode.CurveTo(62.85f, 82.38f, 62.96f, 82.47f, 63.02f, 82.56f),
                    PathNode.LineTo(82.33f, 112.88f),
                    PathNode.LineTo(37.79f, 207.75f),
                    PathNode.CurveTo(37.73f, 207.87f, 37.68f, 208.0f, 37.62f, 208.12f),
                    PathNode.CurveTo(34.971226f, 214.29898f, 35.604023f, 221.39534f, 39.304295f, 227.00816f),
                    PathNode.CurveTo(43.004574f, 232.62099f, 49.277218f, 235.99925f, 56.0f, 236.0f),
                    PathNode.LineTo(200.0f, 236.0f),
                    PathNode.CurveTo(206.72455f, 236.00262f, 213.0003f, 232.62572f, 216.70296f, 227.01236f),
                    PathNode.CurveTo(220.40561f, 221.39897f, 221.03947f, 214.30061f, 218.39f, 208.12f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 68.0f),
                    PathNode.CurveTo(139.72504f, 68.0239f, 150.96898f, 63.34042f, 159.21f, 55.0f),
                    PathNode.LineTo(171.21f, 72.1f),
                    PathNode.LineTo(153.42f, 100.0f),
                    PathNode.LineTo(102.58f, 100.0f),
                    PathNode.LineTo(84.82f, 72.12f),
                    PathNode.LineTo(96.82f, 55.02f),
                    PathNode.CurveTo(105.05702f, 63.34566f, 116.28826f, 68.02114f, 128.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(62.31f, 212.0f),
                    PathNode.LineTo(103.62f, 124.0f),
                    PathNode.LineTo(152.38f, 124.0f),
                    PathNode.LineTo(193.69f, 212.0f),
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
        return _dress!!
    }

private var _dress: ImageVector? = null
