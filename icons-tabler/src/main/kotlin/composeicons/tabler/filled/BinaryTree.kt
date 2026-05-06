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
                pathData = parseSvgPathData("M14 1c1.152-0 2.202 .659 2.703 1.697 .5 1.038 .363 2.27-.355 3.171l2 3.203Q18.665 9 19 9c1.399-0 2.613 .967 2.925 2.331 .312 1.364-.361 2.763-1.621 3.371-1.26 .608-2.774 .264-3.647-.83-.873-1.093-.875-2.645-.004-3.74l-2-3.203c-.429 .096-.875 .096-1.304 0l-2.001 3.203c.408 .513 .652 1.162 .652 1.868 0 .706-.244 1.356-.653 1.868l2.002 3.203Q13.664 17 14 17c1.399-0 2.613 .967 2.925 2.331 .312 1.364-.361 2.763-1.621 3.371-1.26 .608-2.774 .264-3.647-.83-.873-1.093-.875-2.645-.004-3.74L9.65 14.929c-.429 .095-.873 .095-1.302 0L6.346 18.132c.91 1.143 .864 2.776-.109 3.866-.973 1.09-2.589 1.321-3.828 .547C1.17 21.77 .669 20.216 1.223 18.864c.554-1.352 2.001-2.109 3.427-1.792L6.652 13.868c-.793-.995-.872-2.381-.198-3.459C7.128 9.33 8.409 8.794 9.65 9.07L11.652 5.868c-.717-.901-.855-2.134-.355-3.171C11.798 1.659 12.848 1 14 1"),
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
