package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.TransitionLeft: ImageVector
    get() {
        if (_transitionLeft != null) return _transitionLeft!!
        _transitionLeft = tablerFilledIcon(
            name = "TransitionLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 2.0f),
                    PathNode.CurveTo(6.552285f, 2.0f, 7.0f, 2.447715f, 7.0f, 3.0f),
                    PathNode.CurveTo(7.0f, 3.552285f, 6.552285f, 4.0f, 6.0f, 4.0f),
                    PathNode.CurveTo(4.895431f, 4.0f, 4.0f, 4.895431f, 4.0f, 6.0f),
                    PathNode.LineTo(4.0f, 18.0f),
                    PathNode.CurveTo(3.999669f, 19.046625f, 4.806323f, 19.916504f, 5.85f, 19.995f),
                    PathNode.LineTo(6.0f, 20.0f),
                    PathNode.CurveTo(6.552285f, 20.0f, 7.0f, 20.447716f, 7.0f, 21.0f),
                    PathNode.CurveTo(7.0f, 21.552284f, 6.552285f, 22.0f, 6.0f, 22.0f),
                    PathNode.CurveTo(3.790861f, 22.0f, 2.0f, 20.209139f, 2.0f, 18.0f),
                    PathNode.LineTo(2.0f, 6.0f),
                    PathNode.CurveTo(2.0f, 3.790861f, 3.790861f, 2.0f, 6.0f, 2.0f),
                    PathNode.MoveTo(18.0f, 2.0f),
                    PathNode.CurveTo(20.209139f, 2.0f, 22.0f, 3.790861f, 22.0f, 6.0f),
                    PathNode.LineTo(22.0f, 18.0f),
                    PathNode.CurveTo(22.0f, 20.209139f, 20.209139f, 22.0f, 18.0f, 22.0f),
                    PathNode.CurveTo(15.790861f, 22.0f, 14.0f, 20.209139f, 14.0f, 18.0f),
                    PathNode.LineTo(14.0f, 13.0f),
                    PathNode.LineTo(9.415f, 13.0f),
                    PathNode.LineTo(10.707f, 14.293f),
                    PathNode.CurveTo(11.063235f, 14.649268f, 11.098803f, 15.214914f, 10.79f, 15.613f),
                    PathNode.LineTo(10.707f, 15.707f),
                    PathNode.CurveTo(10.3165f, 16.097382f, 9.6835f, 16.097382f, 9.293f, 15.707f),
                    PathNode.LineTo(6.293f, 12.707f),
                    PathNode.LineTo(6.196f, 12.595f),
                    PathNode.LineTo(6.125f, 12.485f),
                    PathNode.LineTo(6.094f, 12.423f),
                    PathNode.LineTo(6.06f, 12.342f),
                    PathNode.LineTo(6.036f, 12.266f),
                    PathNode.LineTo(6.011f, 12.148f),
                    PathNode.LineTo(6.004f, 12.09f),
                    PathNode.LineTo(6.0f, 11.982f),
                    PathNode.LineTo(6.003f, 11.918f),
                    PathNode.LineTo(6.02f, 11.799f),
                    PathNode.LineTo(6.05f, 11.688f),
                    PathNode.LineTo(6.094f, 11.577f),
                    PathNode.LineTo(6.146f, 11.479f),
                    PathNode.LineTo(6.213f, 11.383f),
                    PathNode.LineTo(6.293f, 11.293f),
                    PathNode.LineTo(9.293f, 8.293f),
                    PathNode.CurveTo(9.685379f, 7.914028f, 10.309085f, 7.919448f, 10.694818f, 8.305182f),
                    PathNode.CurveTo(11.080552f, 8.690915f, 11.085972f, 9.314621f, 10.707f, 9.707f),
                    PathNode.LineTo(9.415f, 11.0f),
                    PathNode.LineTo(14.0f, 11.0f),
                    PathNode.LineTo(14.0f, 6.0f),
                    PathNode.CurveTo(14.0f, 3.790861f, 15.790861f, 2.0f, 18.0f, 2.0f)
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
        return _transitionLeft!!
    }

private var _transitionLeft: ImageVector? = null
