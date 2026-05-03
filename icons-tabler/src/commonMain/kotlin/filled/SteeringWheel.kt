package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SteeringWheel: ImageVector
    get() {
        if (_steeringWheel != null) return _steeringWheel!!
        _steeringWheel = tablerFilledIcon(
            name = "SteeringWheel",
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
                    PathNode.MoveTo(4.0f, 12.0f),
                    PathNode.CurveTo(4.000128f, 16.031525f, 7.000096f, 19.43306f, 11.0f, 19.937f),
                    PathNode.LineTo(11.0f, 14.83f),
                    PathNode.CurveTo(10.068348f, 14.500919f, 9.358475f, 13.734196f, 9.102f, 12.78f),
                    PathNode.LineTo(4.032f, 11.276f),
                    PathNode.QuadTo(4.001f, 11.636f, 4.0f, 12.001f),
                    PathNode.MoveTo(19.967f, 11.276f),
                    PathNode.LineTo(14.898f, 12.779f),
                    PathNode.CurveTo(14.642012f, 13.733349f, 13.932509f, 14.50045f, 13.001f, 14.83f),
                    PathNode.LineTo(13.001f, 19.938f),
                    PathNode.CurveTo(17.18528f, 19.410671f, 20.241564f, 15.725627f, 19.986f, 11.516f),
                    PathNode.Close,
                    PathNode.MoveTo(8.0f, 5.072f),
                    PathNode.CurveTo(6.354813f, 6.021949f, 5.101371f, 7.526363f, 4.464f, 9.316f),
                    PathNode.LineTo(9.276f, 10.742f),
                    PathNode.CurveTo(9.766303f, 9.679405f, 10.829741f, 8.998911f, 12.0f, 8.998911f),
                    PathNode.CurveTo(13.170259f, 8.998911f, 14.233697f, 9.679405f, 14.724f, 10.742f),
                    PathNode.LineTo(19.536f, 9.316f),
                    PathNode.CurveTo(18.739317f, 7.079313f, 16.990261f, 5.312073f, 14.761937f, 4.49229f),
                    PathNode.CurveTo(12.533612f, 3.672507f, 10.056272f, 3.884893f, 8.0f, 5.072f)
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
        return _steeringWheel!!
    }

private var _steeringWheel: ImageVector? = null
