package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SwipeLeft: ImageVector
    get() {
        if (_swipeLeft != null) return _swipeLeft!!
        _swipeLeft = tablerFilledIcon(
            name = "SwipeLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 7.0f),
                    PathNode.CurveTo(18.63097f, 7.000645f, 20.811342f, 9.040069f, 20.987549f, 11.665131f),
                    PathNode.CurveTo(21.163755f, 14.290193f, 19.275505f, 16.60272f, 16.668224f, 16.95498f),
                    PathNode.CurveTo(14.060944f, 17.307241f, 11.62672f, 15.578706f, 11.1f, 13.001f),
                    PathNode.LineTo(6.415f, 13.0f),
                    PathNode.LineTo(7.707f, 14.293f),
                    PathNode.CurveTo(8.063236f, 14.649268f, 8.098803f, 15.214914f, 7.79f, 15.613f),
                    PathNode.LineTo(7.707f, 15.707f),
                    PathNode.CurveTo(7.3165f, 16.097382f, 6.6835f, 16.097382f, 6.293f, 15.707f),
                    PathNode.LineTo(3.293f, 12.707f),
                    PathNode.CurveTo(3.257942f, 12.672116f, 3.225519f, 12.634681f, 3.196f, 12.595f),
                    PathNode.LineTo(3.125f, 12.485f),
                    PathNode.LineTo(3.071f, 12.371f),
                    PathNode.LineTo(3.036f, 12.266f),
                    PathNode.LineTo(3.011f, 12.148f),
                    PathNode.LineTo(3.004f, 12.09f),
                    PathNode.LineTo(3.0f, 12.0f),
                    PathNode.LineTo(3.003f, 11.925f),
                    PathNode.LineTo(3.02f, 11.799f),
                    PathNode.LineTo(3.05f, 11.688f),
                    PathNode.LineTo(3.094f, 11.577f),
                    PathNode.LineTo(3.146f, 11.479f),
                    PathNode.LineTo(3.213f, 11.383f),
                    PathNode.LineTo(3.293f, 11.293f),
                    PathNode.LineTo(6.293f, 8.293f),
                    PathNode.CurveTo(6.685379f, 7.914028f, 7.309085f, 7.919448f, 7.694819f, 8.305182f),
                    PathNode.CurveTo(8.080552f, 8.690915f, 8.085972f, 9.314621f, 7.707f, 9.707f),
                    PathNode.LineTo(6.415f, 11.0f),
                    PathNode.LineTo(11.1f, 11.0f),
                    PathNode.CurveTo(11.575269f, 8.671669f, 13.623657f, 6.999515f, 16.0f, 7.0f)
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
        return _swipeLeft!!
    }

private var _swipeLeft: ImageVector? = null
