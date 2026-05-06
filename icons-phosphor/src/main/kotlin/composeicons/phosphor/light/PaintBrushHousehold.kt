package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PaintBrushHousehold: ImageVector
    get() {
        if (_paintBrushHousehold != null) return _paintBrushHousehold!!
        _paintBrushHousehold = phosphorLightIcon(
            name = "PaintBrushHousehold",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M229.23 26.77c-11.728-11.691-30.702-11.691-42.43 0l-.32 .34L131.67 91.16 119.56 79.06c-8.591-8.59-22.519-8.59-31.11 0L11.76 155.75c-1.127 1.125-1.76 2.653-1.76 4.245 0 1.592 .633 3.12 1.76 4.245l80 80c1.125 1.127 2.653 1.76 4.245 1.76 1.592 0 3.12-.633 4.245-1.76l76.69-76.69c8.59-8.591 8.59-22.519 0-31.11L164.84 124.33l64-54.81 .34-.32c11.704-11.714 11.727-30.689 .05-42.43ZM96 231.51 76.49 212l23.76-23.76c2.344-2.344 2.344-6.146 0-8.49-2.344-2.344-6.146-2.344-8.49 0L68 203.51 52.49 188 76.25 164.24c2.344-2.344 2.344-6.146 0-8.49-2.344-2.344-6.146-2.344-8.49 0L44 179.51 24.49 160 72 112.48 143.52 184ZM220.89 60.56l-68.78 58.87c-1.274 1.087-2.035 2.657-2.1 4.33-.061 1.67 .576 3.29 1.76 4.47l16.68 16.69c1.878 1.876 2.933 4.421 2.933 7.075 0 2.654-1.055 5.199-2.933 7.075L152 175.51 80.49 104 96.93 87.55c1.876-1.878 4.421-2.933 7.075-2.933 2.654 0 5.199 1.055 7.075 2.933l16.69 16.68c1.182 1.182 2.804 1.817 4.474 1.753 1.671-.065 3.238-.823 4.326-2.093L195.44 35.11c7.07-6.773 18.257-6.653 25.18 .27 6.923 6.923 7.043 18.11 .27 25.18Z"),
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
        return _paintBrushHousehold!!
    }

private var _paintBrushHousehold: ImageVector? = null
