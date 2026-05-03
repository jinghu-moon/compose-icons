package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowElbowLeft: ImageVector
    get() {
        if (_arrowElbowLeft != null) return _arrowElbowLeft!!
        _arrowElbowLeft = phosphorRegularIcon(
            name = "ArrowElbowLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(237.66f, 101.66f),
                    PathNode.LineTo(141.66f, 197.66f),
                    PathNode.CurveTo(140.15945f, 199.16223f, 138.12328f, 200.00629f, 136.0f, 200.00629f),
                    PathNode.CurveTo(133.87672f, 200.00629f, 131.84055f, 199.16223f, 130.34f, 197.66f),
                    PathNode.LineTo(32.0f, 99.31f),
                    PathNode.LineTo(32.0f, 152.0f),
                    PathNode.CurveTo(32.0f, 156.41827f, 28.418278f, 160.0f, 24.0f, 160.0f),
                    PathNode.CurveTo(19.581722f, 160.0f, 16.0f, 156.41827f, 16.0f, 152.0f),
                    PathNode.LineTo(16.0f, 80.0f),
                    PathNode.CurveTo(16.0f, 75.58172f, 19.581722f, 72.0f, 24.0f, 72.0f),
                    PathNode.LineTo(96.0f, 72.0f),
                    PathNode.CurveTo(100.41828f, 72.0f, 104.0f, 75.58172f, 104.0f, 80.0f),
                    PathNode.CurveTo(104.0f, 84.41828f, 100.41828f, 88.0f, 96.0f, 88.0f),
                    PathNode.LineTo(43.31f, 88.0f),
                    PathNode.LineTo(136.0f, 180.69f),
                    PathNode.LineTo(226.34f, 90.34f),
                    PathNode.CurveTo(229.46593f, 87.214066f, 234.53407f, 87.214066f, 237.66f, 90.34f),
                    PathNode.CurveTo(240.78593f, 93.465935f, 240.78593f, 98.534065f, 237.66f, 101.66f),
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
        return _arrowElbowLeft!!
    }

private var _arrowElbowLeft: ImageVector? = null
