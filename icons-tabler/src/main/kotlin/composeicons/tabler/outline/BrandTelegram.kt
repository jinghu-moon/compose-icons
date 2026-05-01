package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandTelegram: ImageVector
    get() {
        if (_brandTelegram != null) return _brandTelegram!!
        _brandTelegram = tablerOutlineIcon(
            name = "BrandTelegram",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 10.0f),
                    PathNode.LineTo(11.0f, 14.0f),
                    PathNode.LineTo(17.0f, 20.0f),
                    PathNode.LineTo(21.0f, 4.0f),
                    PathNode.LineTo(3.0f, 11.0f),
                    PathNode.LineTo(7.0f, 13.0f),
                    PathNode.LineTo(9.0f, 19.0f),
                    PathNode.LineTo(12.0f, 15.0f)
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
        return _brandTelegram!!
    }

private var _brandTelegram: ImageVector? = null
