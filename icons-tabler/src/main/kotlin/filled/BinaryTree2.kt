package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BinaryTree2: ImageVector
    get() {
        if (_binaryTree2 != null) return _binaryTree2!!
        _binaryTree2 = tablerFilledIcon(
            name = "BinaryTree2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 3.000 C 13.066 3.000 14.052 3.565 14.590 4.485 C 15.128 5.405 15.138 6.541 14.616 7.470 L 17.890 11.212 C 19.247 10.671 20.797 11.186 21.560 12.433 C 22.322 13.679 22.076 15.293 20.977 16.256 C 19.878 17.218 18.245 17.249 17.111 16.328 C 15.976 15.408 15.670 13.804 16.385 12.530 L 13.110 8.787 L 13.000 8.829 L 13.000 15.171 C 14.378 15.658 15.205 17.067 14.958 18.508 C 14.711 19.948 13.462 21.001 12.000 21.001 C 10.538 21.001 9.289 19.948 9.042 18.508 C 8.795 17.067 9.622 15.658 11.000 15.171 L 11.000 8.829 L 10.889 8.788 L 7.615 12.530 C 8.330 13.804 8.024 15.408 6.889 16.328 C 5.755 17.249 4.122 17.218 3.023 16.256 C 1.924 15.293 1.678 13.679 2.440 12.433 C 3.203 11.186 4.753 10.671 6.110 11.212 L 9.383 7.470 C 8.861 6.541 8.871 5.404 9.409 4.484 C 9.948 3.564 10.934 2.999 12.000 3.000"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _binaryTree2!!
    }

private var _binaryTree2: ImageVector? = null
