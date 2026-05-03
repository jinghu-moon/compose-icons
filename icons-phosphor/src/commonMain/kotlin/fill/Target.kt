package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Target: ImageVector
    get() {
        if (_target != null) return _target!!
        _target = phosphorFillIcon(
            name = "Target",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(221.87f, 83.16f),
                    PathNode.CurveTo(244.8631f, 131.24925f, 227.816f, 188.93752f, 182.37741f, 216.80495f),
                    PathNode.CurveTo(136.93881f, 244.67238f, 77.79104f, 233.71436f, 45.35121f, 191.41876f),
                    PathNode.CurveTo(12.911386f, 149.12317f, 17.6616f, 89.15674f, 56.355915f, 52.49601f),
                    PathNode.CurveTo(95.05023f, 15.835277f, 155.18558f, 14.326214f, 195.67f, 49.0f),
                    PathNode.LineTo(218.34f, 26.32f),
                    PathNode.CurveTo(221.46593f, 23.194069f, 226.53407f, 23.194069f, 229.66f, 26.32f),
                    PathNode.CurveTo(232.78593f, 29.445932f, 232.78593f, 34.51407f, 229.66f, 37.64f),
                    PathNode.LineTo(167.6f, 99.71f),
                    PathNode.LineTo(167.6f, 99.71f),
                    PathNode.LineTo(129.89f, 137.42f),
                    PathNode.LineTo(105.94f, 161.37f),
                    PathNode.CurveTo(118.56826f, 169.72255f, 134.83018f, 170.22913f, 147.95386f, 162.67879f),
                    PathNode.CurveTo(161.07751f, 155.12845f, 168.81337f, 140.8154f, 167.94f, 125.7f),
                    PathNode.CurveTo(167.69147f, 121.28172f, 171.07172f, 117.49853f, 175.49f, 117.25f),
                    PathNode.CurveTo(179.90828f, 117.00147f, 183.69147f, 120.38172f, 183.94f, 124.8f),
                    PathNode.CurveTo(185.26102f, 147.9916f, 172.12723f, 169.59099f, 150.92868f, 179.08925f),
                    PathNode.CurveTo(129.73016f, 188.58752f, 104.86856f, 184.01247f, 88.44f, 167.59f),
                    PathNode.LineTo(88.44f, 167.59f),
                    PathNode.CurveTo(67.73702f, 146.80952f, 66.57785f, 113.574554f, 85.78271f, 91.40217f),
                    PathNode.CurveTo(104.98757f, 69.22978f, 138.04782f, 65.63435f, 161.57f, 83.16f),
                    PathNode.LineTo(184.3f, 60.39f),
                    PathNode.CurveTo(149.77527f, 31.725594f, 99.20022f, 33.67621f, 66.98586f, 64.91466f),
                    PathNode.CurveTo(34.7715f, 96.1531f, 31.266474f, 146.64424f, 58.855583f, 182.03416f),
                    PathNode.CurveTo(86.444695f, 217.42409f, 136.26512f, 226.34401f, 174.41931f, 202.72487f),
                    PathNode.CurveTo(212.5735f, 179.10574f, 226.80466f, 130.53503f, 207.43f, 90.06f),
                    PathNode.CurveTo(205.52461f, 86.0725f, 207.21251f, 81.29538f, 211.2f, 79.39f),
                    PathNode.CurveTo(215.1875f, 77.48462f, 219.96461f, 79.1725f, 221.87f, 83.16f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _target!!
    }

private var _target: ImageVector? = null
