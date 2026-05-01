package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Cardholder: ImageVector
    get() {
        if (_cardholder != null) return _cardholder!!
        _cardholder = phosphorFillIcon(
            name = "Cardholder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 48.0f),
                    PathNode.LineTo(48.0f, 48.0f),
                    PathNode.CurveTo(34.745167f, 48.0f, 24.0f, 58.745167f, 24.0f, 72.0f),
                    PathNode.LineTo(24.0f, 184.0f),
                    PathNode.CurveTo(24.0f, 197.25484f, 34.745167f, 208.0f, 48.0f, 208.0f),
                    PathNode.LineTo(208.0f, 208.0f),
                    PathNode.CurveTo(221.25484f, 208.0f, 232.0f, 197.25484f, 232.0f, 184.0f),
                    PathNode.LineTo(232.0f, 72.0f),
                    PathNode.CurveTo(232.0f, 58.745167f, 221.25484f, 48.0f, 208.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 120.0f),
                    PathNode.CurveTo(152.0f, 133.25484f, 141.25484f, 144.0f, 128.0f, 144.0f),
                    PathNode.CurveTo(114.74516f, 144.0f, 104.0f, 133.25484f, 104.0f, 120.0f),
                    PathNode.CurveTo(104.0f, 115.58172f, 100.41828f, 112.0f, 96.0f, 112.0f),
                    PathNode.LineTo(40.0f, 112.0f),
                    PathNode.LineTo(40.0f, 96.0f),
                    PathNode.LineTo(216.0f, 96.0f),
                    PathNode.LineTo(216.0f, 112.0f),
                    PathNode.LineTo(160.0f, 112.0f),
                    PathNode.CurveTo(155.58173f, 112.0f, 152.0f, 115.58172f, 152.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 64.0f),
                    PathNode.LineTo(208.0f, 64.0f),
                    PathNode.CurveTo(212.41827f, 64.0f, 216.0f, 67.58172f, 216.0f, 72.0f),
                    PathNode.LineTo(216.0f, 80.0f),
                    PathNode.LineTo(40.0f, 80.0f),
                    PathNode.LineTo(40.0f, 72.0f),
                    PathNode.CurveTo(40.0f, 67.58172f, 43.581722f, 64.0f, 48.0f, 64.0f),
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
        return _cardholder!!
    }

private var _cardholder: ImageVector? = null
