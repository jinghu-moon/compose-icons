package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ModulzLogo: ImageVector
    get() {
        if (_modulzLogo != null) return _modulzLogo!!
        _modulzLogo = radixIcon(
            name = "ModulzLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3.889 11.833 1 14v-4.333l2.889 2.166ZM14 14 11.111 11.833 14 9.667v4.333ZM3.889 11.111 1 8.944 3.889 6.777v4.334ZM14 8.944l-2.889 2.167v-4.334L14 8.944ZM3.889 6.056 1 8.223v-4.334L3.889 6.056ZM7.259 8.223 4.37 6.056 7.259 3.889v4.334ZM10.63 6.056 7.741 8.223v-4.334l2.889 2.167ZM14 8.223 11.111 6.056 14 3.889v4.334ZM3.889 5.333 1 3.167 3.889 1v4.333ZM7.259 3.167 4.37 5.333v-4.333L7.259 3.167ZM10.63 5.333 7.741 3.167 10.63 1v4.333ZM14 3.167 11.111 5.333v-4.333L14 3.167Z"),
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
        return _modulzLogo!!
    }

private var _modulzLogo: ImageVector? = null
