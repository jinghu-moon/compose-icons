package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Tags: ImageVector
    get() {
        if (_tags != null) return _tags!!
        _tags = tablerFilledIcon(
            name = "Tags",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.172f, 5.0f),
                    PathNode.CurveTo(9.967585f, 5.00017f, 10.730522f, 5.316352f, 11.293f, 5.879f),
                    PathNode.LineTo(17.003f, 11.589f),
                    PathNode.CurveTo(18.334375f, 12.920634f, 18.334375f, 15.079366f, 17.003f, 16.411f),
                    PathNode.LineTo(13.411f, 20.003f),
                    PathNode.CurveTo(12.079366f, 21.334375f, 9.920634f, 21.334375f, 8.589f, 20.003f),
                    PathNode.LineTo(2.879f, 14.293f),
                    PathNode.CurveTo(2.316352f, 13.730522f, 2.00017f, 12.967585f, 2.0f, 12.172f),
                    PathNode.LineTo(2.0f, 8.0f),
                    PathNode.CurveTo(2.0f, 6.343146f, 3.343146f, 5.0f, 5.0f, 5.0f),
                    PathNode.Close,
                    PathNode.MoveTo(7.0f, 9.0f),
                    PathNode.LineTo(6.99f, 9.0f),
                    PathNode.CurveTo(6.437715f, 9.002762f, 5.992239f, 9.452715f, 5.995f, 10.005f),
                    PathNode.CurveTo(5.997761f, 10.557284f, 6.447716f, 11.002762f, 7.0f, 11.0f),
                    PathNode.CurveTo(7.552285f, 11.0f, 8.0f, 10.552285f, 8.0f, 10.0f),
                    PathNode.CurveTo(8.0f, 9.447715f, 7.552285f, 9.0f, 7.0f, 9.0f)
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
                    PathNode.MoveTo(14.293f, 5.293f),
                    PathNode.CurveTo(14.6835f, 4.902618f, 15.3165f, 4.902618f, 15.707f, 5.293f),
                    PathNode.LineTo(20.3f, 9.885f),
                    PathNode.CurveTo(22.572369f, 12.157768f, 22.572369f, 15.842232f, 20.3f, 18.115f),
                    PathNode.LineTo(18.708f, 19.707f),
                    PathNode.CurveTo(18.31562f, 20.085972f, 17.691916f, 20.080553f, 17.30618f, 19.694818f),
                    PathNode.CurveTo(16.920448f, 19.309084f, 16.915028f, 18.68538f, 17.294f, 18.293f),
                    PathNode.LineTo(18.886f, 16.701f),
                    PathNode.CurveTo(20.377605f, 15.209231f, 20.377605f, 12.790769f, 18.886f, 11.299f),
                    PathNode.LineTo(14.294f, 6.707f),
                    PathNode.CurveTo(13.903618f, 6.3165f, 13.903618f, 5.6835f, 14.294f, 5.293f)
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
        return _tags!!
    }

private var _tags: ImageVector? = null
