package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.HandDeposit: ImageVector
    get() {
        if (_handDeposit != null) return _handDeposit!!
        _handDeposit = phosphorDuotoneIcon(
            name = "HandDeposit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 96.0f),
                    PathNode.LineTo(184.0f, 202.31f),
                    PathNode.LineTo(173.32f, 186.0f),
                    PathNode.CurveTo(168.40398f, 177.5346f, 158.08282f, 173.87175f, 148.93018f, 177.34431f),
                    PathNode.CurveTo(139.77751f, 180.81686f, 134.48352f, 190.40416f, 136.42f, 200.0f),
                    PathNode.LineTo(56.0f, 200.0f),
                    PathNode.LineTo(56.0f, 96.0f),
                    PathNode.CurveTo(56.0f, 91.58172f, 59.581722f, 88.0f, 64.0f, 88.0f),
                    PathNode.LineTo(176.0f, 88.0f),
                    PathNode.CurveTo(180.41827f, 88.0f, 184.0f, 91.58172f, 184.0f, 96.0f),
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
                    PathNode.MoveTo(128.0f, 35.31f),
                    PathNode.LineTo(128.0f, 128.0f),
                    PathNode.CurveTo(128.0f, 132.41827f, 124.41828f, 136.0f, 120.0f, 136.0f),
                    PathNode.CurveTo(115.58172f, 136.0f, 112.0f, 132.41827f, 112.0f, 128.0f),
                    PathNode.LineTo(112.0f, 35.31f),
                    PathNode.LineTo(93.66f, 53.66f),
                    PathNode.CurveTo(90.534065f, 56.78593f, 85.465935f, 56.78593f, 82.34f, 53.66f),
                    PathNode.CurveTo(79.214066f, 50.53407f, 79.214066f, 45.46593f, 82.34f, 42.34f),
                    PathNode.LineTo(114.34f, 10.34f),
                    PathNode.CurveTo(115.840546f, 8.837784f, 117.876724f, 7.993707f, 120.0f, 7.993707f),
                    PathNode.CurveTo(122.123276f, 7.993707f, 124.159454f, 8.837784f, 125.66f, 10.34f),
                    PathNode.LineTo(157.66f, 42.34f),
                    PathNode.CurveTo(160.78593f, 45.46593f, 160.78593f, 50.53407f, 157.66f, 53.66f),
                    PathNode.CurveTo(154.53407f, 56.78593f, 149.46593f, 56.78593f, 146.34f, 53.66f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 123.62f),
                    PathNode.LineTo(192.0f, 96.0f),
                    PathNode.CurveTo(192.0f, 87.163445f, 184.83656f, 80.0f, 176.0f, 80.0f),
                    PathNode.LineTo(160.0f, 80.0f),
                    PathNode.CurveTo(155.58173f, 80.0f, 152.0f, 83.58172f, 152.0f, 88.0f),
                    PathNode.CurveTo(152.0f, 92.41828f, 155.58173f, 96.0f, 160.0f, 96.0f),
                    PathNode.LineTo(176.0f, 96.0f),
                    PathNode.LineTo(176.0f, 176.4f),
                    PathNode.CurveTo(166.12897f, 166.31624f, 150.29666f, 165.15352f, 139.05836f, 173.68701f),
                    PathNode.CurveTo(127.82006f, 182.2205f, 124.687874f, 197.78336f, 131.75f, 210.0f),
                    PathNode.LineTo(131.99f, 210.38f),
                    PathNode.LineTo(154.25f, 244.38f),
                    PathNode.CurveTo(156.669f, 248.07755f, 161.62746f, 249.11401f, 165.325f, 246.695f),
                    PathNode.CurveTo(169.02255f, 244.27599f, 170.059f, 239.31755f, 167.64f, 235.62f),
                    PathNode.LineTo(145.51f, 201.83f),
                    PathNode.CurveTo(142.24326f, 196.06139f, 144.2714f, 188.73677f, 150.04f, 185.47f),
                    PathNode.CurveTo(155.80861f, 182.20323f, 163.13322f, 184.2314f, 166.4f, 190.0f),
                    PathNode.CurveTo(166.47f, 190.13f, 166.55f, 190.26f, 166.63f, 190.38f),
                    PathNode.LineTo(177.31f, 206.69f),
                    PathNode.CurveTo(179.2486f, 209.64644f, 182.89789f, 210.97986f, 186.28586f, 209.9697f),
                    PathNode.CurveTo(189.67381f, 208.95953f, 191.99701f, 205.84537f, 192.0f, 202.31f),
                    PathNode.LineTo(192.0f, 144.0f),
                    PathNode.CurveTo(207.24255f, 158.10974f, 215.93579f, 177.91943f, 216.0f, 198.69f),
                    PathNode.LineTo(216.0f, 240.0f),
                    PathNode.CurveTo(216.0f, 244.41827f, 219.58173f, 248.0f, 224.0f, 248.0f),
                    PathNode.CurveTo(228.41827f, 248.0f, 232.0f, 244.41827f, 232.0f, 240.0f),
                    PathNode.LineTo(232.0f, 198.65f),
                    PathNode.CurveTo(231.90808f, 168.56076f, 216.9308f, 140.46713f, 192.0f, 123.62f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 80.0f),
                    PathNode.LineTo(64.0f, 80.0f),
                    PathNode.CurveTo(55.163445f, 80.0f, 48.0f, 87.163445f, 48.0f, 96.0f),
                    PathNode.LineTo(48.0f, 200.0f),
                    PathNode.CurveTo(48.0f, 204.41827f, 51.581722f, 208.0f, 56.0f, 208.0f),
                    PathNode.CurveTo(60.418278f, 208.0f, 64.0f, 204.41827f, 64.0f, 200.0f),
                    PathNode.LineTo(64.0f, 96.0f),
                    PathNode.LineTo(80.0f, 96.0f),
                    PathNode.CurveTo(84.41828f, 96.0f, 88.0f, 92.41828f, 88.0f, 88.0f),
                    PathNode.CurveTo(88.0f, 83.58172f, 84.41828f, 80.0f, 80.0f, 80.0f),
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
        return _handDeposit!!
    }

private var _handDeposit: ImageVector? = null
