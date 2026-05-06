package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CableCar: ImageVector
    get() {
        if (_cableCar != null) return _cableCar!!
        _cableCar = phosphorThinIcon(
            name = "CableCar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M243.94 31.3c-.185-1.045-.778-1.974-1.649-2.582-.87-.608-1.946-.845-2.991-.658L15.3 68.06c-2.046 .358-3.477 2.223-3.294 4.291 .182 2.069 1.918 3.654 3.994 3.649 .235-0 .469-.02 .7-.06L124 56.78v43.22h-60c-15.464 0-28 12.536-28 28v64c0 15.464 12.536 28 28 28h128c15.464 0 28-12.536 28-28v-64c0-15.464-12.536-28-28-28h-60v-44.65L240.7 35.94c1.045-.185 1.974-.778 2.582-1.649 .608-.87 .845-1.946 .658-2.991ZM100 164v-56h56v56ZM64 108h28v56h-48v-36c0-11.046 8.954-20 20-20ZM192 212h-128C52.954 212 44 203.046 44 192v-20h168v20c0 11.046-8.954 20-20 20ZM212 128v36h-48v-56h28c11.046 0 20 8.954 20 20Z"),
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
        return _cableCar!!
    }

private var _cableCar: ImageVector? = null
