package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Eject: ImageVector
    get() {
        if (_eject != null) return _eject!!
        _eject = phosphorDuotoneIcon(
            name = "Eject",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 168.0f),
                    PathNode.LineTo(216.0f, 192.0f),
                    PathNode.CurveTo(216.0f, 196.41827f, 212.41827f, 200.0f, 208.0f, 200.0f),
                    PathNode.LineTo(48.0f, 200.0f),
                    PathNode.CurveTo(43.581722f, 200.0f, 40.0f, 196.41827f, 40.0f, 192.0f),
                    PathNode.LineTo(40.0f, 168.0f),
                    PathNode.CurveTo(40.0f, 163.58173f, 43.581722f, 160.0f, 48.0f, 160.0f),
                    PathNode.LineTo(208.0f, 160.0f),
                    PathNode.CurveTo(212.41827f, 160.0f, 216.0f, 163.58173f, 216.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.23f, 128.0f),
                    PathNode.LineTo(207.77f, 128.0f),
                    PathNode.CurveTo(214.93f, 128.0f, 218.66f, 119.73f, 213.77f, 114.63f),
                    PathNode.LineTo(140.03f, 37.13f),
                    PathNode.CurveTo(136.87083f, 33.85078f, 132.51341f, 31.9981f, 127.96f, 31.9981f),
                    PathNode.CurveTo(123.406586f, 31.9981f, 119.04916f, 33.85078f, 115.89f, 37.13f),
                    PathNode.LineTo(42.15f, 114.63f),
                    PathNode.CurveTo(37.34f, 119.73f, 41.07f, 128.0f, 48.23f, 128.0f),
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
                    PathNode.MoveTo(208.0f, 152.0f),
                    PathNode.LineTo(48.0f, 152.0f),
                    PathNode.CurveTo(39.163445f, 152.0f, 32.0f, 159.16344f, 32.0f, 168.0f),
                    PathNode.LineTo(32.0f, 192.0f),
                    PathNode.CurveTo(32.0f, 200.83656f, 39.163445f, 208.0f, 48.0f, 208.0f),
                    PathNode.LineTo(208.0f, 208.0f),
                    PathNode.CurveTo(216.83656f, 208.0f, 224.0f, 200.83656f, 224.0f, 192.0f),
                    PathNode.LineTo(224.0f, 168.0f),
                    PathNode.CurveTo(224.0f, 159.16344f, 216.83656f, 152.0f, 208.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 192.0f),
                    PathNode.LineTo(48.0f, 192.0f),
                    PathNode.LineTo(48.0f, 168.0f),
                    PathNode.LineTo(208.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.24f, 136.0f),
                    PathNode.LineTo(207.76f, 136.0f),
                    PathNode.CurveTo(214.2425f, 136.0313f, 220.11789f, 132.19044f, 222.69f, 126.24f),
                    PathNode.CurveTo(225.23318f, 120.433784f, 224.00766f, 113.66578f, 219.59f, 109.12f),
                    PathNode.LineTo(145.86f, 31.61f),
                    PathNode.CurveTo(141.19104f, 26.74738f, 134.74124f, 23.998705f, 128.0f, 23.998705f),
                    PathNode.CurveTo(121.25876f, 23.998705f, 114.80896f, 26.74738f, 110.14f, 31.61f),
                    PathNode.LineTo(36.41f, 109.12f),
                    PathNode.LineTo(36.41f, 109.12f),
                    PathNode.CurveTo(31.992332f, 113.66578f, 30.76682f, 120.433784f, 33.31f, 126.24f),
                    PathNode.CurveTo(35.88212f, 132.19044f, 41.75751f, 136.0313f, 48.24f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(121.73f, 42.64f),
                    PathNode.CurveTo(123.37995f, 40.952885f, 125.64019f, 40.001884f, 128.0f, 40.001884f),
                    PathNode.CurveTo(130.35982f, 40.001884f, 132.62004f, 40.952885f, 134.27f, 42.64f),
                    PathNode.LineTo(207.85f, 120.0f),
                    PathNode.LineTo(48.14f, 120.0f),
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
        return _eject!!
    }

private var _eject: ImageVector? = null
