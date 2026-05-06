package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.MedicalCross: ImageVector
    get() {
        if (_medicalCross != null) return _medicalCross!!
        _medicalCross = tablerFilledIcon(
            name = "MedicalCross",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11 2l-.15 .005C9.806 2.083 9 2.953 9 4v2.803L6.572 5.402C5.615 4.85 4.392 5.177 3.84 6.134l-1 1.732-.073 .138c-.45 .942-.099 2.072 .805 2.594L5.999 12 3.572 13.402c-.957 .552-1.284 1.775-.732 2.732l1 1.732 .083 .132c.591 .861 1.745 1.122 2.649 .6L9 17.196v2.804c0 1.105 .895 2 2 2h2l.15-.005C14.194 21.917 15 21.047 15 20v-2.804l2.428 1.403c.957 .552 2.18 .225 2.732-.732l1-1.732 .073-.138c.45-.942 .099-2.072-.805-2.594L18 12l2.428-1.402c.957-.552 1.284-1.775 .732-2.732l-1-1.732-.083-.132C19.486 5.141 18.332 4.88 17.428 5.402L15 6.802v-2.802C15 2.895 14.105 2 13 2h-2Z"),
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
        return _medicalCross!!
    }

private var _medicalCross: ImageVector? = null
