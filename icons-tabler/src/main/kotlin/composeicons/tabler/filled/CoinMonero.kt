package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CoinMonero: ImageVector
    get() {
        if (_coinMonero != null) return _coinMonero!!
        _coinMonero = tablerFilledIcon(
            name = "CoinMonero",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 11.414f),
                    PathNode.LineTo(15.0f, 16.0f),
                    PathNode.CurveTo(15.0f, 16.552284f, 15.447715f, 17.0f, 16.0f, 17.0f),
                    PathNode.LineTo(20.66f, 17.001f),
                    PathNode.CurveTo(18.873606f, 20.094763f, 15.572474f, 22.00056f, 12.0f, 22.00056f),
                    PathNode.CurveTo(8.427526f, 22.00056f, 5.126395f, 20.094763f, 3.34f, 17.001f),
                    PathNode.LineTo(8.0f, 17.0f),
                    PathNode.LineTo(8.117f, 16.993f),
                    PathNode.CurveTo(8.620493f, 16.933683f, 8.999933f, 16.506975f, 9.0f, 16.0f),
                    PathNode.LineTo(9.0f, 11.415f),
                    PathNode.LineTo(11.293f, 13.707f),
                    PathNode.LineTo(11.387f, 13.79f),
                    PathNode.CurveTo(11.785086f, 14.098803f, 12.350732f, 14.063235f, 12.707f, 13.707f),
                    PathNode.LineTo(15.0f, 11.414f),
                    PathNode.Close,
                    PathNode.MoveTo(17.0f, 3.34f),
                    PathNode.CurveTo(21.058393f, 5.682836f, 22.945587f, 10.529679f, 21.54f, 15.0f),
                    PathNode.LineTo(17.0f, 15.0f),
                    PathNode.LineTo(17.0f, 9.0f),
                    PathNode.CurveTo(17.0f, 8.11f, 15.923f, 7.663f, 15.293f, 8.293f),
                    PathNode.LineTo(12.0f, 11.585f),
                    PathNode.LineTo(8.707f, 8.293f),
                    PathNode.LineTo(8.623f, 8.217f),
                    PathNode.CurveTo(7.986f, 7.703f, 7.0f, 8.147001f, 7.0f, 9.0f),
                    PathNode.LineTo(7.0f, 15.0f),
                    PathNode.LineTo(2.46f, 15.0f),
                    PathNode.CurveTo(2.154786f, 14.029261f, 1.999663f, 13.017591f, 2.0f, 12.0f),
                    PathNode.LineTo(2.005f, 11.676f),
                    PathNode.CurveTo(2.118919f, 8.162982f, 4.068822f, 4.967704f, 7.140892f, 3.259883f),
                    PathNode.CurveTo(10.212963f, 1.552061f, 13.95609f, 1.582479f, 17.0f, 3.34f),
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
        return _coinMonero!!
    }

private var _coinMonero: ImageVector? = null
