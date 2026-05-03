package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Ladder: ImageVector
    get() {
        if (_ladder != null) return _ladder!!
        _ladder = phosphorDuotoneIcon(
            name = "Ladder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(187.64f, 160.0f),
                    PathNode.LineTo(124.36f, 160.0f),
                    PathNode.LineTo(156.0f, 73.0f),
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
                    PathNode.MoveTo(215.52f, 213.26f),
                    PathNode.LineTo(164.51f, 73.0f),
                    PathNode.LineTo(173.6f, 48.0f),
                    PathNode.LineTo(184.0f, 48.0f),
                    PathNode.CurveTo(188.41827f, 48.0f, 192.0f, 44.418278f, 192.0f, 40.0f),
                    PathNode.CurveTo(192.0f, 35.581722f, 188.41827f, 32.0f, 184.0f, 32.0f),
                    PathNode.LineTo(88.0f, 32.0f),
                    PathNode.CurveTo(83.58172f, 32.0f, 80.0f, 35.581722f, 80.0f, 40.0f),
                    PathNode.CurveTo(80.0f, 44.418278f, 83.58172f, 48.0f, 88.0f, 48.0f),
                    PathNode.LineTo(92.58f, 48.0f),
                    PathNode.LineTo(32.48f, 213.26f),
                    PathNode.CurveTo(31.752798f, 215.25566f, 31.849072f, 217.45859f, 32.7476f, 219.38321f),
                    PathNode.CurveTo(33.646126f, 221.30782f, 35.27314f, 222.7961f, 37.27f, 223.52f),
                    PathNode.CurveTo(38.145866f, 223.8349f, 39.06925f, 223.99725f, 40.0f, 224.0f),
                    PathNode.CurveTo(43.36567f, 224.00009f, 46.371464f, 221.89363f, 47.52f, 218.73f),
                    PathNode.LineTo(57.24f, 192.0f),
                    PathNode.LineTo(104.24f, 192.0f),
                    PathNode.LineTo(96.5f, 213.26f),
                    PathNode.CurveTo(95.7728f, 215.25566f, 95.86907f, 217.45859f, 96.7676f, 219.38321f),
                    PathNode.CurveTo(97.66612f, 221.30782f, 99.29314f, 222.7961f, 101.29f, 223.52f),
                    PathNode.CurveTo(102.15954f, 223.83266f, 103.07597f, 223.99498f, 104.0f, 224.0f),
                    PathNode.CurveTo(107.36567f, 224.00009f, 110.37147f, 221.89363f, 111.52f, 218.73f),
                    PathNode.LineTo(130.0f, 168.0f),
                    PathNode.LineTo(182.0f, 168.0f),
                    PathNode.LineTo(200.45f, 218.73f),
                    PathNode.CurveTo(201.60226f, 221.90398f, 204.62334f, 224.01274f, 208.0f, 224.0f),
                    PathNode.CurveTo(208.93076f, 223.99725f, 209.85414f, 223.8349f, 210.73f, 223.52f),
                    PathNode.CurveTo(212.72685f, 222.7961f, 214.35387f, 221.30782f, 215.2524f, 219.38321f),
                    PathNode.CurveTo(216.15092f, 217.45859f, 216.2472f, 215.25566f, 215.52f, 213.26f),
                    PathNode.Close,
                    PathNode.MoveTo(127.52f, 128.0f),
                    PathNode.LineTo(80.52f, 128.0f),
                    PathNode.LineTo(92.15f, 96.0f),
                    PathNode.LineTo(139.15f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.61f, 48.0f),
                    PathNode.LineTo(144.94f, 80.0f),
                    PathNode.LineTo(98.0f, 80.0f),
                    PathNode.LineTo(109.6f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(63.06f, 176.0f),
                    PathNode.LineTo(74.7f, 144.0f),
                    PathNode.LineTo(121.7f, 144.0f),
                    PathNode.LineTo(110.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(135.78f, 152.0f),
                    PathNode.LineTo(156.0f, 96.41f),
                    PathNode.LineTo(176.21f, 152.0f),
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
        return _ladder!!
    }

private var _ladder: ImageVector? = null
