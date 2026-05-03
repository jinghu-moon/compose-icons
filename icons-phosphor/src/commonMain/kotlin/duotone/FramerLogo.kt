package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FramerLogo: ImageVector
    get() {
        if (_framerLogo != null) return _framerLogo!!
        _framerLogo = phosphorDuotoneIcon(
            name = "FramerLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 104.0f),
                    PathNode.LineTo(128.0f, 104.0f),
                    PathNode.LineTo(56.0f, 40.0f),
                    PathNode.LineTo(200.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 168.0f),
                    PathNode.LineTo(128.0f, 240.0f),
                    PathNode.LineTo(128.0f, 168.0f),
                    PathNode.LineTo(200.0f, 168.0f),
                    PathNode.LineTo(128.0f, 104.0f),
                    PathNode.LineTo(56.0f, 104.0f),
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
                    PathNode.MoveTo(208.0f, 104.0f),
                    PathNode.LineTo(208.0f, 40.0f),
                    PathNode.CurveTo(208.0f, 35.581722f, 204.41827f, 32.0f, 200.0f, 32.0f),
                    PathNode.LineTo(56.0f, 32.0f),
                    PathNode.CurveTo(52.669456f, 31.992289f, 49.682564f, 34.048824f, 48.50144f, 37.162907f),
                    PathNode.CurveTo(47.32031f, 40.27699f, 48.192078f, 43.79706f, 50.69f, 46.0f),
                    PathNode.LineTo(107.0f, 96.0f),
                    PathNode.LineTo(56.0f, 96.0f),
                    PathNode.CurveTo(51.581722f, 96.0f, 48.0f, 99.58172f, 48.0f, 104.0f),
                    PathNode.LineTo(48.0f, 168.0f),
                    PathNode.CurveTo(47.998333f, 170.12238f, 48.84009f, 172.15842f, 50.34f, 173.66f),
                    PathNode.LineTo(122.34f, 245.66f),
                    PathNode.CurveTo(124.62809f, 247.95064f, 128.07126f, 248.63632f, 131.06232f, 247.39697f),
                    PathNode.CurveTo(134.05338f, 246.15764f, 136.00255f, 243.23764f, 136.0f, 240.0f),
                    PathNode.LineTo(136.0f, 176.0f),
                    PathNode.LineTo(200.0f, 176.0f),
                    PathNode.CurveTo(203.33052f, 176.0077f, 206.31743f, 173.95117f, 207.49857f, 170.8371f),
                    PathNode.CurveTo(208.67969f, 167.723f, 207.80792f, 164.20294f, 205.31f, 162.0f),
                    PathNode.LineTo(149.0f, 112.0f),
                    PathNode.LineTo(200.0f, 112.0f),
                    PathNode.CurveTo(204.41827f, 112.0f, 208.0f, 108.41828f, 208.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(179.0f, 160.0f),
                    PathNode.LineTo(128.0f, 160.0f),
                    PathNode.CurveTo(123.58172f, 160.0f, 120.0f, 163.58173f, 120.0f, 168.0f),
                    PathNode.LineTo(120.0f, 220.69f),
                    PathNode.LineTo(64.0f, 164.69f),
                    PathNode.LineTo(64.0f, 112.0f),
                    PathNode.LineTo(125.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 96.0f),
                    PathNode.LineTo(131.0f, 96.0f),
                    PathNode.LineTo(77.0f, 48.0f),
                    PathNode.LineTo(192.0f, 48.0f),
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
        return _framerLogo!!
    }

private var _framerLogo: ImageVector? = null
