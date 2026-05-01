package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FramerLogo: ImageVector
    get() {
        if (_framerLogo != null) return _framerLogo!!
        _framerLogo = phosphorFillIcon(
            name = "FramerLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 112.0f),
                    PathNode.LineTo(149.0f, 112.0f),
                    PathNode.LineTo(205.27f, 162.0f),
                    PathNode.CurveTo(207.76244f, 164.1981f, 208.6364f, 167.7082f, 207.46564f, 170.81839f),
                    PathNode.CurveTo(206.29488f, 173.92857f, 203.32323f, 175.99109f, 200.0f, 176.0f),
                    PathNode.LineTo(136.0f, 176.0f),
                    PathNode.LineTo(136.0f, 240.0f),
                    PathNode.CurveTo(136.00255f, 243.23764f, 134.05338f, 246.15764f, 131.06232f, 247.39697f),
                    PathNode.CurveTo(128.07126f, 248.63632f, 124.62809f, 247.95064f, 122.34f, 245.66f),
                    PathNode.LineTo(50.34f, 173.66f),
                    PathNode.CurveTo(48.84009f, 172.15842f, 47.998333f, 170.12238f, 48.0f, 168.0f),
                    PathNode.LineTo(48.0f, 104.0f),
                    PathNode.CurveTo(48.0f, 99.58172f, 51.581722f, 96.0f, 56.0f, 96.0f),
                    PathNode.LineTo(107.0f, 96.0f),
                    PathNode.LineTo(50.69f, 46.0f),
                    PathNode.CurveTo(48.192078f, 43.79706f, 47.32031f, 40.27699f, 48.50144f, 37.162907f),
                    PathNode.CurveTo(49.682564f, 34.048824f, 52.669456f, 31.992289f, 56.0f, 32.0f),
                    PathNode.LineTo(200.0f, 32.0f),
                    PathNode.CurveTo(204.41827f, 32.0f, 208.0f, 35.581722f, 208.0f, 40.0f),
                    PathNode.LineTo(208.0f, 104.0f),
                    PathNode.CurveTo(208.0f, 108.41828f, 204.41827f, 112.0f, 200.0f, 112.0f),
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
        return _framerLogo!!
    }

private var _framerLogo: ImageVector? = null
