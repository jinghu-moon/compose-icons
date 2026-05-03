package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Discount: ImageVector
    get() {
        if (_discount != null) return _discount!!
        _discount = tablerFilledIcon(
            name = "Discount",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 3.34f),
                    PathNode.CurveTo(21.202793f, 5.766485f, 23.05675f, 10.86025f, 21.396896f, 15.420535f),
                    PathNode.CurveTo(19.737045f, 19.98082f, 15.042578f, 22.691092f, 10.263351f, 21.848303f),
                    PathNode.CurveTo(5.484125f, 21.005512f, 1.999877f, 16.852968f, 2.0f, 12.0f),
                    PathNode.LineTo(2.005f, 11.676f),
                    PathNode.CurveTo(2.118919f, 8.162982f, 4.068822f, 4.967704f, 7.140892f, 3.259883f),
                    PathNode.CurveTo(10.212963f, 1.552061f, 13.95609f, 1.582479f, 17.0f, 3.34f),
                    PathNode.MoveTo(14.5f, 13.0f),
                    PathNode.CurveTo(13.671573f, 13.0f, 13.0f, 13.671573f, 13.0f, 14.5f),
                    PathNode.CurveTo(13.0f, 15.328427f, 13.671573f, 16.0f, 14.5f, 16.0f),
                    PathNode.CurveTo(15.328427f, 16.0f, 16.0f, 15.328427f, 16.0f, 14.5f),
                    PathNode.CurveTo(16.0f, 13.671573f, 15.328427f, 13.0f, 14.5f, 13.0f),
                    PathNode.MoveTo(15.707f, 8.293f),
                    PathNode.CurveTo(15.3165f, 7.902618f, 14.6835f, 7.902618f, 14.293f, 8.293f),
                    PathNode.LineTo(8.293f, 14.293f),
                    PathNode.CurveTo(7.914028f, 14.685379f, 7.919448f, 15.309085f, 8.305182f, 15.694818f),
                    PathNode.CurveTo(8.690915f, 16.080553f, 9.314621f, 16.085972f, 9.707f, 15.707f),
                    PathNode.LineTo(15.707f, 9.707f),
                    PathNode.CurveTo(16.097382f, 9.3165f, 16.097382f, 8.6835f, 15.707f, 8.293f),
                    PathNode.MoveTo(9.5f, 8.0f),
                    PathNode.CurveTo(8.671573f, 8.0f, 8.0f, 8.671573f, 8.0f, 9.5f),
                    PathNode.CurveTo(8.0f, 10.328427f, 8.671573f, 11.0f, 9.5f, 11.0f),
                    PathNode.CurveTo(10.328427f, 11.0f, 11.0f, 10.328427f, 11.0f, 9.5f),
                    PathNode.CurveTo(11.0f, 8.671573f, 10.328427f, 8.0f, 9.5f, 8.0f)
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
        return _discount!!
    }

private var _discount: ImageVector? = null
