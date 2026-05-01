package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SwipeDown: ImageVector
    get() {
        if (_swipeDown != null) return _swipeDown!!
        _swipeDown = tablerFilledIcon(
            name = "SwipeDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 3.0f),
                    PathNode.CurveTo(14.568958f, 2.996902f, 16.722233f, 4.941077f, 16.980665f, 7.497006f),
                    PathNode.CurveTo(17.2391f, 10.052934f, 15.518583f, 12.388793f, 13.001f, 12.9f),
                    PathNode.LineTo(13.0f, 17.584f),
                    PathNode.LineTo(14.293f, 16.293f),
                    PathNode.CurveTo(14.649268f, 15.936765f, 15.214914f, 15.901197f, 15.613f, 16.21f),
                    PathNode.LineTo(15.707f, 16.293f),
                    PathNode.CurveTo(16.097382f, 16.6835f, 16.097382f, 17.3165f, 15.707f, 17.707f),
                    PathNode.LineTo(12.707f, 20.707f),
                    PathNode.CurveTo(12.672116f, 20.742058f, 12.634681f, 20.77448f, 12.595f, 20.804f),
                    PathNode.LineTo(12.485f, 20.875f),
                    PathNode.LineTo(12.371f, 20.929f),
                    PathNode.LineTo(12.266f, 20.964f),
                    PathNode.LineTo(12.117f, 20.994f),
                    PathNode.LineTo(12.0f, 21.0f),
                    PathNode.LineTo(11.925f, 20.997f),
                    PathNode.LineTo(11.799f, 20.98f),
                    PathNode.LineTo(11.688f, 20.95f),
                    PathNode.LineTo(11.577f, 20.906f),
                    PathNode.LineTo(11.479f, 20.854f),
                    PathNode.LineTo(11.383f, 20.787f),
                    PathNode.LineTo(11.293f, 20.707f),
                    PathNode.LineTo(8.293f, 17.707f),
                    PathNode.CurveTo(7.914028f, 17.31462f, 7.919448f, 16.690916f, 8.305182f, 16.305182f),
                    PathNode.CurveTo(8.690915f, 15.919448f, 9.314621f, 15.914028f, 9.707f, 16.293f),
                    PathNode.LineTo(11.0f, 17.585f),
                    PathNode.LineTo(11.0f, 12.9f),
                    PathNode.CurveTo(8.490975f, 12.380274f, 6.780407f, 10.048599f, 7.037914f, 7.499285f),
                    PathNode.CurveTo(7.29542f, 4.949969f, 9.437723f, 3.007474f, 12.0f, 3.0f)
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
        return _swipeDown!!
    }

private var _swipeDown: ImageVector? = null
