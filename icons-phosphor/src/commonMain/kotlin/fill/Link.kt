package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Link: ImageVector
    get() {
        if (_link != null) return _link!!
        _link = phosphorFillIcon(
            name = "Link",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(115.7f, 192.49f),
                    PathNode.CurveTo(97.22646f, 205.08179f, 72.20448f, 201.54324f, 57.946926f, 184.32271f),
                    PathNode.CurveTo(43.68937f, 167.10217f, 44.88216f, 141.85939f, 60.7f, 126.06f),
                    PathNode.LineTo(86.07f, 100.69f),
                    PathNode.CurveTo(102.99278f, 83.79818f, 130.39722f, 83.79818f, 147.32f, 100.69f),
                    PathNode.CurveTo(151.71129f, 105.05503f, 155.10568f, 110.3189f, 157.27f, 116.12f),
                    PathNode.CurveTo(158.81639f, 120.26214f, 156.71214f, 124.8736f, 152.57f, 126.42f),
                    PathNode.CurveTo(148.42787f, 127.9664f, 143.81639f, 125.86214f, 142.27f, 121.72f),
                    PathNode.CurveTo(139.00327f, 113.02683f, 131.54564f, 106.58736f, 122.46919f, 104.622475f),
                    PathNode.CurveTo(113.39274f, 102.6576f, 103.93958f, 105.43621f, 97.37f, 112.0f),
                    PathNode.LineTo(72.0f, 137.37f),
                    PathNode.CurveTo(62.03451f, 147.33583f, 61.285328f, 163.24681f, 70.270294f, 174.10493f),
                    PathNode.CurveTo(79.25527f, 184.96307f, 95.02537f, 187.20454f, 106.68f, 179.28f),
                    PathNode.CurveTo(109.036224f, 177.518f, 112.169464f, 177.19154f, 114.83832f, 178.42996f),
                    PathNode.CurveTo(117.50717f, 179.66837f, 119.28088f, 182.27177f, 119.45669f, 185.2087f),
                    PathNode.CurveTo(119.6325f, 188.14563f, 118.182045f, 190.94205f, 115.68f, 192.49f),
                    PathNode.Close,
                    PathNode.MoveTo(195.31f, 129.94f),
                    PathNode.LineTo(169.94f, 155.31f),
                    PathNode.CurveTo(161.83923f, 163.46187f, 150.81236f, 168.0318f, 139.32f, 168.0f),
                    PathNode.LineTo(139.32f, 168.0f),
                    PathNode.CurveTo(121.273926f, 167.97644f, 105.13005f, 156.77571f, 98.79f, 139.88f),
                    PathNode.CurveTo(97.2436f, 135.73787f, 99.34786f, 131.1264f, 103.49f, 129.58f),
                    PathNode.CurveTo(107.63213f, 128.0336f, 112.2436f, 130.13786f, 113.79f, 134.28f),
                    PathNode.CurveTo(117.78648f, 144.90375f, 127.9295f, 151.95493f, 139.28f, 152.0f),
                    PathNode.LineTo(139.28f, 152.0f),
                    PathNode.CurveTo(146.53003f, 152.0209f, 153.48705f, 149.14014f, 158.6f, 144.0f),
                    PathNode.LineTo(184.0f, 118.63f),
                    PathNode.CurveTo(193.96548f, 108.66417f, 194.71468f, 92.7532f, 185.7297f, 81.89506f),
                    PathNode.CurveTo(176.74474f, 71.03693f, 160.97462f, 68.795456f, 149.32f, 76.72f),
                    PathNode.CurveTo(146.96378f, 78.481995f, 143.83052f, 78.80846f, 141.16168f, 77.570045f),
                    PathNode.CurveTo(138.49283f, 76.331635f, 136.71913f, 73.728226f, 136.5433f, 70.7913f),
                    PathNode.CurveTo(136.3675f, 67.85438f, 137.81795f, 65.05796f, 140.32f, 63.51f),
                    PathNode.CurveTo(158.79495f, 50.983055f, 183.76408f, 54.54515f, 197.99913f, 71.73851f),
                    PathNode.CurveTo(212.23419f, 88.93187f, 211.0744f, 114.12711f, 195.32f, 129.94f),
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
        return _link!!
    }

private var _link: ImageVector? = null
