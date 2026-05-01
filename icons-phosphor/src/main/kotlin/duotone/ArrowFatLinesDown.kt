package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowFatLinesDown: ImageVector
    get() {
        if (_arrowFatLinesDown != null) return _arrowFatLinesDown!!
        _arrowFatLinesDown = phosphorDuotoneIcon(
            name = "ArrowFatLinesDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 136.0f),
                    PathNode.LineTo(128.0f, 232.0f),
                    PathNode.LineTo(32.0f, 136.0f),
                    PathNode.LineTo(80.0f, 136.0f),
                    PathNode.LineTo(80.0f, 104.0f),
                    PathNode.LineTo(176.0f, 104.0f),
                    PathNode.LineTo(176.0f, 136.0f),
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
                    PathNode.MoveTo(231.39f, 132.94f),
                    PathNode.CurveTo(230.15236f, 129.95038f, 227.23566f, 128.00067f, 224.0f, 128.0f),
                    PathNode.LineTo(184.0f, 128.0f),
                    PathNode.LineTo(184.0f, 104.0f),
                    PathNode.CurveTo(184.0f, 99.58172f, 180.41827f, 96.0f, 176.0f, 96.0f),
                    PathNode.LineTo(80.0f, 96.0f),
                    PathNode.CurveTo(75.58172f, 96.0f, 72.0f, 99.58172f, 72.0f, 104.0f),
                    PathNode.LineTo(72.0f, 128.0f),
                    PathNode.LineTo(32.0f, 128.0f),
                    PathNode.CurveTo(28.762346f, 127.99745f, 25.842361f, 129.94662f, 24.60302f, 132.93768f),
                    PathNode.CurveTo(23.36368f, 135.92874f, 24.049358f, 139.3719f, 26.34f, 141.66f),
                    PathNode.LineTo(122.34f, 237.66f),
                    PathNode.CurveTo(123.840546f, 239.16223f, 125.876724f, 240.00629f, 128.0f, 240.00629f),
                    PathNode.CurveTo(130.12328f, 240.00629f, 132.15945f, 239.16223f, 133.66f, 237.66f),
                    PathNode.LineTo(229.66f, 141.66f),
                    PathNode.CurveTo(231.94725f, 139.37076f, 232.63007f, 135.92903f, 231.39f, 132.94f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 220.69f),
                    PathNode.LineTo(51.31f, 144.0f),
                    PathNode.LineTo(80.0f, 144.0f),
                    PathNode.CurveTo(84.41828f, 144.0f, 88.0f, 140.41827f, 88.0f, 136.0f),
                    PathNode.LineTo(88.0f, 112.0f),
                    PathNode.LineTo(168.0f, 112.0f),
                    PathNode.LineTo(168.0f, 136.0f),
                    PathNode.CurveTo(168.0f, 140.41827f, 171.58173f, 144.0f, 176.0f, 144.0f),
                    PathNode.LineTo(204.69f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 40.0f),
                    PathNode.CurveTo(72.0f, 35.581722f, 75.58172f, 32.0f, 80.0f, 32.0f),
                    PathNode.LineTo(176.0f, 32.0f),
                    PathNode.CurveTo(180.41827f, 32.0f, 184.0f, 35.581722f, 184.0f, 40.0f),
                    PathNode.CurveTo(184.0f, 44.418278f, 180.41827f, 48.0f, 176.0f, 48.0f),
                    PathNode.LineTo(80.0f, 48.0f),
                    PathNode.CurveTo(75.58172f, 48.0f, 72.0f, 44.418278f, 72.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 72.0f),
                    PathNode.CurveTo(72.0f, 67.58172f, 75.58172f, 64.0f, 80.0f, 64.0f),
                    PathNode.LineTo(176.0f, 64.0f),
                    PathNode.CurveTo(180.41827f, 64.0f, 184.0f, 67.58172f, 184.0f, 72.0f),
                    PathNode.CurveTo(184.0f, 76.41828f, 180.41827f, 80.0f, 176.0f, 80.0f),
                    PathNode.LineTo(80.0f, 80.0f),
                    PathNode.CurveTo(75.58172f, 80.0f, 72.0f, 76.41828f, 72.0f, 72.0f),
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
        return _arrowFatLinesDown!!
    }

private var _arrowFatLinesDown: ImageVector? = null
