package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CodeCircle2: ImageVector
    get() {
        if (_codeCircle2 != null) return _codeCircle2!!
        _codeCircle2 = tablerFilledIcon(
            name = "CodeCircle2",
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
                    PathNode.MoveTo(13.342f, 8.56f),
                    PathNode.CurveTo(13.092701f, 8.469218f, 12.817543f, 8.481227f, 12.577101f, 8.593383f),
                    PathNode.CurveTo(12.336658f, 8.70554f, 12.150641f, 8.908649f, 12.06f, 9.158f),
                    PathNode.LineTo(10.06f, 14.658f),
                    PathNode.CurveTo(9.871119f, 15.177148f, 10.138852f, 15.751119f, 10.658f, 15.94f),
                    PathNode.CurveTo(11.177148f, 16.128881f, 11.751119f, 15.861148f, 11.94f, 15.342f),
                    PathNode.LineTo(13.94f, 9.842f),
                    PathNode.CurveTo(14.030782f, 9.592701f, 14.018773f, 9.317543f, 13.906617f, 9.077101f),
                    PathNode.CurveTo(13.79446f, 8.836658f, 13.591351f, 8.650641f, 13.342f, 8.56f),
                    PathNode.MoveTo(9.207f, 9.793f),
                    PathNode.CurveTo(8.8165f, 9.402618f, 8.183501f, 9.402618f, 7.793f, 9.793f),
                    PathNode.LineTo(6.293f, 11.293f),
                    PathNode.CurveTo(5.902618f, 11.6835f, 5.902618f, 12.3165f, 6.293f, 12.707f),
                    PathNode.LineTo(7.793f, 14.207f),
                    PathNode.CurveTo(8.183501f, 14.597382f, 8.8165f, 14.597382f, 9.207f, 14.207f),
                    PathNode.LineTo(9.29f, 14.113f),
                    PathNode.CurveTo(9.598803f, 13.714914f, 9.563235f, 13.149268f, 9.207f, 12.793f),
                    PathNode.LineTo(8.415f, 12.0f),
                    PathNode.LineTo(9.207f, 11.207f),
                    PathNode.CurveTo(9.597382f, 10.8165f, 9.597382f, 10.1835f, 9.207f, 9.793f),
                    PathNode.MoveTo(16.207f, 9.793f),
                    PathNode.CurveTo(15.8165f, 9.402618f, 15.1835f, 9.402618f, 14.793f, 9.793f),
                    PathNode.LineTo(14.71f, 9.887f),
                    PathNode.CurveTo(14.401197f, 10.285086f, 14.436765f, 10.850732f, 14.793f, 11.207f),
                    PathNode.LineTo(15.585f, 12.0f),
                    PathNode.LineTo(14.793f, 12.793f),
                    PathNode.CurveTo(14.414028f, 13.185379f, 14.419448f, 13.809085f, 14.805182f, 14.194818f),
                    PathNode.CurveTo(15.190915f, 14.580552f, 15.814621f, 14.585972f, 16.207f, 14.207f),
                    PathNode.LineTo(17.707f, 12.707f),
                    PathNode.CurveTo(18.097382f, 12.3165f, 18.097382f, 11.6835f, 17.707f, 11.293f),
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
        return _codeCircle2!!
    }

private var _codeCircle2: ImageVector? = null
