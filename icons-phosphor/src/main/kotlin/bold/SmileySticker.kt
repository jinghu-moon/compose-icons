package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SmileySticker: ImageVector
    get() {
        if (_smileySticker != null) return _smileySticker!!
        _smileySticker = phosphorBoldIcon(
            name = "SmileySticker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 20.0f),
                    PathNode.CurveTo(85.575935f, 20.03758f, 47.10322f, 44.909492f, 29.653946f, 83.57893f),
                    PathNode.CurveTo(12.204677f, 122.24838f, 19.011183f, 167.55217f, 47.053104f, 199.38695f),
                    PathNode.CurveTo(75.09503f, 231.22174f, 119.17785f, 243.69038f, 159.74f, 231.26f),
                    PathNode.CurveTo(161.62798f, 230.6863f, 163.34534f, 229.65588f, 164.74f, 228.26f),
                    PathNode.LineTo(228.31f, 164.69f),
                    PathNode.CurveTo(229.70425f, 163.29407f, 230.7344f, 161.57713f, 231.31f, 159.69f),
                    PathNode.CurveTo(241.3296f, 126.92921f, 235.22389f, 91.358055f, 214.85304f, 63.81372f),
                    PathNode.CurveTo(194.48218f, 36.269386f, 162.25874f, 20.014015f, 128.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(209.12f, 149.91f),
                    PathNode.LineTo(149.92f, 209.11f),
                    PathNode.CurveTo(113.24809f, 218.97641f, 74.52273f, 202.97061f, 55.51793f, 170.09216f),
                    PathNode.CurveTo(36.513138f, 137.21371f, 41.97192f, 95.66806f, 68.82499f, 68.81499f),
                    PathNode.CurveTo(95.67806f, 41.961918f, 137.22371f, 36.50313f, 170.10216f, 55.50793f),
                    PathNode.CurveTo(202.9806f, 74.512726f, 218.9864f, 113.23809f, 209.12f, 149.91f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 108.0f),
                    PathNode.CurveTo(76.0f, 99.163445f, 83.163445f, 92.0f, 92.0f, 92.0f),
                    PathNode.CurveTo(100.836555f, 92.0f, 108.0f, 99.163445f, 108.0f, 108.0f),
                    PathNode.CurveTo(108.0f, 116.836555f, 100.836555f, 124.0f, 92.0f, 124.0f),
                    PathNode.CurveTo(83.163445f, 124.0f, 76.0f, 116.836555f, 76.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 108.0f),
                    PathNode.CurveTo(180.0f, 116.836555f, 172.83656f, 124.0f, 164.0f, 124.0f),
                    PathNode.CurveTo(155.16344f, 124.0f, 148.0f, 116.836555f, 148.0f, 108.0f),
                    PathNode.CurveTo(148.0f, 99.163445f, 155.16344f, 92.0f, 164.0f, 92.0f),
                    PathNode.CurveTo(172.83656f, 92.0f, 180.0f, 99.163445f, 180.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(178.39f, 158.0f),
                    PathNode.CurveTo(167.39f, 177.06f, 149.0f, 188.0f, 128.0f, 188.0f),
                    PathNode.CurveTo(107.0f, 188.0f, 88.64f, 177.07f, 77.61f, 158.0f),
                    PathNode.CurveTo(74.44228f, 152.27596f, 76.44314f, 145.0694f, 82.108444f, 141.7978f),
                    PathNode.CurveTo(87.773766f, 138.5262f, 95.015625f, 140.3953f, 98.39f, 146.0f),
                    PathNode.CurveTo(102.28f, 152.73f, 111.3f, 164.0f, 128.0f, 164.0f),
                    PathNode.CurveTo(144.7f, 164.0f, 153.72f, 152.72f, 157.61f, 146.0f),
                    PathNode.CurveTo(159.71115f, 142.20326f, 163.69836f, 139.83665f, 168.03764f, 139.81068f),
                    PathNode.CurveTo(172.37692f, 139.78471f, 176.39218f, 142.10344f, 178.5386f, 145.87477f),
                    PathNode.CurveTo(180.68504f, 149.64607f, 180.62822f, 154.28241f, 178.39f, 158.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _smileySticker!!
    }

private var _smileySticker: ImageVector? = null
