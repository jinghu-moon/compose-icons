package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Option: ImageVector
    get() {
        if (_option != null) return _option!!
        _option = phosphorLightIcon(
            name = "Option",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(230.0f, 192.0f),
                    PathNode.CurveTo(230.0f, 195.3137f, 227.3137f, 198.0f, 224.0f, 198.0f),
                    PathNode.LineTo(160.94f, 198.0f),
                    PathNode.CurveTo(155.63234f, 198.01793f, 150.7764f, 195.01595f, 148.42f, 190.26f),
                    PathNode.LineTo(96.84f, 87.11f),
                    PathNode.CurveTo(96.50388f, 86.433556f, 95.81534f, 86.00418f, 95.06f, 86.0f),
                    PathNode.LineTo(32.0f, 86.0f),
                    PathNode.CurveTo(28.68629f, 86.0f, 26.0f, 83.313705f, 26.0f, 80.0f),
                    PathNode.CurveTo(26.0f, 76.686295f, 28.68629f, 74.0f, 32.0f, 74.0f),
                    PathNode.LineTo(95.06f, 74.0f),
                    PathNode.CurveTo(100.36766f, 73.98207f, 105.223595f, 76.98406f, 107.58f, 81.74f),
                    PathNode.LineTo(159.16f, 184.89f),
                    PathNode.CurveTo(159.49612f, 185.56644f, 160.18466f, 185.99582f, 160.94f, 186.0f),
                    PathNode.LineTo(224.0f, 186.0f),
                    PathNode.CurveTo(227.3137f, 186.0f, 230.0f, 188.6863f, 230.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 86.0f),
                    PathNode.LineTo(224.0f, 86.0f),
                    PathNode.CurveTo(227.3137f, 86.0f, 230.0f, 83.313705f, 230.0f, 80.0f),
                    PathNode.CurveTo(230.0f, 76.686295f, 227.3137f, 74.0f, 224.0f, 74.0f),
                    PathNode.LineTo(152.0f, 74.0f),
                    PathNode.CurveTo(148.6863f, 74.0f, 146.0f, 76.686295f, 146.0f, 80.0f),
                    PathNode.CurveTo(146.0f, 83.313705f, 148.6863f, 86.0f, 152.0f, 86.0f),
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
        return _option!!
    }

private var _option: ImageVector? = null
