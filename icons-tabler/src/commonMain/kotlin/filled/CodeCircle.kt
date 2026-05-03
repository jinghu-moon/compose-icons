package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CodeCircle: ImageVector
    get() {
        if (_codeCircle != null) return _codeCircle!!
        _codeCircle = tablerFilledIcon(
            name = "CodeCircle",
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
                    PathNode.MoveTo(10.707f, 9.293f),
                    PathNode.CurveTo(10.3165f, 8.902618f, 9.6835f, 8.902618f, 9.293f, 9.293f),
                    PathNode.LineTo(7.293f, 11.293f),
                    PathNode.CurveTo(6.902618f, 11.6835f, 6.902618f, 12.3165f, 7.293f, 12.707f),
                    PathNode.LineTo(9.293f, 14.707f),
                    PathNode.CurveTo(9.6835f, 15.097382f, 10.3165f, 15.097382f, 10.707f, 14.707f),
                    PathNode.LineTo(10.79f, 14.613f),
                    PathNode.CurveTo(11.098803f, 14.214914f, 11.063235f, 13.649268f, 10.707f, 13.293f),
                    PathNode.LineTo(9.415f, 12.0f),
                    PathNode.LineTo(10.707f, 10.707f),
                    PathNode.CurveTo(11.097382f, 10.3165f, 11.097382f, 9.6835f, 10.707f, 9.293f),
                    PathNode.MoveTo(14.707f, 9.293f),
                    PathNode.CurveTo(14.3165f, 8.902618f, 13.6835f, 8.902618f, 13.293f, 9.293f),
                    PathNode.LineTo(13.21f, 9.387f),
                    PathNode.CurveTo(12.901197f, 9.785086f, 12.936765f, 10.350732f, 13.293f, 10.707f),
                    PathNode.LineTo(14.585f, 12.0f),
                    PathNode.LineTo(13.293f, 13.293f),
                    PathNode.CurveTo(12.914028f, 13.685379f, 12.919448f, 14.309085f, 13.305182f, 14.694818f),
                    PathNode.CurveTo(13.690915f, 15.080552f, 14.314621f, 15.085972f, 14.707f, 14.707f),
                    PathNode.LineTo(16.707f, 12.707f),
                    PathNode.CurveTo(17.097382f, 12.3165f, 17.097382f, 11.6835f, 16.707f, 11.293f),
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
        return _codeCircle!!
    }

private var _codeCircle: ImageVector? = null
