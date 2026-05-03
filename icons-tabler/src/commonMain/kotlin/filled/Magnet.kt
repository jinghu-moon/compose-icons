package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Magnet: ImageVector
    get() {
        if (_magnet != null) return _magnet!!
        _magnet = tablerFilledIcon(
            name = "Magnet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 9.0f),
                    PathNode.LineTo(21.0f, 13.0f),
                    PathNode.CurveTo(21.0f, 17.970562f, 16.970562f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(7.029437f, 22.0f, 3.0f, 17.970562f, 3.0f, 13.0f),
                    PathNode.LineTo(3.0f, 9.0f),
                    PathNode.LineTo(10.0f, 9.0f),
                    PathNode.LineTo(10.0f, 13.0f),
                    PathNode.CurveTo(10.0f, 14.104569f, 10.895431f, 15.0f, 12.0f, 15.0f),
                    PathNode.CurveTo(13.104569f, 15.0f, 14.0f, 14.104569f, 14.0f, 13.0f),
                    PathNode.LineTo(14.0f, 9.0f),
                    PathNode.Close,
                    PathNode.MoveTo(18.0f, 2.0f),
                    PathNode.CurveTo(19.656855f, 2.0f, 21.0f, 3.343146f, 21.0f, 5.0f),
                    PathNode.LineTo(21.0f, 7.0f),
                    PathNode.LineTo(14.0f, 7.0f),
                    PathNode.LineTo(14.0f, 5.0f),
                    PathNode.CurveTo(14.0f, 3.343146f, 15.343145f, 2.0f, 17.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(7.0f, 2.0f),
                    PathNode.CurveTo(8.656855f, 2.0f, 10.0f, 3.343146f, 10.0f, 5.0f),
                    PathNode.LineTo(10.0f, 7.0f),
                    PathNode.LineTo(3.0f, 7.0f),
                    PathNode.LineTo(3.0f, 5.0f),
                    PathNode.CurveTo(3.0f, 3.343146f, 4.343146f, 2.0f, 6.0f, 2.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _magnet!!
    }

private var _magnet: ImageVector? = null
