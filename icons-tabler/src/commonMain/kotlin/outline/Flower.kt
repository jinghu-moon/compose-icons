package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Flower: ImageVector
    get() {
        if (_flower != null) return _flower!!
        _flower = tablerOutlineIcon(
            name = "Flower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 12.0f),
                    PathNode.CurveTo(9.0f, 13.656855f, 10.343145f, 15.0f, 12.0f, 15.0f),
                    PathNode.CurveTo(13.656855f, 15.0f, 15.0f, 13.656855f, 15.0f, 12.0f),
                    PathNode.CurveTo(15.0f, 10.343145f, 13.656855f, 9.0f, 12.0f, 9.0f),
                    PathNode.CurveTo(10.343145f, 9.0f, 9.0f, 10.343145f, 9.0f, 12.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.CurveTo(13.656855f, 2.0f, 15.0f, 3.343146f, 15.0f, 5.0f),
                    PathNode.CurveTo(15.0f, 5.562f, 14.741f, 6.442f, 14.224f, 7.64f),
                    PathNode.LineTo(13.5f, 9.0f),
                    PathNode.LineTo(15.26f, 7.107f),
                    PathNode.CurveTo(15.759f, 6.507f, 16.182f, 6.107f, 16.53f, 5.902f),
                    PathNode.CurveTo(17.21464f, 5.50448f, 18.02972f, 5.396958f, 18.794024f, 5.603339f),
                    PathNode.CurveTo(19.558329f, 5.809719f, 20.208506f, 6.312897f, 20.6f, 7.001f),
                    PathNode.CurveTo(21.42327f, 8.434603f, 20.936718f, 10.263857f, 19.51f, 11.099f),
                    PathNode.CurveTo(19.136f, 11.316f, 18.52f, 11.495f, 17.664f, 11.634f),
                    PathNode.LineTo(15.0f, 12.0f),
                    PathNode.LineTo(17.4f, 12.326f),
                    PathNode.CurveTo(18.4f, 12.471f, 19.098f, 12.663f, 19.51f, 12.902f),
                    PathNode.CurveTo(20.936718f, 13.737144f, 21.42327f, 15.566398f, 20.6f, 17.0f),
                    PathNode.CurveTo(20.208336f, 17.687931f, 19.558084f, 18.190899f, 18.793797f, 18.397087f),
                    PathNode.CurveTo(18.029507f, 18.603275f, 17.214518f, 18.495602f, 16.53f, 18.098f),
                    PathNode.CurveTo(16.182f, 17.896f, 15.759f, 17.494f, 15.26f, 16.893f),
                    PathNode.LineTo(13.5f, 15.0f),
                    PathNode.LineTo(14.224f, 16.36f),
                    PathNode.CurveTo(14.74f, 17.559f, 15.0f, 18.439f, 15.0f, 19.0f),
                    PathNode.CurveTo(15.0f, 20.656855f, 13.656855f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(10.343145f, 22.0f, 9.0f, 20.656855f, 9.0f, 19.0f),
                    PathNode.CurveTo(9.0f, 18.438f, 9.259f, 17.558f, 9.776f, 16.36f),
                    PathNode.LineTo(10.5f, 15.0f),
                    PathNode.LineTo(8.74f, 16.893f),
                    PathNode.CurveTo(8.241f, 17.494f, 7.818f, 17.893f, 7.47f, 18.098f),
                    PathNode.CurveTo(6.785482f, 18.495602f, 5.970494f, 18.603275f, 5.206204f, 18.397087f),
                    PathNode.CurveTo(4.441915f, 18.190899f, 3.791664f, 17.687931f, 3.4f, 17.0f),
                    PathNode.CurveTo(2.576731f, 15.566398f, 3.063282f, 13.737144f, 4.49f, 12.902f),
                    PathNode.CurveTo(4.864f, 12.684f, 5.48f, 12.506f, 6.336f, 12.366f),
                    PathNode.LineTo(9.0f, 12.0f),
                    PathNode.LineTo(6.6f, 11.675f),
                    PathNode.CurveTo(5.6f, 11.53f, 4.902f, 11.338f, 4.49f, 11.099f),
                    PathNode.CurveTo(3.062686f, 10.263824f, 2.576055f, 8.433826f, 3.4f, 7.0f),
                    PathNode.CurveTo(3.791495f, 6.311898f, 4.441672f, 5.808719f, 5.205976f, 5.602339f),
                    PathNode.CurveTo(5.970279f, 5.395958f, 6.785361f, 5.50348f, 7.47f, 5.901f),
                    PathNode.CurveTo(7.818f, 6.104f, 8.241f, 6.505f, 8.74f, 7.106f),
                    PathNode.LineTo(10.5f, 9.0f),
                    PathNode.CurveTo(9.5f, 6.708f, 9.0f, 5.375f, 9.0f, 5.0f),
                    PathNode.CurveTo(9.0f, 3.343146f, 10.343145f, 2.0f, 12.0f, 2.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _flower!!
    }

private var _flower: ImageVector? = null
