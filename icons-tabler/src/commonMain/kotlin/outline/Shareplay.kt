package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Shareplay: ImageVector
    get() {
        if (_shareplay != null) return _shareplay!!
        _shareplay = tablerOutlineIcon(
            name = "Shareplay",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 18.0f),
                    PathNode.CurveTo(19.656855f, 18.0f, 21.0f, 16.656855f, 21.0f, 15.0f),
                    PathNode.LineTo(21.0f, 7.0f),
                    PathNode.CurveTo(21.0f, 5.343146f, 19.656855f, 4.0f, 18.0f, 4.0f),
                    PathNode.LineTo(6.0f, 4.0f),
                    PathNode.CurveTo(4.343146f, 4.0f, 3.0f, 5.343146f, 3.0f, 7.0f),
                    PathNode.LineTo(3.0f, 15.0f),
                    PathNode.CurveTo(3.0f, 16.656855f, 4.343146f, 18.0f, 6.0f, 18.0f)
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
                    PathNode.MoveTo(9.0f, 20.0f),
                    PathNode.LineTo(15.0f, 20.0f),
                    PathNode.LineTo(12.0f, 15.0f),
                    PathNode.LineTo(9.0f, 20.0f)
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
        return _shareplay!!
    }

private var _shareplay: ImageVector? = null
