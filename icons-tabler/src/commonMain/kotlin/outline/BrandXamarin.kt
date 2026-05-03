package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandXamarin: ImageVector
    get() {
        if (_brandXamarin != null) return _brandXamarin!!
        _brandXamarin = tablerOutlineIcon(
            name = "BrandXamarin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.958f, 21.0f),
                    PathNode.LineTo(8.041001f, 21.0f),
                    PathNode.CurveTo(7.326487f, 20.99998f, 6.666257f, 20.618786f, 6.309f, 20.0f),
                    PathNode.LineTo(2.268f, 13.0f),
                    PathNode.CurveTo(1.910734f, 12.381198f, 1.910734f, 11.618802f, 2.268f, 11.0f),
                    PathNode.LineTo(6.309f, 4.0f),
                    PathNode.CurveTo(6.666257f, 3.381214f, 7.326487f, 3.000018f, 8.041001f, 3.0f),
                    PathNode.LineTo(15.958f, 3.0f),
                    PathNode.CurveTo(16.672514f, 3.000018f, 17.332743f, 3.381214f, 17.69f, 4.0f),
                    PathNode.LineTo(21.732f, 11.0f),
                    PathNode.CurveTo(22.089266f, 11.618802f, 22.089266f, 12.381198f, 21.732f, 13.0f),
                    PathNode.LineTo(17.691f, 20.0f),
                    PathNode.CurveTo(17.333565f, 20.619097f, 16.67287f, 21.00034f, 15.958f, 21.0f)
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
                    PathNode.MoveTo(15.0f, 16.0f),
                    PathNode.LineTo(9.0f, 8.0f)
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
                    PathNode.MoveTo(9.0f, 16.0f),
                    PathNode.LineTo(15.0f, 8.0f)
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
        return _brandXamarin!!
    }

private var _brandXamarin: ImageVector? = null
