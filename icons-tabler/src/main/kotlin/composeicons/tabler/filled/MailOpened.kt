package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.MailOpened: ImageVector
    get() {
        if (_mailOpened != null) return _mailOpened!!
        _mailOpened = tablerFilledIcon(
            name = "MailOpened",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.872f, 14.287f),
                    PathNode.LineTo(21.394f, 20.807f),
                    PathNode.CurveTo(20.864836f, 21.509312f, 20.05385f, 21.94369f, 19.176f, 21.995f),
                    PathNode.LineTo(19.0f, 22.0f),
                    PathNode.LineTo(5.0f, 22.0f),
                    PathNode.CurveTo(4.059235f, 22.001026f, 3.172658f, 21.55996f, 2.606f, 20.809f),
                    PathNode.LineTo(9.127f, 14.287f),
                    PathNode.LineTo(11.445f, 15.832f),
                    PathNode.LineTo(11.561f, 15.898f),
                    PathNode.CurveTo(11.838017f, 16.03335f, 12.161983f, 16.03335f, 12.439f, 15.898f),
                    PathNode.LineTo(12.555f, 15.832f),
                    PathNode.LineTo(14.872f, 14.287f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.0f, 9.535f),
                    PathNode.LineTo(7.429f, 13.155f),
                    PathNode.LineTo(2.0f, 18.585f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(22.0f, 9.535f),
                    PathNode.LineTo(22.0f, 18.585f),
                    PathNode.LineTo(16.57f, 13.155f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.44f, 2.102f),
                    PathNode.LineTo(12.555f, 2.168f),
                    PathNode.LineTo(20.999f, 7.797f),
                    PathNode.LineTo(12.0f, 13.797f),
                    PathNode.LineTo(3.0f, 7.797f),
                    PathNode.LineTo(11.445f, 2.167f),
                    PathNode.CurveTo(11.741198f, 1.970108f, 12.119684f, 1.945358f, 12.439f, 2.102f),
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
        return _mailOpened!!
    }

private var _mailOpened: ImageVector? = null
