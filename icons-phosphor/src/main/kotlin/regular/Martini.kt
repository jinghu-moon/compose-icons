package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Martini: ImageVector
    get() {
        if (_martini != null) return _martini!!
        _martini = phosphorRegularIcon(
            name = "Martini",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(237.66f, 45.66f),
                    PathNode.CurveTo(239.95064f, 43.371906f, 240.63632f, 39.928738f, 239.39697f, 36.93768f),
                    PathNode.CurveTo(238.15764f, 33.94662f, 235.23764f, 31.997452f, 232.0f, 32.0f),
                    PathNode.LineTo(24.0f, 32.0f),
                    PathNode.CurveTo(20.762346f, 31.997452f, 17.842361f, 33.94662f, 16.60302f, 36.93768f),
                    PathNode.CurveTo(15.36368f, 39.928738f, 16.049358f, 43.371906f, 18.34f, 45.66f),
                    PathNode.LineTo(120.0f, 147.31f),
                    PathNode.LineTo(120.0f, 208.0f),
                    PathNode.LineTo(88.0f, 208.0f),
                    PathNode.CurveTo(83.58172f, 208.0f, 80.0f, 211.58173f, 80.0f, 216.0f),
                    PathNode.CurveTo(80.0f, 220.41827f, 83.58172f, 224.0f, 88.0f, 224.0f),
                    PathNode.LineTo(168.0f, 224.0f),
                    PathNode.CurveTo(172.41827f, 224.0f, 176.0f, 220.41827f, 176.0f, 216.0f),
                    PathNode.CurveTo(176.0f, 211.58173f, 172.41827f, 208.0f, 168.0f, 208.0f),
                    PathNode.LineTo(136.0f, 208.0f),
                    PathNode.LineTo(136.0f, 147.31f),
                    PathNode.Close,
                    PathNode.MoveTo(43.31f, 48.0f),
                    PathNode.LineTo(212.69f, 48.0f),
                    PathNode.LineTo(196.69f, 64.0f),
                    PathNode.LineTo(59.31f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 132.69f),
                    PathNode.LineTo(75.31f, 80.0f),
                    PathNode.LineTo(180.69f, 80.0f),
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
        return _martini!!
    }

private var _martini: ImageVector? = null
