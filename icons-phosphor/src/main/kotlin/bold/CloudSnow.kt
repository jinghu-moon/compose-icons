package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CloudSnow: ImageVector
    get() {
        if (_cloudSnow != null) return _cloudSnow!!
        _cloudSnow = phosphorBoldIcon(
            name = "CloudSnow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 208.0f),
                    PathNode.CurveTo(184.0f, 216.83656f, 176.83656f, 224.0f, 168.0f, 224.0f),
                    PathNode.CurveTo(159.16344f, 224.0f, 152.0f, 216.83656f, 152.0f, 208.0f),
                    PathNode.CurveTo(152.0f, 199.16344f, 159.16344f, 192.0f, 168.0f, 192.0f),
                    PathNode.CurveTo(176.83656f, 192.0f, 184.0f, 199.16344f, 184.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 192.0f),
                    PathNode.CurveTo(111.163445f, 192.0f, 104.0f, 199.16344f, 104.0f, 208.0f),
                    PathNode.CurveTo(104.0f, 216.83656f, 111.163445f, 224.0f, 120.0f, 224.0f),
                    PathNode.CurveTo(128.83656f, 224.0f, 136.0f, 216.83656f, 136.0f, 208.0f),
                    PathNode.CurveTo(136.0f, 199.16344f, 128.83656f, 192.0f, 120.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 192.0f),
                    PathNode.CurveTo(63.163445f, 192.0f, 56.0f, 199.16344f, 56.0f, 208.0f),
                    PathNode.CurveTo(56.0f, 216.83656f, 63.163445f, 224.0f, 72.0f, 224.0f),
                    PathNode.CurveTo(80.836555f, 224.0f, 88.0f, 216.83656f, 88.0f, 208.0f),
                    PathNode.CurveTo(88.0f, 199.16344f, 80.836555f, 192.0f, 72.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 92.0f),
                    PathNode.CurveTo(235.9504f, 136.16223f, 200.16223f, 171.9504f, 156.0f, 172.0f),
                    PathNode.LineTo(76.0f, 172.0f),
                    PathNode.CurveTo(45.072056f, 172.0f, 20.0f, 146.92795f, 20.0f, 116.0f),
                    PathNode.CurveTo(20.0f, 85.07206f, 45.072056f, 60.0f, 76.0f, 60.0f),
                    PathNode.CurveTo(78.13508f, 59.99972f, 80.26846f, 60.11991f, 82.39f, 60.36f),
                    PathNode.CurveTo(97.42992f, 25.495687f, 134.88618f, 5.986134f, 172.07547f, 13.646238f),
                    PathNode.CurveTo(209.26474f, 21.306343f, 235.9622f, 54.030037f, 236.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 92.0f),
                    PathNode.CurveTo(211.81679f, 61.816334f, 187.76813f, 37.196396f, 157.59708f, 36.304733f),
                    PathNode.CurveTo(127.42603f, 35.41307f, 101.9654f, 58.56983f, 100.0f, 88.69f),
                    PathNode.CurveTo(99.61893f, 95.31741f, 93.937416f, 100.38107f, 87.31f, 100.0f),
                    PathNode.CurveTo(80.68259f, 99.61893f, 75.61893f, 93.937416f, 76.0f, 87.31f),
                    PathNode.CurveTo(76.06f, 86.2f, 76.15f, 85.1f, 76.26f, 84.0f),
                    PathNode.LineTo(76.0f, 84.0f),
                    PathNode.CurveTo(58.32689f, 84.0f, 44.0f, 98.32689f, 44.0f, 116.0f),
                    PathNode.CurveTo(44.0f, 133.67311f, 58.32689f, 148.0f, 76.0f, 148.0f),
                    PathNode.LineTo(156.0f, 148.0f),
                    PathNode.CurveTo(186.91423f, 147.96693f, 211.96693f, 122.91424f, 212.0f, 92.0f),
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
        return _cloudSnow!!
    }

private var _cloudSnow: ImageVector? = null
