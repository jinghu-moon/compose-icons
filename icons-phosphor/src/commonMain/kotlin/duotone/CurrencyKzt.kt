package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CurrencyKzt: ImageVector
    get() {
        if (_currencyKzt != null) return _currencyKzt!!
        _currencyKzt = phosphorDuotoneIcon(
            name = "CurrencyKzt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 56.0f),
                    PathNode.LineTo(200.0f, 96.0f),
                    PathNode.LineTo(56.0f, 96.0f),
                    PathNode.LineTo(56.0f, 56.0f),
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
                    PathNode.MoveTo(208.0f, 96.0f),
                    PathNode.CurveTo(208.0f, 100.41828f, 204.41827f, 104.0f, 200.0f, 104.0f),
                    PathNode.LineTo(136.0f, 104.0f),
                    PathNode.LineTo(136.0f, 216.0f),
                    PathNode.CurveTo(136.0f, 220.41827f, 132.41827f, 224.0f, 128.0f, 224.0f),
                    PathNode.CurveTo(123.58172f, 224.0f, 120.0f, 220.41827f, 120.0f, 216.0f),
                    PathNode.LineTo(120.0f, 104.0f),
                    PathNode.LineTo(56.0f, 104.0f),
                    PathNode.CurveTo(51.581722f, 104.0f, 48.0f, 100.41828f, 48.0f, 96.0f),
                    PathNode.CurveTo(48.0f, 91.58172f, 51.581722f, 88.0f, 56.0f, 88.0f),
                    PathNode.LineTo(200.0f, 88.0f),
                    PathNode.CurveTo(204.41827f, 88.0f, 208.0f, 91.58172f, 208.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 64.0f),
                    PathNode.LineTo(200.0f, 64.0f),
                    PathNode.CurveTo(204.41827f, 64.0f, 208.0f, 60.418278f, 208.0f, 56.0f),
                    PathNode.CurveTo(208.0f, 51.581722f, 204.41827f, 48.0f, 200.0f, 48.0f),
                    PathNode.LineTo(56.0f, 48.0f),
                    PathNode.CurveTo(51.581722f, 48.0f, 48.0f, 51.581722f, 48.0f, 56.0f),
                    PathNode.CurveTo(48.0f, 60.418278f, 51.581722f, 64.0f, 56.0f, 64.0f),
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
        return _currencyKzt!!
    }

private var _currencyKzt: ImageVector? = null
