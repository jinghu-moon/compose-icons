package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChefHatOff: ImageVector
    get() {
        if (_chefHatOff != null) return _chefHatOff!!
        _chefHatOff = tablerOutlineIcon(
            name = "ChefHatOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.72f, 4.712f),
                    PathNode.CurveTo(9.629827f, 3.407185f, 11.226331f, 2.765476f, 12.786098f, 3.077647f),
                    PathNode.CurveTo(14.345866f, 3.389817f, 15.572428f, 4.596532f, 15.91f, 6.151f),
                    PathNode.CurveTo(18.042648f, 5.573863f, 20.239363f, 6.834853f, 20.8165f, 8.9675f),
                    PathNode.CurveTo(21.393637f, 11.100147f, 20.132648f, 13.296863f, 18.0f, 13.874f),
                    PathNode.LineTo(18.0f, 14.0f),
                    PathNode.MoveTo(18.0f, 18.0f),
                    PathNode.LineTo(18.0f, 21.0f),
                    PathNode.LineTo(6.0f, 21.0f),
                    PathNode.LineTo(6.0f, 13.874f),
                    PathNode.CurveTo(4.188165f, 13.437387f, 2.917941f, 11.807357f, 2.937303f, 9.943758f),
                    PathNode.CurveTo(2.956666f, 8.080159f, 4.260485f, 6.476873f, 6.081f, 6.078f)
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
                    PathNode.LineTo(17.0f, 17.0f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _chefHatOff!!
    }

private var _chefHatOff: ImageVector? = null
