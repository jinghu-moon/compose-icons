package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.JewishStar: ImageVector
    get() {
        if (_jewishStar != null) return _jewishStar!!
        _jewishStar = tablerOutlineIcon(
            name = "JewishStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.LineTo(15.0f, 7.0f),
                    PathNode.LineTo(21.0f, 7.0f),
                    PathNode.LineTo(18.0f, 12.0f),
                    PathNode.LineTo(21.0f, 17.0f),
                    PathNode.LineTo(15.0f, 17.0f),
                    PathNode.LineTo(12.0f, 22.0f),
                    PathNode.LineTo(9.0f, 17.0f),
                    PathNode.LineTo(3.0f, 17.0f),
                    PathNode.LineTo(6.0f, 12.0f),
                    PathNode.LineTo(3.0f, 7.0f),
                    PathNode.LineTo(9.0f, 7.0f),
                    PathNode.LineTo(12.0f, 2.0f)
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
        return _jewishStar!!
    }

private var _jewishStar: ImageVector? = null
