package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FlowArrow: ImageVector
    get() {
        if (_flowArrow != null) return _flowArrow!!
        _flowArrow = phosphorDuotoneIcon(
            name = "FlowArrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(80.0f, 176.0f),
                    PathNode.CurveTo(80.0f, 193.67311f, 65.67311f, 208.0f, 48.0f, 208.0f),
                    PathNode.CurveTo(30.326887f, 208.0f, 16.0f, 193.67311f, 16.0f, 176.0f),
                    PathNode.CurveTo(16.0f, 158.32689f, 30.326887f, 144.0f, 48.0f, 144.0f),
                    PathNode.CurveTo(65.67311f, 144.0f, 80.0f, 158.32689f, 80.0f, 176.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(245.66f, 74.34f),
                    PathNode.LineTo(213.66f, 42.34f),
                    PathNode.CurveTo(210.53407f, 39.21407f, 205.46593f, 39.21407f, 202.34f, 42.34f),
                    PathNode.CurveTo(199.21407f, 45.46593f, 199.21407f, 50.53407f, 202.34f, 53.66f),
                    PathNode.LineTo(220.69f, 72.0f),
                    PathNode.LineTo(208.0f, 72.0f),
                    PathNode.CurveTo(158.67f, 72.0f, 146.95f, 100.12f, 136.62f, 124.92f),
                    PathNode.CurveTo(127.24f, 147.43f, 119.7f, 165.51f, 87.14f, 167.76f),
                    PathNode.CurveTo(82.90734f, 147.6664f, 64.14715f, 134.04181f, 43.729874f, 136.23341f),
                    PathNode.CurveTo(23.312601f, 138.425f, 7.871404f, 155.72078f, 7.999743f, 176.25494f),
                    PathNode.CurveTo(8.128082f, 196.7891f, 23.78426f, 213.89052f, 44.227333f, 215.82674f),
                    PathNode.CurveTo(64.6704f, 217.76295f, 83.258835f, 203.90494f, 87.24f, 183.76f),
                    PathNode.CurveTo(130.5f, 181.11f, 141.58f, 154.61f, 151.38f, 131.07f),
                    PathNode.CurveTo(161.41f, 107.0f, 169.33f, 88.0f, 208.0f, 88.0f),
                    PathNode.LineTo(220.69f, 88.0f),
                    PathNode.LineTo(202.34f, 106.34f),
                    PathNode.CurveTo(199.21407f, 109.465935f, 199.21407f, 114.534065f, 202.34f, 117.66f),
                    PathNode.CurveTo(205.46593f, 120.785934f, 210.53407f, 120.785934f, 213.66f, 117.66f),
                    PathNode.LineTo(245.66f, 85.66f),
                    PathNode.CurveTo(247.16223f, 84.159454f, 248.00629f, 82.123276f, 248.00629f, 80.0f),
                    PathNode.CurveTo(248.00629f, 77.876724f, 247.16223f, 75.840546f, 245.66f, 74.34f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 200.0f),
                    PathNode.CurveTo(34.745167f, 200.0f, 24.0f, 189.25484f, 24.0f, 176.0f),
                    PathNode.CurveTo(24.0f, 162.74516f, 34.745167f, 152.0f, 48.0f, 152.0f),
                    PathNode.CurveTo(61.254833f, 152.0f, 72.0f, 162.74516f, 72.0f, 176.0f),
                    PathNode.CurveTo(72.0f, 189.25484f, 61.254833f, 200.0f, 48.0f, 200.0f),
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
        return _flowArrow!!
    }

private var _flowArrow: ImageVector? = null
