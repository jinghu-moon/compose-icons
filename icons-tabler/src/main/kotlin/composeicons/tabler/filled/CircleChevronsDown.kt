package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleChevronsDown: ImageVector
    get() {
        if (_circleChevronsDown != null) return _circleChevronsDown!!
        _circleChevronsDown = tablerFilledIcon(
            name = "CircleChevronsDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.CurveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f),
                    PathNode.CurveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(6.477153f, 22.0f, 2.0f, 17.522848f, 2.0f, 12.0f),
                    PathNode.CurveTo(2.0f, 6.477153f, 6.477153f, 2.0f, 12.0f, 2.0f),
                    PathNode.MoveTo(9.707f, 12.293f),
                    PathNode.CurveTo(9.455926f, 12.033044f, 9.084122f, 11.928787f, 8.734492f, 12.020303f),
                    PathNode.CurveTo(8.384863f, 12.111818f, 8.111819f, 12.384863f, 8.020303f, 12.734492f),
                    PathNode.CurveTo(7.928787f, 13.084122f, 8.033044f, 13.455926f, 8.293f, 13.707f),
                    PathNode.LineTo(11.293f, 16.707f),
                    PathNode.CurveTo(11.6835f, 17.097382f, 12.3165f, 17.097382f, 12.707f, 16.707f),
                    PathNode.LineTo(15.707f, 13.707f),
                    PathNode.CurveTo(16.097382f, 13.3165f, 16.097382f, 12.6835f, 15.707f, 12.293f),
                    PathNode.LineTo(15.613f, 12.21f),
                    PathNode.CurveTo(15.214914f, 11.901197f, 14.649268f, 11.936765f, 14.293f, 12.293f),
                    PathNode.LineTo(11.999f, 14.585f),
                    PathNode.Close,
                    PathNode.MoveTo(9.707f, 8.293f),
                    PathNode.CurveTo(9.314621f, 7.914028f, 8.690915f, 7.919448f, 8.305182f, 8.305182f),
                    PathNode.CurveTo(7.919448f, 8.690915f, 7.914028f, 9.314621f, 8.293f, 9.707f),
                    PathNode.LineTo(11.293f, 12.707f),
                    PathNode.CurveTo(11.6835f, 13.097382f, 12.3165f, 13.097382f, 12.707f, 12.707f),
                    PathNode.LineTo(15.707f, 9.707f),
                    PathNode.CurveTo(16.097382f, 9.3165f, 16.097382f, 8.6835f, 15.707f, 8.293f),
                    PathNode.LineTo(15.613f, 8.21f),
                    PathNode.CurveTo(15.214914f, 7.901198f, 14.649268f, 7.936765f, 14.293f, 8.293f),
                    PathNode.LineTo(11.999f, 10.585f),
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
        return _circleChevronsDown!!
    }

private var _circleChevronsDown: ImageVector? = null
