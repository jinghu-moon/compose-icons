package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.NuclearPlant: ImageVector
    get() {
        if (_nuclearPlant != null) return _nuclearPlant!!
        _nuclearPlant = phosphorRegularIcon(
            name = "NuclearPlant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(152.0f, 32.0f),
                    PathNode.LineTo(176.0f, 32.0f),
                    PathNode.CurveTo(180.41827f, 32.0f, 184.0f, 28.418278f, 184.0f, 24.0f),
                    PathNode.CurveTo(184.0f, 19.581722f, 187.58173f, 16.0f, 192.0f, 16.0f),
                    PathNode.CurveTo(196.41827f, 16.0f, 200.0f, 19.581722f, 200.0f, 24.0f),
                    PathNode.CurveTo(200.0f, 37.254833f, 189.25484f, 48.0f, 176.0f, 48.0f),
                    PathNode.LineTo(152.0f, 48.0f),
                    PathNode.CurveTo(147.58173f, 48.0f, 144.0f, 51.581722f, 144.0f, 56.0f),
                    PathNode.CurveTo(144.0f, 60.418278f, 140.41827f, 64.0f, 136.0f, 64.0f),
                    PathNode.CurveTo(131.58173f, 64.0f, 128.0f, 60.418278f, 128.0f, 56.0f),
                    PathNode.CurveTo(128.0f, 42.745167f, 138.74516f, 32.0f, 152.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 64.0f),
                    PathNode.CurveTo(108.41828f, 64.0f, 112.0f, 60.418278f, 112.0f, 56.0f),
                    PathNode.CurveTo(112.0f, 33.90861f, 129.90862f, 16.0f, 152.0f, 16.0f),
                    PathNode.LineTo(160.0f, 16.0f),
                    PathNode.CurveTo(164.41827f, 16.0f, 168.0f, 12.418278f, 168.0f, 8.0f),
                    PathNode.CurveTo(168.0f, 3.581722f, 164.41827f, 0f, 160.0f, 0f),
                    PathNode.LineTo(152.0f, 0f),
                    PathNode.CurveTo(121.08576f, 0.033069f, 96.033066f, 25.085762f, 96.0f, 56.0f),
                    PathNode.CurveTo(96.0f, 60.418278f, 99.58172f, 64.0f, 104.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(248.0f, 216.0f),
                    PathNode.CurveTo(248.0f, 220.41827f, 244.41827f, 224.0f, 240.0f, 224.0f),
                    PathNode.LineTo(16.0f, 224.0f),
                    PathNode.CurveTo(11.581722f, 224.0f, 8.0f, 220.41827f, 8.0f, 216.0f),
                    PathNode.CurveTo(8.0f, 211.58173f, 11.581722f, 208.0f, 16.0f, 208.0f),
                    PathNode.LineTo(32.74f, 208.0f),
                    PathNode.CurveTo(46.51f, 180.17f, 62.22f, 139.31f, 63.86f, 95.34f),
                    PathNode.CurveTo(64.16798f, 86.74541f, 71.25003f, 79.95124f, 79.85f, 80.0f),
                    PathNode.LineTo(168.18f, 80.0f),
                    PathNode.CurveTo(176.74284f, 79.991325f, 183.79468f, 86.72582f, 184.18f, 95.28f),
                    PathNode.CurveTo(186.28f, 143.12f, 208.02f, 187.65f, 219.47f, 208.0f),
                    PathNode.LineTo(240.0f, 208.0f),
                    PathNode.CurveTo(244.41827f, 208.0f, 248.0f, 211.58173f, 248.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.18f, 96.0f),
                    PathNode.LineTo(152.18f, 96.0f),
                    PathNode.CurveTo(153.95f, 139.72f, 169.57f, 180.32f, 183.27f, 208.0f),
                    PathNode.LineTo(201.27f, 208.0f),
                    PathNode.CurveTo(188.68f, 184.08f, 170.18f, 141.64f, 168.18f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(50.5f, 208.0f),
                    PathNode.LineTo(165.5f, 208.0f),
                    PathNode.CurveTo(152.0f, 179.09f, 137.77f, 139.09f, 136.15f, 96.0f),
                    PathNode.CurveTo(135.81572f, 96.002426f, 135.48161f, 95.98238f, 135.15f, 95.94f),
                    PathNode.LineTo(79.85f, 96.0f),
                    PathNode.CurveTo(78.24f, 139.06f, 64.06f, 179.07f, 50.5f, 208.0f),
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
        return _nuclearPlant!!
    }

private var _nuclearPlant: ImageVector? = null
