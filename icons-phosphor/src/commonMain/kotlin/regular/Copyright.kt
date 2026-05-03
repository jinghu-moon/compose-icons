package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Copyright: ImageVector
    get() {
        if (_copyright != null) return _copyright!!
        _copyright = phosphorRegularIcon(
            name = "Copyright",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 216.0f),
                    PathNode.CurveTo(79.39894f, 216.0f, 40.0f, 176.60106f, 40.0f, 128.0f),
                    PathNode.CurveTo(40.0f, 79.39894f, 79.39894f, 40.0f, 128.0f, 40.0f),
                    PathNode.CurveTo(176.60106f, 40.0f, 216.0f, 79.39894f, 216.0f, 128.0f),
                    PathNode.CurveTo(215.94489f, 176.57822f, 176.57822f, 215.94489f, 128.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 128.0f),
                    PathNode.CurveTo(96.0f, 141.77377f, 104.81377f, 154.00221f, 117.880714f, 158.35786f),
                    PathNode.CurveTo(130.94766f, 162.71352f, 145.33574f, 158.21902f, 153.6f, 147.2f),
                    PathNode.CurveTo(156.25372f, 143.66537f, 161.27037f, 142.95128f, 164.805f, 145.605f),
                    PathNode.CurveTo(168.33961f, 148.25874f, 169.05373f, 153.27538f, 166.4f, 156.81f),
                    PathNode.CurveTo(154.00069f, 173.33347f, 132.42003f, 180.07011f, 112.82264f, 173.53482f),
                    PathNode.CurveTo(93.22525f, 166.99953f, 80.0075f, 148.65836f, 80.0075f, 128.0f),
                    PathNode.CurveTo(80.0075f, 107.341644f, 93.22525f, 89.00048f, 112.82264f, 82.46518f),
                    PathNode.CurveTo(132.42003f, 75.92988f, 154.00069f, 82.66654f, 166.4f, 99.19f),
                    PathNode.CurveTo(169.05373f, 102.724625f, 168.33961f, 107.74127f, 164.805f, 110.395f),
                    PathNode.CurveTo(161.27037f, 113.04873f, 156.25372f, 112.334625f, 153.6f, 108.8f),
                    PathNode.CurveTo(145.33574f, 97.78098f, 130.94766f, 93.28648f, 117.880714f, 97.642136f),
                    PathNode.CurveTo(104.81377f, 101.99779f, 96.0f, 114.22623f, 96.0f, 128.0f),
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
        return _copyright!!
    }

private var _copyright: ImageVector? = null
