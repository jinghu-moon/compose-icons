package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Compass: ImageVector
    get() {
        if (_compass != null) return _compass!!
        _compass = tablerFilledIcon(
            name = "Compass",
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
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 18.0f),
                    PathNode.CurveTo(11.447715f, 18.0f, 11.0f, 18.447716f, 11.0f, 19.0f),
                    PathNode.CurveTo(11.0f, 19.552284f, 11.447715f, 20.0f, 12.0f, 20.0f),
                    PathNode.CurveTo(12.552285f, 20.0f, 13.0f, 19.552284f, 13.0f, 19.0f),
                    PathNode.CurveTo(13.0f, 18.447716f, 12.552285f, 18.0f, 12.0f, 18.0f),
                    PathNode.MoveTo(15.684f, 7.051f),
                    PathNode.LineTo(9.684f, 9.051f),
                    PathNode.CurveTo(9.385065f, 9.150502f, 9.150502f, 9.385065f, 9.051f, 9.684f),
                    PathNode.LineTo(7.044f, 15.71f),
                    PathNode.LineTo(7.021f, 15.796f),
                    PathNode.LineTo(7.004f, 15.909f),
                    PathNode.LineTo(7.0f, 15.977f),
                    PathNode.LineTo(7.0f, 16.021f),
                    PathNode.LineTo(7.009f, 16.132f),
                    PathNode.LineTo(7.021f, 16.202f),
                    PathNode.LineTo(7.061f, 16.346f),
                    PathNode.LineTo(7.106f, 16.446f),
                    PathNode.LineTo(7.16f, 16.541f),
                    PathNode.LineTo(7.224f, 16.631f),
                    PathNode.LineTo(7.293f, 16.706f),
                    PathNode.LineTo(7.377f, 16.78f),
                    PathNode.LineTo(7.475f, 16.85f),
                    PathNode.LineTo(7.575f, 16.904f),
                    PathNode.LineTo(7.653f, 16.937f),
                    PathNode.LineTo(7.758f, 16.97f),
                    PathNode.LineTo(7.867f, 16.99f),
                    PathNode.LineTo(7.91f, 16.995f),
                    PathNode.LineTo(7.978f, 16.999f),
                    PathNode.LineTo(8.022001f, 16.999f),
                    PathNode.LineTo(8.133001f, 16.99f),
                    PathNode.LineTo(8.203f, 16.978f),
                    PathNode.LineTo(8.223f, 16.972f),
                    PathNode.LineTo(8.242f, 16.97f),
                    PathNode.LineTo(8.316f, 16.948f),
                    PathNode.LineTo(14.316f, 14.948f),
                    PathNode.CurveTo(14.614935f, 14.848497f, 14.849498f, 14.613935f, 14.949f, 14.315f),
                    PathNode.LineTo(16.949f, 8.315f),
                    PathNode.CurveTo(17.068846f, 7.955634f, 16.975336f, 7.5594f, 16.707468f, 7.291532f),
                    PathNode.CurveTo(16.4396f, 7.023664f, 16.043365f, 6.930156f, 15.684f, 7.05f),
                    PathNode.Close,
                    PathNode.MoveTo(14.419f, 9.58f),
                    PathNode.LineTo(13.209f, 13.209f),
                    PathNode.LineTo(9.58f, 14.419f),
                    PathNode.LineTo(10.79f, 10.79f),
                    PathNode.LineTo(14.419f, 9.58f),
                    PathNode.Close,
                    PathNode.MoveTo(5.0f, 11.0f),
                    PathNode.CurveTo(4.447716f, 11.0f, 4.0f, 11.447715f, 4.0f, 12.0f),
                    PathNode.CurveTo(4.0f, 12.552285f, 4.447716f, 13.0f, 5.0f, 13.0f),
                    PathNode.CurveTo(5.552285f, 13.0f, 6.0f, 12.552285f, 6.0f, 12.0f),
                    PathNode.CurveTo(6.0f, 11.447715f, 5.552285f, 11.0f, 5.0f, 11.0f),
                    PathNode.MoveTo(19.0f, 11.0f),
                    PathNode.CurveTo(18.447716f, 11.0f, 18.0f, 11.447715f, 18.0f, 12.0f),
                    PathNode.CurveTo(18.0f, 12.552285f, 18.447716f, 13.0f, 19.0f, 13.0f),
                    PathNode.CurveTo(19.552284f, 13.0f, 20.0f, 12.552285f, 20.0f, 12.0f),
                    PathNode.CurveTo(20.0f, 11.447715f, 19.552284f, 11.0f, 19.0f, 11.0f),
                    PathNode.MoveTo(12.0f, 4.0f),
                    PathNode.CurveTo(11.447715f, 4.0f, 11.0f, 4.447716f, 11.0f, 5.0f),
                    PathNode.CurveTo(11.0f, 5.552285f, 11.447715f, 6.0f, 12.0f, 6.0f),
                    PathNode.CurveTo(12.552285f, 6.0f, 13.0f, 5.552285f, 13.0f, 5.0f),
                    PathNode.CurveTo(13.0f, 4.447716f, 12.552285f, 4.0f, 12.0f, 4.0f)
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
        return _compass!!
    }

private var _compass: ImageVector? = null
