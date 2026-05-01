package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandSass: ImageVector
    get() {
        if (_brandSass != null) return _brandSass!!
        _brandSass = tablerOutlineIcon(
            name = "BrandSass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 12.0f),
                    PathNode.CurveTo(3.0f, 16.970562f, 7.029437f, 21.0f, 12.0f, 21.0f),
                    PathNode.CurveTo(16.970562f, 21.0f, 21.0f, 16.970562f, 21.0f, 12.0f),
                    PathNode.CurveTo(21.0f, 7.029437f, 16.970562f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(7.029437f, 3.0f, 3.0f, 7.029437f, 3.0f, 12.0f)
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
                    PathNode.MoveTo(12.0f, 10.523f),
                    PathNode.CurveTo(14.46f, 9.697f, 16.0f, 9.697f, 16.0f, 8.368f),
                    PathNode.CurveTo(16.0f, 7.002f, 14.653f, 7.002f, 13.265f, 7.002f),
                    PathNode.CurveTo(11.355f, 7.002f, 9.913f, 7.492f, 8.728f, 8.75f),
                    PathNode.CurveTo(7.88f, 9.652f, 7.701f, 11.199f, 8.575f, 12.057f),
                    PathNode.CurveTo(9.548f, 13.013f, 11.781f, 13.846f, 11.459f, 15.55f),
                    PathNode.CurveTo(11.226f, 16.785f, 9.99f, 17.373f, 8.842f, 16.752f),
                    PathNode.CurveTo(8.060001f, 16.328f, 8.388f, 15.006f, 9.468f, 14.24f),
                    PathNode.CurveTo(10.548f, 13.474f, 12.29f, 13.248f, 13.568f, 14.0f),
                    PathNode.CurveTo(14.548f, 14.575f, 14.614f, 15.724f, 14.002f, 16.193f)
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
        return _brandSass!!
    }

private var _brandSass: ImageVector? = null
