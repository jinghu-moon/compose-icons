package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Carambola: ImageVector
    get() {
        if (_carambola != null) return _carambola!!
        _carambola = tablerFilledIcon(
            name = "Carambola",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.108f, 22.085f),
                    PathNode.CurveTo(15.842f, 22.017f, 14.184f, 21.226f, 12.037f, 19.73f),
                    PathNode.LineTo(11.997f, 19.703f),
                    PathNode.LineTo(11.96f, 19.73f),
                    PathNode.CurveTo(9.813f, 21.227f, 8.156f, 22.018f, 6.888f, 22.086f),
                    PathNode.LineTo(6.71f, 22.091f),
                    PathNode.CurveTo(3.963f, 22.091f, 3.613f, 19.451f, 4.992f, 14.847f),
                    PathNode.LineTo(5.046f, 14.669f),
                    PathNode.LineTo(4.946f, 14.594f),
                    PathNode.CurveTo(-1.11f, 9.956f, -0.1f, 6.746f, 7.5f, 6.528f),
                    PathNode.LineTo(7.702f, 6.523f),
                    PathNode.LineTo(7.817f, 6.197f),
                    PathNode.CurveTo(9.001f, 2.867f, 10.243f, 1.112f, 11.844f, 1.005f),
                    PathNode.LineTo(12.0f, 1.0f),
                    PathNode.CurveTo(13.674f, 1.0f, 14.957f, 2.76f, 16.182f, 6.197f),
                    PathNode.LineTo(16.296f, 6.523f),
                    PathNode.LineTo(16.5f, 6.528f),
                    PathNode.CurveTo(24.1f, 6.746f, 25.11f, 9.956f, 19.053f, 14.593f),
                    PathNode.LineTo(18.951f, 14.668f),
                    PathNode.LineTo(19.006f, 14.846f),
                    PathNode.CurveTo(20.356f, 19.358f, 20.046f, 21.983f, 17.45f, 22.086f),
                    PathNode.LineTo(17.287f, 22.089f),
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
        return _carambola!!
    }

private var _carambola: ImageVector? = null
