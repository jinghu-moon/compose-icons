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
                pathData = parseSvgPathData("M12 3c1.066-0 2.052 .565 2.59 1.485 .538 .92 .548 2.056 .026 2.985l3.274 3.742c1.357-.541 2.907-.026 3.67 1.221 .763 1.246 .517 2.861-.582 3.823-1.099 .963-2.732 .993-3.867 .073-1.135-.92-1.441-2.525-.726-3.798L13.11 8.787 13 8.829v6.342c1.378 .487 2.205 1.896 1.958 3.337-.247 1.441-1.496 2.494-2.958 2.494-1.462 0-2.711-1.053-2.958-2.494C8.795 17.067 9.622 15.658 11 15.171v-6.342l-.111-.041L7.615 12.53c.715 1.274 .409 2.878-.726 3.798-1.135 .92-2.767 .89-3.867-.073C1.924 15.293 1.678 13.679 2.44 12.433c.763-1.246 2.312-1.762 3.67-1.221L9.383 7.47C8.861 6.541 8.871 5.404 9.409 4.484 9.948 3.564 10.934 2.999 12 3"),
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
