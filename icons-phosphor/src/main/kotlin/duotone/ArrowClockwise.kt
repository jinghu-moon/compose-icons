package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowClockwise: ImageVector
    get() {
        if (_arrowClockwise != null) return _arrowClockwise!!
        _arrowClockwise = phosphorDuotoneIcon(
            name = "ArrowClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 128.0f),
                    PathNode.CurveTo(216.0f, 176.60106f, 176.60106f, 216.0f, 128.0f, 216.0f),
                    PathNode.CurveTo(79.39894f, 216.0f, 40.0f, 176.60106f, 40.0f, 128.0f),
                    PathNode.CurveTo(40.0f, 79.39894f, 79.39894f, 40.0f, 128.0f, 40.0f),
                    PathNode.CurveTo(176.60106f, 40.0f, 216.0f, 79.39894f, 216.0f, 128.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 56.0f),
                    PathNode.LineTo(240.0f, 104.0f),
                    PathNode.CurveTo(240.0f, 108.41828f, 236.41827f, 112.0f, 232.0f, 112.0f),
                    PathNode.LineTo(184.0f, 112.0f),
                    PathNode.CurveTo(179.58173f, 112.0f, 176.0f, 108.41828f, 176.0f, 104.0f),
                    PathNode.CurveTo(176.0f, 99.58172f, 179.58173f, 96.0f, 184.0f, 96.0f),
                    PathNode.LineTo(211.4f, 96.0f),
                    PathNode.LineTo(184.81f, 71.64f),
                    PathNode.LineTo(184.56f, 71.4f),
                    PathNode.CurveTo(153.52902f, 40.380768f, 103.303955f, 40.143543f, 71.98134f, 70.86826f),
                    PathNode.CurveTo(40.65872f, 101.59298f, 39.928036f, 151.81328f, 70.34352f, 183.43628f),
                    PathNode.CurveTo(100.75901f, 215.05925f, 150.96971f, 216.28331f, 182.89f, 186.18f),
                    PathNode.CurveTo(186.10153f, 183.14244f, 191.16743f, 183.28346f, 194.205f, 186.495f),
                    PathNode.CurveTo(197.24257f, 189.70654f, 197.10153f, 194.77243f, 193.89f, 197.81f),
                    PathNode.CurveTo(176.10474f, 214.67729f, 152.5116f, 224.0551f, 128.0f, 224.0f),
                    PathNode.LineTo(126.68f, 224.0f),
                    PathNode.CurveTo(83.41898f, 223.40747f, 45.899727f, 193.95045f, 35.05784f, 152.06586f),
                    PathNode.CurveTo(24.215944f, 110.18126f, 42.73071f, 66.21975f, 80.27096f, 44.7117f),
                    PathNode.CurveTo(117.8112f, 23.20365f, 165.09985f, 29.464205f, 195.75f, 60.0f),
                    PathNode.LineTo(224.0f, 85.8f),
                    PathNode.LineTo(224.0f, 56.0f),
                    PathNode.CurveTo(224.0f, 51.581722f, 227.58173f, 48.0f, 232.0f, 48.0f),
                    PathNode.CurveTo(236.41827f, 48.0f, 240.0f, 51.581722f, 240.0f, 56.0f),
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
        return _arrowClockwise!!
    }

private var _arrowClockwise: ImageVector? = null
