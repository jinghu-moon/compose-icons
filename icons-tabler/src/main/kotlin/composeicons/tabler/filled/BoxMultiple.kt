package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BoxMultiple: ImageVector
    get() {
        if (_boxMultiple != null) return _boxMultiple!!
        _boxMultiple = tablerFilledIcon(
            name = "BoxMultiple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 5.667f),
                    PathNode.CurveTo(6.0f, 3.641772f, 7.641772f, 2.0f, 9.667f, 2.0f),
                    PathNode.LineTo(18.333f, 2.0f),
                    PathNode.CurveTo(20.358229f, 2.0f, 22.0f, 3.641772f, 22.0f, 5.667f),
                    PathNode.LineTo(22.0f, 14.333f),
                    PathNode.CurveTo(22.0f, 16.358229f, 20.358229f, 18.0f, 18.333f, 18.0f),
                    PathNode.LineTo(9.667f, 18.0f),
                    PathNode.CurveTo(7.641772f, 18.0f, 6.0f, 16.358229f, 6.0f, 14.333f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.0f, 9.0f),
                    PathNode.CurveTo(2.0f, 7.906f, 2.533f, 7.172f, 3.514f, 6.626f),
                    PathNode.CurveTo(3.996697f, 6.35759f, 4.60559f, 6.531303f, 4.874f, 7.014f),
                    PathNode.CurveTo(5.142411f, 7.496697f, 4.968697f, 8.10559f, 4.486f, 8.374f),
                    PathNode.CurveTo(4.088f, 8.595f, 4.0f, 8.716f, 4.0f, 9.0f),
                    PathNode.LineTo(4.0f, 19.0f),
                    PathNode.CurveTo(4.0f, 19.548f, 4.452f, 20.0f, 5.0f, 20.0f),
                    PathNode.LineTo(14.998f, 20.0f),
                    PathNode.CurveTo(15.318f, 20.0f, 15.616f, 19.846f, 15.803f, 19.593f),
                    PathNode.LineTo(15.868f, 19.493f),
                    PathNode.CurveTo(16.14138f, 19.013065f, 16.752064f, 18.84562f, 17.232f, 19.119f),
                    PathNode.CurveTo(17.711937f, 19.392382f, 17.879381f, 20.003065f, 17.606f, 20.483f),
                    PathNode.CurveTo(17.073034f, 21.420206f, 16.07815f, 21.999348f, 15.0f, 22.0f),
                    PathNode.LineTo(5.0f, 22.0f),
                    PathNode.CurveTo(3.348f, 22.0f, 2.0f, 20.652f, 2.0f, 19.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _boxMultiple!!
    }

private var _boxMultiple: ImageVector? = null
