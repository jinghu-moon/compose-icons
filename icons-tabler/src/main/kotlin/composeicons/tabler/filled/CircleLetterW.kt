package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleLetterW: ImageVector
    get() {
        if (_circleLetterW != null) return _circleLetterW!!
        _circleLetterW = tablerFilledIcon(
            name = "CircleLetterW",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.CurveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f),
                    PathNode.CurveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f),
                    PathNode.CurveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f),
                    PathNode.MoveTo(14.008f, 7.876f),
                    PathNode.LineTo(13.488f, 12.029f),
                    PathNode.LineTo(12.928f, 10.629f),
                    PathNode.CurveTo(12.609f, 9.83f, 11.518f, 9.792f, 11.125f, 10.515f),
                    PathNode.LineTo(11.072f, 10.629f),
                    PathNode.LineTo(10.511f, 12.029f),
                    PathNode.LineTo(9.992f, 7.876f),
                    PathNode.CurveTo(9.929111f, 7.372624f, 9.499274f, 6.996087f, 8.992f, 7.0f),
                    PathNode.LineTo(8.876f, 7.008f),
                    PathNode.CurveTo(8.328217f, 7.076629f, 7.939678f, 7.576178f, 8.008001f, 8.124f),
                    PathNode.LineTo(9.008f, 16.124f),
                    PathNode.CurveTo(9.136f, 17.149f, 10.545f, 17.331f, 10.928f, 16.371f),
                    PathNode.LineTo(12.0f, 13.693f),
                    PathNode.LineTo(13.072f, 16.371f),
                    PathNode.CurveTo(13.455f, 17.331f, 14.864f, 17.149f, 14.992f, 16.124f),
                    PathNode.LineTo(15.992f, 8.124f),
                    PathNode.CurveTo(16.046589f, 7.583686f, 15.659971f, 7.098563f, 15.121099f, 7.031204f),
                    PathNode.CurveTo(14.582229f, 6.963845f, 14.088092f, 7.338874f, 14.008f, 7.876f)
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
        return _circleLetterW!!
    }

private var _circleLetterW: ImageVector? = null
