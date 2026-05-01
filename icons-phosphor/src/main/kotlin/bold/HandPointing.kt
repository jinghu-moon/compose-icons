package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HandPointing: ImageVector
    get() {
        if (_handPointing != null) return _handPointing!!
        _handPointing = phosphorBoldIcon(
            name = "HandPointing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(196.0f, 84.0f),
                    PathNode.CurveTo(192.17035f, 83.988625f, 188.36986f, 84.66608f, 184.78f, 86.0f),
                    PathNode.CurveTo(178.12585f, 72.30463f, 162.74313f, 65.19462f, 148.0f, 69.0f),
                    PathNode.LineTo(148.0f, 44.0f),
                    PathNode.CurveTo(148.0f, 26.326887f, 133.67311f, 12.0f, 116.0f, 12.0f),
                    PathNode.CurveTo(98.32689f, 12.0f, 84.0f, 26.326887f, 84.0f, 44.0f),
                    PathNode.LineTo(84.0f, 110.83f),
                    PathNode.CurveTo(73.1513f, 98.390465f, 54.621063f, 96.243225f, 41.215122f, 105.87219f),
                    PathNode.CurveTo(27.809177f, 115.50115f, 23.926361f, 133.74681f, 32.25f, 148.0f),
                    PathNode.LineTo(36.93f, 156.24f),
                    PathNode.CurveTo(71.11f, 216.48f, 86.72f, 244.0f, 136.0f, 244.0f),
                    PathNode.CurveTo(186.78735f, 243.94489f, 227.94489f, 202.78735f, 228.0f, 152.0f),
                    PathNode.LineTo(228.0f, 116.0f),
                    PathNode.CurveTo(228.0f, 98.32689f, 213.67311f, 84.0f, 196.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 152.0f),
                    PathNode.CurveTo(203.95592f, 189.5371f, 173.5371f, 219.95592f, 136.0f, 220.0f),
                    PathNode.CurveTo(102.0f, 220.0f, 92.51f, 205.55f, 57.8f, 144.35f),
                    PathNode.LineTo(53.11f, 136.07f),
                    PathNode.CurveTo(53.10483f, 136.04695f, 53.10483f, 136.02304f, 53.11f, 136.0f),
                    PathNode.CurveTo(50.90086f, 132.17267f, 52.212666f, 127.27914f, 56.04f, 125.07f),
                    PathNode.CurveTo(59.867332f, 122.86086f, 64.760864f, 124.17267f, 66.97f, 128.0f),
                    PathNode.CurveTo(67.03f, 128.12f, 67.1f, 128.23f, 67.17f, 128.35f),
                    PathNode.LineTo(85.85f, 158.35f),
                    PathNode.CurveTo(88.69577f, 162.86241f, 94.17883f, 164.95432f, 99.307076f, 163.48415f),
                    PathNode.CurveTo(104.43532f, 162.01396f, 107.97724f, 157.33476f, 108.0f, 152.0f),
                    PathNode.LineTo(108.0f, 44.0f),
                    PathNode.CurveTo(108.0f, 39.581722f, 111.58172f, 36.0f, 116.0f, 36.0f),
                    PathNode.CurveTo(120.41828f, 36.0f, 124.0f, 39.581722f, 124.0f, 44.0f),
                    PathNode.LineTo(124.0f, 112.0f),
                    PathNode.CurveTo(124.0f, 118.62742f, 129.37259f, 124.0f, 136.0f, 124.0f),
                    PathNode.CurveTo(142.62741f, 124.0f, 148.0f, 118.62742f, 148.0f, 112.0f),
                    PathNode.LineTo(148.0f, 100.0f),
                    PathNode.CurveTo(148.0f, 95.58172f, 151.58173f, 92.0f, 156.0f, 92.0f),
                    PathNode.CurveTo(160.41827f, 92.0f, 164.0f, 95.58172f, 164.0f, 100.0f),
                    PathNode.LineTo(164.0f, 120.0f),
                    PathNode.CurveTo(164.0f, 126.62742f, 169.37259f, 132.0f, 176.0f, 132.0f),
                    PathNode.CurveTo(182.62741f, 132.0f, 188.0f, 126.62742f, 188.0f, 120.0f),
                    PathNode.LineTo(188.0f, 116.0f),
                    PathNode.CurveTo(188.0f, 111.58172f, 191.58173f, 108.0f, 196.0f, 108.0f),
                    PathNode.CurveTo(200.41827f, 108.0f, 204.0f, 111.58172f, 204.0f, 116.0f),
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
        return _handPointing!!
    }

private var _handPointing: ImageVector? = null
