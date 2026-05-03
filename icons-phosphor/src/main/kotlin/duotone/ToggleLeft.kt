package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ToggleLeft: ImageVector
    get() {
        if (_toggleLeft != null) return _toggleLeft!!
        _toggleLeft = phosphorDuotoneIcon(
            name = "ToggleLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 112.000 128.000 C 112.000 145.673 97.673 160.000 80.000 160.000 C 62.327 160.000 48.000 145.673 48.000 128.000 C 48.000 110.327 62.327 96.000 80.000 96.000 C 97.673 96.000 112.000 110.327 112.000 128.000 Z"),
            pathFillType = PathFillType.NonZero,
            fill = SolidColor(Color(0xFF000000)),
            fillAlpha = 1.0f,
            stroke = null,
            strokeAlpha = 1.0f,
            strokeLineWidth = 0.0f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
        )
    }
    addPath(
        pathData = parseSvgPathData("M 176.000 56.000 L 80.000 56.000 C 40.235 56.000 8.000 88.235 8.000 128.000 C 8.000 167.764 40.235 200.000 80.000 200.000 L 176.000 200.000 C 215.764 200.000 248.000 167.764 248.000 128.000 C 248.000 88.235 215.764 56.000 176.000 56.000 ZM 176.000 184.000 L 80.000 184.000 C 49.072 184.000 24.000 158.928 24.000 128.000 C 24.000 97.072 49.072 72.000 80.000 72.000 L 176.000 72.000 C 206.928 72.000 232.000 97.072 232.000 128.000 C 232.000 158.928 206.928 184.000 176.000 184.000 ZM 80.000 88.000 C 57.909 88.000 40.000 105.909 40.000 128.000 C 40.000 150.091 57.909 168.000 80.000 168.000 C 102.091 168.000 120.000 150.091 120.000 128.000 C 120.000 105.909 102.091 88.000 80.000 88.000 ZM 80.000 152.000 C 66.745 152.000 56.000 141.255 56.000 128.000 C 56.000 114.745 66.745 104.000 80.000 104.000 C 93.255 104.000 104.000 114.745 104.000 128.000 C 104.000 141.255 93.255 152.000 80.000 152.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _toggleLeft!!
    }

private var _toggleLeft: ImageVector? = null
