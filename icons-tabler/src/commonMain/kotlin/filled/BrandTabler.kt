package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandTabler: ImageVector
    get() {
        if (_brandTabler != null) return _brandTabler!!
        _brandTabler = tablerFilledIcon(
            name = "BrandTabler",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 2.0f),
                    PathNode.CurveTo(19.761423f, 2.0f, 22.0f, 4.238577f, 22.0f, 7.0f),
                    PathNode.LineTo(22.0f, 17.0f),
                    PathNode.CurveTo(22.0f, 19.761423f, 19.761423f, 22.0f, 17.0f, 22.0f),
                    PathNode.LineTo(7.0f, 22.0f),
                    PathNode.CurveTo(4.238577f, 22.0f, 2.0f, 19.761423f, 2.0f, 17.0f),
                    PathNode.LineTo(2.0f, 7.0f),
                    PathNode.CurveTo(2.0f, 4.238577f, 4.238577f, 2.0f, 7.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(16.0f, 14.0f),
                    PathNode.LineTo(13.0f, 14.0f),
                    PathNode.CurveTo(12.447715f, 14.0f, 12.0f, 14.447715f, 12.0f, 15.0f),
                    PathNode.CurveTo(12.0f, 15.552285f, 12.447715f, 16.0f, 13.0f, 16.0f),
                    PathNode.LineTo(16.0f, 16.0f),
                    PathNode.CurveTo(16.552284f, 16.0f, 17.0f, 15.552285f, 17.0f, 15.0f),
                    PathNode.CurveTo(17.0f, 14.447715f, 16.552284f, 14.0f, 16.0f, 14.0f),
                    PathNode.MoveTo(8.707f, 8.293f),
                    PathNode.CurveTo(8.3165f, 7.902618f, 7.6835f, 7.902618f, 7.293f, 8.293f),
                    PathNode.LineTo(7.21f, 8.387f),
                    PathNode.CurveTo(6.901198f, 8.785086f, 6.936765f, 9.350732f, 7.293f, 9.707f),
                    PathNode.LineTo(9.585f, 12.0f),
                    PathNode.LineTo(7.293f, 14.293f),
                    PathNode.CurveTo(6.914028f, 14.685379f, 6.919448f, 15.309085f, 7.305182f, 15.694818f),
                    PathNode.CurveTo(7.690915f, 16.080553f, 8.314621f, 16.085972f, 8.707f, 15.707f),
                    PathNode.LineTo(11.707f, 12.707f),
                    PathNode.CurveTo(12.097382f, 12.3165f, 12.097382f, 11.6835f, 11.707f, 11.293f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _brandTabler!!
    }

private var _brandTabler: ImageVector? = null
