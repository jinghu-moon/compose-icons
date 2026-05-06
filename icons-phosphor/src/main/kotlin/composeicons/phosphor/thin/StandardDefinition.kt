package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.StandardDefinition: ImageVector
    get() {
        if (_standardDefinition != null) return _standardDefinition!!
        _standardDefinition = phosphorThinIcon(
            name = "StandardDefinition",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M144 76c-2.209 0-4 1.791-4 4v96c0 2.209 1.791 4 4 4h24c28.719 0 52-23.281 52-52C220 99.281 196.719 76 168 76ZM212 128c-.028 24.289-19.711 43.972-44 44h-20v-88h20c24.289 .028 43.972 19.711 44 44ZM28 48c0-2.209 1.791-4 4-4h192c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-192c-2.209 0-4-1.791-4-4ZM228 208c0 2.209-1.791 4-4 4h-192c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h192c2.209 0 4 1.791 4 4ZM108 152C108 139.42 96.21 135.08 78.22 129.89 63 125.51 45.78 120.54 45.78 104 45.78 88 60.49 76 80 76c14.21 0 26.3 6.46 31.55 16.85 .724 1.282 .685 2.858-.102 4.103-.786 1.245-2.193 1.957-3.661 1.854-1.469-.103-2.762-1.004-3.367-2.347C100.53 88.78 91.17 84 80 84 65 84 53.78 92.6 53.78 104c0 9.81 10.07 13.43 26.66 18.21C97.03 126.99 116 132.46 116 152c0 15.44-16.15 28-36 28C60.15 180 44 167.44 44 152c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4 0 11 12.56 20 28 20 15.44 0 28-9 28-20Z"),
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
        return _standardDefinition!!
    }

private var _standardDefinition: ImageVector? = null
