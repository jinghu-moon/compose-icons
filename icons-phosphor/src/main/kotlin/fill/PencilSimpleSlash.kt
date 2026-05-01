package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PencilSimpleSlash: ImageVector
    get() {
        if (_pencilSimpleSlash != null) return _pencilSimpleSlash!!
        _pencilSimpleSlash = phosphorFillIcon(
            name = "PencilSimpleSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(227.32f, 73.37f),
                    PathNode.LineTo(182.63f, 28.69f),
                    PathNode.CurveTo(179.62932f, 25.688627f, 175.5591f, 24.002417f, 171.315f, 24.002417f),
                    PathNode.CurveTo(167.0709f, 24.002417f, 163.00069f, 25.688627f, 160.0f, 28.69f),
                    PathNode.LineTo(115.64f, 73.05f),
                    PathNode.CurveTo(114.127144f, 74.55756f, 114.06551f, 76.98769f, 115.5f, 78.57f),
                    PathNode.LineTo(174.23f, 143.17f),
                    PathNode.CurveTo(174.96695f, 143.97894f, 176.00314f, 144.45064f, 177.09715f, 144.4752f),
                    PathNode.CurveTo(178.19118f, 144.49977f, 179.24748f, 144.07504f, 180.02f, 143.3f),
                    PathNode.LineTo(227.32f, 96.0f),
                    PathNode.CurveTo(230.32137f, 92.99931f, 232.00758f, 88.92911f, 232.00758f, 84.685f),
                    PathNode.CurveTo(232.00758f, 80.4409f, 230.32137f, 76.37069f, 227.32f, 73.37f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 108.69f),
                    PathNode.LineTo(147.32f, 64.0f),
                    PathNode.LineTo(171.32f, 40.0f),
                    PathNode.LineTo(216.0f, 84.69f),
                    PathNode.Close,
                    PathNode.MoveTo(213.92f, 210.62f),
                    PathNode.CurveTo(215.88303f, 212.7287f, 216.56061f, 215.73003f, 215.69395f, 218.47755f),
                    PathNode.CurveTo(214.82729f, 221.2251f, 212.55025f, 223.29443f, 209.73259f, 223.89514f),
                    PathNode.CurveTo(206.91493f, 224.49586f, 203.9919f, 223.53516f, 202.08f, 221.38f),
                    PathNode.LineTo(154.4f, 168.92f),
                    PathNode.LineTo(104.0f, 219.31f),
                    PathNode.CurveTo(101.00975f, 222.32419f, 96.93579f, 224.01357f, 92.69f, 224.0f),
                    PathNode.LineTo(48.0f, 224.0f),
                    PathNode.CurveTo(39.163445f, 224.0f, 32.0f, 216.83656f, 32.0f, 208.0f),
                    PathNode.LineTo(32.0f, 163.31f),
                    PathNode.CurveTo(31.987144f, 159.06631f, 33.67232f, 154.9938f, 36.68f, 152.0f),
                    PathNode.LineTo(90.28f, 98.4f),
                    PathNode.LineTo(42.28f, 45.58f),
                    PathNode.CurveTo(39.486805f, 42.592953f, 39.32879f, 38.00203f, 41.91f, 34.83f),
                    PathNode.CurveTo(43.39831f, 33.08106f, 45.566452f, 32.056057f, 47.86259f, 32.015877f),
                    PathNode.CurveTo(50.15873f, 31.975693f, 52.361404f, 32.924206f, 53.91f, 34.62f),
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
        return _pencilSimpleSlash!!
    }

private var _pencilSimpleSlash: ImageVector? = null
