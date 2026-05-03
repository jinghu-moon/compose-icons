package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandWeibo: ImageVector
    get() {
        if (_brandWeibo != null) return _brandWeibo!!
        _brandWeibo = tablerFilledIcon(
            name = "BrandWeibo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.972f, 8.183f),
                    PathNode.CurveTo(7.782f, 5.196f, 11.134f, 3.976f, 12.978f, 5.943f),
                    PathNode.CurveTo(13.276f, 6.259f, 13.532f, 6.716f, 13.714f, 7.209f),
                    PathNode.LineTo(13.841f, 7.178f),
                    PathNode.CurveTo(15.905f, 6.709f, 17.841f, 8.465f, 17.658f, 10.722f),
                    PathNode.LineTo(17.653f, 10.758f),
                    PathNode.LineTo(17.803f, 10.815f),
                    PathNode.CurveTo(19.263f, 11.389f, 19.943f, 12.17f, 19.996f, 13.896f),
                    PathNode.LineTo(20.0f, 14.127f),
                    PathNode.CurveTo(20.0f, 17.903f, 15.893f, 21.0f, 11.0f, 21.0f),
                    PathNode.CurveTo(6.146f, 21.0f, 2.0f, 18.28f, 2.0f, 14.435f),
                    PathNode.CurveTo(2.0f, 12.395f, 3.068f, 10.213f, 4.972f, 8.183f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 3.0f),
                    PathNode.CurveTo(19.31371f, 3.0f, 22.0f, 5.686292f, 22.0f, 9.0f),
                    PathNode.LineTo(22.0f, 10.0f),
                    PathNode.CurveTo(22.0f, 10.552285f, 21.552284f, 11.0f, 21.0f, 11.0f),
                    PathNode.CurveTo(20.447716f, 11.0f, 20.0f, 10.552285f, 20.0f, 10.0f),
                    PathNode.LineTo(20.0f, 9.0f),
                    PathNode.CurveTo(20.0f, 6.790861f, 18.209139f, 5.0f, 16.0f, 5.0f),
                    PathNode.LineTo(15.0f, 5.0f),
                    PathNode.CurveTo(14.447715f, 5.0f, 14.0f, 4.552285f, 14.0f, 4.0f),
                    PathNode.CurveTo(14.0f, 3.447715f, 14.447715f, 3.0f, 15.0f, 3.0f),
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
        return _brandWeibo!!
    }

private var _brandWeibo: ImageVector? = null
