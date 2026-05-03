package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandDrupal: ImageVector
    get() {
        if (_brandDrupal != null) return _brandDrupal!!
        _brandDrupal = tablerOutlineIcon(
            name = "BrandDrupal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.CurveTo(12.0f, 6.308f, 5.0f, 8.0f, 5.0f, 14.0f),
                    PathNode.CurveTo(5.0f, 17.865993f, 8.134007f, 21.0f, 12.0f, 21.0f),
                    PathNode.CurveTo(15.865993f, 21.0f, 19.0f, 17.865993f, 19.0f, 14.0f),
                    PathNode.CurveTo(19.0f, 8.0f, 12.0f, 6.303f, 12.0f, 2.0f)
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
                    PathNode.MoveTo(12.0f, 11.33f),
                    PathNode.CurveTo(11.344045f, 12.018806f, 10.67322f, 12.693298f, 9.988f, 13.353f),
                    PathNode.CurveTo(8.988f, 14.31f, 8.0f, 15.32f, 8.0f, 17.0f),
                    PathNode.CurveTo(8.0f, 19.17f, 9.79f, 21.0f, 12.0f, 21.0f),
                    PathNode.CurveTo(14.21f, 21.0f, 16.0f, 19.173f, 16.0f, 17.0f),
                    PathNode.CurveTo(16.0f, 15.324f, 15.011f, 14.315f, 14.017f, 13.358f),
                    PathNode.CurveTo(13.597f, 12.954f, 11.758f, 11.001f, 8.5f, 7.5f),
                    PathNode.LineTo(12.0f, 11.33f)
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
        return _brandDrupal!!
    }

private var _brandDrupal: ImageVector? = null
