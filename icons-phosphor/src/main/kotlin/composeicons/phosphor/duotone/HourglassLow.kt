package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.HourglassLow: ImageVector
    get() {
        if (_hourglassLow != null) return _hourglassLow!!
        _hourglassLow = phosphorDuotoneIcon(
            name = "HourglassLow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 184v32c0 4.418-3.582 8-8 8h-112c-4.418 0-8-3.582-8-8v-32Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M200 75.64v-35.64c0-8.837-7.163-16-16-16h-112C63.163 24 56 31.163 56 40v36c.011 5.034 2.38 9.771 6.4 12.8L114.67 128 62.4 167.2C58.38 170.229 56.011 174.966 56 180v36c0 8.837 7.163 16 16 16h112c8.837 0 16-7.163 16-16v-35.64c-.013-5.01-2.361-9.728-6.35-12.76L141.27 128 193.65 88.41c3.991-3.035 6.338-7.757 6.35-12.77ZM178.23 176h-100.9L128 138ZM72 216v-24h112v24ZM184 75.64 128 118 72 76v-36h112Z"),
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
        return _hourglassLow!!
    }

private var _hourglassLow: ImageVector? = null
