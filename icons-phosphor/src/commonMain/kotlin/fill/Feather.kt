package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Feather: ImageVector
    get() {
        if (_feather != null) return _feather!!
        _feather = phosphorFillIcon(
            name = "Feather",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(211.84f, 134.81f),
                    PathNode.LineTo(152.05f, 195.28f),
                    PathNode.LineTo(152.05f, 195.28f),
                    PathNode.CurveTo(149.0919f, 198.27376f, 145.05867f, 199.95908f, 140.85f, 199.96f),
                    PathNode.LineTo(75.32f, 199.96f),
                    PathNode.LineTo(45.66f, 229.66f),
                    PathNode.CurveTo(42.53407f, 232.78593f, 37.46593f, 232.78593f, 34.34f, 229.66f),
                    PathNode.CurveTo(31.21407f, 226.53407f, 31.214067f, 221.46593f, 34.34f, 218.34f),
                    PathNode.LineTo(56.93f, 195.76f),
                    PathNode.LineTo(56.93f, 195.76f),
                    PathNode.LineTo(124.7f, 128.0f),
                    PathNode.LineTo(209.0f, 128.0f),
                    PathNode.CurveTo(210.6119f, 128.00272f, 212.06467f, 128.97267f, 212.6851f, 130.46037f),
                    PathNode.CurveTo(213.30553f, 131.94809f, 212.97237f, 133.66284f, 211.84f, 134.81f),
                    PathNode.Close,
                    PathNode.MoveTo(216.7f, 30.57f),
                    PathNode.CurveTo(191.2673f, 9.640277f, 154.10207f, 11.431476f, 130.8f, 34.71f),
                    PathNode.LineTo(121.2f, 44.19f),
                    PathNode.CurveTo(120.44392f, 44.93097f, 120.0124f, 45.941444f, 120.0f, 47.0f),
                    PathNode.LineTo(120.0f, 110.0f),
                    PathNode.LineTo(175.0f, 55.0f),
                    PathNode.CurveTo(178.14531f, 52.01177f, 183.09924f, 52.075195f, 186.16702f, 55.142975f),
                    PathNode.CurveTo(189.2348f, 58.21075f, 189.29823f, 63.164684f, 186.31f, 66.31f),
                    PathNode.LineTo(140.71f, 112.0f),
                    PathNode.LineTo(229.09f, 112.0f),
                    PathNode.CurveTo(230.58743f, 112.00311f, 231.96118f, 111.1696f, 232.65f, 109.84f),
                    PathNode.CurveTo(246.7797f, 82.9741f, 240.12086f, 49.880314f, 216.7f, 30.57f),
                    PathNode.Close,
                    PathNode.MoveTo(62.83f, 167.23f),
                    PathNode.LineTo(104.0f, 126.06f),
                    PathNode.LineTo(104.0f, 70.76f),
                    PathNode.CurveTo(103.99729f, 69.1481f, 103.027336f, 67.69533f, 101.53962f, 67.074905f),
                    PathNode.CurveTo(100.05191f, 66.454475f, 98.33716f, 66.787636f, 97.19f, 67.92f),
                    PathNode.LineTo(60.69f, 104.0f),
                    PathNode.CurveTo(57.679596f, 106.99279f, 55.990906f, 111.065094f, 56.0f, 115.31f),
                    PathNode.LineTo(56.0f, 164.4f),
                    PathNode.CurveTo(55.998726f, 166.01883f, 56.97331f, 167.47882f, 58.468838f, 168.0985f),
                    PathNode.CurveTo(59.96437f, 168.71815f, 61.685955f, 168.37532f, 62.83f, 167.23f),
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
        return _feather!!
    }

private var _feather: ImageVector? = null
