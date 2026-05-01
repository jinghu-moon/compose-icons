package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.TransitionRight: ImageVector
    get() {
        if (_transitionRight != null) return _transitionRight!!
        _transitionRight = tablerFilledIcon(
            name = "TransitionRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 2.0f),
                    PathNode.CurveTo(20.209139f, 2.0f, 22.0f, 3.790861f, 22.0f, 6.0f),
                    PathNode.LineTo(22.0f, 18.0f),
                    PathNode.CurveTo(22.0f, 20.209139f, 20.209139f, 22.0f, 18.0f, 22.0f),
                    PathNode.CurveTo(17.470907f, 21.999413f, 17.033834f, 21.58679f, 17.002829f, 21.058605f),
                    PathNode.CurveTo(16.97182f, 20.53042f, 17.357609f, 20.06949f, 17.883f, 20.007f),
                    PathNode.LineTo(18.0f, 20.0f),
                    PathNode.CurveTo(19.10457f, 20.0f, 20.0f, 19.10457f, 20.0f, 18.0f),
                    PathNode.LineTo(20.0f, 6.0f),
                    PathNode.CurveTo(20.0f, 4.895431f, 19.10457f, 4.0f, 18.0f, 4.0f),
                    PathNode.CurveTo(17.447716f, 4.0f, 17.0f, 3.552285f, 17.0f, 3.0f),
                    PathNode.CurveTo(17.0f, 2.447715f, 17.447716f, 2.0f, 18.0f, 2.0f),
                    PathNode.MoveTo(10.0f, 18.0f),
                    PathNode.CurveTo(10.0f, 20.209139f, 8.209139f, 22.0f, 6.0f, 22.0f),
                    PathNode.CurveTo(3.790861f, 22.0f, 2.0f, 20.209139f, 2.0f, 18.0f),
                    PathNode.LineTo(2.0f, 6.0f),
                    PathNode.CurveTo(2.0f, 3.790861f, 3.790861f, 2.0f, 6.0f, 2.0f),
                    PathNode.CurveTo(8.209139f, 2.0f, 10.0f, 3.790861f, 10.0f, 6.0f),
                    PathNode.LineTo(10.0f, 11.0f),
                    PathNode.LineTo(14.585f, 11.0f),
                    PathNode.LineTo(13.293f, 9.707f),
                    PathNode.CurveTo(12.936765f, 9.350732f, 12.901197f, 8.785086f, 13.21f, 8.387f),
                    PathNode.LineTo(13.293f, 8.293f),
                    PathNode.CurveTo(13.6835f, 7.902618f, 14.3165f, 7.902618f, 14.707f, 8.293f),
                    PathNode.LineTo(17.707f, 11.293f),
                    PathNode.LineTo(17.804f, 11.405f),
                    PathNode.LineTo(17.875f, 11.515f),
                    PathNode.LineTo(17.906f, 11.577f),
                    PathNode.LineTo(17.94f, 11.658f),
                    PathNode.LineTo(17.964f, 11.734f),
                    PathNode.LineTo(17.994f, 11.882f),
                    PathNode.LineTo(18.0f, 12.0f),
                    PathNode.LineTo(17.996f, 12.085f),
                    PathNode.LineTo(17.98f, 12.201f),
                    PathNode.LineTo(17.95f, 12.312f),
                    PathNode.LineTo(17.906f, 12.423f),
                    PathNode.LineTo(17.854f, 12.521f),
                    PathNode.LineTo(17.78f, 12.625f),
                    PathNode.LineTo(17.707f, 12.707f),
                    PathNode.LineTo(14.707f, 15.707f),
                    PathNode.CurveTo(14.314621f, 16.085972f, 13.690915f, 16.080553f, 13.305182f, 15.694818f),
                    PathNode.CurveTo(12.919448f, 15.309085f, 12.914028f, 14.685379f, 13.293f, 14.293f),
                    PathNode.LineTo(14.585f, 13.0f),
                    PathNode.LineTo(10.0f, 13.0f),
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
        return _transitionRight!!
    }

private var _transitionRight: ImageVector? = null
