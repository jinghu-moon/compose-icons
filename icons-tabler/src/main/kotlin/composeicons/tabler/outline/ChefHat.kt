package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChefHat: ImageVector
    get() {
        if (_chefHat != null) return _chefHat!!
        _chefHat = tablerOutlineIcon(
            name = "ChefHat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 3.0f),
                    PathNode.CurveTo(13.918f, 3.0f, 15.52f, 4.35f, 15.91f, 6.151f),
                    PathNode.CurveTo(18.042648f, 5.573863f, 20.239363f, 6.834853f, 20.8165f, 8.9675f),
                    PathNode.CurveTo(21.393637f, 11.100147f, 20.132648f, 13.296863f, 18.0f, 13.874f),
                    PathNode.LineTo(18.0f, 21.0f),
                    PathNode.LineTo(6.0f, 21.0f),
                    PathNode.LineTo(6.0f, 13.874f),
                    PathNode.CurveTo(3.867353f, 13.29631f, 2.60681f, 11.099148f, 3.1845f, 8.9665f),
                    PathNode.CurveTo(3.76219f, 6.833853f, 5.959353f, 5.573311f, 8.092f, 6.151f),
                    PathNode.CurveTo(8.491381f, 4.312219f, 10.118346f, 3.000405f, 12.0f, 3.0f)
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
                    PathNode.MoveTo(6.161f, 17.009f),
                    PathNode.LineTo(18.0f, 17.0f)
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
        return _chefHat!!
    }

private var _chefHat: ImageVector? = null
