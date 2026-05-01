package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CirclePercentage: ImageVector
    get() {
        if (_circlePercentage != null) return _circlePercentage!!
        _circlePercentage = tablerFilledIcon(
            name = "CirclePercentage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.CurveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f),
                    PathNode.CurveTo(22.0f, 17.522848f, 17.522848f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(6.477153f, 22.0f, 2.0f, 17.522848f, 2.0f, 12.0f),
                    PathNode.LineTo(2.004f, 11.72f),
                    PathNode.CurveTo(2.152f, 6.327f, 6.57f, 2.0f, 12.0f, 2.0f),
                    PathNode.MoveTo(15.0f, 14.12f),
                    PathNode.CurveTo(14.447715f, 14.12f, 14.0f, 14.567716f, 14.0f, 15.12f),
                    PathNode.LineTo(14.0f, 15.135f),
                    PathNode.CurveTo(14.0f, 15.687284f, 14.447715f, 16.135f, 15.0f, 16.135f),
                    PathNode.CurveTo(15.552285f, 16.135f, 16.0f, 15.687284f, 16.0f, 15.135f),
                    PathNode.LineTo(16.0f, 15.12f),
                    PathNode.CurveTo(16.0f, 14.567716f, 15.552285f, 14.12f, 15.0f, 14.12f),
                    PathNode.MoveTo(15.707f, 8.368f),
                    PathNode.CurveTo(15.3165f, 7.977618f, 14.6835f, 7.977618f, 14.293f, 8.368f),
                    PathNode.LineTo(8.293f, 14.368f),
                    PathNode.CurveTo(7.914028f, 14.760379f, 7.919448f, 15.384085f, 8.305182f, 15.769818f),
                    PathNode.CurveTo(8.690915f, 16.155552f, 9.314621f, 16.160973f, 9.707f, 15.782f),
                    PathNode.LineTo(15.707f, 9.782f),
                    PathNode.CurveTo(16.097382f, 9.3915f, 16.097382f, 8.7585f, 15.707f, 8.368f),
                    PathNode.MoveTo(9.0f, 8.105f),
                    PathNode.CurveTo(8.447715f, 8.105f, 8.0f, 8.552715f, 8.0f, 9.105f),
                    PathNode.LineTo(8.0f, 9.12f),
                    PathNode.CurveTo(8.0f, 9.672285f, 8.447715f, 10.12f, 9.0f, 10.12f),
                    PathNode.CurveTo(9.552285f, 10.12f, 10.0f, 9.672285f, 10.0f, 9.12f),
                    PathNode.LineTo(10.0f, 9.105f),
                    PathNode.CurveTo(10.0f, 8.552715f, 9.552285f, 8.105f, 9.0f, 8.105f)
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
        return _circlePercentage!!
    }

private var _circlePercentage: ImageVector? = null
