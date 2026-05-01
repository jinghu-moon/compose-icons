package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Ballpen: ImageVector
    get() {
        if (_ballpen != null) return _ballpen!!
        _ballpen = tablerFilledIcon(
            name = "Ballpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.828f, 2.0f),
                    PathNode.CurveTo(18.555273f, 1.999842f, 19.257847f, 2.263883f, 19.805f, 2.743f),
                    PathNode.LineTo(19.95f, 2.879f),
                    PathNode.LineTo(21.121f, 4.049f),
                    PathNode.CurveTo(22.239637f, 5.166311f, 22.299137f, 6.960015f, 21.257f, 8.149f),
                    PathNode.LineTo(21.121f, 8.293f),
                    PathNode.LineTo(19.415f, 10.0f),
                    PathNode.LineTo(21.707f, 12.293f),
                    PathNode.CurveTo(22.063234f, 12.649268f, 22.098803f, 13.214914f, 21.79f, 13.613f),
                    PathNode.LineTo(21.707f, 13.707f),
                    PathNode.LineTo(17.707f, 17.707f),
                    PathNode.CurveTo(17.333523f, 18.07921f, 16.735212f, 18.09748f, 16.339722f, 17.74875f),
                    PathNode.CurveTo(15.94423f, 17.400023f, 15.887465f, 16.804129f, 16.21f, 16.387f),
                    PathNode.LineTo(16.293f, 16.293f),
                    PathNode.LineTo(19.585f, 13.0f),
                    PathNode.LineTo(17.999f, 11.415f),
                    PathNode.LineTo(10.535f, 18.879f),
                    PathNode.CurveTo(9.874005f, 19.539938f, 8.99402f, 19.93618f, 8.061f, 19.993f),
                    PathNode.LineTo(7.828f, 20.001f),
                    PathNode.CurveTo(7.154f, 20.001f, 6.498f, 19.823f, 5.923f, 19.493f),
                    PathNode.LineTo(4.707f, 20.707f),
                    PathNode.CurveTo(4.333524f, 21.07921f, 3.735212f, 21.09748f, 3.339722f, 20.74875f),
                    PathNode.CurveTo(2.944231f, 20.400023f, 2.887465f, 19.804129f, 3.21f, 19.387f),
                    PathNode.LineTo(3.293f, 19.293f),
                    PathNode.LineTo(4.507f, 18.077f),
                    PathNode.CurveTo(3.689674f, 16.652273f, 3.872352f, 14.864924f, 4.961f, 13.635f),
                    PathNode.LineTo(5.121f, 13.465f),
                    PathNode.LineTo(15.707f, 2.879f),
                    PathNode.CurveTo(16.221f, 2.364541f, 16.904375f, 2.054304f, 17.63f, 2.006f),
                    PathNode.LineTo(17.828f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(17.828f, 4.0f),
                    PathNode.CurveTo(17.608202f, 3.999982f, 17.39452f, 4.072381f, 17.22f, 4.206f),
                    PathNode.LineTo(17.121f, 4.293f),
                    PathNode.LineTo(15.414f, 6.0f),
                    PathNode.LineTo(18.0f, 8.585f),
                    PathNode.LineTo(19.707f, 6.879f),
                    PathNode.CurveTo(19.862423f, 6.723447f, 19.962236f, 6.521003f, 19.991f, 6.303f),
                    PathNode.LineTo(20.001f, 6.172f),
                    PathNode.CurveTo(20.000952f, 5.951743f, 19.928185f, 5.737664f, 19.794f, 5.563f),
                    PathNode.LineTo(19.707f, 5.464f),
                    PathNode.LineTo(18.536f, 4.293f),
                    PathNode.CurveTo(18.348263f, 4.105206f, 18.093542f, 3.999791f, 17.828f, 4.0f),
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
        return _ballpen!!
    }

private var _ballpen: ImageVector? = null
