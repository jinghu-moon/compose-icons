package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Lungs: ImageVector
    get() {
        if (_lungs != null) return _lungs!!
        _lungs = tablerOutlineIcon(
            name = "Lungs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.081f, 20.0f),
                    PathNode.CurveTo(7.693f, 20.0f, 9.0f, 18.665f, 9.0f, 17.02f),
                    PathNode.LineTo(9.0f, 7.257f),
                    PathNode.CurveTo(9.0f, 6.563f, 8.448f, 6.0f, 7.768f, 6.0f),
                    PathNode.CurveTo(7.563f, 6.0f, 7.363f, 6.052f, 7.184f, 6.15f),
                    PathNode.LineTo(7.054f, 6.233f),
                    PathNode.CurveTo(5.594f, 7.292f, 4.622f, 8.88f, 3.65f, 12.057f),
                    PathNode.CurveTo(3.23f, 13.427f, 3.014f, 15.019f, 3.002f, 16.832f),
                    PathNode.CurveTo(2.99f, 18.507f, 4.263f, 19.886f, 5.879f, 19.993f),
                    PathNode.LineTo(6.082f, 20.0f)
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
                    PathNode.MoveTo(17.92f, 20.0f),
                    PathNode.CurveTo(16.307f, 20.0f, 15.0f, 18.665f, 15.0f, 17.02f),
                    PathNode.LineTo(15.0f, 7.257f),
                    PathNode.CurveTo(15.0f, 6.563f, 15.552f, 6.0f, 16.233f, 6.0f),
                    PathNode.CurveTo(16.437f, 6.0f, 16.638f, 6.052f, 16.817f, 6.15f),
                    PathNode.LineTo(16.947f, 6.233f),
                    PathNode.CurveTo(18.407f, 7.292f, 19.379f, 8.88f, 20.352f, 12.057f),
                    PathNode.CurveTo(20.772f, 13.427f, 20.988f, 15.019f, 21.0f, 16.832f),
                    PathNode.CurveTo(21.012f, 18.507f, 19.739f, 19.886f, 18.122f, 19.993f),
                    PathNode.LineTo(17.92f, 20.0f)
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
                    PathNode.MoveTo(9.0f, 12.0f),
                    PathNode.CurveTo(10.656855f, 12.0f, 12.0f, 10.656855f, 12.0f, 9.0f),
                    PathNode.CurveTo(12.0f, 10.656855f, 13.343145f, 12.0f, 15.0f, 12.0f)
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
                    PathNode.MoveTo(12.0f, 4.0f),
                    PathNode.LineTo(12.0f, 9.0f)
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
        return _lungs!!
    }

private var _lungs: ImageVector? = null
