package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FlagBanner: ImageVector
    get() {
        if (_flagBanner != null) return _flagBanner!!
        _flagBanner = phosphorFillIcon(
            name = "FlagBanner",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(239.22f, 59.44f),
                    PathNode.LineTo(193.59f, 155.26f),
                    PathNode.CurveTo(193.54272f, 155.37608f, 193.48932f, 155.48958f, 193.43f, 155.6f),
                    PathNode.LineTo(159.22f, 227.44f),
                    PathNode.CurveTo(158.03491f, 230.09186f, 155.50557f, 231.89302f, 152.61197f, 232.14566f),
                    PathNode.CurveTo(149.71837f, 232.3983f, 146.91516f, 231.0627f, 145.28845f, 228.65634f),
                    PathNode.CurveTo(143.66174f, 226.24998f, 143.46712f, 223.15097f, 144.78f, 220.56f),
                    PathNode.LineTo(173.62f, 160.0f),
                    PathNode.LineTo(40.0f, 160.0f),
                    PathNode.CurveTo(36.76235f, 160.00255f, 33.84236f, 158.05338f, 32.60302f, 155.06232f),
                    PathNode.CurveTo(31.36368f, 152.07126f, 32.04936f, 148.6281f, 34.34f, 146.34f),
                    PathNode.LineTo(76.69f, 104.0f),
                    PathNode.LineTo(34.34f, 61.66f),
                    PathNode.CurveTo(32.04936f, 59.371906f, 31.36368f, 55.928738f, 32.60302f, 52.93768f),
                    PathNode.CurveTo(33.84236f, 49.94662f, 36.76235f, 47.99745f, 40.0f, 48.0f),
                    PathNode.LineTo(232.0f, 48.0f),
                    PathNode.CurveTo(234.7449f, 48.000904f, 237.29768f, 49.40901f, 238.7627f, 51.73028f),
                    PathNode.CurveTo(240.22768f, 54.051548f, 240.40031f, 56.96182f, 239.22f, 59.44f),
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
        return _flagBanner!!
    }

private var _flagBanner: ImageVector? = null
