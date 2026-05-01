package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Scooter: ImageVector
    get() {
        if (_scooter != null) return _scooter!!
        _scooter = phosphorFillIcon(
            name = "Scooter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(244.0f, 172.0f),
                    PathNode.CurveTo(244.00903f, 187.3285f, 233.14684f, 200.51051f, 218.09935f, 203.4322f),
                    PathNode.CurveTo(203.05185f, 206.35388f, 188.04593f, 198.19452f, 182.31807f, 183.97641f),
                    PathNode.CurveTo(176.59023f, 169.75829f, 181.74939f, 153.4753f, 194.62f, 145.15f),
                    PathNode.LineTo(185.62f, 118.26f),
                    PathNode.LineTo(134.16f, 181.07f),
                    PathNode.CurveTo(132.6468f, 182.91699f, 130.3877f, 183.99155f, 128.0f, 184.0f),
                    PathNode.LineTo(73.66f, 184.0f),
                    PathNode.CurveTo(67.62617f, 198.92755f, 51.44077f, 207.04729f, 35.86745f, 202.9594f),
                    PathNode.CurveTo(20.294132f, 198.87152f, 10.183356f, 183.84923f, 12.259008f, 167.88268f),
                    PathNode.CurveTo(14.33466f, 151.91612f, 27.950256f, 139.97826f, 44.051132f, 140.00801f),
                    PathNode.CurveTo(60.152008f, 140.03777f, 73.72338f, 152.02588f, 75.74f, 168.0f),
                    PathNode.LineTo(124.21f, 168.0f),
                    PathNode.LineTo(179.67f, 100.31f),
                    PathNode.LineTo(162.23f, 48.0f),
                    PathNode.LineTo(136.0f, 48.0f),
                    PathNode.CurveTo(131.58173f, 48.0f, 128.0f, 44.418278f, 128.0f, 40.0f),
                    PathNode.CurveTo(128.0f, 35.581722f, 131.58173f, 32.0f, 136.0f, 32.0f),
                    PathNode.LineTo(168.0f, 32.0f),
                    PathNode.CurveTo(171.44359f, 31.999744f, 174.50096f, 34.203148f, 175.59f, 37.47f),
                    PathNode.LineTo(209.8f, 140.08f),
                    PathNode.CurveTo(210.52f, 140.03f, 211.26f, 140.0f, 212.0f, 140.0f),
                    PathNode.CurveTo(229.67311f, 140.0f, 244.0f, 154.32689f, 244.0f, 172.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _scooter!!
    }

private var _scooter: ImageVector? = null
