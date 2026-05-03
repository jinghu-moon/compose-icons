package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BinaryTree: ImageVector
    get() {
        if (_binaryTree != null) return _binaryTree!!
        _binaryTree = tablerFilledIcon(
            name = "BinaryTree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.000 1.000 C 15.152 1.000 16.202 1.659 16.703 2.697 C 17.203 3.734 17.065 4.967 16.348 5.868 L 18.348 9.071 Q 18.665 9.000 19.000 9.000 C 20.399 9.000 21.613 9.967 21.925 11.331 C 22.237 12.696 21.564 14.094 20.304 14.702 C 19.043 15.310 17.530 14.966 16.657 13.872 C 15.783 12.779 15.782 11.227 16.653 10.132 L 14.653 6.929 C 14.224 7.025 13.778 7.025 13.349 6.929 L 11.348 10.132 C 11.756 10.645 12.000 11.294 12.000 12.000 C 12.000 12.706 11.756 13.356 11.347 13.868 L 13.349 17.071 Q 13.664 17.000 14.000 17.000 C 15.399 17.000 16.613 17.967 16.925 19.331 C 17.237 20.696 16.564 22.094 15.304 22.702 C 14.043 23.310 12.530 22.966 11.657 21.872 C 10.783 20.779 10.782 19.227 11.653 18.132 L 9.650 14.929 C 9.221 15.024 8.777 15.024 8.348 14.929 L 6.346 18.132 C 7.256 19.275 7.210 20.908 6.237 21.998 C 5.265 23.088 3.648 23.319 2.409 22.544 C 1.170 21.770 0.669 20.216 1.223 18.864 C 1.776 17.511 3.224 16.755 4.650 17.072 L 6.652 13.868 C 5.859 12.873 5.780 11.487 6.454 10.409 C 7.128 9.330 8.409 8.794 9.650 9.070 L 11.652 5.868 C 10.935 4.967 10.797 3.734 11.297 2.697 C 11.798 1.659 12.848 1.000 14.000 1.000"),
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
        return _binaryTree!!
    }

private var _binaryTree: ImageVector? = null
