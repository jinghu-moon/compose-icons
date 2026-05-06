package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowUDownLeft: ImageVector
    get() {
        if (_arrowUDownLeft != null) return _arrowUDownLeft!!
        _arrowUDownLeft = phosphorDuotoneIcon(
            name = "ArrowUDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M80 120v96L32 168Z"),
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
                pathData = parseSvgPathData("M168 48h-88c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h88c26.51 0 48 21.49 48 48 0 26.51-21.49 48-48 48h-80v-40c.003-3.238-1.947-6.158-4.938-7.397-2.991-1.239-6.434-.554-8.722 1.737l-48 48c-1.502 1.501-2.346 3.537-2.346 5.66 0 2.123 .844 4.159 2.346 5.66l48 48c2.288 2.291 5.731 2.976 8.722 1.737C86.053 222.158 88.003 219.238 88 216v-40h80c35.346 0 64-28.654 64-64C232 76.654 203.346 48 168 48ZM72 196.69 43.31 168 72 139.31Z"),
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
        return _arrowUDownLeft!!
    }

private var _arrowUDownLeft: ImageVector? = null
