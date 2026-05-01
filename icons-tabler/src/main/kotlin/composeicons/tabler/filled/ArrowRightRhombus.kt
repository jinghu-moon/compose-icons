package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowRightRhombus: ImageVector
    get() {
        if (_arrowRightRhombus != null) return _arrowRightRhombus!!
        _arrowRightRhombus = tablerFilledIcon(
            name = "ArrowRightRhombus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.707f, 8.293f),
                    PathNode.LineTo(21.707f, 11.293f),
                    PathNode.LineTo(21.804f, 11.405f),
                    PathNode.LineTo(21.875f, 11.515f),
                    PathNode.LineTo(21.906f, 11.577f),
                    PathNode.LineTo(21.94f, 11.658f),
                    PathNode.LineTo(21.964f, 11.734f),
                    PathNode.LineTo(21.994f, 11.882f),
                    PathNode.LineTo(22.0f, 12.0f),
                    PathNode.LineTo(21.996f, 12.085f),
                    PathNode.LineTo(21.98f, 12.201f),
                    PathNode.LineTo(21.95f, 12.312f),
                    PathNode.LineTo(21.906f, 12.423f),
                    PathNode.LineTo(21.854f, 12.521f),
                    PathNode.LineTo(21.78f, 12.625f),
                    PathNode.LineTo(21.707f, 12.707f),
                    PathNode.LineTo(18.707f, 15.707f),
                    PathNode.CurveTo(18.31462f, 16.085972f, 17.690916f, 16.080553f, 17.305182f, 15.694818f),
                    PathNode.CurveTo(16.919447f, 15.309085f, 16.914028f, 14.685379f, 17.293f, 14.293f),
                    PathNode.LineTo(18.585f, 13.0f),
                    PathNode.LineTo(8.414f, 13.0f),
                    PathNode.LineTo(6.207f, 15.207f),
                    PathNode.CurveTo(5.8165f, 15.597382f, 5.1835f, 15.597382f, 4.793f, 15.207f),
                    PathNode.LineTo(2.293f, 12.707f),
                    PathNode.CurveTo(1.902618f, 12.3165f, 1.902618f, 11.6835f, 2.293f, 11.293f),
                    PathNode.LineTo(4.793f, 8.793f),
                    PathNode.CurveTo(5.1835f, 8.402618f, 5.8165f, 8.402618f, 6.207f, 8.793f),
                    PathNode.LineTo(8.415f, 11.0f),
                    PathNode.LineTo(18.585f, 11.0f),
                    PathNode.LineTo(17.293f, 9.707f),
                    PathNode.CurveTo(16.936766f, 9.350732f, 16.901197f, 8.785086f, 17.21f, 8.387f),
                    PathNode.LineTo(17.293f, 8.293f),
                    PathNode.CurveTo(17.6835f, 7.902618f, 18.3165f, 7.902618f, 18.707f, 8.293f)
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
        return _arrowRightRhombus!!
    }

private var _arrowRightRhombus: ImageVector? = null
