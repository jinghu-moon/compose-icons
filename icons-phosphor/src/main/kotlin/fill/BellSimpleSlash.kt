package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BellSimpleSlash: ImageVector
    get() {
        if (_bellSimpleSlash != null) return _bellSimpleSlash!!
        _bellSimpleSlash = phosphorFillIcon(
            name = "BellSimpleSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(221.84f, 192.0f),
                    PathNode.LineTo(221.84f, 192.0f),
                    PathNode.CurveTo(221.53961f, 192.51724f, 221.00769f, 192.85733f, 220.41214f, 192.9129f),
                    PathNode.CurveTo(219.81659f, 192.96849f, 219.23091f, 192.7327f, 218.84f, 192.28f),
                    PathNode.LineTo(83.27f, 43.19f),
                    PathNode.CurveTo(82.498856f, 42.32064f, 82.1439f, 41.158894f, 82.297485f, 40.007f),
                    PathNode.CurveTo(82.45107f, 38.855103f, 83.098015f, 37.826942f, 84.07f, 37.19f),
                    PathNode.CurveTo(97.43222f, 28.35234f, 113.151474f, 23.75507f, 129.17f, 24.0f),
                    PathNode.CurveTo(173.0f, 24.66f, 207.8f, 61.1f, 208.0f, 104.92f),
                    PathNode.CurveTo(208.14f, 139.8f, 216.31f, 166.46f, 221.82f, 175.92f),
                    PathNode.CurveTo(224.73837f, 180.88081f, 224.74602f, 187.03194f, 221.84f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 216.0f),
                    PathNode.LineTo(96.22f, 216.0f),
                    PathNode.CurveTo(91.95217f, 215.96785f, 88.37508f, 219.21857f, 88.0f, 223.47f),
                    PathNode.CurveTo(87.85313f, 225.68199f, 88.63069f, 227.85571f, 90.147194f, 229.47269f),
                    PathNode.CurveTo(91.6637f, 231.08966f, 93.783165f, 232.00487f, 96.0f, 232.0f),
                    PathNode.LineTo(159.74f, 232.0f),
                    PathNode.CurveTo(164.02313f, 232.05316f, 167.62376f, 228.7969f, 168.0f, 224.53f),
                    PathNode.CurveTo(168.14687f, 222.31801f, 167.36931f, 220.14429f, 165.85281f, 218.52731f),
                    PathNode.CurveTo(164.3363f, 216.91034f, 162.21684f, 215.99513f, 160.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(53.84f, 34.62f),
                    PathNode.CurveTo(51.9281f, 32.46484f, 49.00507f, 31.50414f, 46.18741f, 32.104855f),
                    PathNode.CurveTo(43.36975f, 32.70557f, 41.09271f, 34.774906f, 40.226048f, 37.52244f),
                    PathNode.CurveTo(39.359386f, 40.26998f, 40.036976f, 43.271305f, 42.0f, 45.38f),
                    PathNode.LineTo(58.79f, 63.85f),
                    PathNode.CurveTo(51.66758f, 76.03096f, 47.919025f, 89.88956f, 47.93f, 104.0f),
                    PathNode.CurveTo(47.93f, 139.09f, 39.78f, 166.0f, 34.23f, 175.73f),
                    PathNode.CurveTo(31.223429f, 180.89238f, 31.257896f, 187.28036f, 34.32f, 192.41f),
                    PathNode.CurveTo(37.20019f, 197.15369f, 42.36051f, 200.03572f, 47.91f, 200.0f),
                    PathNode.LineTo(182.62f, 200.0f),
                    PathNode.LineTo(202.07f, 221.38f),
                    PathNode.CurveTo(205.04129f, 224.65228f, 210.1027f, 224.89629f, 213.37502f, 221.925f),
                    PathNode.CurveTo(216.6473f, 218.9537f, 216.8913f, 213.89229f, 213.92f, 210.62f),
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
        return _bellSimpleSlash!!
    }

private var _bellSimpleSlash: ImageVector? = null
