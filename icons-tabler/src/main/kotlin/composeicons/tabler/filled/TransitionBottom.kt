package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.TransitionBottom: ImageVector
    get() {
        if (_transitionBottom != null) return _transitionBottom!!
        _transitionBottom = tablerFilledIcon(
            name = "TransitionBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 17.0f),
                    PathNode.CurveTo(21.552284f, 17.0f, 22.0f, 17.447716f, 22.0f, 18.0f),
                    PathNode.CurveTo(22.0f, 20.209139f, 20.209139f, 22.0f, 18.0f, 22.0f),
                    PathNode.LineTo(6.0f, 22.0f),
                    PathNode.CurveTo(3.790861f, 22.0f, 2.0f, 20.209139f, 2.0f, 18.0f),
                    PathNode.CurveTo(2.0f, 17.447716f, 2.447715f, 17.0f, 3.0f, 17.0f),
                    PathNode.CurveTo(3.552285f, 17.0f, 4.0f, 17.447716f, 4.0f, 18.0f),
                    PathNode.CurveTo(4.0f, 19.10457f, 4.895431f, 20.0f, 6.0f, 20.0f),
                    PathNode.LineTo(18.0f, 20.0f),
                    PathNode.CurveTo(19.046625f, 20.000332f, 19.916504f, 19.193678f, 19.995f, 18.15f),
                    PathNode.LineTo(20.0f, 18.0f),
                    PathNode.CurveTo(20.0f, 17.447716f, 20.447716f, 17.0f, 21.0f, 17.0f),
                    PathNode.MoveTo(12.0f, 18.0f),
                    PathNode.LineTo(11.918f, 17.996f),
                    PathNode.LineTo(11.799f, 17.98f),
                    PathNode.LineTo(11.688f, 17.95f),
                    PathNode.LineTo(11.577f, 17.906f),
                    PathNode.LineTo(11.479f, 17.854f),
                    PathNode.LineTo(11.383f, 17.787f),
                    PathNode.LineTo(11.293f, 17.707f),
                    PathNode.LineTo(8.293f, 14.707f),
                    PathNode.CurveTo(7.914028f, 14.314621f, 7.919448f, 13.690915f, 8.305182f, 13.305182f),
                    PathNode.CurveTo(8.690915f, 12.919448f, 9.314621f, 12.914028f, 9.707f, 13.293f),
                    PathNode.LineTo(11.0f, 14.586f),
                    PathNode.LineTo(11.0f, 10.0f),
                    PathNode.LineTo(6.0f, 10.0f),
                    PathNode.CurveTo(3.790861f, 10.0f, 2.0f, 8.209139f, 2.0f, 6.0f),
                    PathNode.CurveTo(2.0f, 3.790861f, 3.790861f, 2.0f, 6.0f, 2.0f),
                    PathNode.LineTo(18.0f, 2.0f),
                    PathNode.CurveTo(20.209139f, 2.0f, 22.0f, 3.790861f, 22.0f, 6.0f),
                    PathNode.CurveTo(22.0f, 8.209139f, 20.209139f, 10.0f, 18.0f, 10.0f),
                    PathNode.LineTo(13.0f, 10.0f),
                    PathNode.LineTo(13.0f, 14.583f),
                    PathNode.LineTo(14.293f, 13.293f),
                    PathNode.CurveTo(14.649268f, 12.936765f, 15.214914f, 12.901197f, 15.613f, 13.21f),
                    PathNode.LineTo(15.707f, 13.293f),
                    PathNode.CurveTo(16.097382f, 13.6835f, 16.097382f, 14.3165f, 15.707f, 14.707f),
                    PathNode.LineTo(12.707f, 17.707f),
                    PathNode.LineTo(12.595f, 17.804f),
                    PathNode.LineTo(12.485f, 17.875f),
                    PathNode.LineTo(12.423f, 17.906f),
                    PathNode.LineTo(12.342f, 17.94f),
                    PathNode.LineTo(12.266f, 17.964f),
                    PathNode.LineTo(12.117f, 17.994f),
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
        return _transitionBottom!!
    }

private var _transitionBottom: ImageVector? = null
