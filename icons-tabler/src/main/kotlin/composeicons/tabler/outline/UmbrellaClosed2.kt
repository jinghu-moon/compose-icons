package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.UmbrellaClosed2: ImageVector
    get() {
        if (_umbrellaClosed2 != null) return _umbrellaClosed2!!
        _umbrellaClosed2 = tablerOutlineIcon(
            name = "UmbrellaClosed2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.697f, 12.071f),
                    PathNode.LineTo(18.01f, 5.0f),
                    PathNode.LineTo(10.94f, 16.314f),
                    PathNode.LineTo(6.697f, 12.071f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.743f, 14.475f),
                    PathNode.LineTo(6.622f, 16.596f),
                    PathNode.CurveTo(4.736f, 18.482f, 7.565f, 21.311f, 9.45f, 19.425f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _umbrellaClosed2!!
    }

private var _umbrellaClosed2: ImageVector? = null
