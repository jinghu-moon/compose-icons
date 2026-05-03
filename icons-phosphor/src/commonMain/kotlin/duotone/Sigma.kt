package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Sigma: ImageVector
    get() {
        if (_sigma != null) return _sigma!!
        _sigma = phosphorDuotoneIcon(
            name = "Sigma",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 48.0f),
                    PathNode.LineTo(192.0f, 208.0f),
                    PathNode.LineTo(64.0f, 208.0f),
                    PathNode.LineTo(128.0f, 128.0f),
                    PathNode.LineTo(64.0f, 48.0f),
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
                    PathNode.MoveTo(184.0f, 72.0f),
                    PathNode.LineTo(184.0f, 56.0f),
                    PathNode.LineTo(80.65f, 56.0f),
                    PathNode.LineTo(134.25f, 123.0f),
                    PathNode.CurveTo(136.59f, 125.92266f, 136.59f, 130.07733f, 134.25f, 133.0f),
                    PathNode.LineTo(80.65f, 200.0f),
                    PathNode.LineTo(184.0f, 200.0f),
                    PathNode.LineTo(184.0f, 184.0f),
                    PathNode.CurveTo(184.0f, 179.58173f, 187.58173f, 176.0f, 192.0f, 176.0f),
                    PathNode.CurveTo(196.41827f, 176.0f, 200.0f, 179.58173f, 200.0f, 184.0f),
                    PathNode.LineTo(200.0f, 208.0f),
                    PathNode.CurveTo(200.0f, 212.41827f, 196.41827f, 216.0f, 192.0f, 216.0f),
                    PathNode.LineTo(64.0f, 216.0f),
                    PathNode.CurveTo(60.92329f, 216.00192f, 58.1181f, 214.23924f, 56.784977f, 211.46635f),
                    PathNode.CurveTo(55.451855f, 208.69347f, 55.827057f, 205.40175f, 57.75f, 203.0f),
                    PathNode.LineTo(117.75f, 128.0f),
                    PathNode.LineTo(57.75f, 53.0f),
                    PathNode.CurveTo(55.827057f, 50.598244f, 55.451855f, 47.306534f, 56.784977f, 44.53364f),
                    PathNode.CurveTo(58.1181f, 41.76075f, 60.92329f, 39.998077f, 64.0f, 40.0f),
                    PathNode.LineTo(192.0f, 40.0f),
                    PathNode.CurveTo(196.41827f, 40.0f, 200.0f, 43.581722f, 200.0f, 48.0f),
                    PathNode.LineTo(200.0f, 72.0f),
                    PathNode.CurveTo(200.0f, 76.41828f, 196.41827f, 80.0f, 192.0f, 80.0f),
                    PathNode.CurveTo(187.58173f, 80.0f, 184.0f, 76.41828f, 184.0f, 72.0f),
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
        return _sigma!!
    }

private var _sigma: ImageVector? = null
