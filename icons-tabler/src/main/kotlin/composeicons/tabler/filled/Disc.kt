package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Disc: ImageVector
    get() {
        if (_disc != null) return _disc!!
        _disc = tablerFilledIcon(
            name = "Disc",
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
                    PathNode.MoveTo(17.0f, 11.0f),
                    PathNode.CurveTo(16.447716f, 11.0f, 16.0f, 11.447715f, 16.0f, 12.0f),
                    PathNode.CurveTo(16.0f, 14.209139f, 14.209139f, 16.0f, 12.0f, 16.0f),
                    PathNode.CurveTo(11.447715f, 16.0f, 11.0f, 16.447716f, 11.0f, 17.0f),
                    PathNode.CurveTo(11.0f, 17.552284f, 11.447715f, 18.0f, 12.0f, 18.0f),
                    PathNode.CurveTo(15.313708f, 18.0f, 18.0f, 15.313708f, 18.0f, 12.0f),
                    PathNode.CurveTo(18.0f, 11.447715f, 17.552284f, 11.0f, 17.0f, 11.0f),
                    PathNode.MoveTo(12.0f, 10.0f),
                    PathNode.CurveTo(10.953375f, 9.999669f, 10.083497f, 10.806323f, 10.005f, 11.85f),
                    PathNode.LineTo(10.0f, 12.0f),
                    PathNode.CurveTo(10.0f, 13.104569f, 10.895431f, 14.0f, 12.0f, 14.0f),
                    PathNode.CurveTo(13.104569f, 14.0f, 14.0f, 13.104569f, 14.0f, 12.0f),
                    PathNode.CurveTo(14.0f, 10.895431f, 13.104569f, 10.0f, 12.0f, 10.0f),
                    PathNode.MoveTo(12.0f, 6.0f),
                    PathNode.CurveTo(8.686292f, 6.0f, 6.0f, 8.686292f, 6.0f, 12.0f),
                    PathNode.CurveTo(6.0f, 12.552285f, 6.447716f, 13.0f, 7.0f, 13.0f),
                    PathNode.CurveTo(7.552285f, 13.0f, 8.0f, 12.552285f, 8.0f, 12.0f),
                    PathNode.CurveTo(8.0f, 9.790861f, 9.790861f, 8.0f, 12.0f, 8.0f),
                    PathNode.CurveTo(12.552285f, 8.0f, 13.0f, 7.552285f, 13.0f, 7.0f),
                    PathNode.CurveTo(13.0f, 6.447716f, 12.552285f, 6.0f, 12.0f, 6.0f)
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
        return _disc!!
    }

private var _disc: ImageVector? = null
