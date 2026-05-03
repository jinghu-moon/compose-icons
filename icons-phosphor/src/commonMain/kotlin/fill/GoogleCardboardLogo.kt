package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GoogleCardboardLogo: ImageVector
    get() {
        if (_googleCardboardLogo != null) return _googleCardboardLogo!!
        _googleCardboardLogo = phosphorFillIcon(
            name = "GoogleCardboardLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 48.0f),
                    PathNode.LineTo(32.0f, 48.0f),
                    PathNode.CurveTo(23.163445f, 48.0f, 16.0f, 55.163445f, 16.0f, 64.0f),
                    PathNode.LineTo(16.0f, 192.0f),
                    PathNode.CurveTo(16.0f, 200.83656f, 23.163445f, 208.0f, 32.0f, 208.0f),
                    PathNode.LineTo(96.0f, 208.0f),
                    PathNode.CurveTo(98.12237f, 208.00166f, 100.158424f, 207.15993f, 101.66f, 205.66f),
                    PathNode.LineTo(128.0f, 179.31f),
                    PathNode.LineTo(154.34f, 205.66f),
                    PathNode.CurveTo(155.84158f, 207.15993f, 157.87762f, 208.00166f, 160.0f, 208.0f),
                    PathNode.LineTo(224.0f, 208.0f),
                    PathNode.CurveTo(232.83656f, 208.0f, 240.0f, 200.83656f, 240.0f, 192.0f),
                    PathNode.LineTo(240.0f, 64.0f),
                    PathNode.CurveTo(240.0f, 55.163445f, 232.83656f, 48.0f, 224.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 152.0f),
                    PathNode.CurveTo(66.74516f, 152.0f, 56.0f, 141.25484f, 56.0f, 128.0f),
                    PathNode.CurveTo(56.0f, 114.74516f, 66.74516f, 104.0f, 80.0f, 104.0f),
                    PathNode.CurveTo(93.25484f, 104.0f, 104.0f, 114.74516f, 104.0f, 128.0f),
                    PathNode.CurveTo(104.0f, 141.25484f, 93.25484f, 152.0f, 80.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 152.0f),
                    PathNode.CurveTo(162.74516f, 152.0f, 152.0f, 141.25484f, 152.0f, 128.0f),
                    PathNode.CurveTo(152.0f, 114.74516f, 162.74516f, 104.0f, 176.0f, 104.0f),
                    PathNode.CurveTo(189.25484f, 104.0f, 200.0f, 114.74516f, 200.0f, 128.0f),
                    PathNode.CurveTo(200.0f, 141.25484f, 189.25484f, 152.0f, 176.0f, 152.0f),
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
        return _googleCardboardLogo!!
    }

private var _googleCardboardLogo: ImageVector? = null
