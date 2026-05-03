package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Group: ImageVector
    get() {
        if (_group != null) return _group!!
        _group = radixIcon(
            name = "Group",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 1.450 10.950 C 1.726 10.950 1.950 11.174 1.950 11.450 L 1.950 12.950 L 3.450 12.950 C 3.726 12.950 3.950 13.174 3.950 13.450 C 3.950 13.726 3.726 13.950 3.450 13.950 L 1.450 13.950 C 1.174 13.950 0.950 13.726 0.950 13.450 L 0.950 11.450 C 0.950 11.174 1.174 10.950 1.450 10.950 ZM 8.950 12.950 C 9.226 12.950 9.450 13.174 9.450 13.450 C 9.450 13.726 9.226 13.950 8.950 13.950 L 5.950 13.950 C 5.674 13.950 5.450 13.726 5.450 13.450 C 5.450 13.174 5.674 12.950 5.950 12.950 L 8.950 12.950 ZM 13.450 10.950 C 13.726 10.950 13.950 11.174 13.950 11.450 L 13.950 13.450 C 13.950 13.726 13.726 13.950 13.450 13.950 L 11.450 13.950 C 11.174 13.950 10.950 13.726 10.950 13.450 C 10.950 13.174 11.174 12.950 11.450 12.950 L 12.949 12.950 L 12.950 11.450 C 12.950 11.174 13.174 10.950 13.450 10.950 ZM 1.450 5.450 C 1.726 5.450 1.950 5.674 1.950 5.950 L 1.950 8.950 C 1.950 9.226 1.726 9.450 1.450 9.450 C 1.174 9.450 0.950 9.226 0.950 8.950 L 0.950 5.950 C 0.950 5.674 1.174 5.450 1.450 5.450 ZM 13.450 5.450 C 13.726 5.450 13.950 5.674 13.950 5.950 L 13.950 8.950 C 13.950 9.226 13.726 9.450 13.450 9.450 C 13.174 9.450 12.950 9.226 12.950 8.950 L 12.950 5.950 C 12.950 5.674 13.174 5.450 13.450 5.450 ZM 3.450 0.950 C 3.726 0.950 3.950 1.174 3.950 1.450 C 3.950 1.726 3.726 1.950 3.450 1.950 L 1.950 1.950 L 1.950 3.450 C 1.950 3.726 1.726 3.950 1.450 3.950 C 1.174 3.950 0.950 3.726 0.950 3.450 L 0.950 1.450 C 0.950 1.317 1.003 1.190 1.096 1.096 C 1.190 1.003 1.317 0.950 1.450 0.950 L 3.450 0.950 ZM 13.449 0.950 C 13.725 0.950 13.950 1.174 13.950 1.450 L 13.950 3.450 C 13.950 3.726 13.726 3.950 13.450 3.950 C 13.174 3.950 12.950 3.726 12.950 3.450 L 12.950 1.950 L 11.450 1.950 C 11.174 1.950 10.950 1.726 10.950 1.450 C 10.950 1.174 11.174 0.950 11.450 0.950 L 13.449 0.950 ZM 8.950 0.950 C 9.226 0.950 9.450 1.174 9.450 1.450 C 9.450 1.726 9.226 1.950 8.950 1.950 L 5.950 1.950 C 5.674 1.950 5.450 1.726 5.450 1.450 C 5.450 1.174 5.674 0.950 5.950 0.950 L 8.950 0.950 Z"),
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
        return _group!!
    }

private var _group: ImageVector? = null
