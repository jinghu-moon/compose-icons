package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleCaretRight: ImageVector
    get() {
        if (_circleCaretRight != null) return _circleCaretRight!!
        _circleCaretRight = tablerFilledIcon(
            name = "CircleCaretRight",
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
                    PathNode.MoveTo(11.707f, 8.293f),
                    PathNode.CurveTo(11.421006f, 8.007093f, 10.990963f, 7.921578f, 10.617346f, 8.076322f),
                    PathNode.CurveTo(10.243728f, 8.231066f, 10.000087f, 8.595604f, 10.0f, 9.0f),
                    PathNode.LineTo(10.0f, 15.0f),
                    PathNode.CurveTo(10.0f, 15.217f, 10.07f, 15.433f, 10.21f, 15.613f),
                    PathNode.LineTo(10.293f, 15.707f),
                    PathNode.CurveTo(10.6835f, 16.097382f, 11.3165f, 16.097382f, 11.707f, 15.707f),
                    PathNode.LineTo(14.707f, 12.707f),
                    PathNode.CurveTo(15.097382f, 12.3165f, 15.097382f, 11.6835f, 14.707f, 11.293f),
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
        return _circleCaretRight!!
    }

private var _circleCaretRight: ImageVector? = null
