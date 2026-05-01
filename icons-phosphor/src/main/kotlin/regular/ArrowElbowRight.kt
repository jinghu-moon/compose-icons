package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowElbowRight: ImageVector
    get() {
        if (_arrowElbowRight != null) return _arrowElbowRight!!
        _arrowElbowRight = phosphorRegularIcon(
            name = "ArrowElbowRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 80.0f),
                    PathNode.LineTo(240.0f, 152.0f),
                    PathNode.CurveTo(240.0f, 156.41827f, 236.41827f, 160.0f, 232.0f, 160.0f),
                    PathNode.CurveTo(227.58173f, 160.0f, 224.0f, 156.41827f, 224.0f, 152.0f),
                    PathNode.LineTo(224.0f, 99.31f),
                    PathNode.LineTo(125.66f, 197.66f),
                    PathNode.CurveTo(124.159454f, 199.16223f, 122.123276f, 200.00629f, 120.0f, 200.00629f),
                    PathNode.CurveTo(117.876724f, 200.00629f, 115.840546f, 199.16223f, 114.34f, 197.66f),
                    PathNode.LineTo(18.34f, 101.66f),
                    PathNode.CurveTo(15.214068f, 98.534065f, 15.214068f, 93.465935f, 18.34f, 90.34f),
                    PathNode.CurveTo(21.46593f, 87.214066f, 26.53407f, 87.214066f, 29.66f, 90.34f),
                    PathNode.LineTo(120.0f, 180.69f),
                    PathNode.LineTo(212.69f, 88.0f),
                    PathNode.LineTo(160.0f, 88.0f),
                    PathNode.CurveTo(155.58173f, 88.0f, 152.0f, 84.41828f, 152.0f, 80.0f),
                    PathNode.CurveTo(152.0f, 75.58172f, 155.58173f, 72.0f, 160.0f, 72.0f),
                    PathNode.LineTo(232.0f, 72.0f),
                    PathNode.CurveTo(236.41827f, 72.0f, 240.0f, 75.58172f, 240.0f, 80.0f),
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
        return _arrowElbowRight!!
    }

private var _arrowElbowRight: ImageVector? = null
