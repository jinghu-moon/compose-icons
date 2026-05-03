package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Sock: ImageVector
    get() {
        if (_sock != null) return _sock!!
        _sock = tablerOutlineIcon(
            name = "Sock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.0f, 3.0f),
                    PathNode.LineTo(13.0f, 9.0f),
                    PathNode.LineTo(17.798f, 14.142f),
                    PathNode.CurveTo(19.338964f, 15.660033f, 19.393955f, 18.128077f, 17.922134f, 19.71324f),
                    PathNode.CurveTo(16.450315f, 21.2984f, 13.984975f, 21.426323f, 12.357f, 20.002f),
                    PathNode.LineTo(5.621f, 13.592f),
                    PathNode.CurveTo(5.22384f, 13.213916f, 4.999335f, 12.689346f, 5.0f, 12.141f),
                    PathNode.LineTo(5.0f, 3.0f),
                    PathNode.LineTo(13.0f, 3.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.895f, 15.768f),
                    PathNode.CurveTo(8.603f, 15.047f, 9.0f, 14.091f, 9.0f, 13.0f),
                    PathNode.CurveTo(9.0f, 10.790861f, 7.209139f, 9.0f, 5.0f, 9.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _sock!!
    }

private var _sock: ImageVector? = null
