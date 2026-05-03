package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Nut: ImageVector
    get() {
        if (_nut != null) return _nut!!
        _nut = tablerOutlineIcon(
            name = "Nut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 6.84f),
                    PathNode.CurveTo(19.624563f, 7.202234f, 20.006428f, 7.872023f, 20.0f, 8.594f),
                    PathNode.LineTo(20.0f, 15.149f),
                    PathNode.CurveTo(20.0f, 15.877f, 19.606f, 16.549f, 18.97f, 16.902f),
                    PathNode.LineTo(12.97f, 20.746f),
                    PathNode.CurveTo(12.366872f, 21.081589f, 11.633128f, 21.081589f, 11.03f, 20.746f),
                    PathNode.LineTo(5.03f, 16.902f),
                    PathNode.CurveTo(4.394347f, 16.548004f, 4.000203f, 15.877576f, 4.0f, 15.15f),
                    PathNode.LineTo(4.0f, 8.593f),
                    PathNode.CurveTo(4.0f, 7.865f, 4.394f, 7.194f, 5.03f, 6.84f),
                    PathNode.LineTo(11.03f, 3.258f),
                    PathNode.CurveTo(11.651394f, 2.910543f, 12.408606f, 2.910543f, 13.03f, 3.258f),
                    PathNode.LineTo(19.03f, 6.84f),
                    PathNode.LineTo(19.0f, 6.84f)
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
                    PathNode.MoveTo(9.0f, 12.0f),
                    PathNode.CurveTo(9.0f, 13.656855f, 10.343145f, 15.0f, 12.0f, 15.0f),
                    PathNode.CurveTo(13.656855f, 15.0f, 15.0f, 13.656855f, 15.0f, 12.0f),
                    PathNode.CurveTo(15.0f, 10.343145f, 13.656855f, 9.0f, 12.0f, 9.0f),
                    PathNode.CurveTo(10.343145f, 9.0f, 9.0f, 10.343145f, 9.0f, 12.0f)
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
        return _nut!!
    }

private var _nut: ImageVector? = null
