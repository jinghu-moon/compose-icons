package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MopedFront: ImageVector
    get() {
        if (_mopedFront != null) return _mopedFront!!
        _mopedFront = phosphorBoldIcon(
            name = "MopedFront",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 36.0f),
                    PathNode.LineTo(170.32f, 36.0f),
                    PathNode.CurveTo(164.93855f, 17.088116f, 147.66264f, 4.042326f, 128.0f, 4.042326f),
                    PathNode.CurveTo(108.33736f, 4.042326f, 91.061455f, 17.088116f, 85.68f, 36.0f),
                    PathNode.LineTo(48.0f, 36.0f),
                    PathNode.CurveTo(41.37258f, 36.0f, 36.0f, 41.37258f, 36.0f, 48.0f),
                    PathNode.CurveTo(36.0f, 54.62742f, 41.37258f, 60.0f, 48.0f, 60.0f),
                    PathNode.LineTo(85.68f, 60.0f),
                    PathNode.CurveTo(87.42266f, 66.16683f, 90.49461f, 71.87725f, 94.68f, 76.73f),
                    PathNode.CurveTo(73.26063f, 88.76995f, 60.002575f, 111.42867f, 60.0f, 136.0f),
                    PathNode.LineTo(60.0f, 200.0f),
                    PathNode.CurveTo(60.0f, 211.0457f, 68.95431f, 220.0f, 80.0f, 220.0f),
                    PathNode.LineTo(96.0f, 220.0f),
                    PathNode.CurveTo(96.0f, 237.67311f, 110.32689f, 252.0f, 128.0f, 252.0f),
                    PathNode.CurveTo(145.67311f, 252.0f, 160.0f, 237.67311f, 160.0f, 220.0f),
                    PathNode.LineTo(176.0f, 220.0f),
                    PathNode.CurveTo(187.0457f, 220.0f, 196.0f, 211.0457f, 196.0f, 200.0f),
                    PathNode.LineTo(196.0f, 136.0f),
                    PathNode.CurveTo(195.9893f, 111.420296f, 182.7148f, 88.7596f, 161.28f, 76.73f),
                    PathNode.CurveTo(165.4654f, 71.87725f, 168.53734f, 66.16683f, 170.28f, 60.0f),
                    PathNode.LineTo(208.0f, 60.0f),
                    PathNode.CurveTo(214.62741f, 60.0f, 220.0f, 54.62742f, 220.0f, 48.0f),
                    PathNode.CurveTo(220.0f, 41.37258f, 214.62741f, 36.0f, 208.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 220.0f),
                    PathNode.CurveTo(136.0f, 224.41827f, 132.41827f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(123.58172f, 228.0f, 120.0f, 224.41827f, 120.0f, 220.0f),
                    PathNode.LineTo(120.0f, 164.0f),
                    PathNode.CurveTo(120.0f, 159.58173f, 123.58172f, 156.0f, 128.0f, 156.0f),
                    PathNode.CurveTo(132.41827f, 156.0f, 136.0f, 159.58173f, 136.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 196.0f),
                    PathNode.LineTo(160.0f, 196.0f),
                    PathNode.LineTo(160.0f, 164.0f),
                    PathNode.CurveTo(160.0f, 146.32689f, 145.67311f, 132.0f, 128.0f, 132.0f),
                    PathNode.CurveTo(110.32689f, 132.0f, 96.0f, 146.32689f, 96.0f, 164.0f),
                    PathNode.LineTo(96.0f, 196.0f),
                    PathNode.LineTo(84.0f, 196.0f),
                    PathNode.LineTo(84.0f, 136.0f),
                    PathNode.CurveTo(84.0f, 111.69947f, 103.69947f, 92.0f, 128.0f, 92.0f),
                    PathNode.CurveTo(152.30052f, 92.0f, 172.0f, 111.69947f, 172.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 48.0f),
                    PathNode.CurveTo(108.0f, 36.954304f, 116.95431f, 28.0f, 128.0f, 28.0f),
                    PathNode.CurveTo(139.0457f, 28.0f, 148.0f, 36.954304f, 148.0f, 48.0f),
                    PathNode.CurveTo(148.0f, 59.045696f, 139.0457f, 68.0f, 128.0f, 68.0f),
                    PathNode.CurveTo(116.95431f, 68.0f, 108.0f, 59.045696f, 108.0f, 48.0f),
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
        return _mopedFront!!
    }

private var _mopedFront: ImageVector? = null
