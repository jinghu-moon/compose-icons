package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NumberSix: ImageVector
    get() {
        if (_numberSix != null) return _numberSix!!
        _numberSix = phosphorFillIcon(
            name = "NumberSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 24.0f),
                    PathNode.LineTo(56.0f, 24.0f),
                    PathNode.CurveTo(47.163445f, 24.0f, 40.0f, 31.163445f, 40.0f, 40.0f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.CurveTo(40.0f, 224.83656f, 47.163445f, 232.0f, 56.0f, 232.0f),
                    PathNode.LineTo(200.0f, 232.0f),
                    PathNode.CurveTo(208.83656f, 232.0f, 216.0f, 224.83656f, 216.0f, 216.0f),
                    PathNode.LineTo(216.0f, 40.0f),
                    PathNode.CurveTo(216.0f, 31.163445f, 208.83656f, 24.0f, 200.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 192.0f),
                    PathNode.CurveTo(112.36237f, 191.99219f, 97.90386f, 183.6852f, 90.02119f, 170.17969f),
                    PathNode.CurveTo(82.13851f, 156.67418f, 82.016235f, 139.99966f, 89.7f, 126.38f),
                    PathNode.LineTo(123.38f, 68.0f),
                    PathNode.CurveTo(125.58914f, 64.17267f, 130.48267f, 62.860863f, 134.31f, 65.07f),
                    PathNode.CurveTo(138.13733f, 67.27914f, 139.44914f, 72.17267f, 137.24f, 76.0f),
                    PathNode.LineTo(120.72f, 104.61f),
                    PathNode.CurveTo(123.12601f, 104.20877f, 125.56077f, 104.00476f, 128.0f, 104.0f),
                    PathNode.CurveTo(152.30052f, 104.0f, 172.0f, 123.69947f, 172.0f, 148.0f),
                    PathNode.CurveTo(172.0f, 172.30052f, 152.30052f, 192.0f, 128.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 148.0f),
                    PathNode.CurveTo(156.0f, 163.46397f, 143.46397f, 176.0f, 128.0f, 176.0f),
                    PathNode.CurveTo(112.536026f, 176.0f, 100.0f, 163.46397f, 100.0f, 148.0f),
                    PathNode.CurveTo(100.0f, 132.53603f, 112.536026f, 120.0f, 128.0f, 120.0f),
                    PathNode.CurveTo(143.46397f, 120.0f, 156.0f, 132.53603f, 156.0f, 148.0f),
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
        return _numberSix!!
    }

private var _numberSix: ImageVector? = null
