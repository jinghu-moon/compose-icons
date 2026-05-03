package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ShirtOff: ImageVector
    get() {
        if (_shirtOff != null) return _shirtOff!!
        _shirtOff = tablerOutlineIcon(
            name = "ShirtOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.243f, 4.252f),
                    PathNode.LineTo(9.0f, 4.0f),
                    PathNode.CurveTo(9.0f, 4.43f, 9.09f, 4.837f, 9.252f, 5.206f),
                    PathNode.MoveTo(10.647f, 6.678f),
                    PathNode.CurveTo(11.577074f, 7.147974f, 12.684406f, 7.101638f, 13.571965f, 6.555605f),
                    PathNode.CurveTo(14.459523f, 6.009572f, 15.000149f, 5.042072f, 15.0f, 4.0f),
                    PathNode.LineTo(21.0f, 6.0f),
                    PathNode.LineTo(21.0f, 11.0f),
                    PathNode.LineTo(18.0f, 11.0f),
                    PathNode.LineTo(18.0f, 14.0f),
                    PathNode.MoveTo(18.0f, 18.0f),
                    PathNode.LineTo(18.0f, 19.0f),
                    PathNode.CurveTo(18.0f, 19.552284f, 17.552284f, 20.0f, 17.0f, 20.0f),
                    PathNode.LineTo(7.0f, 20.0f),
                    PathNode.CurveTo(6.447716f, 20.0f, 6.0f, 19.552284f, 6.0f, 19.0f),
                    PathNode.LineTo(6.0f, 11.0f),
                    PathNode.LineTo(3.0f, 11.0f),
                    PathNode.LineTo(3.0f, 6.0f),
                    PathNode.LineTo(5.26f, 5.247f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _shirtOff!!
    }

private var _shirtOff: ImageVector? = null
