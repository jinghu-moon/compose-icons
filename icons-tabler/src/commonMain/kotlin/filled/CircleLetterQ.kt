package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleLetterQ: ImageVector
    get() {
        if (_circleLetterQ != null) return _circleLetterQ!!
        _circleLetterQ = tablerFilledIcon(
            name = "CircleLetterQ",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.CurveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f),
                    PathNode.CurveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f),
                    PathNode.CurveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f),
                    PathNode.MoveTo(12.0f, 7.0f),
                    PathNode.CurveTo(10.343145f, 7.0f, 9.0f, 8.343146f, 9.0f, 10.0f),
                    PathNode.LineTo(9.0f, 14.0f),
                    PathNode.CurveTo(8.999763f, 15.005905f, 9.503673f, 15.944982f, 10.341995f, 16.500914f),
                    PathNode.CurveTo(11.180318f, 17.056845f, 12.241464f, 17.155632f, 13.168f, 16.764f),
                    PathNode.LineTo(13.293f, 16.707f),
                    PathNode.CurveTo(13.685379f, 17.085972f, 14.309085f, 17.080553f, 14.694818f, 16.694818f),
                    PathNode.CurveTo(15.080552f, 16.309084f, 15.085972f, 15.685379f, 14.707f, 15.293f),
                    PathNode.LineTo(14.764f, 15.168f),
                    PathNode.CurveTo(14.919975f, 14.798364f, 15.000224f, 14.401197f, 15.0f, 14.0f),
                    PathNode.LineTo(15.0f, 10.0f),
                    PathNode.CurveTo(15.0f, 8.343146f, 13.656855f, 7.0f, 12.0f, 7.0f),
                    PathNode.MoveTo(13.0f, 14.001f),
                    PathNode.LineTo(12.941f, 14.001f),
                    PathNode.CurveTo(12.410964f, 14.030306f, 11.997059f, 14.470163f, 12.0f, 15.001f),
                    PathNode.CurveTo(11.734611f, 15.001f, 11.480104f, 14.895506f, 11.29254f, 14.707753f),
                    PathNode.CurveTo(11.104975f, 14.52f, 10.999735f, 14.265389f, 11.0f, 14.0f),
                    PathNode.LineTo(11.0f, 10.0f),
                    PathNode.CurveTo(11.0f, 9.447715f, 11.447715f, 9.0f, 12.0f, 9.0f),
                    PathNode.CurveTo(12.552285f, 9.0f, 13.0f, 9.447715f, 13.0f, 10.0f),
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
        return _circleLetterQ!!
    }

private var _circleLetterQ: ImageVector? = null
