package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BaseballHelmet: ImageVector
    get() {
        if (_baseballHelmet != null) return _baseballHelmet!!
        _baseballHelmet = phosphorFillIcon(
            name = "BaseballHelmet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.0f, 120.0f),
                    PathNode.LineTo(223.7f, 120.0f),
                    PathNode.CurveTo(219.4559f, 64.2396f, 171.87738f, 21.81766f, 115.99714f, 23.970007f),
                    PathNode.CurveTo(60.116894f, 26.122349f, 15.942435f, 72.078354f, 16.0f, 128.0f),
                    PathNode.LineTo(16.0f, 152.0f),
                    PathNode.CurveTo(16.044088f, 191.74623f, 48.253773f, 223.95592f, 88.0f, 224.0f),
                    PathNode.LineTo(128.0f, 224.0f),
                    PathNode.CurveTo(167.74623f, 223.95592f, 199.95592f, 191.74623f, 200.0f, 152.0f),
                    PathNode.LineTo(200.0f, 136.0f),
                    PathNode.LineTo(248.0f, 136.0f),
                    PathNode.CurveTo(252.41827f, 136.0f, 256.0f, 132.41827f, 256.0f, 128.0f),
                    PathNode.CurveTo(256.0f, 123.58172f, 252.41827f, 120.0f, 248.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 180.0f),
                    PathNode.CurveTo(74.74516f, 180.0f, 64.0f, 169.25484f, 64.0f, 156.0f),
                    PathNode.CurveTo(64.0f, 142.74516f, 74.74516f, 132.0f, 88.0f, 132.0f),
                    PathNode.CurveTo(101.25484f, 132.0f, 112.0f, 142.74516f, 112.0f, 156.0f),
                    PathNode.CurveTo(112.0f, 169.25484f, 101.25484f, 180.0f, 88.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 152.0f),
                    PathNode.CurveTo(183.9694f, 180.7697f, 162.16582f, 204.84613f, 133.54f, 207.72f),
                    PathNode.CurveTo(150.28723f, 194.06828f, 160.00401f, 173.60646f, 160.0f, 152.0f),
                    PathNode.LineTo(160.0f, 136.0f),
                    PathNode.LineTo(184.0f, 136.0f),
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
        return _baseballHelmet!!
    }

private var _baseballHelmet: ImageVector? = null
