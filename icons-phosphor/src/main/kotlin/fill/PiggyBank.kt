package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PiggyBank: ImageVector
    get() {
        if (_piggyBank != null) return _piggyBank!!
        _piggyBank = phosphorFillIcon(
            name = "PiggyBank",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(226.0f, 88.08f),
                    PathNode.CurveTo(225.6f, 87.08f, 225.18f, 86.08f, 224.75f, 85.08f),
                    PathNode.CurveTo(218.29802f, 70.200325f, 207.85646f, 57.39496f, 194.58f, 48.08f),
                    PathNode.LineTo(216.0f, 48.08f),
                    PathNode.CurveTo(220.41827f, 48.08f, 224.0f, 44.49828f, 224.0f, 40.08f),
                    PathNode.CurveTo(224.0f, 35.66172f, 220.41827f, 32.08f, 216.0f, 32.08f),
                    PathNode.LineTo(112.0f, 32.08f),
                    PathNode.CurveTo(66.13648f, 32.138237f, 27.98569f, 67.366394f, 24.28f, 113.08f),
                    PathNode.CurveTo(10.063266f, 116.61404f, 0.06175f, 129.35072f, 0f, 144.0f),
                    PathNode.CurveTo(0f, 148.41827f, 3.581722f, 152.0f, 8.0f, 152.0f),
                    PathNode.CurveTo(12.418278f, 152.0f, 16.0f, 148.41827f, 16.0f, 144.0f),
                    PathNode.CurveTo(16.003798f, 138.0543f, 19.304256f, 132.60103f, 24.57f, 129.84f),
                    PathNode.CurveTo(26.561283f, 147.78857f, 34.045437f, 164.68468f, 46.0f, 178.22f),
                    PathNode.LineTo(58.56f, 213.38f),
                    PathNode.CurveTo(60.835278f, 219.75262f, 66.873375f, 224.00491f, 73.64f, 224.0f),
                    PathNode.LineTo(86.36f, 224.0f),
                    PathNode.CurveTo(93.122955f, 224.00069f, 99.15595f, 219.74916f, 101.43f, 213.38f),
                    PathNode.LineTo(103.35f, 208.0f),
                    PathNode.LineTo(160.65f, 208.0f),
                    PathNode.LineTo(162.57f, 213.38f),
                    PathNode.CurveTo(164.84402f, 219.74916f, 170.87704f, 224.00069f, 177.64f, 224.0f),
                    PathNode.LineTo(190.36f, 224.0f),
                    PathNode.CurveTo(197.12296f, 224.00069f, 203.15598f, 219.74916f, 205.43f, 213.38f),
                    PathNode.LineTo(221.64f, 168.0f),
                    PathNode.LineTo(224.0f, 168.0f),
                    PathNode.CurveTo(237.25484f, 168.0f, 248.0f, 157.25484f, 248.0f, 144.0f),
                    PathNode.LineTo(248.0f, 112.0f),
                    PathNode.CurveTo(248.0018f, 99.519196f, 238.4374f, 89.12006f, 226.0f, 88.08f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 72.0f),
                    PathNode.LineTo(112.0f, 72.0f),
                    PathNode.CurveTo(107.58172f, 72.0f, 104.0f, 68.41828f, 104.0f, 64.0f),
                    PathNode.CurveTo(104.0f, 59.581722f, 107.58172f, 56.0f, 112.0f, 56.0f),
                    PathNode.LineTo(152.0f, 56.0f),
                    PathNode.CurveTo(156.41827f, 56.0f, 160.0f, 59.581722f, 160.0f, 64.0f),
                    PathNode.CurveTo(160.0f, 68.41828f, 156.41827f, 72.0f, 152.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 128.0f),
                    PathNode.CurveTo(173.37259f, 128.0f, 168.0f, 122.62742f, 168.0f, 116.0f),
                    PathNode.CurveTo(168.0f, 109.37258f, 173.37259f, 104.0f, 180.0f, 104.0f),
                    PathNode.CurveTo(186.62741f, 104.0f, 192.0f, 109.37258f, 192.0f, 116.0f),
                    PathNode.CurveTo(192.0f, 122.62742f, 186.62741f, 128.0f, 180.0f, 128.0f),
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
        return _piggyBank!!
    }

private var _piggyBank: ImageVector? = null
