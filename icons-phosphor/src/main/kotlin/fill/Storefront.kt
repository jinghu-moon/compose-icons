package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Storefront: ImageVector
    get() {
        if (_storefront != null) return _storefront!!
        _storefront = phosphorFillIcon(
            name = "Storefront",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(231.69f, 93.81f),
                    PathNode.LineTo(217.35f, 43.6f),
                    PathNode.CurveTo(215.36908f, 36.759106f, 209.12183f, 32.038055f, 202.0f, 32.0f),
                    PathNode.LineTo(54.0f, 32.0f),
                    PathNode.CurveTo(46.878174f, 32.038055f, 40.63092f, 36.759106f, 38.65f, 43.6f),
                    PathNode.LineTo(24.31f, 93.81f),
                    PathNode.CurveTo(24.104998f, 94.521965f, 24.000652f, 95.25911f, 24.0f, 96.0f),
                    PathNode.LineTo(24.0f, 112.0f),
                    PathNode.CurveTo(24.0f, 124.590294f, 29.927767f, 136.44583f, 40.0f, 144.0f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.CurveTo(40.0f, 220.41827f, 43.581722f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(212.41827f, 224.0f, 216.0f, 220.41827f, 216.0f, 216.0f),
                    PathNode.LineTo(216.0f, 144.0f),
                    PathNode.CurveTo(226.07224f, 136.44583f, 232.0f, 124.590294f, 232.0f, 112.0f),
                    PathNode.LineTo(232.0f, 96.0f),
                    PathNode.CurveTo(231.99934f, 95.25911f, 231.895f, 94.521965f, 231.69f, 93.81f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 112.0f),
                    PathNode.CurveTo(87.997055f, 120.39372f, 83.60916f, 128.176f, 76.42862f, 132.52277f),
                    PathNode.CurveTo(69.24807f, 136.86954f, 60.318382f, 137.1491f, 52.88f, 133.26f),
                    PathNode.CurveTo(52.323498f, 132.82681f, 51.711365f, 132.4703f, 51.06f, 132.2f),
                    PathNode.CurveTo(44.172577f, 127.79075f, 40.004356f, 120.1779f, 40.0f, 112.0f),
                    PathNode.LineTo(40.0f, 104.0f),
                    PathNode.LineTo(88.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 112.0f),
                    PathNode.CurveTo(152.0f, 125.25484f, 141.25484f, 136.0f, 128.0f, 136.0f),
                    PathNode.CurveTo(114.74516f, 136.0f, 104.0f, 125.25484f, 104.0f, 112.0f),
                    PathNode.LineTo(104.0f, 104.0f),
                    PathNode.LineTo(152.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 112.0f),
                    PathNode.CurveTo(215.99347f, 120.17984f, 211.82124f, 127.79311f, 204.93f, 132.2f),
                    PathNode.CurveTo(204.28719f, 132.47084f, 203.68216f, 132.82378f, 203.13f, 133.25f),
                    PathNode.CurveTo(195.69241f, 137.14313f, 186.76125f, 136.86713f, 179.57825f, 132.52216f),
                    PathNode.CurveTo(172.39526f, 128.17719f, 168.00461f, 120.39488f, 168.0f, 112.0f),
                    PathNode.LineTo(168.0f, 104.0f),
                    PathNode.LineTo(216.0f, 104.0f),
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
        return _storefront!!
    }

private var _storefront: ImageVector? = null
