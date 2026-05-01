package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.StackOverflowLogo: ImageVector
    get() {
        if (_stackOverflowLogo != null) return _stackOverflowLogo!!
        _stackOverflowLogo = phosphorDuotoneIcon(
            name = "StackOverflowLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 152.0f),
                    PathNode.LineTo(208.0f, 216.0f),
                    PathNode.LineTo(48.0f, 216.0f),
                    PathNode.LineTo(48.0f, 152.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 152.09f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(216.0f, 220.41827f, 212.41827f, 224.0f, 208.0f, 224.0f),
                    PathNode.LineTo(48.0f, 224.0f),
                    PathNode.CurveTo(43.581722f, 224.0f, 40.0f, 220.41827f, 40.0f, 216.0f),
                    PathNode.LineTo(40.0f, 152.09f),
                    PathNode.CurveTo(40.0f, 147.67172f, 43.581722f, 144.09f, 48.0f, 144.09f),
                    PathNode.CurveTo(52.418278f, 144.09f, 56.0f, 147.67172f, 56.0f, 152.09f),
                    PathNode.LineTo(56.0f, 208.0f),
                    PathNode.LineTo(200.0f, 208.0f),
                    PathNode.LineTo(200.0f, 152.09f),
                    PathNode.CurveTo(200.0f, 147.67172f, 203.58173f, 144.09f, 208.0f, 144.09f),
                    PathNode.CurveTo(212.41827f, 144.09f, 216.0f, 147.67172f, 216.0f, 152.09f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 184.09f),
                    PathNode.LineTo(168.0f, 184.09f),
                    PathNode.CurveTo(172.41827f, 184.09f, 176.0f, 180.50829f, 176.0f, 176.09f),
                    PathNode.CurveTo(176.0f, 171.67172f, 172.41827f, 168.09f, 168.0f, 168.09f),
                    PathNode.LineTo(88.0f, 168.09f),
                    PathNode.CurveTo(83.58172f, 168.09f, 80.0f, 171.67172f, 80.0f, 176.09f),
                    PathNode.CurveTo(80.0f, 180.50829f, 83.58172f, 184.09f, 88.0f, 184.09f),
                    PathNode.Close,
                    PathNode.MoveTo(92.88f, 131.09f),
                    PathNode.LineTo(170.15f, 151.77f),
                    PathNode.CurveTo(170.82777f, 151.95554f, 171.5273f, 152.04971f, 172.23f, 152.05f),
                    PathNode.CurveTo(176.22003f, 152.01831f, 179.57664f, 149.05128f, 180.0979f, 145.09532f),
                    PathNode.CurveTo(180.61916f, 141.13936f, 178.14563f, 137.40414f, 174.3f, 136.34f),
                    PathNode.LineTo(97.0f, 115.61f),
                    PathNode.CurveTo(94.15332f, 114.55846f, 90.95675f, 115.20813f, 88.7464f, 117.287476f),
                    PathNode.CurveTo(86.53605f, 119.36681f, 85.69251f, 122.517784f, 86.56838f, 125.423325f),
                    PathNode.CurveTo(87.44426f, 128.32887f, 89.8887f, 130.48868f, 92.88f, 131.0f),
                    PathNode.Close,
                    PathNode.MoveTo(111.33f, 81.16f),
                    PathNode.LineTo(180.61f, 121.16f),
                    PathNode.CurveTo(182.44786f, 122.22129f, 184.6321f, 122.508804f, 186.68199f, 121.9593f),
                    PathNode.CurveTo(188.73189f, 121.40978f, 190.47943f, 120.06826f, 191.54f, 118.23f),
                    PathNode.CurveTo(193.73647f, 114.40726f, 192.42609f, 109.52801f, 188.61f, 107.32f),
                    PathNode.LineTo(119.33f, 67.27f),
                    PathNode.CurveTo(116.85009f, 65.69353f, 113.705505f, 65.60354f, 111.139496f, 67.035614f),
                    PathNode.CurveTo(108.573494f, 68.4677f, 106.99916f, 71.19129f, 107.038925f, 74.1296f),
                    PathNode.CurveTo(107.0787f, 77.06791f, 108.72617f, 79.747894f, 111.33f, 81.11f),
                    PathNode.Close,
                    PathNode.MoveTo(198.66f, 94.16f),
                    PathNode.CurveTo(201.78593f, 97.29146f, 206.85855f, 97.29593f, 209.99f, 94.17f),
                    PathNode.CurveTo(213.12146f, 91.04407f, 213.12593f, 85.97145f, 210.0f, 82.84f),
                    PathNode.LineTo(153.43f, 26.34f),
                    PathNode.CurveTo(150.28734f, 23.348907f, 145.33328f, 23.407919f, 142.26276f, 26.473015f),
                    PathNode.CurveTo(139.19225f, 29.538113f, 139.12447f, 34.49205f, 142.11f, 37.64f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _stackOverflowLogo!!
    }

private var _stackOverflowLogo: ImageVector? = null
