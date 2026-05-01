package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Man: ImageVector
    get() {
        if (_man != null) return _man!!
        _man = tablerFilledIcon(
            name = "Man",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 8.0f),
                    PathNode.CurveTo(16.628f, 8.0f, 18.2f, 8.787f, 19.707f, 10.293f),
                    PathNode.CurveTo(20.085972f, 10.685379f, 20.080553f, 11.309085f, 19.694818f, 11.694818f),
                    PathNode.CurveTo(19.309084f, 12.080552f, 18.68538f, 12.085972f, 18.293f, 11.707f),
                    PathNode.CurveTo(17.445f, 10.859f, 16.631f, 10.338f, 15.849f, 10.12f),
                    PathNode.LineTo(15.0f, 16.064f),
                    PathNode.LineTo(15.0f, 21.0f),
                    PathNode.CurveTo(15.0f, 21.552284f, 14.552285f, 22.0f, 14.0f, 22.0f),
                    PathNode.CurveTo(13.447715f, 22.0f, 13.0f, 21.552284f, 13.0f, 21.0f),
                    PathNode.LineTo(13.0f, 17.0f),
                    PathNode.LineTo(11.0f, 17.0f),
                    PathNode.LineTo(11.0f, 21.0f),
                    PathNode.CurveTo(11.0f, 21.552284f, 10.552285f, 22.0f, 10.0f, 22.0f),
                    PathNode.CurveTo(9.447715f, 22.0f, 9.0f, 21.552284f, 9.0f, 21.0f),
                    PathNode.LineTo(9.0f, 16.071f),
                    PathNode.LineTo(8.15f, 10.12f),
                    PathNode.CurveTo(7.369f, 10.338f, 6.555f, 10.859f, 5.707f, 11.707f),
                    PathNode.CurveTo(5.455926f, 11.966956f, 5.084122f, 12.071213f, 4.734493f, 11.979697f),
                    PathNode.CurveTo(4.384864f, 11.888182f, 4.111818f, 11.615137f, 4.020303f, 11.265508f),
                    PathNode.CurveTo(3.928788f, 10.915878f, 4.033044f, 10.544074f, 4.293f, 10.293f),
                    PathNode.CurveTo(5.799f, 8.787f, 7.373f, 8.0f, 9.0f, 8.0f),
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
                    PathNode.MoveTo(12.0f, 1.0f),
                    PathNode.CurveTo(13.656855f, 1.0f, 15.0f, 2.343146f, 15.0f, 4.0f),
                    PathNode.CurveTo(15.0f, 5.656854f, 13.656855f, 7.0f, 12.0f, 7.0f),
                    PathNode.CurveTo(10.343145f, 7.0f, 9.0f, 5.656854f, 9.0f, 4.0f),
                    PathNode.LineTo(9.005f, 3.824f),
                    PathNode.CurveTo(9.098195f, 2.238179f, 10.411443f, 0.999912f, 12.0f, 1.0f)
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
        return _man!!
    }

private var _man: ImageVector? = null
