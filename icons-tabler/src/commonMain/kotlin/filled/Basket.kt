package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Basket: ImageVector
    get() {
        if (_basket != null) return _basket!!
        _basket = tablerFilledIcon(
            name = "Basket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.949f, 3.684f),
                    PathNode.LineTo(17.053f, 7.0f),
                    PathNode.LineTo(19.0f, 7.0f),
                    PathNode.CurveTo(19.879019f, 6.999952f, 20.713833f, 7.385423f, 21.283857f, 8.054559f),
                    PathNode.CurveTo(21.853884f, 8.723694f, 22.101765f, 9.609164f, 21.962f, 10.477f),
                    PathNode.LineTo(20.71f, 17.608f),
                    PathNode.CurveTo(20.409868f, 19.55961f, 18.730553f, 21.000237f, 16.756f, 21.0f),
                    PathNode.LineTo(7.244f, 21.0f),
                    PathNode.CurveTo(5.27684f, 21.002407f, 3.600844f, 19.572083f, 3.294f, 17.629f),
                    PathNode.LineTo(2.036f, 10.456f),
                    PathNode.CurveTo(1.902988f, 9.591091f, 2.154248f, 8.711219f, 2.72393f, 8.046974f),
                    PathNode.CurveTo(3.293612f, 7.38273f, 4.124924f, 7.000333f, 5.0f, 7.0f),
                    PathNode.LineTo(6.945f, 7.0f),
                    PathNode.LineTo(8.05f, 3.684f),
                    PathNode.CurveTo(8.224522f, 3.159882f, 8.790882f, 2.876478f, 9.315f, 3.051f),
                    PathNode.CurveTo(9.839118f, 3.225522f, 10.122522f, 3.791882f, 9.948f, 4.316f),
                    PathNode.LineTo(9.053f, 7.0f),
                    PathNode.LineTo(14.946f, 7.0f),
                    PathNode.LineTo(14.051f, 4.316f),
                    PathNode.CurveTo(13.876478f, 3.791882f, 14.159882f, 3.225522f, 14.684f, 3.051f),
                    PathNode.CurveTo(15.208118f, 2.876478f, 15.774478f, 3.159882f, 15.949f, 3.684f),
                    PathNode.MoveTo(12.0f, 11.0f),
                    PathNode.CurveTo(10.411443f, 10.999911f, 9.098195f, 12.238178f, 9.005f, 13.824f),
                    PathNode.LineTo(9.0f, 14.0f),
                    PathNode.CurveTo(9.0f, 15.656855f, 10.343145f, 17.0f, 12.0f, 17.0f),
                    PathNode.CurveTo(13.656855f, 17.0f, 15.0f, 15.656855f, 15.0f, 14.0f),
                    PathNode.CurveTo(15.0f, 12.343145f, 13.656855f, 11.0f, 12.0f, 11.0f)
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
        return _basket!!
    }

private var _basket: ImageVector? = null
