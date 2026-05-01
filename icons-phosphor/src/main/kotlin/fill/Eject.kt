package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Eject: ImageVector
    get() {
        if (_eject != null) return _eject!!
        _eject = phosphorFillIcon(
            name = "Eject",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(33.31f, 126.24f),
                    PathNode.CurveTo(30.76682f, 120.433784f, 31.992332f, 113.66578f, 36.41f, 109.12f),
                    PathNode.LineTo(36.41f, 109.12f),
                    PathNode.LineTo(110.14f, 31.61f),
                    PathNode.CurveTo(114.80896f, 26.74738f, 121.25876f, 23.998705f, 128.0f, 23.998705f),
                    PathNode.CurveTo(134.74124f, 23.998705f, 141.19104f, 26.74738f, 145.86f, 31.61f),
                    PathNode.LineTo(219.59f, 109.12f),
                    PathNode.CurveTo(224.00766f, 113.66578f, 225.23318f, 120.433784f, 222.69f, 126.24f),
                    PathNode.CurveTo(220.11789f, 132.19044f, 214.2425f, 136.0313f, 207.76f, 136.0f),
                    PathNode.LineTo(48.24f, 136.0f),
                    PathNode.CurveTo(41.75751f, 136.0313f, 35.88212f, 132.19044f, 33.31f, 126.24f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 152.0f),
                    PathNode.LineTo(48.0f, 152.0f),
                    PathNode.CurveTo(39.163445f, 152.0f, 32.0f, 159.16344f, 32.0f, 168.0f),
                    PathNode.LineTo(32.0f, 184.0f),
                    PathNode.CurveTo(32.0f, 192.83656f, 39.163445f, 200.0f, 48.0f, 200.0f),
                    PathNode.LineTo(208.0f, 200.0f),
                    PathNode.CurveTo(216.83656f, 200.0f, 224.0f, 192.83656f, 224.0f, 184.0f),
                    PathNode.LineTo(224.0f, 168.0f),
                    PathNode.CurveTo(224.0f, 159.16344f, 216.83656f, 152.0f, 208.0f, 152.0f),
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
        return _eject!!
    }

private var _eject: ImageVector? = null
