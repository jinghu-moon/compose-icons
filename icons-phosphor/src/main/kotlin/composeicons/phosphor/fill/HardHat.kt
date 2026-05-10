package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HardHat: ImageVector
    get() {
        if (_hardHat != null) return _hardHat!!
        _hardHat = phosphorFillIcon(
            name = "HardHat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M152 152h-48v-112c0-8.837 7.163-16 16-16h16c8.837 0 16 7.163 16 16ZM224 168h-192c-8.837 0-16 7.163-16 16v8c0 8.837 7.163 16 16 16h192c8.837 0 16-7.163 16-16v-8c0-8.837-7.163-16-16-16ZM224 148v-12C223.901 100.867 204.703 68.568 173.89 51.69c-1.24-.665-2.739-.629-3.946 .094-1.207 .724-1.945 2.028-1.944 3.436v96.78h52c2.209 0 4-1.791 4-4ZM36 152h52v-96.78c.002-1.407-.737-2.712-1.944-3.436-1.207-.724-2.706-.759-3.946-.094C51.297 68.568 32.099 100.867 32 136v12c0 2.209 1.791 4 4 4Z"),
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
        return _hardHat!!
    }

private var _hardHat: ImageVector? = null
