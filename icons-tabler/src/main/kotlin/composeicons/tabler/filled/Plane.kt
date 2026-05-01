package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Plane: ImageVector
    get() {
        if (_plane != null) return _plane!!
        _plane = tablerFilledIcon(
            name = "Plane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.868f, 2.504f),
                    PathNode.LineTo(16.58f, 9.0f),
                    PathNode.LineTo(20.0f, 9.0f),
                    PathNode.CurveTo(21.656855f, 9.0f, 23.0f, 10.343145f, 23.0f, 12.0f),
                    PathNode.CurveTo(23.0f, 13.656855f, 21.656855f, 15.0f, 20.0f, 15.0f),
                    PathNode.LineTo(16.58f, 15.0f),
                    PathNode.LineTo(12.868f, 21.496f),
                    PathNode.CurveTo(12.690036f, 21.807552f, 12.358799f, 21.999884f, 12.0f, 22.0f),
                    PathNode.LineTo(9.0f, 22.0f),
                    PathNode.CurveTo(8.686061f, 22.000174f, 8.390262f, 21.85291f, 8.201176f, 21.602303f),
                    PathNode.CurveTo(8.01209f, 21.351694f, 7.951667f, 21.026834f, 8.038f, 20.725f),
                    PathNode.LineTo(9.674f, 15.0f),
                    PathNode.LineTo(7.414f, 15.0f),
                    PathNode.LineTo(5.707f, 16.707f),
                    PathNode.CurveTo(5.519508f, 16.89455f, 5.265195f, 16.999943f, 5.0f, 17.0f),
                    PathNode.LineTo(2.0f, 17.0f),
                    PathNode.CurveTo(1.65356f, 16.999813f, 1.331896f, 16.820332f, 1.149805f, 16.525606f),
                    PathNode.CurveTo(0.967715f, 16.230879f, 0.951141f, 15.862903f, 1.106f, 15.553f),
                    PathNode.LineTo(2.882f, 12.0f),
                    PathNode.LineTo(1.106f, 8.447f),
                    PathNode.CurveTo(0.951141f, 8.137098f, 0.967715f, 7.769121f, 1.149805f, 7.474395f),
                    PathNode.CurveTo(1.331896f, 7.179668f, 1.65356f, 7.000185f, 2.0f, 7.0f),
                    PathNode.LineTo(5.0f, 7.0f),
                    PathNode.CurveTo(5.265195f, 7.000057f, 5.519508f, 7.105451f, 5.707f, 7.293f),
                    PathNode.LineTo(7.414f, 9.0f),
                    PathNode.LineTo(9.674f, 9.0f),
                    PathNode.LineTo(8.038f, 3.275f),
                    PathNode.CurveTo(7.951667f, 2.973165f, 8.01209f, 2.648306f, 8.201176f, 2.397699f),
                    PathNode.CurveTo(8.390262f, 2.14709f, 8.686061f, 1.999826f, 9.0f, 2.0f),
                    PathNode.LineTo(12.0f, 2.0f),
                    PathNode.CurveTo(12.358799f, 2.000116f, 12.690036f, 2.192447f, 12.868f, 2.504f)
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
        return _plane!!
    }

private var _plane: ImageVector? = null
