package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FlagBanner: ImageVector
    get() {
        if (_flagBanner != null) return _flagBanner!!
        _flagBanner = phosphorRegularIcon(
            name = "FlagBanner",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(238.76f, 51.73f),
                    PathNode.CurveTo(237.29544f, 49.409645f, 234.7439f, 48.001762f, 232.0f, 48.0f),
                    PathNode.LineTo(40.0f, 48.0f),
                    PathNode.CurveTo(36.76235f, 47.99745f, 33.84236f, 49.94662f, 32.60302f, 52.93768f),
                    PathNode.CurveTo(31.36368f, 55.928738f, 32.04936f, 59.371906f, 34.34f, 61.66f),
                    PathNode.LineTo(76.69f, 104.0f),
                    PathNode.LineTo(34.34f, 146.34f),
                    PathNode.CurveTo(32.04936f, 148.6281f, 31.36368f, 152.07126f, 32.60302f, 155.06232f),
                    PathNode.CurveTo(33.84236f, 158.05338f, 36.76235f, 160.00255f, 40.0f, 160.0f),
                    PathNode.LineTo(173.62f, 160.0f),
                    PathNode.LineTo(144.78f, 220.56f),
                    PathNode.CurveTo(143.46712f, 223.15097f, 143.66174f, 226.24998f, 145.28845f, 228.65634f),
                    PathNode.CurveTo(146.91516f, 231.0627f, 149.71837f, 232.3983f, 152.61197f, 232.14566f),
                    PathNode.CurveTo(155.50557f, 231.89302f, 158.03491f, 230.09186f, 159.22f, 227.44f),
                    PathNode.LineTo(239.22f, 59.44f),
                    PathNode.CurveTo(240.39961f, 56.96129f, 240.22597f, 54.05087f, 238.76f, 51.73f),
                    PathNode.Close,
                    PathNode.MoveTo(181.23f, 144.0f),
                    PathNode.LineTo(59.31f, 144.0f),
                    PathNode.LineTo(93.66f, 109.66f),
                    PathNode.CurveTo(95.16222f, 108.159454f, 96.006294f, 106.123276f, 96.006294f, 104.0f),
                    PathNode.CurveTo(96.006294f, 101.876724f, 95.16222f, 99.840546f, 93.66f, 98.34f),
                    PathNode.LineTo(59.31f, 64.0f),
                    PathNode.LineTo(219.31f, 64.0f),
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
        return _flagBanner!!
    }

private var _flagBanner: ImageVector? = null
