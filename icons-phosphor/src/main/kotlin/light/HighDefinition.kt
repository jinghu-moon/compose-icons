package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HighDefinition: ImageVector
    get() {
        if (_highDefinition != null) return _highDefinition!!
        _highDefinition = phosphorLightIcon(
            name = "HighDefinition",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.0f, 74.0f),
                    PathNode.LineTo(152.0f, 74.0f),
                    PathNode.CurveTo(148.6863f, 74.0f, 146.0f, 76.686295f, 146.0f, 80.0f),
                    PathNode.LineTo(146.0f, 176.0f),
                    PathNode.CurveTo(146.0f, 179.3137f, 148.6863f, 182.0f, 152.0f, 182.0f),
                    PathNode.LineTo(176.0f, 182.0f),
                    PathNode.CurveTo(205.82338f, 182.0f, 230.0f, 157.82338f, 230.0f, 128.0f),
                    PathNode.CurveTo(230.0f, 98.17662f, 205.82338f, 74.0f, 176.0f, 74.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 170.0f),
                    PathNode.LineTo(158.0f, 170.0f),
                    PathNode.LineTo(158.0f, 86.0f),
                    PathNode.LineTo(176.0f, 86.0f),
                    PathNode.CurveTo(199.19595f, 86.0f, 218.0f, 104.80404f, 218.0f, 128.0f),
                    PathNode.CurveTo(218.0f, 151.19595f, 199.19595f, 170.0f, 176.0f, 170.0f),
                    PathNode.Close,
                    PathNode.MoveTo(114.0f, 176.0f),
                    PathNode.LineTo(114.0f, 134.0f),
                    PathNode.LineTo(54.0f, 134.0f),
                    PathNode.LineTo(54.0f, 176.0f),
                    PathNode.CurveTo(54.0f, 179.3137f, 51.31371f, 182.0f, 48.0f, 182.0f),
                    PathNode.CurveTo(44.68629f, 182.0f, 42.0f, 179.3137f, 42.0f, 176.0f),
                    PathNode.LineTo(42.0f, 80.0f),
                    PathNode.CurveTo(42.0f, 76.686295f, 44.68629f, 74.0f, 48.0f, 74.0f),
                    PathNode.CurveTo(51.31371f, 74.0f, 54.0f, 76.686295f, 54.0f, 80.0f),
                    PathNode.LineTo(54.0f, 122.0f),
                    PathNode.LineTo(114.0f, 122.0f),
                    PathNode.LineTo(114.0f, 80.0f),
                    PathNode.CurveTo(114.0f, 76.686295f, 116.686295f, 74.0f, 120.0f, 74.0f),
                    PathNode.CurveTo(123.313705f, 74.0f, 126.0f, 76.686295f, 126.0f, 80.0f),
                    PathNode.LineTo(126.0f, 176.0f),
                    PathNode.CurveTo(126.0f, 179.3137f, 123.313705f, 182.0f, 120.0f, 182.0f),
                    PathNode.CurveTo(116.686295f, 182.0f, 114.0f, 179.3137f, 114.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(26.0f, 48.0f),
                    PathNode.CurveTo(26.0f, 44.68629f, 28.68629f, 42.0f, 32.0f, 42.0f),
                    PathNode.LineTo(224.0f, 42.0f),
                    PathNode.CurveTo(227.3137f, 42.0f, 230.0f, 44.68629f, 230.0f, 48.0f),
                    PathNode.CurveTo(230.0f, 51.31371f, 227.3137f, 54.0f, 224.0f, 54.0f),
                    PathNode.LineTo(32.0f, 54.0f),
                    PathNode.CurveTo(28.68629f, 54.0f, 26.0f, 51.31371f, 26.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(230.0f, 208.0f),
                    PathNode.CurveTo(230.0f, 211.3137f, 227.3137f, 214.0f, 224.0f, 214.0f),
                    PathNode.LineTo(32.0f, 214.0f),
                    PathNode.CurveTo(28.68629f, 214.0f, 26.0f, 211.3137f, 26.0f, 208.0f),
                    PathNode.CurveTo(26.0f, 204.6863f, 28.68629f, 202.0f, 32.0f, 202.0f),
                    PathNode.LineTo(224.0f, 202.0f),
                    PathNode.CurveTo(227.3137f, 202.0f, 230.0f, 204.6863f, 230.0f, 208.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _highDefinition!!
    }

private var _highDefinition: ImageVector? = null
