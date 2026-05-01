package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Mosque: ImageVector
    get() {
        if (_mosque != null) return _mosque!!
        _mosque = phosphorBoldIcon(
            name = "Mosque",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.0f, 124.0f),
                    PathNode.CurveTo(217.28177f, 123.98965f, 214.57327f, 124.32569f, 211.94f, 125.0f),
                    PathNode.CurveTo(210.65f, 83.46f, 182.59f, 62.68f, 161.94f, 47.42f),
                    PathNode.CurveTo(150.18f, 38.73f, 140.0f, 31.21f, 140.0f, 24.0f),
                    PathNode.CurveTo(140.0f, 17.372583f, 134.62741f, 12.0f, 128.0f, 12.0f),
                    PathNode.CurveTo(121.37258f, 12.0f, 116.0f, 17.372583f, 116.0f, 24.0f),
                    PathNode.CurveTo(116.0f, 31.21f, 105.82f, 38.73f, 94.0f, 47.45f),
                    PathNode.CurveTo(73.37f, 62.71f, 45.31f, 83.45f, 44.0f, 125.03f),
                    PathNode.CurveTo(34.41943f, 122.556305f, 24.233377f, 124.65381f, 16.409561f, 130.7114f),
                    PathNode.CurveTo(8.585746f, 136.76898f, 4.004288f, 146.10522f, 4.0f, 156.0f),
                    PathNode.LineTo(4.0f, 208.0f),
                    PathNode.CurveTo(4.0f, 214.62741f, 9.372583f, 220.0f, 16.0f, 220.0f),
                    PathNode.LineTo(240.0f, 220.0f),
                    PathNode.CurveTo(246.62741f, 220.0f, 252.0f, 214.62741f, 252.0f, 208.0f),
                    PathNode.LineTo(252.0f, 156.0f),
                    PathNode.CurveTo(252.0f, 138.32689f, 237.67311f, 124.0f, 220.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 196.0f),
                    PathNode.LineTo(28.0f, 196.0f),
                    PathNode.LineTo(28.0f, 156.0f),
                    PathNode.CurveTo(28.0f, 151.58173f, 31.581722f, 148.0f, 36.0f, 148.0f),
                    PathNode.CurveTo(40.418278f, 148.0f, 44.0f, 151.58173f, 44.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(108.31f, 66.74f),
                    PathNode.CurveTo(115.31f, 61.6f, 122.31f, 56.38f, 128.0f, 50.47f),
                    PathNode.CurveTo(133.68f, 56.38f, 140.74f, 61.6f, 147.69f, 66.74f),
                    PathNode.CurveTo(164.8f, 79.4f, 182.4f, 92.44f, 186.9f, 116.0f),
                    PathNode.LineTo(69.1f, 116.0f),
                    PathNode.CurveTo(73.6f, 92.44f, 91.2f, 79.4f, 108.31f, 66.74f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 196.0f),
                    PathNode.LineTo(164.0f, 196.0f),
                    PathNode.LineTo(164.0f, 168.0f),
                    PathNode.CurveTo(164.0f, 161.37259f, 158.62741f, 156.0f, 152.0f, 156.0f),
                    PathNode.CurveTo(145.37259f, 156.0f, 140.0f, 161.37259f, 140.0f, 168.0f),
                    PathNode.LineTo(140.0f, 196.0f),
                    PathNode.LineTo(116.0f, 196.0f),
                    PathNode.LineTo(116.0f, 168.0f),
                    PathNode.CurveTo(116.0f, 161.37259f, 110.62742f, 156.0f, 104.0f, 156.0f),
                    PathNode.CurveTo(97.37258f, 156.0f, 92.0f, 161.37259f, 92.0f, 168.0f),
                    PathNode.LineTo(92.0f, 196.0f),
                    PathNode.LineTo(68.0f, 196.0f),
                    PathNode.LineTo(68.0f, 140.0f),
                    PathNode.LineTo(188.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 196.0f),
                    PathNode.LineTo(212.0f, 196.0f),
                    PathNode.LineTo(212.0f, 156.0f),
                    PathNode.CurveTo(212.0f, 151.58173f, 215.58173f, 148.0f, 220.0f, 148.0f),
                    PathNode.CurveTo(224.41827f, 148.0f, 228.0f, 151.58173f, 228.0f, 156.0f),
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
        return _mosque!!
    }

private var _mosque: ImageVector? = null
