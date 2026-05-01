package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ScanSmiley: ImageVector
    get() {
        if (_scanSmiley != null) return _scanSmiley!!
        _scanSmiley = phosphorFillIcon(
            name = "ScanSmiley",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 40.0f),
                    PathNode.LineTo(224.0f, 76.0f),
                    PathNode.CurveTo(224.0f, 80.41828f, 220.41827f, 84.0f, 216.0f, 84.0f),
                    PathNode.CurveTo(211.58173f, 84.0f, 208.0f, 80.41828f, 208.0f, 76.0f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.LineTo(180.0f, 48.0f),
                    PathNode.CurveTo(175.58173f, 48.0f, 172.0f, 44.418278f, 172.0f, 40.0f),
                    PathNode.CurveTo(172.0f, 35.581722f, 175.58173f, 32.0f, 180.0f, 32.0f),
                    PathNode.LineTo(216.0f, 32.0f),
                    PathNode.CurveTo(220.41827f, 32.0f, 224.0f, 35.581722f, 224.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 172.0f),
                    PathNode.CurveTo(211.58173f, 172.0f, 208.0f, 175.58173f, 208.0f, 180.0f),
                    PathNode.LineTo(208.0f, 208.0f),
                    PathNode.LineTo(180.0f, 208.0f),
                    PathNode.CurveTo(175.58173f, 208.0f, 172.0f, 211.58173f, 172.0f, 216.0f),
                    PathNode.CurveTo(172.0f, 220.41827f, 175.58173f, 224.0f, 180.0f, 224.0f),
                    PathNode.LineTo(216.0f, 224.0f),
                    PathNode.CurveTo(220.41827f, 224.0f, 224.0f, 220.41827f, 224.0f, 216.0f),
                    PathNode.LineTo(224.0f, 180.0f),
                    PathNode.CurveTo(224.0f, 175.58173f, 220.41827f, 172.0f, 216.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.LineTo(48.0f, 180.0f),
                    PathNode.CurveTo(48.0f, 175.58173f, 44.418278f, 172.0f, 40.0f, 172.0f),
                    PathNode.CurveTo(35.581722f, 172.0f, 32.0f, 175.58173f, 32.0f, 180.0f),
                    PathNode.LineTo(32.0f, 216.0f),
                    PathNode.CurveTo(32.0f, 220.41827f, 35.581722f, 224.0f, 40.0f, 224.0f),
                    PathNode.LineTo(76.0f, 224.0f),
                    PathNode.CurveTo(80.41828f, 224.0f, 84.0f, 220.41827f, 84.0f, 216.0f),
                    PathNode.CurveTo(84.0f, 211.58173f, 80.41828f, 208.0f, 76.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 84.0f),
                    PathNode.CurveTo(44.418278f, 84.0f, 48.0f, 80.41828f, 48.0f, 76.0f),
                    PathNode.LineTo(48.0f, 48.0f),
                    PathNode.LineTo(76.0f, 48.0f),
                    PathNode.CurveTo(80.41828f, 48.0f, 84.0f, 44.418278f, 84.0f, 40.0f),
                    PathNode.CurveTo(84.0f, 35.581722f, 80.41828f, 32.0f, 76.0f, 32.0f),
                    PathNode.LineTo(40.0f, 32.0f),
                    PathNode.CurveTo(35.581722f, 32.0f, 32.0f, 35.581722f, 32.0f, 40.0f),
                    PathNode.LineTo(32.0f, 76.0f),
                    PathNode.CurveTo(32.0f, 80.41828f, 35.581722f, 84.0f, 40.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 200.0f),
                    PathNode.CurveTo(88.2355f, 200.0f, 56.0f, 167.7645f, 56.0f, 128.0f),
                    PathNode.CurveTo(56.0f, 88.2355f, 88.2355f, 56.0f, 128.0f, 56.0f),
                    PathNode.CurveTo(167.7645f, 56.0f, 200.0f, 88.2355f, 200.0f, 128.0f),
                    PathNode.CurveTo(199.95592f, 167.74623f, 167.74623f, 199.95592f, 128.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 128.0f),
                    PathNode.CurveTo(110.62742f, 128.0f, 116.0f, 122.62742f, 116.0f, 116.0f),
                    PathNode.CurveTo(116.0f, 109.37258f, 110.62742f, 104.0f, 104.0f, 104.0f),
                    PathNode.CurveTo(97.37258f, 104.0f, 92.0f, 109.37258f, 92.0f, 116.0f),
                    PathNode.CurveTo(92.0f, 122.62742f, 97.37258f, 128.0f, 104.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(158.0f, 146.71f),
                    PathNode.CurveTo(155.07816f, 143.39682f, 150.0239f, 143.07898f, 146.71f, 146.0f),
                    PathNode.CurveTo(142.9f, 149.37f, 134.71f, 152.0f, 128.0f, 152.0f),
                    PathNode.CurveTo(121.29f, 152.0f, 113.1f, 149.37f, 109.29f, 146.0f),
                    PathNode.CurveTo(107.15397f, 144.05605f, 104.13597f, 143.41435f, 101.39382f, 144.32109f),
                    PathNode.CurveTo(98.651665f, 145.22783f, 96.61115f, 147.54222f, 96.055084f, 150.37636f),
                    PathNode.CurveTo(95.49902f, 153.21051f, 96.513756f, 156.12433f, 98.71f, 158.0f),
                    PathNode.CurveTo(106.54f, 164.91f, 119.06f, 168.0f, 128.0f, 168.0f),
                    PathNode.CurveTo(136.94f, 168.0f, 149.46f, 164.91f, 157.29f, 158.0f),
                    PathNode.CurveTo(160.60318f, 155.07816f, 160.92102f, 150.0239f, 158.0f, 146.71f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 116.0f),
                    PathNode.CurveTo(164.0f, 109.37258f, 158.62741f, 104.0f, 152.0f, 104.0f),
                    PathNode.CurveTo(145.37259f, 104.0f, 140.0f, 109.37258f, 140.0f, 116.0f),
                    PathNode.CurveTo(140.0f, 122.62742f, 145.37259f, 128.0f, 152.0f, 128.0f),
                    PathNode.CurveTo(158.62741f, 128.0f, 164.0f, 122.62742f, 164.0f, 116.0f),
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
        return _scanSmiley!!
    }

private var _scanSmiley: ImageVector? = null
