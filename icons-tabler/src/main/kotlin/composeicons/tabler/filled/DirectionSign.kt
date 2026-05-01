package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DirectionSign: ImageVector
    get() {
        if (_directionSign != null) return _directionSign!!
        _directionSign = tablerFilledIcon(
            name = "DirectionSign",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.52f, 2.614f),
                    PathNode.CurveTo(11.290742f, 1.843596f, 12.523398f, 1.792724f, 13.355f, 2.497f),
                    PathNode.LineTo(13.481f, 2.614f),
                    PathNode.LineTo(21.386f, 10.519f),
                    PathNode.CurveTo(22.163f, 11.296f, 22.202f, 12.532f, 21.503f, 13.355f),
                    PathNode.LineTo(21.386f, 13.481f),
                    PathNode.LineTo(13.481f, 21.386f),
                    PathNode.CurveTo(12.710335f, 22.157484f, 11.476594f, 22.208382f, 10.645f, 21.503f),
                    PathNode.LineTo(10.519f, 21.386f),
                    PathNode.LineTo(2.612f, 13.48f),
                    PathNode.CurveTo(1.84266f, 12.70852f, 1.792674f, 11.476258f, 2.497f, 10.645f),
                    PathNode.LineTo(2.614f, 10.519f),
                    PathNode.LineTo(10.519f, 2.614f),
                    PathNode.Close,
                    PathNode.MoveTo(16.489f, 12.149f),
                    PathNode.LineTo(16.499f, 12.033f),
                    PathNode.LineTo(16.496f, 11.913f),
                    PathNode.LineTo(16.48f, 11.799f),
                    PathNode.LineTo(16.45f, 11.689f),
                    PathNode.LineTo(16.406f, 11.577f),
                    PathNode.LineTo(16.354f, 11.479f),
                    PathNode.LineTo(16.278f, 11.374f),
                    PathNode.LineTo(16.208f, 11.293f),
                    PathNode.LineTo(12.708f, 7.793f),
                    PathNode.LineTo(12.613f, 7.71f),
                    PathNode.CurveTo(12.252256f, 7.430111f, 11.747744f, 7.430111f, 11.387f, 7.71f),
                    PathNode.LineTo(11.293f, 7.793f),
                    PathNode.LineTo(11.21f, 7.887f),
                    PathNode.CurveTo(10.930111f, 8.247744f, 10.930111f, 8.752256f, 11.21f, 9.113f),
                    PathNode.LineTo(11.293f, 9.207f),
                    PathNode.LineTo(13.085f, 11.0f),
                    PathNode.LineTo(8.0f, 11.0f),
                    PathNode.LineTo(7.883f, 11.007f),
                    PathNode.CurveTo(7.379949f, 11.066836f, 7.001115f, 11.493402f, 7.001115f, 12.0f),
                    PathNode.CurveTo(7.001115f, 12.506598f, 7.379949f, 12.933164f, 7.883f, 12.993f),
                    PathNode.LineTo(8.0f, 13.0f),
                    PathNode.LineTo(13.085f, 13.0f),
                    PathNode.LineTo(11.293f, 14.793f),
                    PathNode.LineTo(11.21f, 14.887f),
                    PathNode.CurveTo(10.901423f, 15.285102f, 10.937099f, 15.850574f, 11.293262f, 16.206738f),
                    PathNode.CurveTo(11.649426f, 16.5629f, 12.214898f, 16.598577f, 12.613f, 16.29f),
                    PathNode.LineTo(12.707f, 16.207f),
                    PathNode.LineTo(16.207f, 12.707f),
                    PathNode.LineTo(16.304f, 12.595f),
                    PathNode.LineTo(16.354f, 12.521f),
                    PathNode.LineTo(16.391f, 12.454f),
                    PathNode.LineTo(16.441f, 12.342f),
                    PathNode.LineTo(16.464f, 12.266f),
                    PathNode.LineTo(16.489f, 12.149f),
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
        return _directionSign!!
    }

private var _directionSign: ImageVector? = null
