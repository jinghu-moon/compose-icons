package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandGravatar: ImageVector
    get() {
        if (_brandGravatar != null) return _brandGravatar!!
        _brandGravatar = tablerOutlineIcon(
            name = "BrandGravatar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.64f, 5.632f),
                    PathNode.CurveTo(2.601616f, 8.666529f, 2.130282f, 13.424915f, 4.514302f, 16.996552f),
                    PathNode.CurveTo(6.898322f, 20.568188f, 11.473543f, 21.958067f, 15.441394f, 20.316025f),
                    PathNode.CurveTo(19.409245f, 18.673983f, 21.664337f, 14.457472f, 20.827278f, 10.245647f),
                    PathNode.CurveTo(19.990217f, 6.033823f, 16.294199f, 3.000039f, 12.0f, 3.0f),
                    PathNode.LineTo(12.0f, 10.714f)
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
        return _brandGravatar!!
    }

private var _brandGravatar: ImageVector? = null
