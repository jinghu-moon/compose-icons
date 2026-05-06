package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ColumnSpacing: ImageVector
    get() {
        if (_columnSpacing != null) return _columnSpacing!!
        _columnSpacing = radixIcon(
            name = "ColumnSpacing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.5 1c.276 0 .5 .224 .5 .5v12c0 .276-.224 .5-.5 .5-.276 0-.5-.224-.5-.5v-12C7 1.224 7.224 1 7.5 1ZM11.682 5.182c.154-.154 .392-.173 .566-.058l.07 .058 2 2 .058 .07c.115 .175 .096 .413-.058 .566l-2 2c-.176 .176-.461 .176-.637 0-.176-.176-.176-.461 0-.637L12.913 7.95h-3.413C9.252 7.95 9.05 7.748 9.05 7.5c0-.248 .202-.45 .45-.45h3.413L11.682 5.818l-.058-.07c-.115-.175-.096-.413 .058-.566ZM2.752 5.124c.175-.115 .413-.096 .566 .058 .154 .154 .173 .392 .058 .566l-.058 .07L2.087 7.05h3.413l.091 .01c.205 .042 .359 .223 .359 .44-0 .217-.154 .398-.359 .44l-.091 .01h-3.413L3.318 9.182l.058 .07c.115 .175 .096 .413-.058 .566-.154 .154-.392 .173-.566 .058L2.682 9.818 .682 7.818C.506 7.643 .506 7.357 .682 7.182l2-2 .07-.058Z"),
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
        return _columnSpacing!!
    }

private var _columnSpacing: ImageVector? = null
